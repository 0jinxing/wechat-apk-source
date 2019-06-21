package com.tencent.tinker.loader.hotplug.handler;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import com.tencent.tinker.loader.hotplug.IncrementComponentManager;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MHMessageHandler
  implements HandlerMessageInterceptor.MessageHandler
{
  private static final int xHf;
  private final Context mContext;

  static
  {
    int i = 100;
    int j = i;
    if (Build.VERSION.SDK_INT < 27);
    try
    {
      j = ShareReflectUtil.d(Class.forName("android.app.ActivityThread$H"), "LAUNCH_ACTIVITY").getInt(null);
      xHf = j;
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        j = i;
    }
  }

  public MHMessageHandler(Context paramContext)
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

  private static <T> void G(T paramT1, T paramT2)
  {
    if ((paramT1 == null) || (paramT2 == null))
      return;
    Class localClass = paramT1.getClass();
    while (!localClass.equals(Object.class))
    {
      Field[] arrayOfField = localClass.getDeclaredFields();
      int i = arrayOfField.length;
      int j = 0;
      label35: Field localField;
      if (j < i)
      {
        localField = arrayOfField[j];
        if ((!localField.isSynthetic()) && (!Modifier.isStatic(localField.getModifiers())))
          if (!localField.isAccessible())
            localField.setAccessible(true);
      }
      try
      {
        localField.set(paramT2, localField.get(paramT1));
        label93: j++;
        break label35;
        localClass = localClass.getSuperclass();
      }
      catch (Throwable localThrowable)
      {
        break label93;
      }
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    int i = 2;
    if (paramMessage.what == xHf);
    Object localObject1;
    Object localObject2;
    ActivityInfo localActivityInfo1;
    ActivityInfo localActivityInfo2;
    try
    {
      localObject1 = paramMessage.obj;
      if (localObject1 == null)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("msg: [");
        ((StringBuilder)localObject2).append(paramMessage.what).append("] has no 'obj' value.");
      }
      while (true)
      {
        return false;
        paramMessage = (Intent)ShareReflectUtil.b(localObject1, "intent").get(localObject1);
        if (paramMessage != null)
        {
          ShareIntentUtil.a(paramMessage, this.mContext.getClassLoader());
          localObject2 = (ComponentName)paramMessage.getParcelableExtra("tinker_iek_old_component");
          if (localObject2 != null)
            break;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("oldComponent was null, start ");
          ((StringBuilder)localObject2).append(paramMessage.getComponent()).append(" next.");
        }
      }
    }
    catch (Throwable paramMessage)
    {
      while (true)
      {
        continue;
        localActivityInfo1 = (ActivityInfo)ShareReflectUtil.b(localObject1, "activityInfo").get(localObject1);
        if (localActivityInfo1 != null)
        {
          localActivityInfo2 = IncrementComponentManager.aun(((ComponentName)localObject2).getClassName());
          if (localActivityInfo2 != null)
            break;
          paramMessage = new java/lang/StringBuilder;
          paramMessage.<init>("Failed to query target activity's info, perhaps the target is not hotpluged component. Target: ");
          paramMessage.append(((ComponentName)localObject2).getClassName());
        }
      }
      j = localActivityInfo2.screenOrientation;
      if (j != -1)
        break label309;
    }
    int j = i;
    label309: 
    while (true)
      try
      {
        localObject1 = ShareReflectUtil.b(localObject1, "token").get(localObject1);
        Object localObject3 = ShareReflectUtil.c(Class.forName("android.app.ActivityManagerNative"), "getDefault", new Class[0]).invoke(null, new Object[0]);
        ShareReflectUtil.b(localObject3, "setRequestedOrientation", new Class[] { IBinder.class, Integer.TYPE }).invoke(localObject3, new Object[] { localObject1, Integer.valueOf(j) });
        G(localActivityInfo2, localActivityInfo1);
        paramMessage.setComponent((ComponentName)localObject2);
        paramMessage.removeExtra("tinker_iek_old_component");
      }
      catch (Throwable localThrowable)
      {
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.hotplug.handler.MHMessageHandler
 * JD-Core Version:    0.6.2
 */