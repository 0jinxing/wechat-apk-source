package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class FavoriteImgDetailUI$3$2$1$1
  implements Runnable
{
  FavoriteImgDetailUI$3$2$1$1(FavoriteImgDetailUI.3.2.1 param1, p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74378);
    this.mmr.mmq.mmp.mmn.mlz.mfd = true;
    this.mmg.dismiss();
    ab.d("MicroMsg.FavoriteImgDetailUI", "do del, local id %d", new Object[] { Long.valueOf(FavoriteImgDetailUI.b(this.mmr.mmq.mmp.mmn).field_localId) });
    this.mmr.mmq.mmp.mmn.finish();
    AppMethodBeat.o(74378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.3.2.1.1
 * JD-Core Version:    0.6.2
 */