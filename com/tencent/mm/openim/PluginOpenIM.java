package com.tencent.mm.openim;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.ly;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.ah;
import com.tencent.mm.openim.b.j;
import com.tencent.mm.openim.e.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class PluginOpenIM extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.a, com.tencent.mm.kernel.api.bucket.c
{
  public static HashMap<Integer, h.d> eaA;
  private com.tencent.mm.ai.f fur;
  private com.tencent.mm.sdk.b.c geL;
  private com.tencent.mm.sdk.b.c geM;
  private d geN;
  private com.tencent.mm.openim.e.b geO;
  private com.tencent.mm.openim.e.f geP;

  static
  {
    AppMethodBeat.i(78831);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("OpenIMAccTypeInfo_TABLE".hashCode()), new PluginOpenIM.4());
    eaA.put(Integer.valueOf("OpenIMAppIdInfo_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return d.fnj;
      }
    });
    eaA.put(Integer.valueOf("OpenIMWordingInfo_TABLE".hashCode()), new PluginOpenIM.6());
    AppMethodBeat.o(78831);
  }

  public PluginOpenIM()
  {
    AppMethodBeat.i(78825);
    this.geL = new PluginOpenIM.1(this);
    this.geM = new PluginOpenIM.2(this);
    this.fur = new com.tencent.mm.ai.f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
      {
        AppMethodBeat.i(78824);
        if ((paramAnonymousm instanceof j))
        {
          paramAnonymousString = (j)paramAnonymousm;
          paramAnonymousm = new ly();
          paramAnonymousm.cHM.cHN = paramAnonymousString.cHN;
          com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousm);
        }
        AppMethodBeat.o(78824);
      }
    };
    AppMethodBeat.o(78825);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return eaA;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public com.tencent.mm.openim.e.b getAccTypeInfoStg()
  {
    AppMethodBeat.i(78827);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.geO == null)
    {
      com.tencent.mm.kernel.g.RQ();
      this.geO = new com.tencent.mm.openim.e.b(com.tencent.mm.kernel.g.RP().eJN);
    }
    com.tencent.mm.openim.e.b localb = this.geO;
    AppMethodBeat.o(78827);
    return localb;
  }

  public d getAppIdInfoStg()
  {
    AppMethodBeat.i(78826);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.geO == null)
    {
      com.tencent.mm.kernel.g.RQ();
      this.geN = new d(com.tencent.mm.kernel.g.RP().eJN);
    }
    d locald = this.geN;
    AppMethodBeat.o(78826);
    return locald;
  }

  public com.tencent.mm.openim.e.f getWordingInfoStg()
  {
    AppMethodBeat.i(78828);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.geP == null)
    {
      com.tencent.mm.kernel.g.RQ();
      this.geP = new com.tencent.mm.openim.e.f(com.tencent.mm.kernel.g.RP().eJN);
    }
    com.tencent.mm.openim.e.f localf = this.geP;
    AppMethodBeat.o(78828);
    return localf;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(78829);
    ab.i("MicroMsg.PluginOpenIM", "onAccountInitialized");
    com.tencent.mm.sdk.b.a.xxA.b(this.geL);
    this.geM.dnU();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.a(com.tencent.mm.openim.a.b.class, new com.tencent.mm.openim.b.t());
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.a(com.tencent.mm.openim.a.a.class, new com.tencent.mm.openim.d.p());
    com.tencent.mm.model.t.a((ah)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.a.class));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(453, (com.tencent.mm.ai.f)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(913, this.fur);
    AppMethodBeat.o(78829);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(78830);
    ab.i("MicroMsg.PluginOpenIM", "onAccountRelease");
    com.tencent.mm.sdk.b.a.xxA.d(this.geL);
    this.geM.dead();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(453, (com.tencent.mm.ai.f)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(913, this.fur);
    AppMethodBeat.o(78830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.PluginOpenIM
 * JD-Core Version:    0.6.2
 */