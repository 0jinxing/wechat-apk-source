package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.b.a;

public class BakOldUSBReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(17754);
    try
    {
      Object localObject = paramIntent.getAction();
      if ("MMBakchatServiceStart".equalsIgnoreCase((String)localObject))
      {
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>();
        d.aH(((Intent)localObject).setClassName(paramContext, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService").putExtra("url", paramIntent.getStringExtra("url")));
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BakOldUSBReceiver", "START_ACTION onReceive start end");
        AppMethodBeat.o(17754);
      }
      while (true)
      {
        return;
        if ("MMBakchatServiceStop".equalsIgnoreCase((String)localObject))
        {
          paramIntent = new com/tencent/mm/g/a/ab;
          paramIntent.<init>();
          paramIntent.csW.csX = paramContext;
          a.xxA.m(paramIntent);
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BakOldUSBReceiver", "STOP_ACTION onReceive stop end");
        }
        AppMethodBeat.o(17754);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.BakOldUSBReceiver", paramContext, "onReceive:", new Object[0]);
        AppMethodBeat.o(17754);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBReceiver
 * JD-Core Version:    0.6.2
 */