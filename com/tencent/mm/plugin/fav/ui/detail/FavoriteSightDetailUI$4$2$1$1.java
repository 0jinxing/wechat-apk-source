package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class FavoriteSightDetailUI$4$2$1$1
  implements Runnable
{
  FavoriteSightDetailUI$4$2$1$1(FavoriteSightDetailUI.4.2.1 param1, p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74416);
    this.mmL.mmK.mmJ.mmH.mlz.mfd = true;
    this.mmg.dismiss();
    ab.i("MicroMsg.FavoriteSightDetailUI", "do del fav file, local id %d, fav id %d", new Object[] { Long.valueOf(FavoriteSightDetailUI.a(this.mmL.mmK.mmJ.mmH).field_localId), Integer.valueOf(FavoriteSightDetailUI.a(this.mmL.mmK.mmJ.mmH).field_id) });
    this.mmL.mmK.mmJ.mmH.finish();
    AppMethodBeat.o(74416);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.4.2.1.1
 * JD-Core Version:    0.6.2
 */