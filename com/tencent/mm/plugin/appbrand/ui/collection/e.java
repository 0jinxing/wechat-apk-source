package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.ae;
import com.tencent.mm.plugin.appbrand.appusage.ae.a;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment;
import com.tencent.mm.plugin.appbrand.ui.a.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionFolderActivityContext;", "Lcom/tencent/mm/plugin/appbrand/ui/launcher/FolderActivityContextWithLifecycle;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "activity", "Lcom/tencent/mm/ui/MMActivity;", "(Lcom/tencent/mm/ui/MMActivity;)V", "TAG", "", "onActivityDidCreate", "", "intent", "Landroid/content/Intent;", "onActivityDidResume", "onActivityWillDestroy", "onNotifyChange", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "showListPage", "showList", "", "plugin-appbrand-integration_release"})
public final class e extends a
  implements k.a
{
  private final String TAG;

  public e(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
    AppMethodBeat.i(135099);
    this.TAG = "CollectionFolderActivityContext";
    AppMethodBeat.o(135099);
  }

  public final void N(Intent paramIntent)
  {
    AppMethodBeat.i(135096);
    View localView = aNg().findViewById(16908290);
    if (localView != null)
      localView.setBackgroundColor(-855310);
    eE(true);
    if (paramIntent != null)
    {
      int i = paramIntent.getIntExtra("extra_get_usage_reason", 7);
      int j = paramIntent.getIntExtra("extra_get_usage_prescene", 0);
      paramIntent = ae.haH;
      ae.a.cP(i, j);
      AppMethodBeat.o(135096);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135096);
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(135094);
    paramString = com.tencent.mm.kernel.g.K(af.class);
    j.o(paramString, "MMKernel.service(IAppBra…ctionStorage::class.java)");
    if (((af)paramString).getCount() > 0)
      aNg().runOnUiThread((Runnable)new e.a(this));
    AppMethodBeat.o(135094);
  }

  public final void eE(boolean paramBoolean)
  {
    AppMethodBeat.i(135095);
    Object localObject1 = aNg();
    j.o(localObject1, "activity");
    if (((MMActivity)localObject1).isFinishing())
    {
      AppMethodBeat.o(135095);
      return;
    }
    if (paramBoolean);
    Object localObject2;
    for (localObject1 = AppBrandCollectionDisplayVerticalList.class; ; localObject1 = AppBrandLauncherBlankPage.class)
    {
      localObject2 = aNg();
      j.o(localObject2, "activity");
      if (!((Class)localObject1).isInstance(((MMActivity)localObject2).getSupportFragmentManager().findFragmentById(16908290)))
        break label77;
      AppMethodBeat.o(135095);
      break;
    }
    label77: aNg().removeAllOptionMenu();
    label95: int i;
    if (paramBoolean)
    {
      aNg().dyc();
      localObject1 = aNg();
      j.o(localObject1, "activity");
      localObject2 = ((MMActivity)localObject1).getSupportFragmentManager().beginTransaction();
      if (!paramBoolean)
        break label294;
      localObject1 = (AppBrandLauncherUI.Fragment)new AppBrandCollectionDisplayVerticalList();
      label129: ((android.support.v4.app.m)localObject2).b(16908290, (Fragment)localObject1).commitAllowingStateLoss();
      localObject1 = (af)com.tencent.mm.kernel.g.K(af.class);
      localObject2 = aNg();
      if (localObject2 != null)
      {
        localObject2 = ((MMActivity)localObject2).getIntent();
        if (localObject2 != null)
        {
          i = ((Intent)localObject2).getIntExtra("extra_enter_scene", -1);
          ab.i(this.TAG, "EnterScene = ".concat(String.valueOf(i)));
        }
      }
      switch (i)
      {
      case 2:
      default:
        label228: if (!paramBoolean)
        {
          k.a locala = (k.a)this;
          localObject2 = com.tencent.mm.plugin.appbrand.r.m.aNS();
          j.o(localObject2, "ThreadUtil.getWorkerThread()");
          ((af)localObject1).a(locala, ((al)localObject2).getLooper());
        }
        break;
      case 1:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      if (paramBoolean)
      {
        h.b(com.tencent.mm.plugin.appbrand.task.g.iFf);
        h.b(com.tencent.mm.plugin.appbrand.task.g.iFg);
      }
      AppMethodBeat.o(135095);
      break;
      aNg().dyb();
      break label95;
      label294: localObject1 = (AppBrandLauncherUI.Fragment)AppBrandLauncherBlankPage.cO(aNg().getString(2131296799), aNg().getString(2131296581));
      break label129;
      c.pG(i);
      break label228;
      ((af)localObject1).d((k.a)this);
    }
  }

  public final void onActivityDidResume()
  {
    AppMethodBeat.i(135097);
    aNg().setMMTitle(2131296799);
    AppMethodBeat.o(135097);
  }

  public final void onActivityWillDestroy()
  {
    AppMethodBeat.i(135098);
    super.onActivityWillDestroy();
    ((af)com.tencent.mm.kernel.g.K(af.class)).d((k.a)this);
    AppMethodBeat.o(135098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.e
 * JD-Core Version:    0.6.2
 */