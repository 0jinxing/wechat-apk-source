package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lifecycling
{
  private static Map<Class, Integer> cw = new HashMap();
  private static Map<Class, List<Constructor<? extends GeneratedAdapter>>> cx = new HashMap();

  private static GeneratedAdapter a(Constructor<? extends GeneratedAdapter> paramConstructor, Object paramObject)
  {
    try
    {
      paramConstructor = (GeneratedAdapter)paramConstructor.newInstance(new Object[] { paramObject });
      return paramConstructor;
    }
    catch (IllegalAccessException paramConstructor)
    {
      throw new RuntimeException(paramConstructor);
    }
    catch (InstantiationException paramConstructor)
    {
      throw new RuntimeException(paramConstructor);
    }
    catch (InvocationTargetException paramConstructor)
    {
    }
    throw new RuntimeException(paramConstructor);
  }

  static GenericLifecycleObserver e(Object paramObject)
  {
    if ((paramObject instanceof FullLifecycleObserver))
      paramObject = new FullLifecycleObserverAdapter((FullLifecycleObserver)paramObject);
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof GenericLifecycleObserver))
      {
        paramObject = (GenericLifecycleObserver)paramObject;
      }
      else
      {
        Object localObject = paramObject.getClass();
        if (h((Class)localObject) == 2)
        {
          localObject = (List)cx.get(localObject);
          if (((List)localObject).size() == 1)
          {
            paramObject = new SingleGeneratedAdapterObserver(a((Constructor)((List)localObject).get(0), paramObject));
          }
          else
          {
            GeneratedAdapter[] arrayOfGeneratedAdapter = new GeneratedAdapter[((List)localObject).size()];
            for (int i = 0; i < ((List)localObject).size(); i++)
              arrayOfGeneratedAdapter[i] = a((Constructor)((List)localObject).get(i), paramObject);
            paramObject = new CompositeGeneratedAdaptersObserver(arrayOfGeneratedAdapter);
          }
        }
        else
        {
          paramObject = new ReflectiveGenericLifecycleObserver(paramObject);
        }
      }
    }
  }

  private static Constructor<? extends GeneratedAdapter> g(Class<?> paramClass)
  {
    try
    {
      Object localObject = paramClass.getPackage();
      String str = paramClass.getCanonicalName();
      if (localObject != null)
      {
        localObject = ((Package)localObject).getName();
        if (!((String)localObject).isEmpty())
          break label80;
        label26: str = getAdapterName(str);
        if (!((String)localObject).isEmpty())
          break label94;
      }
      label80: label94: StringBuilder localStringBuilder;
      for (localObject = str; ; localObject = (String)localObject + "." + str)
      {
        localObject = Class.forName((String)localObject).getDeclaredConstructor(new Class[] { paramClass });
        paramClass = (Class<?>)localObject;
        if (!((Constructor)localObject).isAccessible())
        {
          ((Constructor)localObject).setAccessible(true);
          paramClass = (Class<?>)localObject;
        }
        return paramClass;
        localObject = "";
        break;
        str = str.substring(((String)localObject).length() + 1);
        break label26;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
      }
    }
    catch (ClassNotFoundException paramClass)
    {
      while (true)
        paramClass = null;
    }
    catch (NoSuchMethodException paramClass)
    {
    }
    throw new RuntimeException(paramClass);
  }

  public static String getAdapterName(String paramString)
  {
    return paramString.replace(".", "_") + "_LifecycleAdapter";
  }

  private static int h(Class<?> paramClass)
  {
    int i;
    if (cw.containsKey(paramClass))
      i = ((Integer)cw.get(paramClass)).intValue();
    while (true)
    {
      return i;
      i = i(paramClass);
      cw.put(paramClass, Integer.valueOf(i));
    }
  }

  private static int i(Class<?> paramClass)
  {
    int i;
    if (paramClass.getCanonicalName() == null)
      i = 1;
    Object localObject1;
    label112: Class localClass;
    while (true)
    {
      return i;
      localObject1 = g(paramClass);
      if (localObject1 != null)
      {
        cx.put(paramClass, Collections.singletonList(localObject1));
        i = 2;
      }
      else if (ClassesInfoCache.cd.d(paramClass))
      {
        i = 1;
      }
      else
      {
        Object localObject2 = paramClass.getSuperclass();
        localObject1 = null;
        if (j((Class)localObject2))
        {
          if (h((Class)localObject2) == 1)
            i = 1;
          else
            localObject1 = new ArrayList((Collection)cx.get(localObject2));
        }
        else
        {
          localObject2 = paramClass.getInterfaces();
          int j = localObject2.length;
          i = 0;
          if (i >= j)
            break label183;
          localClass = localObject2[i];
          if (!j(localClass))
            break label211;
          if (h(localClass) != 1)
            break;
          i = 1;
        }
      }
    }
    if (localObject1 == null)
    {
      localObject1 = new ArrayList();
      label157: ((List)localObject1).addAll((Collection)cx.get(localClass));
    }
    label183: label211: 
    while (true)
    {
      i++;
      break label112;
      if (localObject1 != null)
      {
        cx.put(paramClass, localObject1);
        i = 2;
        break;
      }
      i = 1;
      break;
      break label157;
    }
  }

  private static boolean j(Class<?> paramClass)
  {
    if ((paramClass != null) && (LifecycleObserver.class.isAssignableFrom(paramClass)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.Lifecycling
 * JD-Core Version:    0.6.2
 */