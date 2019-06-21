package com.tencent.ttpic.json;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class JSONArray
{
  private final ArrayList myArrayList;

  public JSONArray()
  {
    AppMethodBeat.i(50057);
    this.myArrayList = new ArrayList();
    AppMethodBeat.o(50057);
  }

  public JSONArray(JSONTokener paramJSONTokener)
  {
    this();
    AppMethodBeat.i(50058);
    if (paramJSONTokener.nextClean() != '[')
    {
      paramJSONTokener = paramJSONTokener.syntaxError("A JSONArray text must start with '['");
      AppMethodBeat.o(50058);
      throw paramJSONTokener;
    }
    if (paramJSONTokener.nextClean() != ']')
    {
      paramJSONTokener.back();
      if (paramJSONTokener.nextClean() == ',')
      {
        paramJSONTokener.back();
        this.myArrayList.add(JSONObject.NULL);
      }
      while (true)
        switch (paramJSONTokener.nextClean())
        {
        default:
          paramJSONTokener = paramJSONTokener.syntaxError("Expected a ',' or ']'");
          AppMethodBeat.o(50058);
          throw paramJSONTokener;
          paramJSONTokener.back();
          this.myArrayList.add(paramJSONTokener.nextValue());
        case ',':
        case ']':
        }
      if (paramJSONTokener.nextClean() == ']')
        AppMethodBeat.o(50058);
    }
    while (true)
    {
      return;
      paramJSONTokener.back();
      break;
      AppMethodBeat.o(50058);
      continue;
      AppMethodBeat.o(50058);
    }
  }

  public JSONArray(Object paramObject)
  {
    this();
    AppMethodBeat.i(50061);
    if (paramObject.getClass().isArray())
    {
      int i = Array.getLength(paramObject);
      for (int j = 0; j < i; j++)
        put(JSONObject.wrap(Array.get(paramObject, j)));
      AppMethodBeat.o(50061);
      return;
    }
    paramObject = new JSONException("JSONArray initial value should be a string or collection or array.");
    AppMethodBeat.o(50061);
    throw paramObject;
  }

  public JSONArray(String paramString)
  {
    this(new JSONTokener(paramString));
    AppMethodBeat.i(50059);
    AppMethodBeat.o(50059);
  }

  public JSONArray(Collection paramCollection)
  {
    AppMethodBeat.i(50060);
    this.myArrayList = new ArrayList();
    if (paramCollection != null)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
        this.myArrayList.add(JSONObject.wrap(paramCollection.next()));
    }
    AppMethodBeat.o(50060);
  }

  public Object get(int paramInt)
  {
    AppMethodBeat.i(50062);
    Object localObject = opt(paramInt);
    if (localObject == null)
    {
      localObject = new JSONException("JSONArray[" + paramInt + "] not found.");
      AppMethodBeat.o(50062);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(50062);
    return localObject;
  }

  public boolean getBoolean(int paramInt)
  {
    AppMethodBeat.i(50063);
    Object localObject = get(paramInt);
    boolean bool;
    if ((localObject.equals(Boolean.FALSE)) || (((localObject instanceof String)) && (((String)localObject).equalsIgnoreCase("false"))))
    {
      bool = false;
      AppMethodBeat.o(50063);
    }
    while (true)
    {
      return bool;
      if ((!localObject.equals(Boolean.TRUE)) && ((!(localObject instanceof String)) || (!((String)localObject).equalsIgnoreCase("true"))))
        break;
      bool = true;
      AppMethodBeat.o(50063);
    }
    localObject = new JSONException("JSONArray[" + paramInt + "] is not a boolean.");
    AppMethodBeat.o(50063);
    throw ((Throwable)localObject);
  }

  public double getDouble(int paramInt)
  {
    AppMethodBeat.i(50064);
    Object localObject = get(paramInt);
    try
    {
      double d;
      if ((localObject instanceof Number))
      {
        d = ((Number)localObject).doubleValue();
        AppMethodBeat.o(50064);
      }
      while (true)
      {
        return d;
        d = Double.parseDouble((String)localObject);
        AppMethodBeat.o(50064);
      }
    }
    catch (Exception localException)
    {
      JSONException localJSONException = new JSONException("JSONArray[" + paramInt + "] is not a number.");
      AppMethodBeat.o(50064);
      throw localJSONException;
    }
  }

  public int getInt(int paramInt)
  {
    AppMethodBeat.i(50065);
    Object localObject = get(paramInt);
    try
    {
      int i;
      if ((localObject instanceof Number))
      {
        i = ((Number)localObject).intValue();
        AppMethodBeat.o(50065);
        paramInt = i;
      }
      while (true)
      {
        return paramInt;
        i = Integer.parseInt((String)localObject);
        paramInt = i;
        AppMethodBeat.o(50065);
      }
    }
    catch (Exception localException)
    {
      JSONException localJSONException = new JSONException("JSONArray[" + paramInt + "] is not a number.");
      AppMethodBeat.o(50065);
      throw localJSONException;
    }
  }

  public JSONArray getJSONArray(int paramInt)
  {
    AppMethodBeat.i(50066);
    Object localObject = get(paramInt);
    if ((localObject instanceof JSONArray))
    {
      localObject = (JSONArray)localObject;
      AppMethodBeat.o(50066);
      return localObject;
    }
    localObject = new JSONException("JSONArray[" + paramInt + "] is not a JSONArray.");
    AppMethodBeat.o(50066);
    throw ((Throwable)localObject);
  }

  public JSONObject getJSONObject(int paramInt)
  {
    AppMethodBeat.i(50067);
    Object localObject = get(paramInt);
    if ((localObject instanceof JSONObject))
    {
      localObject = (JSONObject)localObject;
      AppMethodBeat.o(50067);
      return localObject;
    }
    localObject = new JSONException("JSONArray[" + paramInt + "] is not a JSONObject.");
    AppMethodBeat.o(50067);
    throw ((Throwable)localObject);
  }

  public long getLong(int paramInt)
  {
    AppMethodBeat.i(50068);
    Object localObject = get(paramInt);
    try
    {
      long l;
      if ((localObject instanceof Number))
      {
        l = ((Number)localObject).longValue();
        AppMethodBeat.o(50068);
      }
      while (true)
      {
        return l;
        l = Long.parseLong((String)localObject);
        AppMethodBeat.o(50068);
      }
    }
    catch (Exception localException)
    {
      JSONException localJSONException = new JSONException("JSONArray[" + paramInt + "] is not a number.");
      AppMethodBeat.o(50068);
      throw localJSONException;
    }
  }

  public String getString(int paramInt)
  {
    AppMethodBeat.i(50069);
    Object localObject = get(paramInt);
    if ((localObject instanceof String))
    {
      localObject = (String)localObject;
      AppMethodBeat.o(50069);
      return localObject;
    }
    localObject = new JSONException("JSONArray[" + paramInt + "] not a string.");
    AppMethodBeat.o(50069);
    throw ((Throwable)localObject);
  }

  public boolean isNull(int paramInt)
  {
    AppMethodBeat.i(50070);
    boolean bool = JSONObject.NULL.equals(opt(paramInt));
    AppMethodBeat.o(50070);
    return bool;
  }

  public String join(String paramString)
  {
    AppMethodBeat.i(50071);
    int i = length();
    StringBuffer localStringBuffer = new StringBuffer();
    for (int j = 0; j < i; j++)
    {
      if (j > 0)
        localStringBuffer.append(paramString);
      localStringBuffer.append(JSONObject.valueToString(this.myArrayList.get(j)));
    }
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(50071);
    return paramString;
  }

  public int length()
  {
    AppMethodBeat.i(50072);
    int i = this.myArrayList.size();
    AppMethodBeat.o(50072);
    return i;
  }

  public Object opt(int paramInt)
  {
    AppMethodBeat.i(50073);
    Object localObject;
    if ((paramInt < 0) || (paramInt >= length()))
    {
      localObject = null;
      AppMethodBeat.o(50073);
    }
    while (true)
    {
      return localObject;
      localObject = this.myArrayList.get(paramInt);
      AppMethodBeat.o(50073);
    }
  }

  public boolean optBoolean(int paramInt)
  {
    AppMethodBeat.i(50074);
    boolean bool = optBoolean(paramInt, false);
    AppMethodBeat.o(50074);
    return bool;
  }

  public boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(50075);
    try
    {
      boolean bool = getBoolean(paramInt);
      paramBoolean = bool;
      AppMethodBeat.o(50075);
      return paramBoolean;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(50075);
    }
  }

  public double optDouble(int paramInt)
  {
    AppMethodBeat.i(50076);
    double d = optDouble(paramInt, (0.0D / 0.0D));
    AppMethodBeat.o(50076);
    return d;
  }

  public double optDouble(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(50077);
    try
    {
      double d = getDouble(paramInt);
      paramDouble = d;
      AppMethodBeat.o(50077);
      return paramDouble;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(50077);
    }
  }

  public int optInt(int paramInt)
  {
    AppMethodBeat.i(50078);
    paramInt = optInt(paramInt, 0);
    AppMethodBeat.o(50078);
    return paramInt;
  }

  public int optInt(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50079);
    try
    {
      paramInt1 = getInt(paramInt1);
      AppMethodBeat.o(50079);
      return paramInt1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(50079);
        paramInt1 = paramInt2;
      }
    }
  }

  public JSONArray optJSONArray(int paramInt)
  {
    AppMethodBeat.i(50080);
    Object localObject = opt(paramInt);
    if ((localObject instanceof JSONArray))
    {
      localObject = (JSONArray)localObject;
      AppMethodBeat.o(50080);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(50080);
    }
  }

  public JSONObject optJSONObject(int paramInt)
  {
    AppMethodBeat.i(50081);
    Object localObject = opt(paramInt);
    if ((localObject instanceof JSONObject))
    {
      localObject = (JSONObject)localObject;
      AppMethodBeat.o(50081);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(50081);
    }
  }

  public long optLong(int paramInt)
  {
    AppMethodBeat.i(50082);
    long l = optLong(paramInt, 0L);
    AppMethodBeat.o(50082);
    return l;
  }

  public long optLong(int paramInt, long paramLong)
  {
    AppMethodBeat.i(50083);
    try
    {
      long l = getLong(paramInt);
      paramLong = l;
      AppMethodBeat.o(50083);
      return paramLong;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(50083);
    }
  }

  public String optString(int paramInt)
  {
    AppMethodBeat.i(50084);
    String str = optString(paramInt, "");
    AppMethodBeat.o(50084);
    return str;
  }

  public String optString(int paramInt, String paramString)
  {
    AppMethodBeat.i(50085);
    Object localObject = opt(paramInt);
    if (JSONObject.NULL.equals(localObject))
      AppMethodBeat.o(50085);
    while (true)
    {
      return paramString;
      paramString = localObject.toString();
      AppMethodBeat.o(50085);
    }
  }

  public JSONArray put(double paramDouble)
  {
    AppMethodBeat.i(50088);
    Double localDouble = Double.valueOf(paramDouble);
    JSONObject.testValidity(localDouble);
    put(localDouble);
    AppMethodBeat.o(50088);
    return this;
  }

  public JSONArray put(int paramInt)
  {
    AppMethodBeat.i(50089);
    put(Integer.valueOf(paramInt));
    AppMethodBeat.o(50089);
    return this;
  }

  public JSONArray put(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(50095);
    put(paramInt, Double.valueOf(paramDouble));
    AppMethodBeat.o(50095);
    return this;
  }

  public JSONArray put(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50096);
    put(paramInt1, Integer.valueOf(paramInt2));
    AppMethodBeat.o(50096);
    return this;
  }

  public JSONArray put(int paramInt, long paramLong)
  {
    AppMethodBeat.i(50097);
    put(paramInt, new Long(paramLong));
    AppMethodBeat.o(50097);
    return this;
  }

  public JSONArray put(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(50099);
    JSONObject.testValidity(paramObject);
    if (paramInt < 0)
    {
      paramObject = new JSONException("JSONArray[" + paramInt + "] not found.");
      AppMethodBeat.o(50099);
      throw paramObject;
    }
    if (paramInt < length())
      this.myArrayList.set(paramInt, paramObject);
    while (true)
    {
      AppMethodBeat.o(50099);
      return this;
      while (paramInt != length())
        put(JSONObject.NULL);
      put(paramObject);
    }
  }

  public JSONArray put(int paramInt, Collection paramCollection)
  {
    AppMethodBeat.i(50094);
    put(paramInt, new JSONArray(paramCollection));
    AppMethodBeat.o(50094);
    return this;
  }

  public JSONArray put(int paramInt, Map paramMap)
  {
    AppMethodBeat.i(50098);
    put(paramInt, new JSONObject(paramMap));
    AppMethodBeat.o(50098);
    return this;
  }

  public JSONArray put(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(50093);
    if (paramBoolean);
    for (Boolean localBoolean = Boolean.TRUE; ; localBoolean = Boolean.FALSE)
    {
      put(paramInt, localBoolean);
      AppMethodBeat.o(50093);
      return this;
    }
  }

  public JSONArray put(long paramLong)
  {
    AppMethodBeat.i(50090);
    put(new Long(paramLong));
    AppMethodBeat.o(50090);
    return this;
  }

  public JSONArray put(Object paramObject)
  {
    AppMethodBeat.i(50092);
    this.myArrayList.add(paramObject);
    AppMethodBeat.o(50092);
    return this;
  }

  public JSONArray put(Collection paramCollection)
  {
    AppMethodBeat.i(50087);
    put(new JSONArray(paramCollection));
    AppMethodBeat.o(50087);
    return this;
  }

  public JSONArray put(Map paramMap)
  {
    AppMethodBeat.i(50091);
    put(new JSONObject(paramMap));
    AppMethodBeat.o(50091);
    return this;
  }

  public JSONArray put(boolean paramBoolean)
  {
    AppMethodBeat.i(50086);
    if (paramBoolean);
    for (Boolean localBoolean = Boolean.TRUE; ; localBoolean = Boolean.FALSE)
    {
      put(localBoolean);
      AppMethodBeat.o(50086);
      return this;
    }
  }

  public Object remove(int paramInt)
  {
    AppMethodBeat.i(50100);
    Object localObject = opt(paramInt);
    this.myArrayList.remove(paramInt);
    AppMethodBeat.o(50100);
    return localObject;
  }

  public JSONObject toJSONObject(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(50101);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0) || (length() == 0))
    {
      paramJSONArray = null;
      AppMethodBeat.o(50101);
    }
    while (true)
    {
      return paramJSONArray;
      JSONObject localJSONObject = new JSONObject();
      for (int i = 0; i < paramJSONArray.length(); i++)
        localJSONObject.put(paramJSONArray.getString(i), opt(i));
      AppMethodBeat.o(50101);
      paramJSONArray = localJSONObject;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(50102);
    try
    {
      String str = toString(0);
      AppMethodBeat.o(50102);
      return str;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(50102);
      }
    }
  }

  public String toString(int paramInt)
  {
    AppMethodBeat.i(50103);
    Object localObject1 = new StringWriter();
    synchronized (((StringWriter)localObject1).getBuffer())
    {
      localObject1 = write((Writer)localObject1, paramInt, 0).toString();
      AppMethodBeat.o(50103);
      return localObject1;
    }
  }

  public Writer write(Writer paramWriter)
  {
    AppMethodBeat.i(50104);
    paramWriter = write(paramWriter, 0, 0);
    AppMethodBeat.o(50104);
    return paramWriter;
  }

  Writer write(Writer paramWriter, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50105);
    try
    {
      int i = length();
      paramWriter.write(91);
      if (i == 1)
        JSONObject.writeValue(paramWriter, this.myArrayList.get(0), paramInt1, paramInt2);
      while (true)
      {
        paramWriter.write(93);
        AppMethodBeat.o(50105);
        return paramWriter;
        if (i != 0)
        {
          int j = paramInt2 + paramInt1;
          int k = 0;
          for (int m = 0; k < i; m = 1)
          {
            if (m != 0)
              paramWriter.write(44);
            if (paramInt1 > 0)
              paramWriter.write(10);
            JSONObject.indent(paramWriter, j);
            JSONObject.writeValue(paramWriter, this.myArrayList.get(k), paramInt1, j);
            k++;
          }
          if (paramInt1 > 0)
            paramWriter.write(10);
          JSONObject.indent(paramWriter, paramInt2);
        }
      }
    }
    catch (IOException paramWriter)
    {
      paramWriter = new JSONException(paramWriter);
      AppMethodBeat.o(50105);
    }
    throw paramWriter;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.json.JSONArray
 * JD-Core Version:    0.6.2
 */