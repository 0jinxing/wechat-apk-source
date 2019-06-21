package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.f;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/ui/collection/AppBrandLauncherCollectionList$initView$2", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionDragFeatureView;", "onListMayChanged", "", "onListMayChanged$plugin_appbrand_integration_release", "plugin-appbrand-integration_release"})
public final class AppBrandLauncherCollectionList$b extends b
{
  AppBrandLauncherCollectionList$b(Context paramContext, i parami)
  {
    super(parami, locali);
  }

  public final void aMZ()
  {
    AppMethodBeat.i(135050);
    a locala = AppBrandLauncherCollectionList.a(this.iLx);
    if (locala != null)
    {
      Object localObject = f.gYW;
      localObject = f.awZ();
      if (localObject == null)
        j.dWJ();
      f.a((f)localObject, (List)locala.iLD);
      AppMethodBeat.o(135050);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135050);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList.b
 * JD-Core Version:    0.6.2
 */