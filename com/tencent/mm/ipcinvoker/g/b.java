package com.tencent.mm.ipcinvoker.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class b
{
  public static <T> T H(Class<?> paramClass)
  {
    Object localObject = null;
    AppMethodBeat.i(114122);
    if (paramClass == null)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
      AppMethodBeat.o(114122);
      paramClass = localObject;
    }
    while (true)
    {
      return paramClass;
      try
      {
        paramClass = paramClass.getDeclaredConstructor(new Class[0]);
        paramClass.setAccessible(true);
        paramClass = paramClass.newInstance(new Object[0]);
        AppMethodBeat.o(114122);
      }
      catch (IllegalAccessException paramClass)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass });
        AppMethodBeat.o(114122);
        paramClass = localObject;
      }
      catch (InstantiationException paramClass)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass });
      }
      catch (NoSuchMethodException paramClass)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass });
      }
      catch (InvocationTargetException paramClass)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass });
      }
    }
  }

  public static <T> T c(String paramString, Class<?> paramClass)
  {
    Object localObject = null;
    AppMethodBeat.i(114120);
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
      AppMethodBeat.o(114120);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (paramClass == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, parent class is null.", new Object[0]);
        AppMethodBeat.o(114120);
        paramString = localObject;
        continue;
      }
      try
      {
        paramString = Class.forName(paramString);
        if (!paramClass.isAssignableFrom(paramString))
        {
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "%s isAssignableFrom %s return false", new Object[] { paramClass, paramString });
          AppMethodBeat.o(114120);
          paramString = localObject;
          continue;
        }
        paramString = paramString.getDeclaredConstructor(new Class[0]);
        paramString.setAccessible(true);
        paramString = paramString.newInstance(new Object[0]);
        AppMethodBeat.o(114120);
      }
      catch (ClassNotFoundException paramString)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
        AppMethodBeat.o(114120);
        paramString = localObject;
      }
      catch (IllegalAccessException paramString)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
      }
      catch (InstantiationException paramString)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
      }
      catch (NoSuchMethodException paramString)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
      }
      catch (InvocationTargetException paramString)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
      }
    }
  }

  public static <T> T j(Class<?> paramClass1, Class<?> paramClass2)
  {
    Object localObject = null;
    AppMethodBeat.i(114121);
    if (paramClass1 == null)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
      AppMethodBeat.o(114121);
      paramClass1 = localObject;
    }
    while (true)
    {
      return paramClass1;
      if (paramClass2 == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, parent class is null.", new Object[0]);
        AppMethodBeat.o(114121);
        paramClass1 = localObject;
        continue;
      }
      try
      {
        if (!paramClass2.isAssignableFrom(paramClass1))
        {
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "%s isAssignableFrom %s return false", new Object[] { paramClass2, paramClass1 });
          AppMethodBeat.o(114121);
          paramClass1 = localObject;
          continue;
        }
        paramClass1 = paramClass1.getDeclaredConstructor(new Class[0]);
        paramClass1.setAccessible(true);
        paramClass1 = paramClass1.newInstance(new Object[0]);
        AppMethodBeat.o(114121);
      }
      catch (IllegalAccessException paramClass1)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass1 });
        AppMethodBeat.o(114121);
        paramClass1 = localObject;
      }
      catch (InstantiationException paramClass1)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass1 });
      }
      catch (NoSuchMethodException paramClass1)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass1 });
      }
      catch (InvocationTargetException paramClass1)
      {
        while (true)
          com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass1 });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.g.b
 * JD-Core Version:    0.6.2
 */