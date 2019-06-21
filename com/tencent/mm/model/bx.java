package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class bx
{
  public static bx fnB;
  private SharedPreferences fnC;
  private SharedPreferences fnl;

  static
  {
    AppMethodBeat.i(58129);
    fnB = new bx();
    AppMethodBeat.o(58129);
  }

  private bx()
  {
    AppMethodBeat.i(58118);
    this.fnl = ah.getContext().getSharedPreferences(ah.doA() + "_account_history", 0);
    this.fnC = ah.getContext().getSharedPreferences(ah.doA() + "_account_switch", 0);
    AppMethodBeat.o(58118);
  }

  private void oN(String paramString)
  {
    AppMethodBeat.i(58126);
    if (this.fnl.contains(paramString));
    try
    {
      e.deleteFile(getString(paramString, "last_avatar_path"));
      this.fnl.edit().remove(paramString).commit();
      AppMethodBeat.o(58126);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.SwitchAccountInfo", "remove avatar file error %s", new Object[] { localException.getMessage() });
    }
  }

  public final Set<String> aat()
  {
    AppMethodBeat.i(58127);
    HashSet localHashSet = new HashSet();
    Set localSet = this.fnC.getStringSet("first_switch_group", null);
    if ((localSet != null) && (!localSet.isEmpty()))
      localHashSet.addAll(localSet);
    AppMethodBeat.o(58127);
    return localHashSet;
  }

  public final String aau()
  {
    AppMethodBeat.i(58128);
    Object localObject1 = aat();
    Object localObject2 = new StringBuilder();
    localObject1 = ((Set)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      ((StringBuilder)localObject2).append((String)((Iterator)localObject1).next());
      ((StringBuilder)localObject2).append(';');
    }
    if (((StringBuilder)localObject2).length() > 0)
      ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
    ab.i("MicroMsg.SwitchAccountInfo", "switch users %s", new Object[] { ((StringBuilder)localObject2).toString() });
    localObject2 = ((StringBuilder)localObject2).toString();
    AppMethodBeat.o(58128);
    return localObject2;
  }

  public final void an(String paramString1, String paramString2)
  {
    AppMethodBeat.i(58123);
    if ((bo.Q(new String[] { paramString1, paramString2 })) || (paramString1.equals(paramString2)))
    {
      AppMethodBeat.o(58123);
      return;
    }
    Object localObject = this.fnC.getStringSet("first_switch_group", null);
    if (localObject == null)
      localObject = new HashSet();
    while (true)
    {
      if ((((Set)localObject).contains(paramString1)) && (((Set)localObject).size() < 2))
        ((Set)localObject).add(paramString2);
      while (true)
      {
        paramString1 = this.fnC.edit();
        paramString1.remove("first_switch_group").apply();
        paramString1.putStringSet("first_switch_group", (Set)localObject).commit();
        AppMethodBeat.o(58123);
        break;
        Iterator localIterator = ((Set)localObject).iterator();
        while (localIterator.hasNext())
          oN((String)localIterator.next());
        ((Set)localObject).clear();
        ((Set)localObject).add(paramString1);
        ((Set)localObject).add(paramString2);
      }
    }
  }

  public final void g(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(58120);
    if (paramMap != null);
    try
    {
      if (paramMap.isEmpty())
      {
        ab.i("MicroMsg.SwitchAccountInfo", "kv map is null or empty!");
        AppMethodBeat.o(58120);
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
        ab.e("MicroMsg.SwitchAccountInfo", "save account info about %s failed, error: %s", new Object[] { paramString, paramMap.getMessage() });
        AppMethodBeat.o(58120);
        continue;
        JSONObject localJSONObject = new JSONObject();
        continue;
        localJSONObject = new JSONObject();
        continue;
        ab.i("MicroMsg.SwitchAccountInfo", "put json str %s", new Object[] { localJSONObject.toString() });
        this.fnl.edit().putString(paramString, Base64.encodeToString(localJSONObject.toString().getBytes(), 0)).commit();
        AppMethodBeat.o(58120);
      }
    }
  }

  public final String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(58121);
    try
    {
      ab.i("MicroMsg.SwitchAccountInfo", "get %s, %s", new Object[] { paramString1, paramString2 });
      if (this.fnl.contains(paramString1))
      {
        Object localObject = this.fnl.getString(paramString1, "");
        String str = new java/lang/String;
        str.<init>(Base64.decode((String)localObject, 0));
        if (bo.isNullOrNil(str))
          break label144;
        ab.i("MicroMsg.SwitchAccountInfo", "get json str %s", new Object[] { str });
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str);
        if (!((JSONObject)localObject).has(paramString2))
          break label144;
        str = ((JSONObject)localObject).getString(paramString2);
        paramString1 = str;
        AppMethodBeat.o(58121);
      }
      while (true)
      {
        return paramString1;
        ab.w("MicroMsg.SwitchAccountInfo", "account info about %s is not found!", new Object[] { paramString1 });
        label144: paramString1 = "";
        AppMethodBeat.o(58121);
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.SwitchAccountInfo", "get account info %s about %s failed, error: %s", new Object[] { paramString2, paramString1, localException.getMessage() });
    }
  }

  public final void n(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(58119);
    try
    {
      if (this.fnl.contains(paramString1))
      {
        String str1 = this.fnl.getString(paramString1, "");
        if (!bo.isNullOrNil(str1))
        {
          localJSONObject = new org/json/JSONObject;
          String str2 = new java/lang/String;
          str2.<init>(Base64.decode(str1, 0));
          localJSONObject.<init>(str2);
        }
        while (true)
        {
          if (!bo.Q(new String[] { paramString2, paramString3 }))
          {
            localJSONObject.put(paramString2, paramString3);
            ab.i("MicroMsg.SwitchAccountInfo", "put key %s, jsonStr %s", new Object[] { paramString2, localJSONObject.toString() });
            this.fnl.edit().putString(paramString1, Base64.encodeToString(localJSONObject.toString().getBytes(), 0)).commit();
          }
          AppMethodBeat.o(58119);
          return;
          localJSONObject = new JSONObject();
        }
      }
    }
    catch (Exception paramString3)
    {
      while (true)
      {
        ab.e("MicroMsg.SwitchAccountInfo", "save account info %s about %s failed, error: %s", new Object[] { paramString2, paramString1, paramString3.getMessage() });
        AppMethodBeat.o(58119);
        continue;
        JSONObject localJSONObject = new JSONObject();
      }
    }
  }

  public final void oK(String paramString)
  {
    AppMethodBeat.i(58122);
    if (oL(paramString))
    {
      Set localSet = this.fnC.getStringSet("first_switch_group", null);
      if (localSet != null)
      {
        localSet.remove(paramString);
        SharedPreferences.Editor localEditor = this.fnC.edit();
        localEditor.remove("first_switch_group").apply();
        localEditor.putStringSet("first_switch_group", localSet).commit();
      }
    }
    if (oM(paramString))
      oN(paramString);
    AppMethodBeat.o(58122);
  }

  public final boolean oL(String paramString)
  {
    AppMethodBeat.i(58124);
    Set localSet = this.fnC.getStringSet("first_switch_group", null);
    boolean bool;
    if (localSet == null)
    {
      bool = false;
      AppMethodBeat.o(58124);
    }
    while (true)
    {
      return bool;
      bool = localSet.contains(paramString);
      AppMethodBeat.o(58124);
    }
  }

  public final boolean oM(String paramString)
  {
    AppMethodBeat.i(58125);
    boolean bool = this.fnl.contains(paramString);
    AppMethodBeat.o(58125);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bx
 * JD-Core Version:    0.6.2
 */