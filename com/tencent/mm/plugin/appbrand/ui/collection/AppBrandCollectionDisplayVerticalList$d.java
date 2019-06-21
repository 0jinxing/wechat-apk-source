package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class AppBrandCollectionDisplayVerticalList$d
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandCollectionDisplayVerticalList$d(AppBrandCollectionDisplayVerticalList paramAppBrandCollectionDisplayVerticalList)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(135010);
    if (this.iLg.getActivity() == null)
    {
      AppMethodBeat.o(135010);
      return true;
    }
    paramMenuItem = AppBrandCollectionSortUI.iLo;
    paramMenuItem = this.iLg.getActivity();
    if (paramMenuItem == null)
      j.dWJ();
    j.o(paramMenuItem, "activity!!");
    Context localContext = (Context)paramMenuItem;
    paramMenuItem = AppBrandCollectionDisplayVerticalList.b(this.iLg);
    if (paramMenuItem == null)
      j.dWJ();
    paramMenuItem = paramMenuItem.iLD;
    int i = AppBrandCollectionDisplayVerticalList.c(this.iLg);
    String str = AppBrandCollectionDisplayVerticalList.d(this.iLg);
    j.p(localContext, "context");
    j.p(paramMenuItem, "dataList");
    j.p(str, "operateReportSceneId");
    Intent localIntent = new Intent(localContext, AppBrandCollectionSortUI.class);
    localIntent.putExtra("KEY_SORT_DATA_LIST", (Serializable)paramMenuItem);
    localIntent.putExtra("KEY_OPERATE_REPORT_SCENE", i);
    localIntent.putExtra("KEY_OPERATE_REPORT_SCENE_ID", str);
    if ((localContext instanceof Activity));
    for (i = 0; ; i = 268435456)
    {
      localIntent.addFlags(i);
      localContext.startActivity(localIntent);
      paramMenuItem = localContext;
      if (!(localContext instanceof Activity))
        paramMenuItem = null;
      paramMenuItem = (Activity)paramMenuItem;
      if (paramMenuItem != null)
        paramMenuItem.overridePendingTransition(2131034125, 2131034130);
      AppBrandCollectionDisplayVerticalList.e(this.iLg);
      AppMethodBeat.o(135010);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.d
 * JD-Core Version:    0.6.2
 */