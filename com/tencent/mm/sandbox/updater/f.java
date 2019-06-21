package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

final class f
{
  private static long xwt = 125829120L;
  private static long xwu = 314572800L;
  ap che;
  private boolean initialized;
  boolean mgU;
  private long xwv;
  private long xww;
  private String xwx;
  private j xwy;

  public f(j paramj)
  {
    AppMethodBeat.i(28902);
    this.che = new ap(new f.1(this), true);
    this.xwv = 0L;
    this.xww = 0L;
    this.xwx = null;
    this.initialized = false;
    this.mgU = false;
    this.xwy = paramj;
    AppMethodBeat.o(28902);
  }

  public static boolean amb(String paramString)
  {
    AppMethodBeat.i(28907);
    boolean bool;
    if (i.amd(paramString) > xwt)
    {
      ab.e("MicroMsg.TrafficStatistic", "overTrafficAlertLine reach traffic alert line!");
      bool = true;
      AppMethodBeat.o(28907);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28907);
    }
  }

  private void dnq()
  {
    AppMethodBeat.i(28905);
    if (this.xwv + this.xww > 0L)
    {
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
      localIntent.putExtra("intent_extra_flow_stat_upstream", this.xwv);
      localIntent.putExtra("intent_extra_flow_stat_downstream", this.xww);
      if (this.xwy.mContext != null)
        this.mgU = at.isWifi(this.xwy.mContext);
      localIntent.putExtra("intent_extra_flow_stat_is_wifi", this.mgU);
      if (this.xwy.mContext != null)
        this.xwy.mContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
    }
    AppMethodBeat.o(28905);
  }

  private long dnr()
  {
    long l = 0L;
    AppMethodBeat.i(28908);
    dnq();
    if (bo.isNullOrNil(this.xwx))
    {
      ab.e("MicroMsg.TrafficStatistic", "traffic is null!");
      AppMethodBeat.o(28908);
    }
    while (true)
    {
      return l;
      l = i.y(this.xwx, this.xwv, this.xww);
      this.xwv = 0L;
      this.xww = 0L;
      AppMethodBeat.o(28908);
    }
  }

  public final void ee(String paramString, int paramInt)
  {
    AppMethodBeat.i(28903);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(28903);
    while (true)
    {
      return;
      if (!paramString.equals(this.xwx))
        stop();
      ab.i("MicroMsg.TrafficStatistic", "pack size: ".concat(String.valueOf(paramInt)));
      ab.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE before : %s", new Object[] { Long.valueOf(xwt) });
      xwt = Math.max(paramInt * 4, xwt);
      xwt = Math.min(xwu, xwt);
      ab.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE after : %s", new Object[] { Long.valueOf(xwt) });
      if (!this.initialized)
      {
        if (this.xwy.mContext != null)
          this.mgU = at.isWifi(this.xwy.mContext);
        this.che.ae(30000L, 30000L);
        this.initialized = true;
        this.xwx = paramString;
      }
      AppMethodBeat.o(28903);
    }
  }

  final void pd(boolean paramBoolean)
  {
    AppMethodBeat.i(28906);
    if (((paramBoolean) || (this.xwv + this.xww >= 524288L)) && (dnr() >= xwt) && (this.xwy.rlf == 2))
    {
      ab.e("MicroMsg.TrafficStatistic", "checkIfTrafficAlert reach traffic alert line!");
      this.xwy.cancel();
    }
    AppMethodBeat.o(28906);
  }

  public final void stop()
  {
    AppMethodBeat.i(28904);
    pd(true);
    this.che.stopTimer();
    this.initialized = false;
    AppMethodBeat.o(28904);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.f
 * JD-Core Version:    0.6.2
 */