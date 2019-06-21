package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.e.i;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class k extends g
{
  private static String z = "YUV420pToRGBFilter";
  private ByteBuffer r;
  private byte[] s;
  private int t;
  private int[] u;
  private int[] v;
  private int w;
  private int x;
  private int[] y;

  public k(int paramInt)
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    AppMethodBeat.i(66986);
    this.r = null;
    this.s = null;
    this.t = 1;
    this.u = null;
    this.v = null;
    this.w = 0;
    this.x = 0;
    this.y = null;
    this.t = paramInt;
    TXCLog.i(z, "yuv Type ".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(66986);
  }

  private int r()
  {
    AppMethodBeat.i(66991);
    GLES20.glBindTexture(3553, this.y[0]);
    if (this.s != null)
    {
      NativeLoad.getInstance();
      NativeLoad.nativeglTexImage2D(3553, 0, 6408, this.e, this.f, 0, 6408, 5121, this.s, 0);
    }
    int i = this.y[0];
    AppMethodBeat.o(66991);
    return i;
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66988);
    if ((this.f == paramInt2) && (this.e == paramInt1))
    {
      AppMethodBeat.o(66988);
      return;
    }
    if (1 == this.t)
    {
      this.u = new int[1];
      this.u[0] = i.a(paramInt1, paramInt2 * 3 / 2, 6409, 6409, this.u);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.u[0]);
      GLES20.glBindTexture(3553, 0);
      GLES20.glUniform1i(this.c, 0);
    }
    while (true)
    {
      super.a(paramInt1, paramInt2);
      AppMethodBeat.o(66988);
      break;
      if (3 == this.t)
      {
        GLES20.glActiveTexture(33984);
        GLES20.glActiveTexture(33985);
        this.w = GLES20.glGetUniformLocation(p(), "yTexture");
        this.x = GLES20.glGetUniformLocation(p(), "uvTexture");
        if (this.u == null)
        {
          this.u = new int[1];
          this.u[0] = i.a(paramInt1, paramInt2, 6409, 6409, this.u);
        }
        if (this.v == null)
        {
          this.v = new int[1];
          this.v[0] = i.a(paramInt1 / 2, paramInt2 / 2, 6410, 6410, this.v);
        }
        GLES20.glUniform1i(this.w, 0);
        GLES20.glUniform1i(this.x, 1);
      }
      else if ((2 == this.t) && (this.y == null))
      {
        this.y = new int[1];
        this.y[0] = i.a(paramInt1, paramInt2, 6408, 6408, this.y);
      }
    }
  }

  public void a(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    AppMethodBeat.i(66992);
    super.a(-1, paramFloatBuffer1, paramFloatBuffer2);
    AppMethodBeat.o(66992);
  }

  public void a(byte[] paramArrayOfByte)
  {
    this.s = paramArrayOfByte;
  }

  public boolean a()
  {
    int i = 7;
    AppMethodBeat.i(66987);
    if (this.t == 1)
    {
      NativeLoad.getInstance();
      this.a = NativeLoad.nativeLoadGLProgram(i);
      if ((this.a == 0) || (!b()))
        break label126;
    }
    label98: label126: for (this.g = true; ; this.g = false)
    {
      c();
      boolean bool = this.g;
      AppMethodBeat.o(66987);
      while (true)
      {
        return bool;
        if (this.t == 3)
        {
          i = 9;
          break;
        }
        if (this.t != 2)
          break label98;
        bool = super.a();
        AppMethodBeat.o(66987);
      }
      TXCLog.e(z, "don't support yuv format " + this.t);
      break;
    }
  }

  public void e()
  {
    AppMethodBeat.i(66993);
    super.e();
    if ((this.u != null) && (this.u[0] > 0))
    {
      GLES20.glDeleteTextures(1, this.u, 0);
      this.u = null;
    }
    if ((this.v != null) && (this.v[0] > 0))
    {
      GLES20.glDeleteTextures(1, this.v, 0);
      this.v = null;
    }
    if ((this.y != null) && (this.y[0] > 0))
    {
      GLES20.glDeleteTextures(1, this.y, 0);
      this.y = null;
    }
    AppMethodBeat.o(66993);
  }

  public void i()
  {
    AppMethodBeat.i(66989);
    super.i();
    if (1 == this.t)
    {
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.u[0]);
      GLES20.glUniform1i(this.c, 0);
      NativeLoad.getInstance();
      NativeLoad.nativeglTexImage2D(3553, 0, 6409, this.e, this.f * 3 / 2, 0, 6409, 5121, this.s, 0);
      AppMethodBeat.o(66989);
    }
    while (true)
    {
      return;
      if (3 == this.t)
      {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.u[0]);
        GLES20.glUniform1i(this.w, 0);
        NativeLoad.getInstance();
        NativeLoad.nativeglTexImage2D(3553, 0, 6409, this.e, this.f, 0, 6409, 5121, this.s, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.v[0]);
        GLES20.glUniform1i(this.x, 1);
        NativeLoad.getInstance();
        int i = this.e / 2;
        int j = this.f / 2;
        byte[] arrayOfByte = this.s;
        int k = this.e;
        NativeLoad.nativeglTexImage2D(3553, 0, 6410, i, j, 0, 6410, 5121, arrayOfByte, this.f * k);
        AppMethodBeat.o(66989);
      }
      else
      {
        if (2 == this.t)
          r();
        AppMethodBeat.o(66989);
      }
    }
  }

  public int q()
  {
    AppMethodBeat.i(66990);
    int i;
    if (2 == this.t)
    {
      i = r();
      GLES20.glBindTexture(3553, 0);
      AppMethodBeat.o(66990);
    }
    while (true)
    {
      return i;
      i = super.b(-1);
      AppMethodBeat.o(66990);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.k
 * JD-Core Version:    0.6.2
 */