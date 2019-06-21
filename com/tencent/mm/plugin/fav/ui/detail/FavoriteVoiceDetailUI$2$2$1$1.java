package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class FavoriteVoiceDetailUI$2$2$1$1
  implements Runnable
{
  FavoriteVoiceDetailUI$2$2$1$1(FavoriteVoiceDetailUI.2.2.1 param1, p paramp, long paramLong1, long paramLong2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74480);
    this.mno.mnl.mnk.mnj.mlz.mfd = true;
    this.mmg.dismiss();
    ab.d("MicroMsg.FavoriteDetailUI", "do del fav voice, local id %d, fav id %d", new Object[] { Long.valueOf(this.mnm), Long.valueOf(this.mnn) });
    this.mno.mnl.mnk.mnj.finish();
    AppMethodBeat.o(74480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI.2.2.1.1
 * JD-Core Version:    0.6.2
 */