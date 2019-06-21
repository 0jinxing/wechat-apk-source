package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.MutableContextWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.g;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.g.a;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mmkv.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewManager;", "", "()V", "TAG", "", "cacheWebView", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebView;", "getCacheWebView$plugin_brandservice_release", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebView;", "setCacheWebView$plugin_brandservice_release", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebView;)V", "contentBuff", "Lcom/tencent/mmkv/NativeBuffer;", "lastCreating", "", "getLastCreating$plugin_brandservice_release", "()J", "setLastCreating$plugin_brandservice_release", "(J)V", "priorityWebView", "", "createWebView", "tmplParams", "Lcom/tencent/mm/plugin/webview/preload/TmplParams;", "delayInitJsAPI", "getNativeBuffer", "size", "", "obtainPreloadTmplWebView", "Lcom/tencent/mm/ui/widget/MMWebView;", "context", "Landroid/content/Context;", "obtainTmplWebView", "preloadWebViewInner", "", "replaceContext", "mmWebView", "tryPreloadTmplWebview", "updateTmplWebview", "type", "contentId", "url", "startLoadPage", "plugin-brandservice_release"})
public final class c
{
  private static final String TAG = "MicroMsg.Preload.PreloadWebviewManager";
  private static d jUA;
  public static final c jUB;
  private static b jUx;
  private static long jUy;
  private static boolean jUz;

  static
  {
    AppMethodBeat.i(15045);
    jUB = new c();
    TAG = "MicroMsg.Preload.PreloadWebviewManager";
    jUA = new d(0L, 0);
    AppMethodBeat.o(15045);
  }

