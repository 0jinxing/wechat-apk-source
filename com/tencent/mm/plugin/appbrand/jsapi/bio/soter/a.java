package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

public final class a
{
  public static int AS(String paramString)
  {
    AppMethodBeat.i(3207);
    int i;
    if ("fingerPrint".equals(paramString))
    {
      i = 1;
      AppMethodBeat.o(3207);
    }
    while (true)
    {
      return i;
      if ("facial".equals(paramString))
      {
        i = 8;
        AppMethodBeat.o(3207);
      }
      else if ("speech".equals(paramString))
      {
        i = 2;
        AppMethodBeat.o(3207);
      }
      else
      {
        ab.e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
        i = 0;
        AppMethodBeat.o(3207);
      }
    }
  }

  public static String m(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(3206);
    String str;
    if (paramJSONArray == null)
    {
      str = null;
      ab.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translating string array: %s", new Object[] { str });
      if ((paramJSONArray != null) && (paramJSONArray.length() != 0))
        break label57;
      paramJSONArray = "0x00";
      AppMethodBeat.o(3206);
    }
    while (true)
    {
      return paramJSONArray;
      str = paramJSONArray.toString();
      break;
      label57: int i = 0;
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
      AppMethodBeat.o(3206);
    }
  }

  public static JSONArray oc(int paramInt)
  {
    AppMethodBeat.i(3205);
    Object localObject;
    if (paramInt <= 0)
    {
      localObject = new JSONArray();
      AppMethodBeat.o(3205);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList(3);
      if ((paramInt & 0x1) == 1)
        ((ArrayList)localObject).add("fingerPrint");
      if ((paramInt & 0x8) == 8)
        ((ArrayList)localObject).add("facial");
      if ((paramInt & 0x2) == 2)
        ((ArrayList)localObject).add("speech");
      ab.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: final string is: %s", new Object[] { ((ArrayList)localObject).toString() });
      localObject = new JSONArray((Collection)localObject);
      AppMethodBeat.o(3205);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.a
 * JD-Core Version:    0.6.2
 */