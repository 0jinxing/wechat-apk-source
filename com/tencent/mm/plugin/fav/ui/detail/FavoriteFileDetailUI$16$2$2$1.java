package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class FavoriteFileDetailUI$16$2$2$1
  implements Runnable
{
  FavoriteFileDetailUI$16$2$2$1(FavoriteFileDetailUI.16.2.2 param2, p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74340);
    this.mmh.mmf.mme.mlX.mlz.mfd = true;
    this.mmg.dismiss();
    ab.d("MicroMsg.FavoriteFileDetailUI", "do del fav file, local id %d, fav id %d", new Object[] { Long.valueOf(FavoriteFileDetailUI.b(this.mmh.mmf.mme.mlX).field_localId), Integer.valueOf(FavoriteFileDetailUI.b(this.mmh.mmf.mme.mlX).field_id) });
    this.mmh.mmf.mme.mlX.finish();
    AppMethodBeat.o(74340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.16.2.2.1
 * JD-Core Version:    0.6.2
 */