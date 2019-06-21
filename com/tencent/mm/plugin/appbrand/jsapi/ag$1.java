package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.luggage.g.e.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ag$1
  implements e.a
{
  ag$1(ag paramag, s params, int paramInt)
  {
  }

  public final void b(int paramInt, Intent paramIntent)
  {
    int i = -1;
    AppMethodBeat.i(130412);
    Object localObject1;
    HashMap localHashMap;
    if (paramInt == -1)
    {
      localObject1 = paramIntent.getStringExtra("k_select_group");
      localHashMap = new HashMap();
      if (!TextUtils.isEmpty((CharSequence)localObject1))
        switch (((String)localObject1).hashCode())
        {
        default:
          paramInt = i;
          switch (paramInt)
          {
          default:
            label116: this.hsj.M(this.eIl, this.hwK.j("cancel", null));
            AppMethodBeat.o(130412);
          case 0:
          case 1:
          case 2:
          case 3:
          }
          break;
        case -314497661:
        case -977423767:
        case 466743410:
        case -1901805651:
        }
    }
    while (true)
    {
      return;
      paramInt = i;
      if (!((String)localObject1).equals("private"))
        break;
      paramInt = 0;
      break;
      paramInt = i;
      if (!((String)localObject1).equals("public"))
        break;
      paramInt = 1;
      break;
      paramInt = i;
      if (!((String)localObject1).equals("visible"))
        break;
      paramInt = 2;
      break;
      paramInt = i;
      if (!((String)localObject1).equals("invisible"))
        break;
      paramInt = 3;
      break;
      localHashMap.put("group", localObject1);
      this.hsj.M(this.eIl, this.hwK.j("ok", localHashMap));
      AppMethodBeat.o(130412);
      continue;
      Object localObject2 = paramIntent.getStringExtra("Klabel_name_list");
      paramIntent = paramIntent.getStringExtra("Kother_user_name_list");
      localHashMap.put("group", localObject1);
      try
      {
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>((String)localObject2);
          localHashMap.put("labels", localObject1);
        }
        if (!TextUtils.isEmpty(paramIntent))
        {
          localObject2 = new org/json/JSONArray;
          ((JSONArray)localObject2).<init>(paramIntent);
          localHashMap.put("userList", localObject2);
        }
        this.hsj.M(this.eIl, this.hwK.j("ok", localHashMap));
        AppMethodBeat.o(130412);
      }
      catch (JSONException paramIntent)
      {
        ab.printErrStackTrace("MicroMsg.JsApiChooseShareGroup", paramIntent, "", new Object[0]);
      }
      break label116;
      this.hsj.M(this.eIl, this.hwK.j("cancel", null));
      AppMethodBeat.o(130412);
      continue;
      this.hsj.M(this.eIl, this.hwK.j("fail", null));
      AppMethodBeat.o(130412);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ag.1
 * JD-Core Version:    0.6.2
 */