package com.tencent.ttpic.json;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public class JSONML
{
  private static Object parse(XMLTokener paramXMLTokener, boolean paramBoolean, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(50107);
    while (true)
    {
      if (!paramXMLTokener.more())
      {
        paramXMLTokener = paramXMLTokener.syntaxError("Bad XML");
        AppMethodBeat.o(50107);
        throw paramXMLTokener;
      }
      Object localObject1 = paramXMLTokener.nextContent();
      Object localObject2;
      if (localObject1 == XML.LT)
      {
        localObject2 = paramXMLTokener.nextToken();
        if ((localObject2 instanceof Character))
          if (localObject2 == XML.SLASH)
          {
            paramJSONArray = paramXMLTokener.nextToken();
            if (!(paramJSONArray instanceof String))
            {
              paramXMLTokener = new JSONException("Expected a closing name instead of '" + paramJSONArray + "'.");
              AppMethodBeat.o(50107);
              throw paramXMLTokener;
            }
            if (paramXMLTokener.nextToken() != XML.GT)
            {
              paramXMLTokener = paramXMLTokener.syntaxError("Misshaped close tag");
              AppMethodBeat.o(50107);
              throw paramXMLTokener;
            }
            AppMethodBeat.o(50107);
            paramXMLTokener = paramJSONArray;
          }
        while (true)
        {
          return paramXMLTokener;
          if (localObject2 == XML.BANG)
          {
            int i = paramXMLTokener.next();
            if (i == 45)
            {
              if (paramXMLTokener.next() == '-')
              {
                paramXMLTokener.skipPast("-->");
                break;
              }
              paramXMLTokener.back();
              break;
            }
            if (i == 91)
            {
              if ((paramXMLTokener.nextToken().equals("CDATA")) && (paramXMLTokener.next() == '['))
              {
                if (paramJSONArray == null)
                  break;
                paramJSONArray.put(paramXMLTokener.nextCDATA());
                break;
              }
              paramXMLTokener = paramXMLTokener.syntaxError("Expected 'CDATA['");
              AppMethodBeat.o(50107);
              throw paramXMLTokener;
            }
            int j = 1;
            label249: localObject2 = paramXMLTokener.nextMeta();
            if (localObject2 == null)
            {
              paramXMLTokener = paramXMLTokener.syntaxError("Missing '>' after '<!'.");
              AppMethodBeat.o(50107);
              throw paramXMLTokener;
            }
            if (localObject2 == XML.LT)
              i = j + 1;
            while (true)
            {
              j = i;
              if (i > 0)
                break label249;
              break;
              i = j;
              if (localObject2 == XML.GT)
                i = j - 1;
            }
          }
          if (localObject2 == XML.QUEST)
          {
            paramXMLTokener.skipPast("?>");
            break;
          }
          paramXMLTokener = paramXMLTokener.syntaxError("Misshaped tag");
          AppMethodBeat.o(50107);
          throw paramXMLTokener;
          if (!(localObject2 instanceof String))
          {
            paramXMLTokener = paramXMLTokener.syntaxError("Bad tagName '" + localObject2 + "'.");
            AppMethodBeat.o(50107);
            throw paramXMLTokener;
          }
          String str = (String)localObject2;
          localObject1 = new JSONArray();
          JSONObject localJSONObject = new JSONObject();
          if (paramBoolean)
          {
            ((JSONArray)localObject1).put(str);
            if (paramJSONArray != null)
              paramJSONArray.put(localObject1);
            localObject2 = null;
          }
          Object localObject3;
          while (true)
          {
            localObject3 = localObject2;
            if (localObject2 == null)
              localObject3 = paramXMLTokener.nextToken();
            if (localObject3 == null)
            {
              paramXMLTokener = paramXMLTokener.syntaxError("Misshaped tag");
              AppMethodBeat.o(50107);
              throw paramXMLTokener;
              localJSONObject.put("tagName", str);
              if (paramJSONArray == null)
                break;
              paramJSONArray.put(localJSONObject);
              break;
            }
            if (!(localObject3 instanceof String))
              break label628;
            localObject3 = (String)localObject3;
            if ((!paramBoolean) && (("tagName".equals(localObject3)) || ("childNode".equals(localObject3))))
            {
              paramXMLTokener = paramXMLTokener.syntaxError("Reserved attribute.");
              AppMethodBeat.o(50107);
              throw paramXMLTokener;
            }
            localObject2 = paramXMLTokener.nextToken();
            if (localObject2 == XML.EQ)
            {
              localObject2 = paramXMLTokener.nextToken();
              if (!(localObject2 instanceof String))
              {
                paramXMLTokener = paramXMLTokener.syntaxError("Missing value");
                AppMethodBeat.o(50107);
                throw paramXMLTokener;
              }
              localJSONObject.accumulate((String)localObject3, XML.stringToValue((String)localObject2));
              break;
            }
            localJSONObject.accumulate((String)localObject3, "");
          }
          label628: if ((paramBoolean) && (localJSONObject.length() > 0))
            ((JSONArray)localObject1).put(localJSONObject);
          if (localObject3 == XML.SLASH)
          {
            if (paramXMLTokener.nextToken() != XML.GT)
            {
              paramXMLTokener = paramXMLTokener.syntaxError("Misshaped tag");
              AppMethodBeat.o(50107);
              throw paramXMLTokener;
            }
            if (paramJSONArray != null)
              break;
            if (paramBoolean)
            {
              AppMethodBeat.o(50107);
              paramXMLTokener = (XMLTokener)localObject1;
              continue;
            }
            AppMethodBeat.o(50107);
            paramXMLTokener = localJSONObject;
            continue;
          }
          if (localObject3 != XML.GT)
          {
            paramXMLTokener = paramXMLTokener.syntaxError("Misshaped tag");
            AppMethodBeat.o(50107);
            throw paramXMLTokener;
          }
          localObject2 = (String)parse(paramXMLTokener, paramBoolean, (JSONArray)localObject1);
          if (localObject2 == null)
            break;
          if (!((String)localObject2).equals(str))
          {
            paramXMLTokener = paramXMLTokener.syntaxError("Mismatched '" + str + "' and '" + (String)localObject2 + "'");
            AppMethodBeat.o(50107);
            throw paramXMLTokener;
          }
          if ((!paramBoolean) && (((JSONArray)localObject1).length() > 0))
            localJSONObject.put("childNodes", localObject1);
          if (paramJSONArray != null)
            break;
          if (paramBoolean)
          {
            AppMethodBeat.o(50107);
            paramXMLTokener = (XMLTokener)localObject1;
          }
          else
          {
            AppMethodBeat.o(50107);
            paramXMLTokener = localJSONObject;
          }
        }
      }
      if (paramJSONArray != null)
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof String))
          localObject2 = XML.stringToValue((String)localObject1);
        paramJSONArray.put(localObject2);
      }
    }
  }

  public static JSONArray toJSONArray(XMLTokener paramXMLTokener)
  {
    AppMethodBeat.i(50109);
    paramXMLTokener = (JSONArray)parse(paramXMLTokener, true, null);
    AppMethodBeat.o(50109);
    return paramXMLTokener;
  }

  public static JSONArray toJSONArray(String paramString)
  {
    AppMethodBeat.i(50108);
    paramString = toJSONArray(new XMLTokener(paramString));
    AppMethodBeat.o(50108);
    return paramString;
  }

  public static JSONObject toJSONObject(XMLTokener paramXMLTokener)
  {
    AppMethodBeat.i(50110);
    paramXMLTokener = (JSONObject)parse(paramXMLTokener, false, null);
    AppMethodBeat.o(50110);
    return paramXMLTokener;
  }

  public static JSONObject toJSONObject(String paramString)
  {
    AppMethodBeat.i(50111);
    paramString = toJSONObject(new XMLTokener(paramString));
    AppMethodBeat.o(50111);
    return paramString;
  }

  public static String toString(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(50112);
    StringBuffer localStringBuffer = new StringBuffer();
    String str1 = paramJSONArray.getString(0);
    XML.noSpace(str1);
    str1 = XML.escape(str1);
    localStringBuffer.append('<');
    localStringBuffer.append(str1);
    Object localObject = paramJSONArray.opt(1);
    if ((localObject instanceof JSONObject))
    {
      localObject = (JSONObject)localObject;
      Iterator localIterator = ((JSONObject)localObject).keys();
      while (localIterator.hasNext())
      {
        String str2 = localIterator.next().toString();
        XML.noSpace(str2);
        String str3 = ((JSONObject)localObject).optString(str2);
        if (str3 != null)
        {
          localStringBuffer.append(' ');
          localStringBuffer.append(XML.escape(str2));
          localStringBuffer.append('=');
          localStringBuffer.append('"');
          localStringBuffer.append(XML.escape(str3));
          localStringBuffer.append('"');
        }
      }
    }
    for (int i = 1; ; i = 2)
    {
      int j = paramJSONArray.length();
      if (i >= j)
      {
        localStringBuffer.append('/');
        localStringBuffer.append('>');
        paramJSONArray = localStringBuffer.toString();
        AppMethodBeat.o(50112);
        return paramJSONArray;
      }
      localStringBuffer.append('>');
      label205: localObject = paramJSONArray.get(i);
      int k = i + 1;
      if (localObject != null)
      {
        if (!(localObject instanceof String))
          break label282;
        localStringBuffer.append(XML.escape(localObject.toString()));
      }
      while (true)
      {
        i = k;
        if (k < j)
          break label205;
        localStringBuffer.append('<');
        localStringBuffer.append('/');
        localStringBuffer.append(str1);
        localStringBuffer.append('>');
        break;
        label282: if ((localObject instanceof JSONObject))
          localStringBuffer.append(toString((JSONObject)localObject));
        else if ((localObject instanceof JSONArray))
          localStringBuffer.append(toString((JSONArray)localObject));
      }
    }
  }

  public static String toString(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(50113);
    StringBuffer localStringBuffer = new StringBuffer();
    String str1 = paramJSONObject.optString("tagName");
    if (str1 == null)
    {
      paramJSONObject = XML.escape(paramJSONObject.toString());
      AppMethodBeat.o(50113);
      return paramJSONObject;
    }
    XML.noSpace(str1);
    str1 = XML.escape(str1);
    localStringBuffer.append('<');
    localStringBuffer.append(str1);
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      localObject = localIterator.next().toString();
      if ((!"tagName".equals(localObject)) && (!"childNodes".equals(localObject)))
      {
        XML.noSpace((String)localObject);
        String str2 = paramJSONObject.optString((String)localObject);
        if (str2 != null)
        {
          localStringBuffer.append(' ');
          localStringBuffer.append(XML.escape((String)localObject));
          localStringBuffer.append('=');
          localStringBuffer.append('"');
          localStringBuffer.append(XML.escape(str2));
          localStringBuffer.append('"');
        }
      }
    }
    Object localObject = paramJSONObject.optJSONArray("childNodes");
    if (localObject == null)
    {
      localStringBuffer.append('/');
      localStringBuffer.append('>');
    }
    while (true)
    {
      paramJSONObject = localStringBuffer.toString();
      AppMethodBeat.o(50113);
      break;
      localStringBuffer.append('>');
      int i = ((JSONArray)localObject).length();
      int j = 0;
      if (j < i)
      {
        paramJSONObject = ((JSONArray)localObject).get(j);
        if (paramJSONObject != null)
        {
          if (!(paramJSONObject instanceof String))
            break label276;
          localStringBuffer.append(XML.escape(paramJSONObject.toString()));
        }
        while (true)
        {
          j++;
          break;
          label276: if ((paramJSONObject instanceof JSONObject))
            localStringBuffer.append(toString((JSONObject)paramJSONObject));
          else if ((paramJSONObject instanceof JSONArray))
            localStringBuffer.append(toString((JSONArray)paramJSONObject));
          else
            localStringBuffer.append(paramJSONObject.toString());
        }
      }
      localStringBuffer.append('<');
      localStringBuffer.append('/');
      localStringBuffer.append(str1);
      localStringBuffer.append('>');
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.json.JSONML
 * JD-Core Version:    0.6.2
 */