package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e
{
  public String cRS;
  public int fws;
  public String id;
  public String key;
  public String name;
  public List<e> pqE;
  public int type;
  public String value;

  public static e ai(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(23948);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.ServiceInfo", "json is null, err");
      paramJSONObject = null;
      AppMethodBeat.o(23948);
    }
    while (true)
    {
      return paramJSONObject;
      e locale = new e();
      try
      {
        locale.id = paramJSONObject.optString("id", "");
        locale.type = paramJSONObject.optInt("type");
        locale.name = paramJSONObject.optString("name");
        locale.key = paramJSONObject.optString("key");
        locale.value = paramJSONObject.optString("value");
        locale.fws = paramJSONObject.optInt("acttype", -1);
        locale.cRS = paramJSONObject.optString("native_url");
        Object localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        locale.pqE = ((List)localObject);
        paramJSONObject = paramJSONObject.optJSONArray("sub_button_list");
        if (paramJSONObject != null)
          for (int i = 0; i < paramJSONObject.length(); i++)
          {
            localObject = ai(paramJSONObject.optJSONObject(i));
            if (localObject != null)
              locale.pqE.add(localObject);
          }
      }
      catch (Exception paramJSONObject)
      {
        ab.b("MicroMsg.ServiceInfo", "", new Object[] { paramJSONObject });
        AppMethodBeat.o(23948);
        paramJSONObject = locale;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.e
 * JD-Core Version:    0.6.2
 */