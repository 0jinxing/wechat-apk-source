package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class bn
{
  public static bn fnk;
  private SharedPreferences fnl;

  static
  {
    AppMethodBeat.i(58117);
    fnk = new bn();
    AppMethodBeat.o(58117);
  }

  private bn()
  {
    AppMethodBeat.i(58114);
    this.fnl = ah.getContext().getSharedPreferences(ah.doA() + "_register_history", 0);
    AppMethodBeat.o(58114);
  }

  public final void g(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(58115);
    try
    {
      if (paramMap.isEmpty())
      {
        ab.i("MicroMsg.RegisterAccountInfo", "kv map is null or empty!");
        AppMethodBeat.o(58115);
        return;
      }
      if (this.fnl.contains(paramString))
      {
        String str = this.fnl.getString(paramString, "");
        if (!bo.isNullOrNil(str))
        {
          localJSONObject = new org/json/JSONObject;
          Object localObject = new java/lang/String;
          ((String)localObject).<init>(Base64.decode(str, 0));
          localJSONObject.<init>((String)localObject);
          localObject = paramMap.keySet().iterator();
          while (((Iterator)localObject).hasNext())
          {
            str = (String)((Iterator)localObject).next();
            localJSONObject.put(str, paramMap.get(str));
          }
        }
      }
    }
    catch (Exception paramMap)
    {
      while (true)
      {
        ab.e("MicroMsg.RegisterAccountInfo", "save account info about %s failed, error: %s", new Object[] { paramString, paramMap.getMessage() });
        AppMethodBeat.o(58115);
        continue;
        JSONObject localJSONObject = new JSONObject();
        continue;
        localJSONObject = new JSONObject();
        continue;
        ab.i("MicroMsg.RegisterAccountInfo", "put json str %s", new Object[] { localJSONObject.toString() });
        this.fnl.edit().putString(paramString, Base64.encodeToString(localJSONObject.toString().getBytes(), 0)).commit();
        AppMethodBeat.o(58115);
      }
    }
  }

  public final String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(58116);
    try
    {
      ab.i("MicroMsg.RegisterAccountInfo", "get %s, %s", new Object[] { paramString1, paramString2 });
      if (this.fnl.contains(paramString1))
      {
        Object localObject = this.fnl.getString(paramString1, "");
        String str = new java/lang/String;
        str.<init>(Base64.decode((String)localObject, 0));
        if (bo.isNullOrNil(str))
          break label139;
        ab.i("MicroMsg.RegisterAccountInfo", "get json str %s", new Object[] { str });
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str);
        if (!((JSONObject)localObject).has(paramString2))
          break label139;
        str = ((JSONObject)localObject).getString(paramString2);
        paramString1 = str;
        AppMethodBeat.o(58116);
      }
      while (true)
      {
        return paramString1;
        ab.w("MicroMsg.RegisterAccountInfo", "register info about %s is not found!", new Object[] { paramString1 });
        label139: paramString1 = "";
        AppMethodBeat.o(58116);
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.RegisterAccountInfo", "get register info %s about %s failed, error: %s", new Object[] { paramString2, paramString1, localException.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bn
 * JD-Core Version:    0.6.2
 */