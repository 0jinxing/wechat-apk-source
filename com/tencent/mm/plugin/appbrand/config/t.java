package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import org.json.JSONArray;

final class t
{
  static LinkedList<String> l(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(96178);
    if (paramJSONArray == null)
    {
      paramJSONArray = null;
      AppMethodBeat.o(96178);
    }
    while (true)
    {
      return paramJSONArray;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramJSONArray.length(); i++)
        localLinkedList.add(paramJSONArray.optString(i));
      AppMethodBeat.o(96178);
      paramJSONArray = localLinkedList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.t
 * JD-Core Version:    0.6.2
 */