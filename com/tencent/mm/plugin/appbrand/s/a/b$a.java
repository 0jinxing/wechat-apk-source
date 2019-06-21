package com.tencent.mm.plugin.appbrand.s.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class b$a extends BroadcastReceiver
{
  private b$a(b paramb)
  {
  }

  public final void onReceive(Context arg1, Intent paramIntent)
  {
    synchronized (this.iSc.iSa)
    {
      this.iSc.iRZ = paramIntent;
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.a.b.a
 * JD-Core Version:    0.6.2
 */