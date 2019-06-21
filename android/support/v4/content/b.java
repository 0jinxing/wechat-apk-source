package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

public class b
{
  private static TypedValue Gk;
  private static final Object sLock = new Object();

  public static File[] O(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 19);
    File[] arrayOfFile;
    for (paramContext = paramContext.getExternalFilesDirs(null); ; paramContext = arrayOfFile)
    {
      return paramContext;
      arrayOfFile = new File[1];
      arrayOfFile[0] = paramContext.getExternalFilesDir(null);
    }
  }

  public static File[] P(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 19);
    File[] arrayOfFile;
    for (paramContext = paramContext.getExternalCacheDirs(); ; paramContext = arrayOfFile)
    {
      return paramContext;
      arrayOfFile = new File[1];
      arrayOfFile[0] = paramContext.getExternalCacheDir();
    }
  }

  public static File Q(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (paramContext = paramContext.getNoBackupFilesDir(); ; paramContext = h(new File(paramContext.getApplicationInfo().dataDir, "no_backup")))
      return paramContext;
  }

  public static boolean R(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24);
    for (boolean bool = paramContext.isDeviceProtectedStorage(); ; bool = false)
      return bool;
  }

  public static boolean a(Context paramContext, Intent[] paramArrayOfIntent)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramContext.startActivities(paramArrayOfIntent, null);
    while (true)
    {
      return true;
      paramContext.startActivities(paramArrayOfIntent);
    }
  }

  public static int checkSelfPermission(Context paramContext, String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("permission is null");
    return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
  }

  public static Drawable g(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramContext = paramContext.getDrawable(paramInt);
    while (true)
    {
      return paramContext;
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramContext = paramContext.getResources().getDrawable(paramInt);
        continue;
      }
      synchronized (sLock)
      {
        if (Gk == null)
        {
          TypedValue localTypedValue = new android/util/TypedValue;
          localTypedValue.<init>();
          Gk = localTypedValue;
        }
        paramContext.getResources().getValue(paramInt, Gk, true);
        paramInt = Gk.resourceId;
        paramContext = paramContext.getResources().getDrawable(paramInt);
      }
    }
  }

  public static ColorStateList h(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23);
    for (paramContext = paramContext.getColorStateList(paramInt); ; paramContext = paramContext.getResources().getColorStateList(paramInt))
      return paramContext;
  }

  private static File h(File paramFile)
  {
    Object localObject = paramFile;
    try
    {
      if (!paramFile.exists())
      {
        localObject = paramFile;
        if (!paramFile.mkdirs())
        {
          boolean bool = paramFile.exists();
          if (!bool)
            break label37;
        }
      }
      for (localObject = paramFile; ; localObject = null)
      {
        return localObject;
        label37: localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Unable to create files subdir ");
        ((StringBuilder)localObject).append(paramFile.getPath());
      }
    }
    finally
    {
    }
    throw paramFile;
  }

  public static int i(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23);
    for (paramInt = paramContext.getColor(paramInt); ; paramInt = paramContext.getResources().getColor(paramInt))
      return paramInt;
  }

  public static void startActivity(Context paramContext, Intent paramIntent, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramContext.startActivity(paramIntent, paramBundle);
    while (true)
    {
      return;
      paramContext.startActivity(paramIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.content.b
 * JD-Core Version:    0.6.2
 */