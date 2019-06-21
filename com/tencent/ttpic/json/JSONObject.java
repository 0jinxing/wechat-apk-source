package com.tencent.ttpic.json;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;

public class JSONObject
{
  public static final Object NULL;
  private final Map map;

  static
  {
    AppMethodBeat.i(50180);
    NULL = new Null(null);
    AppMethodBeat.o(50180);
  }

  public JSONObject()
  {
    AppMethodBeat.i(50114);
    this.map = new HashMap();
    AppMethodBeat.o(50114);
  }

  public JSONObject(JSONObject paramJSONObject, String[] paramArrayOfString)
  {
    this();
    AppMethodBeat.i(50115);
    int i = 0;
    while (true)
    {
      if (i < paramArrayOfString.length);
      try
      {
        putOnce(paramArrayOfString[i], paramJSONObject.opt(paramArrayOfString[i]));
        label32: i++;
        continue;
        AppMethodBeat.o(50115);
        return;
      }
      catch (Exception localException)
      {
        break label32;
      }
    }
  }

  public JSONObject(JSONTokener paramJSONTokener)
  {
    this();
    AppMethodBeat.i(50116);
    if (paramJSONTokener.nextClean() != '{')
    {
      paramJSONTokener = paramJSONTokener.syntaxError("A JSONObject text must begin with '{'");
      AppMethodBeat.o(50116);
      throw paramJSONTokener;
      paramJSONTokener.back();
    }
    String str;
    switch (paramJSONTokener.nextClean())
    {
    default:
      paramJSONTokener.back();
      str = paramJSONTokener.nextValue().toString();
      if (paramJSONTokener.nextClean() != ':')
      {
        paramJSONTokener = paramJSONTokener.syntaxError("Expected a ':' after a key");
        AppMethodBeat.o(50116);
        throw paramJSONTokener;
      }
      break;
    case '\000':
      paramJSONTokener = paramJSONTokener.syntaxError("A JSONObject text must end with '}'");
      AppMethodBeat.o(50116);
      throw paramJSONTokener;
    case '}':
      AppMethodBeat.o(50116);
    }
    while (true)
    {
      return;
      putOnce(str, paramJSONTokener.nextValue());
      switch (paramJSONTokener.nextClean())
      {
      default:
        paramJSONTokener = paramJSONTokener.syntaxError("Expected a ',' or '}'");
        AppMethodBeat.o(50116);
        throw paramJSONTokener;
      case ',':
      case ';':
        if (paramJSONTokener.nextClean() != '}')
          break;
        AppMethodBeat.o(50116);
        break;
      case '}':
        AppMethodBeat.o(50116);
      }
    }
  }

  public JSONObject(Object paramObject)
  {
    this();
    AppMethodBeat.i(50118);
    populateMap(paramObject);
    AppMethodBeat.o(50118);
  }

  public JSONObject(Object paramObject, String[] paramArrayOfString)
  {
    this();
    AppMethodBeat.i(50119);
    Class localClass = paramObject.getClass();
    int i = 0;
    while (true)
    {
      String str;
      if (i < paramArrayOfString.length)
        str = paramArrayOfString[i];
      try
      {
        putOpt(str, localClass.getField(str).get(paramObject));
        label47: i++;
        continue;
        AppMethodBeat.o(50119);
        return;
      }
      catch (Exception localException)
      {
        break label47;
      }
    }
  }

  public JSONObject(String paramString)
  {
    this(new JSONTokener(paramString));
    AppMethodBeat.i(50120);
    AppMethodBeat.o(50120);
  }

  public JSONObject(String paramString, Locale paramLocale)
  {
    this();
    AppMethodBeat.i(50121);
    ResourceBundle localResourceBundle = ResourceBundle.getBundle(paramString, paramLocale, Thread.currentThread().getContextClassLoader());
    Enumeration localEnumeration = localResourceBundle.getKeys();
    while (localEnumeration.hasMoreElements())
    {
      Object localObject = localEnumeration.nextElement();
      if ((localObject instanceof String))
      {
        String[] arrayOfString = ((String)localObject).split("\\.");
        int i = arrayOfString.length - 1;
        int j = 0;
        for (paramLocale = this; j < i; paramLocale = paramString)
        {
          String str = arrayOfString[j];
          JSONObject localJSONObject = paramLocale.optJSONObject(str);
          paramString = localJSONObject;
          if (localJSONObject == null)
          {
            paramString = new JSONObject();
            paramLocale.put(str, paramString);
          }
          j++;
        }
        paramLocale.put(arrayOfString[i], localResourceBundle.getString((String)localObject));
      }
    }
    AppMethodBeat.o(50121);
  }

