package com.tencent.mm.plugin.emojicapture.ui.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.h.b.c;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiCaptureCropTopRenderProc;", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProcExternalTexture;", "textureWidth", "", "textureHeight", "drawWidth", "drawHeight", "renderOutputType", "scaleType", "(IIIIII)V", "TAG", "", "emojiFilterRender", "Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiFilterRenderer;", "firstRender", "", "changeSticker", "", "stickerInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "getEmojiProcessOutputTexture", "release", "releaseFilterProcess", "renderImpl", "plugin-emojicapture_release"})
public final class a extends c
{
  private final String TAG;
  public final h loL;
  private boolean loM;

  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    AppMethodBeat.i(3143);
    this.TAG = "MicroMsg.EmojiCaptureCropTopRenderProc";
    this.loL = new h();
    this.loM = true;
    this.loL.boi();
    AppMethodBeat.o(3143);
  }

  public final void Vf()
  {
    AppMethodBeat.i(3141);
    if (this.loM)
      ab.i(this.TAG, "first frame start render");
    this.loL.boi();
    this.loL.updateSize(this.eYY, this.eYZ);
    this.loL.b(this.eYN, this.eYS, this.eYW, this.eYX, this.eYR);
    if (this.loM)
    {
      ab.i(this.TAG, "first frame render");
      this.loM = false;
    }
    AppMethodBeat.o(3141);
  }

  public final void release()
  {
    AppMethodBeat.i(3142);
    super.release();
    this.loL.destroy();
    AppMethodBeat.o(3142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.a
 * JD-Core Version:    0.6.2
 */