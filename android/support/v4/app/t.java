package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class t
{
  public static Intent a(Context paramContext, ComponentName paramComponentName)
  {
    String str = b(paramContext, paramComponentName);
    if (str == null)
      paramContext = null;
    while (true)
    {
      return paramContext;
      paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
      if (b(paramContext, paramComponentName) == null)
        paramContext = Intent.makeMainActivity(paramComponentName);
      else
        paramContext = new Intent().setComponent(paramComponentName);
    }
  }

  private static String b(Context paramContext, ComponentName paramComponentName)
  {
    Object localObject = paramContext.getPackageManager().getActivityInfo(paramComponentName, 128);
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramComponentName = ((ActivityInfo)localObject).parentActivityName;
      if (paramComponentName == null);
    }
    while (true)
    {
      return paramComponentName;
      if (((ActivityInfo)localObject).metaData == null)
      {
        paramComponentName = null;
      }
      else
      {
        localObject = ((ActivityInfo)localObject).metaData.getString("android.support.PARENT_ACTIVITY");
        if (localObject == null)
        {
          paramComponentName = null;
        }
        else
        {
          paramComponentName = (ComponentName)localObject;
          if (((String)localObject).charAt(0) == '.')
            paramComponentName = paramContext.getPackageName() + (String)localObject;
        }
      }
    }
  }

  public static Intent f(Activity paramActivity)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 16)
    {
      localObject = paramActivity.getParentActivityIntent();
      if (localObject != null)
        paramActivity = (Activity)localObject;
    }
    while (true)
    {
      return paramActivity;
      localObject = g(paramActivity);
      if (localObject == null)
      {
        paramActivity = null;
      }
      else
      {
        ComponentName localComponentName = new ComponentName(paramActivity, (String)localObject);
        try
        {
          if (b(paramActivity, localComponentName) == null)
          {
            paramActivity = Intent.makeMainActivity(localComponentName);
          }
          else
          {
            paramActivity = new android/content/Intent;
            paramActivity.<init>();
            paramActivity = paramActivity.setComponent(localComponentName);
          }
        }
        catch (PackageManager.NameNotFoundException paramActivity)
        {
          new StringBuilder("getParentActivityIntent: bad parentActivityName '").append((String)localObject).append("' in manifest");
          paramActivity = null;
        }
      }
    }
  }

  public static String g(Activity paramActivity)
  {
    try
    {
      paramActivity = b(paramActivity, paramActivity.getComponentName());
      return paramActivity;
    }
    catch (PackageManager.NameNotFoundException paramActivity)
    {
    }
    throw new IllegalArgumentException(paramActivity);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.t
 * JD-Core Version:    0.6.2
 */