package com.tencent.mm.openim.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c$a
{
  public List<c.b> geV;
  public String title;

  public c$a()
  {
    AppMethodBeat.i(128605);
    this.title = "";
    this.geV = new LinkedList();
    AppMethodBeat.o(128605);
  }

  final a f(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(128606);
    this.title = paramJSONObject.optString("title", "");
    paramJSONObject = paramJSONObject.optJSONArray("detail");
    if (paramJSONObject == null)
      AppMethodBeat.o(128606);
    while (true)
    {
      return this;
      for (int i = 0; i < paramJSONObject.length(); i++)
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        c.b localb = new c.b();
        List localList = this.geV;
        localb.cIY = localJSONObject.optString("icon");
        localb.desc = localJSONObject.optString("desc");
        localb.geW = localJSONObject.optInt("desc_type");
        localb.action = localJSONObject.optInt("action");
        localb.geX = localJSONObject.optString("action_param");
        localList.add(localb);
      }
      AppMethodBeat.o(128606);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.a.c.a
 * JD-Core Version:    0.6.2
 */