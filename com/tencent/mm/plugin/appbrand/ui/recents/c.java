package com.tencent.mm.plugin.appbrand.ui.recents;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.a;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherHeaderRecentsEntrance;", "Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance;", "Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandUsageStorage;", "activity", "Landroid/app/Activity;", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/app/Activity;Landroid/view/ViewGroup;)V", "getTitle", "", "onClick", "", "v", "Landroid/view/View;", "queryList", "", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "shouldShowcaseEnableSwitch", "show", "", "plugin-appbrand-integration_release"})
public final class c extends d<w>
{
  public c(Activity paramActivity, ViewGroup paramViewGroup)
  {
    super(w.class, paramActivity, paramViewGroup);
  }

  protected final List<? extends LocalUsageInfo> aNk()
  {
    AppMethodBeat.i(135130);
    List localList = (List)((w)f.E(w.class)).nD(this.iMb);
    AppMethodBeat.o(135130);
    return localList;
  }

  public final void eH(boolean paramBoolean)
  {
    AppMethodBeat.i(135129);
    this.iMd.post((Runnable)new c.a(this, paramBoolean));
    AppMethodBeat.o(135129);
  }

  protected final String getTitle()
  {
    AppMethodBeat.i(135131);
    String str = getActivity().getString(2131296800);
    j.o(str, "activity.getString(com.t…eader_recent_tag_wording)");
    AppMethodBeat.o(135131);
    return str;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(135132);
    paramView = AppBrandLauncherFolderUI.iGG;
    paramView = getActivity();
    j.o(paramView, "activity");
    Context localContext = (Context)paramView;
    paramView = new Intent();
    paramView.putExtra("extra_get_usage_reason", 3);
    AppBrandLauncherFolderUI.a.o(localContext, paramView);
    AppMethodBeat.o(135132);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.c
 * JD-Core Version:    0.6.2
 */