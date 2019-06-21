package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.sdk.platformtools.ab;

final class ArtistUI$2
  implements Runnable
{
  ArtistUI$2(ArtistUI paramArtistUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38115);
    if (ArtistUI.a(this.rgS) == null)
      AppMethodBeat.o(38115);
    while (true)
    {
      return;
      ab.d("MicroMsg.ArtistUI", "will start ImageLoader");
      af.cnC().start();
      ArtistUI.a(this.rgS).notifyDataSetChanged();
      AppMethodBeat.o(38115);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistUI.2
 * JD-Core Version:    0.6.2
 */