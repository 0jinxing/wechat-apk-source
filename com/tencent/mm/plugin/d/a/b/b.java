package com.tencent.mm.plugin.d.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.view.InputDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

@TargetApi(18)
public final class b
{
  public Context Gn;
  public BluetoothAdapter jEU;
  public final HashMap<String, d> jFA;
  volatile boolean jFB;
  public c jFC;
  public g jFD;
  final HashSet<Long> jFE;
  private c.a jFF;
  private g.a jFG;
  public b.a jFz;
  public ak mHandler;
  public volatile boolean mIsInit;
  private Runnable mRunnable;

  public b(al paramal)
  {
    AppMethodBeat.i(18371);
    this.jFz = null;
    this.Gn = null;
    this.jFA = new HashMap();
    this.jEU = null;
    this.mHandler = null;
    this.mRunnable = null;
    this.jFB = false;
    this.mIsInit = false;
    this.jFE = new HashSet();
    this.jFF = new b.2(this);
    this.jFG = new b.3(this);
    this.mRunnable = new b.1(this);
    this.mHandler = new ak(paramal.oAl.getLooper());
    AppMethodBeat.o(18371);
  }

  private void stopScan()
  {
    AppMethodBeat.i(18374);
    if (!this.jFB)
      AppMethodBeat.o(18374);
    while (true)
    {
      return;
      this.mHandler.removeCallbacks(this.mRunnable);
      this.jFB = false;
      fv(false);
      aVv();
      if (this.jFz != null)
        this.jFz.aVx();
      AppMethodBeat.o(18374);
    }
  }

