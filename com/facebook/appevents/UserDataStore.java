package com.facebook.appevents;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import org.json.JSONException;
import org.json.JSONObject;

public class UserDataStore
{
  public static final String CITY = "ct";
  public static final String COUNTRY = "country";
  public static final String DATE_OF_BIRTH = "db";
  public static final String EMAIL = "em";
  public static final String FIRST_NAME = "fn";
  public static final String GENDER = "ge";
  public static final String LAST_NAME = "ln";
  public static final String PHONE = "ph";
  public static final String STATE = "st";
  private static final String TAG;
  private static final String USER_DATA_KEY = "com.facebook.appevents.UserDataStore.userData";
  public static final String ZIP = "zp";
  private static String hashedUserData;
  private static volatile boolean initialized;
  private static ReentrantReadWriteLock lock;

  static
  {
    AppMethodBeat.i(72039);
    TAG = UserDataStore.class.getSimpleName();
    lock = new ReentrantReadWriteLock();
    initialized = false;
    AppMethodBeat.o(72039);
  }

  private static String encryptData(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(72034);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      AppMethodBeat.o(72034);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-256");
        localMessageDigest.update(paramString.getBytes());
        paramString = AppEventUtility.bytesToHex(localMessageDigest.digest());
        AppMethodBeat.o(72034);
      }
      catch (NoSuchAlgorithmException paramString)
      {
        AppMethodBeat.o(72034);
        paramString = localObject;
      }
    }
  }

  public static String getHashedUserData()
  {
    AppMethodBeat.i(72031);
    if (!initialized)
      initAndWait();
    lock.readLock().lock();
    try
    {
      String str = hashedUserData;
      return str;
    }
    finally
    {
      lock.readLock().unlock();
      AppMethodBeat.o(72031);
    }
  }

  private static String hashUserData(Bundle paramBundle)
  {
    AppMethodBeat.i(72033);
    if (paramBundle == null)
    {
      paramBundle = null;
      AppMethodBeat.o(72033);
    }
    while (true)
    {
      return paramBundle;
      JSONObject localJSONObject = new JSONObject();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        try
        {
          str2 = paramBundle.get(str1).toString();
          if (!maybeSHA256Hashed(str2))
            break label91;
          localJSONObject.put(str1, str2.toLowerCase());
        }
        catch (JSONException localJSONException)
        {
        }
        continue;
        label91: String str2 = encryptData(normalizeData(localJSONException, paramBundle.get(localJSONException).toString()));
        if (str2 != null)
          localJSONObject.put(localJSONException, str2);
      }
      paramBundle = localJSONObject.toString();
      AppMethodBeat.o(72033);
    }
  }

  private static void initAndWait()
  {
    AppMethodBeat.i(72032);
    if (initialized)
      AppMethodBeat.o(72032);
    while (true)
    {
      return;
      lock.writeLock().lock();
      try
      {
        boolean bool = initialized;
        if (bool)
        {
          lock.writeLock().unlock();
          AppMethodBeat.o(72032);
          continue;
        }
        hashedUserData = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString("com.facebook.appevents.UserDataStore.userData", null);
        initialized = true;
        lock.writeLock().unlock();
        AppMethodBeat.o(72032);
      }
      finally
      {
        lock.writeLock().unlock();
        AppMethodBeat.o(72032);
      }
    }
  }

  public static void initStore()
  {
    AppMethodBeat.i(72028);
    if (initialized)
      AppMethodBeat.o(72028);
    while (true)
    {
      return;
      AppEventsLogger.getAnalyticsExecutor().execute(new UserDataStore.1());
      AppMethodBeat.o(72028);
    }
  }

  private static boolean maybeSHA256Hashed(String paramString)
  {
    AppMethodBeat.i(72036);
    boolean bool = paramString.matches("[A-Fa-f0-9]{64}");
    AppMethodBeat.o(72036);
    return bool;
  }

  private static String normalizeData(String paramString1, String paramString2)
  {
    AppMethodBeat.i(72035);
    String str = "";
    int i = -1;
    switch (paramString1.hashCode())
    {
    default:
      switch (i)
      {
      default:
        paramString1 = str;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      break;
    case 3240:
    case 3272:
    case 3458:
    case 3185:
    case 3681:
    case 957831062:
    case 3576:
    case 3294:
    }
    while (true)
    {
      AppMethodBeat.o(72035);
      return paramString1;
      if (!paramString1.equals("em"))
        break;
      i = 0;
      break;
      if (!paramString1.equals("fn"))
        break;
      i = 1;
      break;
      if (!paramString1.equals("ln"))
        break;
      i = 2;
      break;
      if (!paramString1.equals("ct"))
        break;
      i = 3;
      break;
      if (!paramString1.equals("st"))
        break;
      i = 4;
      break;
      if (!paramString1.equals("country"))
        break;
      i = 5;
      break;
      if (!paramString1.equals("ph"))
        break;
      i = 6;
      break;
      if (!paramString1.equals("ge"))
        break;
      i = 7;
      break;
      paramString1 = paramString2.trim().toLowerCase();
      continue;
      paramString1 = paramString2.trim().replaceAll("[^0-9]", "");
      continue;
      paramString1 = paramString2.trim().toLowerCase();
      if (paramString1.length() > 0)
        paramString1 = paramString1.substring(0, 1);
      else
        paramString1 = "";
    }
  }

  public static void setUserDataAndHash(Bundle paramBundle)
  {
    AppMethodBeat.i(72029);
    if (!initialized)
      initAndWait();
    AppEventsLogger.getAnalyticsExecutor().execute(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(72027);
        UserDataStore.lock.writeLock().lock();
        try
        {
          UserDataStore.access$202(UserDataStore.access$300(this.val$ud));
          SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
          localEditor.putString("com.facebook.appevents.UserDataStore.userData", UserDataStore.hashedUserData);
          localEditor.apply();
          return;
        }
        finally
        {
          UserDataStore.lock.writeLock().unlock();
          AppMethodBeat.o(72027);
        }
      }
    });
    AppMethodBeat.o(72029);
  }

  public static void setUserDataAndHash(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    AppMethodBeat.i(72030);
    Bundle localBundle = new Bundle();
    if (paramString1 != null)
      localBundle.putString("em", paramString1);
    if (paramString2 != null)
      localBundle.putString("fn", paramString2);
    if (paramString3 != null)
      localBundle.putString("ln", paramString3);
    if (paramString4 != null)
      localBundle.putString("ph", paramString4);
    if (paramString5 != null)
      localBundle.putString("db", paramString5);
    if (paramString6 != null)
      localBundle.putString("ge", paramString6);
    if (paramString7 != null)
      localBundle.putString("ct", paramString7);
    if (paramString8 != null)
      localBundle.putString("st", paramString8);
    if (paramString9 != null)
      localBundle.putString("zp", paramString9);
    if (paramString10 != null)
      localBundle.putString("country", paramString10);
    setUserDataAndHash(localBundle);
    AppMethodBeat.o(72030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.UserDataStore
 * JD-Core Version:    0.6.2
 */