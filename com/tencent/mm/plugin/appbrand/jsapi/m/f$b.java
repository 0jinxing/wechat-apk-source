package com.tencent.mm.plugin.appbrand.jsapi.m;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker.2;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

final class f$b extends d
  implements Runnable
{
  private final AtomicReference<AppBrandMultiOptionsPicker.a[]> hUm;

  private f$b(f paramf)
  {
    AppMethodBeat.i(126350);
    this.hUm = new AtomicReference();
    AppMethodBeat.o(126350);
  }

  final void C(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126351);
    JSONArray localJSONArray1 = paramJSONObject.optJSONArray("array");
    JSONArray localJSONArray2 = paramJSONObject.optJSONArray("current");
    if ((localJSONArray1 == null) || (localJSONArray2 == null) || (localJSONArray1.length() != localJSONArray2.length()))
    {
      l("fail:invalid data", null);
      AppMethodBeat.o(126351);
    }
    while (true)
    {
      return;
      if (localJSONArray1.length() <= 0)
      {
        l("ok", null);
        ab.i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (one-dimensional)");
        m.runOnUiThread(new f.b.1(this));
        AppMethodBeat.o(126351);
      }
      else
      {
        try
        {
          paramJSONObject = new AppBrandMultiOptionsPicker.a[localJSONArray1.length()];
          int i = 0;
          int j = 1;
          if (i < localJSONArray1.length())
          {
            JSONArray localJSONArray3 = localJSONArray1.getJSONArray(i);
            int k = localJSONArray2.getInt(i);
            String[] arrayOfString = new String[localJSONArray3.length()];
            for (int m = 0; m < arrayOfString.length; m++)
              arrayOfString[m] = localJSONArray3.getString(m);
            AppBrandMultiOptionsPicker.a locala = new com/tencent/mm/plugin/appbrand/widget/picker/AppBrandMultiOptionsPicker$a;
            locala.<init>(arrayOfString, k);
            paramJSONObject[i] = locala;
            if (localJSONArray3.length() <= 0);
            for (m = 1; ; m = 0)
            {
              j &= m;
              i++;
              break;
            }
          }
          if (j == 0)
            break label287;
          l("ok", null);
          ab.i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (multi-dimensional)");
          paramJSONObject = new com/tencent/mm/plugin/appbrand/jsapi/m/f$b$2;
          paramJSONObject.<init>(this);
          m.runOnUiThread(paramJSONObject);
          AppMethodBeat.o(126351);
        }
        catch (Exception paramJSONObject)
        {
          ab.printErrStackTrace("MicroMsg.JsApiShowMultiPickerView", paramJSONObject, "opt params", new Object[0]);
          l("fail:invalid data", null);
          AppMethodBeat.o(126351);
        }
        continue;
        label287: this.hUm.set(paramJSONObject);
        al.d(this);
        AppMethodBeat.o(126351);
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(126352);
    AppBrandMultiOptionsPicker localAppBrandMultiOptionsPicker = (AppBrandMultiOptionsPicker)an(AppBrandMultiOptionsPicker.class);
    if (localAppBrandMultiOptionsPicker == null)
    {
      l("fail cant init view", null);
      AppMethodBeat.o(126352);
    }
    AppBrandMultiOptionsPicker.a[] arrayOfa;
    while (true)
    {
      return;
      arrayOfa = (AppBrandMultiOptionsPicker.a[])this.hUm.get();
      if ((arrayOfa != null) && (arrayOfa.length > 0))
        break;
      l("fail error data", null);
      AppMethodBeat.o(126352);
    }
    if ((arrayOfa == null) || (arrayOfa.length <= 0));
    while (true)
    {
      this.jks.setOnResultListener(new f.b.3(this));
      this.jks.setOnValueUpdateListener(new f.b.4(this));
      this.jks.show();
      AppMethodBeat.o(126352);
      break;
      int i = localAppBrandMultiOptionsPicker.getPickersCount();
      localAppBrandMultiOptionsPicker.setLayoutFrozen(true);
      Object localObject;
      if (i < arrayOfa.length)
      {
        i = arrayOfa.length - i;
        if (i > 0)
          while (i > 0)
          {
            localObject = new AppBrandMultiOptionsPicker.2(localAppBrandMultiOptionsPicker, localAppBrandMultiOptionsPicker.getContext());
            ((c)localObject).setOnValueChangedListener(localAppBrandMultiOptionsPicker.jkI);
            ((c)localObject).setEllipsizeType("end");
            ((c)localObject).setDividerHeight(com.tencent.mm.bz.a.fromDPToPix(localAppBrandMultiOptionsPicker.getContext(), 1));
            ((c)localObject).setTag(2131820565, Integer.valueOf(localAppBrandMultiOptionsPicker.jkF.getChildCount()));
            localAppBrandMultiOptionsPicker.jkF.addView((View)localObject, new LinearLayout.LayoutParams(0, -1, 1.0F));
            i--;
          }
      }
      else if (i > arrayOfa.length)
      {
        localAppBrandMultiOptionsPicker.qQ(i - arrayOfa.length);
      }
      for (i = 0; i < arrayOfa.length; i++)
      {
        c localc = localAppBrandMultiOptionsPicker.qP(i);
        localObject = arrayOfa[i];
        localc.setOptionsArray(((AppBrandMultiOptionsPicker.a)localObject).jkK);
        localc.setValue(((AppBrandMultiOptionsPicker.a)localObject).jkL);
        localc.setOnValueChangedListener(localAppBrandMultiOptionsPicker.jkI);
      }
      localAppBrandMultiOptionsPicker.jkF.setWeightSum(localAppBrandMultiOptionsPicker.getPickersCount());
      localAppBrandMultiOptionsPicker.setLayoutFrozen(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.f.b
 * JD-Core Version:    0.6.2
 */