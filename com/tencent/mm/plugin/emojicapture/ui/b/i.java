package com.tencent.mm.plugin.emojicapture.ui.b;

import a.f.a.a;
import a.f.b.j;
import a.l;
import a.y;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.ttpic.PTModule;
import com.tencent.ttpic.PTSegment;
import com.tencent.ttpic.gameplaysdk.GamePlaySDK;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiVideoPlayTextureRenderer;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "removeBgEnable", "", "(Z)V", "TAG", "", "afterDrawCallback", "Lkotlin/Function0;", "", "canDraw", "cubeArray", "", "kotlin.jvm.PlatformType", "cubeBuffer", "Ljava/nio/FloatBuffer;", "frameTimestamp", "", "init", "isDrawing", "onFrameAvailable", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "pts", "getOnFrameAvailable", "()Lkotlin/jvm/functions/Function1;", "setOnFrameAvailable", "(Lkotlin/jvm/functions/Function1;)V", "ptFaceDetector", "Lcom/tencent/mm/ptsdk/PTFaceDetectorProcess;", "ptFaceFrame", "Lcom/tencent/filter/Frame;", "ptSegment", "Lcom/tencent/ttpic/PTSegment;", "removeBackground", "getRemoveBgEnable", "()Z", "renderAttributePosition", "", "renderAttributeTextureCoord", "renderProgramId", "renderUniformCalcRoundCorner", "renderUniformExternalTexture", "renderUniformNormalTexture", "renderUniformRadius", "renderUniformSize", "renderUniformUseNormalTexture", "segmentInit", "segmentOutputTexture", "sizeBuff", "stickerOutTexture", "textureCoordArray", "textureCoordBuff", "toTextureAttributePosition", "toTextureAttributeTextureCoord", "toTextureFramebuffer", "toTextureOutputTexture", "toTextureProgramId", "toTextureUniformExternalTexture", "videoPlayRenderDepthBuffer", "videoPlayRenderFramebuffer", "videoPlayRenderOutputTexture", "videoPlayRenderTextureSize", "videoPlaySurface", "Landroid/graphics/SurfaceTexture;", "videoPlayTexture", "viewHeight", "viewWidth", "afterDraw", "callback", "checkInit", "currentFrameTimestamp", "drawFrame", "drawImpl", "drawVideoContent", "videoTexture", "drawWidth", "drawHeight", "externalTarget", "calcRoundCorner", "verticalFlip", "drawWithRemoveBackground", "drawWithStickerAndRemoveBackground", "getVideoPlaySurface", "initSegment", "surfaceTexture", "pauseDraw", "pause", "release", "releaseSegment", "setRemoveBackground", "remove", "setViewSize", "width", "height", "simpleDrawVideoContent", "plugin-emojicapture_release"})
public final class i
  implements SurfaceTexture.OnFrameAvailableListener
{
  public final String TAG;
  public boolean eNa;
  public FloatBuffer eZh;
  public FloatBuffer eZi;
  public float[] gLB;
  public float[] gLC;
  public boolean gLJ;
  public boolean gLv;
  public int iZn;
  public int iZo;
  public boolean ljd;
  public final boolean llN;
  public int lpX;
  public int lpY;
  public int lpZ;
  public int lpg;
  public int lph;
  public int lpi;
  public int lpj;
  public com.tencent.mm.bu.b lpo;
  public PTSegment lpp;
  public h lpq;
  public int lpr;
  public int lqa;
  public int lqb;
  public int lqc;
  public int lqd;
  public int lqe;
  public int lqf;
  public int lqg;
  public int lqh;
  public int lqi;
  public final int lqj;
  private FloatBuffer lqk;
  public SurfaceTexture lql;
  public a<y> lqm;
  public a.f.a.b<? super Long, y> lqn;
  private long lqo;
  public boolean lqp;

  public i(boolean paramBoolean)
  {
    AppMethodBeat.i(3180);
    this.llN = paramBoolean;
    this.TAG = "MicroMsg.EmojiVideoPlayTextureRenderer";
    Object localObject = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    this.lqj = com.tencent.mm.plugin.emojicapture.model.c.bmM();
    localObject = c.eZY;
    this.gLB = Arrays.copyOf((float[])localObject, localObject.length);
    localObject = c.eZZ;
    this.gLC = Arrays.copyOf((float[])localObject, localObject.length);
    localObject = ByteBuffer.allocateDirect(this.gLB.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    j.o(localObject, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
    this.eZi = ((FloatBuffer)localObject);
    localObject = ByteBuffer.allocateDirect(this.gLC.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    j.o(localObject, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
    this.eZh = ((FloatBuffer)localObject);
    localObject = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder()).asFloatBuffer();
    j.o(localObject, "ByteBuffer.allocateDirec…eOrder()).asFloatBuffer()");
    this.lqk = ((FloatBuffer)localObject);
    this.lqo = -1L;
    AppMethodBeat.o(3180);
  }

  private final void bok()
  {
    AppMethodBeat.i(3179);
    ab.i(this.TAG, "releaseSegment: ".concat(String.valueOf(this)));
    try
    {
      this.lqp = false;
      Object localObject = this.lpp;
      if (localObject != null)
        ((PTSegment)localObject).destroy();
      localObject = this.lpo;
      if (localObject != null)
        ((com.tencent.mm.bu.b)localObject).destroy();
      GamePlaySDK.getInstance().clear();
      PTModule.getInstance().destroy();
      this.lpp = null;
      this.lpo = null;
      AppMethodBeat.o(3179);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "release segment error", new Object[0]);
        d locald = d.lhz;
        d.bnj();
        AppMethodBeat.o(3179);
      }
    }
  }

  public final void dY(int paramInt1, int paramInt2)
  {
    this.iZn = paramInt1;
    this.iZo = paramInt2;
  }

  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(3176);
    this.gLJ = true;
    long l;
    if ((paramSurfaceTexture instanceof SurfaceTexture))
    {
      l = paramSurfaceTexture.getTimestamp();
      this.lqo = l;
      paramSurfaceTexture = this.lqn;
      if (paramSurfaceTexture == null)
        break label65;
      paramSurfaceTexture.am(Long.valueOf(this.lqo));
      AppMethodBeat.o(3176);
    }
    while (true)
    {
      return;
      l = -1L;
      break;
      label65: AppMethodBeat.o(3176);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(3178);
    if (!this.eNa)
      AppMethodBeat.o(3178);
    while (true)
    {
      return;
      this.eNa = false;
      ab.i(this.TAG, "release: ".concat(String.valueOf(this)));
      try
      {
        GLES20.glDeleteTextures(3, new int[] { this.lpX, this.lqi, this.lpr }, 0);
        GLES20.glDeleteProgram(this.lpY);
        GLES20.glDeleteProgram(this.lpg);
        GLES20.glDeleteFramebuffers(1, new int[] { this.lqh }, 0);
        bok();
        Object localObject = this.lql;
        if (localObject != null)
          ((SurfaceTexture)localObject).release();
        localObject = this.lpq;
        if (localObject == null)
          j.avw("ptFaceFrame");
        ((h)localObject).clear();
        AppMethodBeat.o(3178);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "release error " + localException.getMessage(), new Object[0]);
        AppMethodBeat.o(3178);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.i
 * JD-Core Version:    0.6.2
 */