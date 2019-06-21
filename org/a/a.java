package org.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public final class a
{
  private final Class<?> BYD;
  public final Object object;

  private a(Class<?> paramClass)
  {
    this(paramClass, paramClass);
    AppMethodBeat.i(59248);
    AppMethodBeat.o(59248);
  }

  private a(Class<?> paramClass, Object paramObject)
  {
    this.BYD = paramClass;
    this.object = paramObject;
  }

  private static <T extends AccessibleObject> T a(T paramT)
  {
    AppMethodBeat.i(59247);
    if (paramT == null)
    {
      paramT = null;
      AppMethodBeat.o(59247);
    }
    while (true)
    {
      return paramT;
      if ((paramT instanceof Member))
      {
        Member localMember = (Member)paramT;
        if ((Modifier.isPublic(localMember.getModifiers())) && (Modifier.isPublic(localMember.getDeclaringClass().getModifiers())))
          AppMethodBeat.o(59247);
      }
      else
      {
        if (!paramT.isAccessible())
          paramT.setAccessible(true);
        AppMethodBeat.o(59247);
      }
    }
  }

  private Method a(String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(59253);
    Object localObject = this.BYD;
    try
    {
      Method localMethod1 = ((Class)localObject).getMethod(paramString, paramArrayOfClass);
      paramString = localMethod1;
      AppMethodBeat.o(59253);
      return paramString;
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      Class localClass;
      do
        try
        {
          Method localMethod2 = ((Class)localObject).getDeclaredMethod(paramString, paramArrayOfClass);
          paramString = localMethod2;
          AppMethodBeat.o(59253);
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          localClass = ((Class)localObject).getSuperclass();
          localObject = localClass;
        }
      while (localClass != null);
      paramString = new NoSuchMethodException();
      AppMethodBeat.o(59253);
    }
    throw paramString;
  }

  private static a a(Constructor<?> paramConstructor, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(59260);
    try
    {
      paramConstructor = d(paramConstructor.getDeclaringClass(), ((Constructor)a(paramConstructor)).newInstance(paramArrayOfObject));
      AppMethodBeat.o(59260);
      return paramConstructor;
    }
    catch (Exception paramConstructor)
    {
      paramConstructor = new b(paramConstructor);
      AppMethodBeat.o(59260);
    }
    throw paramConstructor;
  }

  private static a a(Method paramMethod, Object paramObject, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(59261);
    try
    {
      a(paramMethod);
      if (paramMethod.getReturnType() == Void.TYPE)
      {
        paramMethod.invoke(paramObject, paramArrayOfObject);
        paramMethod = ep(paramObject);
        AppMethodBeat.o(59261);
      }
      while (true)
      {
        return paramMethod;
        paramMethod = ep(paramMethod.invoke(paramObject, paramArrayOfObject));
        AppMethodBeat.o(59261);
      }
    }
    catch (Exception paramMethod)
    {
      paramMethod = new b(paramMethod);
      AppMethodBeat.o(59261);
    }
    throw paramMethod;
  }

  private static boolean a(Method paramMethod, String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(59254);
    boolean bool;
    if ((paramMethod.getName().equals(paramString)) && (a(paramMethod.getParameterTypes(), paramArrayOfClass)))
    {
      bool = true;
      AppMethodBeat.o(59254);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59254);
    }
  }

  private static boolean a(Class<?>[] paramArrayOfClass1, Class<?>[] paramArrayOfClass2)
  {
    boolean bool = false;
    AppMethodBeat.i(59256);
    int i;
    if (paramArrayOfClass1.length == paramArrayOfClass2.length)
    {
      i = 0;
      if (i < paramArrayOfClass2.length)
        if ((paramArrayOfClass2[i] != a.a.class) && (!bf(paramArrayOfClass1[i]).isAssignableFrom(bf(paramArrayOfClass2[i]))))
          AppMethodBeat.o(59256);
    }
    while (true)
    {
      return bool;
      i++;
      break;
      bool = true;
      AppMethodBeat.o(59256);
      continue;
      AppMethodBeat.o(59256);
    }
  }

  private static Class<?>[] ac(Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(59262);
    if (paramArrayOfObject == null)
    {
      paramArrayOfObject = new Class[0];
      AppMethodBeat.o(59262);
    }
    while (true)
    {
      return paramArrayOfObject;
      Class[] arrayOfClass = new Class[paramArrayOfObject.length];
      if (i < paramArrayOfObject.length)
      {
        Object localObject = paramArrayOfObject[i];
        if (localObject == null);
        for (localObject = a.a.class; ; localObject = localObject.getClass())
        {
          arrayOfClass[i] = localObject;
          i++;
          break;
        }
      }
      AppMethodBeat.o(59262);
      paramArrayOfObject = arrayOfClass;
    }
  }

  private Field awT(String paramString)
  {
    AppMethodBeat.i(59251);
    Class localClass = this.BYD;
    Field localField;
    try
    {
      localField = (Field)a(localClass.getField(paramString));
      AppMethodBeat.o(59251);
      paramString = localField;
      return paramString;
    }
    catch (NoSuchFieldException localNoSuchFieldException2)
    {
    }
    while (true)
      try
      {
        localField = (Field)a(localClass.getDeclaredField(paramString));
        AppMethodBeat.o(59251);
        paramString = localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException1)
      {
        localClass = localClass.getSuperclass();
        if (localClass == null)
        {
          paramString = new b(localNoSuchFieldException2);
          AppMethodBeat.o(59251);
          throw paramString;
        }
      }
  }

  public static a be(Class<?> paramClass)
  {
    AppMethodBeat.i(59244);
    paramClass = new a(paramClass);
    AppMethodBeat.o(59244);
    return paramClass;
  }

  private static Class<?> bf(Class<?> paramClass)
  {
    AppMethodBeat.i(59263);
    if (paramClass == null)
    {
      paramClass = null;
      AppMethodBeat.o(59263);
    }
    while (true)
    {
      return paramClass;
      if (paramClass.isPrimitive())
      {
        if (Boolean.TYPE == paramClass)
        {
          paramClass = Boolean.class;
          AppMethodBeat.o(59263);
        }
        else if (Integer.TYPE == paramClass)
        {
          paramClass = Integer.class;
          AppMethodBeat.o(59263);
        }
        else if (Long.TYPE == paramClass)
        {
          paramClass = Long.class;
          AppMethodBeat.o(59263);
        }
        else if (Short.TYPE == paramClass)
        {
          paramClass = Short.class;
          AppMethodBeat.o(59263);
        }
        else if (Byte.TYPE == paramClass)
        {
          paramClass = Byte.class;
          AppMethodBeat.o(59263);
        }
        else if (Double.TYPE == paramClass)
        {
          paramClass = Double.class;
          AppMethodBeat.o(59263);
        }
        else if (Float.TYPE == paramClass)
        {
          paramClass = Float.class;
          AppMethodBeat.o(59263);
        }
        else if (Character.TYPE == paramClass)
        {
          paramClass = Character.class;
          AppMethodBeat.o(59263);
        }
        else if (Void.TYPE == paramClass)
        {
          paramClass = Void.class;
          AppMethodBeat.o(59263);
        }
      }
      else
        AppMethodBeat.o(59263);
    }
  }

  private static a d(Class<?> paramClass, Object paramObject)
  {
    AppMethodBeat.i(59246);
    paramClass = new a(paramClass, paramObject);
    AppMethodBeat.o(59246);
    return paramClass;
  }

  public static a ep(Object paramObject)
  {
    AppMethodBeat.i(59245);
    if (paramObject == null);
    for (Object localObject = Object.class; ; localObject = paramObject.getClass())
    {
      paramObject = new a((Class)localObject, paramObject);
      AppMethodBeat.o(59245);
      return paramObject;
    }
  }

  public final a ab(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(59255);
    Class[] arrayOfClass = ac(paramArrayOfObject);
    try
    {
      locala = a(this.BYD.getDeclaredConstructor(arrayOfClass), paramArrayOfObject);
      paramArrayOfObject = locala;
      AppMethodBeat.o(59255);
      return paramArrayOfObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      a locala;
      Constructor[] arrayOfConstructor = this.BYD.getDeclaredConstructors();
      int i = arrayOfConstructor.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label95;
        locala = arrayOfConstructor[j];
        if (a(locala.getParameterTypes(), arrayOfClass))
        {
          paramArrayOfObject = a(locala, paramArrayOfObject);
          AppMethodBeat.o(59255);
          break;
        }
      }
      label95: paramArrayOfObject = new b(localNoSuchMethodException);
      AppMethodBeat.o(59255);
    }
    throw paramArrayOfObject;
  }

  public final a awS(String paramString)
  {
    AppMethodBeat.i(59250);
    try
    {
      paramString = awT(paramString);
      paramString = d(paramString.getType(), paramString.get(this.object));
      AppMethodBeat.o(59250);
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString = new b(paramString);
      AppMethodBeat.o(59250);
    }
    throw paramString;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(59258);
    boolean bool;
    if ((paramObject instanceof a))
    {
      bool = this.object.equals(((a)paramObject).object);
      AppMethodBeat.o(59258);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59258);
    }
  }

  public final <T> T get(String paramString)
  {
    AppMethodBeat.i(59249);
    paramString = awS(paramString).object;
    AppMethodBeat.o(59249);
    return paramString;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(59257);
    int i = this.object.hashCode();
    AppMethodBeat.o(59257);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(59259);
    String str = this.object.toString();
    AppMethodBeat.o(59259);
    return str;
  }

  public final a u(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(59252);
    Class[] arrayOfClass = ac(paramArrayOfObject);
    try
    {
      a locala = a(a(paramString, arrayOfClass), this.object, paramArrayOfObject);
      paramString = locala;
      AppMethodBeat.o(59252);
      return paramString;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    while (true)
      try
      {
        Object localObject1 = this.BYD;
        Method[] arrayOfMethod1 = ((Class)localObject1).getMethods();
        int i = arrayOfMethod1.length;
        int j = 0;
        if (j < i)
        {
          Object localObject2 = arrayOfMethod1[j];
          if (a((Method)localObject2, paramString, arrayOfClass))
          {
            paramString = a((Method)localObject2, this.object, paramArrayOfObject);
            AppMethodBeat.o(59252);
            break;
          }
          j++;
          continue;
          Method[] arrayOfMethod2 = ((Class)localObject1).getDeclaredMethods();
          i = arrayOfMethod2.length;
          j = 0;
          if (j < i)
          {
            arrayOfMethod1 = arrayOfMethod2[j];
            localObject2 = arrayOfMethod1;
            if (!a(arrayOfMethod1, paramString, arrayOfClass))
              j++;
          }
          else
          {
            localObject1 = ((Class)localObject1).getSuperclass();
            if (localObject1 == null)
            {
              paramArrayOfObject = new java/lang/NoSuchMethodException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("No similar method ");
              paramArrayOfObject.<init>(paramString + " with params " + Arrays.toString(arrayOfClass) + " could be found on type " + this.BYD + ".");
              AppMethodBeat.o(59252);
              throw paramArrayOfObject;
            }
          }
        }
      }
      catch (NoSuchMethodException paramString)
      {
        paramString = new b(paramString);
        AppMethodBeat.o(59252);
        throw paramString;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.a.a
 * JD-Core Version:    0.6.2
 */