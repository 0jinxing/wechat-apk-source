package android.support.v7.app;

import android.content.res.Resources;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

final class k
{
  private static Field Wc;
  private static boolean Wd;
  private static Class We;
  private static boolean Wf;
  private static Field Wg;
  private static boolean Wh;
  private static Field Wi;
  private static boolean Wj;

  private static boolean M(Object paramObject)
  {
    if (!Wf);
    try
    {
      We = Class.forName("android.content.res.ThemedResourceCache");
      label14: Wf = true;
      boolean bool;
      if (We == null)
        bool = false;
      while (true)
      {
        return bool;
        if (!Wh);
        try
        {
          Field localField = We.getDeclaredField("mUnthemedEntries");
          Wg = localField;
          localField.setAccessible(true);
          label52: Wh = true;
          if (Wg == null)
          {
            bool = false;
            continue;
          }
          try
          {
            paramObject = (LongSparseArray)Wg.get(paramObject);
            if (paramObject != null)
            {
              paramObject.clear();
              bool = true;
            }
          }
          catch (IllegalAccessException paramObject)
          {
            while (true)
              paramObject = null;
            bool = false;
          }
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          break label52;
        }
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label14;
    }
  }

  static boolean a(Resources paramResources)
  {
    if (!Wd);
    try
    {
      Field localField = Resources.class.getDeclaredField("mDrawableCache");
      Wc = localField;
      localField.setAccessible(true);
      label23: Wd = true;
      if (Wc != null);
      while (true)
      {
        try
        {
          paramResources = (Map)Wc.get(paramResources);
          if (paramResources != null)
          {
            paramResources.clear();
            bool = true;
            return bool;
          }
        }
        catch (IllegalAccessException paramResources)
        {
          paramResources = null;
          continue;
        }
        boolean bool = false;
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label23;
    }
  }

  static boolean b(Resources paramResources)
  {
    boolean bool1 = false;
    if (!Wd);
    try
    {
      Object localObject1 = Resources.class.getDeclaredField("mDrawableCache");
      Wc = (Field)localObject1;
      ((Field)localObject1).setAccessible(true);
      label25: Wd = true;
      Object localObject2 = null;
      localObject1 = localObject2;
      if (Wc != null);
      try
      {
        localObject1 = Wc.get(paramResources);
        boolean bool2;
        if (localObject1 == null)
          bool2 = bool1;
        while (true)
        {
          return bool2;
          bool2 = bool1;
          if (localObject1 != null)
          {
            bool2 = bool1;
            if (M(localObject1))
              bool2 = true;
          }
        }
      }
      catch (IllegalAccessException paramResources)
      {
        while (true)
          localObject1 = localObject2;
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label25;
    }
  }

  static boolean c(Resources paramResources)
  {
    Object localObject1 = null;
    boolean bool1 = false;
    if (!Wj);
    try
    {
      Object localObject2 = Resources.class.getDeclaredField("mResourcesImpl");
      Wi = (Field)localObject2;
      ((Field)localObject2).setAccessible(true);
      label27: Wj = true;
      boolean bool2;
      if (Wi == null)
        bool2 = bool1;
      while (true)
      {
        return bool2;
        try
        {
          paramResources = Wi.get(paramResources);
          bool2 = bool1;
          if (paramResources == null)
            continue;
          if (Wd);
        }
        catch (IllegalAccessException paramResources)
        {
          try
          {
            localObject2 = paramResources.getClass().getDeclaredField("mDrawableCache");
            Wc = (Field)localObject2;
            ((Field)localObject2).setAccessible(true);
            label83: Wd = true;
            localObject2 = localObject1;
            if (Wc != null);
            try
            {
              localObject2 = Wc.get(paramResources);
              bool2 = bool1;
              if (localObject2 == null)
                continue;
              bool2 = bool1;
              if (!M(localObject2))
                continue;
              bool2 = true;
              continue;
              paramResources = paramResources;
              paramResources = null;
            }
            catch (IllegalAccessException paramResources)
            {
              while (true)
                localObject2 = localObject1;
            }
          }
          catch (NoSuchFieldException localNoSuchFieldException1)
          {
            break label83;
          }
        }
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException2)
    {
      break label27;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.k
 * JD-Core Version:    0.6.2
 */