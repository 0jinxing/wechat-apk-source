package com.tencent.mm.plugin.game.model.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  public static a.a bEX()
  {
    AppMethodBeat.i(111496);
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    Intent localIntent = ah.getContext().registerReceiver(null, (IntentFilter)localObject);
    localObject = new a.a();
    if (localIntent != null);
    try
    {
      int i = localIntent.getIntExtra("status", -1);
      if ((i == 2) || (i == 5));
      for (boolean bool = true; ; bool = false)
      {
        ((a.a)localObject).iSd = bool;
        i = localIntent.getIntExtra("level", -1);
        int j = localIntent.getIntExtra("scale", -1);
        ((a.a)localObject).mYY = (i / j);
        AppMethodBeat.o(111496);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.BatteryHelper", "err:%s", new Object[] { localException.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.a
 * JD-Core Version:    0.6.2
 */