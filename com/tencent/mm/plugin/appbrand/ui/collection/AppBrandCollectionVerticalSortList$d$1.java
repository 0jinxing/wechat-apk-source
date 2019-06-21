package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.c;
import com.tencent.mm.plugin.appbrand.appusage.f.b;
import com.tencent.mm.plugin.appbrand.appusage.z.b;
import com.tencent.mm.plugin.appbrand.report.e;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionVerticalSortList$onActivityCreated$1$1", "Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandCollectionStorageExport$ReorderCallback;", "onInsert", "", "info", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "onRemoved", "onReorderEnd", "plugin-appbrand-integration_release"})
public final class AppBrandCollectionVerticalSortList$d$1 extends f.b
{
  public final void axa()
  {
    AppMethodBeat.i(135044);
    ab.i("MicroMsg.AppBrandCollectionVerticalSortList", "[collection]reorder callback entered");
    ((c)g.K(c.class)).a(z.b.haB);
    FragmentActivity localFragmentActivity = this.iLt.iLs.getActivity();
    if (localFragmentActivity != null)
    {
      localFragmentActivity.finish();
      AppMethodBeat.o(135044);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135044);
    }
  }

  public final void b(LocalUsageInfo paramLocalUsageInfo)
  {
    AppMethodBeat.i(135042);
    j.p(paramLocalUsageInfo, "info");
    Object localObject = this.iLt.iLs.getArguments();
    int i;
    if (localObject != null)
    {
      i = ((Bundle)localObject).getInt("KEY_OPERATE_REPORT_SCENE");
      localObject = this.iLt.iLs.getArguments();
      if (localObject == null)
        break label74;
    }
    label74: for (localObject = ((Bundle)localObject).getString("KEY_OPERATE_REPORT_SCENE_ID"); ; localObject = null)
    {
      e.a(paramLocalUsageInfo, 6, i, (String)localObject);
      AppMethodBeat.o(135042);
      return;
      i = 0;
      break;
    }
  }

  public final void d(LocalUsageInfo paramLocalUsageInfo)
  {
    AppMethodBeat.i(135043);
    j.p(paramLocalUsageInfo, "info");
    Object localObject = this.iLt.iLs.getArguments();
    int i;
    if (localObject != null)
    {
      i = ((Bundle)localObject).getInt("KEY_OPERATE_REPORT_SCENE");
      localObject = this.iLt.iLs.getArguments();
      if (localObject == null)
        break label74;
    }
    label74: for (localObject = ((Bundle)localObject).getString("KEY_OPERATE_REPORT_SCENE_ID"); ; localObject = null)
    {
      e.a(paramLocalUsageInfo, 7, i, (String)localObject);
      AppMethodBeat.o(135043);
      return;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList.d.1
 * JD-Core Version:    0.6.2
 */