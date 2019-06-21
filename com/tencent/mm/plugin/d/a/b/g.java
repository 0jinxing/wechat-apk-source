package com.tencent.mm.plugin.d.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
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
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

@TargetApi(21)
public final class g extends ScanCallback
{
  private static g jGB;
  private BluetoothAdapter jEU;
  private ArrayList<g.a> jFO;
  private boolean jFP;
  private BluetoothManager jGC;
  private BluetoothLeScanner jGD;
  private Context mContext;
  private ak mHandler;

  private g(Context paramContext)
  {
    AppMethodBeat.i(18449);
    if (paramContext == null)
    {
      ab.e("MicroMsg.exdevice.NewBluetoothLEScanner", "No context for scanner");
      AppMethodBeat.o(18449);
    }
    while (true)
    {
      return;
      this.mContext = paramContext;
      this.jFO = new ArrayList();
      this.jFP = false;
      this.jEU = null;
      this.jGD = null;
      this.mHandler = null;
      this.jGC = ((BluetoothManager)this.mContext.getSystemService("bluetooth"));
      this.jEU = this.jGC.getAdapter();
      if (this.jEU != null)
      {
        ab.d("MicroMsg.exdevice.NewBluetoothLEScanner", "Get bluetoothLeScanner");
        this.jGD = this.jEU.getBluetoothLeScanner();
      }
      this.mHandler = new ak(new al("NewBluetoothLEScannerThread").oAl.getLooper());
      AppMethodBeat.o(18449);
    }
  }

  private boolean a(g.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(18451);
    if (parama == null)
    {
      ab.e("MicroMsg.exdevice.NewBluetoothLEScanner", "callback is null");
      AppMethodBeat.o(18451);
      return bool;
    }
    int i = 0;
    label29: if (i < this.jFO.size())
      if ((g.a)this.jFO.get(i) == parama)
      {
        label55: if (i >= 0)
          break label102;
        bool = this.jFO.add(parama);
        ab.d("MicroMsg.exdevice.NewBluetoothLEScanner", "add callback ".concat(String.valueOf(bool)));
      }
    while (true)
    {
      AppMethodBeat.o(18451);
      break;
      i++;
      break label29;
      i = -1;
      break label55;
      label102: bool = true;
      ab.w("MicroMsg.exdevice.NewBluetoothLEScanner", "callback has in queue. pass");
    }
  }

  public static g aVD()
  {
    AppMethodBeat.i(18448);
    g localg;
    if (jGB != null)
    {
      localg = jGB;
      AppMethodBeat.o(18448);
    }
    while (true)
    {
      return localg;
      localg = new g(ah.getContext());
      jGB = localg;
      AppMethodBeat.o(18448);
    }
  }

  public final boolean a(boolean paramBoolean, g.a parama)
  {
    AppMethodBeat.i(18450);
    ab.i("MicroMsg.exdevice.NewBluetoothLEScanner", "(API21)execute scan");
    parama = (Boolean)new g.1(this, paramBoolean, parama).b(this.mHandler);
    if (parama != null);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = parama.booleanValue();
      AppMethodBeat.o(18450);
      return paramBoolean;
    }
  }

  public final void onBatchScanResults(List<ScanResult> paramList)
  {
    AppMethodBeat.i(18454);
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        ScanResult localScanResult = (ScanResult)paramList.next();
        ab.d("MicroMsg.exdevice.NewBluetoothLEScanner", "onLeScan. device addr = %s, name = %s, data = %s", new Object[] { localScanResult.getDevice().getAddress(), localScanResult.getDevice().getName(), b.aN(localScanResult.getScanRecord().getBytes()) });
      }
    }
    AppMethodBeat.o(18454);
  }

  public final void onScanFailed(int paramInt)
  {
    AppMethodBeat.i(18452);
    this.mHandler.post(new g.3(this, paramInt));
    AppMethodBeat.o(18452);
  }

  public final void onScanResult(int paramInt, ScanResult paramScanResult)
  {
    AppMethodBeat.i(18453);
    if ((paramScanResult != null) && (paramScanResult.getScanRecord() != null))
    {
      ab.d("MicroMsg.exdevice.NewBluetoothLEScanner", "onLeScan. device addr = %s, name = %s, data = %s", new Object[] { paramScanResult.getDevice().getAddress(), paramScanResult.getDevice().getName(), b.aN(paramScanResult.getScanRecord().getBytes()) });
      ab.d("MicroMsg.exdevice.NewBluetoothLEScanner", "callback size = %d", new Object[] { Integer.valueOf(this.jFO.size()) });
      BluetoothDevice localBluetoothDevice = paramScanResult.getDevice();
      paramInt = paramScanResult.getRssi();
      paramScanResult = paramScanResult.getScanRecord().getBytes();
      this.mHandler.post(new g.2(this, localBluetoothDevice, paramInt, paramScanResult));
    }
    AppMethodBeat.o(18453);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.g
 * JD-Core Version:    0.6.2
 */