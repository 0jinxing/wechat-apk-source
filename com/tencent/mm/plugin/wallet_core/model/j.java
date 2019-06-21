package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j
{
  public String content;
  public String title;
  public String tzh;
  public List<j.a> tzi;

  public static j ay(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46765);
    if (paramJSONObject == null)
    {
      paramJSONObject = null;
      AppMethodBeat.o(46765);
    }
    while (true)
    {
      return paramJSONObject;
      j localj = new j();
      localj.title = paramJSONObject.optString("title");
      localj.content = paramJSONObject.optString("content");
      localj.tzh = paramJSONObject.optString("content_not_enough");
      localj.tzi = new ArrayList();
      JSONArray localJSONArray = paramJSONObject.optJSONArray("show_infos");
      if (localJSONArray != null)
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          paramJSONObject = j.a.az(localJSONArray.optJSONObject(i));
          if (paramJSONObject != null)
            localj.tzi.add(paramJSONObject);
        }
      AppMethodBeat.o(46765);
      paramJSONObject = localj;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.j
 * JD-Core Version:    0.6.2
 */