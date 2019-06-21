package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class LegacyTokenHelper
{
  public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
  public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
  public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
  public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
  private static final long INVALID_BUNDLE_MILLISECONDS = -9223372036854775808L;
  private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
  private static final String JSON_VALUE = "value";
  private static final String JSON_VALUE_ENUM_TYPE = "enumType";
  private static final String JSON_VALUE_TYPE = "valueType";
  public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
  public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
  private static final String TAG;
  public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
  public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
  private static final String TYPE_BOOLEAN = "bool";
  private static final String TYPE_BOOLEAN_ARRAY = "bool[]";
  private static final String TYPE_BYTE = "byte";
  private static final String TYPE_BYTE_ARRAY = "byte[]";
  private static final String TYPE_CHAR = "char";
  private static final String TYPE_CHAR_ARRAY = "char[]";
  private static final String TYPE_DOUBLE = "double";
  private static final String TYPE_DOUBLE_ARRAY = "double[]";
  private static final String TYPE_ENUM = "enum";
  private static final String TYPE_FLOAT = "float";
  private static final String TYPE_FLOAT_ARRAY = "float[]";
  private static final String TYPE_INTEGER = "int";
  private static final String TYPE_INTEGER_ARRAY = "int[]";
  private static final String TYPE_LONG = "long";
  private static final String TYPE_LONG_ARRAY = "long[]";
  private static final String TYPE_SHORT = "short";
  private static final String TYPE_SHORT_ARRAY = "short[]";
  private static final String TYPE_STRING = "string";
  private static final String TYPE_STRING_LIST = "stringList";
  private SharedPreferences cache;
  private String cacheKey;

  static
  {
    AppMethodBeat.i(71800);
    TAG = LegacyTokenHelper.class.getSimpleName();
    AppMethodBeat.o(71800);
  }

  public LegacyTokenHelper(Context paramContext)
  {
    this(paramContext, null);
  }

  public LegacyTokenHelper(Context paramContext, String paramString)
  {
    AppMethodBeat.i(71774);
    Validate.notNull(paramContext, "context");
    String str = paramString;
    if (Utility.isNullOrEmpty(paramString))
      str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    this.cacheKey = str;
    paramString = paramContext.getApplicationContext();
    if (paramString != null)
      paramContext = paramString;
    this.cache = paramContext.getSharedPreferences(this.cacheKey, 0);
    AppMethodBeat.o(71774);
  }

  private void deserializeKey(String paramString, Bundle paramBundle)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    AppMethodBeat.i(71799);
    Object localObject1 = new JSONObject(this.cache.getString(paramString, "{}"));
    Object localObject2 = ((JSONObject)localObject1).getString("valueType");
    if (((String)localObject2).equals("bool"))
    {
      paramBundle.putBoolean(paramString, ((JSONObject)localObject1).getBoolean("value"));
      AppMethodBeat.o(71799);
    }
    while (true)
    {
      return;
      if (((String)localObject2).equals("bool[]"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        localObject1 = new boolean[((JSONArray)localObject2).length()];
        while (i2 < localObject1.length)
        {
          localObject1[i2] = ((JSONArray)localObject2).getBoolean(i2);
          i2++;
        }
        paramBundle.putBooleanArray(paramString, (boolean[])localObject1);
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("byte"))
      {
        paramBundle.putByte(paramString, (byte)((JSONObject)localObject1).getInt("value"));
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("byte[]"))
      {
        localObject1 = ((JSONObject)localObject1).getJSONArray("value");
        localObject2 = new byte[((JSONArray)localObject1).length()];
        for (i2 = i; i2 < localObject2.length; i2++)
          localObject2[i2] = ((byte)(byte)((JSONArray)localObject1).getInt(i2));
        paramBundle.putByteArray(paramString, (byte[])localObject2);
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("short"))
      {
        paramBundle.putShort(paramString, (short)((JSONObject)localObject1).getInt("value"));
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("short[]"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        localObject1 = new short[((JSONArray)localObject2).length()];
        for (i2 = j; i2 < localObject1.length; i2++)
          localObject1[i2] = ((short)(short)((JSONArray)localObject2).getInt(i2));
        paramBundle.putShortArray(paramString, (short[])localObject1);
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("int"))
      {
        paramBundle.putInt(paramString, ((JSONObject)localObject1).getInt("value"));
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("int[]"))
      {
        localObject1 = ((JSONObject)localObject1).getJSONArray("value");
        localObject2 = new int[((JSONArray)localObject1).length()];
        for (i2 = k; i2 < localObject2.length; i2++)
          localObject2[i2] = ((JSONArray)localObject1).getInt(i2);
        paramBundle.putIntArray(paramString, (int[])localObject2);
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("long"))
      {
        paramBundle.putLong(paramString, ((JSONObject)localObject1).getLong("value"));
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("long[]"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        localObject1 = new long[((JSONArray)localObject2).length()];
        for (i2 = m; i2 < localObject1.length; i2++)
          localObject1[i2] = ((JSONArray)localObject2).getLong(i2);
        paramBundle.putLongArray(paramString, (long[])localObject1);
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("float"))
      {
        paramBundle.putFloat(paramString, (float)((JSONObject)localObject1).getDouble("value"));
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("float[]"))
      {
        localObject1 = ((JSONObject)localObject1).getJSONArray("value");
        localObject2 = new float[((JSONArray)localObject1).length()];
        for (i2 = n; i2 < localObject2.length; i2++)
          localObject2[i2] = ((float)((JSONArray)localObject1).getDouble(i2));
        paramBundle.putFloatArray(paramString, (float[])localObject2);
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("double"))
      {
        paramBundle.putDouble(paramString, ((JSONObject)localObject1).getDouble("value"));
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("double[]"))
      {
        localObject1 = ((JSONObject)localObject1).getJSONArray("value");
        localObject2 = new double[((JSONArray)localObject1).length()];
        for (i2 = i1; i2 < localObject2.length; i2++)
          localObject2[i2] = ((JSONArray)localObject1).getDouble(i2);
        paramBundle.putDoubleArray(paramString, (double[])localObject2);
        AppMethodBeat.o(71799);
      }
      else if (((String)localObject2).equals("char"))
      {
        localObject1 = ((JSONObject)localObject1).getString("value");
        if ((localObject1 != null) && (((String)localObject1).length() == 1))
          paramBundle.putChar(paramString, ((String)localObject1).charAt(0));
        AppMethodBeat.o(71799);
      }
      else
      {
        Object localObject3;
        if (((String)localObject2).equals("char[]"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          localObject2 = new char[((JSONArray)localObject1).length()];
          for (i2 = 0; i2 < localObject2.length; i2++)
          {
            localObject3 = ((JSONArray)localObject1).getString(i2);
            if ((localObject3 != null) && (((String)localObject3).length() == 1))
              localObject2[i2] = ((String)localObject3).charAt(0);
          }
          paramBundle.putCharArray(paramString, (char[])localObject2);
          AppMethodBeat.o(71799);
        }
        else if (((String)localObject2).equals("string"))
        {
          paramBundle.putString(paramString, ((JSONObject)localObject1).getString("value"));
          AppMethodBeat.o(71799);
        }
        else if (((String)localObject2).equals("stringList"))
        {
          localObject3 = ((JSONObject)localObject1).getJSONArray("value");
          i = ((JSONArray)localObject3).length();
          localObject2 = new ArrayList(i);
          i2 = 0;
          if (i2 < i)
          {
            localObject1 = ((JSONArray)localObject3).get(i2);
            if (localObject1 == JSONObject.NULL);
            for (localObject1 = null; ; localObject1 = (String)localObject1)
            {
              ((ArrayList)localObject2).add(i2, localObject1);
              i2++;
              break;
            }
          }
          paramBundle.putStringArrayList(paramString, (ArrayList)localObject2);
          AppMethodBeat.o(71799);
        }
        else if (((String)localObject2).equals("enum"))
        {
          try
          {
            paramBundle.putSerializable(paramString, Enum.valueOf(Class.forName(((JSONObject)localObject1).getString("enumType")), ((JSONObject)localObject1).getString("value")));
            AppMethodBeat.o(71799);
          }
          catch (ClassNotFoundException paramString)
          {
            AppMethodBeat.o(71799);
          }
          catch (IllegalArgumentException paramString)
          {
          }
        }
        else
        {
          AppMethodBeat.o(71799);
        }
      }
    }
  }

  public static String getApplicationId(Bundle paramBundle)
  {
    AppMethodBeat.i(71794);
    Validate.notNull(paramBundle, "bundle");
    paramBundle = paramBundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    AppMethodBeat.o(71794);
    return paramBundle;
  }

  static Date getDate(Bundle paramBundle, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(71796);
    if (paramBundle == null)
    {
      AppMethodBeat.o(71796);
      paramBundle = localObject;
    }
    while (true)
    {
      return paramBundle;
      long l = paramBundle.getLong(paramString, -9223372036854775808L);
      if (l == -9223372036854775808L)
      {
        AppMethodBeat.o(71796);
        paramBundle = localObject;
      }
      else
      {
        paramBundle = new Date(l);
        AppMethodBeat.o(71796);
      }
    }
  }

  public static Date getExpirationDate(Bundle paramBundle)
  {
    AppMethodBeat.i(71781);
    Validate.notNull(paramBundle, "bundle");
    paramBundle = getDate(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
    AppMethodBeat.o(71781);
    return paramBundle;
  }

  public static long getExpirationMilliseconds(Bundle paramBundle)
  {
    AppMethodBeat.i(71783);
    Validate.notNull(paramBundle, "bundle");
    long l = paramBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate");
    AppMethodBeat.o(71783);
    return l;
  }

  public static Date getLastRefreshDate(Bundle paramBundle)
  {
    AppMethodBeat.i(71790);
    Validate.notNull(paramBundle, "bundle");
    paramBundle = getDate(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
    AppMethodBeat.o(71790);
    return paramBundle;
  }

  public static long getLastRefreshMilliseconds(Bundle paramBundle)
  {
    AppMethodBeat.i(71792);
    Validate.notNull(paramBundle, "bundle");
    long l = paramBundle.getLong("com.facebook.TokenCachingStrategy.LastRefreshDate");
    AppMethodBeat.o(71792);
    return l;
  }

  public static Set<String> getPermissions(Bundle paramBundle)
  {
    AppMethodBeat.i(71785);
    Validate.notNull(paramBundle, "bundle");
    paramBundle = paramBundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions");
    if (paramBundle == null)
    {
      paramBundle = null;
      AppMethodBeat.o(71785);
    }
    while (true)
    {
      return paramBundle;
      paramBundle = new HashSet(paramBundle);
      AppMethodBeat.o(71785);
    }
  }

  public static AccessTokenSource getSource(Bundle paramBundle)
  {
    AppMethodBeat.i(71788);
    Validate.notNull(paramBundle, "bundle");
    if (paramBundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource"))
    {
      paramBundle = (AccessTokenSource)paramBundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
      AppMethodBeat.o(71788);
    }
    while (true)
    {
      return paramBundle;
      if (paramBundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO"))
      {
        paramBundle = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        AppMethodBeat.o(71788);
      }
      else
      {
        paramBundle = AccessTokenSource.WEB_VIEW;
        AppMethodBeat.o(71788);
      }
    }
  }

  public static String getToken(Bundle paramBundle)
  {
    AppMethodBeat.i(71779);
    Validate.notNull(paramBundle, "bundle");
    paramBundle = paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
    AppMethodBeat.o(71779);
    return paramBundle;
  }

  public static boolean hasTokenInformation(Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(71778);
    if (paramBundle == null)
      AppMethodBeat.o(71778);
    while (true)
    {
      return bool;
      String str = paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
      if ((str == null) || (str.length() == 0))
      {
        AppMethodBeat.o(71778);
      }
      else if (paramBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0L)
      {
        AppMethodBeat.o(71778);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(71778);
      }
    }
  }

  public static void putApplicationId(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(71795);
    Validate.notNull(paramBundle, "bundle");
    paramBundle.putString("com.facebook.TokenCachingStrategy.ApplicationId", paramString);
    AppMethodBeat.o(71795);
  }

  static void putDate(Bundle paramBundle, String paramString, Date paramDate)
  {
    AppMethodBeat.i(71797);
    paramBundle.putLong(paramString, paramDate.getTime());
    AppMethodBeat.o(71797);
  }

  public static void putDeclinedPermissions(Bundle paramBundle, Collection<String> paramCollection)
  {
    AppMethodBeat.i(71787);
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramCollection, "value");
    paramBundle.putStringArrayList("com.facebook.TokenCachingStrategy.DeclinedPermissions", new ArrayList(paramCollection));
    AppMethodBeat.o(71787);
  }

  public static void putExpirationDate(Bundle paramBundle, Date paramDate)
  {
    AppMethodBeat.i(71782);
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramDate, "value");
    putDate(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate", paramDate);
    AppMethodBeat.o(71782);
  }

  public static void putExpirationMilliseconds(Bundle paramBundle, long paramLong)
  {
    AppMethodBeat.i(71784);
    Validate.notNull(paramBundle, "bundle");
    paramBundle.putLong("com.facebook.TokenCachingStrategy.ExpirationDate", paramLong);
    AppMethodBeat.o(71784);
  }

  public static void putLastRefreshDate(Bundle paramBundle, Date paramDate)
  {
    AppMethodBeat.i(71791);
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramDate, "value");
    putDate(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", paramDate);
    AppMethodBeat.o(71791);
  }

  public static void putLastRefreshMilliseconds(Bundle paramBundle, long paramLong)
  {
    AppMethodBeat.i(71793);
    Validate.notNull(paramBundle, "bundle");
    paramBundle.putLong("com.facebook.TokenCachingStrategy.LastRefreshDate", paramLong);
    AppMethodBeat.o(71793);
  }

  public static void putPermissions(Bundle paramBundle, Collection<String> paramCollection)
  {
    AppMethodBeat.i(71786);
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramCollection, "value");
    paramBundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList(paramCollection));
    AppMethodBeat.o(71786);
  }

  public static void putSource(Bundle paramBundle, AccessTokenSource paramAccessTokenSource)
  {
    AppMethodBeat.i(71789);
    Validate.notNull(paramBundle, "bundle");
    paramBundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", paramAccessTokenSource);
    AppMethodBeat.o(71789);
  }

  public static void putToken(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(71780);
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramString, "value");
    paramBundle.putString("com.facebook.TokenCachingStrategy.Token", paramString);
    AppMethodBeat.o(71780);
  }

  private void serializeKey(String paramString, Bundle paramBundle, SharedPreferences.Editor paramEditor)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    AppMethodBeat.i(71798);
    Object localObject = paramBundle.get(paramString);
    if (localObject == null)
    {
      AppMethodBeat.o(71798);
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    if ((localObject instanceof Byte))
    {
      localJSONObject.put("value", ((Byte)localObject).intValue());
      paramBundle = null;
      localObject = "byte";
    }
    while (true)
    {
      if (localObject != null)
      {
        localJSONObject.put("valueType", localObject);
        if (paramBundle != null)
          localJSONObject.putOpt("value", paramBundle);
        paramEditor.putString(paramString, localJSONObject.toString());
      }
      AppMethodBeat.o(71798);
      break;
      if ((localObject instanceof Short))
      {
        localJSONObject.put("value", ((Short)localObject).intValue());
        paramBundle = null;
        localObject = "short";
      }
      else if ((localObject instanceof Integer))
      {
        localJSONObject.put("value", ((Integer)localObject).intValue());
        paramBundle = null;
        localObject = "int";
      }
      else if ((localObject instanceof Long))
      {
        localJSONObject.put("value", ((Long)localObject).longValue());
        paramBundle = null;
        localObject = "long";
      }
      else if ((localObject instanceof Float))
      {
        localJSONObject.put("value", ((Float)localObject).doubleValue());
        paramBundle = null;
        localObject = "float";
      }
      else if ((localObject instanceof Double))
      {
        localJSONObject.put("value", ((Double)localObject).doubleValue());
        paramBundle = null;
        localObject = "double";
      }
      else if ((localObject instanceof Boolean))
      {
        localJSONObject.put("value", ((Boolean)localObject).booleanValue());
        paramBundle = null;
        localObject = "bool";
      }
      else if ((localObject instanceof Character))
      {
        localJSONObject.put("value", localObject.toString());
        paramBundle = null;
        localObject = "char";
      }
      else if ((localObject instanceof String))
      {
        localJSONObject.put("value", (String)localObject);
        paramBundle = null;
        localObject = "string";
      }
      else if ((localObject instanceof Enum))
      {
        localJSONObject.put("value", localObject.toString());
        localJSONObject.put("enumType", localObject.getClass().getName());
        paramBundle = null;
        localObject = "enum";
      }
      else
      {
        paramBundle = new JSONArray();
        if ((localObject instanceof byte[]))
        {
          localObject = (byte[])localObject;
          i = localObject.length;
          while (i3 < i)
          {
            paramBundle.put(localObject[i3]);
            i3++;
          }
          localObject = "byte[]";
        }
        else if ((localObject instanceof short[]))
        {
          localObject = (short[])localObject;
          j = localObject.length;
          for (i3 = i; i3 < j; i3++)
            paramBundle.put(localObject[i3]);
          localObject = "short[]";
        }
        else if ((localObject instanceof int[]))
        {
          localObject = (int[])localObject;
          i = localObject.length;
          for (i3 = j; i3 < i; i3++)
            paramBundle.put(localObject[i3]);
          localObject = "int[]";
        }
        else if ((localObject instanceof long[]))
        {
          localObject = (long[])localObject;
          i = localObject.length;
          for (i3 = k; i3 < i; i3++)
            paramBundle.put(localObject[i3]);
          localObject = "long[]";
        }
        else if ((localObject instanceof float[]))
        {
          localObject = (float[])localObject;
          i = localObject.length;
          for (i3 = m; i3 < i; i3++)
            paramBundle.put(localObject[i3]);
          localObject = "float[]";
        }
        else if ((localObject instanceof double[]))
        {
          localObject = (double[])localObject;
          i = localObject.length;
          for (i3 = n; i3 < i; i3++)
            paramBundle.put(localObject[i3]);
          localObject = "double[]";
        }
        else if ((localObject instanceof boolean[]))
        {
          localObject = (boolean[])localObject;
          i = localObject.length;
          for (i3 = i1; i3 < i; i3++)
            paramBundle.put(localObject[i3]);
          localObject = "bool[]";
        }
        else if ((localObject instanceof char[]))
        {
          localObject = (char[])localObject;
          i = localObject.length;
          for (i3 = i2; i3 < i; i3++)
            paramBundle.put(String.valueOf(localObject[i3]));
          localObject = "char[]";
        }
        else if ((localObject instanceof List))
        {
          Iterator localIterator = ((List)localObject).iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            localObject = str;
            if (str == null)
              localObject = JSONObject.NULL;
            paramBundle.put(localObject);
          }
          localObject = "stringList";
        }
        else
        {
          paramBundle = null;
          localObject = null;
        }
      }
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(71777);
    this.cache.edit().clear().apply();
    AppMethodBeat.o(71777);
  }

  public final Bundle load()
  {
    AppMethodBeat.i(71775);
    Bundle localBundle1 = new Bundle();
    Iterator localIterator = this.cache.getAll().keySet().iterator();
    Bundle localBundle2;
    while (true)
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          deserializeKey(str, localBundle1);
        }
        catch (JSONException localJSONException)
        {
          Logger.log(LoggingBehavior.CACHE, 5, TAG, "Error reading cached value for key: '" + str + "' -- " + localJSONException);
          localBundle2 = null;
          AppMethodBeat.o(71775);
        }
      }
    while (true)
    {
      return localBundle2;
      AppMethodBeat.o(71775);
    }
  }

  public final void save(Bundle paramBundle)
  {
    AppMethodBeat.i(71776);
    Validate.notNull(paramBundle, "bundle");
    SharedPreferences.Editor localEditor = this.cache.edit();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (true)
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          serializeKey(str, paramBundle, localEditor);
        }
        catch (JSONException paramBundle)
        {
          Logger.log(LoggingBehavior.CACHE, 5, TAG, "Error processing value for key: '" + str + "' -- " + paramBundle);
          AppMethodBeat.o(71776);
        }
      }
    while (true)
    {
      return;
      localEditor.apply();
      AppMethodBeat.o(71776);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.LegacyTokenHelper
 * JD-Core Version:    0.6.2
 */