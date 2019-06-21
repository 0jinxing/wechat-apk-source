package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.e.j;
import com.tencent.liteav.basic.e.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class q extends g
{
  public int r;
  public int s;
  public int t;
  public int u;
  public int v;
  public int w;
  private ByteBuffer x;
  private ByteBuffer y;

  public q(String paramString)
  {
    this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", paramString);
    AppMethodBeat.i(66994);
    a(j.a, false, true);
    AppMethodBeat.o(66994);
  }

  public q(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
    AppMethodBeat.i(66995);
    this.t = -1;
    this.w = -1;
    a(j.a, false, true);
    AppMethodBeat.o(66995);
  }

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66997);
    paramInt1 = a(paramInt1, paramInt2, paramInt3, this.m, this.n);
    AppMethodBeat.o(66997);
    return paramInt1;
  }

  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(66998);
    this.t = paramInt2;
    this.w = paramInt3;
    paramInt1 = super.a(paramInt1, paramInt4, paramInt5);
    AppMethodBeat.o(66998);
    return paramInt1;
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66999);
    super.a(paramInt1, paramInt2);
    AppMethodBeat.o(66999);
  }

  public void a(j paramj, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(67001);
    paramj = k.a(paramj, paramBoolean1, paramBoolean2);
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    FloatBuffer localFloatBuffer = localByteBuffer.asFloatBuffer();
    localFloatBuffer.put(paramj);
    localFloatBuffer.flip();
    this.x = localByteBuffer;
    localByteBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    localFloatBuffer = localByteBuffer.asFloatBuffer();
    localFloatBuffer.put(paramj);
    localFloatBuffer.flip();
    this.y = localByteBuffer;
    AppMethodBeat.o(67001);
  }

  public boolean b()
  {
    AppMethodBeat.i(66996);
    boolean bool = super.b();
    GLES20.glUseProgram(p());
    this.r = GLES20.glGetAttribLocation(p(), "inputTextureCoordinate2");
    this.u = GLES20.glGetAttribLocation(p(), "inputTextureCoordinate3");
    this.s = GLES20.glGetUniformLocation(p(), "inputImageTexture2");
    this.v = GLES20.glGetUniformLocation(p(), "inputImageTexture3");
    GLES20.glEnableVertexAttribArray(this.r);
    GLES20.glEnableVertexAttribArray(this.u);
    AppMethodBeat.o(66996);
    return bool;
  }

  public void i()
  {
    AppMethodBeat.i(67000);
    GLES20.glEnableVertexAttribArray(this.r);
    GLES20.glActiveTexture(33987);
    GLES20.glBindTexture(3553, this.t);
    GLES20.glUniform1i(this.s, 3);
    this.x.position(0);
    GLES20.glVertexAttribPointer(this.r, 2, 5126, false, 0, this.x);
    GLES20.glEnableVertexAttribArray(this.u);
    GLES20.glActiveTexture(33988);
    GLES20.glBindTexture(3553, this.w);
    GLES20.glUniform1i(this.v, 4);
    this.y.position(0);
    GLES20.glVertexAttribPointer(this.u, 2, 5126, false, 0, this.y);
    AppMethodBeat.o(67000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.q
 * JD-Core Version:    0.6.2
 */