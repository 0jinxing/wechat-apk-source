package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
{
  public String name;
  public List<n.a> phz;

  public n()
  {
    AppMethodBeat.i(44007);
    this.phz = new ArrayList();
    AppMethodBeat.o(44007);
  }

  public static List<n> parse(String paramString)
  {
    AppMethodBeat.i(44008);
    ArrayList localArrayList = new ArrayList();
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      localObject = ((JSONObject)localObject).getJSONArray("group_list");
      int i = ((JSONArray)localObject).length();
      for (int j = 0; j < i; j++)
      {
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(j);
        paramString = new com/tencent/mm/plugin/product/b/n;
        paramString.<init>();
        paramString.name = localJSONObject.getString("name");
        JSONArray localJSONArray = localJSONObject.getJSONArray("item_list");
        int k = localJSONArray.length();
        for (int m = 0; m < k; m++)
        {
          localJSONObject = localJSONArray.getJSONObject(m);
          n.a locala = new com/tencent/mm/plugin/product/b/n$a;
          locala.<init>();
          locala.title = localJSONObject.getString("title");
          locala.type = localJSONObject.getInt("jump_type");
          locala.data = localJSONObject.getString("native_url_args");
          locala.iconUrl = localJSONObject.getString("icon_url");
          locala.url = localJSONObject.getString("h5_url");
          paramString.phz.add(locala);
        }
        localArrayList.add(paramString);
      }
    }
    catch (Exception paramString)
    {
      paramString = null;
      AppMethodBeat.o(44008);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(44008);
      paramString = localArrayList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.n
 * JD-Core Version:    0.6.2
 */