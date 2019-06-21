package com.tencent.mm.plugin.appbrand.app;

import a.l;
import com.tencent.luggage.wxa.storage.WxaCriticalDataProvider;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.o;
import com.tencent.mm.sdk.e.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/app/AppBrandCriticalDataProvider;", "Lcom/tencent/luggage/wxa/storage/WxaCriticalDataProvider;", "()V", "provideDatabase", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "plugin-appbrand-integration_release"})
public final class AppBrandCriticalDataProvider extends WxaCriticalDataProvider
{
  public final e yo()
  {
    AppMethodBeat.i(134454);
    Object localObject = f.auK();
    if (localObject != null)
      b(o.class, f.auO());
    while (true)
    {
      localObject = (e)localObject;
      AppMethodBeat.o(134454);
      return localObject;
      localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.AppBrandCriticalDataProvider
 * JD-Core Version:    0.6.2
 */