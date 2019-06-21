package com.tencent.tinker.loader.hotplug;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.hotplug.handler.AMSInterceptHandler;
import com.tencent.tinker.loader.hotplug.handler.MHMessageHandler;
import com.tencent.tinker.loader.hotplug.handler.PMSInterceptHandler;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.MessageHandler;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor.BinderInvocationHandler;
import com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import java.lang.reflect.Field;

public final class ComponentHotplug
{
  private static volatile boolean ABB = false;
  private static ServiceBinderInterceptor ADk;
  private static ServiceBinderInterceptor ADl;
  private static HandlerMessageInterceptor ADm;
  private static TinkerHackInstrumentation ADn;

  private ComponentHotplug()
  {
    throw new UnsupportedOperationException();
  }

  public static void a(TinkerApplication paramTinkerApplication, ShareSecurityCheck paramShareSecurityCheck)
  {
    try
    {
      boolean bool = ABB;
      if (!bool);
      try
      {
        if (IncrementComponentManager.a(paramTinkerApplication, paramShareSecurityCheck))
        {
          paramShareSecurityCheck = new com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor;
          Object localObject = new com/tencent/tinker/loader/hotplug/handler/AMSInterceptHandler;
          ((AMSInterceptHandler)localObject).<init>(paramTinkerApplication);
          paramShareSecurityCheck.<init>(paramTinkerApplication, "activity", (ServiceBinderInterceptor.BinderInvocationHandler)localObject);
          ADk = paramShareSecurityCheck;
          paramShareSecurityCheck = new com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor;
          localObject = new com/tencent/tinker/loader/hotplug/handler/PMSInterceptHandler;
          ((PMSInterceptHandler)localObject).<init>();
          paramShareSecurityCheck.<init>(paramTinkerApplication, "package", (ServiceBinderInterceptor.BinderInvocationHandler)localObject);
          ADl = paramShareSecurityCheck;
          ADk.dSn();
          ADl.dSn();
          if (Build.VERSION.SDK_INT >= 27)
            break label130;
          Handler localHandler = jf(paramTinkerApplication);
          paramShareSecurityCheck = new com/tencent/tinker/loader/hotplug/interceptor/HandlerMessageInterceptor;
          localObject = new com/tencent/tinker/loader/hotplug/handler/MHMessageHandler;
          ((MHMessageHandler)localObject).<init>(paramTinkerApplication);
          paramShareSecurityCheck.<init>(localHandler, (HandlerMessageInterceptor.MessageHandler)localObject);
          ADm = paramShareSecurityCheck;
          paramShareSecurityCheck.dSn();
        }
        while (true)
        {
          ABB = true;
          return;
          label130: paramTinkerApplication = TinkerHackInstrumentation.jg(paramTinkerApplication);
          ADn = paramTinkerApplication;
          paramTinkerApplication.dSn();
        }
      }
      catch (Throwable paramShareSecurityCheck)
      {
        uninstall();
        paramTinkerApplication = new com/tencent/tinker/loader/hotplug/UnsupportedEnvironmentException;
        paramTinkerApplication.<init>(paramShareSecurityCheck);
        throw paramTinkerApplication;
      }
    }
    finally
    {
    }
    throw paramTinkerApplication;
  }

  public static void dSl()
  {
    try
    {
      boolean bool = ABB;
      if (bool);
      try
      {
        ADk.dSn();
        ADl.dSn();
        if (Build.VERSION.SDK_INT < 27)
          ADm.dSn();
        while (true)
        {
          return;
          ADn.dSn();
        }
      }
      catch (Throwable localThrowable)
      {
        uninstall();
        UnsupportedEnvironmentException localUnsupportedEnvironmentException = new com/tencent/tinker/loader/hotplug/UnsupportedEnvironmentException;
        localUnsupportedEnvironmentException.<init>(localThrowable);
        throw localUnsupportedEnvironmentException;
      }
    }
    finally
    {
    }
  }

  private static Handler jf(Context paramContext)
  {
    paramContext = ShareReflectUtil.d(paramContext, null);
    if (paramContext == null)
      throw new IllegalStateException("failed to fetch instance of ActivityThread.");
    try
    {
      paramContext = (Handler)ShareReflectUtil.b(paramContext, "mH").get(paramContext);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
    }
    throw new IllegalStateException(paramContext);
  }

  private static void uninstall()
  {
    try
    {
      boolean bool = ABB;
      if (bool);
      try
      {
        ADk.uninstall();
        ADl.uninstall();
        if (Build.VERSION.SDK_INT < 27)
          ADm.uninstall();
        while (true)
        {
          label37: ABB = false;
          return;
          TinkerHackInstrumentation localTinkerHackInstrumentation = ADn;
          localTinkerHackInstrumentation.ADK.set(localTinkerHackInstrumentation.ADJ, localTinkerHackInstrumentation.ADI);
        }
      }
      catch (Throwable localThrowable)
      {
        break label37;
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.hotplug.ComponentHotplug
 * JD-Core Version:    0.6.2
 */