package com.tencent.mm.plugin.walletlock.c;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.List;

public final class d
  implements b.b
{
  private static d tWR = null;

  public static d cTU()
  {
    AppMethodBeat.i(51691);
    if (tWR == null)
      tWR = new d();
    d locald = tWR;
    AppMethodBeat.o(51691);
    return locald;
  }

  public final boolean ae(Activity paramActivity)
  {
    AppMethodBeat.i(51690);
    Object localObject = ((ActivityManager.RunningTaskInfo)((ActivityManager)ah.getContext().getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
    if (localObject != null)
    {
      localObject = ((ComponentName)localObject).getClassName();
      ab.d("MicroMsg.WalletGuardFilter", "coveredPage: ".concat(String.valueOf(localObject)));
      if ((localObject == null) || (((String)localObject).equals(paramActivity.getClass().getName())) || (!((String)localObject).contains(ah.doz())) || ((!((String)localObject).contains("plugin.mall")) && (!((String)localObject).contains("plugin.card")) && (!((String)localObject).contains("plugin.wallet")) && (!((String)localObject).contains("plugin.wallet_index")) && (!((String)localObject).contains("plugin.webview")) && (!((String)localObject).contains("plugin.offline")) && (!((String)localObject).contains("plugin.recharge"))))
        break label162;
      AppMethodBeat.o(51690);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      localObject = "";
      break;
      label162: AppMethodBeat.o(51690);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.c.d
 * JD-Core Version:    0.6.2
 */