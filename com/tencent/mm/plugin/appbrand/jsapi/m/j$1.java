package com.tencent.mm.plugin.appbrand.jsapi.m;

import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePicker;
import com.tencent.mm.plugin.appbrand.widget.picker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.f;

final class j$1
  implements Runnable
{
  j$1(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126366);
    j localj = this.hUE;
    AppBrandTimePicker localAppBrandTimePicker = (AppBrandTimePicker)localj.an(AppBrandTimePicker.class);
    if (localAppBrandTimePicker == null)
    {
      localj.l("fail cant init view", null);
      AppMethodBeat.o(126366);
    }
    while (true)
    {
      return;
      a locala = localj.jks;
      int i = localj.hUy;
      int j = localj.hUz;
      localAppBrandTimePicker.hUy = i;
      localAppBrandTimePicker.hUz = j;
      if ((f.qS(localAppBrandTimePicker.hUy)) && (localAppBrandTimePicker.jkY != null))
        localAppBrandTimePicker.jkY.setMinValue(localAppBrandTimePicker.hUy);
      j = localj.hUA;
      i = localj.hUB;
      localAppBrandTimePicker.hUA = j;
      localAppBrandTimePicker.hUB = i;
      if ((f.qS(localAppBrandTimePicker.hUA)) && (localAppBrandTimePicker.jkY != null))
        localAppBrandTimePicker.jkY.setMaxValue(localAppBrandTimePicker.hUA);
      i = localj.hUC;
      j = localj.hUD;
      if ((f.qS(i)) && (f.qR(j)))
      {
        localAppBrandTimePicker.setCurrentHour(Integer.valueOf(i));
        localAppBrandTimePicker.setCurrentMinute(Integer.valueOf(j));
      }
      localAppBrandTimePicker.aRM();
      locala.setOnResultListener(new j.2(localj));
      locala.show();
      AppMethodBeat.o(126366);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.j.1
 * JD-Core Version:    0.6.2
 */