  public JSONObject(Map paramMap)
  {
    AppMethodBeat.i(50117);
    this.map = new HashMap();
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        Object localObject = paramMap.getValue();
        if (localObject != null)
          this.map.put(paramMap.getKey(), wrap(localObject));
      }
    }
    AppMethodBeat.o(50117);
  }

  public static String doubleToString(double paramDouble)
  {
    AppMethodBeat.i(50124);
    Object localObject;
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble)))
    {
      localObject = "null";
      AppMethodBeat.o(50124);
    }
    while (true)
    {
      return localObject;
      String str = Double.toString(paramDouble);
      localObject = str;
      if (str.indexOf('.') > 0)
      {
        localObject = str;
        if (str.indexOf('e') < 0)
        {
          localObject = str;
          if (str.indexOf('E') < 0)
          {
            while (str.endsWith("0"))
              str = str.substring(0, str.length() - 1);
            localObject = str;
            if (str.endsWith("."))
              localObject = str.substring(0, str.length() - 1);
          }
        }
      }
      AppMethodBeat.o(50124);
    }
  }

  public static String[] getNames(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(50132);
    int i = paramJSONObject.length();
    if (i == 0)
    {
      paramJSONObject = null;
      AppMethodBeat.o(50132);
    }
    while (true)
    {
      return paramJSONObject;
      Iterator localIterator = paramJSONObject.keys();
      paramJSONObject = new String[i];
      for (i = 0; localIterator.hasNext(); i++)
        paramJSONObject[i] = ((String)localIterator.next());
      AppMethodBeat.o(50132);
    }
  }

  public static String[] getNames(Object paramObject)
  {
    Object localObject = null;
    AppMethodBeat.i(50133);
    if (paramObject == null)
    {
      AppMethodBeat.o(50133);
      paramObject = localObject;
    }
    while (true)
    {
      return paramObject;
      Field[] arrayOfField = paramObject.getClass().getFields();
      int i = arrayOfField.length;
      if (i == 0)
      {
        AppMethodBeat.o(50133);
        paramObject = localObject;
      }
      else
      {
        paramObject = new String[i];
        for (int j = 0; j < i; j++)
          paramObject[j] = arrayOfField[j].getName();
        AppMethodBeat.o(50133);
      }
    }
  }

  static final void indent(Writer paramWriter, int paramInt)
  {
    AppMethodBeat.i(50178);
    for (int i = 0; i < paramInt; i++)
      paramWriter.write(32);
    AppMethodBeat.o(50178);
  }

  public static String numberToString(Number paramNumber)
  {
    AppMethodBeat.i(50142);
    if (paramNumber == null)
    {
      paramNumber = new JSONException("Null pointer");
      AppMethodBeat.o(50142);
      throw paramNumber;
    }
    testValidity(paramNumber);
    String str = paramNumber.toString();
    paramNumber = str;
    if (str.indexOf('.') > 0)
    {
      paramNumber = str;
      if (str.indexOf('e') < 0)
      {
        paramNumber = str;
        if (str.indexOf('E') < 0)
        {
          while (str.endsWith("0"))
            str = str.substring(0, str.length() - 1);
          paramNumber = str;
          if (str.endsWith("."))
            paramNumber = str.substring(0, str.length() - 1);
        }
      }
    }
    AppMethodBeat.o(50142);
    return paramNumber;
  }

  private void populateMap(Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(50156);
    Object localObject1 = paramObject.getClass();
    int j;
    if (((Class)localObject1).getClassLoader() != null)
      j = 1;
    while (true)
    {
      Method[] arrayOfMethod;
      label37: Method localMethod;
      if (j != 0)
      {
        arrayOfMethod = ((Class)localObject1).getMethods();
        j = i;
        if (j >= arrayOfMethod.length)
          break label289;
        localMethod = arrayOfMethod[j];
      }
      try
      {
        Object localObject2;
        if (Modifier.isPublic(localMethod.getModifiers()))
        {
          localObject2 = localMethod.getName();
          localObject1 = "";
          if (!((String)localObject2).startsWith("get"))
            break label214;
          if ((!"getClass".equals(localObject2)) && (!"getDeclaringClass".equals(localObject2)))
            break label204;
          localObject1 = "";
          label111: if ((((String)localObject1).length() > 0) && (Character.isUpperCase(((String)localObject1).charAt(0))) && (localMethod.getParameterTypes().length == 0))
          {
            if (((String)localObject1).length() != 1)
              break label235;
            localObject2 = ((String)localObject1).toLowerCase();
          }
        }
        while (true)
        {
          localObject1 = localMethod.invoke(paramObject, null);
          if (localObject1 != null)
            this.map.put(localObject2, wrap(localObject1));
          label180: j++;
          break label37;
          j = 0;
          break;
          arrayOfMethod = ((Class)localObject1).getDeclaredMethods();
          j = i;
          break label37;
          label204: localObject1 = ((String)localObject2).substring(3);
          break label111;
          label214: if (!((String)localObject2).startsWith("is"))
            break label111;
          localObject1 = ((String)localObject2).substring(2);
          break label111;
          label235: localObject2 = localObject1;
          if (!Character.isUpperCase(((String)localObject1).charAt(1)))
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((String)localObject1).substring(0, 1).toLowerCase() + ((String)localObject1).substring(1);
          }
        }
        label289: AppMethodBeat.o(50156);
        return;
      }
      catch (Exception localException)
      {
        break label180;
      }
    }
  }

  public static Writer quote(String paramString, Writer paramWriter)
  {
    AppMethodBeat.i(50167);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramWriter.write("\"\"");
      AppMethodBeat.o(50167);
    }
    while (true)
    {
      return paramWriter;
      int i = paramString.length();
      paramWriter.write(34);
      int j = 0;
      int k = 0;
      if (j < i)
      {
        int m = paramString.charAt(j);
        switch (m)
        {
        default:
          if ((m < 32) || ((m >= 128) && (m < 160)) || ((m >= 8192) && (m < 8448)))
          {
            paramWriter.write("\\u");
            String str = Integer.toHexString(m);
            paramWriter.write("0000", 0, 4 - str.length());
            paramWriter.write(str);
          }
          break;
        case 34:
        case 92:
        case 47:
        case 8:
        case 9:
        case 10:
        case 12:
        case 13:
        }
        while (true)
        {
          j++;
          k = m;
          break;
          paramWriter.write(92);
          paramWriter.write(m);
          continue;
          if (k == 60)
            paramWriter.write(92);
          paramWriter.write(m);
          continue;
          paramWriter.write("\\b");
          continue;
          paramWriter.write("\\t");
          continue;
          paramWriter.write("\\n");
          continue;
          paramWriter.write("\\f");
          continue;
          paramWriter.write("\\r");
        }
      }
      paramWriter.write(34);
      AppMethodBeat.o(50167);
    }
  }

  public static String quote(String paramString)
  {
    AppMethodBeat.i(50166);
    StringWriter localStringWriter = new StringWriter();
    synchronized (localStringWriter.getBuffer())
    {
      try
      {
        paramString = quote(paramString, localStringWriter).toString();
        AppMethodBeat.o(50166);
        return paramString;
      }
      catch (IOException paramString)
      {
        while (true)
        {
          paramString = "";
          AppMethodBeat.o(50166);
        }
      }
    }
  }

  public static Object stringToValue(String paramString)
  {
    AppMethodBeat.i(50169);
    if (paramString.equals(""))
      AppMethodBeat.o(50169);
    while (true)
    {
      return paramString;
      if (paramString.equalsIgnoreCase("true"))
      {
        paramString = Boolean.TRUE;
        AppMethodBeat.o(50169);
      }
      else if (paramString.equalsIgnoreCase("false"))
      {
        paramString = Boolean.FALSE;
        AppMethodBeat.o(50169);
      }
      else if (paramString.equalsIgnoreCase("null"))
      {
        paramString = NULL;
        AppMethodBeat.o(50169);
      }
      else
      {
        int i = paramString.charAt(0);
        if (((i >= 48) && (i <= 57)) || (i == 45))
          try
          {
            if ((paramString.indexOf('.') >= 0) || (paramString.indexOf('e') >= 0) || (paramString.indexOf('E') >= 0))
            {
              localObject = Double.valueOf(paramString);
              if (((Double)localObject).isInfinite())
                break label243;
              boolean bool = ((Double)localObject).isNaN();
              if (bool)
                break label243;
              AppMethodBeat.o(50169);
              paramString = (String)localObject;
              continue;
            }
            Object localObject = new java/lang/Long;
            ((Long)localObject).<init>(paramString);
            if (paramString.equals(((Long)localObject).toString()))
            {
              if (((Long)localObject).longValue() == ((Long)localObject).intValue())
              {
                localObject = new Integer(((Long)localObject).intValue());
                AppMethodBeat.o(50169);
                paramString = (String)localObject;
                continue;
              }
              AppMethodBeat.o(50169);
              paramString = (String)localObject;
            }
          }
          catch (Exception localException)
          {
          }
        else
          label243: AppMethodBeat.o(50169);
      }
    }
  }

  public static void testValidity(Object paramObject)
  {
    AppMethodBeat.i(50170);
    if (paramObject != null)
      if ((paramObject instanceof Double))
      {
        if ((((Double)paramObject).isInfinite()) || (((Double)paramObject).isNaN()))
        {
          paramObject = new JSONException("JSON does not allow non-finite numbers.");
          AppMethodBeat.o(50170);
          throw paramObject;
        }
      }
      else if (((paramObject instanceof Float)) && ((((Float)paramObject).isInfinite()) || (((Float)paramObject).isNaN())))
      {
        paramObject = new JSONException("JSON does not allow non-finite numbers.");
        AppMethodBeat.o(50170);
        throw paramObject;
      }
    AppMethodBeat.o(50170);
  }

  public static String valueToString(Object paramObject)
  {
    AppMethodBeat.i(50174);
    if ((paramObject == null) || (paramObject.equals(null)))
    {
      paramObject = "null";
      AppMethodBeat.o(50174);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof JSONString))
      {
        try
        {
          paramObject = ((JSONString)paramObject).toJSONString();
          if ((paramObject instanceof String))
          {
            paramObject = (String)paramObject;
            AppMethodBeat.o(50174);
          }
        }
        catch (Exception paramObject)
        {
          paramObject = new JSONException(paramObject);
          AppMethodBeat.o(50174);
          throw paramObject;
        }
        paramObject = new JSONException("Bad value from toJSONString: ".concat(String.valueOf(paramObject)));
        AppMethodBeat.o(50174);
        throw paramObject;
      }
      else if ((paramObject instanceof Number))
      {
        paramObject = numberToString((Number)paramObject);
        AppMethodBeat.o(50174);
      }
      else if (((paramObject instanceof Boolean)) || ((paramObject instanceof JSONObject)) || ((paramObject instanceof JSONArray)))
      {
        paramObject = paramObject.toString();
        AppMethodBeat.o(50174);
      }
      else if ((paramObject instanceof Map))
      {
        paramObject = new JSONObject((Map)paramObject).toString();
        AppMethodBeat.o(50174);
      }
      else if ((paramObject instanceof Collection))
      {
        paramObject = new JSONArray((Collection)paramObject).toString();
        AppMethodBeat.o(50174);
      }
      else if (paramObject.getClass().isArray())
      {
        paramObject = new JSONArray(paramObject).toString();
        AppMethodBeat.o(50174);
      }
      else
      {
        paramObject = quote(paramObject.toString());
        AppMethodBeat.o(50174);
      }
    }
  }

  public static Object wrap(Object paramObject)
  {
    AppMethodBeat.i(50175);
    if (paramObject == null);
    try
    {
      paramObject = NULL;
      AppMethodBeat.o(50175);
      while (true)
      {
        return paramObject;
        if ((!(paramObject instanceof JSONObject)) && (!(paramObject instanceof JSONArray)) && (!NULL.equals(paramObject)) && (!(paramObject instanceof JSONString)) && (!(paramObject instanceof Byte)) && (!(paramObject instanceof Character)) && (!(paramObject instanceof Short)) && (!(paramObject instanceof Integer)) && (!(paramObject instanceof Long)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Float)) && (!(paramObject instanceof Double)))
        {
          boolean bool = paramObject instanceof String;
          if (!bool);
        }
        else
        {
          AppMethodBeat.o(50175);
          continue;
        }
        if ((paramObject instanceof Collection))
        {
          paramObject = new JSONArray((Collection)paramObject);
          AppMethodBeat.o(50175);
        }
        else if (paramObject.getClass().isArray())
        {
          paramObject = new JSONArray(paramObject);
          AppMethodBeat.o(50175);
        }
        else if ((paramObject instanceof Map))
        {
          paramObject = new JSONObject((Map)paramObject);
          AppMethodBeat.o(50175);
        }
        else
        {
          Object localObject = paramObject.getClass().getPackage();
          if (localObject != null);
          for (localObject = ((Package)localObject).getName(); ; localObject = "")
          {
            if ((!((String)localObject).startsWith("java.")) && (!((String)localObject).startsWith("javax.")) && (paramObject.getClass().getClassLoader() != null))
              break label279;
            paramObject = paramObject.toString();
            AppMethodBeat.o(50175);
            break;
          }
          label279: paramObject = new JSONObject(paramObject);
          AppMethodBeat.o(50175);
        }
      }
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        paramObject = null;
        AppMethodBeat.o(50175);
      }
    }
  }

  static final Writer writeValue(Writer paramWriter, Object paramObject, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50177);
    if ((paramObject == null) || (paramObject.equals(null)))
      paramWriter.write("null");
    while (true)
    {
      AppMethodBeat.o(50177);
      return paramWriter;
      if ((paramObject instanceof JSONObject))
      {
        ((JSONObject)paramObject).write(paramWriter, paramInt1, paramInt2);
      }
      else if ((paramObject instanceof JSONArray))
      {
        ((JSONArray)paramObject).write(paramWriter, paramInt1, paramInt2);
      }
      else if ((paramObject instanceof Map))
      {
        new JSONObject((Map)paramObject).write(paramWriter, paramInt1, paramInt2);
      }
      else if ((paramObject instanceof Collection))
      {
        new JSONArray((Collection)paramObject).write(paramWriter, paramInt1, paramInt2);
      }
      else if (paramObject.getClass().isArray())
      {
        new JSONArray(paramObject).write(paramWriter, paramInt1, paramInt2);
      }
      else if ((paramObject instanceof Number))
      {
        paramWriter.write(numberToString((Number)paramObject));
      }
      else if ((paramObject instanceof Boolean))
      {
        paramWriter.write(paramObject.toString());
      }
      else
      {
        if ((paramObject instanceof JSONString))
          while (true)
          {
            try
            {
              String str = ((JSONString)paramObject).toJSONString();
              if (str != null)
              {
                paramObject = str.toString();
                paramWriter.write(paramObject);
              }
            }
            catch (Exception paramWriter)
            {
              paramWriter = new JSONException(paramWriter);
              AppMethodBeat.o(50177);
              throw paramWriter;
            }
            paramObject = quote(paramObject.toString());
          }
        quote(paramObject.toString(), paramWriter);
      }
    }
  }

  public JSONObject accumulate(String paramString, Object paramObject)
  {
    AppMethodBeat.i(50122);
    testValidity(paramObject);
    Object localObject = opt(paramString);
    if (localObject == null)
    {
      localObject = paramObject;
      if ((paramObject instanceof JSONArray))
        localObject = new JSONArray().put(paramObject);
      put(paramString, localObject);
    }
    while (true)
    {
      AppMethodBeat.o(50122);
      return this;
      if ((localObject instanceof JSONArray))
        ((JSONArray)localObject).put(paramObject);
      else
        put(paramString, new JSONArray().put(localObject).put(paramObject));
    }
  }

  public JSONObject append(String paramString, Object paramObject)
  {
    AppMethodBeat.i(50123);
    testValidity(paramObject);
    Object localObject = opt(paramString);
    if (localObject == null)
      put(paramString, new JSONArray().put(paramObject));
    while (true)
    {
      AppMethodBeat.o(50123);
      return this;
      if (!(localObject instanceof JSONArray))
        break;
      put(paramString, ((JSONArray)localObject).put(paramObject));
    }
    paramString = new JSONException("JSONObject[" + paramString + "] is not a JSONArray.");
    AppMethodBeat.o(50123);
    throw paramString;
  }

  public Object get(String paramString)
  {
    AppMethodBeat.i(50125);
    if (paramString == null)
    {
      paramString = new JSONException("Null key.");
      AppMethodBeat.o(50125);
      throw paramString;
    }
    Object localObject = opt(paramString);
    if (localObject == null)
    {
      paramString = new JSONException("JSONObject[" + quote(paramString) + "] not found.");
      AppMethodBeat.o(50125);
      throw paramString;
    }
    AppMethodBeat.o(50125);
    return localObject;
  }

  public boolean getBoolean(String paramString)
  {
    AppMethodBeat.i(50126);
    Object localObject = get(paramString);
    boolean bool;
    if ((localObject.equals(Boolean.FALSE)) || (((localObject instanceof String)) && (((String)localObject).equalsIgnoreCase("false"))))
    {
      bool = false;
      AppMethodBeat.o(50126);
    }
    while (true)
    {
      return bool;
      if ((!localObject.equals(Boolean.TRUE)) && ((!(localObject instanceof String)) || (!((String)localObject).equalsIgnoreCase("true"))))
        break;
      bool = true;
      AppMethodBeat.o(50126);
    }
    paramString = new JSONException("JSONObject[" + quote(paramString) + "] is not a Boolean.");
    AppMethodBeat.o(50126);
    throw paramString;
  }

  public double getDouble(String paramString)
  {
    AppMethodBeat.i(50127);
    Object localObject = get(paramString);
    try
    {
      double d;
      if ((localObject instanceof Number))
      {
        d = ((Number)localObject).doubleValue();
        AppMethodBeat.o(50127);
      }
      while (true)
      {
        return d;
        d = Double.parseDouble((String)localObject);
        AppMethodBeat.o(50127);
      }
    }
    catch (Exception localException)
    {
      paramString = new JSONException("JSONObject[" + quote(paramString) + "] is not a number.");
      AppMethodBeat.o(50127);
    }
    throw paramString;
  }

  public int getInt(String paramString)
  {
    AppMethodBeat.i(50128);
    Object localObject = get(paramString);
    try
    {
      int i;
      if ((localObject instanceof Number))
      {
        i = ((Number)localObject).intValue();
        AppMethodBeat.o(50128);
      }
      while (true)
      {
        return i;
        i = Integer.parseInt((String)localObject);
        AppMethodBeat.o(50128);
      }
    }
    catch (Exception localException)
    {
      paramString = new JSONException("JSONObject[" + quote(paramString) + "] is not an int.");
      AppMethodBeat.o(50128);
    }
    throw paramString;
  }

  public JSONArray getJSONArray(String paramString)
  {
    AppMethodBeat.i(50129);
    Object localObject = get(paramString);
    if ((localObject instanceof JSONArray))
    {
      paramString = (JSONArray)localObject;
      AppMethodBeat.o(50129);
      return paramString;
    }
    paramString = new JSONException("JSONObject[" + quote(paramString) + "] is not a JSONArray.");
    AppMethodBeat.o(50129);
    throw paramString;
  }

  public JSONObject getJSONObject(String paramString)
  {
    AppMethodBeat.i(50130);
    Object localObject = get(paramString);
    if ((localObject instanceof JSONObject))
    {
      paramString = (JSONObject)localObject;
      AppMethodBeat.o(50130);
      return paramString;
    }
    paramString = new JSONException("JSONObject[" + quote(paramString) + "] is not a JSONObject.");
    AppMethodBeat.o(50130);
    throw paramString;
  }

  public long getLong(String paramString)
  {
    AppMethodBeat.i(50131);
    Object localObject = get(paramString);
    try
    {
      long l;
      if ((localObject instanceof Number))
      {
        l = ((Number)localObject).longValue();
        AppMethodBeat.o(50131);
      }
      while (true)
      {
        return l;
        l = Long.parseLong((String)localObject);
        AppMethodBeat.o(50131);
      }
    }
    catch (Exception localException)
    {
      paramString = new JSONException("JSONObject[" + quote(paramString) + "] is not a long.");
      AppMethodBeat.o(50131);
    }
    throw paramString;
  }

  public String getString(String paramString)
  {
    AppMethodBeat.i(50134);
    Object localObject = get(paramString);
    if ((localObject instanceof String))
    {
      paramString = (String)localObject;
      AppMethodBeat.o(50134);
      return paramString;
    }
    paramString = new JSONException("JSONObject[" + quote(paramString) + "] not a string.");
    AppMethodBeat.o(50134);
    throw paramString;
  }

  public boolean has(String paramString)
  {
    AppMethodBeat.i(50135);
    boolean bool = this.map.containsKey(paramString);
    AppMethodBeat.o(50135);
    return bool;
  }

  public JSONObject increment(String paramString)
  {
    AppMethodBeat.i(50136);
    Object localObject = opt(paramString);
    if (localObject == null)
      put(paramString, 1);
    while (true)
    {
      AppMethodBeat.o(50136);
      return this;
      if ((localObject instanceof Integer))
      {
        put(paramString, ((Integer)localObject).intValue() + 1);
      }
      else if ((localObject instanceof Long))
      {
        put(paramString, ((Long)localObject).longValue() + 1L);
      }
      else if ((localObject instanceof Double))
      {
        put(paramString, ((Double)localObject).doubleValue() + 1.0D);
      }
      else
      {
        if (!(localObject instanceof Float))
          break;
        put(paramString, ((Float)localObject).floatValue() + 1.0F);
      }
    }
    paramString = new JSONException("Unable to increment [" + quote(paramString) + "].");
    AppMethodBeat.o(50136);
    throw paramString;
  }

  public boolean isNull(String paramString)
  {
    AppMethodBeat.i(50137);
    boolean bool = NULL.equals(opt(paramString));
    AppMethodBeat.o(50137);
    return bool;
  }

  public Set keySet()
  {
    AppMethodBeat.i(50139);
    Set localSet = this.map.keySet();
    AppMethodBeat.o(50139);
    return localSet;
  }

  public Iterator keys()
  {
    AppMethodBeat.i(50138);
    Iterator localIterator = keySet().iterator();
    AppMethodBeat.o(50138);
    return localIterator;
  }

  public int length()
  {
    AppMethodBeat.i(50140);
    int i = this.map.size();
    AppMethodBeat.o(50140);
    return i;
  }

  public JSONArray names()
  {
    AppMethodBeat.i(50141);
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = keys();
    while (localIterator.hasNext())
      localJSONArray.put(localIterator.next());
    if (localJSONArray.length() == 0)
    {
      localJSONArray = null;
      AppMethodBeat.o(50141);
    }
    while (true)
    {
      return localJSONArray;
      AppMethodBeat.o(50141);
    }
  }

  public Object opt(String paramString)
  {
    AppMethodBeat.i(50143);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(50143);
    }
    while (true)
    {
      return paramString;
      paramString = this.map.get(paramString);
      AppMethodBeat.o(50143);
    }
  }

  public boolean optBoolean(String paramString)
  {
    AppMethodBeat.i(50144);
    boolean bool = optBoolean(paramString, false);
    AppMethodBeat.o(50144);
    return bool;
  }

  public boolean optBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(50145);
    try
    {
      boolean bool = getBoolean(paramString);
      paramBoolean = bool;
      AppMethodBeat.o(50145);
      return paramBoolean;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(50145);
    }
  }

  public double optDouble(String paramString)
  {
    AppMethodBeat.i(50146);
    double d = optDouble(paramString, (0.0D / 0.0D));
    AppMethodBeat.o(50146);
    return d;
  }

  public double optDouble(String paramString, double paramDouble)
  {
    AppMethodBeat.i(50147);
    try
    {
      double d = getDouble(paramString);
      paramDouble = d;
      AppMethodBeat.o(50147);
      return paramDouble;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(50147);
    }
  }

  public int optInt(String paramString)
  {
    AppMethodBeat.i(50148);
    int i = optInt(paramString, 0);
    AppMethodBeat.o(50148);
    return i;
  }

  public int optInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(50149);
    try
    {
      int i = getInt(paramString);
      paramInt = i;
      AppMethodBeat.o(50149);
      return paramInt;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(50149);
    }
  }

  public JSONArray optJSONArray(String paramString)
  {
    AppMethodBeat.i(50150);
    paramString = opt(paramString);
    if ((paramString instanceof JSONArray))
    {
      paramString = (JSONArray)paramString;
      AppMethodBeat.o(50150);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(50150);
    }
  }

  public JSONObject optJSONObject(String paramString)
  {
    AppMethodBeat.i(50151);
    paramString = opt(paramString);
    if ((paramString instanceof JSONObject))
    {
      paramString = (JSONObject)paramString;
      AppMethodBeat.o(50151);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(50151);
    }
  }

  public long optLong(String paramString)
  {
    AppMethodBeat.i(50152);
    long l = optLong(paramString, 0L);
    AppMethodBeat.o(50152);
    return l;
  }

  public long optLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(50153);
    try
    {
      long l = getLong(paramString);
      paramLong = l;
      AppMethodBeat.o(50153);
      return paramLong;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(50153);
    }
  }

  public String optString(String paramString)
  {
    AppMethodBeat.i(50154);
    paramString = optString(paramString, "");
    AppMethodBeat.o(50154);
    return paramString;
  }

  public String optString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(50155);
    paramString1 = opt(paramString1);
    if (NULL.equals(paramString1))
      AppMethodBeat.o(50155);
    while (true)
    {
      return paramString2;
      paramString2 = paramString1.toString();
      AppMethodBeat.o(50155);
    }
  }

  public JSONObject put(String paramString, double paramDouble)
  {
    AppMethodBeat.i(50159);
    put(paramString, Double.valueOf(paramDouble));
    AppMethodBeat.o(50159);
    return this;
  }

  public JSONObject put(String paramString, int paramInt)
  {
    AppMethodBeat.i(50160);
    put(paramString, Integer.valueOf(paramInt));
    AppMethodBeat.o(50160);
    return this;
  }

  public JSONObject put(String paramString, long paramLong)
  {
    AppMethodBeat.i(50161);
    put(paramString, new Long(paramLong));
    AppMethodBeat.o(50161);
    return this;
  }

  public JSONObject put(String paramString, Object paramObject)
  {
    AppMethodBeat.i(50163);
    if (paramString == null)
    {
      paramString = new NullPointerException("Null key.");
      AppMethodBeat.o(50163);
      throw paramString;
    }
    if (paramObject != null)
    {
      testValidity(paramObject);
      this.map.put(paramString, paramObject);
    }
    while (true)
    {
      AppMethodBeat.o(50163);
      return this;
      remove(paramString);
    }
  }

  public JSONObject put(String paramString, Collection paramCollection)
  {
    AppMethodBeat.i(50158);
    put(paramString, new JSONArray(paramCollection));
    AppMethodBeat.o(50158);
    return this;
  }

  public JSONObject put(String paramString, Map paramMap)
  {
    AppMethodBeat.i(50162);
    put(paramString, new JSONObject(paramMap));
    AppMethodBeat.o(50162);
    return this;
  }

  public JSONObject put(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(50157);
    if (paramBoolean);
    for (Boolean localBoolean = Boolean.TRUE; ; localBoolean = Boolean.FALSE)
    {
      put(paramString, localBoolean);
      AppMethodBeat.o(50157);
      return this;
    }
  }

  public JSONObject putOnce(String paramString, Object paramObject)
  {
    AppMethodBeat.i(50164);
    if ((paramString != null) && (paramObject != null))
    {
      if (opt(paramString) != null)
      {
        paramString = new JSONException("Duplicate key \"" + paramString + "\"");
        AppMethodBeat.o(50164);
        throw paramString;
      }
      put(paramString, paramObject);
    }
    AppMethodBeat.o(50164);
    return this;
  }

  public JSONObject putOpt(String paramString, Object paramObject)
  {
    AppMethodBeat.i(50165);
    if ((paramString != null) && (paramObject != null))
      put(paramString, paramObject);
    AppMethodBeat.o(50165);
    return this;
  }

  public Object remove(String paramString)
  {
    AppMethodBeat.i(50168);
    paramString = this.map.remove(paramString);
    AppMethodBeat.o(50168);
    return paramString;
  }

  public JSONArray toJSONArray(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(50171);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      paramJSONArray = null;
      AppMethodBeat.o(50171);
    }
    while (true)
    {
      return paramJSONArray;
      JSONArray localJSONArray = new JSONArray();
      for (int i = 0; i < paramJSONArray.length(); i++)
        localJSONArray.put(opt(paramJSONArray.getString(i)));
      AppMethodBeat.o(50171);
      paramJSONArray = localJSONArray;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(50172);
    try
    {
      String str = toString(0);
      AppMethodBeat.o(50172);
      return str;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(50172);
      }
    }
  }

  public String toString(int paramInt)
  {
    AppMethodBeat.i(50173);
    Object localObject1 = new StringWriter();
    synchronized (((StringWriter)localObject1).getBuffer())
    {
      localObject1 = write((Writer)localObject1, paramInt, 0).toString();
      AppMethodBeat.o(50173);
      return localObject1;
    }
  }

  public Writer write(Writer paramWriter)
  {
    AppMethodBeat.i(50176);
    paramWriter = write(paramWriter, 0, 0);
    AppMethodBeat.o(50176);
    return paramWriter;
  }

  Writer write(Writer paramWriter, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50179);
    int i = 0;
    try
    {
      int j = length();
      Iterator localIterator = keys();
      paramWriter.write(123);
      Object localObject;
      if (j == 1)
      {
        localObject = localIterator.next();
        paramWriter.write(quote(localObject.toString()));
        paramWriter.write(58);
        if (paramInt1 > 0)
          paramWriter.write(32);
        writeValue(paramWriter, this.map.get(localObject), paramInt1, paramInt2);
      }
      while (true)
      {
        paramWriter.write(125);
        AppMethodBeat.o(50179);
        return paramWriter;
        if (j != 0)
        {
          j = paramInt2 + paramInt1;
          while (localIterator.hasNext())
          {
            localObject = localIterator.next();
            if (i != 0)
              paramWriter.write(44);
            if (paramInt1 > 0)
              paramWriter.write(10);
            indent(paramWriter, j);
            paramWriter.write(quote(localObject.toString()));
            paramWriter.write(58);
            if (paramInt1 > 0)
              paramWriter.write(32);
            writeValue(paramWriter, this.map.get(localObject), paramInt1, j);
            i = 1;
          }
          if (paramInt1 > 0)
            paramWriter.write(10);
          indent(paramWriter, paramInt2);
        }
      }
    }
    catch (IOException paramWriter)
    {
      paramWriter = new JSONException(paramWriter);
      AppMethodBeat.o(50179);
    }
    throw paramWriter;
  }

  static final class Null
  {
    protected final Object clone()
    {
      return this;
    }

    public final boolean equals(Object paramObject)
    {
      if ((paramObject == null) || (paramObject == this));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final String toString()
    {
      return "null";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.json.JSONObject
 * JD-Core Version:    0.6.2
 */