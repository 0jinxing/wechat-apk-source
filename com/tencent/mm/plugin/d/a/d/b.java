package com.tencent.mm.plugin.d.a.d;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.d.a.b.g;
import com.tencent.mm.plugin.d.a.c.a;
import com.tencent.mm.plugin.d.a.c.a.a;
import com.tencent.mm.plugin.d.a.c.a.b;
import com.tencent.mm.plugin.exdevice.service.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;
import junit.framework.Assert;

public final class b
{
  public com.tencent.mm.plugin.d.a.b.b jIV;
  public a jIW;
  c jIX;
  final HashSet<String> jIY;
  private ak mHandler;

  public b(Context paramContext, c paramc, al paramal)
  {
    AppMethodBeat.i(18513);
    this.mHandler = null;
    this.jIV = null;
    this.jIW = null;
    this.jIX = null;
    this.jIY = new HashSet();
    this.jIW = new a(paramal);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 18)
    {
      this.jIV = new com.tencent.mm.plugin.d.a.b.b(paramal);
      paramal = this.jIV;
      localObject = new b.b(this);
      ab.i("MicroMsg.exdevice.BluetoothLEManager", "------init------");
      Assert.assertNotNull(paramContext);
      Assert.assertNotNull(localObject);
      if (!paramal.mIsInit)
      {
        paramal.mIsInit = true;
        paramal.Gn = paramContext;
        paramal.jFz = ((com.tencent.mm.plugin.d.a.b.b.a)localObject);
        paramal.jFC = com.tencent.mm.plugin.d.a.b.c.aVy();
        if (d.iW(21))
          paramal.jFD = g.aVD();
        if (paramal.aVw())
          break label305;
        ab.w("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport!!!");
      }
    }
    while (true)
    {
      paramal = this.jIW;
      localObject = new b.a(this);
      ab.i("MicroMsg.exdevice.BluetoothChatManager", "------init------");
      Assert.assertNotNull(paramContext);
      Assert.assertNotNull(localObject);
      if (!paramal.mIsInit)
      {
        paramal.mIsInit = true;
        paramal.jIy = ((a.a)localObject);
        paramal.jIz = paramContext;
        paramContext = new IntentFilter();
        paramContext.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        paramContext.addAction("android.bluetooth.device.action.FOUND");
        paramContext.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
        paramContext.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        paramal.jIz.registerReceiver(paramal.jIA, paramContext);
        paramal.jEU = BluetoothAdapter.getDefaultAdapter();
      }
      this.mHandler = new b.c(v.bpz().fPG.oAl.getLooper(), this);
      this.jIX = paramc;
      AppMethodBeat.o(18513);
      return;
      label305: paramal.jEU = ((BluetoothManager)paramal.Gn.getSystemService("bluetooth")).getAdapter();
    }
  }

  public final void c(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(18515);
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "***createSession*** deviceId = " + paramLong1 + "aBluetoothVersion = " + paramInt);
    switch (paramInt)
    {
    default:
      Assert.assertTrue(false);
      AppMethodBeat.o(18515);
    case 1:
    case 0:
    }
    while (true)
    {
      return;
      if (this.jIW == null)
      {
        ab.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
        AppMethodBeat.o(18515);
      }
      else
      {
        Object localObject = this.jIW;
        ab.i("MicroMsg.exdevice.BluetoothChatManager", "createSession");
        Assert.assertTrue(((a)localObject).mIsInit);
        if (!((a)localObject).aVF())
        {
          ab.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
          AppMethodBeat.o(18515);
        }
        else
        {
          Assert.assertTrue(((a)localObject).mHandler.post(new a.b((a)localObject, paramLong1, paramLong2)));
          AppMethodBeat.o(18515);
          continue;
          if (this.jIV == null)
          {
            ab.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            AppMethodBeat.o(18515);
          }
          else
          {
            localObject = this.jIV;
            ab.i("MicroMsg.exdevice.BluetoothLEManager", "------createSession------ macAddr = %d channelId = %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
            Assert.assertTrue(((com.tencent.mm.plugin.d.a.b.b)localObject).mIsInit);
            if (!((com.tencent.mm.plugin.d.a.b.b)localObject).aVw())
            {
              ab.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
              AppMethodBeat.o(18515);
            }
            else
            {
              Assert.assertTrue(((com.tencent.mm.plugin.d.a.b.b)localObject).mHandler.post(new com.tencent.mm.plugin.d.a.b.b.b((com.tencent.mm.plugin.d.a.b.b)localObject, paramLong1, paramLong2)));
              AppMethodBeat.o(18515);
            }
          }
        }
      }
    }
  }

  public final boolean d(int paramInt, int[] paramArrayOfInt)
  {
    boolean bool = false;
    AppMethodBeat.i(18514);
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "---scan--- aBluetoothVersion = ".concat(String.valueOf(paramInt)));
    switch (paramInt)
    {
    default:
      Assert.assertTrue(false);
      AppMethodBeat.o(18514);
    case 1:
    case 0:
    }
    while (true)
    {
      return bool;
      if (this.jIW == null)
      {
        ab.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
        AppMethodBeat.o(18514);
      }
      else
      {
        bool = this.jIW.fw(true);
        AppMethodBeat.o(18514);
        continue;
        if (this.jIV == null)
        {
          ab.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
          AppMethodBeat.o(18514);
        }
        else if (paramArrayOfInt == null)
        {
          bool = this.jIV.a(true, new int[0]);
          AppMethodBeat.o(18514);
        }
        else
        {
          bool = this.jIV.a(true, paramArrayOfInt);
          AppMethodBeat.o(18514);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.d.b
 * JD-Core Version:    0.6.2
 */