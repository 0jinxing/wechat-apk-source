package com.tencent.mm.cc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c extends BroadcastReceiver
{
  a<Boolean> xHL;
  a<Boolean> xHM;

  c(Context paramContext)
  {
    AppMethodBeat.i(58950);
    Object localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_ON");
    ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_OFF");
    ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_CONNECTED");
    ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    paramContext.registerReceiver(this, (IntentFilter)localObject);
    localObject = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    boolean bool2 = bool1;
    if (localObject != null)
    {
      int i = ((Intent)localObject).getIntExtra("status", -1);
      if (i != 2)
      {
        bool2 = bool1;
        if (i != 5);
      }
      else
      {
        bool2 = true;
      }
    }
    this.xHL = new a("charging", Boolean.valueOf(bool2));
    this.xHM = new a("interactive", Boolean.valueOf(((PowerManager)paramContext.getSystemService("power")).isScreenOn()));
    AppMethodBeat.o(58950);
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(58951);
    paramIntent = paramIntent.getAction();
    if (paramIntent == null)
    {
      AppMethodBeat.o(58951);
      return;
    }
    paramContext = null;
    int i = -1;
    switch (paramIntent.hashCode())
    {
    default:
      label72: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case -1454123155:
    case -2128145023:
    case 1019184907:
    case -1886648615:
    }
    while (true)
    {
      if (paramContext != null)
        ab.i("MicroMsg.SystemStatus", "System status changed: %s = %s", new Object[] { paramContext.name(), paramContext.get().toString() });
      AppMethodBeat.o(58951);
      break;
      if (!paramIntent.equals("android.intent.action.SCREEN_ON"))
        break label72;
      i = 0;
      break label72;
      if (!paramIntent.equals("android.intent.action.SCREEN_OFF"))
        break label72;
      i = 1;
      break label72;
      if (!paramIntent.equals("android.intent.action.ACTION_POWER_CONNECTED"))
        break label72;
      i = 2;
      break label72;
      if (!paramIntent.equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
        break label72;
      i = 3;
      break label72;
      this.xHM.set(Boolean.TRUE);
      paramContext = this.xHM;
      continue;
      this.xHM.set(Boolean.FALSE);
      paramContext = this.xHM;
      continue;
      this.xHL.set(Boolean.TRUE);
      paramContext = this.xHL;
      continue;
      this.xHL.set(Boolean.FALSE);
      paramContext = this.xHL;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cc.c
 * JD-Core Version:    0.6.2
 */