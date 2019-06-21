package com.tencent.mm.sandbox.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

public class ExceptionMonitorBroadcastReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(28786);
    paramIntent.setClass(paramContext, ExceptionMonitorService.class);
    d.j(paramIntent, "sandbox");
    AppMethodBeat.o(28786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver
 * JD-Core Version:    0.6.2
 */