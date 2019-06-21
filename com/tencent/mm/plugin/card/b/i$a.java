package com.tencent.mm.plugin.card.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class i$a
{
  public BroadcastReceiver hDr;
  private BluetoothAdapter hJY;
  private volatile boolean kbr;
  boolean kbs;
  Map<String, i.b> kbt;
  long kbu;
  Runnable kbv;
  private BluetoothAdapter.LeScanCallback kbw;

  private i$a(i parami)
  {
    AppMethodBeat.i(87706);
    this.kbr = false;
    this.kbs = false;
    this.kbt = new ConcurrentHashMap();
    this.kbu = 3000L;
    this.kbv = new i.a.1(this);
    this.kbw = new i.a.3(this);
    AppMethodBeat.o(87706);
  }

  public static byte[] aw(byte[] paramArrayOfByte)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(87711);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(87711);
    while (true)
    {
      return localObject2;
      int i = 0;
      localObject2 = localObject1;
      if (i < paramArrayOfByte.length)
      {
        int j = i + 1;
        i = paramArrayOfByte[i] & 0xFF;
        if (i != 0)
        {
          int k = i - 1;
          i = j + 1;
          switch (paramArrayOfByte[j] & 0xFF)
          {
          default:
          case 255:
          }
          while (true)
          {
            i = k + i;
            break;
            localObject2 = new byte[k];
            System.arraycopy(paramArrayOfByte, i, localObject2, 0, k);
          }
        }
      }
      AppMethodBeat.o(87711);
    }
  }

  public final i.b baG()
  {
    AppMethodBeat.i(87708);
    Object localObject = new i.b("", -100, "", null);
    if (this.kbt.size() <= 0)
    {
      AppMethodBeat.o(87708);
      return localObject;
    }
    Iterator localIterator = this.kbt.values().iterator();
    label54: if (localIterator.hasNext())
    {
      i.b localb = (i.b)localIterator.next();
      if (((i.b)localObject).cyC >= localb.cyC)
        break label97;
      localObject = localb;
    }
    label97: 
    while (true)
    {
      break label54;
      AppMethodBeat.o(87708);
      break;
    }
  }

  @TargetApi(18)
  public final void baH()
  {
    AppMethodBeat.i(87709);
    if (Build.VERSION.SDK_INT < 18)
    {
      ab.i("MicroMsg.CardLbsOrBluetooth", "not support bluetooth, return");
      AppMethodBeat.o(87709);
    }
    while (true)
    {
      return;
      if (this.kbr)
      {
        ab.i("MicroMsg.CardLbsOrBluetooth", "already start");
        AppMethodBeat.o(87709);
      }
      else
      {
        this.kbt.clear();
        BluetoothManager localBluetoothManager = (BluetoothManager)ah.getContext().getSystemService("bluetooth");
        if (localBluetoothManager == null)
        {
          this.kbs = false;
          ab.e("MicroMsg.CardLbsOrBluetooth", "bluetoothManager is null");
          AppMethodBeat.o(87709);
        }
        else
        {
          this.kbs = true;
          this.hJY = localBluetoothManager.getAdapter();
          if ((this.hJY == null) || (!this.hJY.isEnabled()))
          {
            this.kbs = false;
            ab.e("MicroMsg.CardLbsOrBluetooth", "bluetoothAdapter is null or bluetoothAdapter is disable");
            AppMethodBeat.o(87709);
          }
          else
          {
            ab.i("MicroMsg.CardLbsOrBluetooth", "startLeScan isOK:%b", new Object[] { Boolean.valueOf(this.hJY.startLeScan(this.kbw)) });
            this.kbr = true;
            AppMethodBeat.o(87709);
          }
        }
      }
    }
  }

  @TargetApi(18)
  public final void baI()
  {
    AppMethodBeat.i(87710);
    if (Build.VERSION.SDK_INT < 18)
    {
      ab.i("MicroMsg.CardLbsOrBluetooth", "not support bluetooth, return");
      AppMethodBeat.o(87710);
    }
    while (true)
    {
      return;
      if (!this.kbr)
      {
        ab.i("MicroMsg.CardLbsOrBluetooth", "not start");
        AppMethodBeat.o(87710);
      }
      else if ((this.hJY == null) || (!this.hJY.isEnabled()))
      {
        this.kbs = false;
        ab.e("MicroMsg.CardLbsOrBluetooth", "bluetoothAdapter is null or bluetoothAdapter is disable");
        AppMethodBeat.o(87710);
      }
      else
      {
        this.kbs = true;
        this.hJY.stopLeScan(this.kbw);
        ab.i("MicroMsg.CardLbsOrBluetooth", "stopLeScan");
        this.kbr = false;
        AppMethodBeat.o(87710);
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(87707);
    this.kbt.clear();
    AppMethodBeat.o(87707);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.i.a
 * JD-Core Version:    0.6.2
 */