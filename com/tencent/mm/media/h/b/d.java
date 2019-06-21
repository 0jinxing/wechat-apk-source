package com.tencent.mm.media.h.b;

import a.l;
import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.i.b;
import com.tencent.mm.media.i.b.a;
import java.nio.Buffer;
import java.nio.FloatBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/proc/GLTextureRenderProcTexture;", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "textureWidth", "", "textureHeight", "drawWidth", "drawHeight", "renderOutputType", "scaleType", "(IIIIII)V", "attributePosition", "attributeTextureCoord", "inputTexture", "programId", "uniformMatrix", "uniformTexture", "renderImpl", "", "setInputTexture", "texture", "plugin-mediaeditor_release"})
public final class d extends a
{
  private int eYQ;
  private int eZH;
  private int eZI;
  private int eZJ;
  private int eZK;
  private int eZL;

  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    AppMethodBeat.i(13106);
    this.eYQ = -1;
    b.a locala = b.fad;
    this.eZH = b.a.U("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
    this.eZI = GLES20.glGetAttribLocation(this.eZH, "a_position");
    this.eZJ = GLES20.glGetAttribLocation(this.eZH, "a_texCoord");
    this.eZK = GLES20.glGetUniformLocation(this.eZH, "texture");
    this.eZL = GLES20.glGetUniformLocation(this.eZH, "uMatrix");
    AppMethodBeat.o(13106);
  }

  protected final void Vf()
  {
    AppMethodBeat.i(13105);
    if (this.eYQ != -1)
    {
      GLES20.glUseProgram(this.eZH);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.eYQ);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 10497.0F);
      GLES20.glTexParameterf(3553, 10243, 10497.0F);
      GLES20.glUniform1i(this.eZK, 0);
      GLES20.glUniformMatrix4fv(this.eZL, 1, false, this.eZm, 0);
      this.eZi.position(0);
      GLES20.glVertexAttribPointer(this.eZI, 2, 5126, false, 0, (Buffer)this.eZi);
      GLES20.glEnableVertexAttribArray(this.eZI);
      this.eZh.position(0);
      GLES20.glVertexAttribPointer(this.eZJ, 2, 5126, false, 0, (Buffer)this.eZh);
      GLES20.glEnableVertexAttribArray(this.eZJ);
      GLES20.glDrawArrays(5, 0, 4);
      GLES20.glDisableVertexAttribArray(this.eZI);
      GLES20.glDisableVertexAttribArray(this.eZJ);
      GLES20.glBindTexture(3553, 0);
      GLES20.glBindTexture(36197, 0);
      GLES20.glFinish();
    }
    AppMethodBeat.o(13105);
  }

  public final void kb(int paramInt)
  {
    this.eYQ = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.b.d
 * JD-Core Version:    0.6.2
 */