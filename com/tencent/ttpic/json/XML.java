package com.tencent.ttpic.json;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public class XML
{
  public static final Character AMP;
  public static final Character APOS;
  public static final Character BANG;
  public static final Character EQ;
  public static final Character GT;
  public static final Character LT;
  public static final Character QUEST;
  public static final Character QUOT;
  public static final Character SLASH;

  static
  {
    AppMethodBeat.i(50222);
    AMP = Character.valueOf('&');
    APOS = Character.valueOf('\'');
    BANG = Character.valueOf('!');
    EQ = Character.valueOf('=');
    GT = Character.valueOf('>');
    LT = Character.valueOf('<');
    QUEST = Character.valueOf('?');
    QUOT = Character.valueOf('"');
    SLASH = Character.valueOf('/');
    AppMethodBeat.o(50222);
  }

  public static String escape(String paramString)
  {
    AppMethodBeat.i(50215);
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    int j = paramString.length();
    if (i < j)
    {
      char c = paramString.charAt(i);
      switch (c)
      {
      default:
        localStringBuffer.append(c);
      case '&':
      case '<':
      case '>':
      case '"':
      case '\'':
      }
      while (true)
      {
        i++;
        break;
        localStringBuffer.append("&amp;");
        continue;
        localStringBuffer.append("&lt;");
        continue;
        localStringBuffer.append("&gt;");
        continue;
        localStringBuffer.append("&quot;");
        continue;
        localStringBuffer.append("&apos;");
      }
    }
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(50215);
    return paramString;
  }

  public static void noSpace(String paramString)
  {
    AppMethodBeat.i(50216);
    int i = paramString.length();
    if (i == 0)
    {
      paramString = new JSONException("Empty string.");
      AppMethodBeat.o(50216);
      throw paramString;
    }
    for (int j = 0; j < i; j++)
      if (Character.isWhitespace(paramString.charAt(j)))
      {
        paramString = new JSONException("'" + paramString + "' contains a space character.");
        AppMethodBeat.o(50216);
        throw paramString;
      }
    AppMethodBeat.o(50216);
  }

  private static boolean parse(XMLTokener paramXMLTokener, JSONObject paramJSONObject, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(50217);
    Object localObject = paramXMLTokener.nextToken();
    int i;
    if (localObject == BANG)
    {
      i = paramXMLTokener.next();
      if (i == 45)
        if (paramXMLTokener.next() == '-')
        {
          paramXMLTokener.skipPast("-->");
          AppMethodBeat.o(50217);
          bool = false;
        }
    }
    while (true)
    {
      return bool;
      paramXMLTokener.back();
      int j;
      label66: 
      do
      {
        j = 1;
        paramJSONObject = paramXMLTokener.nextMeta();
        if (paramJSONObject != null)
          break;
        paramXMLTokener = paramXMLTokener.syntaxError("Missing '>' after '<!'.");
        AppMethodBeat.o(50217);
        throw paramXMLTokener;
      }
      while (i != 91);
      if (("CDATA".equals(paramXMLTokener.nextToken())) && (paramXMLTokener.next() == '['))
      {
        paramXMLTokener = paramXMLTokener.nextCDATA();
        if (paramXMLTokener.length() > 0)
          paramJSONObject.accumulate("content", paramXMLTokener);
        AppMethodBeat.o(50217);
        bool = false;
      }
      else
      {
        paramXMLTokener = paramXMLTokener.syntaxError("Expected 'CDATA['");
        AppMethodBeat.o(50217);
        throw paramXMLTokener;
        if (paramJSONObject == LT)
          i = j + 1;
        while (true)
        {
          j = i;
          if (i > 0)
            break label66;
          AppMethodBeat.o(50217);
          bool = false;
          break;
          i = j;
          if (paramJSONObject == GT)
            i = j - 1;
        }
        if (localObject == QUEST)
        {
          paramXMLTokener.skipPast("?>");
          AppMethodBeat.o(50217);
          bool = false;
        }
        else
        {
          if (localObject != SLASH)
            break;
          paramJSONObject = paramXMLTokener.nextToken();
          if (paramString == null)
          {
            paramXMLTokener = paramXMLTokener.syntaxError("Mismatched close tag ".concat(String.valueOf(paramJSONObject)));
            AppMethodBeat.o(50217);
            throw paramXMLTokener;
          }
          if (!paramJSONObject.equals(paramString))
          {
            paramXMLTokener = paramXMLTokener.syntaxError("Mismatched " + paramString + " and " + paramJSONObject);
            AppMethodBeat.o(50217);
            throw paramXMLTokener;
          }
          if (paramXMLTokener.nextToken() != GT)
          {
            paramXMLTokener = paramXMLTokener.syntaxError("Misshaped close tag");
            AppMethodBeat.o(50217);
            throw paramXMLTokener;
          }
          AppMethodBeat.o(50217);
        }
      }
    }
    if ((localObject instanceof Character))
    {
      paramXMLTokener = paramXMLTokener.syntaxError("Misshaped tag");
      AppMethodBeat.o(50217);
      throw paramXMLTokener;
    }
    String str = (String)localObject;
    paramString = null;
    JSONObject localJSONObject = new JSONObject();
    while (true)
    {
      localObject = paramString;
      if (paramString == null)
        localObject = paramXMLTokener.nextToken();
      if (!(localObject instanceof String))
        break;
      localObject = (String)localObject;
      paramString = paramXMLTokener.nextToken();
      if (paramString == EQ)
      {
        paramString = paramXMLTokener.nextToken();
        if (!(paramString instanceof String))
        {
          paramXMLTokener = paramXMLTokener.syntaxError("Missing value");
          AppMethodBeat.o(50217);
          throw paramXMLTokener;
        }
        localJSONObject.accumulate((String)localObject, stringToValue((String)paramString));
        paramString = null;
      }
      else
      {
        localJSONObject.accumulate((String)localObject, "");
      }
    }
    if (localObject == SLASH)
    {
      if (paramXMLTokener.nextToken() != GT)
      {
        paramXMLTokener = paramXMLTokener.syntaxError("Misshaped tag");
        AppMethodBeat.o(50217);
        throw paramXMLTokener;
      }
      if (localJSONObject.length() > 0)
        paramJSONObject.accumulate(str, localJSONObject);
      while (true)
      {
        AppMethodBeat.o(50217);
        bool = false;
        break;
        paramJSONObject.accumulate(str, "");
      }
    }
    if (localObject == GT)
    {
      label651: 
      do
        while (true)
        {
          paramString = paramXMLTokener.nextContent();
          if (paramString == null)
          {
            if (str != null)
            {
              paramXMLTokener = paramXMLTokener.syntaxError("Unclosed tag ".concat(String.valueOf(str)));
              AppMethodBeat.o(50217);
              throw paramXMLTokener;
            }
            AppMethodBeat.o(50217);
            bool = false;
            break;
          }
          if (!(paramString instanceof String))
            break label651;
          paramString = (String)paramString;
          if (paramString.length() > 0)
            localJSONObject.accumulate("content", stringToValue(paramString));
        }
      while ((paramString != LT) || (!parse(paramXMLTokener, localJSONObject, str)));
      if (localJSONObject.length() == 0)
        paramJSONObject.accumulate(str, "");
      while (true)
      {
        AppMethodBeat.o(50217);
        bool = false;
        break;
        if ((localJSONObject.length() == 1) && (localJSONObject.opt("content") != null))
          paramJSONObject.accumulate(str, localJSONObject.opt("content"));
        else
          paramJSONObject.accumulate(str, localJSONObject);
      }
    }
    paramXMLTokener = paramXMLTokener.syntaxError("Misshaped tag");
    AppMethodBeat.o(50217);
    throw paramXMLTokener;
  }

  public static Object stringToValue(String paramString)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(50218);
    if ("".equals(paramString))
      AppMethodBeat.o(50218);
    while (true)
    {
      return paramString;
      if ("true".equalsIgnoreCase(paramString))
      {
        paramString = Boolean.TRUE;
        AppMethodBeat.o(50218);
      }
      else if ("false".equalsIgnoreCase(paramString))
      {
        paramString = Boolean.FALSE;
        AppMethodBeat.o(50218);
      }
      else if ("null".equalsIgnoreCase(paramString))
      {
        paramString = JSONObject.NULL;
        AppMethodBeat.o(50218);
      }
      else if ("0".equals(paramString))
      {
        paramString = Integer.valueOf(0);
        AppMethodBeat.o(50218);
      }
      else
      {
        try
        {
          int k = paramString.charAt(0);
          int m = k;
          if (k == 45)
          {
            m = paramString.charAt(1);
            j = 1;
          }
          if (m == 48)
          {
            if (j != 0)
              i = 2;
            j = paramString.charAt(i);
            if (j == 48)
              AppMethodBeat.o(50218);
          }
          else if ((m >= 48) && (m <= 57))
          {
            Object localObject;
            if (paramString.indexOf('.') >= 0)
            {
              localObject = Double.valueOf(paramString);
              paramString = (String)localObject;
              AppMethodBeat.o(50218);
              continue;
            }
            if ((paramString.indexOf('e') < 0) && (paramString.indexOf('E') < 0))
            {
              localObject = new java/lang/Long;
              ((Long)localObject).<init>(paramString);
              if (((Long)localObject).longValue() == ((Long)localObject).intValue())
              {
                localObject = new Integer(((Long)localObject).intValue());
                AppMethodBeat.o(50218);
                paramString = (String)localObject;
                continue;
              }
              AppMethodBeat.o(50218);
              paramString = (String)localObject;
            }
          }
        }
        catch (Exception localException)
        {
          AppMethodBeat.o(50218);
        }
      }
    }
  }

  public static JSONObject toJSONObject(String paramString)
  {
    AppMethodBeat.i(50219);
    JSONObject localJSONObject = new JSONObject();
    paramString = new XMLTokener(paramString);
    while ((paramString.more()) && (paramString.skipPast("<")))
      parse(paramString, localJSONObject, null);
    AppMethodBeat.o(50219);
    return localJSONObject;
  }

  public static String toString(Object paramObject)
  {
    AppMethodBeat.i(50220);
    paramObject = toString(paramObject, null);
    AppMethodBeat.o(50220);
    return paramObject;
  }

  public static String toString(Object paramObject, String paramString)
  {
    AppMethodBeat.i(50221);
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject1;
    Object localObject2;
    int i;
    int j;
    if ((paramObject instanceof JSONObject))
    {
      if (paramString != null)
      {
        localStringBuffer.append('<');
        localStringBuffer.append(paramString);
        localStringBuffer.append('>');
      }
      localObject1 = (JSONObject)paramObject;
      Iterator localIterator = ((JSONObject)localObject1).keys();
      while (localIterator.hasNext())
      {
        String str = localIterator.next().toString();
        localObject2 = ((JSONObject)localObject1).opt(str);
        paramObject = localObject2;
        if (localObject2 == null)
          paramObject = "";
        if ("content".equals(str))
        {
          if ((paramObject instanceof JSONArray))
          {
            paramObject = (JSONArray)paramObject;
            i = paramObject.length();
            for (j = 0; j < i; j++)
            {
              if (j > 0)
                localStringBuffer.append('\n');
              localStringBuffer.append(escape(paramObject.get(j).toString()));
            }
          }
          else
          {
            localStringBuffer.append(escape(paramObject.toString()));
          }
        }
        else
        {
          if ((paramObject instanceof JSONArray))
          {
            localObject2 = (JSONArray)paramObject;
            i = ((JSONArray)localObject2).length();
            j = 0;
            label208: if (j < i)
            {
              paramObject = ((JSONArray)localObject2).get(j);
              if (!(paramObject instanceof JSONArray))
                break label288;
              localStringBuffer.append('<');
              localStringBuffer.append(str);
              localStringBuffer.append('>');
              localStringBuffer.append(toString(paramObject));
              localStringBuffer.append("</");
              localStringBuffer.append(str);
              localStringBuffer.append('>');
            }
            while (true)
            {
              j++;
              break label208;
              break;
              label288: localStringBuffer.append(toString(paramObject, str));
            }
          }
          if ("".equals(paramObject))
          {
            localStringBuffer.append('<');
            localStringBuffer.append(str);
            localStringBuffer.append("/>");
          }
          else
          {
            localStringBuffer.append(toString(paramObject, str));
          }
        }
      }
      if (paramString != null)
      {
        localStringBuffer.append("</");
        localStringBuffer.append(paramString);
        localStringBuffer.append('>');
      }
      paramObject = localStringBuffer.toString();
      AppMethodBeat.o(50221);
      return paramObject;
    }
    if (paramObject.getClass().isArray())
      paramObject = new JSONArray(paramObject);
    while (true)
    {
      if ((paramObject instanceof JSONArray))
      {
        localObject1 = (JSONArray)paramObject;
        i = ((JSONArray)localObject1).length();
        j = 0;
        if (j < i)
        {
          localObject2 = ((JSONArray)localObject1).opt(j);
          if (paramString == null);
          for (paramObject = "array"; ; paramObject = paramString)
          {
            localStringBuffer.append(toString(localObject2, paramObject));
            j++;
            break;
          }
        }
        paramObject = localStringBuffer.toString();
        AppMethodBeat.o(50221);
        break;
      }
      if (paramObject == null);
      for (paramObject = "null"; ; paramObject = escape(paramObject.toString()))
      {
        if (paramString != null)
          break label542;
        paramObject = "\"" + paramObject + "\"";
        AppMethodBeat.o(50221);
        break;
      }
      label542: if (paramObject.length() == 0)
      {
        paramObject = "<" + paramString + "/>";
        AppMethodBeat.o(50221);
        break;
      }
      paramObject = "<" + paramString + ">" + paramObject + "</" + paramString + ">";
      AppMethodBeat.o(50221);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.json.XML
 * JD-Core Version:    0.6.2
 */