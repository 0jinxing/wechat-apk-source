package com.tencent.magicbrush.engine;

import android.support.annotation.Keep;
import android.webkit.JavascriptInterface;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;

@Keep
public class JsClassUtils
{
  private static final int BOOLEAN = 1;
  private static final int BYTE = 3;
  private static final int CHAR = 2;
  private static final int DOUBLE = 8;
  private static final int FLOAT = 6;
  private static final int INT = 5;
  private static final int LONG = 7;
  private static final int SHORT = 4;
  private static final String TAG = "MicroMsg.JsClassUtils";
  private static final int VOID = 0;
  public static final int log_type_d = 0;
  public static final int log_type_e = 2;
  public static final int log_type_i = 1;
  private static final int string = 9;
  private static final int unknown = 10;

  private static void getDescriptor(StringBuilder paramStringBuilder, Class<?> paramClass)
  {
    AppMethodBeat.i(115876);
    int i;
    char c1;
    if (paramClass.isPrimitive())
      if (paramClass == Integer.TYPE)
      {
        i = 73;
        c1 = i;
        label24: paramStringBuilder.append(c1);
        AppMethodBeat.o(115876);
      }
    while (true)
    {
      return;
      if (paramClass == Void.TYPE)
      {
        i = 86;
        c1 = i;
        break label24;
      }
      if (paramClass == Boolean.TYPE)
      {
        i = 90;
        c1 = i;
        break label24;
      }
      if (paramClass == Byte.TYPE)
      {
        i = 66;
        c1 = i;
        break label24;
      }
      if (paramClass == Character.TYPE)
      {
        i = 67;
        c1 = i;
        break label24;
      }
      if (paramClass == Short.TYPE)
      {
        i = 83;
        c1 = i;
        break label24;
      }
      if (paramClass == Double.TYPE)
      {
        i = 68;
        c1 = i;
        break label24;
      }
      if (paramClass == Float.TYPE)
      {
        i = 70;
        c1 = i;
        break label24;
      }
      i = 74;
      c1 = i;
      break label24;
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
      AppMethodBeat.o(115876);
    }
  }

  private static int getJavaType(Class<?> paramClass)
  {
    AppMethodBeat.i(115877);
    int i;
    if (paramClass == Integer.TYPE)
    {
      i = 5;
      AppMethodBeat.o(115877);
    }
    while (true)
    {
      return i;
      if (paramClass == Void.TYPE)
      {
        i = 0;
        AppMethodBeat.o(115877);
      }
      else if (paramClass == Boolean.TYPE)
      {
        i = 1;
        AppMethodBeat.o(115877);
      }
      else if (paramClass == Byte.TYPE)
      {
        i = 3;
        AppMethodBeat.o(115877);
      }
      else if (paramClass == Character.TYPE)
      {
        i = 2;
        AppMethodBeat.o(115877);
      }
      else if (paramClass == Short.TYPE)
      {
        i = 4;
        AppMethodBeat.o(115877);
      }
      else if (paramClass == Double.TYPE)
      {
        i = 8;
        AppMethodBeat.o(115877);
      }
      else if (paramClass == Float.TYPE)
      {
        i = 6;
        AppMethodBeat.o(115877);
      }
      else if (paramClass.getCanonicalName().equals("java.lang.String"))
      {
        i = 9;
        AppMethodBeat.o(115877);
      }
      else
      {
        i = 10;
        AppMethodBeat.o(115877);
      }
    }
  }

  @Keep
  public static Method[] getJavascriptInterfaceMethod(Object paramObject)
  {
    AppMethodBeat.i(115873);
    ArrayList localArrayList = new ArrayList();
    try
    {
      for (paramObject : paramObject.getClass().getMethods())
        if (paramObject.isAnnotationPresent(JavascriptInterface.class))
          localArrayList.add(paramObject);
    }
    catch (Exception paramObject)
    {
      paramObject = (Method[])localArrayList.toArray(new Method[localArrayList.size()]);
      AppMethodBeat.o(115873);
    }
    return paramObject;
  }

  @Keep
  public static String getMethodName(Method paramMethod)
  {
    AppMethodBeat.i(115875);
    paramMethod = paramMethod.getName();
    AppMethodBeat.o(115875);
    return paramMethod;
  }

  @Keep
  public static String getMethodSignature(Method paramMethod)
  {
    AppMethodBeat.i(115874);
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('(');
    for (int i = 0; i < arrayOfClass.length; i++)
      getDescriptor(localStringBuilder, arrayOfClass[i]);
    localStringBuilder.append(')');
    getDescriptor(localStringBuilder, paramMethod.getReturnType());
    paramMethod = localStringBuilder.toString();
    AppMethodBeat.o(115874);
    return paramMethod;
  }

  @Keep
  public static int[] getMethodType(Method paramMethod)
  {
    int i = 0;
    AppMethodBeat.i(115878);
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    int[] arrayOfInt = new int[arrayOfClass.length + 2];
    arrayOfInt[0] = arrayOfClass.length;
    arrayOfInt[1] = getJavaType(paramMethod.getReturnType());
    while (i < arrayOfClass.length)
    {
      arrayOfInt[(i + 2)] = getJavaType(arrayOfClass[i]);
      i++;
    }
    AppMethodBeat.o(115878);
    return arrayOfInt;
  }

  @Keep
  public static byte[] getStringUtf8(String paramString)
  {
    AppMethodBeat.i(115880);
    try
    {
      paramString = paramString.getBytes("UTF-8");
      AppMethodBeat.o(115880);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(115880);
      }
    }
  }

  public static boolean hasJavascriptInterface(Object paramObject)
  {
    boolean bool1 = false;
    AppMethodBeat.i(115872);
    try
    {
      paramObject = paramObject.getClass().getMethods();
      int i = paramObject.length;
      for (int j = 0; j < i; j++)
      {
        boolean bool2 = paramObject[j].isAnnotationPresent(JavascriptInterface.class);
        if (bool2)
        {
          bool1 = true;
          AppMethodBeat.o(115872);
          return bool1;
        }
      }
    }
    catch (Exception paramObject)
    {
      while (true)
        AppMethodBeat.o(115872);
    }
  }

  @Keep
  public static void jsLog(int paramInt, String paramString)
  {
    AppMethodBeat.i(115879);
    switch (paramInt)
    {
    default:
      c.c.d("MicroMsg.JsClassUtils", paramString, new Object[0]);
      AppMethodBeat.o(115879);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      c.c.i("MicroMsg.JsClassUtils", paramString, new Object[0]);
      AppMethodBeat.o(115879);
      continue;
      c.c.e("MicroMsg.JsClassUtils", paramString, new Object[0]);
      AppMethodBeat.o(115879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.engine.JsClassUtils
 * JD-Core Version:    0.6.2
 */