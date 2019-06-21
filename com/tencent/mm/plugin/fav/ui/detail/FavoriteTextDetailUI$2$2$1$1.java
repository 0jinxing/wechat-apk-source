package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class FavoriteTextDetailUI$2$2$1$1
  implements Runnable
{
  FavoriteTextDetailUI$2$2$1$1(FavoriteTextDetailUI.2.2.1 param1, p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74439);
    this.mmU.mmT.mmS.mmR.mlz.mfd = true;
    this.mmg.dismiss();
    ab.d("MicroMsg.FavoriteTextDetailUI", "do del, local id %d", new Object[] { Long.valueOf(FavoriteTextDetailUI.b(this.mmU.mmT.mmS.mmR)) });
    this.mmU.mmT.mmS.mmR.finish();
    AppMethodBeat.o(74439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI.2.2.1.1
 * JD-Core Version:    0.6.2
 */