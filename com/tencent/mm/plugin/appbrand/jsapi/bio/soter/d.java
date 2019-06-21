package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONException;

public final class d
{
  public static int AS(String paramString)
  {
    AppMethodBeat.i(73796);
    int i;
    if ("fingerPrint".equals(paramString))
    {
      i = 1;
      AppMethodBeat.o(73796);
    }
    while (true)
    {
      return i;
      if ("facial".equals(paramString))
      {
        i = 8;
        AppMethodBeat.o(73796);
      }
      else if ("speech".equals(paramString))
      {
        i = 2;
        AppMethodBeat.o(73796);
      }
      else
      {
        ab.e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
        i = 0;
        AppMethodBeat.o(73796);
      }
    }
  }

  public static String m(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(73795);
    String str;
    if (paramJSONArray == null)
    {
      str = null;
      ab.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translating string array: %s", new Object[] { str });
      if ((paramJSONArray != null) && (paramJSONArray.length() != 0))
        break label55;
      paramJSONArray = "0x00";
      AppMethodBeat.o(73795);
    }
    while (true)
    {
      return paramJSONArray;
      str = paramJSONArray.toString();
      break;
      label55: int i = 0;
      int j = 0;
      while (true)
        if (i < paramJSONArray.length())
          try
          {
            int k = AS(paramJSONArray.getString(i));
            j = (byte)(j | k);
            i++;
          }
          catch (JSONException localJSONException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.AppBrandSoterTranslateUtil", localJSONException, "hy: json error in translate", new Object[0]);
          }
      paramJSONArray = "0x" + Integer.toHexString(j);
      ab.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translated bitsetStr: %s", new Object[] { paramJSONArray });
      AppMethodBeat.o(73795);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.d
 * JD-Core Version:    0.6.2
 */