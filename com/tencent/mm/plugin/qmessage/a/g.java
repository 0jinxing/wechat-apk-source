package com.tencent.mm.plugin.qmessage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.qmessage.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import java.util.HashMap;

public final class g
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private e psR;
  private f psS;
  private a psT;
  private b psU;

  static
  {
    AppMethodBeat.i(24095);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("QCONTACT_TABLE".hashCode()), new g.1());
    AppMethodBeat.o(24095);
  }

  public g()
  {
    AppMethodBeat.i(24087);
    this.psS = new f();
    this.psT = new a();
    this.psU = new b();
    AppMethodBeat.o(24087);
  }

  private static g cbZ()
  {
    AppMethodBeat.i(24088);
    aw.ZE();
    g localg1 = (g)bw.oJ("plugin.qmessage");
    g localg2 = localg1;
    if (localg1 == null)
    {
      localg2 = new g();
      aw.ZE().a("plugin.qmessage", localg2);
    }
    AppMethodBeat.o(24088);
    return localg2;
  }

  public static e cca()
  {
    AppMethodBeat.i(24089);
    com.tencent.mm.kernel.g.RN().QU();
    if (cbZ().psR == null)
    {
      localObject = cbZ();
      aw.ZK();
      ((g)localObject).psR = new e(c.Ru());
    }
    Object localObject = cbZ().psR;
    AppMethodBeat.o(24089);
    return localObject;
  }

  public static void ccb()
  {
    AppMethodBeat.i(24092);
    aw.ZK();
    if (c.XR().aoZ("qmessage") == null)
    {
      localObject = new ak();
      ((ak)localObject).setUsername("qmessage");
      ((ak)localObject).setContent("");
      ((ak)localObject).eD(bo.anU());
      ((ak)localObject).hO(0);
      ((ak)localObject).hM(0);
      aw.ZK();
      c.XR().d((ak)localObject);
      AppMethodBeat.o(24092);
      return;
    }
    aw.ZK();
    Object localObject = c.XO().Rb("qmessage");
    ak localak = new ak();
    localak.setUsername("qmessage");
    if (localObject == null);
    for (localObject = ""; ; localObject = ((cy)localObject).field_content)
    {
      localak.setContent((String)localObject);
      localak.eD(bo.anU());
      localak.hO(0);
      localak.hM(0);
      aw.ZK();
      c.XR().a(localak, "qmessage");
      AppMethodBeat.o(24092);
      break;
    }
  }

  public static void ccc()
  {
    AppMethodBeat.i(24093);
    bf.aab();
    aw.ZK();
    c.XR().aoY("@qqim");
    aw.ZK();
    c.XR().aoX("qmessage");
    AppMethodBeat.o(24093);
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
    AppMethodBeat.i(24094);
    e.d.a(Integer.valueOf(36), this.psS);
    e.d.a(Integer.valueOf(39), this.psS);
    com.tencent.mm.sdk.b.a.xxA.c(this.psT);
    com.tencent.mm.sdk.b.a.xxA.c(this.psU);
    AppMethodBeat.o(24094);
  }

  public final void iy(int paramInt)
  {
    AppMethodBeat.i(24091);
    ab.d("MicroMsg.SubCoreQMsg", "clear plugin");
    if ((paramInt & 0x20) != 0)
      ccc();
    AppMethodBeat.o(24091);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(24090);
    e.d.b(Integer.valueOf(36), this.psS);
    e.d.b(Integer.valueOf(39), this.psS);
    com.tencent.mm.sdk.b.a.xxA.d(this.psT);
    com.tencent.mm.sdk.b.a.xxA.d(this.psU);
    AppMethodBeat.o(24090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.a.g
 * JD-Core Version:    0.6.2
 */