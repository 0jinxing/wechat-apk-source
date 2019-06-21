package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.e;
import java.util.List;
import junit.framework.Assert;

public abstract class a
  implements e
{
  public boolean aJe = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.aJe;
  private final Handler awA = new Handler(Looper.getMainLooper());
  public boolean bcp = false;
  public boolean hDP = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.hDP;
  public boolean hDR = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.hDR;
  protected d hEt;
  protected com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b hEu;
  public b hEv;
  private Runnable hEw = new Runnable()
  {
    public final void run()
    {
      AppMethodBeat.i(94277);
      if (a.this.bcp)
        AppMethodBeat.o(94277);
      while (true)
      {
        return;
        a.this.a(j.hFa);
        a.this.done();
        AppMethodBeat.o(94277);
      }
    }
  };
  public long hEx = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.hDM;
  public long hEy = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.hDV;
  public j hEz;

  private void aCT()
  {
    Assert.assertNotNull(this.hEt);
    Assert.assertNotNull(this.hEu);
    Assert.assertNotNull(this.hEv);
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b paramb)
  {
    this.hEu = paramb;
  }

  public final void a(d paramd)
  {
    this.hEt = paramd;
  }

  public final void a(j paramj)
  {
    this.hEz = paramj;
    if (this.hDP)
      this.awA.post(new a.2(this, paramj));
    while (true)
    {
      return;
      this.hEv.a(paramj);
    }
  }

  public abstract void aCR();

  public final void aCS()
  {
    aCT();
    this.awA.postDelayed(this.hEw, this.hEx);
    aCR();
  }

  public void b(j paramj)
  {
  }

  public final void done()
  {
    this.awA.removeCallbacks(this.hEw);
    this.bcp = true;
    b(this.hEz);
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b localb = this.hEu;
    Object localObject = this.hEz;
    if (localObject != null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleConnectDispatcher", "actionCompleteCallback action:%s result:%s", new Object[] { this, localObject });
      if (!this.hDR)
        break label75;
      localb.aCQ();
    }
    while (true)
    {
      return;
      localObject = "";
      break;
      label75: localb.hEd.remove(this);
    }
  }

  public abstract String getName();

  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
  }

  public void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
  }

  public void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
  }

  public void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
  }

  public final void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
  }

  public void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
  }

  public final void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
  }

  public final void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
  }

  public final void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
  }

  public void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
  }

  public String toString()
  {
    return "Action{action='" + getName() + '\'' + ", debug=" + this.aJe + ", mainThread=" + this.hDP + ", serial=" + this.hDR + '}';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a
 * JD-Core Version:    0.6.2
 */