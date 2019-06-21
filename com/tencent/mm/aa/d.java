package com.tencent.mm.aa;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements c
{
  private JSONObject eIz;

  public d()
  {
    AppMethodBeat.i(117523);
    this.eIz = new JSONObject();
    AppMethodBeat.o(117523);
  }

  public d(String paramString)
  {
    AppMethodBeat.i(117525);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      this.eIz = localJSONObject;
      AppMethodBeat.o(117525);
      return;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117525);
    }
    throw paramString;
  }

  public d(Map paramMap)
  {
    AppMethodBeat.i(117524);
    this.eIz = new JSONObject(paramMap);
    AppMethodBeat.o(117524);
  }

  d(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(117526);
    Assert.assertNotNull(paramJSONObject);
    this.eIz = paramJSONObject;
    AppMethodBeat.o(117526);
  }

  public final c J(String paramString, int paramInt)
  {
    AppMethodBeat.i(117530);
    try
    {
      this.eIz.put(paramString, paramInt);
      AppMethodBeat.o(117530);
      return this;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117530);
    }
    throw paramString;
  }

  public final c c(String paramString, double paramDouble)
  {
    AppMethodBeat.i(117529);
    try
    {
      this.eIz.put(paramString, paramDouble);
      AppMethodBeat.o(117529);
      return this;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117529);
    }
    throw paramString;
  }

  public final c e(String paramString, Object paramObject)
  {
    AppMethodBeat.i(117532);
    try
    {
      if ((paramObject instanceof d))
        this.eIz.put(paramString, ((d)paramObject).eIz);
      while (true)
      {
        AppMethodBeat.o(117532);
        return this;
        this.eIz.put(paramString, paramObject);
      }
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117532);
    }
    throw paramString;
  }

  public final c f(String paramString, Object paramObject)
  {
    AppMethodBeat.i(117533);
    try
    {
      if ((paramObject instanceof d))
        this.eIz.putOpt(paramString, ((d)paramObject).eIz);
      while (true)
      {
        AppMethodBeat.o(117533);
        return this;
        this.eIz.putOpt(paramString, paramObject);
      }
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117533);
    }
    throw paramString;
  }

  public final Object get(String paramString)
  {
    AppMethodBeat.i(117538);
    try
    {
      paramString = this.eIz.get(paramString);
      if ((paramString instanceof JSONObject))
      {
        paramString = new d((JSONObject)paramString);
        AppMethodBeat.o(117538);
      }
      while (true)
      {
        return paramString;
        if ((paramString instanceof JSONArray))
        {
          paramString = new b((JSONArray)paramString);
          AppMethodBeat.o(117538);
        }
        else
        {
          AppMethodBeat.o(117538);
        }
      }
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117538);
    }
    throw paramString;
  }

  public final boolean getBoolean(String paramString)
  {
    AppMethodBeat.i(117540);
    try
    {
      boolean bool = this.eIz.getBoolean(paramString);
      AppMethodBeat.o(117540);
      return bool;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117540);
    }
    throw paramString;
  }

  public final double getDouble(String paramString)
  {
    AppMethodBeat.i(117542);
    try
    {
      double d = this.eIz.getDouble(paramString);
      AppMethodBeat.o(117542);
      return d;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117542);
    }
    throw paramString;
  }

  public final int getInt(String paramString)
  {
    AppMethodBeat.i(117544);
    try
    {
      int i = this.eIz.getInt(paramString);
      AppMethodBeat.o(117544);
      return i;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117544);
    }
    throw paramString;
  }

  public final long getLong(String paramString)
  {
    AppMethodBeat.i(117546);
    try
    {
      long l = this.eIz.getLong(paramString);
      AppMethodBeat.o(117546);
      return l;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117546);
    }
    throw paramString;
  }

  public final String getString(String paramString)
  {
    AppMethodBeat.i(117548);
    try
    {
      paramString = this.eIz.getString(paramString);
      AppMethodBeat.o(117548);
      return paramString;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117548);
    }
    throw paramString;
  }

  public final boolean has(String paramString)
  {
    AppMethodBeat.i(117537);
    boolean bool = this.eIz.has(paramString);
    AppMethodBeat.o(117537);
    return bool;
  }

  public final boolean isNull(String paramString)
  {
    AppMethodBeat.i(117536);
    boolean bool = this.eIz.isNull(paramString);
    AppMethodBeat.o(117536);
    return bool;
  }

  public final c k(String paramString, long paramLong)
  {
    AppMethodBeat.i(117531);
    try
    {
      this.eIz.put(paramString, paramLong);
      AppMethodBeat.o(117531);
      return this;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117531);
    }
    throw paramString;
  }

  public final Iterator<String> keys()
  {
    AppMethodBeat.i(117555);
    Iterator localIterator = this.eIz.keys();
    AppMethodBeat.o(117555);
    return localIterator;
  }

  public final int length()
  {
    AppMethodBeat.i(117527);
    int i = this.eIz.length();
    AppMethodBeat.o(117527);
    return i;
  }

  public final String lr(String paramString)
  {
    AppMethodBeat.i(117534);
    if (paramString == null)
    {
      paramString = new g("Names must be non-null");
      AppMethodBeat.o(117534);
      throw paramString;
    }
    AppMethodBeat.o(117534);
    return paramString;
  }

  public final a ls(String paramString)
  {
    AppMethodBeat.i(117551);
    try
    {
      paramString = this.eIz.getJSONArray(paramString);
      if (paramString == null)
      {
        paramString = null;
        AppMethodBeat.o(117551);
      }
      while (true)
      {
        return paramString;
        paramString = new b(paramString);
        AppMethodBeat.o(117551);
      }
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117551);
    }
    throw paramString;
  }

  public final a lt(String paramString)
  {
    AppMethodBeat.i(117552);
    paramString = this.eIz.optJSONArray(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(117552);
    }
    while (true)
    {
      return paramString;
      paramString = new b(paramString);
      AppMethodBeat.o(117552);
    }
  }

  public final c lu(String paramString)
  {
    AppMethodBeat.i(117553);
    try
    {
      paramString = this.eIz.getJSONObject(paramString);
      if (paramString == null)
      {
        paramString = null;
        AppMethodBeat.o(117553);
      }
      while (true)
      {
        return paramString;
        paramString = new d(paramString);
        AppMethodBeat.o(117553);
      }
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117553);
    }
    throw paramString;
  }

  public final c lv(String paramString)
  {
    AppMethodBeat.i(117554);
    paramString = this.eIz.optJSONObject(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(117554);
    }
    while (true)
    {
      return paramString;
      paramString = new d(paramString);
      AppMethodBeat.o(117554);
    }
  }

  public final Object opt(String paramString)
  {
    AppMethodBeat.i(117539);
    try
    {
      paramString = this.eIz.get(paramString);
      if ((paramString instanceof JSONObject))
      {
        d locald = new com/tencent/mm/aa/d;
        locald.<init>((JSONObject)paramString);
        AppMethodBeat.o(117539);
        paramString = locald;
      }
      while (true)
      {
        return paramString;
        if ((paramString instanceof JSONArray))
        {
          paramString = new b((JSONArray)paramString);
          AppMethodBeat.o(117539);
        }
        else
        {
          AppMethodBeat.o(117539);
        }
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(117539);
      }
    }
  }

  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(117541);
    paramBoolean = this.eIz.optBoolean(paramString, paramBoolean);
    AppMethodBeat.o(117541);
    return paramBoolean;
  }

  public final double optDouble(String paramString, double paramDouble)
  {
    AppMethodBeat.i(117543);
    paramDouble = this.eIz.optDouble(paramString, paramDouble);
    AppMethodBeat.o(117543);
    return paramDouble;
  }

  public final int optInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(117545);
    paramInt = this.eIz.optInt(paramString, paramInt);
    AppMethodBeat.o(117545);
    return paramInt;
  }

  public final long optLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(117547);
    paramLong = this.eIz.optLong(paramString, paramLong);
    AppMethodBeat.o(117547);
    return paramLong;
  }

  public final String optString(String paramString)
  {
    AppMethodBeat.i(117549);
    paramString = this.eIz.optString(paramString);
    AppMethodBeat.o(117549);
    return paramString;
  }

  public final String optString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(117550);
    paramString1 = this.eIz.optString(paramString1, paramString2);
    AppMethodBeat.o(117550);
    return paramString1;
  }

  public final Object remove(String paramString)
  {
    AppMethodBeat.i(117535);
    paramString = this.eIz.remove(paramString);
    AppMethodBeat.o(117535);
    return paramString;
  }

  public final c s(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(117528);
    try
    {
      this.eIz.put(paramString, paramBoolean);
      AppMethodBeat.o(117528);
      return this;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117528);
    }
    throw paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(117556);
    String str = this.eIz.toString();
    AppMethodBeat.o(117556);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.d
 * JD-Core Version:    0.6.2
 */