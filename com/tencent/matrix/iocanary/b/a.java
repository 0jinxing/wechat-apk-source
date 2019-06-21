package com.tencent.matrix.iocanary.b;

import com.tencent.matrix.c.c.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class a
{
  private static volatile Object bWl;
  public volatile boolean bWk;
  private final c.a bWm;

  public a(c.a parama)
  {
    this.bWm = parama;
  }

  public static boolean zg()
  {
    boolean bool = true;
    try
    {
      Object localObject = Class.forName("dalvik.system.CloseGuard");
      Method localMethod = ((Class)localObject).getDeclaredMethod("setReporter", new Class[] { Class.forName("dalvik.system.CloseGuard$Reporter") });
      localObject = ((Class)localObject).getDeclaredMethod("setEnabled", new Class[] { Boolean.TYPE });
      localMethod.invoke(null, new Object[] { bWl });
      ((Method)localObject).invoke(null, new Object[] { Boolean.FALSE });
      c.setEnabled(false);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        com.tencent.matrix.d.c.e("Matrix.CloseGuardHooker", "tryHook exp=%s", new Object[] { localThrowable });
        bool = false;
      }
    }
  }

  public final boolean zf()
  {
    boolean bool = false;
    try
    {
      Object localObject1 = Class.forName("dalvik.system.CloseGuard");
      Class localClass = Class.forName("dalvik.system.CloseGuard$Reporter");
      Object localObject2 = ((Class)localObject1).getDeclaredMethod("getReporter", new Class[0]);
      Method localMethod = ((Class)localObject1).getDeclaredMethod("setReporter", new Class[] { localClass });
      localObject1 = ((Class)localObject1).getDeclaredMethod("setEnabled", new Class[] { Boolean.TYPE });
      bWl = ((Method)localObject2).invoke(null, new Object[0]);
      ((Method)localObject1).invoke(null, new Object[] { Boolean.TRUE });
      c.setEnabled(true);
      localObject1 = localClass.getClassLoader();
      if (localObject1 == null);
      while (true)
      {
        return bool;
        localObject2 = new com/tencent/matrix/iocanary/b/b;
        ((b)localObject2).<init>(this.bWm, bWl);
        localMethod.invoke(null, new Object[] { Proxy.newProxyInstance((ClassLoader)localObject1, new Class[] { localClass }, (InvocationHandler)localObject2) });
        bool = true;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        com.tencent.matrix.d.c.e("Matrix.CloseGuardHooker", "tryHook exp=%s", new Object[] { localThrowable });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.iocanary.b.a
 * JD-Core Version:    0.6.2
 */