  public final boolean a(boolean paramBoolean, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(18375);
    StringBuilder localStringBuilder = new StringBuilder("------scanLEDevice------");
    Object localObject;
    if (paramBoolean)
    {
      localObject = "true";
      ab.i("MicroMsg.exdevice.BluetoothLEManager", (String)localObject);
      Assert.assertTrue(this.mIsInit);
      if (aVw())
        break label76;
      ab.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
      AppMethodBeat.o(18375);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      localObject = "false";
      break;
      label76: if (paramBoolean)
      {
        if (this.jFB)
        {
          AppMethodBeat.o(18375);
          paramBoolean = true;
        }
        else if (!fv(paramBoolean))
        {
          ab.e("MicroMsg.exdevice.BluetoothLEManager", "mAdapter.startLeScan Failed!!!");
          if (!this.jFE.isEmpty())
          {
            paramArrayOfInt = this.jFE.iterator();
            while (paramArrayOfInt.hasNext())
            {
              localObject = (Long)paramArrayOfInt.next();
              ab.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localObject });
              if (this.jFz != null)
                this.jFz.l(((Long)localObject).longValue(), false);
            }
            this.jFE.clear();
          }
          AppMethodBeat.o(18375);
          paramBoolean = false;
        }
        else
        {
          if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 1))
            this.mHandler.removeCallbacks(this.mRunnable);
          while (true)
          {
            this.jFB = true;
            AppMethodBeat.o(18375);
            paramBoolean = true;
            break;
            this.mHandler.postDelayed(this.mRunnable, 10000L);
          }
        }
      }
      else
      {
        stopScan();
        AppMethodBeat.o(18375);
        paramBoolean = true;
      }
    }
  }

  final void aVv()
  {
    AppMethodBeat.i(18372);
    ab.i("MicroMsg.exdevice.BluetoothLEManager", "tryToCleanPreScanSet");
    if (!this.jFE.isEmpty())
    {
      Iterator localIterator = this.jFE.iterator();
      while (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        ab.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localLong });
        if (this.jFz != null)
          this.jFz.l(localLong.longValue(), false);
      }
      this.jFE.clear();
    }
    AppMethodBeat.o(18372);
  }

  @TargetApi(18)
  public final boolean aVw()
  {
    AppMethodBeat.i(18373);
    Assert.assertTrue(this.mIsInit);
    boolean bool = this.Gn.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    AppMethodBeat.o(18373);
    return bool;
  }

  public final boolean connect(long paramLong)
  {
    AppMethodBeat.i(18377);
    ab.i("MicroMsg.exdevice.BluetoothLEManager", "------connect------ sessionId = %d ", new Object[] { Long.valueOf(paramLong) });
    Assert.assertTrue(this.mIsInit);
    boolean bool;
    if (!aVw())
    {
      ab.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
      bool = false;
      AppMethodBeat.o(18377);
      return bool;
    }
    d locald = (d)this.jFA.get(String.valueOf(paramLong));
    label79: Object localObject1;
    if (locald != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localObject1 = (BluetoothManager)this.Gn.getSystemService("bluetooth");
      if (localObject1 != null)
        break label146;
      ab.e("MicroMsg.exdevice.BluetoothLEManager", "null == bluetoothManager");
    }
    label111: label629: 
    while (true)
    {
      this.jFE.add(Long.valueOf(paramLong));
      bool = a(true, new int[0]);
      AppMethodBeat.o(18377);
      break;
      bool = false;
      break label79;
      Object localObject2 = ((BluetoothManager)localObject1).getConnectedDevices(8);
      if (localObject2 == null)
      {
        ab.i("MicroMsg.exdevice.BluetoothLEManager", "null == list, may be no device is connected phone now");
      }
      else
      {
        localObject2 = ((List)localObject2).iterator();
        while (true)
        {
          BluetoothDevice localBluetoothDevice;
          long l;
          if (((Iterator)localObject2).hasNext())
          {
            localBluetoothDevice = (BluetoothDevice)((Iterator)localObject2).next();
            l = com.tencent.mm.plugin.exdevice.j.b.KK(localBluetoothDevice.getAddress());
            ab.i("MicroMsg.exdevice.BluetoothLEManager", "get connected device: mac = %s, long of mac =%d, name = %s", new Object[] { localBluetoothDevice.getAddress(), Long.valueOf(l), localBluetoothDevice.getName() });
            if (paramLong == l)
            {
              ab.i("MicroMsg.exdevice.BluetoothLEManager", "This device is connected to phone now, start connecting without scan...");
              bool = locald.connect();
              AppMethodBeat.o(18377);
              break;
            }
          }
        }
        ab.i("MicroMsg.exdevice.BluetoothLEManager", "Android version realse code: %s", new Object[] { Build.VERSION.RELEASE });
        if ((com.tencent.mm.compatible.util.d.iW(23)) && (!((LocationManager)this.Gn.getSystemService("location")).isProviderEnabled("gps")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
        {
          bool = locald.connect();
          AppMethodBeat.o(18377);
          break;
        }
        localObject1 = ((BluetoothManager)localObject1).getAdapter().getBondedDevices();
        if (localObject1 == null)
        {
          ab.i("MicroMsg.exdevice.BluetoothLEManager", "null == pairedDevices,get paired devices failed");
        }
        else
        {
          localObject1 = ((Set)localObject1).iterator();
          while (true)
          {
            if (!((Iterator)localObject1).hasNext())
              break label629;
            localBluetoothDevice = (BluetoothDevice)((Iterator)localObject1).next();
            l = com.tencent.mm.plugin.exdevice.j.b.KK(localBluetoothDevice.getAddress());
            ab.i("MicroMsg.exdevice.BluetoothLEManager", "get paired device: mac = %s, long of mac =%d, name = %s", new Object[] { localBluetoothDevice.getAddress(), Long.valueOf(l), localBluetoothDevice.getName() });
            if (paramLong == l)
            {
              ab.i("MicroMsg.exdevice.BluetoothLEManager", "This HID device is paired to phone now, check if it is connected...");
              InputManager localInputManager = (InputManager)this.Gn.getSystemService("input");
              localObject2 = localInputManager.getInputDeviceIds();
              if (localObject2 == null)
              {
                ab.i("MicroMsg.exdevice.BluetoothLEManager", "get input devices failed");
                break label111;
              }
              for (int i = 0; ; i++)
              {
                if (i >= localObject2.length)
                  break label620;
                Object localObject3 = localInputManager.getInputDevice(localObject2[i]);
                if (localObject3 != null)
                {
                  localObject3 = ((InputDevice)localObject3).getName();
                  ab.d("MicroMsg.exdevice.BluetoothLEManager", "Input devices: %s", new Object[] { localObject3 });
                  if ((localObject3 != null) && (((String)localObject3).equals(localBluetoothDevice.getName())))
                  {
                    ab.i("MicroMsg.exdevice.BluetoothLEManager", "This HID deivce has connected to phone as a input device");
                    bool = locald.connect();
                    AppMethodBeat.o(18377);
                    break;
                  }
                }
              }
              ab.i("MicroMsg.exdevice.BluetoothLEManager", "This HID device hasn't been connected...");
            }
          }
        }
      }
    }
  }

  final boolean fv(boolean paramBoolean)
  {
    AppMethodBeat.i(18376);
    boolean bool = false;
    if ((com.tencent.mm.compatible.util.d.iW(21)) && (this.jFD != null))
      paramBoolean = this.jFD.a(paramBoolean, this.jFG);
    while (true)
    {
      AppMethodBeat.o(18376);
      return paramBoolean;
      if (this.jFC != null)
      {
        paramBoolean = this.jFC.a(paramBoolean, this.jFF);
      }
      else
      {
        ab.e("MicroMsg.exdevice.BluetoothLEManager", "Scanner is null");
        paramBoolean = bool;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.b
 * JD-Core Version:    0.6.2
 */