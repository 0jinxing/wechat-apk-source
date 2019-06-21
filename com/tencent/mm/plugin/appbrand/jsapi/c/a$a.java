package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class a$a
{
  volatile boolean cFy;
  BluetoothAdapter hJY;
  Map<String, JSONObject> hJZ;
  UUID[] hKa;
  a.a.a hKb;
  long hKc;
  Map<String, JSONObject> hKd;
  BluetoothAdapter.LeScanCallback hKe;

  public a$a()
  {
    AppMethodBeat.i(94353);
    this.hJZ = new ConcurrentHashMap();
    this.hKa = null;
    this.cFy = false;
    this.hKc = 0L;
    this.hKd = new ConcurrentHashMap();
    this.hKe = new a.a.1(this);
    BluetoothManager localBluetoothManager = (BluetoothManager)ah.getContext().getSystemService("bluetooth");
    if (localBluetoothManager == null)
    {
      ab.e("MicroMsg.BeaconManager", "bluetoothManager is null!");
      AppMethodBeat.o(94353);
    }
    while (true)
    {
      return;
      this.hJY = localBluetoothManager.getAdapter();
      if (this.hJY == null)
      {
        ab.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
        AppMethodBeat.o(94353);
      }
      else
      {
        a.hDs = this.hJY.isEnabled();
        AppMethodBeat.o(94353);
      }
    }
  }

  public final boolean EH()
  {
    boolean bool = false;
    AppMethodBeat.i(94354);
    ab.i("MicroMsg.BeaconManager", "BeaconWorker:%d stop", new Object[] { Integer.valueOf(hashCode()) });
    if (!isStart())
    {
      ab.i("MicroMsg.BeaconManager", "BeaconWorker:%d, already stop", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(94354);
    }
    while (true)
    {
      return bool;
      this.hJZ.clear();
      this.hJY.stopLeScan(this.hKe);
      this.cFy = false;
      AppMethodBeat.o(94354);
      bool = true;
    }
  }

  final boolean isStart()
  {
    try
    {
      boolean bool = this.cFy;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c.a.a
 * JD-Core Version:    0.6.2
 */