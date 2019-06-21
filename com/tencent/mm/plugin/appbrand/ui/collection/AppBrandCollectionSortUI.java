package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "finish", "", "getLayoutId", "", "initActivityCloseAnimation", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "plugin-appbrand-integration_release"})
@com.tencent.mm.kernel.i
@a(3)
public final class AppBrandCollectionSortUI extends MMActivity
{
  public static final a iLo;

  static
  {
    AppMethodBeat.i(135039);
    iLo = new a((byte)0);
    AppMethodBeat.o(135039);
  }

  public final void finish()
  {
    AppMethodBeat.i(135038);
    Intent localIntent = getIntent();
    if (localIntent != null)
      localIntent.putExtra("MMActivity.OverrideExitAnimation", 2131034126);
    localIntent = getIntent();
    if (localIntent != null)
      localIntent.putExtra("MMActivity.OverrideEnterAnimation", 2131034130);
    super.finish();
    overridePendingTransition(2131034130, 2131034126);
    AppMethodBeat.o(135038);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initActivityCloseAnimation()
  {
  }

  public final void onCreate(Bundle paramBundle)
  {
    String str = null;
    AppMethodBeat.i(135036);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle != null);
    for (paramBundle = paramBundle.getParcelableArrayListExtra("KEY_SORT_DATA_LIST"); (paramBundle == null) || (paramBundle.isEmpty()); paramBundle = null)
    {
      super.finish();
      AppMethodBeat.o(135036);
      return;
    }
    overridePendingTransition(2131034125, 2131034130);
    xE(-855310);
    getContentView().setBackgroundColor(dyd());
    m localm = getSupportFragmentManager().beginTransaction();
    Object localObject = AppBrandCollectionVerticalSortList.iLr;
    localObject = getIntent();
    if (localObject != null);
    for (int i = ((Intent)localObject).getIntExtra("KEY_OPERATE_REPORT_SCENE", 0); ; i = 0)
    {
      localObject = getIntent();
      if (localObject != null)
        str = ((Intent)localObject).getStringExtra("KEY_OPERATE_REPORT_SCENE_ID");
      j.p(paramBundle, "list");
      AppBrandCollectionVerticalSortList localAppBrandCollectionVerticalSortList = new AppBrandCollectionVerticalSortList();
      localObject = new Bundle(1);
      ((Bundle)localObject).putParcelableArrayList("KEY_SORT_DATA_LIST", paramBundle);
      ((Bundle)localObject).putInt("KEY_OPERATE_REPORT_SCENE", i);
      ((Bundle)localObject).putString("KEY_OPERATE_REPORT_SCENE_ID", str);
      localAppBrandCollectionVerticalSortList.setArguments((Bundle)localObject);
      localm.b(16908290, (Fragment)localAppBrandCollectionVerticalSortList).commit();
      AppMethodBeat.o(135036);
      break;
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(135037);
    super.onResume();
    setMMTitle(2131296799);
    dyb();
    AppMethodBeat.o(135037);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI$Companion;", "", "()V", "KEY_OPERATE_REPORT_SCENE", "", "KEY_OPERATE_REPORT_SCENE_ID", "KEY_SORT_DATA_LIST", "startSortList", "", "context", "Landroid/content/Context;", "dataList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "Lkotlin/collections/ArrayList;", "operateReportScene", "", "operateReportSceneId", "plugin-appbrand-integration_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionSortUI
 * JD-Core Version:    0.6.2
 */