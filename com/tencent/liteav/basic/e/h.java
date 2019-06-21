package com.tencent.liteav.basic.e;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.FloatBuffer;

public class h extends g
{
  public boolean r;
  private float[] s;
  private int t;

  public h()
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    AppMethodBeat.i(66175);
    this.s = new float[16];
    this.r = false;
    this.o = true;
    AppMethodBeat.o(66175);
  }

  public void a(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    AppMethodBeat.i(66177);
    GLES20.glUseProgram(this.a);
    k();
    if ((!m()) || (this.s == null))
      AppMethodBeat.o(66177);
    while (true)
    {
      return;
      paramFloatBuffer1.position(0);
      GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 0, paramFloatBuffer1);
      GLES20.glEnableVertexAttribArray(this.b);
      paramFloatBuffer2.position(0);
      GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, paramFloatBuffer2);
      GLES20.glEnableVertexAttribArray(this.d);
      GLES20.glUniformMatrix4fv(this.t, 1, false, this.s, 0);
      if (paramInt != -1)
      {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, paramInt);
        GLES20.glUniform1i(this.c, 0);
      }
      GLES20.glDrawArrays(5, 0, 4);
      GLES20.glDisableVertexAttribArray(this.b);
      GLES20.glDisableVertexAttribArray(this.d);
      GLES20.glBindTexture(36197, 0);
      AppMethodBeat.o(66177);
    }
  }

  public void a(float[] paramArrayOfFloat)
  {
    this.s = paramArrayOfFloat;
  }

  public boolean b()
  {
    AppMethodBeat.i(66176);
    boolean bool = super.b();
    this.t = GLES20.glGetUniformLocation(this.a, "textureTransform");
    if ((bool) && (GLES20.glGetError() == 0))
    {
      bool = true;
      AppMethodBeat.o(66176);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(66176);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.h
 * JD-Core Version:    0.6.2
 */