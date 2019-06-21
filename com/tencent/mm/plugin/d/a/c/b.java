package com.tencent.mm.plugin.d.a.c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.e.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public BluetoothDevice hGa;
  public long jIC;
  public c.a jID;
  public c.b jIE;
  public c.c jIF;
  public long mSessionId;
  public int mState;

  public b(long paramLong)
  {
    AppMethodBeat.i(18483);
    this.jIC = paramLong;
    this.mSessionId = paramLong;
    this.jID = null;
    this.jIE = null;
    this.jIF = null;
    this.mState = 0;
    this.hGa = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(a.gC(paramLong));
    AppMethodBeat.o(18483);
  }

  public final void disconnect()
  {
    AppMethodBeat.i(18484);
    ab.i("MicroMsg.exdevice.BluetoothChatSession", "disconnect");
    this.mState = 0;
    if (this.jID != null)
    {
      this.jID.disconnect();
      this.jID = null;
    }
    if (this.jIE != null)
    {
      this.jIE.cancel();
      this.jIE = null;
    }
    if (this.jIF != null)
    {
      this.jIF.cancel();
      this.jIF = null;
    }
    AppMethodBeat.o(18484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.b
 * JD-Core Version:    0.6.2
 */