package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.c;
import com.tencent.mm.sdk.platformtools.bo;

final class h$1$1
  implements Runnable
{
  h$1$1(h.1 param1, int paramInt, AppBrandMultiOptionsPicker.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126356);
    AppBrandMultiOptionsPicker localAppBrandMultiOptionsPicker = (AppBrandMultiOptionsPicker)h.1.a(this.hUs, AppBrandMultiOptionsPicker.class);
    if (localAppBrandMultiOptionsPicker == null)
    {
      this.hUs.l("fail picker not exists", null);
      AppMethodBeat.o(126356);
    }
    while (true)
    {
      return;
      int i = this.hUq;
      AppBrandMultiOptionsPicker.a locala = this.hUr;
      if ((i >= 0) && (i < localAppBrandMultiOptionsPicker.getPickersCount()) && (locala != null))
      {
        localAppBrandMultiOptionsPicker.setLayoutFrozen(true);
        localAppBrandMultiOptionsPicker.qP(i).setOptionsArray(locala.jkK);
        if (!bo.Q(locala.jkK))
          localAppBrandMultiOptionsPicker.qP(i).setValue(locala.jkL);
        localAppBrandMultiOptionsPicker.setLayoutFrozen(false);
      }
      this.hUs.l("ok", null);
      AppMethodBeat.o(126356);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.h.1.1
 * JD-Core Version:    0.6.2
 */