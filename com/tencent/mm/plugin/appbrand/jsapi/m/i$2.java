package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPicker;
import com.tencent.mm.plugin.appbrand.widget.picker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;

final class i$2
  implements Runnable
{
  i$2(i parami, String[] paramArrayOfString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126361);
    i locali = this.hUt;
    String[] arrayOfString = this.hUu;
    int i = this.hUv;
    AppBrandOptionsPicker localAppBrandOptionsPicker = (AppBrandOptionsPicker)locali.an(AppBrandOptionsPicker.class);
    if (localAppBrandOptionsPicker == null)
    {
      locali.l("fail cant init view", null);
      AppMethodBeat.o(126361);
    }
    while (true)
    {
      return;
      a locala = locali.jks;
      locala.post(new i.3(locali, locala));
      localAppBrandOptionsPicker.setOptionsArray(arrayOfString);
      localAppBrandOptionsPicker.setValue(i);
      locala.setOnResultListener(new i.4(locali, locala, localAppBrandOptionsPicker));
      locala.show();
      AppMethodBeat.o(126361);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.i.2
 * JD-Core Version:    0.6.2
 */