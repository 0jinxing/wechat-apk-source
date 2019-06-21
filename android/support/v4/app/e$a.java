package android.support.v4.app;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class e$a
{
  private static Method Ct;
  private static boolean Cu;
  private static Method Cv;
  private static boolean Cw;

  public static void a(Bundle paramBundle, String paramString, IBinder paramIBinder)
  {
    if (!Cw);
    try
    {
      Method localMethod = Bundle.class.getMethod("putIBinder", new Class[] { String.class, IBinder.class });
      Cv = localMethod;
      localMethod.setAccessible(true);
      label37: Cw = true;
      if (Cv != null);
      try
      {
        Cv.invoke(paramBundle, new Object[] { paramString, paramIBinder });
        return;
      }
      catch (IllegalAccessException paramBundle)
      {
        while (true)
          Cv = null;
      }
      catch (IllegalArgumentException paramBundle)
      {
        break label69;
      }
      catch (InvocationTargetException paramBundle)
      {
        label69: break label69;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label37;
    }
  }

  public static IBinder c(Bundle paramBundle, String paramString)
  {
    if (!Cu);
    try
    {
      Method localMethod = Bundle.class.getMethod("getIBinder", new Class[] { String.class });
      Ct = localMethod;
      localMethod.setAccessible(true);
      label32: Cu = true;
      if (Ct != null);
      try
      {
        paramBundle = (IBinder)Ct.invoke(paramBundle, new Object[] { paramString });
        return paramBundle;
      }
      catch (IllegalAccessException paramBundle)
      {
        while (true)
        {
          Ct = null;
          paramBundle = null;
        }
      }
      catch (IllegalArgumentException paramBundle)
      {
        break label64;
      }
      catch (InvocationTargetException paramBundle)
      {
        label64: break label64;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label32;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.app.e.a
 * JD-Core Version:    0.6.2
 */