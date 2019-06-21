package com.tencent.xweb.xwalk;

import android.support.annotation.Keep;
import android.webkit.JavascriptInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class JsClassUtils
{
  private static void getDescriptor(StringBuilder paramStringBuilder, Class<?> paramClass)
  {
    AppMethodBeat.i(4162);
    int i;
    char c1;
    if (paramClass.isPrimitive())
      if (paramClass == Integer.TYPE)
      {
        i = 73;
        c1 = i;
        label25: paramStringBuilder.append(c1);
        AppMethodBeat.o(4162);
      }
    while (true)
    {
      return;
      if (paramClass == Void.TYPE)
      {
        i = 86;
        c1 = i;
        break label25;
      }
      if (paramClass == Boolean.TYPE)
      {
        i = 90;
        c1 = i;
        break label25;
      }
      if (paramClass == Byte.TYPE)
      {
        i = 66;
        c1 = i;
        break label25;
      }
      if (paramClass == Character.TYPE)
      {
        i = 67;
        c1 = i;
        break label25;
      }
      if (paramClass == Short.TYPE)
      {
        i = 83;
        c1 = i;
        break label25;
      }
      if (paramClass == Double.TYPE)
      {
        i = 68;
        c1 = i;
        break label25;
      }
      if (paramClass == Float.TYPE)
      {
        i = 70;
        c1 = i;
        break label25;
      }
      i = 74;
      c1 = i;
      break label25;
      if (paramClass.isArray())
      {
        paramStringBuilder.append('[');
        paramClass = paramClass.getComponentType();
        break;
      }
      paramStringBuilder.append('L');
      paramClass = paramClass.getName();
      int j = paramClass.length();
      for (i = 0; i < j; i++)
      {
        char c2 = paramClass.charAt(i);
        c1 = c2;
        if (c2 == '.')
        {
          c2 = '/';
          c1 = c2;
        }
        paramStringBuilder.append(c1);
      }
      paramStringBuilder.append(';');
      AppMethodBeat.o(4162);
    }
  }

  private static int getJavaType(Class<?> paramClass)
  {
    AppMethodBeat.i(4163);
    int i;
    if (paramClass == Integer.TYPE)
    {
      i = 5;
      AppMethodBeat.o(4163);
    }
    while (true)
    {
      return i;
      if (paramClass == Void.TYPE)
      {
        i = 0;
        AppMethodBeat.o(4163);
      }
      else if (paramClass == Boolean.TYPE)
      {
        i = 1;
        AppMethodBeat.o(4163);
      }
      else if (paramClass == Byte.TYPE)
      {
        i = 3;
        AppMethodBeat.o(4163);
      }
      else if (paramClass == Character.TYPE)
      {
        i = 2;
        AppMethodBeat.o(4163);
      }
      else if (paramClass == Short.TYPE)
      {
        i = 4;
        AppMethodBeat.o(4163);
      }
      else if (paramClass == Double.TYPE)
      {
        i = 8;
        AppMethodBeat.o(4163);
      }
      else if (paramClass == Float.TYPE)
      {
        i = 6;
        AppMethodBeat.o(4163);
      }
      else if (paramClass == Long.TYPE)
      {
        i = 7;
        AppMethodBeat.o(4163);
      }
      else if (paramClass.getCanonicalName().equals("java.lang.String"))
      {
        i = 9;
        AppMethodBeat.o(4163);
      }
      else
      {
        i = 10;
        AppMethodBeat.o(4163);
      }
    }
  }

  @Keep
  public static Method[] getJavascriptInterfaceMethod(Object paramObject)
  {
    AppMethodBeat.i(4159);
    ArrayList localArrayList = new ArrayList();
    try
    {
      for (Object localObject : paramObject.getClass().getMethods())
        if (localObject.isAnnotationPresent(JavascriptInterface.class))
          localArrayList.add(localObject);
    }
    catch (Exception paramObject)
    {
      paramObject = (Method[])localArrayList.toArray(new Method[localArrayList.size()]);
      AppMethodBeat.o(4159);
    }
    return paramObject;
  }

  @Keep
  public static String getMethodName(Method paramMethod)
  {
    AppMethodBeat.i(4161);
    paramMethod = paramMethod.getName();
    AppMethodBeat.o(4161);
    return paramMethod;
  }

  @Keep
  public static String getMethodSignature(Method paramMethod)
  {
    AppMethodBeat.i(4160);
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('(');
    for (int i = 0; i < arrayOfClass.length; i++)
      getDescriptor(localStringBuilder, arrayOfClass[i]);
    localStringBuilder.append(')');
    getDescriptor(localStringBuilder, paramMethod.getReturnType());
    paramMethod = localStringBuilder.toString();
    AppMethodBeat.o(4160);
    return paramMethod;
  }

  @Keep
  public static int[] getMethodType(Method paramMethod)
  {
    int i = 0;
    AppMethodBeat.i(4164);
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    int[] arrayOfInt = new int[arrayOfClass.length + 2];
    arrayOfInt[0] = arrayOfClass.length;
    arrayOfInt[1] = getJavaType(paramMethod.getReturnType());
    while (i < arrayOfClass.length)
    {
      arrayOfInt[(i + 2)] = getJavaType(arrayOfClass[i]);
      i++;
    }
    AppMethodBeat.o(4164);
    return arrayOfInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.JsClassUtils
 * JD-Core Version:    0.6.2
 */