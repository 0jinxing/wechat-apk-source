package com.tencent.mm.plugin.freewifi.model;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.pm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.freewifi.g.f;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;

public final class j
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private com.tencent.mm.sdk.b.c gRa;
  private bz.a luy;
  private volatile d mwd;
  private volatile com.tencent.mm.plugin.freewifi.g.d mwe;
  private volatile com.tencent.mm.plugin.freewifi.g.b mwf;
  private volatile f mwg;
  private volatile c mwh;
  private volatile c mwi;
  private volatile a mwj;
  private volatile e mwk;
  private n mwl;
  private com.tencent.mm.sdk.b.c mwm;
  private com.tencent.mm.sdk.b.c mwn;
  private com.tencent.mm.sdk.b.c mwo;
  private com.tencent.mm.sdk.b.c mwp;
  private com.tencent.mm.sdk.b.c mwq;
  private com.tencent.mm.sdk.b.c mwr;

  static
  {
    AppMethodBeat.i(20769);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("FREEWIFIINFO_TABLE".hashCode()), new j.1());
    eaA.put(Integer.valueOf("FREEWIFICONFIG_TABLE".hashCode()), new j.5());
    eaA.put(Integer.valueOf("FREEWIFILOG_TABLE".hashCode()), new j.6());
    AppMethodBeat.o(20769);
  }

  public j()
  {
    AppMethodBeat.i(20757);
    this.mwl = new j.7(this);
    this.mwm = new j.8(this);
    this.mwn = new com.tencent.mm.sdk.b.c()
    {
    };
    this.mwo = new j.10(this);
    this.mwp = new j.11(this);
    this.mwq = new j.12(this);
    this.mwr = new j.2(this);
    this.gRa = new com.tencent.mm.sdk.b.c()
    {
    };
    this.luy = new j.4(this);
    AppMethodBeat.o(20757);
  }

  public static j byU()
  {
    AppMethodBeat.i(20758);
    aw.ZE();
    j localj1 = (j)bw.oJ("plugin.freewifi");
    j localj2 = localj1;
    if (localj1 == null)
    {
      ab.w("MicroMsg.FreeWifi.SubCoreFreeWifi", "not found in MMCore, new one");
      localj2 = new j();
      aw.ZE().a("plugin.freewifi", localj2);
    }
    AppMethodBeat.o(20758);
    return localj2;
  }

  public static d byV()
  {
    AppMethodBeat.i(20759);
    g.RN().QU();
    if (byU().mwd == null)
      byU().mwd = new d();
    d locald = byU().mwd;
    AppMethodBeat.o(20759);
    return locald;
  }

  public static com.tencent.mm.plugin.freewifi.g.d byW()
  {
    AppMethodBeat.i(20760);
    g.RN().QU();
    if (byU().mwe == null)
    {
      localObject = byU();
      aw.ZK();
      ((j)localObject).mwe = new com.tencent.mm.plugin.freewifi.g.d(com.tencent.mm.model.c.Ru());
    }
    Object localObject = byU().mwe;
    AppMethodBeat.o(20760);
    return localObject;
  }

  public static com.tencent.mm.plugin.freewifi.g.b byX()
  {
    AppMethodBeat.i(20761);
    g.RN().QU();
    if (byU().mwf == null)
    {
      localObject = byU();
      aw.ZK();
      ((j)localObject).mwf = new com.tencent.mm.plugin.freewifi.g.b(com.tencent.mm.model.c.Ru());
    }
    Object localObject = byU().mwf;
    AppMethodBeat.o(20761);
    return localObject;
  }

  public static f byY()
  {
    AppMethodBeat.i(20762);
    g.RN().QU();
    if (byU().mwg == null)
    {
      localObject = byU();
      aw.ZK();
      ((j)localObject).mwg = new f(com.tencent.mm.model.c.Ru());
    }
    Object localObject = byU().mwg;
    AppMethodBeat.o(20762);
    return localObject;
  }

  public static c byZ()
  {
    AppMethodBeat.i(20763);
    g.RN().QU();
    if (byU().mwh == null)
      byU().mwh = new c();
    c localc = byU().mwh;
    AppMethodBeat.o(20763);
    return localc;
  }

  public static c bza()
  {
    AppMethodBeat.i(20764);
    g.RN().QU();
    if (byU().mwi == null)
      byU().mwi = new c();
    c localc = byU().mwi;
    AppMethodBeat.o(20764);
    return localc;
  }

  public static a bzb()
  {
    try
    {
      AppMethodBeat.i(20765);
      g.RN().QU();
      if (byU().mwj == null)
      {
        localObject1 = byU();
        a locala = new com/tencent/mm/plugin/freewifi/model/a;
        locala.<init>();
        ((j)localObject1).mwj = locala;
      }
      Object localObject1 = byU().mwj;
      AppMethodBeat.o(20765);
      return localObject1;
    }
    finally
    {
    }
  }

  public static e bzc()
  {
    AppMethodBeat.i(20768);
    g.RN().QU();
    if (byU().mwk == null)
      byU().mwk = new e();
    e locale = byU().mwk;
    AppMethodBeat.o(20768);
    return locale;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(20766);
    aw.getSysCmdMsgExtension().a("freewifi", this.luy, true);
    aw.a(this.mwl);
    com.tencent.mm.sdk.b.a.xxA.c(this.mwm);
    com.tencent.mm.sdk.b.a.xxA.c(this.mwn);
    com.tencent.mm.sdk.b.a.xxA.c(this.mwo);
    com.tencent.mm.sdk.b.a.xxA.c(this.mwp);
    com.tencent.mm.sdk.b.a.xxA.c(this.mwq);
    com.tencent.mm.sdk.b.a.xxA.c(this.mwr);
    com.tencent.mm.sdk.b.a.xxA.c(this.gRa);
    try
    {
      this.mwl.gl(-9);
      localb = b.b.byH();
      ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "initialized");
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        b localb;
        Object localObject1 = (ConnectivityManager)ah.getContext().getSystemService("connectivity");
        localObject2 = ((ConnectivityManager)localObject1).getNetworkInfo(1);
        ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi=%s", new Object[] { ((NetworkInfo)localObject2).toString() });
        b.a locala;
        if ((localObject2 != null) && (((NetworkInfo)localObject2).isConnected()))
        {
          localObject1 = m.Mv(m.Mx("MicroMsg.FreeWifi.FreeWifiConnChangedManager"));
          localObject2 = m.My("MicroMsg.FreeWifi.FreeWifiConnChangedManager").toLowerCase();
          locala = new com/tencent/mm/plugin/freewifi/model/b$a;
          locala.<init>((byte)0);
          locala.mvE = System.currentTimeMillis();
          locala.type = 1;
          locala.ssid = ((String)localObject1);
          locala.bssid = ((String)localObject2);
          locala.mvF = "";
          b.b(localb.mvB.byG(), locala);
        }
        for (localb.mvB = locala; ; localRemoteException.mvB = ((b.a)localObject1))
        {
          do
          {
            localObject2 = new IntentFilter();
            ((IntentFilter)localObject2).addAction("android.net.conn.CONNECTIVITY_CHANGE");
            localb.byc();
            ah.getContext().registerReceiver(localb.mvC, (IntentFilter)localObject2);
            AppMethodBeat.o(20766);
            return;
            localRemoteException = localRemoteException;
            ab.e("MicroMsg.FreeWifi.SubCoreFreeWifi", "netChanged.onNetworkChange(NETWORK_ACCOUNT_POST_RESET) error. e.getMessage()=" + localRemoteException.getMessage());
            break;
            localObject2 = ((ConnectivityManager)localObject1).getNetworkInfo(0);
            ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoMobile=%s", new Object[] { ((NetworkInfo)localObject2).toString() });
          }
          while ((localObject2 == null) || (!((NetworkInfo)localObject2).isConnected()));
          localObject1 = new com/tencent/mm/plugin/freewifi/model/b$a;
          ((b.a)localObject1).<init>((byte)0);
          ((b.a)localObject1).mvE = System.currentTimeMillis();
          ((b.a)localObject1).type = 0;
          ((b.a)localObject1).ssid = "";
          ((b.a)localObject1).bssid = "";
          ((b.a)localObject1).mvF = m.Mw(((NetworkInfo)localObject2).getExtraInfo());
          b.a(localRemoteException.mvB.byG(), (b.a)localObject1);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object localObject2 = k.byo();
          ((k.a)localObject2).cuH = "UnExpectedException";
          ((k.a)localObject2).result = -1;
          ((k.a)localObject2).ehr = m.g(localException);
          ((k.a)localObject2).byq().byp();
          ab.e("MicroMsg.FreeWifi.UnExcepctedException", m.h(localException));
        }
      }
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(20767);
    aw.getSysCmdMsgExtension().b("freewifi", this.luy, true);
    byV();
    byZ().release();
    aw.b(this.mwl);
    com.tencent.mm.sdk.b.a.xxA.d(this.mwm);
    com.tencent.mm.sdk.b.a.xxA.d(this.mwn);
    com.tencent.mm.sdk.b.a.xxA.d(this.mwo);
    com.tencent.mm.sdk.b.a.xxA.d(this.mwp);
    com.tencent.mm.sdk.b.a.xxA.d(this.mwq);
    com.tencent.mm.sdk.b.a.xxA.d(this.mwr);
    com.tencent.mm.sdk.b.a.xxA.d(this.gRa);
    b.b.byH().byc();
    AppMethodBeat.o(20767);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.j
 * JD-Core Version:    0.6.2
 */