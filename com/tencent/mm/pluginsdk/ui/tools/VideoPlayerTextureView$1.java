package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.n.c;
import com.tencent.mm.plugin.n.i;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoPlayerTextureView$1
  implements c
{
  VideoPlayerTextureView$1(VideoPlayerTextureView paramVideoPlayerTextureView)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(117980);
    if (this.vvv.llE != null)
      this.vvv.llE.EA();
    AppMethodBeat.o(117980);
  }

  public final void S(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(117983);
    ab.i("MicroMsg.VideoPlayerTextureView", "video size changed size[%d, %d] degrees[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.vvv.vvu.reset();
    this.vvv.vvp = paramInt3;
    this.vvv.mVideoWidth = paramInt1;
    this.vvv.mVideoHeight = paramInt2;
    this.vvv.dlB();
    if (this.vvv.llE != null)
      this.vvv.llE.dH(this.vvv.mVideoWidth, this.vvv.mVideoHeight);
    AppMethodBeat.o(117983);
  }

  public final void bnT()
  {
    AppMethodBeat.i(117982);
    if (VideoPlayerTextureView.a(this.vvv) != null)
      VideoPlayerTextureView.a(this.vvv).cU(this.vvv.llB);
    if (!this.vvv.llB)
    {
      ab.d("MicroMsg.VideoPlayerTextureView", "player seek done, but don't play now.");
      this.vvv.llB = true;
      AppMethodBeat.o(117982);
    }
    while (true)
    {
      return;
      if (this.vvv.llA != null)
      {
        ab.d("MicroMsg.VideoPlayerTextureView", "%s player seek done", new Object[] { this.vvv.llA.aZm() });
        this.vvv.llA.start();
      }
      AppMethodBeat.o(117982);
    }
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117981);
    if (this.vvv.llE != null)
      this.vvv.llE.onError(paramInt1, paramInt2);
    AppMethodBeat.o(117981);
  }

  public final void pL()
  {
    AppMethodBeat.i(117979);
    ab.i("MicroMsg.VideoPlayerTextureView", "%s onPrepared, path:%s", new Object[] { Integer.valueOf(hashCode()), this.vvv.getVideoPath() });
    this.vvv.VN = true;
    this.vvv.setMute(this.vvv.eif);
    if (this.vvv.llE != null)
      this.vvv.llE.pL();
    this.vvv.requestLayout();
    AppMethodBeat.o(117979);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView.1
 * JD-Core Version:    0.6.2
 */