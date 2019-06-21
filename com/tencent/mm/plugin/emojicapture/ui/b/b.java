package com.tencent.mm.plugin.emojicapture.ui.b;

import a.l;
import android.opengl.EGL14;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.ttpic.PTModule;
import com.tencent.ttpic.gameplaysdk.GamePlaySDK;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiCaptureGLSurfaceTextureRenderer;", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "renderOutputType", "", "(I)V", "TAG", "", "useCpuCrop", "", "changeSticker", "", "stickerInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "doInitRenderProc", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "getEmojiProcessOutputTexture", "release", "releaseFilterProcess", "resetRenderer", "plugin-emojicapture_release"})
public final class b extends com.tencent.mm.media.h.a
{
  private final String TAG = "MicroMsg.EmojiCaptureGLSurfaceTextureRenderer";
  private boolean fau;

  private b()
  {
    super(0, 0, 0, 0, 1, 1);
  }

  public final com.tencent.mm.media.h.b.a Vc()
  {
    AppMethodBeat.i(3144);
    ab.i(this.TAG, "doInitRenderProc, useCpuCrop:" + this.fau);
    try
    {
      PTModule.getInstance().init(EGL14.eglGetCurrentContext());
      if (this.fau)
      {
        com.tencent.mm.media.h.b.a locala1 = (com.tencent.mm.media.h.b.a)new f(this.eYW, this.eYX, this.eYY, this.eYZ, this.eZa, this.scaleType);
        AppMethodBeat.o(3144);
        return locala1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "PTModule.getInstance().init error", new Object[0]);
        continue;
        com.tencent.mm.media.h.b.a locala2 = (com.tencent.mm.media.h.b.a)new a(this.eYW, this.eYX, this.eYY, this.eYZ, this.eZa, this.scaleType);
        AppMethodBeat.o(3144);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(3145);
    super.release();
    GamePlaySDK.getInstance().clear();
    PTModule.getInstance().destroy();
    AppMethodBeat.o(3145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.b
 * JD-Core Version:    0.6.2
 */