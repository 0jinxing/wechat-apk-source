package com.tencent.mm.plugin.emojicapture.ui.b;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bu.b;
import com.tencent.mm.plugin.emojicapture.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.ttpic.PTFaceAttr;
import com.tencent.ttpic.PTSegment;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiCaptureMixRenderer;", "Landroid/opengl/GLSurfaceView$Renderer;", "()V", "TAG", "", "blendAttributePosition", "", "blendAttributeTextureCoord", "blendBitmapTexture", "blendProgramId", "blendUniformCornerRadius", "blendUniformEmojiTexture", "blendUniformExternalVideoTexture", "blendUniformHasEmojiTexture", "blendUniformMatrix", "blendUniformNormalVideoTexture", "blendUniformSize", "blendUniformUseNormalVideoTexture", "cubeBuffer", "Ljava/nio/FloatBuffer;", "currentBlendBitmap", "Landroid/graphics/Bitmap;", "inputTextureHeight", "inputTextureWidth", "isInit", "", "matrix", "", "ptFaceDetector", "Lcom/tencent/mm/ptsdk/PTFaceDetectorProcess;", "ptFaceFrame", "Lcom/tencent/filter/Frame;", "ptSegment", "Lcom/tencent/ttpic/PTSegment;", "removeBackground", "renderContent", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "segOutputTexture", "sizeBuffer", "stickerOutTexture", "textureCoordBuffer", "toTextureAttributePosition", "toTextureAttributeTextureCoord", "toTextureFramebuffer", "toTextureOutputTexture", "toTextureProgramId", "toTextureSize", "toTextureUniformExternalTexture", "videoDecodeSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "videoDecodeTexture", "changeVideoFilter", "", "path", "drawBlendContent", "useNormalVideoTexture", "videoTexture", "drawWithRemoveBackground", "drawWithStickerAndRemoveBackground", "getEmojiMixContent", "", "getVideoDecodeSurfaceTexture", "init", "onDrawFrame", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "onSurfaceChanged", "width", "height", "onSurfaceCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "release", "setBlendFrame", "blendBitmap", "setRemoveBackground", "remove", "simpleDrawVideoContent", "plugin-emojicapture_release"})
public final class e
  implements GLSurfaceView.Renderer
{
  final String TAG;
  boolean bZi;
  int eZA;
  int eZB;
  int eZC;
  int eZD;
  private final FloatBuffer eZE;
  final FloatBuffer eZi;
  public int eZr;
  public int eZs;
  public Bitmap eZt;
  int eZu;
  int eZv;
  int eZw;
  int eZx;
  int eZy;
  int eZz;
  boolean ljd;
  int lpc;
  SurfaceTexture lpd;
  int lpe;
  int lpf;
  int lpg;
  int lph;
  int lpi;
  int lpj;
  int lpk;
  int lpl;
  final int lpm;
  int lpn;
  b lpo;
  PTSegment lpp;
  h lpq;
  int lpr;
  final FloatBuffer lps;
  public ByteBuffer lpt;
  private final float[] matrix;

  public e()
  {
    AppMethodBeat.i(3171);
    this.TAG = "MicroMsg.EmojiCaptureMixRenderer";
    this.lpm = 640;
    this.lpo = new b((byte)0);
    this.lpp = new PTSegment();
    FloatBuffer localFloatBuffer = ByteBuffer.allocateDirect(c.eZY.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    j.o(localFloatBuffer, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
    this.eZi = localFloatBuffer;
    localFloatBuffer = ByteBuffer.allocateDirect(c.eZZ.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    j.o(localFloatBuffer, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
    this.lps = localFloatBuffer;
    this.eZE = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.matrix = new float[16];
    this.lpt = ByteBuffer.allocate(this.eZr * this.eZs * 4);
    AppMethodBeat.o(3171);
  }

  public final SurfaceTexture boh()
  {
    AppMethodBeat.i(3170);
    SurfaceTexture localSurfaceTexture = this.lpd;
    if (localSurfaceTexture == null)
      j.avw("videoDecodeSurfaceTexture");
    AppMethodBeat.o(3170);
    return localSurfaceTexture;
  }

  public final void onDrawFrame(GL10 paramGL10)
  {
    AppMethodBeat.i(3167);
    try
    {
      long l = bo.yz();
      paramGL10 = c.loN;
      c.a.Vj();
      paramGL10 = this.lpd;
      if (paramGL10 == null)
        j.avw("videoDecodeSurfaceTexture");
      paramGL10.updateTexImage();
      boolean bool = this.ljd;
      paramGL10 = c.loN;
      paramGL10 = this.lpq;
      if (paramGL10 == null)
        j.avw("ptFaceFrame");
      int i = paramGL10.wE();
      paramGL10 = this.lpq;
      if (paramGL10 == null)
        j.avw("ptFaceFrame");
      int j = paramGL10.getTextureId();
      paramGL10 = this.lpq;
      if (paramGL10 == null)
        j.avw("ptFaceFrame");
      int k = paramGL10.width;
      paramGL10 = this.lpq;
      if (paramGL10 == null)
        j.avw("ptFaceFrame");
      c.a.y(i, j, k, paramGL10.height);
      GLES20.glViewport(0, 0, this.lpm, this.lpm);
      k = this.lpc;
      if (k != 0)
      {
        GLES20.glUseProgram(this.lpg);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, k);
        GLES20.glTexParameterf(36197, 10241, 9729.0F);
        GLES20.glTexParameterf(36197, 10240, 9729.0F);
        GLES20.glTexParameterf(36197, 10242, 33071.0F);
        GLES20.glTexParameterf(36197, 10243, 33071.0F);
        GLES20.glUniform1i(this.lpj, 0);
        this.eZi.position(0);
        GLES20.glVertexAttribPointer(this.lph, 2, 5126, false, 0, (Buffer)this.eZi);
        GLES20.glEnableVertexAttribArray(this.lph);
        this.lps.position(0);
        this.lps.put(c.faa);
        this.lps.position(0);
        GLES20.glVertexAttribPointer(this.lpi, 2, 5126, false, 0, (Buffer)this.lps);
        GLES20.glEnableVertexAttribArray(this.lpi);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.lph);
        GLES20.glDisableVertexAttribArray(this.lpi);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindTexture(36197, 0);
        GLES20.glFinish();
      }
      GLES20.glBindFramebuffer(36160, 0);
      GLES20.glFinish();
      paramGL10 = c.loN;
      c.a.Vj();
      GLES20.glViewport(0, 0, this.lpm, this.lpm);
      paramGL10 = this.lpq;
      if (paramGL10 == null)
        j.avw("ptFaceFrame");
      Object localObject1 = paramGL10;
      Object localObject2;
      if (bool)
      {
        localObject1 = this.lpo;
        localObject2 = this.lpq;
        if (localObject2 == null)
          j.avw("ptFaceFrame");
        localObject2 = ((b)localObject1).a((h)localObject2, false, true, true);
        localObject1 = paramGL10;
        if (localObject2 != null)
        {
          if (((PTFaceAttr)localObject2).getOrigFrame() == null)
            break label1150;
          paramGL10 = ((PTFaceAttr)localObject2).getOrigFrame();
          j.o(paramGL10, "faceAttr.origFrame");
        }
      }
      try
      {
        localObject1 = this.lpp.segTexture((PTFaceAttr)localObject2, paramGL10, 0.015F, this.lpm, this.lpm);
        j.o(localObject1, "ptSegment.segTexture(fac…xtureSize, toTextureSize)");
        paramGL10 = (GL10)localObject1;
        localObject1 = c.loN;
        c.a.Vj();
        localObject1 = paramGL10;
        GLES20.glFinish();
        GLES20.glViewport(0, 0, this.eZr, this.eZs);
        k = ((h)localObject1).getTextureId();
        GLES20.glViewport(0, 0, this.eZr, this.eZs);
        GLES20.glUseProgram(this.eZv);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, k);
        GLES20.glTexParameterf(3553, 10241, 9729.0F);
        GLES20.glTexParameterf(3553, 10240, 9729.0F);
        GLES20.glTexParameterf(3553, 10242, 33071.0F);
        GLES20.glTexParameterf(3553, 10243, 33071.0F);
        GLES20.glUniform1i(this.eZz, 0);
        GLES20.glUniform1i(this.eZy, 2);
        GLES20.glUniform1i(this.eZC, 1);
        if (this.eZt != null)
        {
          GLES20.glActiveTexture(33985);
          GLES20.glBindTexture(3553, this.eZu);
          GLUtils.texImage2D(3553, 0, this.eZt, 0);
          GLES20.glGenerateMipmap(3553);
          GLES20.glTexParameterf(3553, 10241, 9987.0F);
          GLES20.glTexParameterf(3553, 10240, 9987.0F);
          GLES20.glTexParameterf(3553, 10242, 33071.0F);
          GLES20.glTexParameterf(3553, 10243, 33071.0F);
        }
        GLES20.glUniform1i(this.eZA, 1);
        this.eZi.position(0);
        GLES20.glVertexAttribPointer(this.eZw, 2, 5126, false, 0, (Buffer)this.eZi);
        GLES20.glEnableVertexAttribArray(this.eZw);
        this.lps.position(0);
        this.lps.put(c.eZZ);
        this.lps.position(0);
        GLES20.glVertexAttribPointer(this.eZx, 2, 5126, false, 0, (Buffer)this.lps);
        GLES20.glEnableVertexAttribArray(this.eZx);
        this.eZE.put(this.eZr);
        this.eZE.put(this.eZs);
        this.eZE.position(0);
        GLES20.glUniform2fv(this.lpe, 1, this.eZE);
        k = this.lpf;
        paramGL10 = com.tencent.mm.plugin.emojicapture.model.c.lhw;
        GLES20.glUniform1f(k, Math.max(this.eZr, this.eZs) * 0.0666667F);
        Matrix.setIdentityM(this.matrix, 0);
        Matrix.scaleM(this.matrix, 0, 1.0F, -1.0F, 1.0F);
        GLES20.glUniformMatrix4fv(this.eZD, 1, false, this.matrix, 0);
        if (this.eZt != null)
        {
          GLES20.glUniform1i(this.eZB, 1);
          GLES20.glDrawArrays(5, 0, 4);
          GLES20.glDisableVertexAttribArray(this.eZw);
          GLES20.glDisableVertexAttribArray(this.eZx);
          GLES20.glBindTexture(3553, 0);
          GLES20.glBindTexture(36197, 0);
          GLES20.glFinish();
          this.lpt.position(0);
          GLES20.glReadPixels(0, 0, this.eZr, this.eZr, 6408, 5121, (Buffer)this.lpt);
          GLES20.glUseProgram(0);
          paramGL10 = this.TAG;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("draw frame used ");
          ab.i(paramGL10, bo.az(l) + "ms");
          AppMethodBeat.o(3167);
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          d locald = d.lhz;
          d.bni();
          continue;
          GLES20.glUniform1i(this.eZB, 0);
        }
      }
    }
    catch (Exception paramGL10)
    {
      label1150: 
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)paramGL10, "EmojiCaptureMixRenderer draw frame failed", new Object[0]);
        paramGL10 = d.lhz;
        d.bnc();
        AppMethodBeat.o(3167);
      }
    }
  }

  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3168);
    ab.i(this.TAG, "onSurfaceChanged, width:" + paramInt1 + ", height:" + paramInt2);
    this.eZr = paramInt1;
    this.eZs = paramInt2;
    this.lpt = ByteBuffer.allocate(this.eZr * this.eZs * 4);
    AppMethodBeat.o(3168);
  }

  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    AppMethodBeat.i(3169);
    ab.i(this.TAG, "onSurfaceCreated");
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GLES20.glDisable(2929);
    AppMethodBeat.o(3169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.e
 * JD-Core Version:    0.6.2
 */