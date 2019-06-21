package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.l;
import a.v;
import a.y;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.m;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.appbrand.appusage.a.c;
import com.tencent.mm.plugin.appbrand.appusage.a.d;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.ui.recents.e;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "adapter", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;", "getAdapter", "()Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;", "appBrandRomLogic", "Lcom/tencent/mm/plugin/appbrand/appusage/recommend/AppBrandRecommendLogic;", "getAppBrandRomLogic", "()Lcom/tencent/mm/plugin/appbrand/appusage/recommend/AppBrandRecommendLogic;", "appBrandRomLogic$delegate", "Lkotlin/Lazy;", "collectionStorageListener", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dataProcessThread", "Lcom/tencent/mm/sdk/platformtools/MMHandlerThread;", "exposeTimeMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getExposeTimeMap", "()Ljava/util/HashMap;", "headerViewText", "getHeaderViewText", "()Ljava/lang/String;", "insertList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getInsertList", "()Ljava/util/ArrayList;", "layoutMgr", "Landroid/support/v7/widget/LinearLayoutManager;", "listFooterController", "Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter;", "getListFooterController", "()Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter;", "listFooterController$delegate", "loadStateObj", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$LoadStateObj;", "mListHeaderController", "Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderControllerForRecommend;", "needHeader", "", "getNeedHeader", "()Z", "pos2exposeTimeMap", "getPos2exposeTimeMap", "recommendCardList", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "getRecommendCardList", "()Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "recommendCardList$delegate", "recommendReport", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendReport;", "removeList", "getRemoveList", "scrollListener", "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$scrollListener$1", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$scrollListener$1;", "showMenuCallback", "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$showMenuCallback$1", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$showMenuCallback$1;", "wxaAttrsStorageListener", "calExposeTime", "", "list", "clear", "fetchPageData", "loadFromMemory", "handleHeaderClick", "initData", "initFooter", "initHeader", "initHeaderTagView", "initStateObj", "initView", "onCreate", "onDestroy", "onDestroyView", "onFetchPageFail", "onFetchPageSuccess", "remainCount", "result", "onPause", "onResume", "postOnUiThread", "runnable", "Ljava/lang/Runnable;", "refreshData", "strategy", "removeStorageListeners", "resetExposeTime", "runOnWorkThread", "action", "Lkotlin/Function0;", "setAdapterClickListener", "setupStorageListeners", "syncAttr", "userNameList", "", "updateListData", "Companion", "LoadStateObj", "plugin-appbrand-integration_release"})
public abstract class g
  implements LifecycleObserver
{
  private static final String TAG = "MicroMsg.Recommend.AppBrandRecommendUILogic";
  public static final g.a iQy = new g.a((byte)0);
  final Activity activity;
  final Context context;
  private final a.f iQh;
  private final a.f iQi;
  private final al iQj;
  final a iQk;
  final g.b iQl;
  final LinearLayoutManager iQm;
  final com.tencent.mm.plugin.appbrand.ui.recents.g iQn;
  final f iQo;
  private final a.f iQp;
  private final k.a iQq;
  private final k.a iQr;
  final ArrayList<Integer> iQs;
  final ArrayList<Integer> iQt;
  final HashMap<String, Long> iQu;
  final HashMap<Integer, String> iQv;
  final g.l iQw;
  private final g.p iQx;

  public g(Activity paramActivity)
  {
    this.activity = paramActivity;
    paramActivity = this.activity;
    if (paramActivity == null)
      throw new v("null cannot be cast to non-null type android.content.Context");
    this.context = ((Context)paramActivity);
    this.iQh = a.g.g((a.f.a.a)new g.j(this));
    this.iQi = a.g.g((a.f.a.a)g.c.iQB);
    this.iQj = new al("AppBrandLauncherUI#AppBrandLauncherRecommendsList");
    this.iQk = new a(this.activity);
    this.iQl = new g.b(this);
    this.iQm = ((LinearLayoutManager)new j(this.context));
    this.iQn = new com.tencent.mm.plugin.appbrand.ui.recents.g(this.activity, (ViewGroup)aNL());
    this.iQo = new f();
    this.iQp = a.g.g((a.f.a.a)new g.i(this));
    this.iQq = ((k.a)new g.d(this));
    this.iQr = ((k.a)new g.r(this));
    this.iQs = new ArrayList();
    this.iQt = new ArrayList();
    this.iQu = new HashMap();
    this.iQv = new HashMap();
    this.iQw = new g.l(this);
    this.iQx = new g.p(this);
  }

  private final void c(ArrayList<Integer> paramArrayList, boolean paramBoolean)
  {
    Iterator localIterator = paramArrayList.iterator();
    label145: 
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (localInteger == null);
      while (true)
      {
        if (!this.iQv.containsKey(localInteger))
          break label145;
        String str = (String)this.iQv.get(localInteger);
        Long localLong = (Long)((Map)this.iQu).get(str);
        if ((str == null) || (localLong == null))
          break;
        long l = System.currentTimeMillis() - localLong.longValue();
        ab.d(TAG, "exposure index: %d, exposureTime:%d", new Object[] { localInteger, Long.valueOf(l) });
        this.iQo.y(str, l);
        break;
        if (localInteger.intValue() == 0)
          break;
      }
    }
    if (paramBoolean)
      paramArrayList.clear();
  }

  private final void d(a.f.a.a<y> parama)
  {
    this.iQj.ae((Runnable)new g.k(parama));
  }

  public abstract String aNB();

  public abstract boolean aNC();

  public final LoadMoreRecyclerView aNL()
  {
    return (LoadMoreRecyclerView)this.iQh.getValue();
  }

  final d aNM()
  {
    return (d)this.iQi.getValue();
  }

  public final e aNN()
  {
    return (e)this.iQp.getValue();
  }

  final void eL(boolean paramBoolean)
  {
    h.a(this, true);
    h.b(this, true);
    d((a.f.a.a)new g.e(this, paramBoolean));
  }

  public abstract View getContentView();

  @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
  public final void onCreate()
  {
    ab.i(TAG, "onCreate");
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
  public final void onDestroy()
  {
    ab.i(TAG, "onDestroy");
    ((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).d(this.iQq);
    com.tencent.mm.plugin.appbrand.app.f.auO().d(this.iQr);
    this.iQs.clear();
    this.iQt.clear();
    this.iQu.clear();
    this.iQv.clear();
    this.iQo.gu(aNM().hbj);
    d locald = aNM();
    if (!aNM().axY().isEmpty());
    for (boolean bool = true; ; bool = false)
    {
      locald.hbn = bool;
      aNM().hbo = 0;
      locald = aNM();
      locald.hbh.a(null);
      locald.hbs = null;
      return;
    }
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
  public final void onDestroyView()
  {
    this.iQj.quit();
    this.iQn.onDetached();
    aNN().onDetached();
    aNL().b((RecyclerView.m)this.iQw);
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
  public final void onPause()
  {
    ab.i(TAG, "onPause");
    c(this.iQs, false);
    this.iQo.aNJ();
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
  public final void onResume()
  {
    ab.i(TAG, "onResume");
    this.iQo.aNI();
    Iterator localIterator = this.iQs.iterator();
    label121: 
    while (localIterator.hasNext())
    {
      Object localObject = (Integer)localIterator.next();
      if (localObject == null);
      while (true)
      {
        if (!this.iQv.containsKey(localObject))
          break label121;
        String str = (String)this.iQv.get(localObject);
        localObject = (Long)((Map)this.iQu).get(str);
        if ((str == null) || (localObject == null))
          break;
        this.iQu.put(str, Long.valueOf(System.currentTimeMillis()));
        break;
        if (((Integer)localObject).intValue() == 0)
          break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.g
 * JD-Core Version:    0.6.2
 */