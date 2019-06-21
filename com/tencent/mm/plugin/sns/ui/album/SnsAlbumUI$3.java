package com.tencent.mm.plugin.sns.ui.album;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAlbumUI$3
  implements c.a
{
  SnsAlbumUI$3(SnsAlbumUI paramSnsAlbumUI)
  {
  }

  public final void bi(int paramInt, String paramString)
  {
    AppMethodBeat.i(39988);
    ab.i("MicroMsg.SnsAlbumUI", "onClickItem localId=%s, mediaId=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    SnsAlbumUI.a(this.rFN, paramInt, paramString);
    AppMethodBeat.o(39988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.3
 * JD-Core Version:    0.6.2
 */