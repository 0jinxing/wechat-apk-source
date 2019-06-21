package com.tencent.mm.plugin.websearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.ns;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.websearch.api.m;
import com.tencent.mm.plugin.websearch.api.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.HashMap;
import junit.framework.Assert;

public class PluginWebSearch extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.a, com.tencent.mm.kernel.api.bucket.c
{
  private static HashMap<Integer, h.d> cbO;
  private com.tencent.mm.sdk.b.c gyU;
  private com.tencent.mm.sdk.b.c iDB;
  private final com.tencent.mm.sdk.b.c kTy;
  private o sAp;
  private a tZa;
  private b tZb;

  static
  {
    AppMethodBeat.i(91329);
    cbO = new HashMap();
    String str = com.tencent.mm.sdk.e.j.a(com.tencent.mm.plugin.websearch.widget.a.a.ccO, "WidgetSafeMode");
    cbO.put(Integer.valueOf("WidgetSafeMode".hashCode()), new PluginWebSearch.1(new String[] { str }));
    AppMethodBeat.o(91329);
  }

  public PluginWebSearch()
  {
    AppMethodBeat.i(91316);
    this.kTy = new PluginWebSearch.2(this);
    this.gyU = new PluginWebSearch.4(this);
    this.iDB = new PluginWebSearch.5(this);
    this.sAp = new PluginWebSearch.6(this);
    AppMethodBeat.o(91316);
  }

  public static boolean checkTopStoryTemplateFolderValid()
  {
    boolean bool = true;
    AppMethodBeat.i(91325);
    com.tencent.mm.vfs.b localb1 = new com.tencent.mm.vfs.b(aa.Ia(1));
    if ((!localb1.exists()) || (!localb1.isDirectory()))
    {
      AppMethodBeat.o(91325);
      bool = false;
    }
    while (true)
    {
      return bool;
      com.tencent.mm.vfs.b localb2 = new com.tencent.mm.vfs.b(localb1, aa.cUZ());
      localb1 = new com.tencent.mm.vfs.b(localb1, aa.cVa());
      if ((localb2.exists()) && (localb1.exists()))
      {
        AppMethodBeat.o(91325);
      }
      else
      {
        AppMethodBeat.o(91325);
        bool = false;
      }
    }
  }

