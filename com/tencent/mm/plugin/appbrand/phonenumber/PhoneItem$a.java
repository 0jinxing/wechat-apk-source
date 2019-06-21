package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "TAG", "", "parseFromJson", "jsonStr", "plugin-appbrand-integration_release"})
public final class PhoneItem$a
{
  public static PhoneItem Ds(String paramString)
  {
    AppMethodBeat.i(134799);
    j.p(paramString, "jsonStr");
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      String str1 = ((JSONObject)localObject).optString("mobile");
      String str2 = ((JSONObject)localObject).optString("show_mobile");
      boolean bool1 = ((JSONObject)localObject).optBoolean("need_auth", true);
      boolean bool2 = ((JSONObject)localObject).optBoolean("allow_send_sms", true);
      String str3 = ((JSONObject)localObject).optString("encryptedData");
      String str4 = ((JSONObject)localObject).optString("iv");
      boolean bool3 = ((JSONObject)localObject).optBoolean("is_wechat", false);
      boolean bool4 = ((JSONObject)localObject).optBoolean("is_check", false);
      localObject = new com/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;
      j.o(str1, "mobile");
      j.o(str2, "showMobile");
      j.o(str3, "encryptedData");
      j.o(str4, "iv");
      ((PhoneItem)localObject).<init>(str1, str2, str3, str4, bool1, bool2, bool3, bool4);
      AppMethodBeat.o(134799);
      paramString = (String)localObject;
      return paramString;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        d.e("MicroMsg.PhoneItem", "jsonStr:%s", new Object[] { paramString });
        paramString = null;
        AppMethodBeat.o(134799);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem.a
 * JD-Core Version:    0.6.2
 */