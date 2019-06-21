package com.tencent.mm.plugin.sns.ui.album;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAlbumUI$6
  implements Runnable
{
  SnsAlbumUI$6(SnsAlbumUI paramSnsAlbumUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39991);
    if (SnsAlbumUI.h(this.rFN))
    {
      ab.w("MicroMsg.SnsAlbumUI", "too fast that it finish");
      AppMethodBeat.o(39991);
    }
    while (true)
    {
      return;
      SnsAlbumUI.e(this.rFN).a(2, SnsAlbumUI.b(this.rFN), this.rFN);
      SnsAlbumUI.e(this.rFN).a(2, SnsAlbumUI.b(this.rFN), true, SnsAlbumUI.d(this.rFN));
      AppMethodBeat.o(39991);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.6
 * JD-Core Version:    0.6.2
 */