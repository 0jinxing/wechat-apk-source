package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "event", "", "kotlin.jvm.PlatformType", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "onNotifyChange"})
final class AppBrandLauncherCollectionList$c
  implements k.a
{
  AppBrandLauncherCollectionList$c(AppBrandLauncherCollectionList paramAppBrandLauncherCollectionList)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(135054);
    if (("batch".equals(paramString)) && (3 == paramm.hsh) && ((paramm.obj instanceof Long)));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.iLx.runOnUiThread((Runnable)new AppBrandLauncherCollectionList.c.1(this));
        AppBrandLauncherCollectionList.a(this.iLx, (a)new AppBrandLauncherCollectionList.c.2(this));
      }
      AppMethodBeat.o(135054);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList.c
 * JD-Core Version:    0.6.2
 */