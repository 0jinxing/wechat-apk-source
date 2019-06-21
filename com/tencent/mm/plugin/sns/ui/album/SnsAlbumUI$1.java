package com.tencent.mm.plugin.sns.ui.album;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsAlbumUI$1
  implements Runnable
{
  SnsAlbumUI$1(SnsAlbumUI paramSnsAlbumUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39986);
    if (SnsAlbumUI.a(this.rFN) != null)
    {
      SnsAlbumUI.a(this.rFN).ctK();
      SnsAlbumUI.a(this.rFN).ll(true);
    }
    AppMethodBeat.o(39986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.1
 * JD-Core Version:    0.6.2
 */