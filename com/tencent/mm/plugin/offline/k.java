package com.tencent.mm.plugin.offline;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.ut;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Map;

public class k
  implements at
{
  private static Map<String, String> eGu;
  private static HashMap<Integer, h.d> eaA;
  public static boolean oXK;
  public static int oXL;
  private com.tencent.mm.vending.b.b gRC;
  private bz.a kBx;
  private com.tencent.mm.sdk.platformtools.ak mHandler;
  private s oXE;
  private e oXF;
  private i oXG;
  private com.tencent.mm.plugin.offline.b.a oXH;
  private com.tencent.mm.plugin.offline.ui.d oXI;
  public f oXJ;
  private com.tencent.mm.sdk.b.c<ut> oXM;
  private m oXN;
  private com.tencent.mm.sdk.b.c<hm> oXO;
  private com.tencent.mm.sdk.b.c<com.tencent.mm.g.a.ak> oXP;

  static
  {
    AppMethodBeat.i(43372);
    oXK = false;
    oXL = 10;
    eGu = new HashMap();
    eaA = new HashMap();
    com.tencent.mm.wallet_core.a.g("OfflineBindCardRegProcess", d.class);
    com.tencent.mm.wallet_core.a.g("OfflineBindCardProcess", c.class);
    eaA.put(Integer.valueOf("OFFLINE_ORDER_STATUS".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return com.tencent.mm.plugin.offline.b.a.fnj;
      }
    });
    AppMethodBeat.o(43372);
  }

  public k()
  {
    AppMethodBeat.i(43362);
    this.oXE = null;
    this.oXF = null;
    this.oXG = null;
    this.oXH = null;
    this.oXI = new com.tencent.mm.plugin.offline.ui.d();
    this.oXJ = new f();
    this.oXM = new com.tencent.mm.sdk.b.c()
    {
    };
    this.mHandler = new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper());
    this.kBx = new k.4(this);
    this.oXO = new k.5(this);
    this.oXP = new k.6(this);
    AppMethodBeat.o(43362);
  }

  public static String Ax(int paramInt)
  {
    AppMethodBeat.i(43370);
    g.RQ();
    String str = (String)g.RP().Ry().get(paramInt, null);
    AppMethodBeat.o(43370);
    return str;
  }

  public static void aT(int paramInt, String paramString)
  {
    AppMethodBeat.i(43369);
    if (paramString != null)
    {
      g.RQ();
      g.RP().Ry().set(paramInt, paramString);
      g.RQ();
      g.RP().Ry().dsb();
    }
    AppMethodBeat.o(43369);
  }

  public static k bXg()
  {
    AppMethodBeat.i(43363);
    k localk = (k)q.Y(k.class);
    AppMethodBeat.o(43363);
    return localk;
  }

  public static s bXh()
  {
    AppMethodBeat.i(43366);
    g.RN().QU();
    if (bXg().oXE == null)
      bXg().oXE = new s();
    s locals = bXg().oXE;
    AppMethodBeat.o(43366);
    return locals;
  }

  public static e bXi()
  {
    AppMethodBeat.i(43367);
    g.RN().QU();
    if (bXg().oXF == null)
      bXg().oXF = new e();
    e locale = bXg().oXF;
    AppMethodBeat.o(43367);
    return locale;
  }

  public static i bXj()
  {
    AppMethodBeat.i(43368);
    g.RN().QU();
    if (bXg().oXG == null)
      bXg().oXG = new i();
    i locali = bXg().oXG;
    AppMethodBeat.o(43368);
    return locali;
  }

  public static com.tencent.mm.plugin.offline.b.a bXk()
  {
    AppMethodBeat.i(43371);
    if (!g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(43371);
      throw ((Throwable)localObject);
    }
    if (bXg().oXH == null)
    {
      localObject = bXg();
      g.RQ();
      ((k)localObject).oXH = new com.tencent.mm.plugin.offline.b.a(g.RP().eJN);
    }
    Object localObject = bXg().oXH;
    AppMethodBeat.o(43371);
    return localObject;
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
    AppMethodBeat.i(43364);
    this.gRC = ((com.tencent.mm.plugin.auth.a.b)g.M(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new k.3(this));
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("paymsg", this.kBx, true);
    com.tencent.mm.sdk.b.a.xxA.c(this.oXI);
    com.tencent.mm.sdk.b.a.xxA.c(this.oXM);
    this.oXO.dnU();
    this.oXP.dnU();
    this.oXE = null;
    this.oXF = null;
    this.oXG = null;
    this.oXN = new m();
    AppMethodBeat.o(43364);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(43365);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("paymsg", this.kBx, true);
    com.tencent.mm.sdk.b.a.xxA.d(this.oXI);
    com.tencent.mm.sdk.b.a.xxA.d(this.oXM);
    this.oXO.dead();
    this.oXP.dead();
    if (this.oXN != null)
    {
      m localm = this.oXN;
      bXg();
      bXh().b(localm);
      com.tencent.mm.sdk.b.a.xxA.d(localm.nZv);
    }
    this.oXN = null;
    this.gRC.dead();
    AppMethodBeat.o(43365);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.k
 * JD-Core Version:    0.6.2
 */