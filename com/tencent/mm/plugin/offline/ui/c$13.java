package com.tencent.mm.plugin.offline.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.a.s.g;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.ui.q.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class c$13
  implements q.c
{
  c$13(c paramc, s.g paramg)
  {
  }

  public final void a(String paramString, FavorPayInfo paramFavorPayInfo, boolean paramBoolean)
  {
    AppMethodBeat.i(43483);
    if ((this.oZs.mActivity instanceof MMActivity))
      ((MMActivity)this.oZs.mActivity).aqX();
    if (this.oZs.oZn != null)
      this.oZs.oZn.e(1, this.oZt.id, paramString, this.oZt.cBT);
    ab.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do pay");
    AppMethodBeat.o(43483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.c.13
 * JD-Core Version:    0.6.2
 */