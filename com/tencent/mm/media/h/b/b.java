package com.tencent.mm.media.h.b;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.i.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/proc/GLTextureRenderProcBlend;", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "textureWidth", "", "textureHeight", "drawWidth", "drawHeight", "renderOutputType", "scaleType", "blendTextureScaleType", "(IIIIIII)V", "TAG", "", "blendAttributePosition", "blendAttributeTextureCoord", "blendBitmapTexture", "blendProgramId", "blendTextureCoordBuff", "Ljava/nio/FloatBuffer;", "blendUniformEmojiTexture", "blendUniformExternalVideoTexture", "blendUniformHasEmojiTexture", "blendUniformMatrix", "blendUniformNormalVideoTexture", "blendUniformUseNormalVideoTexture", "currentBlendBitmap", "Landroid/graphics/Bitmap;", "inputTexture", "inputTextureHeight", "inputTextureWidth", "sizeBuffer", "kotlin.jvm.PlatformType", "renderImpl", "", "setBlendBitmap", "bitmap", "setInputTexture", "texture", "plugin-mediaeditor_release"})
public final class b extends a
{
  private final String TAG;
  private int eYQ;
  private int eZA;
  private int eZB;
  private int eZC;
  private int eZD;
  private final FloatBuffer eZE;
  private FloatBuffer eZF;
  private final int eZG;
  private int eZr;
  private int eZs;
  public Bitmap eZt;
  private int eZu;
  private int eZv;
  private int eZw;
  private int eZx;
  private int eZy;
  private int eZz;

  private b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    AppMethodBeat.i(13101);
    this.eZG = 1;
    this.TAG = "MircoMsg.GLTextureRenderProcBlend";
    this.eZE = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder()).asFloatBuffer();
    Object localObject = ByteBuffer.allocateDirect(com.tencent.mm.media.i.b.eZZ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    j.o(localObject, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
    this.eZF = ((FloatBuffer)localObject);
    this.eZr = paramInt1;
    this.eZs = paramInt2;
    localObject = com.tencent.mm.media.i.b.fad;
    this.eZu = b.a.Vh();
    localObject = com.tencent.mm.media.i.b.fad;
    this.eZv = b.a.U("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES videoExternalTexture;\n        uniform sampler2D videoNormalTexture;\n        uniform sampler2D emojiTexture;\n        uniform int hasEmojiTexture;\n        uniform int useNormalVideoTexture;\n\n        vec4 blendTexture(vec4 source, vec4 blend) {\n            if (blend.a <= 0.0) {\n                return source;\n            }\n            float sourceAlpha = 1.0 - blend.a;\n            float alpha = max(source.a, blend.a);\n            float r = max(0.0, min(sourceAlpha * source.r + blend.r, 1.0));\n            float g = max(0.0, min(sourceAlpha * source.g + blend.g, 1.0));\n            float b = max(0.0, min(sourceAlpha * source.b + blend.b, 1.0));\n            vec4 result = vec4(r, g, b, alpha);\n            if (alpha != 1.0) {\n                r = r + (1.0 - alpha) * 0.95;\n                g = g + (1.0 - alpha) * 0.95;\n                b = b + (1.0 - alpha) * 0.95;\n                r = max(0.0, min(r, 1.0));\n                g = max(0.0, min(g, 1.0));\n                b = max(0.0, min(b, 1.0));\n                return vec4(r, g, b, 1.0);\n            } else {\n                return vec4(r, g, b, alpha);\n            }\n        }\n\n        void main () {\n            vec4 videoColor;\n            if (useNormalVideoTexture == 1) {\n                videoColor = texture2D(videoNormalTexture, v_texCoord);\n            } else {\n                videoColor = texture2D(videoExternalTexture, v_texCoord);\n            }\n            if (videoColor.a != 1.0) {\n                videoColor.a = 0.0;\n            }\n            if (hasEmojiTexture == 1) {\n                gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texCoord));\n            } else {\n                gl_FragColor = videoColor;\n            }\n        }\n        ");
    this.eZw = GLES20.glGetAttribLocation(this.eZv, "a_position");
    this.eZx = GLES20.glGetAttribLocation(this.eZv, "a_texCoord");
    this.eZy = GLES20.glGetUniformLocation(this.eZv, "videoExternalTexture");
    this.eZz = GLES20.glGetUniformLocation(this.eZv, "videoNormalTexture");
    this.eZA = GLES20.glGetUniformLocation(this.eZv, "emojiTexture");
    this.eZB = GLES20.glGetUniformLocation(this.eZv, "hasEmojiTexture");
    this.eZD = GLES20.glGetUniformLocation(this.eZv, "uMatrix");
    this.eZC = GLES20.glGetUniformLocation(this.eZv, "useNormalVideoTexture");
    this.eZF.position(0);
    this.eZF.put(com.tencent.mm.media.i.b.eZZ);
    this.eZF.position(0);
    AppMethodBeat.o(13101);
  }

  protected final void Vf()
  {
    AppMethodBeat.i(13100);
    long l = bo.yz();
    GLES20.glUseProgram(this.eZv);
    GLES20.glActiveTexture(33984);
    GLES20.glBindTexture(36197, this.eYQ);
    GLES20.glTexParameterf(36197, 10241, 9729.0F);
    GLES20.glTexParameterf(36197, 10240, 9729.0F);
    GLES20.glTexParameterf(36197, 10242, 10497.0F);
    GLES20.glTexParameterf(36197, 10243, 10497.0F);
    GLES20.glUniform1i(this.eZy, 0);
    GLES20.glUniform1i(this.eZz, 2);
    if (this.eZt != null)
    {
      GLES20.glActiveTexture(33985);
      GLES20.glBindTexture(3553, this.eZu);
      GLUtils.texImage2D(3553, 0, this.eZt, 0);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 10497.0F);
      GLES20.glTexParameterf(3553, 10243, 10497.0F);
    }
    GLES20.glUniform1i(this.eZA, 1);
    this.eZi.position(0);
    GLES20.glVertexAttribPointer(this.eZw, 2, 5126, false, 0, (Buffer)this.eZi);
    GLES20.glEnableVertexAttribArray(this.eZw);
    this.eZh.position(0);
    this.eZF.position(0);
    GLES20.glVertexAttribPointer(this.eZx, 2, 5126, false, 0, (Buffer)this.eZF);
    GLES20.glEnableVertexAttribArray(this.eZx);
    GLES20.glUniformMatrix4fv(this.eZD, 1, false, this.eZm, 0);
    if (this.eZt != null)
      GLES20.glUniform1i(this.eZB, 1);
    while (true)
    {
      GLES20.glDrawArrays(5, 0, 4);
      GLES20.glDisableVertexAttribArray(this.eZw);
      GLES20.glDisableVertexAttribArray(this.eZx);
      GLES20.glBindTexture(3553, 0);
      GLES20.glBindTexture(36197, 0);
      GLES20.glFinish();
      GLES20.glUseProgram(0);
      this.eZt = null;
      ab.i(this.TAG, "draw frame used " + bo.az(l) + "ms");
      AppMethodBeat.o(13100);
      return;
      GLES20.glUniform1i(this.eZB, 0);
    }
  }

  public final void kb(int paramInt)
  {
    this.eYQ = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.b.b
 * JD-Core Version:    0.6.2
 */