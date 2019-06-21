package com.tencent.mm.plugin.brandservice;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.a.b.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.m;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.storage.s;
import java.util.HashSet;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/BrandServiceImpl;", "Lcom/tencent/mm/plugin/brandservice/api/IBrandService;", "()V", "TAG", "", "bizNativeVideoOpen", "", "getBizNativeVideoOpen", "()Ljava/lang/Boolean;", "setBizNativeVideoOpen", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "preloadLimiter", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getPreloadLimiter", "()Ljava/util/HashSet;", "addToPreload", "", "url", "itemShowType", "", "openScene", "vals", "", "", "(Ljava/lang/String;II[Ljava/lang/Object;)V", "canPreloadIn", "getHardCodeUrl", "isBizNativeVideoOpen", "isBizTimeLineOpen", "isMpUrl", "preCreateWebView", "preloadByIdAndUrls", "items", "", "preloadByInfoIdAndBuffer", "startPreloadWebView", "context", "Landroid/content/Context;", "subScene", "intent", "Landroid/content/Intent;", "openType", "result", "Lcom/tencent/mm/plugin/brandservice/api/IBrandService$PreloadWebViewResult;", "tryPreloadTmplWebview", "plugin-brandservice_release"})
public final class c
  implements com.tencent.mm.plugin.brandservice.a.b
{
  private final String TAG;
  private Boolean jKg;
  private final HashSet<String> jKh;

  public c()
  {
    AppMethodBeat.i(14777);
    this.TAG = "MicroMsg.BrandServiceImpl";
    this.jKh = new HashSet();
    AppMethodBeat.o(14777);
  }

  public final boolean FC(String paramString)
  {
    AppMethodBeat.i(14765);
    boolean bool;
    if (paramString != null)
    {
      bool = m.FC(paramString);
      AppMethodBeat.o(14765);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14765);
    }
  }

  public final void a(String paramString, int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14768);
    j.p(paramArrayOfObject, "vals");
    Object localObject1 = new StringBuilder("addToPreload_");
    if (paramString == null);
    for (Object localObject2 = ""; ; localObject2 = paramString)
    {
      StringBuilder localStringBuilder = ((StringBuilder)localObject1).append((String)localObject2).append('_');
      localObject1 = a.a.e.M(paramArrayOfObject);
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = "";
      localObject2 = localObject2;
      if (this.jKh.contains(localObject2))
        AppMethodBeat.o(14768);
      while (true)
      {
        return;
        this.jKh.add(localObject2);
        long l = System.currentTimeMillis();
        d.xDG.b((Runnable)new c.a(l, paramString, paramInt1, paramInt2, paramArrayOfObject), "tmplPreload");
        AppMethodBeat.o(14768);
      }
    }
  }

  public final boolean a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, Intent paramIntent)
  {
    AppMethodBeat.i(14772);
    j.p(paramContext, "context");
    j.p(paramString, "url");
    j.p(paramIntent, "intent");
    boolean bool = PreloadLogic.a(paramContext, paramString, paramInt1, paramInt2, paramInt3, paramIntent, 0, null, 192);
    AppMethodBeat.o(14772);
    return bool;
  }

  public final boolean a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, b.a parama)
  {
    AppMethodBeat.i(14773);
    j.p(paramContext, "context");
    j.p(paramString, "url");
    j.p(parama, "result");
    boolean bool = PreloadLogic.a(paramContext, paramString, paramInt1, paramInt2, 0, null, paramInt3, parama, 32);
    AppMethodBeat.o(14773);
    return bool;
  }

  public final void aU(List<String[]> paramList)
  {
    AppMethodBeat.i(14770);
    j.p(paramList, "items");
    d.xDG.b((Runnable)new c.c(paramList), "tmplPreload");
    AppMethodBeat.o(14770);
  }

  public final boolean aVO()
  {
    AppMethodBeat.i(14766);
    boolean bool = s.aVO();
    AppMethodBeat.o(14766);
    return bool;
  }

  public final boolean aVP()
  {
    boolean bool = true;
    AppMethodBeat.i(14767);
    if ((f.IS_FLAVOR_RED) || (f.DEBUG))
    {
      AppMethodBeat.o(14767);
      return bool;
    }
    if (this.jKg == null)
      if (((a)g.K(a.class)).a(a.a.lIh, 0) != 1)
        break label118;
    label118: for (bool = true; ; bool = false)
    {
      this.jKg = Boolean.valueOf(bool);
      ab.i(this.TAG, "bizNativeVideoOpen: " + this.jKg);
      Boolean localBoolean = this.jKg;
      if (localBoolean == null)
        j.dWJ();
      bool = localBoolean.booleanValue();
      AppMethodBeat.o(14767);
      break;
    }
  }

  public final String aVQ()
  {
    AppMethodBeat.i(14775);
    String str = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.aXB();
    AppMethodBeat.o(14775);
    return str;
  }

  public final void aVR()
  {
    AppMethodBeat.i(14776);
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.c.aVR();
    AppMethodBeat.o(14776);
  }

  public final void i(List<? extends List<String>> paramList, int paramInt)
  {
    AppMethodBeat.i(14769);
    j.p(paramList, "items");
    d.xDG.b((Runnable)new c.b(paramList, paramInt), "tmplPreload");
    AppMethodBeat.o(14769);
  }

  public final boolean rW(int paramInt)
  {
    AppMethodBeat.i(14771);
    boolean bool = PreloadLogic.rW(paramInt);
    AppMethodBeat.o(14771);
    return bool;
  }

  public final void rX(int paramInt)
  {
    AppMethodBeat.i(14774);
    PreloadLogic.mg(paramInt);
    AppMethodBeat.o(14774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.c
 * JD-Core Version:    0.6.2
 */