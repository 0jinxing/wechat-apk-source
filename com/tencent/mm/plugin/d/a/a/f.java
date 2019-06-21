package com.tencent.mm.plugin.d.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.service.r;
import com.tencent.mm.plugin.exdevice.service.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@TargetApi(18)
public final class f
  implements BluetoothAdapter.LeScanCallback, b, r
{
  private static boolean jER = false;
  public static boolean jET = false;
  private final b jEM;
  private final d jEP;
  private final HashSet<UUID> jEQ;
  private boolean jES;
  private BluetoothAdapter jEU;
  private boolean jEV;
  private int jEW;
  private String jEX;
  private e jEY;
  private Map<String, Long> jEZ;
  private final ap jFa;
  private final ap jFb;
  private final ap jFc;
  private final ap jFd;
  private final ap jFe;
  public final ak mHandler;

  public f(b paramb)
  {
    AppMethodBeat.i(18343);
    this.jES = false;
    this.jEV = true;
    this.jEW = 0;
    this.jEX = "";
    this.jEY = null;
    this.jEZ = new ConcurrentHashMap();
    this.jFa = new ap(v.bpz().fPG.oAl.getLooper(), new f.1(this), true);
    this.jFb = new ap(v.bpz().fPG.oAl.getLooper(), new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(18335);
        if (f.f(f.this).size() > 0)
        {
          ab.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer now start");
          if (!f.g(f.this).booleanValue())
            break label127;
          ab.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer restart bleScan ok");
        }
        while (true)
        {
          f.fu(ah.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false));
          if (!f.jET)
          {
            if (!f.h(f.this).doT())
              f.h(f.this).stopTimer();
            if (!f.i(f.this).doT())
              f.i(f.this).stopTimer();
          }
          AppMethodBeat.o(18335);
          return false;
          label127: ab.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer restart bleScan fail");
        }
      }
    }
    , true);
    this.jFc = new ap(v.bpz().fPG.oAl.getLooper(), new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(18336);
        boolean bool;
        if (f.f(f.this).size() > 0)
        {
          ab.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer now stop");
          f.j(f.this);
          if (f.i(f.this).doT())
            f.i(f.this).ae(2000L, 2000L);
          bool = true;
          AppMethodBeat.o(18336);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(18336);
        }
      }
    }
    , true);
    this.jFd = new ap(v.bpz().fPG.oAl.getLooper(), new f.4(this), true);
    this.jFe = new ap(v.bpz().fPG.oAl.getLooper(), new f.5(this), true);
    this.jEQ = new HashSet();
    this.jEP = new d(this);
    this.jEM = paramb;
    this.mHandler = new ak(v.bpz().fPG.oAl.getLooper());
    this.jEU = ((BluetoothManager)ah.getContext().getSystemService("bluetooth")).getAdapter();
    AppMethodBeat.o(18343);
  }

  private void aVs()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(18345);
        if (this.jFd.doT())
          this.jFd.ae(2000L, 2000L);
        if ((jET) && (this.jFc.doT()))
          this.jFc.ae(10000L, 10000L);
        if (this.jFe.doT())
        {
          if (!jET)
            this.jFe.ae(120000L, 120000L);
        }
        else
        {
          if (jER)
            break label283;
          this.jEV = true;
          Object localObject1 = Boolean.valueOf(this.jEU.startLeScan(this));
          if ((((Boolean)localObject1).booleanValue()) || (jER))
            break label266;
          int i = 0;
          if ((((Boolean)localObject1).booleanValue()) || (i >= 3) || (jER))
            break;
          int j = i + 1;
          this.jEU.stopLeScan(this);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("start IBEACON BLE scan failed,retry no ");
          ab.e("MicroMsg.exdevice.IBeaconServer", j + " time");
          Boolean localBoolean = Boolean.valueOf(this.jEU.startLeScan(this));
          i = j;
          localObject1 = localBoolean;
          if (!localBoolean.booleanValue())
            continue;
          jER = true;
          this.jES = true;
          ab.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
          i = j;
          localObject1 = localBoolean;
          continue;
        }
      }
      finally
      {
      }
      this.jFe.ae(1800000L, 1800000L);
    }
    AppMethodBeat.o(18345);
    while (true)
    {
      return;
      label266: this.jES = true;
      jER = true;
      ab.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
      label283: AppMethodBeat.o(18345);
    }
  }

  private void stopScan()
  {
    AppMethodBeat.i(18344);
    this.jEZ.clear();
    jER = false;
    if (!this.jFd.doT())
      this.jFd.stopTimer();
    if (!this.jFc.doT())
      this.jFc.stopTimer();
    if (!this.jFb.doT())
      this.jFb.stopTimer();
    if (!this.jFa.doT())
      this.jFa.stopTimer();
    if (!this.jFe.doT())
      this.jFe.stopTimer();
    if ((this.jES) && (this.jEU != null))
    {
      if (this.jEU != null)
        this.jEU.stopLeScan(this);
      this.jES = false;
    }
    AppMethodBeat.o(18344);
  }

  public final void Fy(String paramString)
  {
    AppMethodBeat.i(18349);
    ab.e("MicroMsg.exdevice.IBeaconServer", "------onScanError------ error code = %s, error msg = %s", new Object[] { Integer.valueOf(-1), paramString });
    AppMethodBeat.o(18349);
  }

  public final void a(double paramDouble, c paramc)
  {
    AppMethodBeat.i(18346);
    ab.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback, distance = %f", new Object[] { Double.valueOf(paramDouble) });
    String str1 = com.tencent.mm.plugin.exdevice.j.b.aN(paramc.jEK.jEO.jFp);
    String str2 = str1;
    if (str1.length() >= 32)
      str2 = str1.substring(0, 8) + "-" + str1.substring(8, 12) + "-" + str1.substring(12, 16) + "-" + str1.substring(16, 20) + "-" + str1.substring(20);
    str1 = str2 + paramc.jEK.jEO.jFq + paramc.jEK.jEO.jFr;
    if (!this.jEZ.containsKey(str1))
    {
      this.jEZ.put(str1, Long.valueOf(System.currentTimeMillis()));
      this.jEM.a(paramDouble, paramc);
      int i = paramc.jEK.jEO.jFr;
      ab.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback,uuid = " + str2 + ",major = " + paramc.jEK.jEO.jFq + ",minor = " + (i & 0xFFFF));
      AppMethodBeat.o(18346);
    }
    while (true)
    {
      return;
      long l1 = ((Long)this.jEZ.get(str1)).longValue();
      long l2 = System.currentTimeMillis();
      if (l2 - l1 > 500L)
      {
        this.jEZ.put(str1, Long.valueOf(l2));
        this.jEM.a(paramDouble, paramc);
      }
      AppMethodBeat.o(18346);
    }
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18348);
    ab.d("MicroMsg.exdevice.IBeaconServer", "onScanFound, device mac = %s, device name = %s, bluetooth version = %d, rssi = %d, advertisment = %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), com.tencent.mm.plugin.exdevice.j.b.aN(paramArrayOfByte) });
    if (paramInt1 != 0)
      AppMethodBeat.o(18348);
    while (true)
    {
      return;
      paramString2 = new e();
      if (!paramString2.ar(paramArrayOfByte))
      {
        ab.d("MicroMsg.exdevice.IBeaconServer", "protocal.ParseFromByte Failed!!!");
        AppMethodBeat.o(18348);
      }
      else
      {
        paramArrayOfByte = com.tencent.mm.plugin.exdevice.j.b.aP(paramString2.jEO.jFp);
        if (paramArrayOfByte == null)
        {
          ab.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
          AppMethodBeat.o(18348);
        }
        else if (!this.jEQ.contains(paramArrayOfByte))
        {
          ab.d("MicroMsg.exdevice.IBeaconServer", "this IBeacon UUID is not in the set");
          AppMethodBeat.o(18348);
        }
        else
        {
          if (this.jEV)
            this.jEX = paramString1;
          this.mHandler.post(new f.8(this, paramInt2, paramString1, paramString2));
          AppMethodBeat.o(18348);
        }
      }
    }
  }

  public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18350);
    e locale = new e();
    if (!locale.ar(paramArrayOfByte))
    {
      ab.d("MicroMsg.exdevice.IBeaconServer", "protocal.ParseFromByte Failed!!!");
      AppMethodBeat.o(18350);
    }
    while (true)
    {
      return;
      paramArrayOfByte = com.tencent.mm.plugin.exdevice.j.b.aP(locale.jEO.jFp);
      if (paramArrayOfByte == null)
      {
        ab.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
        AppMethodBeat.o(18350);
      }
      else if (!this.jEQ.contains(paramArrayOfByte))
      {
        ab.d("MicroMsg.exdevice.IBeaconServer", "this IBeacon UUID is not in the set");
        AppMethodBeat.o(18350);
      }
      else
      {
        if (this.jEV)
        {
          this.jEW = paramInt;
          this.jEY = locale;
          if (this.jFa.doT())
            this.jFa.ae(2000L, 2000L);
          this.jEV = false;
        }
        this.mHandler.post(new f.9(this, paramInt, paramBluetoothDevice, locale));
        AppMethodBeat.o(18350);
      }
    }
  }

  public final void rQ(int paramInt)
  {
    AppMethodBeat.i(18347);
    if (paramInt != 0)
      AppMethodBeat.o(18347);
    while (true)
    {
      return;
      stopScan();
      AppMethodBeat.o(18347);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.f
 * JD-Core Version:    0.6.2
 */