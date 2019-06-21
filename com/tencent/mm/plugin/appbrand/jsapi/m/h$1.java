package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONArray;
import org.json.JSONObject;

final class h$1 extends d
{
  h$1(h paramh)
  {
  }

  final void C(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126357);
    int i = paramJSONObject.optInt("column", -1);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("array");
    if ((i < 0) || (localJSONArray == null) || (localJSONArray.length() < 0))
    {
      l("fail:invalid data", null);
      AppMethodBeat.o(126357);
    }
    while (true)
    {
      return;
      try
      {
        String[] arrayOfString = new String[localJSONArray.length()];
        for (int j = 0; j < arrayOfString.length; j++)
          arrayOfString[j] = localJSONArray.getString(j);
        paramJSONObject = new AppBrandMultiOptionsPicker.a(arrayOfString, paramJSONObject.optInt("current", 0));
        al.d(new h.1.1(this, i, paramJSONObject));
        AppMethodBeat.o(126357);
      }
      catch (Exception paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.JsApiUpdateMultiPickerView", paramJSONObject, "opt params", new Object[0]);
        l("fail:invalid data", null);
        AppMethodBeat.o(126357);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.h.1
 * JD-Core Version:    0.6.2
 */