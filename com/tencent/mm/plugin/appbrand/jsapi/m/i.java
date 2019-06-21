package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONArray;
import org.json.JSONObject;

final class i extends d
{
  final void C(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126364);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("array");
    int i = paramJSONObject.optInt("current", 0);
    if ((localJSONArray == null) || (localJSONArray.length() <= 0))
    {
      ab.i("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "showPickerView as selector, empty range");
      l("ok", null);
      m.runOnUiThread(new i.1(this));
      AppMethodBeat.o(126364);
    }
    while (true)
    {
      return;
      paramJSONObject = new String[localJSONArray.length()];
      int j = 0;
      try
      {
        while (j < localJSONArray.length())
        {
          paramJSONObject[j] = localJSONArray.getString(j);
          j++;
        }
      }
      catch (Exception paramJSONObject)
      {
        ab.e("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "opt data.array, exp = %s", new Object[] { bo.l(paramJSONObject) });
        l("fail", null);
        AppMethodBeat.o(126364);
      }
      continue;
      al.d(new i.2(this, paramJSONObject, i));
      AppMethodBeat.o(126364);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.i
 * JD-Core Version:    0.6.2
 */