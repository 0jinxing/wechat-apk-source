package com.tencent.mm.plugin.emojicapture.ui.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.h.b.a;
import com.tencent.mm.media.h.b.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiCaptureRGBRenderProc;", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProcYuvToRgb;", "textureWidth", "", "textureHeight", "drawWidth", "drawHeight", "renderOutputType", "scaleType", "(IIIIII)V", "emojiFilterRender", "Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiFilterRenderer;", "changeSticker", "", "stickerInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "getEmojiProcessOutputTexture", "release", "releaseFilterProcess", "renderImpl", "plugin-emojicapture_release"})
public final class f extends e
{
  public final h loL;

  public f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    AppMethodBeat.i(3174);
    this.loL = new h();
    AppMethodBeat.o(3174);
  }

  public final void Vf()
  {
    AppMethodBeat.i(3172);
    this.loL.boi();
    this.loL.updateSize(this.eYY, this.eYZ);
    this.loL.a(this.eZW, this.eYS, this.eYW, this.eYX, this.eYR);
    AppMethodBeat.o(3172);
  }

  public final void release()
  {
    AppMethodBeat.i(3173);
    super.release();
    this.loL.destroy();
    AppMethodBeat.o(3173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.f
 * JD-Core Version:    0.6.2
 */