package com.tencent.tinker.loader.hotplug.handler;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import com.tencent.tinker.loader.hotplug.ActivityStubManager;
import com.tencent.tinker.loader.hotplug.IncrementComponentManager;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AMSInterceptHandler
  implements ServiceBinderInterceptor.BinderInvocationHandler
{
  private static final int[] ADr = { 16842840 };
  private static final int ADs;
  private final Context mContext;

  static
  {
    if (Build.VERSION.SDK_INT < 27);
    while (true)
    {
      try
      {
        i = ((Integer)ShareReflectUtil.d(ActivityManager.class, "INTENT_SENDER_ACTIVITY").get(null)).intValue();
        ADs = i;
        return;
      }
      catch (Throwable localThrowable)
      {
        i = 2;
        continue;
      }
      int i = 2;
    }
  }

  public AMSInterceptHandler(Context paramContext)
  {
    while ((paramContext instanceof ContextWrapper))
    {
      Context localContext = ((ContextWrapper)paramContext).getBaseContext();
      if (localContext == null)
        break;
      paramContext = localContext;
    }
    this.mContext = paramContext;
  }

  private Object a(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    int i = 0;
    if (i < paramArrayOfObject.length)
      if (!(paramArrayOfObject[i] instanceof Intent));
    while (true)
    {
      if (i != -1)
      {
        Intent localIntent = new Intent((Intent)paramArrayOfObject[i]);
        bd(localIntent);
        paramArrayOfObject[i] = localIntent;
      }
      return paramMethod.invoke(paramObject, paramArrayOfObject);
      i++;
      break;
      i = -1;
    }
  }

  private void a(Intent paramIntent, String paramString1, String paramString2, String paramString3)
  {
    paramString2 = new ComponentName(paramString1, paramString2);
    ShareIntentUtil.a(paramIntent, this.mContext.getClassLoader());
    paramIntent.putExtra("tinker_iek_old_component", paramString2);
    paramIntent.setComponent(new ComponentName(paramString1, paramString3));
  }

  private boolean a(ActivityInfo paramActivityInfo)
  {
    boolean bool1 = false;
    int i = paramActivityInfo.getThemeResource();
    Object localObject1 = this.mContext.getResources().newTheme();
    ((Resources.Theme)localObject1).applyStyle(i, true);
    Object localObject2 = null;
    paramActivityInfo = null;
    try
    {
      localObject1 = ((Resources.Theme)localObject1).obtainStyledAttributes(ADr);
      paramActivityInfo = (ActivityInfo)localObject1;
      localObject2 = localObject1;
      bool2 = ((TypedArray)localObject1).getBoolean(0, false);
      bool1 = bool2;
      bool2 = bool1;
      if (localObject1 != null)
      {
        ((TypedArray)localObject1).recycle();
        bool2 = bool1;
      }
      return bool2;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool2 = bool1;
        if (paramActivityInfo != null)
        {
          paramActivityInfo.recycle();
          bool2 = bool1;
        }
      }
    }
    finally
    {
      if (localThrowable != null)
        localThrowable.recycle();
    }
    throw paramActivityInfo;
  }

  private Object b(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    int i = 0;
    int j = 0;
    if (j < paramArrayOfObject.length)
      if (!(paramArrayOfObject[j] instanceof Intent[]));
    while (true)
    {
      if ((j != -1) && (((Integer)paramArrayOfObject[0]).intValue() == ADs))
      {
        Intent[] arrayOfIntent = (Intent[])paramArrayOfObject[j];
        j = i;
        while (true)
          if (j < arrayOfIntent.length)
          {
            Intent localIntent = new Intent(arrayOfIntent[j]);
            bd(localIntent);
            arrayOfIntent[j] = localIntent;
            j++;
            continue;
            j++;
            break;
          }
      }
      return paramMethod.invoke(paramObject, paramArrayOfObject);
      j = -1;
    }
  }

  private void bd(Intent paramIntent)
  {
    Object localObject1;
    Object localObject2;
    if (paramIntent.getComponent() != null)
    {
      localObject1 = paramIntent.getComponent().getPackageName();
      localObject2 = paramIntent.getComponent().getClassName();
    }
    while (true)
    {
      if (IncrementComponentManager.aum((String)localObject2))
      {
        ActivityInfo localActivityInfo = IncrementComponentManager.aun((String)localObject2);
        boolean bool = a(localActivityInfo);
        a(paramIntent, (String)localObject1, (String)localObject2, ActivityStubManager.y((String)localObject2, localActivityInfo.launchMode, bool));
      }
      return;
      localObject1 = this.mContext.getPackageManager().resolveActivity(paramIntent, 0);
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = IncrementComponentManager.bc(paramIntent);
      if ((localObject2 != null) && (((ResolveInfo)localObject2).filter != null) && (((ResolveInfo)localObject2).filter.hasCategory("android.intent.category.DEFAULT")))
      {
        localObject1 = ((ResolveInfo)localObject2).activityInfo.packageName;
        localObject2 = ((ResolveInfo)localObject2).activityInfo.name;
      }
      else
      {
        localObject2 = null;
        localObject1 = null;
      }
    }
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    int i = 0;
    Object localObject = paramMethod.getName();
    if ("startActivity".equals(localObject))
    {
      paramObject = a(paramObject, paramMethod, paramArrayOfObject);
      return paramObject;
    }
    int j;
    if ("startActivities".equals(localObject))
    {
      j = 0;
      if (j >= paramArrayOfObject.length)
        break label229;
      if (!(paramArrayOfObject[j] instanceof Intent[]));
    }
    while (true)
    {
      if (j != -1)
      {
        Intent[] arrayOfIntent = (Intent[])paramArrayOfObject[j];
        j = i;
        while (true)
          if (j < arrayOfIntent.length)
          {
            localObject = new Intent(arrayOfIntent[j]);
            bd((Intent)localObject);
            arrayOfIntent[j] = localObject;
            j++;
            continue;
            j++;
            break;
          }
      }
      paramObject = paramMethod.invoke(paramObject, paramArrayOfObject);
      break;
      if ("startActivityAndWait".equals(localObject))
      {
        paramObject = a(paramObject, paramMethod, paramArrayOfObject);
        break;
      }
      if ("startActivityWithConfig".equals(localObject))
      {
        paramObject = a(paramObject, paramMethod, paramArrayOfObject);
        break;
      }
      if ("startActivityAsUser".equals(localObject))
      {
        paramObject = a(paramObject, paramMethod, paramArrayOfObject);
        break;
      }
      if ("getIntentSender".equals(localObject))
      {
        paramObject = b(paramObject, paramMethod, paramArrayOfObject);
        break;
      }
      paramObject = paramMethod.invoke(paramObject, paramArrayOfObject);
      break;
      label229: j = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.hotplug.handler.AMSInterceptHandler
 * JD-Core Version:    0.6.2
 */