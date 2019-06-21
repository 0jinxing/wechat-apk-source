package com.tencent.mm.plugin.sns.ui.album;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class SnsAlbumUI$5 extends d
{
  SnsAlbumUI$5(SnsAlbumUI paramSnsAlbumUI)
  {
  }

  public final void KB()
  {
    AppMethodBeat.i(39990);
    ab.d("MicroMsg.SnsAlbumUI", "onLoadMore");
    if (SnsAlbumUI.c(this.rFN) == 0)
    {
      SnsAlbumUI.e(this.rFN).b(2, SnsAlbumUI.b(this.rFN), true, SnsAlbumUI.d(this.rFN));
      af.bCo().postDelayed(SnsAlbumUI.f(this.rFN), 3000L);
      SnsAlbumUI.g(this.rFN);
    }
    AppMethodBeat.o(39990);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.5
 * JD-Core Version:    0.6.2
 */