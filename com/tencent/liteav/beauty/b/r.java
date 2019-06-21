package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.e.j;
import com.tencent.liteav.basic.e.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class r extends g
{
  private ByteBuffer r;
  public int u;
  public int v;
  public int w;

  public r(String paramString)
  {
    this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", paramString);
  }

  public r(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
    AppMethodBeat.i(66979);
    this.u = -1;
    this.w = -1;
    a(j.a, false, true);
    AppMethodBeat.o(66979);
  }

  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(66985);
    this.w = paramInt2;
    paramInt1 = a(paramInt1, paramInt3, paramInt4);
    AppMethodBeat.o(66985);
    return paramInt1;
  }

  public void a(j paramj, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(66983);
    float[] arrayOfFloat = k.a(paramj, paramBoolean1, paramBoolean2);
    paramj = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    FloatBuffer localFloatBuffer = paramj.asFloatBuffer();
    localFloatBuffer.put(arrayOfFloat);
    localFloatBuffer.flip();
    this.r = paramj;
    AppMethodBeat.o(66983);
  }

  public int b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66984);
    this.w = paramInt2;
    paramInt1 = a(paramInt1, this.m, this.n);
    AppMethodBeat.o(66984);
    return paramInt1;
  }

  public boolean b()
  {
    AppMethodBeat.i(66980);
    boolean bool = super.b();
    if (bool)
    {
      this.u = GLES20.glGetAttribLocation(p(), "inputTextureCoordinate2");
      this.v = GLES20.glGetUniformLocation(p(), "inputImageTexture2");
      GLES20.glEnableVertexAttribArray(this.u);
    }
    AppMethodBeat.o(66980);
    return bool;
  }

  public void e()
  {
    AppMethodBeat.i(66981);
    super.e();
    AppMethodBeat.o(66981);
  }

  public void i()
  {
    AppMethodBeat.i(66982);
    GLES20.glActiveTexture(33987);
    GLES20.glBindTexture(3553, this.w);
    GLES20.glUniform1i(this.v, 3);
    if (this.u != -1)
    {
      GLES20.glEnableVertexAttribArray(this.u);
      this.r.position(0);
      GLES20.glVertexAttribPointer(this.u, 2, 5126, false, 0, this.r);
    }
    AppMethodBeat.o(66982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.r
 * JD-Core Version:    0.6.2
 */