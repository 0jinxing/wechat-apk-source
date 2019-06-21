package com.tencent.mm.plugin.d.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bj;
import java.util.ArrayList;
import junit.framework.Assert;

@TargetApi(18)
public final class c
  implements BluetoothAdapter.LeScanCallback
{
  private static c jFN;
  private BluetoothAdapter jEU;
  private ArrayList<c.a> jFO;
  private boolean jFP;
  private Context mContext;
  private ak mHandler;

  private c(Context paramContext)
  {
    AppMethodBeat.i(18382);
    if (paramContext == null)
    {
      ab.e("MicroMsg.exdevice.BluetoothLEScaner", "no context for scaner");
      AppMethodBeat.o(18382);
    }
    while (true)
    {
      return;
      this.mContext = paramContext;
      this.jFO = new ArrayList();
      this.jFP = false;
      this.jEU = null;
      this.mHandler = null;
      this.jEU = ((BluetoothManager)this.mContext.getSystemService("bluetooth")).getAdapter();
      this.mHandler = new ak(new al("BluetoothLEScanerThread").oAl.getLooper());
      AppMethodBeat.o(18382);
    }
  }

  private boolean a(c.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(18384);
    if (parama == null)
    {
      ab.e("MicroMsg.exdevice.BluetoothLEScaner", "callback is null");
      AppMethodBeat.o(18384);
      return bool;
    }
    int i = 0;
    label29: if (i < this.jFO.size())
      if ((c.a)this.jFO.get(i) == parama)
      {
        label55: if (i >= 0)
          break label102;
        bool = this.jFO.add(parama);
        ab.d("MicroMsg.exdevice.BluetoothLEScaner", "add callback ".concat(String.valueOf(bool)));
      }
    while (true)
    {
      AppMethodBeat.o(18384);
      break;
      i++;
      break label29;
      i = -1;
      break label55;
      label102: bool = true;
      ab.w("MicroMsg.exdevice.BluetoothLEScaner", "callback has in queue. pass");
    }
  }

  public static c aVy()
  {
    AppMethodBeat.i(18381);
    c localc;
    if (jFN != null)
    {
      localc = jFN;
      AppMethodBeat.o(18381);
    }
    while (true)
    {
      return localc;
      localc = new c(ah.getContext());
      jFN = localc;
      AppMethodBeat.o(18381);
    }
  }

  public final boolean a(boolean paramBoolean, c.a parama)
  {
    AppMethodBeat.i(18383);
    parama = (Boolean)new c.1(this, paramBoolean, parama).b(this.mHandler);
    if (parama != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = parama.booleanValue();
      AppMethodBeat.o(18383);
      return paramBoolean;
    }
  }

  public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18385);
    ab.d("MicroMsg.exdevice.BluetoothLEScaner", "onLeScan. device addr = %s, name = %s, data = %s", new Object[] { paramBluetoothDevice.getAddress(), paramBluetoothDevice.getName(), b.aN(paramArrayOfByte) });
    ab.d("MicroMsg.exdevice.BluetoothLEScaner", "callback size = %d", new Object[] { Integer.valueOf(this.jFO.size()) });
    this.mHandler.post(new c.2(this, paramBluetoothDevice, paramInt, paramArrayOfByte));
    AppMethodBeat.o(18385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.c
 * JD-Core Version:    0.6.2
 */