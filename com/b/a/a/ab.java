package com.b.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ab extends c
{
  private static ab bJc;
  WifiManager bCU;
  private final BroadcastReceiver bJd;
  private final IntentFilter bJe;
  private ac bJf;
  private long bJg;

  private ab()
  {
    AppMethodBeat.i(55585);
    this.bJd = new ab.1(this);
    this.bJe = new IntentFilter("android.net.wifi.SCAN_RESULTS");
    this.bJg = 10000L;
    AppMethodBeat.o(55585);
  }

  private boolean isAvailable()
  {
    if (this.bCU != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static ab wD()
  {
    AppMethodBeat.i(55586);
    if (bJc == null)
      bJc = new ab();
    ab localab = bJc;
    AppMethodBeat.o(55586);
    return localab;
  }

  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    AppMethodBeat.i(55589);
    if (!isAvailable())
    {
      AppMethodBeat.o(55589);
      return;
    }
    paramContext.registerReceiver(this.bJd, this.bJe, null, paramHandler);
    this.bJg = parama.bCP;
    parama = this.bCU;
    if (paramHandler != null);
    while (true)
    {
      this.bJf = new ac(parama, paramHandler);
      this.bJf.n(this.bJg, 0L);
      AppMethodBeat.o(55589);
      break;
      paramHandler = new Handler(paramContext.getMainLooper());
    }
  }

  final void a(Handler paramHandler, d.a parama)
  {
    try
    {
      AppMethodBeat.i(55587);
      if (parama != null);
      while (true)
      {
        super.a(paramHandler, parama);
        AppMethodBeat.o(55587);
        return;
        parama = new d.a(10000L);
      }
    }
    finally
    {
    }
    throw paramHandler;
  }

  final void at(Context paramContext)
  {
    AppMethodBeat.i(55588);
    this.bCU = ((WifiManager)paramContext.getSystemService("wifi"));
    AppMethodBeat.o(55588);
  }

  final void au(Context paramContext)
  {
    AppMethodBeat.i(55590);
    if (!isAvailable())
      AppMethodBeat.o(55590);
    while (true)
    {
      return;
      paramContext.unregisterReceiver(this.bJd);
      this.bJf.stop();
      AppMethodBeat.o(55590);
    }
  }

  final void vV()
  {
  }

  final void vW()
  {
    AppMethodBeat.i(55591);
    if ((!isAvailable()) || (!this.isRunning) || (this.bJg >= 90000L))
      AppMethodBeat.o(55591);
    while (true)
    {
      return;
      this.bJf.n(90000L, 0L);
      AppMethodBeat.o(55591);
    }
  }

  final void vX()
  {
    AppMethodBeat.i(55592);
    if ((!isAvailable()) || (!this.isRunning) || (this.bJg >= 90000L))
      AppMethodBeat.o(55592);
    while (true)
    {
      return;
      this.bJf.n(this.bJg, 0L);
      AppMethodBeat.o(55592);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.b.a.a.ab
 * JD-Core Version:    0.6.2
 */