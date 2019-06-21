package com.tencent.mm.plugin.s;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class a
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.b, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.api.e, com.tencent.mm.kernel.b.c
{
  private static HashMap<Integer, h.d> eaA;
  private static volatile a pbq;
  private com.tencent.mm.pluginsdk.model.app.c pbr;
  private com.tencent.mm.pluginsdk.model.app.e pbs;
  private com.tencent.mm.pluginsdk.model.app.h pbt;
  private i pbu;
  private k pbv;
  private m pbw;
  private d pbx;
  private com.tencent.mm.sdk.b.c pby;

  static
  {
    AppMethodBeat.i(79144);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("APPATTACHINFO_TABLE".hashCode()), new a.2());
    eaA.put(Integer.valueOf("APPINFO_TABLE".hashCode()), new a.3());
    AppMethodBeat.o(79144);
  }

  private a()
  {
    AppMethodBeat.i(79130);
    this.pby = new a.4(this);
    a.a.a(new a.1(this));
    AppMethodBeat.o(79130);
  }

  public static com.tencent.mm.pluginsdk.model.app.c aUq()
  {
    AppMethodBeat.i(79134);
    g.RN().QU();
    if (bYF().pbr == null)
      bYF().pbr = new com.tencent.mm.pluginsdk.model.app.c(g.RP().eJN);
    com.tencent.mm.pluginsdk.model.app.c localc = bYF().pbr;
    AppMethodBeat.o(79134);
    return localc;
  }

  public static a bYF()
  {
    AppMethodBeat.i(79131);
    if (pbq == null);
    try
    {
      if (pbq == null)
      {
        locala = new com/tencent/mm/plugin/s/a;
        locala.<init>();
        pbq = locala;
      }
      a locala = pbq;
      AppMethodBeat.o(79131);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(79131);
    }
  }

  public static String bYG()
  {
    AppMethodBeat.i(79133);
    String str = g.RP().eJM + "openapi/";
    AppMethodBeat.o(79133);
    return str;
  }

  public static com.tencent.mm.pluginsdk.model.app.e bYH()
  {
    AppMethodBeat.i(79135);
    g.RN().QU();
    if (bYF().pbs == null)
      bYF().pbs = new com.tencent.mm.pluginsdk.model.app.e();
    com.tencent.mm.pluginsdk.model.app.e locale = bYF().pbs;
    AppMethodBeat.o(79135);
    return locale;
  }

  public static com.tencent.mm.pluginsdk.model.app.h bYI()
  {
    AppMethodBeat.i(79136);
    g.RN().QU();
    if (bYF().pbt == null)
      bYF().pbt = new com.tencent.mm.pluginsdk.model.app.h();
    com.tencent.mm.pluginsdk.model.app.h localh = bYF().pbt;
    AppMethodBeat.o(79136);
    return localh;
  }

  public static i bYJ()
  {
    AppMethodBeat.i(79137);
    g.RN().QU();
    if (bYF().pbu == null)
      bYF().pbu = new i(g.RP().eJN);
    i locali = bYF().pbu;
    AppMethodBeat.o(79137);
    return locali;
  }

  public static k bYK()
  {
    AppMethodBeat.i(79138);
    g.RN().QU();
    if (bYF().pbv == null)
      bYF().pbv = new k(g.RP().eJN);
    k localk = bYF().pbv;
    AppMethodBeat.o(79138);
    return localk;
  }

  public static m bYL()
  {
    AppMethodBeat.i(79139);
    g.RN().QU();
    if (bYF().pbw == null)
      bYF().pbw = new m();
    m localm = bYF().pbw;
    AppMethodBeat.o(79139);
    return localm;
  }

  public static d bYM()
  {
    AppMethodBeat.i(79140);
    g.RN().QU();
    if (bYF().pbx == null)
      bYF().pbx = new d();
    d locald = bYF().pbx;
    AppMethodBeat.o(79140);
    return locald;
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return eaA;
  }

  public List<String> collectStoragePaths()
  {
    AppMethodBeat.i(79132);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "openapi/" });
    AppMethodBeat.o(79132);
    return localLinkedList;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(79141);
    com.tencent.mm.model.ad.a.fls = bYI();
    com.tencent.mm.sdk.b.a.xxA.c(this.pby);
    AppMethodBeat.o(79141);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(79142);
    Object localObject = bYF().pbt;
    if (localObject != null)
    {
      g.RO().eJo.b(231, (com.tencent.mm.ai.f)localObject);
      bYM().b(7, (t)localObject);
    }
    localObject = bYF().pbs;
    if (localObject != null)
    {
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).vbN.clear();
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).qoT.clear();
      ((com.tencent.mm.pluginsdk.model.app.e)localObject).hoQ.clear();
    }
    localObject = bYF().pbw;
    if (localObject != null)
    {
      ab.d("MicroMsg.AppSettingService", "stop service");
      ((m)localObject).vcj.clear();
      bYM().b(1, (t)localObject);
    }
    if (this.pbx != null)
    {
      localObject = this.pbx;
      g.RO().eJo.b(452, (com.tencent.mm.ai.f)localObject);
      ((d)localObject).ftE.clear();
    }
    if (bYF().pbu != null)
      bYF().pbu.vcc.clear();
    com.tencent.mm.sdk.b.a.xxA.d(this.pby);
    ab.i("XPinOpenApi", "onAccountRelease");
    AppMethodBeat.o(79142);
  }

  public void onDataBaseClosed(com.tencent.mm.cd.h paramh1, com.tencent.mm.cd.h paramh2)
  {
    AppMethodBeat.i(79143);
    this.pbr = null;
    this.pbu = null;
    ab.i("XPinOpenApi", "onDataBaseClosed");
    AppMethodBeat.o(79143);
  }

  public void onDataBaseOpened(com.tencent.mm.cd.h paramh1, com.tencent.mm.cd.h paramh2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.s.a
 * JD-Core Version:    0.6.2
 */