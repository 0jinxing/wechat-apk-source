package com.tencent.mm.plugin.card.b;

import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.location.LocationManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.model.ai;
import com.tencent.mm.protocal.protobuf.lh;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.Arrays;
import java.util.Map;

public final class i
  implements f
{
  public volatile boolean bZi;
  public volatile float ecs;
  public volatile float ect;
  String kaE;
  private com.tencent.mm.plugin.card.base.b kaS;
  public MMActivity kbc;
  private volatile boolean kbd;
  public Object kbe;
  private boolean kbf;
  boolean kbg;
  private boolean kbh;
  lh kbi;
  private b kbj;
  public i.a kbk;
  private int kbl;
  private long kbm;
  private long kbn;
  private long kbo;
  public ap kbp;

  public i()
  {
    AppMethodBeat.i(87713);
    this.bZi = false;
    this.kbd = false;
    this.kbe = new Object();
    this.kbf = false;
    this.kbg = false;
    this.ecs = -85.0F;
    this.ect = -1000.0F;
    this.kbh = false;
    this.kbl = 60;
    this.kbm = 0L;
    this.kbn = 0L;
    this.kbo = 10000L;
    this.kbp = new ap(new i.1(this), false);
    AppMethodBeat.o(87713);
  }

  private void a(String paramString, byte[] paramArrayOfByte, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(87723);
    a(paramString, paramArrayOfByte, paramFloat1, paramFloat2, paramInt, paramBoolean, this.kbg);
    AppMethodBeat.o(87723);
  }

  static void a(String paramString, byte[] paramArrayOfByte, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(87724);
    paramString = new ai(paramString, paramArrayOfByte, paramFloat1, paramFloat2, paramInt, paramBoolean1, paramBoolean2);
    g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(87724);
  }

  private void a(String paramString, byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(87722);
    a(paramString, paramArrayOfByte, -1000.0F, -85.0F, paramInt, paramBoolean, this.kbg);
    AppMethodBeat.o(87722);
  }

  private static void axU()
  {
    AppMethodBeat.i(87726);
    LocationManager localLocationManager = (LocationManager)ah.getContext().getSystemService("location");
    if (localLocationManager != null)
      ab.i("MicroMsg.CardLbsOrBluetooth", "isGPSEnable:%b isNetworkEnable:%b", new Object[] { Boolean.valueOf(localLocationManager.isProviderEnabled("gps")), Boolean.valueOf(localLocationManager.isProviderEnabled("network")) });
    AppMethodBeat.o(87726);
  }

  private void b(String paramString, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(87721);
    boolean bool = this.kbg;
    a(paramString, new byte[0], paramFloat1, paramFloat2, 0, false, bool);
    AppMethodBeat.o(87721);
  }

  private boolean baD()
  {
    boolean bool = true;
    AppMethodBeat.i(87719);
    synchronized (this.kbe)
    {
      int i;
      if (System.currentTimeMillis() - this.kbn >= this.kbo)
      {
        i = 1;
        if ((Float.compare(this.ecs, -85.0F) == 0) || (Float.compare(this.ect, -1000.0F) == 0))
          break label96;
      }
      label96: for (int j = 1; ; j = 0)
      {
        if ((!this.kbg) || (!this.kbf) || (j == 0) || (i == 0))
          break label102;
        AppMethodBeat.o(87719);
        return bool;
        i = 0;
        break;
      }
      label102: bool = false;
    }
  }

  private boolean baE()
  {
    boolean bool = false;
    AppMethodBeat.i(87720);
    if (!this.kbh)
      AppMethodBeat.o(87720);
    while (true)
    {
      return bool;
      if (this.kbk == null)
      {
        ab.e("MicroMsg.CardLbsOrBluetooth", "[needReportBluetooth]bluetoothHelper is null, return");
        AppMethodBeat.o(87720);
      }
      else if (this.kbk.baG().ceI.equals(""))
      {
        AppMethodBeat.o(87720);
      }
      else if (System.currentTimeMillis() - this.kbm >= this.kbo)
      {
        bool = true;
        AppMethodBeat.o(87720);
      }
      else
      {
        AppMethodBeat.o(87720);
      }
    }
  }

  public final void IF()
  {
    AppMethodBeat.i(87718);
    if (!baF())
    {
      ab.i("MicroMsg.CardLbsOrBluetooth", "[report]not need report");
      AppMethodBeat.o(87718);
    }
    while (true)
    {
      return;
      if (this.kbd)
      {
        ab.i("MicroMsg.CardLbsOrBluetooth", "isReporting, return");
        AppMethodBeat.o(87718);
      }
      else
      {
        this.kbd = true;
        boolean bool1 = baE();
        boolean bool2 = baD();
        boolean bool3 = this.kbf;
        boolean bool4 = this.kbg;
        if (this.kbk == null);
        b localb;
        for (boolean bool5 = false; ; bool5 = this.kbk.kbs)
        {
          ab.i("MicroMsg.CardLbsOrBluetooth", "report needLocation:%b, isLocationAuth:%b, isBluetoothEnable:%b, needReportBluetooth:%b needReportGps:%b", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          if ((!bool1) || (!bool2))
            break label275;
          localb = this.kbk.baG();
          ab.i("MicroMsg.CardLbsOrBluetooth", "reportBluetoothAndGps deviceInfo:%s", new Object[] { localb });
          ab.d("MicroMsg.CardLbsOrBluetooth", "reportBluetoothAndGps lbsLongitude:%f, lbsLatitude:%f", new Object[] { Float.valueOf(this.ect), Float.valueOf(this.ecs) });
          a(this.kaE, localb.kby, this.ect, this.ecs, localb.cyC, this.kbk.kbs);
          this.kbn = System.currentTimeMillis();
          this.kbm = System.currentTimeMillis();
          this.kbk.reset();
          this.kbj = localb;
          AppMethodBeat.o(87718);
          break;
        }
        label275: if (bool1)
        {
          localb = this.kbk.baG();
          ab.i("MicroMsg.CardLbsOrBluetooth", "reportBluetooth deviceInfo:%s", new Object[] { localb });
          a(this.kaE, localb.kby, localb.cyC, this.kbk.kbs);
          this.kbm = System.currentTimeMillis();
          this.kbk.reset();
          this.kbj = localb;
          AppMethodBeat.o(87718);
        }
        else if (bool2)
        {
          ab.i("MicroMsg.CardLbsOrBluetooth", "reportgps");
          ab.d("MicroMsg.CardLbsOrBluetooth", "reportgps lbsLongitude:%f, lbsLatitude:%f", new Object[] { Float.valueOf(this.ect), Float.valueOf(this.ecs) });
          b(this.kaE, this.ect, this.ecs);
          this.kbn = System.currentTimeMillis();
          AppMethodBeat.o(87718);
        }
        else
        {
          ab.e("MicroMsg.CardLbsOrBluetooth", "not report");
          this.kbd = false;
          AppMethodBeat.o(87718);
        }
      }
    }
  }

  public final void a(MMActivity paramMMActivity, String paramString, com.tencent.mm.plugin.card.base.b paramb, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(87714);
    this.bZi = true;
    this.kbc = paramMMActivity;
    this.kaE = paramString;
    this.kaS = paramb;
    this.ecs = paramFloat1;
    this.ect = paramFloat2;
    this.kbf = paramb.aZV().vUF;
    this.kbg = paramb.aZW().vSr;
    this.kbi = paramb.aZV().vUG;
    int i;
    if (paramb.aZV().vUG == null)
    {
      i = 60;
      this.kbl = i;
      if ((paramb.aZV().vUG == null) || (bo.isNullOrNil(paramb.aZV().vUG.name)))
        break label330;
    }
    label330: for (boolean bool = true; ; bool = false)
    {
      this.kbh = bool;
      ab.i("MicroMsg.CardLbsOrBluetooth", "init cardId:%s, needLocation:%b, isLocationAuth:%b needBluetooth:%b reportTime:%d", new Object[] { paramString, Boolean.valueOf(this.kbf), Boolean.valueOf(this.kbg), Boolean.valueOf(this.kbh), Integer.valueOf(this.kbl) });
      if ((this.kbf) && (!this.kbg))
        break label336;
      if (this.kbh)
      {
        ab.i("MicroMsg.CardLbsOrBluetooth", "initBluetoothHelper blueToothInfo.name:%s", new Object[] { this.kbi.name });
        this.kbk = new i.a(this, (byte)0);
        paramString = this.kbk;
        ab.i("MicroMsg.CardLbsOrBluetooth", "init bluetoothStateListener");
        paramString.hDr = new i.a.2(paramString);
        paramMMActivity = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        ah.getContext().registerReceiver(paramString.hDr, paramMMActivity);
      }
      start();
      IF();
      AppMethodBeat.o(87714);
      return;
      i = paramb.aZV().vUG.vON;
      break;
    }
    label336: if (bo.isNullOrNil(this.kaS.aZV().vUH));
    for (paramMMActivity = this.kaS.aZV().title; ; paramMMActivity = this.kaS.aZV().vUH)
    {
      h.a(this.kbc, this.kbc.getString(2131297945, new Object[] { paramMMActivity }), this.kbc.getString(2131297061), new i.2(this), new i.3(this));
      break;
    }
  }

  public final void baB()
  {
    AppMethodBeat.i(87716);
    baC();
    if (this.kbl > 0)
    {
      ap localap = this.kbp;
      long l = this.kbl * 1000;
      localap.ae(l, l);
      ab.i("MicroMsg.CardLbsOrBluetooth", "start ReportTimer!");
      AppMethodBeat.o(87716);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.CardLbsOrBluetooth", "not to start ReportTimer!");
      AppMethodBeat.o(87716);
    }
  }

  public final void baC()
  {
    AppMethodBeat.i(87717);
    ab.i("MicroMsg.CardLbsOrBluetooth", "stop ReportTimer!");
    if (!this.kbp.doT())
      this.kbp.stopTimer();
    AppMethodBeat.o(87717);
  }

  public final boolean baF()
  {
    if ((this.kbf) || (this.kbh));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(87725);
    ab.i("MicroMsg.CardLbsOrBluetooth", "report success, onSceneEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kbd = false;
    AppMethodBeat.o(87725);
  }

  public final void start()
  {
    AppMethodBeat.i(87715);
    if (!baF())
      AppMethodBeat.o(87715);
    while (true)
    {
      return;
      ab.i("MicroMsg.CardLbsOrBluetooth", "start");
      if (!this.bZi)
      {
        ab.e("MicroMsg.CardLbsOrBluetooth", "isInit:%b", new Object[] { Boolean.valueOf(this.bZi) });
        AppMethodBeat.o(87715);
      }
      else
      {
        if (this.kbf)
          axU();
        if ((this.kbk != null) && (this.kbh))
          this.kbk.baH();
        baB();
        g.RO().eJo.a(2574, this);
        AppMethodBeat.o(87715);
      }
    }
  }

  static final class b
  {
    String ceI;
    int cyC;
    byte[] kby;
    String name;

    public b(String paramString1, int paramInt, String paramString2, byte[] paramArrayOfByte)
    {
      this.ceI = paramString1;
      this.cyC = paramInt;
      this.name = paramString2;
      this.kby = paramArrayOfByte;
    }

    public final String toString()
    {
      AppMethodBeat.i(87712);
      String str = "DeviceInfo{deviceId='" + this.ceI + '\'' + ", rssi=" + this.cyC + ", name='" + this.name + '\'' + ", manuData=" + Arrays.toString(this.kby) + '}';
      AppMethodBeat.o(87712);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.i
 * JD-Core Version:    0.6.2
 */