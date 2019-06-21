package com.tencent.mm.plugin.d.a.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  final a.a jIS;
  public final BroadcastReceiver jIT;

  public a(a.a parama)
  {
    AppMethodBeat.i(18497);
    this.jIT = new a.1(this);
    ab.i("McroMsg.exdevice.BluetoohtStateMonitor", "register BluetoothState receiver");
    this.jIS = parama;
    parama = new IntentFilter();
    parama.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
    ah.getContext().registerReceiver(this.jIT, parama);
    AppMethodBeat.o(18497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.d.a
 * JD-Core Version:    0.6.2
 */