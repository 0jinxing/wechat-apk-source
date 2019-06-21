package com.tencent.mm.aa;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements a
{
  private JSONArray eIy;

  public b()
  {
    AppMethodBeat.i(117484);
    this.eIy = new JSONArray();
    AppMethodBeat.o(117484);
  }

  public b(String paramString)
  {
    AppMethodBeat.i(117485);
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramString);
      this.eIy = localJSONArray;
      AppMethodBeat.o(117485);
      return;
    }
    catch (JSONException paramString)
    {
      paramString = new g(paramString);
      AppMethodBeat.o(117485);
    }
    throw paramString;
  }

  b(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(117486);
    Assert.assertNotNull(paramJSONArray);
    this.eIy = paramJSONArray;
    AppMethodBeat.o(117486);
  }

  public final a av(Object paramObject)
  {
    AppMethodBeat.i(117492);
    this.eIy.put(paramObject);
    AppMethodBeat.o(117492);
    return this;
  }

  public final a cb(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117495);
    try
    {
      this.eIy.put(paramInt1, paramInt2);
      AppMethodBeat.o(117495);
      return this;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117495);
      throw localg;
    }
  }

  public final a cj(boolean paramBoolean)
  {
    AppMethodBeat.i(117488);
    this.eIy.put(paramBoolean);
    AppMethodBeat.o(117488);
    return this;
  }

  public final a d(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(117494);
    try
    {
      this.eIy.put(paramInt, paramDouble);
      AppMethodBeat.o(117494);
      return this;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117494);
      throw localg;
    }
  }

  public final a d(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(117497);
    try
    {
      this.eIy.put(paramInt, paramObject);
      AppMethodBeat.o(117497);
      return this;
    }
    catch (JSONException paramObject)
    {
      paramObject = new g(paramObject);
      AppMethodBeat.o(117497);
    }
    throw paramObject;
  }

  public final a fb(long paramLong)
  {
    AppMethodBeat.i(117491);
    this.eIy.put(paramLong);
    AppMethodBeat.o(117491);
    return this;
  }

  public final Object get(int paramInt)
  {
    AppMethodBeat.i(117499);
    try
    {
      Object localObject = this.eIy.get(paramInt);
      if ((localObject instanceof JSONObject))
      {
        localObject = new d((JSONObject)localObject);
        AppMethodBeat.o(117499);
      }
      while (true)
      {
        return localObject;
        if ((localObject instanceof JSONArray))
        {
          localObject = new b((JSONArray)localObject);
          AppMethodBeat.o(117499);
        }
        else
        {
          AppMethodBeat.o(117499);
        }
      }
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117499);
      throw localg;
    }
  }

  public final boolean getBoolean(int paramInt)
  {
    AppMethodBeat.i(117502);
    try
    {
      boolean bool = this.eIy.getBoolean(paramInt);
      AppMethodBeat.o(117502);
      return bool;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117502);
      throw localg;
    }
  }

  public final double getDouble(int paramInt)
  {
    AppMethodBeat.i(117505);
    try
    {
      double d = this.eIy.getDouble(paramInt);
      AppMethodBeat.o(117505);
      return d;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117505);
      throw localg;
    }
  }

  public final int getInt(int paramInt)
  {
    AppMethodBeat.i(117508);
    try
    {
      paramInt = this.eIy.getInt(paramInt);
      AppMethodBeat.o(117508);
      return paramInt;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117508);
      throw localg;
    }
  }

  public final long getLong(int paramInt)
  {
    AppMethodBeat.i(117511);
    try
    {
      long l = this.eIy.getLong(paramInt);
      AppMethodBeat.o(117511);
      return l;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117511);
      throw localg;
    }
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(117514);
    try
    {
      String str = this.eIy.getString(paramInt);
      AppMethodBeat.o(117514);
      return str;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117514);
      throw localg;
    }
  }

  public final boolean isNull(int paramInt)
  {
    AppMethodBeat.i(117498);
    boolean bool = this.eIy.isNull(paramInt);
    AppMethodBeat.o(117498);
    return bool;
  }

  public final a jC(int paramInt)
  {
    AppMethodBeat.i(117490);
    this.eIy.put(paramInt);
    AppMethodBeat.o(117490);
    return this;
  }

  public final a jD(int paramInt)
  {
    AppMethodBeat.i(117517);
    try
    {
      Object localObject = this.eIy.getJSONArray(paramInt);
      if (localObject == null)
      {
        localObject = null;
        AppMethodBeat.o(117517);
      }
      while (true)
      {
        return localObject;
        localObject = new b((JSONArray)localObject);
        AppMethodBeat.o(117517);
      }
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117517);
      throw localg;
    }
  }

  public final a jE(int paramInt)
  {
    AppMethodBeat.i(117518);
    Object localObject = this.eIy.optJSONArray(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(117518);
    }
    while (true)
    {
      return localObject;
      localObject = new b((JSONArray)localObject);
      AppMethodBeat.o(117518);
    }
  }

  public final c jF(int paramInt)
  {
    AppMethodBeat.i(117519);
    try
    {
      Object localObject = this.eIy.getJSONObject(paramInt);
      if (localObject == null)
      {
        localObject = null;
        AppMethodBeat.o(117519);
      }
      while (true)
      {
        return localObject;
        localObject = new d((JSONObject)localObject);
        AppMethodBeat.o(117519);
      }
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117519);
      throw localg;
    }
  }

  public final c jG(int paramInt)
  {
    AppMethodBeat.i(117520);
    Object localObject = this.eIy.optJSONObject(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(117520);
    }
    while (true)
    {
      return localObject;
      localObject = new d((JSONObject)localObject);
      AppMethodBeat.o(117520);
    }
  }

  public final int length()
  {
    AppMethodBeat.i(117487);
    int i = this.eIy.length();
    AppMethodBeat.o(117487);
    return i;
  }

  public final a o(double paramDouble)
  {
    AppMethodBeat.i(117489);
    try
    {
      this.eIy.put(paramDouble);
      AppMethodBeat.o(117489);
      return this;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117489);
      throw localg;
    }
  }

  public final Object opt(int paramInt)
  {
    AppMethodBeat.i(117500);
    Object localObject = this.eIy.opt(paramInt);
    if ((localObject instanceof JSONObject))
    {
      localObject = new d((JSONObject)localObject);
      AppMethodBeat.o(117500);
    }
    while (true)
    {
      return localObject;
      if ((localObject instanceof JSONArray))
      {
        localObject = new b((JSONArray)localObject);
        AppMethodBeat.o(117500);
      }
      else
      {
        AppMethodBeat.o(117500);
      }
    }
  }

  public final boolean optBoolean(int paramInt)
  {
    AppMethodBeat.i(117503);
    boolean bool = this.eIy.optBoolean(paramInt);
    AppMethodBeat.o(117503);
    return bool;
  }

  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117504);
    paramBoolean = this.eIy.optBoolean(paramInt, paramBoolean);
    AppMethodBeat.o(117504);
    return paramBoolean;
  }

  public final double optDouble(int paramInt)
  {
    AppMethodBeat.i(117506);
    double d = this.eIy.optDouble(paramInt);
    AppMethodBeat.o(117506);
    return d;
  }

  public final double optDouble(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(117507);
    paramDouble = this.eIy.optDouble(paramInt, paramDouble);
    AppMethodBeat.o(117507);
    return paramDouble;
  }

  public final int optInt(int paramInt)
  {
    AppMethodBeat.i(117509);
    paramInt = this.eIy.optInt(paramInt);
    AppMethodBeat.o(117509);
    return paramInt;
  }

  public final int optInt(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117510);
    paramInt1 = this.eIy.optInt(paramInt1, paramInt2);
    AppMethodBeat.o(117510);
    return paramInt1;
  }

  public final long optLong(int paramInt)
  {
    AppMethodBeat.i(117512);
    long l = this.eIy.optLong(paramInt);
    AppMethodBeat.o(117512);
    return l;
  }

  public final long optLong(int paramInt, long paramLong)
  {
    AppMethodBeat.i(117513);
    paramLong = this.eIy.optLong(paramInt, paramLong);
    AppMethodBeat.o(117513);
    return paramLong;
  }

  public final String optString(int paramInt)
  {
    AppMethodBeat.i(117515);
    String str = this.eIy.optString(paramInt);
    AppMethodBeat.o(117515);
    return str;
  }

  public final String optString(int paramInt, String paramString)
  {
    AppMethodBeat.i(117516);
    paramString = this.eIy.optString(paramInt, paramString);
    AppMethodBeat.o(117516);
    return paramString;
  }

  public final a q(int paramInt, long paramLong)
  {
    AppMethodBeat.i(117496);
    try
    {
      this.eIy.put(paramInt, paramLong);
      AppMethodBeat.o(117496);
      return this;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117496);
      throw localg;
    }
  }

  @TargetApi(19)
  public final Object remove(int paramInt)
  {
    AppMethodBeat.i(117501);
    Object localObject = this.eIy.remove(paramInt);
    if ((localObject instanceof JSONObject))
    {
      localObject = new d((JSONObject)localObject);
      AppMethodBeat.o(117501);
    }
    while (true)
    {
      return localObject;
      if ((localObject instanceof JSONArray))
      {
        localObject = new b((JSONArray)localObject);
        AppMethodBeat.o(117501);
      }
      else
      {
        AppMethodBeat.o(117501);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(117521);
    String str = this.eIy.toString();
    AppMethodBeat.o(117521);
    return str;
  }

  public final String toString(int paramInt)
  {
    AppMethodBeat.i(117522);
    try
    {
      String str = this.eIy.toString(paramInt);
      AppMethodBeat.o(117522);
      return str;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117522);
      throw localg;
    }
  }

  public final a z(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(117493);
    try
    {
      this.eIy.put(paramInt, paramBoolean);
      AppMethodBeat.o(117493);
      return this;
    }
    catch (JSONException localJSONException)
    {
      g localg = new g(localJSONException);
      AppMethodBeat.o(117493);
      throw localg;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.b
 * JD-Core Version:    0.6.2
 */