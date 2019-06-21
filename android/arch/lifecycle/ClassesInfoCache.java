package android.arch.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ClassesInfoCache
{
  static ClassesInfoCache cd = new ClassesInfoCache();
  private final Map<Class, CallbackInfo> ce = new HashMap();
  private final Map<Class, Boolean> cf = new HashMap();

  private CallbackInfo a(Class paramClass, Method[] paramArrayOfMethod)
  {
    Object localObject1 = paramClass.getSuperclass();
    HashMap localHashMap = new HashMap();
    if (localObject1 != null)
    {
      localObject1 = f((Class)localObject1);
      if (localObject1 != null)
        localHashMap.putAll(((CallbackInfo)localObject1).ch);
    }
    localObject1 = paramClass.getInterfaces();
    int i = localObject1.length;
    Object localObject2;
    Object localObject3;
    for (int j = 0; j < i; j++)
    {
      localObject2 = f(localObject1[j]).ch.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        a(localHashMap, (MethodReference)((Map.Entry)localObject3).getKey(), (Lifecycle.Event)((Map.Entry)localObject3).getValue(), paramClass);
      }
    }
    if (paramArrayOfMethod != null);
    boolean bool;
    while (true)
    {
      int k = paramArrayOfMethod.length;
      i = 0;
      bool = false;
      if (i >= k)
        break label328;
      localObject1 = paramArrayOfMethod[i];
      localObject3 = (OnLifecycleEvent)((Method)localObject1).getAnnotation(OnLifecycleEvent.class);
      if (localObject3 == null)
        break label368;
      localObject2 = ((Method)localObject1).getParameterTypes();
      if (localObject2.length <= 0)
        break label371;
      if (localObject2[0].isAssignableFrom(LifecycleOwner.class))
        break;
      throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
      paramArrayOfMethod = e(paramClass);
    }
    label328: label368: label371: for (j = 1; ; j = 0)
    {
      localObject3 = ((OnLifecycleEvent)localObject3).value();
      if (localObject2.length > 1)
      {
        if (!localObject2[1].isAssignableFrom(Lifecycle.Event.class))
          throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
        if (localObject3 != Lifecycle.Event.ON_ANY)
          throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
        j = 2;
      }
      if (localObject2.length > 2)
        throw new IllegalArgumentException("cannot have more than 2 params");
      a(localHashMap, new MethodReference(j, (Method)localObject1), (Lifecycle.Event)localObject3, paramClass);
      bool = true;
      while (true)
      {
        i++;
        break;
        paramArrayOfMethod = new CallbackInfo(localHashMap);
        this.ce.put(paramClass, paramArrayOfMethod);
        this.cf.put(paramClass, Boolean.valueOf(bool));
        return paramArrayOfMethod;
      }
    }
  }

  private static void a(Map<MethodReference, Lifecycle.Event> paramMap, MethodReference paramMethodReference, Lifecycle.Event paramEvent, Class paramClass)
  {
    Lifecycle.Event localEvent = (Lifecycle.Event)paramMap.get(paramMethodReference);
    if ((localEvent != null) && (paramEvent != localEvent))
    {
      paramMap = paramMethodReference.mMethod;
      throw new IllegalArgumentException("Method " + paramMap.getName() + " in " + paramClass.getName() + " already declared with different @OnLifecycleEvent value: previous value " + localEvent + ", new value " + paramEvent);
    }
    if (localEvent == null)
      paramMap.put(paramMethodReference, paramEvent);
  }

  private static Method[] e(Class paramClass)
  {
    try
    {
      paramClass = paramClass.getDeclaredMethods();
      return paramClass;
    }
    catch (NoClassDefFoundError paramClass)
    {
    }
    throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
  }

  final boolean d(Class paramClass)
  {
    boolean bool;
    if (this.cf.containsKey(paramClass))
      bool = ((Boolean)this.cf.get(paramClass)).booleanValue();
    while (true)
    {
      return bool;
      Method[] arrayOfMethod = e(paramClass);
      int i = arrayOfMethod.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label84;
        if ((OnLifecycleEvent)arrayOfMethod[j].getAnnotation(OnLifecycleEvent.class) != null)
        {
          a(paramClass, arrayOfMethod);
          bool = true;
          break;
        }
      }
      label84: this.cf.put(paramClass, Boolean.FALSE);
      bool = false;
    }
  }

  final CallbackInfo f(Class paramClass)
  {
    CallbackInfo localCallbackInfo = (CallbackInfo)this.ce.get(paramClass);
    if (localCallbackInfo != null);
    for (paramClass = localCallbackInfo; ; paramClass = a(paramClass, null))
      return paramClass;
  }

  static class CallbackInfo
  {
    final Map<Lifecycle.Event, List<ClassesInfoCache.MethodReference>> cg;
    final Map<ClassesInfoCache.MethodReference, Lifecycle.Event> ch;

    CallbackInfo(Map<ClassesInfoCache.MethodReference, Lifecycle.Event> paramMap)
    {
      this.ch = paramMap;
      this.cg = new HashMap();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Lifecycle.Event localEvent = (Lifecycle.Event)localEntry.getValue();
        List localList = (List)this.cg.get(localEvent);
        paramMap = localList;
        if (localList == null)
        {
          paramMap = new ArrayList();
          this.cg.put(localEvent, paramMap);
        }
        paramMap.add(localEntry.getKey());
      }
    }

    static void a(List<ClassesInfoCache.MethodReference> paramList, LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
    {
      if (paramList != null)
      {
        int i = paramList.size() - 1;
        if (i >= 0)
        {
          ClassesInfoCache.MethodReference localMethodReference = (ClassesInfoCache.MethodReference)paramList.get(i);
          while (true)
          {
            try
            {
              switch (localMethodReference.ci)
              {
              default:
                i--;
                break;
              case 0:
                localMethodReference.mMethod.invoke(paramObject, new Object[0]);
                continue;
              case 1:
              case 2:
              }
            }
            catch (InvocationTargetException paramList)
            {
              throw new RuntimeException("Failed to call observer method", paramList.getCause());
              localMethodReference.mMethod.invoke(paramObject, new Object[] { paramLifecycleOwner });
              continue;
            }
            catch (IllegalAccessException paramList)
            {
              throw new RuntimeException(paramList);
            }
            localMethodReference.mMethod.invoke(paramObject, new Object[] { paramLifecycleOwner, paramEvent });
          }
        }
      }
    }
  }

  static class MethodReference
  {
    final int ci;
    final Method mMethod;

    MethodReference(int paramInt, Method paramMethod)
    {
      this.ci = paramInt;
      this.mMethod = paramMethod;
      this.mMethod.setAccessible(true);
    }

    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject);
      while (true)
      {
        return bool;
        if ((paramObject == null) || (getClass() != paramObject.getClass()))
        {
          bool = false;
        }
        else
        {
          paramObject = (MethodReference)paramObject;
          if ((this.ci != paramObject.ci) || (!this.mMethod.getName().equals(paramObject.mMethod.getName())))
            bool = false;
        }
      }
    }

    public int hashCode()
    {
      return this.ci * 31 + this.mMethod.getName().hashCode();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.ClassesInfoCache
 * JD-Core Version:    0.6.2
 */