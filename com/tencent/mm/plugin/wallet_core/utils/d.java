package com.tencent.mm.plugin.wallet_core.utils;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;

public final class d
{
  public static long tPh = 0L;
  public static int tPi = 2;
  public static int tPj = 1;
  public static int tPk = 2;

  public static void a(Activity paramActivity, Bundle paramBundle, int paramInt)
  {
    AppMethodBeat.i(48012);
    paramActivity = a.aE(paramActivity);
    if ((!r.cPI().cQg()) && (paramActivity != null) && (paramActivity.dNG()))
    {
      paramActivity = (PayInfo)paramBundle.getParcelable("key_pay_info");
      paramBundle = (Orders)paramBundle.getParcelable("key_orders");
      if ((paramActivity != null) && (paramBundle != null))
        h.pYm.e(10725, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramActivity.cIf), Integer.valueOf((int)(paramBundle.pTN * 100.0D)), paramBundle.pcl });
      AppMethodBeat.o(48012);
    }
    while (true)
    {
      return;
      if ((!r.cPI().cQg()) && (paramBundle != null) && (paramBundle.getBoolean("key_is_bind_reg_process", false)))
        h.pYm.e(10932, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramBundle.getInt("key_bind_scene", 0)) });
      AppMethodBeat.o(48012);
    }
  }

  public static void a(PayInfo paramPayInfo, Orders paramOrders)
  {
    AppMethodBeat.i(48014);
    if ((!r.cPI().cQg()) && (paramPayInfo != null) && (paramOrders != null))
      h.pYm.e(10725, new Object[] { Integer.valueOf(1), Integer.valueOf(paramPayInfo.cIf), Integer.valueOf((int)(paramOrders.pTN * 100.0D)), paramOrders.pcl });
    AppMethodBeat.o(48014);
  }

  public static void cSP()
  {
    AppMethodBeat.i(48010);
    tPh = System.currentTimeMillis();
    AppMethodBeat.o(48010);
  }

  public static int cSQ()
  {
    AppMethodBeat.i(48011);
    int i = (int)((System.currentTimeMillis() - tPh) / 1000L);
    AppMethodBeat.o(48011);
    return i;
  }

  public static void gj(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(48013);
    h.pYm.e(10932, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    AppMethodBeat.o(48013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.d
 * JD-Core Version:    0.6.2
 */