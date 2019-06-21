package com.tencent.mm.plugin.appbrand.page;

import a.l;
import android.view.View;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.jsapi.f;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;
import com.tencent.mm.plugin.appbrand.jsapi.f.e;
import com.tencent.mm.plugin.appbrand.jsapi.g;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa;", "Lcom/tencent/mm/plugin/appbrand/AppBrandComponentWxaShared;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentViewLifecycleStore;", "()V", "addOnBackPressedListener", "", "p0", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentViewLifecycleStore$OnBackPressedListener;", "kotlin.jvm.PlatformType", "addOnBackgroundListener", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentViewLifecycleStore$OnBackgroundListener;", "addOnDestroyListener", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentViewLifecycleStore$OnDestroyListener;", "addOnForegroundListener", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentViewLifecycleStore$OnForegroundListener;", "addOnReadyListener", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentViewLifecycleStore$OnReadyListener;", "addOnWillDisappearListener", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentViewLifecycleStore$OnWillDisappearListener;", "callOnBackPressed", "", "callOnViewWillDisappear", "callPageOnBackground", "callPageOnDestroy", "callPageOnForeground", "callPageOnReady", "getContentView", "Landroid/view/View;", "hide", "post", "block", "Lkotlin/Function0;", "runnable", "Ljava/lang/Runnable;", "removeAllLifecycleListeners", "removeOnBackPressedListener", "removeOnBackgroundListener", "removeOnDestroyListener", "removeOnForegroundListener", "removeOnReadyListener", "removeOnWillDisappearListener", "show", "luggage-wxa-app_release"})
public abstract class b extends d
  implements f
{
  public final void a(f.b paramb)
  {
    this.iqN.a(paramb);
  }

  public final void a(f.c paramc)
  {
    this.iqN.a(paramc);
  }

  public final void a(f.d paramd)
  {
    this.iqN.a(paramd);
  }

  public final void a(f.e parame)
  {
    this.iqN.a(parame);
  }

  public final void b(f.b paramb)
  {
    this.iqN.b(paramb);
  }

  public final void b(f.c paramc)
  {
    this.iqN.b(paramc);
  }

  public final void b(f.d paramd)
  {
    this.iqN.b(paramd);
  }

  public final void b(f.e parame)
  {
    this.iqN.b(parame);
  }

  public final void f(Runnable paramRunnable)
  {
    View localView = getContentView();
    if (localView != null)
      localView.post(paramRunnable);
  }

  public abstract View getContentView();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.b
 * JD-Core Version:    0.6.2
 */