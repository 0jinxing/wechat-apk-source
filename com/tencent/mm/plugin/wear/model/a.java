package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.plugin.wear.model.e.f;
import com.tencent.mm.plugin.wear.model.e.k;
import com.tencent.mm.plugin.wear.model.e.l;
import com.tencent.mm.plugin.wear.model.e.m;
import com.tencent.mm.plugin.wear.model.e.n;
import com.tencent.mm.plugin.wear.model.e.o;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.plugin.wear.model.e.q;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.bd;
import java.util.HashMap;

public final class a
  implements at
{
  public com.tencent.mm.plugin.wear.model.g.a tXA;
  private com.tencent.mm.ai.e tXB;
  q tXr;
  public r tXs;
  public d tXt;
  private e tXu;
  public g tXv;
  public b tXw;
  private WearMessageLogic tXx;
  private i tXy;
  public j tXz;

  public a()
  {
    AppMethodBeat.i(26267);
    ab.i("MicroMsg.Wear.SubCoreWear", "Create SubCore, classLoader=%s", new Object[] { getClass().getClassLoader() });
    AppMethodBeat.o(26267);
  }

  public static a cUn()
  {
    AppMethodBeat.i(26268);
    aw.ZE();
    a locala1 = (a)bw.oJ("plugin.wear");
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new a();
      aw.ZE().a("plugin.wear", locala2);
    }
    AppMethodBeat.o(26268);
    return locala2;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(26271);
    ab.i("MicroMsg.Wear.SubCoreWear", "onSdcardMount, mounted=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(26271);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(26270);
    com.tencent.mm.pluginsdk.p.e.vaw = new c();
    ab.i("MicroMsg.Wear.SubCoreWear", "onAccountPostReset, updated=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.tXr = new q();
    this.tXs = new r();
    this.tXz = new j();
    this.tXu = new e();
    this.tXv = new g();
    this.tXw = new b();
    this.tXt = new d();
    this.tXx = new WearMessageLogic();
    this.tXy = new i();
    this.tXA = new com.tencent.mm.plugin.wear.model.g.a();
    this.tXB = new com.tencent.mm.plugin.wear.model.g.b();
    e.d.a(Integer.valueOf(63), this.tXB);
    this.tXr.a(this.tXt.tXJ);
    this.tXr.a(this.tXt.tXK);
    this.tXr.a(this.tXt.tXL);
    this.tXr.a(new com.tencent.mm.plugin.wear.model.e.h());
    this.tXr.a(new com.tencent.mm.plugin.wear.model.e.g());
    this.tXr.a(new com.tencent.mm.plugin.wear.model.e.d());
    this.tXr.a(new com.tencent.mm.plugin.wear.model.e.c());
    this.tXr.a(new com.tencent.mm.plugin.wear.model.e.e());
    this.tXr.a(new f());
    this.tXr.a(new k());
    this.tXr.a(new m());
    this.tXr.a(new o());
    this.tXr.a(new n());
    this.tXr.a(new l());
    this.tXz.a(new a.1(this));
    j localj = this.tXz;
    Object localObject = new a.2(this);
    if (localj.ilv != null)
    {
      localObject = localj.ilv.obtainMessage(0, localObject);
      localj.ilv.sendMessageDelayed((Message)localObject, 5000L);
    }
    AppMethodBeat.o(26270);
  }

  public final void iy(int paramInt)
  {
    AppMethodBeat.i(26269);
    ab.i("MicroMsg.Wear.SubCoreWear", "clearPluginData, pluginFlag=%d", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(26269);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(26272);
    e.d.b(Integer.valueOf(63), this.tXB);
    this.tXB = null;
    ab.i("MicroMsg.Wear.SubCoreWear", "onAccountRelease");
    this.tXr.tYL.clear();
    this.tXr = null;
    this.tXs = null;
    Object localObject = this.tXu;
    ((e)localObject).gyS.stopTimer();
    ((e)localObject).ryO.dead();
    ((e)localObject).tXP.dead();
    ((e)localObject).tXQ.dead();
    ((e)localObject).ilT.dead();
    ((e)localObject).tXR.dead();
    ((e)localObject).tXS.dead();
    ((e)localObject).tXT.dead();
    ((e)localObject).edy.dead();
    ((e)localObject).nZv.dead();
    aw.ZK();
    com.tencent.mm.model.c.XO().a(((e)localObject).lPn);
    this.tXu = null;
    this.tXv = null;
    localObject = this.tXw;
    com.tencent.mm.sdk.b.a.xxA.d(((b)localObject).tXE);
    aw.ZK();
    com.tencent.mm.model.c.XM().b(((b)localObject).mFC);
    ((b)localObject).tXF.stopTimer();
    this.tXw = null;
    localObject = this.tXt;
    ((d)localObject).tXI.finish();
    ((d)localObject).tXM.reset();
    this.tXt = null;
    localObject = this.tXx;
    ah.getContext().unregisterReceiver((BroadcastReceiver)localObject);
    this.tXx = null;
    localObject = this.tXz;
    if (((j)localObject).handlerThread != null)
      ((j)localObject).handlerThread.quit();
    this.tXz = null;
    localObject = this.tXy;
    ((i)localObject).eoY = null;
    ((i)localObject).cUu();
    ah.getContext().unregisterReceiver(((i)localObject).tYm);
    this.tXy = null;
    AppMethodBeat.o(26272);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.a
 * JD-Core Version:    0.6.2
 */