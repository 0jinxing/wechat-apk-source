package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class i
{
  public Map<String, Object> puc;
  public String type;
  public String uIG;
  public JSONObject uIH;
  Map<String, Object> uII;
  public String uIJ;

  public i()
  {
    AppMethodBeat.i(9818);
    this.uII = new HashMap();
    AppMethodBeat.o(9818);
  }

  public static Bundle aP(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(9819);
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      paramMap = null;
      AppMethodBeat.o(9819);
    }
    while (true)
    {
      return paramMap;
      Bundle localBundle = new Bundle();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramMap.get(str);
        if ((localObject instanceof String[]))
          localBundle.putStringArray(str, (String[])localObject);
        else if ((localObject instanceof Bundle))
          localBundle.putBundle(str, (Bundle)localObject);
        else
          localBundle.putString(str, String.valueOf(localObject));
      }
      AppMethodBeat.o(9819);
      paramMap = localBundle;
    }
  }

  public static Map<String, Object> aq(Bundle paramBundle)
  {
    HashMap localHashMap = null;
    AppMethodBeat.i(9820);
    if (paramBundle == null)
    {
      AppMethodBeat.o(9820);
      paramBundle = localHashMap;
    }
    while (true)
    {
      return paramBundle;
      Object localObject = paramBundle.keySet();
      if (localObject == null)
      {
        AppMethodBeat.o(9820);
        paramBundle = localHashMap;
      }
      else
      {
        localHashMap = new HashMap();
        Iterator localIterator = ((Set)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (String)localIterator.next();
          localHashMap.put(localObject, paramBundle.get((String)localObject));
        }
        AppMethodBeat.o(9820);
        paramBundle = localHashMap;
      }
    }
  }

  public final Map<String, Object> dcO()
  {
    return this.uII;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.i
 * JD-Core Version:    0.6.2
 */