  public static final MMWebView a(Context paramContext, TmplParams paramTmplParams)
  {
    Object localObject = null;
    while (true)
    {
      try
      {
        AppMethodBeat.i(15042);
        j.p(paramContext, "context");
        long l = System.currentTimeMillis();
        if (paramTmplParams == null)
        {
          ab.w(TAG, "[obtainPreloadWebview]tmplParams is null");
          AppMethodBeat.o(15042);
          paramContext = localObject;
          return paramContext;
        }
        ab.v(TAG, "[obtainPreloadWebview]tmplParams:%s", new Object[] { paramTmplParams });
        if ((paramTmplParams.jSV == 0) && (jUx != null))
        {
          paramTmplParams = jUx;
          jUx = null;
          ab.v(TAG, "[obtainPreloadWebview] preloadWebviews");
          if (paramTmplParams == null)
            j.dWJ();
          paramContext = a((MMWebView)paramTmplParams, paramContext);
          paramContext.getPerformanceHelper().aI("onCreateStart", l);
          paramContext.getPerformanceHelper().aI("onCreateEnd", System.currentTimeMillis());
          AppMethodBeat.o(15042);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(15042);
      paramContext = localObject;
    }
  }

  private static MMWebView a(MMWebView paramMMWebView, Context paramContext)
  {
    AppMethodBeat.i(15044);
    j.p(paramMMWebView, "mmWebView");
    j.p(paramContext, "context");
    if ((paramMMWebView.getContext() instanceof MutableContextWrapper))
    {
      Context localContext = paramMMWebView.getContext();
      if (localContext == null)
      {
        paramMMWebView = new v("null cannot be cast to non-null type android.content.MutableContextWrapper");
        AppMethodBeat.o(15044);
        throw paramMMWebView;
      }
      ((MutableContextWrapper)localContext).setBaseContext(paramContext);
    }
    AppMethodBeat.o(15044);
    return paramMMWebView;
  }

  public static final void a(int paramInt, String paramString1, String paramString2, long paramLong)
  {
    try
    {
      AppMethodBeat.i(15040);
      j.p(paramString1, "contentId");
      j.p(paramString2, "url");
      if ((paramInt == 0) && (jUx != null))
      {
        b localb = jUx;
        if (localb == null)
          j.dWJ();
        localb.b(paramString1, paramString2, paramLong, System.currentTimeMillis());
      }
      AppMethodBeat.o(15040);
      return;
    }
    finally
    {
    }
    throw paramString1;
  }

  public static final void aVR()
  {
    AppMethodBeat.i(15037);
    g.a locala = g.jSD;
    if (g.a.aXl())
      AppMethodBeat.o(15037);
    while (true)
    {
      return;
      if (jUz)
      {
        AppMethodBeat.o(15037);
      }
      else
      {
        al.d((Runnable)c.c.jUE);
        AppMethodBeat.o(15037);
      }
    }
  }

  public static void aXR()
  {
    jUy = 0L;
  }

  private final void aXS()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(15039);
        ab.i(TAG, "[preloadWebViewInner]tmplParams");
        if (jUx != null)
        {
          ab.w(TAG, "[preloadWebViewInner] already preinit, ignore");
          AppMethodBeat.o(15039);
          return;
        }
        Object localObject1 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.sx(0);
        jUy = System.currentTimeMillis();
        localObject1 = b((TmplParams)localObject1, false);
        if (localObject1 != null)
        {
          c.b localb = new com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/c$b;
          localb.<init>((b)localObject1);
          ((b)localObject1).c((a.f.a.b)localb);
          AppMethodBeat.o(15039);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(15039);
    }
  }

  private static b b(TmplParams paramTmplParams, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(15041);
    if (paramTmplParams == null)
    {
      ab.w(TAG, "[preloadWebViewInner] tmplParams is null");
      AppMethodBeat.o(15041);
      paramTmplParams = localObject;
    }
    while (true)
    {
      return paramTmplParams;
      if (paramTmplParams.jSV == -1)
      {
        ab.w(TAG, "[preloadWebViewInner] tmplType %d", new Object[] { Integer.valueOf(paramTmplParams.jSV) });
        AppMethodBeat.o(15041);
        paramTmplParams = localObject;
      }
      else if (bo.isNullOrNil(paramTmplParams.jVi))
      {
        ab.w(TAG, "[preloadWebViewInner] initUrl " + paramTmplParams.jVi + " is empty");
        AppMethodBeat.o(15041);
        paramTmplParams = localObject;
      }
      else if (!e.ct(paramTmplParams.upO))
      {
        ab.w(TAG, "[preloadWebViewInner] filePath %s isn't exist", new Object[] { paramTmplParams.upO });
        AppMethodBeat.o(15041);
        paramTmplParams = localObject;
      }
      else
      {
        long l1 = System.currentTimeMillis();
        paramTmplParams = new b((Context)new MutableContextWrapper(ah.getContext()), paramTmplParams, paramBoolean);
        if (paramBoolean)
        {
          jUz = true;
          paramTmplParams.c((a.f.a.b)c.a.jUC);
        }
        long l2 = System.currentTimeMillis();
        ab.v(TAG, "terry performance create tmplWebView:%dms", new Object[] { Long.valueOf(l2 - l1) });
        AppMethodBeat.o(15041);
      }
    }
  }

  public static final MMWebView b(Context paramContext, TmplParams paramTmplParams)
  {
    while (true)
    {
      long l;
      try
      {
        AppMethodBeat.i(15043);
        j.p(paramContext, "context");
        l = System.currentTimeMillis();
        ab.v(TAG, "[obtainTmplWebView]tmplParams:%s", new Object[] { paramTmplParams });
        if (paramTmplParams == null)
        {
          paramContext = TAG;
          j.dWJ();
          ab.w(paramContext, "[preloadWebViewInner] tmplParams %s is null", new Object[] { paramTmplParams.jVi });
          AppMethodBeat.o(15043);
          paramContext = null;
          return paramContext;
        }
        if ((paramTmplParams.jSV == 0) && (jUx != null))
        {
          paramTmplParams = jUx;
          jUx = null;
          ab.v(TAG, "[obtainTmplWebView] preloadWebviews");
          if (paramTmplParams == null)
            j.dWJ();
          paramContext = a((MMWebView)paramTmplParams, paramContext);
          paramContext.getPerformanceHelper().aI("onCreateStart", l);
          paramContext.getPerformanceHelper().aI("onCreateEnd", System.currentTimeMillis());
          AppMethodBeat.o(15043);
          continue;
        }
      }
      finally
      {
      }
      paramTmplParams = b(paramTmplParams, true);
      if (paramTmplParams == null)
      {
        AppMethodBeat.o(15043);
        paramContext = null;
      }
      else
      {
        paramContext = a((MMWebView)paramTmplParams, paramContext);
        paramContext.getPerformanceHelper().aI("onCreateStart", l);
        paramContext.getPerformanceHelper().aI("onCreateEnd", System.currentTimeMillis());
        AppMethodBeat.o(15043);
      }
    }
  }

  public static void p(b paramb)
  {
    jUx = paramb;
  }

  public static final d sA(int paramInt)
  {
    AppMethodBeat.i(15038);
    paramInt = 1048576 * (int)Math.ceil(paramInt / 1048576.0D);
    d locald;
    if (jUA.AiQ == 0L)
    {
      locald = as.createNativeBuffer(paramInt);
      j.o(locald, "MultiProcessMMKV.createNativeBuffer(calcSize)");
      jUA = locald;
    }
    while (true)
    {
      locald = jUA;
      AppMethodBeat.o(15038);
      return locald;
      if (jUA.size < paramInt)
      {
        as.destroyNativeBuffer(jUA);
        locald = as.createNativeBuffer(paramInt);
        j.o(locald, "MultiProcessMMKV.createNativeBuffer(calcSize)");
        jUA = locald;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.c
 * JD-Core Version:    0.6.2
 */