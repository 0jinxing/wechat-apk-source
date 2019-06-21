package com.tencent.tinker.loader.hotplug.interceptor;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.IBinder;
import android.os.IInterface;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ServiceBinderInterceptor extends Interceptor<IBinder>
{
  private static Class<?> ADB = null;
  private static Field ADC = null;
  private static Method ADE = null;
  private final BinderInvocationHandler ADA;
  private final Context ADz;
  private final String bWb;

  // ERROR //
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: putstatic 35	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:ADB	Ljava/lang/Class;
    //   4: aconst_null
    //   5: putstatic 37	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:ADC	Ljava/lang/reflect/Field;
    //   8: aconst_null
    //   9: putstatic 39	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:ADE	Ljava/lang/reflect/Method;
    //   12: ldc 2
    //   14: monitorenter
    //   15: getstatic 35	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:ADB	Ljava/lang/Class;
    //   18: astore_0
    //   19: aload_0
    //   20: ifnonnull +42 -> 62
    //   23: ldc 41
    //   25: invokestatic 47	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   28: astore_0
    //   29: aload_0
    //   30: putstatic 35	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:ADB	Ljava/lang/Class;
    //   33: aload_0
    //   34: ldc 49
    //   36: invokestatic 55	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   39: putstatic 37	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:ADC	Ljava/lang/reflect/Field;
    //   42: getstatic 35	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:ADB	Ljava/lang/Class;
    //   45: ldc 57
    //   47: iconst_1
    //   48: anewarray 43	java/lang/Class
    //   51: dup
    //   52: iconst_0
    //   53: ldc 59
    //   55: aastore
    //   56: invokestatic 63	com/tencent/tinker/loader/shareutil/ShareReflectUtil:c	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   59: putstatic 39	com/tencent/tinker/loader/hotplug/interceptor/ServiceBinderInterceptor:ADE	Ljava/lang/reflect/Method;
    //   62: ldc 2
    //   64: monitorexit
    //   65: return
    //   66: astore_0
    //   67: ldc 2
    //   69: monitorexit
    //   70: aload_0
    //   71: athrow
    //   72: astore_0
    //   73: goto -11 -> 62
    //
    // Exception table:
    //   from	to	target	type
    //   15	19	66	finally
    //   23	62	66	finally
    //   62	65	66	finally
    //   67	70	66	finally
    //   23	62	72	java/lang/Throwable
  }

  public ServiceBinderInterceptor(Context paramContext, String paramString, BinderInvocationHandler paramBinderInvocationHandler)
  {
    while ((paramContext != null) && ((paramContext instanceof ContextWrapper)))
      paramContext = ((ContextWrapper)paramContext).getBaseContext();
    this.ADz = paramContext;
    this.bWb = paramString;
    this.ADA = paramBinderInvocationHandler;
  }

  private static <T> T a(Class<?>[] paramArrayOfClass, InvocationHandler paramInvocationHandler)
  {
    Class[] arrayOfClass = new Class[paramArrayOfClass.length + 1];
    System.arraycopy(paramArrayOfClass, 0, arrayOfClass, 0, paramArrayOfClass.length);
    arrayOfClass[paramArrayOfClass.length] = Interceptor.ITinkerHotplugProxy.class;
    try
    {
      paramArrayOfClass = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), arrayOfClass, paramInvocationHandler);
      return paramArrayOfClass;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        paramArrayOfClass = new HashSet(4);
        int i = arrayOfClass.length;
        for (int j = 0; j < i; j++)
          paramArrayOfClass.add(arrayOfClass[j].getClassLoader());
        if (paramArrayOfClass.size() == 1)
          paramArrayOfClass = (ClassLoader)paramArrayOfClass.iterator().next();
        try
        {
          while (true)
          {
            paramInvocationHandler = Proxy.newProxyInstance(paramArrayOfClass, arrayOfClass, paramInvocationHandler);
            paramArrayOfClass = paramInvocationHandler;
            break;
            paramArrayOfClass = new ClassLoader()
            {
              protected final Class<?> loadClass(String paramAnonymousString, boolean paramAnonymousBoolean)
              {
                Iterator localIterator = this.ADF.iterator();
                while (localIterator.hasNext())
                {
                  Class localClass = ((ClassLoader)localIterator.next()).loadClass(paramAnonymousString);
                  if (localClass != null)
                    return localClass;
                }
                throw new ClassNotFoundException("cannot find class: ".concat(String.valueOf(paramAnonymousString)));
              }
            };
          }
        }
        catch (Throwable paramInvocationHandler)
        {
        }
      }
      throw new RuntimeException("cl: ".concat(String.valueOf(paramArrayOfClass)), localThrowable);
    }
  }

  private static Class<?>[] aK(Class<?> paramClass)
  {
    if (paramClass == null);
    HashSet localHashSet;
    for (paramClass = null; ; paramClass = (Class[])localHashSet.toArray(new Class[localHashSet.size()]))
    {
      return paramClass;
      localHashSet = new HashSet(10);
      while (!Object.class.equals(paramClass))
      {
        localHashSet.addAll(Arrays.asList(paramClass.getInterfaces()));
        paramClass = paramClass.getSuperclass();
      }
    }
  }

  public static abstract interface BinderInvocationHandler
  {
    public abstract Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject);
  }

  static class FakeClientBinderHandler
    implements InvocationHandler
  {
    private final ServiceBinderInterceptor.BinderInvocationHandler ADA;
    private final IBinder ADG;

    FakeClientBinderHandler(IBinder paramIBinder, ServiceBinderInterceptor.BinderInvocationHandler paramBinderInvocationHandler)
    {
      this.ADG = paramIBinder;
      this.ADA = paramBinderInvocationHandler;
    }

    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if ("queryLocalInterface".equals(paramMethod.getName()))
      {
        paramMethod = this.ADG.getInterfaceDescriptor();
        if (paramMethod.equals("android.app.IActivityManager"))
        {
          paramMethod = "android.app.ActivityManagerNative";
          paramMethod = (IInterface)ShareReflectUtil.c(Class.forName(paramMethod), "asInterface", new Class[] { IBinder.class }).invoke(null, new Object[] { this.ADG });
          paramObject = new ServiceBinderInterceptor.FakeInterfaceHandler(paramMethod, (IBinder)paramObject, this.ADA);
        }
      }
      for (paramObject = ServiceBinderInterceptor.b(ServiceBinderInterceptor.aL(paramMethod.getClass()), paramObject); ; paramObject = paramMethod.invoke(this.ADG, paramArrayOfObject))
      {
        return paramObject;
        paramMethod = paramMethod + "$Stub";
        break;
      }
    }
  }

  static class FakeInterfaceHandler
    implements InvocationHandler
  {
    private final ServiceBinderInterceptor.BinderInvocationHandler ADA;
    private final IBinder ADG;
    private final IInterface ADH;

    FakeInterfaceHandler(IInterface paramIInterface, IBinder paramIBinder, ServiceBinderInterceptor.BinderInvocationHandler paramBinderInvocationHandler)
    {
      this.ADH = paramIInterface;
      this.ADG = paramIBinder;
      this.ADA = paramBinderInvocationHandler;
    }

    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if ("asBinder".equals(paramMethod.getName()));
      for (paramObject = this.ADG; ; paramObject = this.ADA.invoke(this.ADH, paramMethod, paramArrayOfObject))
        return paramObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor
 * JD-Core Version:    0.6.2
 */