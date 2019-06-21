package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "event", "", "kotlin.jvm.PlatformType", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "onNotifyChange"})
final class AppBrandCollectionDisplayVerticalList$b
  implements k.a
{
  AppBrandCollectionDisplayVerticalList$b(AppBrandCollectionDisplayVerticalList paramAppBrandCollectionDisplayVerticalList)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(135008);
    int i;
    if ((j.j("batch", paramString)) && (3 == paramm.hsh) && ((paramm.obj instanceof Long)))
    {
      i = 1;
      if (i == 0)
        break label56;
      AppBrandCollectionDisplayVerticalList.a(this.iLg);
      AppMethodBeat.o(135008);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label56: AppBrandCollectionDisplayVerticalList.g(this.iLg);
      AppMethodBeat.o(135008);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.b
 * JD-Core Version:    0.6.2
 */