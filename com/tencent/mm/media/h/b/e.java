package com.tencent.mm.media.h.b;

import a.f.b.j;
import a.l;
import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.i.b;
import com.tencent.mm.media.i.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/proc/GLTextureRenderProcYuvToRgb;", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "textureWidth", "", "textureHeight", "drawWidth", "drawHeight", "renderOutputType", "scaleType", "(IIIIII)V", "attributeYUVPosition", "attributeYUVTextureCoord", "frame", "", "uniformUVTexture", "uniformYTexture", "uniformYUVRotateMatrix", "uvBuffer", "Ljava/nio/ByteBuffer;", "uvTextureId", "yBuffer", "yTextureId", "yuvProgramId", "getFrame", "renderImpl", "", "setFrame", "Companion", "plugin-mediaeditor_release"})
public class e extends a
{
  private static final String TAG = "MicroMsg.GLTextureRenderProcYuvToRgb";
  public static final e.a eZX;
  private int eZM;
  private int eZN;
  private int eZO;
  private int eZP;
  private int eZQ;
  private int eZR;
  private int eZS;
  private int eZT;
  private ByteBuffer eZU;
  private ByteBuffer eZV;
  protected byte[] eZW;

  static
  {
    AppMethodBeat.i(13110);
    eZX = new e.a((byte)0);
    TAG = "MicroMsg.GLTextureRenderProcYuvToRgb";
    AppMethodBeat.o(13110);
  }

  public e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    AppMethodBeat.i(13109);
    this.eZW = new byte[0];
    b.a locala = b.fad;
    this.eZO = b.a.U("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D uv_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           u = texture2D(uv_texture, v_texCoord).a;\n           v = texture2D(uv_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
    if (this.eZO == 0)
      ab.e(TAG, "checkInit, load program failed!");
    this.eZQ = GLES20.glGetAttribLocation(this.eZO, "a_position");
    this.eZP = GLES20.glGetAttribLocation(this.eZO, "a_texCoord");
    this.eZR = GLES20.glGetUniformLocation(this.eZO, "y_texture");
    this.eZS = GLES20.glGetUniformLocation(this.eZO, "uv_texture");
    this.eZT = GLES20.glGetUniformLocation(this.eZO, "uMatrix");
    locala = b.fad;
    this.eZM = b.a.Vh();
    locala = b.fad;
    this.eZN = b.a.Vh();
    AppMethodBeat.o(13109);
  }

  public final void M(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13107);
    j.p(paramArrayOfByte, "frame");
    this.eZW = paramArrayOfByte;
    AppMethodBeat.o(13107);
  }

  protected void Vf()
  {
    AppMethodBeat.i(13108);
    if ((this.eZO != 0) && (this.eZM != -1) && (this.eZN != -1) && (this.eYY > 0) && (this.eYZ > 0))
    {
      if (this.eZW.length != 0)
        break label657;
      i = 1;
      if (i != 0)
        break label662;
    }
    label657: label662: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        if ((this.eZU != null) && (this.eZV != null))
        {
          localByteBuffer = this.eZU;
          if (localByteBuffer == null)
            j.dWJ();
          if (localByteBuffer.capacity() == this.eYW * this.eYX)
          {
            localByteBuffer = this.eZV;
            if (localByteBuffer == null)
              j.dWJ();
            if (localByteBuffer.capacity() == this.eYW * this.eYX / 2)
              break label209;
          }
        }
        this.eZU = ByteBuffer.allocateDirect(this.eYW * this.eYX);
        this.eZV = ByteBuffer.allocateDirect(this.eYW * this.eYX / 2);
        ByteBuffer localByteBuffer = this.eZU;
        if (localByteBuffer == null)
          j.dWJ();
        localByteBuffer.order(ByteOrder.nativeOrder());
        localByteBuffer = this.eZV;
        if (localByteBuffer == null)
          j.dWJ();
        localByteBuffer.order(ByteOrder.nativeOrder());
        label209: localByteBuffer = this.eZU;
        if (localByteBuffer == null)
          j.dWJ();
        localByteBuffer.put(this.eZW, 0, this.eYW * this.eYX);
        localByteBuffer = this.eZU;
        if (localByteBuffer == null)
          j.dWJ();
        localByteBuffer.position(0);
        localByteBuffer = this.eZV;
        if (localByteBuffer == null)
          j.dWJ();
        localByteBuffer.put(this.eZW, this.eYW * this.eYX, this.eYW * this.eYX / 2);
        localByteBuffer = this.eZV;
        if (localByteBuffer == null)
          j.dWJ();
        localByteBuffer.position(0);
        GLES20.glUseProgram(this.eZO);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.eZM);
        GLES20.glTexImage2D(3553, 0, 6409, this.eYW, this.eYX, 0, 6409, 5121, (Buffer)this.eZU);
        GLES20.glTexParameterf(3553, 10241, 9729.0F);
        GLES20.glTexParameterf(3553, 10240, 9729.0F);
        GLES20.glTexParameterf(3553, 10242, 10497.0F);
        GLES20.glTexParameterf(3553, 10243, 10497.0F);
        GLES20.glUniform1i(this.eZR, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.eZN);
        GLES20.glTexImage2D(3553, 0, 6410, this.eYW / 2, this.eYX / 2, 0, 6410, 5121, (Buffer)this.eZV);
        GLES20.glTexParameterf(3553, 10241, 9729.0F);
        GLES20.glTexParameterf(3553, 10240, 9729.0F);
        GLES20.glTexParameterf(3553, 10242, 10497.0F);
        GLES20.glTexParameterf(3553, 10243, 10497.0F);
        GLES20.glUniform1i(this.eZS, 1);
        GLES20.glUniformMatrix4fv(this.eZT, 1, false, this.eZm, 0);
        this.eZi.position(0);
        GLES20.glVertexAttribPointer(this.eZQ, 2, 5126, false, 0, (Buffer)this.eZi);
        GLES20.glEnableVertexAttribArray(this.eZQ);
        this.eZh.position(0);
        GLES20.glVertexAttribPointer(this.eZP, 2, 5126, false, 0, (Buffer)this.eZh);
        GLES20.glEnableVertexAttribArray(this.eZP);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.eZQ);
        GLES20.glDisableVertexAttribArray(this.eZP);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(0);
      }
      AppMethodBeat.o(13108);
      return;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.b.e
 * JD-Core Version:    0.6.2
 */