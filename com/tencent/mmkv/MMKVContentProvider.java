package com.tencent.mmkv;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public class MMKVContentProvider extends ContentProvider
{
  private static Uri AiG;

  protected static String aB(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(124040);
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    if (paramContext != null)
    {
      Iterator localIterator = paramContext.getRunningAppProcesses().iterator();
      while (localIterator.hasNext())
      {
        paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if (paramContext.pid == paramInt)
        {
          paramContext = paramContext.processName;
          AppMethodBeat.o(124040);
        }
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = "";
      AppMethodBeat.o(124040);
    }
  }

  private static String gz(Context paramContext)
  {
    AppMethodBeat.i(124038);
    try
    {
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, MMKVContentProvider.class.getName());
      paramContext = paramContext.getPackageManager();
      if (paramContext != null)
      {
        paramContext = paramContext.getProviderInfo(localComponentName, 0);
        if (paramContext != null)
        {
          paramContext = paramContext.authority;
          AppMethodBeat.o(124038);
          return paramContext;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(124038);
      }
    }
  }

  protected static Uri ix(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(124037);
    if (AiG != null)
    {
      paramContext = AiG;
      AppMethodBeat.o(124037);
    }
    while (true)
    {
      return paramContext;
      if (paramContext == null)
      {
        AppMethodBeat.o(124037);
        paramContext = localObject;
      }
      else
      {
        paramContext = gz(paramContext);
        if (paramContext == null)
        {
          AppMethodBeat.o(124037);
          paramContext = localObject;
        }
        else
        {
          paramContext = Uri.parse("content://".concat(String.valueOf(paramContext)));
          AiG = paramContext;
          AppMethodBeat.o(124037);
        }
      }
    }
  }

  public Bundle call(String paramString1, String paramString2, Bundle paramBundle)
  {
    Object localObject = null;
    AppMethodBeat.i(124041);
    if ((paramString1.equals("mmkvFromAshmemID")) && (paramBundle != null))
    {
      int i = paramBundle.getInt("KEY_SIZE");
      int j = paramBundle.getInt("KEY_MODE");
      paramString1 = paramBundle.getString("KEY_CRYPT");
      paramString1 = MMKV.mmkvWithAshmemID(getContext(), paramString2, i, j, paramString1);
      if (paramString1 != null)
      {
        paramBundle = new ParcelableMMKV(paramString1);
        new StringBuilder().append(paramString2).append(" fd = ").append(paramString1.ashmemFD()).append(", meta fd = ").append(paramString1.ashmemMetaFD());
        paramString1 = new Bundle();
        paramString1.putParcelable("KEY", paramBundle);
        AppMethodBeat.o(124041);
      }
    }
    while (true)
    {
      return paramString1;
      AppMethodBeat.o(124041);
      paramString1 = localObject;
      continue;
      AppMethodBeat.o(124041);
      paramString1 = localObject;
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(124044);
    paramUri = new UnsupportedOperationException("Not implement in MMKV");
    AppMethodBeat.o(124044);
    throw paramUri;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    AppMethodBeat.i(124045);
    paramUri = new UnsupportedOperationException("Not implement in MMKV");
    AppMethodBeat.o(124045);
    throw paramUri;
  }

  public boolean onCreate()
  {
    boolean bool = false;
    AppMethodBeat.i(124039);
    Object localObject = getContext();
    if (localObject == null)
      AppMethodBeat.o(124039);
    while (true)
    {
      return bool;
      localObject = gz((Context)localObject);
      if (localObject == null)
      {
        AppMethodBeat.o(124039);
      }
      else
      {
        if (AiG == null)
          AiG = Uri.parse("content://".concat(String.valueOf(localObject)));
        bool = true;
        AppMethodBeat.o(124039);
      }
    }
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    AppMethodBeat.i(124042);
    paramUri = new UnsupportedOperationException("Not implement in MMKV");
    AppMethodBeat.o(124042);
    throw paramUri;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(124043);
    paramUri = new UnsupportedOperationException("Not implement in MMKV");
    AppMethodBeat.o(124043);
    throw paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mmkv.MMKVContentProvider
 * JD-Core Version:    0.6.2
 */