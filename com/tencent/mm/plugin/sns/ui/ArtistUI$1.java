package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.sdk.platformtools.ab;

final class ArtistUI$1
  implements Runnable
{
  ArtistUI$1(ArtistUI paramArtistUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38114);
    if (ArtistUI.a(this.rgS) == null)
      AppMethodBeat.o(38114);
    while (true)
    {
      return;
      ab.d("MicroMsg.ArtistUI", "will pause ImageLoader");
      af.cnC().pause();
      AppMethodBeat.o(38114);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistUI.1
 * JD-Core Version:    0.6.2
 */