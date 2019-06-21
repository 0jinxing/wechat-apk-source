package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class c
{
  public Lock aCZ;
  public Activity activity;
  public WifiManager bJj;
  public BroadcastReceiver broadcastReceiver;
  public Condition cbS;
  public boolean connected;
  public long ftP;
  public String gDC;
  public boolean mtH;
  public String ssid;

  public c(String paramString1, Activity paramActivity, String paramString2)
  {
    AppMethodBeat.i(20568);
    this.connected = false;
    this.mtH = false;
    this.activity = paramActivity;
    this.ftP = 30000L;
    this.ssid = paramString1;
    this.gDC = paramString2;
    this.aCZ = new ReentrantLock();
    this.cbS = this.aCZ.newCondition();
    this.bJj = ((WifiManager)ah.getContext().getSystemService("wifi"));
    AppMethodBeat.o(20568);
  }

  public final void byc()
  {
    AppMethodBeat.i(20569);
    try
    {
      this.activity.unregisterReceiver(this.broadcastReceiver);
      AppMethodBeat.o(20569);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        AppMethodBeat.o(20569);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.c
 * JD-Core Version:    0.6.2
 */