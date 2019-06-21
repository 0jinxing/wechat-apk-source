package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
public final class JsonUtils
{
  private static final Pattern zzaae;
  private static final Pattern zzaaf;

  static
  {
    AppMethodBeat.i(90246);
    zzaae = Pattern.compile("\\\\.");
    zzaaf = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    AppMethodBeat.o(90246);
  }

  public static boolean areJsonStringsEquivalent(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(90244);
    if ((paramString1 == null) && (paramString2 == null))
    {
      bool1 = true;
      AppMethodBeat.o(90244);
    }
    while (true)
    {
      return bool1;
      if ((paramString1 == null) || (paramString2 == null))
        AppMethodBeat.o(90244);
      else
        try
        {
          JSONObject localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>(paramString1);
          JSONObject localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>(paramString2);
          bool2 = areJsonValuesEquivalent(localJSONObject1, localJSONObject2);
          bool1 = bool2;
          AppMethodBeat.o(90244);
        }
        catch (JSONException localJSONException)
        {
          try
          {
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>(paramString1);
            paramString1 = new org/json/JSONArray;
            paramString1.<init>(paramString2);
            boolean bool2 = areJsonValuesEquivalent(localJSONArray, paramString1);
            bool1 = bool2;
            AppMethodBeat.o(90244);
          }
          catch (JSONException paramString1)
          {
            AppMethodBeat.o(90244);
          }
        }
    }
  }

  public static boolean areJsonValuesEquivalent(Object paramObject1, Object paramObject2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(90245);
    if ((paramObject1 == null) && (paramObject2 == null))
    {
      AppMethodBeat.o(90245);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      if ((paramObject1 == null) || (paramObject2 == null))
      {
        AppMethodBeat.o(90245);
      }
      else
      {
        label89: boolean bool2;
        if (((paramObject1 instanceof JSONObject)) && ((paramObject2 instanceof JSONObject)))
        {
          paramObject1 = (JSONObject)paramObject1;
          JSONObject localJSONObject = (JSONObject)paramObject2;
          if (paramObject1.length() != localJSONObject.length())
          {
            AppMethodBeat.o(90245);
          }
          else
          {
            Iterator localIterator = paramObject1.keys();
            if (localIterator.hasNext())
            {
              paramObject2 = (String)localIterator.next();
              if (!localJSONObject.has(paramObject2))
                AppMethodBeat.o(90245);
              else
                try
                {
                  bool2 = areJsonValuesEquivalent(paramObject1.get(paramObject2), localJSONObject.get(paramObject2));
                  if (bool2)
                    break label89;
                  AppMethodBeat.o(90245);
                }
                catch (JSONException paramObject1)
                {
                  AppMethodBeat.o(90245);
                }
            }
            else
            {
              AppMethodBeat.o(90245);
              bool1 = true;
            }
          }
        }
        else if (((paramObject1 instanceof JSONArray)) && ((paramObject2 instanceof JSONArray)))
        {
          paramObject1 = (JSONArray)paramObject1;
          paramObject2 = (JSONArray)paramObject2;
          if (paramObject1.length() != paramObject2.length())
          {
            AppMethodBeat.o(90245);
          }
          else
          {
            label267: for (int i = 0; ; i++)
            {
              while (true)
              {
                if (i >= paramObject1.length())
                  break label273;
                try
                {
                  bool2 = areJsonValuesEquivalent(paramObject1.get(i), paramObject2.get(i));
                  if (bool2)
                    break label267;
                  AppMethodBeat.o(90245);
                }
                catch (JSONException paramObject1)
                {
                  AppMethodBeat.o(90245);
                }
              }
              break;
            }
            label273: AppMethodBeat.o(90245);
            bool1 = true;
          }
        }
        else
        {
          bool1 = paramObject1.equals(paramObject2);
          AppMethodBeat.o(90245);
        }
      }
    }
  }

  public static String escapeString(String paramString)
  {
    AppMethodBeat.i(90243);
    Matcher localMatcher;
    Object localObject1;
    if (!TextUtils.isEmpty(paramString))
    {
      localMatcher = zzaaf.matcher(paramString);
      localObject1 = null;
      while (localMatcher.find())
      {
        Object localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new StringBuffer();
        switch (localMatcher.group().charAt(0))
        {
        default:
          localObject1 = localObject2;
          break;
        case '\b':
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\b");
          localObject1 = localObject2;
          break;
        case '"':
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\\\\"");
          localObject1 = localObject2;
          break;
        case '\\':
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\\\\\");
          localObject1 = localObject2;
          break;
        case '/':
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\/");
          localObject1 = localObject2;
          break;
        case '\f':
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\f");
          localObject1 = localObject2;
          break;
        case '\n':
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\n");
          localObject1 = localObject2;
          break;
        case '\r':
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\r");
          localObject1 = localObject2;
          break;
        case '\t':
          localMatcher.appendReplacement((StringBuffer)localObject2, "\\\\t");
          localObject1 = localObject2;
        }
      }
      if (localObject1 == null)
        AppMethodBeat.o(90243);
    }
    while (true)
    {
      return paramString;
      localMatcher.appendTail(localObject1);
      paramString = localObject1.toString();
      AppMethodBeat.o(90243);
      continue;
      AppMethodBeat.o(90243);
    }
  }

  public static String unescapeString(String paramString)
  {
    AppMethodBeat.i(90242);
    Matcher localMatcher;
    if (!TextUtils.isEmpty(paramString))
    {
      String str = UnicodeUtils.unescape(paramString);
      localMatcher = zzaae.matcher(str);
      paramString = null;
      while (localMatcher.find())
      {
        Object localObject = paramString;
        if (paramString == null)
          localObject = new StringBuffer();
        switch (localMatcher.group().charAt(1))
        {
        default:
          paramString = new IllegalStateException("Found an escaped character that should never be.");
          AppMethodBeat.o(90242);
          throw paramString;
        case '"':
          localMatcher.appendReplacement((StringBuffer)localObject, "\"");
          paramString = (String)localObject;
          break;
        case '\\':
          localMatcher.appendReplacement((StringBuffer)localObject, "\\\\");
          paramString = (String)localObject;
          break;
        case '/':
          localMatcher.appendReplacement((StringBuffer)localObject, "/");
          paramString = (String)localObject;
          break;
        case 'b':
          localMatcher.appendReplacement((StringBuffer)localObject, "\b");
          paramString = (String)localObject;
          break;
        case 'f':
          localMatcher.appendReplacement((StringBuffer)localObject, "\f");
          paramString = (String)localObject;
          break;
        case 'n':
          localMatcher.appendReplacement((StringBuffer)localObject, "\n");
          paramString = (String)localObject;
          break;
        case 'r':
          localMatcher.appendReplacement((StringBuffer)localObject, "\r");
          paramString = (String)localObject;
          break;
        case 't':
          localMatcher.appendReplacement((StringBuffer)localObject, "\t");
          paramString = (String)localObject;
        }
      }
      if (paramString == null)
      {
        AppMethodBeat.o(90242);
        paramString = str;
      }
    }
    while (true)
    {
      return paramString;
      localMatcher.appendTail(paramString);
      paramString = paramString.toString();
      AppMethodBeat.o(90242);
      continue;
      AppMethodBeat.o(90242);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.JsonUtils
 * JD-Core Version:    0.6.2
 */