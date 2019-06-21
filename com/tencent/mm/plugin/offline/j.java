package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c;
import java.util.List;

public class j extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43349);
    Object localObject;
    if (paramBundle != null)
      if (!bo.isNullOrNil(paramBundle.getString("key_trans_id")))
        localObject = "key_trans_id";
    while (true)
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.offline.a.g("offlineshowpage", "push", (String)localObject), 0);
      b(paramActivity, WalletOrderInfoUI.class, paramBundle);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOS, Boolean.TRUE);
      AppMethodBeat.o(43349);
      return this;
      localObject = (Orders)paramBundle.getParcelable("key_orders");
      if ((localObject != null) && (((Orders)localObject).tAq != null) && (((Orders)localObject).tAq.size() > 0))
        localObject = ((Orders.Commodity)((Orders)localObject).tAq.get(0)).cAa;
      else
        localObject = "";
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(43350);
    if ((paramActivity instanceof WalletOrderInfoUI))
    {
      F(paramActivity);
      b(paramActivity, null);
    }
    AppMethodBeat.o(43350);
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43352);
    aG(paramActivity);
    if (this.mqu.getInt("key_from_scene") == 8)
      a.Up(this.mqu.getString("key_appid"));
    AppMethodBeat.o(43352);
  }

  public final String bxP()
  {
    return "ShowOrderSuccessProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(43351);
    F(paramActivity);
    AppMethodBeat.o(43351);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.j
 * JD-Core Version:    0.6.2
 */