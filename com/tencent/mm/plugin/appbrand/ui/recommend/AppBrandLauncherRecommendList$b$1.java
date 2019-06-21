package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandLauncherRecommendList$uiLogic$2$1", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;", "contentView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getContentView", "()Landroid/view/View;", "headerViewText", "", "getHeaderViewText", "()Ljava/lang/String;", "needHeader", "", "getNeedHeader", "()Z", "postOnUiThread", "", "runnable", "Ljava/lang/Runnable;", "plugin-appbrand-integration_release"})
public final class AppBrandLauncherRecommendList$b$1 extends g
{
  private final boolean fsQ = true;

  AppBrandLauncherRecommendList$b$1(Activity paramActivity)
  {
    super(localActivity);
  }

  public final String aNB()
  {
    AppMethodBeat.i(135140);
    String str = this.iPw.iPu.getString(2131305811);
    j.o(str, "this@AppBrandLauncherRec…header_text_all_use_hint)");
    AppMethodBeat.o(135140);
    return str;
  }

  public final boolean aNC()
  {
    return this.fsQ;
  }

  public final View getContentView()
  {
    AppMethodBeat.i(135141);
    View localView = this.iPw.iPu.getContentView();
    AppMethodBeat.o(135141);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandLauncherRecommendList.b.1
 * JD-Core Version:    0.6.2
 */