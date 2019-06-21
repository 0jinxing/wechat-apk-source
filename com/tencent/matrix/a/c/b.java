package com.tencent.matrix.a.c;

import android.os.IBinder;
import android.os.IInterface;
import com.tencent.matrix.d.c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public final class b
{
  private final String bWb;
  private final String bWc;
  private final b bWd;
  private IBinder bWe;

  public b(String paramString1, String paramString2, b paramb)
  {
    this.bWb = paramString1;
    this.bWc = paramString2;
    this.bWd = paramb;
  }

  private Object za()
  {
    Object localObject1 = null;
    try
    {
      Class localClass = Class.forName(this.bWc);
      Object localObject2 = Class.forName(String.format("%s$Stub", new Object[] { this.bWc }));
      Object localObject3 = ((Class)localObject2).getDeclaredMethod("asInterface", new Class[] { IBinder.class }).invoke(null, new Object[] { this.bWe });
      ClassLoader localClassLoader = ((Class)localObject2).getClassLoader();
      if (localClassLoader == null)
      {
        c.e("Matrix.SystemServiceBinderHooker", "doHook exp classLoader null ", new Object[0]);
        localObject3 = Boolean.FALSE;
      }
      for (localObject1 = localObject3; ; localObject1 = localObject3)
      {
        return localObject1;
        localObject2 = new com/tencent/matrix/a/c/b$c;
        ((c)localObject2).<init>(localObject3, this.bWd);
        localObject3 = Proxy.newProxyInstance(localClassLoader, new Class[] { IBinder.class, IInterface.class, localClass }, (InvocationHandler)localObject2);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        c.w("Matrix.SystemServiceBinderHooker", "createPowerManagerServiceProxy exp:%s", new Object[] { localThrowable.getLocalizedMessage() });
    }
  }

  public final boolean doHook()
  {
    c.i("Matrix.SystemServiceBinderHooker", "doHook: serviceName:%s, serviceClsName:%s", new Object[] { this.bWb, this.bWc });
    try
    {
      Object localObject1 = Class.forName("android.os.ServiceManager");
      this.bWe = ((IBinder)((Class)localObject1).getDeclaredMethod("getService", new Class[] { String.class }).invoke(null, new Object[] { this.bWb }));
      Object localObject2 = ((Class)localObject1).getClassLoader();
      if (localObject2 == null)
        c.e("Matrix.SystemServiceBinderHooker", "doHook exp classLoader null ", new Object[0]);
      for (bool = false; ; bool = true)
      {
        return bool;
        a locala = new com/tencent/matrix/a/c/b$a;
        locala.<init>(this.bWe, za());
        localObject2 = (IBinder)Proxy.newProxyInstance((ClassLoader)localObject2, new Class[] { IBinder.class }, locala);
        localObject1 = ((Class)localObject1).getDeclaredField("sCache");
        ((Field)localObject1).setAccessible(true);
        ((Map)((Field)localObject1).get(null)).put(this.bWb, localObject2);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        c.e("Matrix.SystemServiceBinderHooker", "doHook exp : " + localThrowable.getLocalizedMessage(), new Object[0]);
        boolean bool = false;
      }
    }
  }

  public final boolean doUnHook()
  {
    boolean bool;
    if (this.bWe == null)
    {
      c.i("Matrix.SystemServiceBinderHooker", "doUnHook sOriginPowerManagerService null", new Object[0]);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        Field localField = Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
        localField.setAccessible(true);
        ((Map)localField.get(null)).put(this.bWb, this.bWe);
        bool = true;
      }
      catch (Throwable localThrowable)
      {
        c.e("Matrix.SystemServiceBinderHooker", "doUnHook exp : " + localThrowable.getLocalizedMessage(), new Object[0]);
        bool = false;
      }
    }
  }

  static final class a
    implements InvocationHandler
  {
    private final IBinder bWf;
    private final Object bWg;

    a(IBinder paramIBinder, Object paramObject)
    {
      this.bWf = paramIBinder;
      this.bWg = paramObject;
    }

    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (("queryLocalInterface".equals(paramMethod.getName())) && (this.bWg != null));
      for (paramObject = this.bWg; ; paramObject = paramMethod.invoke(this.bWf, paramArrayOfObject))
        return paramObject;
    }
  }

  public static abstract interface b
  {
    public abstract void b(Method paramMethod, Object[] paramArrayOfObject);
  }

  static final class c
    implements InvocationHandler
  {
    final Object bWh;
    final b.b bWi;

    c(Object paramObject, b.b paramb)
    {
      this.bWh = paramObject;
      this.bWi = paramb;
    }

    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      if (this.bWi != null)
        this.bWi.b(paramMethod, paramArrayOfObject);
      return paramMethod.invoke(this.bWh, paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.c.b
 * JD-Core Version:    0.6.2
 */