  private void copyTemplateFile(boolean paramBoolean)
  {
    AppMethodBeat.i(91321);
    int[] arrayOfInt = new int[2];
    int[] tmp10_9 = arrayOfInt;
    tmp10_9[0] = 0;
    int[] tmp14_10 = tmp10_9;
    tmp14_10[1] = 1;
    tmp14_10;
    String[] arrayOfString = new String[2];
    for (int i = 0; i < 2; i++)
      arrayOfString[i] = aa.Ia(arrayOfInt[i]);
    Assert.assertEquals(2, 2);
    i = 0;
    if (i < 2)
    {
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(arrayOfString[i]);
      ab.i("MicroMsg.WebSearch.PluginWebSearch", "copy to path %s, type %d", new Object[] { com.tencent.mm.vfs.j.w(localb.dMD()), Integer.valueOf(arrayOfInt[i]) });
      aa.HZ(arrayOfInt[i]);
      int j = aa.HV(arrayOfInt[i]);
      if (paramBoolean)
      {
        int k = aa.HT(arrayOfInt[i]);
        ab.i("MicroMsg.WebSearch.PluginWebSearch", "need update assetVersion=%d currentVersion=%d type=%d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(arrayOfInt[i]) });
        if (j < k)
        {
          com.tencent.mm.vfs.e.N(com.tencent.mm.vfs.j.w(localb.mUri), true);
          aa.a(localb, arrayOfInt[i]);
        }
      }
      while (true)
      {
        if ((arrayOfInt[i] == 0) && (!aa.HS(arrayOfInt[i])))
        {
          ab.i("MicroMsg.WebSearch.PluginWebSearch", "copyTemplateFile check md5 fail, try once");
          com.tencent.mm.vfs.e.N(com.tencent.mm.vfs.j.w(localb.mUri), true);
          aa.a(localb, arrayOfInt[i], true);
        }
        i++;
        break;
        if ((j == 1) || (aa.cVi()))
        {
          ab.i("MicroMsg.WebSearch.PluginWebSearch", "need init template");
          com.tencent.mm.vfs.e.N(com.tencent.mm.vfs.j.w(localb.mUri), true);
          aa.a(localb, arrayOfInt[i]);
        }
        else
        {
          ab.i("MicroMsg.WebSearch.PluginWebSearch", "currentVersion=%d", new Object[] { Integer.valueOf(j) });
        }
      }
    }
    com.tencent.mm.vfs.e.N(com.tencent.mm.vfs.j.w(new com.tencent.mm.vfs.b(com.tencent.mm.compatible.util.e.eSn, "fts").mUri), true);
    AppMethodBeat.o(91321);
  }

  private void initTemplateFoldByResUpdate(com.tencent.mm.vfs.b paramb, int paramInt)
  {
    AppMethodBeat.i(91322);
    initTemplateFoldByResUpdate(paramb, paramInt, false);
    AppMethodBeat.o(91322);
  }

  private void initTemplateFoldByResUpdate(com.tencent.mm.vfs.b paramb, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(91323);
    Object localObject1 = "";
    Object localObject2 = "";
    int i = -1;
    switch (paramInt)
    {
    default:
      if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil((String)localObject2)))
      {
        ab.w("MicroMsg.WebSearch.PluginWebSearch", "initTemplateFoldByResUpdate templatePath nil! subtype:%d, resFile:%s", new Object[] { Integer.valueOf(paramInt), com.tencent.mm.vfs.j.w(paramb.dMD()) });
        AppMethodBeat.o(91323);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
      while (true)
      {
        return;
        localObject1 = aa.Ia(0);
        localObject2 = aa.HY(0);
        i = 0;
        break;
        localObject1 = aa.Ia(1);
        localObject2 = aa.HY(1);
        i = 1;
        break;
        localObject1 = new com.tencent.mm.vfs.b((String)localObject1);
        com.tencent.mm.vfs.e.N(com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).mUri), true);
        ((com.tencent.mm.vfs.b)localObject1).mkdirs();
        com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b((com.tencent.mm.vfs.b)localObject1, ".nomedia");
        if (!localb.exists());
        try
        {
          localb.createNewFile();
          localObject2 = new com.tencent.mm.vfs.b((String)localObject2);
          com.tencent.mm.vfs.e.y(com.tencent.mm.vfs.j.w(paramb.dMD()), com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject2).dMD()));
          j = bo.hU(com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject2).dMD()), ((com.tencent.mm.vfs.b)localObject2).getParent());
          if (j < 0)
          {
            ab.e("MicroMsg.WebSearch.PluginWebSearch", "unzip fail, ret = " + j + ", zipFilePath = " + com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject2).dMD()) + ", unzipPath = " + ((com.tencent.mm.vfs.b)localObject2).getParent());
            if ((paramBoolean) || (i != 0) || (aa.HS(i)))
              break label458;
            ab.i("MicroMsg.WebSearch.PluginWebSearch", "initTemplateFoldByResUpdate fail, try again , ftsTemplateFolder %s, type %d", new Object[] { localObject1, Integer.valueOf(i) });
            paramBoolean = true;
          }
        }
        catch (IOException localIOException)
        {
          int j;
          while (true)
            ab.printErrStackTrace("MicroMsg.WebSearch.PluginWebSearch", localIOException, "create nomedia file error", new Object[0]);
          switch (paramInt)
          {
          default:
            j = 1;
          case 1:
          case 2:
          }
          while (true)
          {
            ns localns = new ns();
            com.tencent.mm.sdk.b.a.xxA.m(localns);
            ab.i("MicroMsg.WebSearch.PluginWebSearch", "Unzip Path%s version=%d", new Object[] { ((com.tencent.mm.vfs.b)localObject2).getParent(), Integer.valueOf(j) });
            break;
            aa.HZ(0);
            j = aa.HV(0);
            continue;
            aa.HZ(1);
            j = aa.HV(1);
          }
          label458: AppMethodBeat.o(91323);
        }
      }
  }

  private static void reportIdKey649ForLook(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91324);
    if (paramInt1 == 2)
      an.Il(paramInt2);
    AppMethodBeat.o(91324);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return cbO;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(91318);
    super.configure(paramg);
    this.tZa = new a();
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.websearch.api.e.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.websearch.b.b()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.websearch.api.j.class, new com.tencent.mm.kernel.c.e(this.tZa));
    com.tencent.mm.kernel.g.a(n.class, new com.tencent.mm.kernel.c.e(new c()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.websearch.api.h.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.websearch.widget.b()));
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.websearch.api.p.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.websearch.widget.c()));
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
    {
      this.tZb = new b();
      com.tencent.mm.kernel.g.a(m.class, new com.tencent.mm.kernel.c.e(this.tZb));
    }
    AppMethodBeat.o(91318);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void installed()
  {
    AppMethodBeat.i(91317);
    super.installed();
    AppMethodBeat.o(91317);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(91319);
    this.gyU.dnU();
    this.iDB.dnU();
    this.kTy.dnU();
    b.init();
    com.tencent.mm.sdk.g.d.post(new PluginWebSearch.a(this, paramc.eKe), "CopySearchTemplateTask");
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("mmsearch_reddot_new", this.sAp);
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
      com.tencent.mm.kernel.g.RS().m(new PluginWebSearch.3(this), 2000L);
    AppMethodBeat.o(91319);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(91320);
    this.gyU.dead();
    this.iDB.dead();
    this.kTy.dead();
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("mmsearch_reddot_new", this.sAp);
    com.tencent.mm.plugin.websearch.api.ai.uaA = null;
    AppMethodBeat.o(91320);
  }

  public void parallelsDependency()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.PluginWebSearch
 * JD-Core Version:    0.6.2
 */