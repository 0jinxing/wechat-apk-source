package com.tencent.mm.plugin.appbrand.appusage;

import a.l;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.c.b;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import junit.framework.Assert;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport;", "Lcom/tencent/mm/sdk/storage/MStorage;", "Lcom/tencent/mm/plugin/appbrand/appusage/IAppBrandCollectionStorage;", "Lcom/tencent/mm/kernel/service/IServiceLifeCycle;", "()V", "mCalculatingDiff", "Ljava/util/concurrent/atomic/AtomicBoolean;", "add", "", "listener", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "looper", "Landroid/os/Looper;", "addCollection", "", "username", "", "versionType", "getCount", "getCountLimit", "isCollection", "", "onRegister", "onUnregister", "query", "", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "count", "order", "Lcom/tencent/mm/plugin/appbrand/appusage/IAppBrandCollectionStorage$ORDER;", "refreshOnPullDownOpen", "remove", "removeCollection", "reorder", "reorderList", "reason", "reorderWithCallback", "", "callback", "Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport$ReorderCallback;", "Companion", "ReorderCallback", "plugin-appbrand-integration_release"})
public final class f extends k
  implements b, af
{
  private static f gYV;
  public static final a gYW;
  private final AtomicBoolean gYU;

  static
  {
    AppMethodBeat.i(134529);
    gYW = new a((byte)0);
    AppMethodBeat.o(134529);
  }

  public f()
  {
    AppMethodBeat.i(134528);
    this.gYU = new AtomicBoolean(false);
    AppMethodBeat.o(134528);
  }

  public final void SH()
  {
    gYV = (f)this;
  }

  public final void SI()
  {
    gYV = null;
  }

  public final List<? extends LocalUsageInfo> a(int paramInt, af.a parama)
  {
    AppMethodBeat.i(134522);
    if (paramInt <= 0)
    {
      parama = null;
      AppMethodBeat.o(134522);
    }
    while (true)
    {
      return parama;
      parama = (List)((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).b(paramInt, parama);
      AppMethodBeat.o(134522);
    }
  }

  public final void a(k.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(134526);
    ((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).a(parama, paramLooper);
    com.tencent.mm.plugin.appbrand.app.f.auO().a(parama, paramLooper);
    AppMethodBeat.o(134526);
  }

  public final boolean a(List<? extends LocalUsageInfo> paramList, f.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(134519);
    if (paramList == null)
    {
      if (bp.dpL())
        Assert.assertTrue("reorderList is NULL", false);
    }
    else
    {
      this.gYU.set(true);
      paramList = (Runnable)new f.e(this, paramList, paramb);
      if (!al.isMainThread())
        break label76;
      m.aNS().aa(paramList);
    }
    while (true)
    {
      AppMethodBeat.o(134519);
      bool = true;
      while (true)
      {
        return bool;
        AppMethodBeat.o(134519);
      }
      label76: paramList.run();
    }
  }

  public final boolean aB(String paramString, int paramInt)
  {
    AppMethodBeat.i(134516);
    Object localObject = (CharSequence)paramString;
    int i;
    boolean bool;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i == 0)
        break label48;
      AppMethodBeat.o(134516);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label48: localObject = (s)com.tencent.mm.plugin.appbrand.app.f.E(s.class);
      if (paramString == null)
        a.f.b.j.dWJ();
      bool = ((s)localObject).aF(paramString, paramInt);
      AppMethodBeat.o(134516);
    }
  }

  public final int aC(String paramString, int paramInt)
  {
    AppMethodBeat.i(134517);
    Object localObject = (CharSequence)paramString;
    int i;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i == 0)
        break label46;
      paramInt = -1;
      AppMethodBeat.o(134517);
    }
    while (true)
    {
      return paramInt;
      i = 0;
      break;
      label46: localObject = (s)com.tencent.mm.plugin.appbrand.app.f.E(s.class);
      if (paramString == null)
        a.f.b.j.dWJ();
      paramInt = ((s)localObject).aG(paramString, paramInt);
      AppMethodBeat.o(134517);
    }
  }

  public final boolean aD(String paramString, int paramInt)
  {
    AppMethodBeat.i(134518);
    Object localObject = (CharSequence)paramString;
    int i;
    boolean bool;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i == 0)
        break label48;
      AppMethodBeat.o(134518);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label48: localObject = (s)com.tencent.mm.plugin.appbrand.app.f.E(s.class);
      if (paramString == null)
        a.f.b.j.dWJ();
      bool = ((s)localObject).aH(paramString, paramInt);
      AppMethodBeat.o(134518);
    }
  }

  public final void awX()
  {
    AppMethodBeat.i(134515);
    if (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED)
      if (this.gYU.get())
      {
        ab.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "refreshOnPullDownOpen, skip fetch when calculating diff");
        AppMethodBeat.o(134515);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "refreshOnPullDownOpen, fetch");
      j.axh().a(bo.anU(), true, null, 6, 0);
      h.b(com.tencent.mm.plugin.appbrand.task.g.iFf);
      h.b(com.tencent.mm.plugin.appbrand.task.g.iFg);
      AppMethodBeat.o(134515);
    }
  }

  public final int awY()
  {
    AppMethodBeat.i(134524);
    int i = t.axI();
    AppMethodBeat.o(134524);
    return i;
  }

  public final void c(k.a parama)
  {
    AppMethodBeat.i(134525);
    a(parama, Looper.getMainLooper());
    AppMethodBeat.o(134525);
  }

  public final void d(k.a parama)
  {
    AppMethodBeat.i(134527);
    ((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).d(parama);
    com.tencent.mm.plugin.appbrand.app.f.auO().d(parama);
    AppMethodBeat.o(134527);
  }

  public final boolean g(List<LocalUsageInfo> paramList, int paramInt)
  {
    AppMethodBeat.i(134521);
    ab.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "reorder reason = ".concat(String.valueOf(paramInt)));
    f.b localb;
    switch (paramInt)
    {
    default:
      localb = null;
    case 1:
    case 0:
    }
    while (true)
    {
      boolean bool = a(paramList, localb);
      AppMethodBeat.o(134521);
      return bool;
      localb = (f.b)new c();
      continue;
      localb = (f.b)new f.d();
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(134523);
    Object localObject = com.tencent.mm.plugin.appbrand.app.f.E(s.class);
    a.f.b.j.o(localObject, "SubCoreAppBrand.getStora…arAppStorage::class.java)");
    int i = ((s)localObject).axF();
    AppMethodBeat.o(134523);
    return i;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport$Companion;", "", "()V", "STORAGE", "Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport;", "getSTORAGE", "()Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport;", "setSTORAGE", "(Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport;)V", "TAG", "", "plugin-appbrand-integration_release"})
  public static final class a
  {
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport$reorder$callback$1", "Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport$ReorderCallback;", "onReorderEnd", "", "plugin-appbrand-integration_release"})
  public static final class c extends f.b
  {
    public final void axa()
    {
      AppMethodBeat.i(134512);
      ((c)com.tencent.mm.kernel.g.K(c.class)).a(z.b.haA);
      AppMethodBeat.o(134512);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.f
 * JD-Core Version:    0.6.2
 */