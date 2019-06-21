package android.support.v4.e;

import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class a
{
  private static Method KF;
  private static Method KG;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    while (true)
    {
      try
      {
        KG = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
        return;
      }
      catch (Exception localException1)
      {
        throw new IllegalStateException(localException1);
      }
      try
      {
        Class localClass = Class.forName("libcore.icu.ICU");
        if (localClass != null)
        {
          KF = localClass.getMethod("getScript", new Class[] { String.class });
          KG = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
        }
      }
      catch (Exception localException2)
      {
        KF = null;
        KG = null;
      }
    }
  }

  public static String a(Locale paramLocale)
  {
    String str1 = null;
    if (Build.VERSION.SDK_INT >= 21);
    try
    {
      str1 = ((Locale)KG.invoke(null, new Object[] { paramLocale })).getScript();
      paramLocale = str1;
      return paramLocale;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
      {
        paramLocale = paramLocale.getScript();
        continue;
        String str2 = b(paramLocale);
        paramLocale = localIllegalAccessException;
        if (str2 != null)
          paramLocale = getScript(str2);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label37: break label37;
    }
  }

  private static String b(Locale paramLocale)
  {
    paramLocale = paramLocale.toString();
    try
    {
      if (KG != null)
      {
        String str = (String)KG.invoke(null, new Object[] { paramLocale });
        paramLocale = str;
        label32: return paramLocale;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label32;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label35: break label35;
    }
  }

  private static String getScript(String paramString)
  {
    try
    {
      if (KF != null)
      {
        paramString = (String)KF.invoke(null, new Object[] { paramString });
        return paramString;
      }
    }
    catch (InvocationTargetException paramString)
    {
      while (true)
        paramString = null;
    }
    catch (IllegalAccessException paramString)
    {
      label28: break label28;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.e.a
 * JD-Core Version:    0.6.2
 */