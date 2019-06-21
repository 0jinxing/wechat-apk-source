package com.tencent.smtt.utils;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

public class r
{
  public static Object a(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    Object localObject = null;
    AppMethodBeat.i(65287);
    try
    {
      paramClass = paramClass.getMethod(paramString, paramArrayOfClass);
      paramClass.setAccessible(true);
      paramClass = paramClass.invoke(null, paramArrayOfObject);
      AppMethodBeat.o(65287);
      return paramClass;
    }
    catch (Throwable paramClass)
    {
      while (true)
      {
        TbsLog.addLog(997, String.valueOf(paramClass), new Object[0]);
        AppMethodBeat.o(65287);
        paramClass = localObject;
      }
    }
  }

  public static Object a(Object paramObject, String paramString)
  {
    AppMethodBeat.i(65288);
    paramObject = a(paramObject, paramString, null, new Object[0]);
    AppMethodBeat.o(65288);
    return paramObject;
  }

  public static Object a(Object paramObject, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    Object localObject1 = null;
    AppMethodBeat.i(65289);
    if (paramObject == null)
    {
      AppMethodBeat.o(65289);
      paramObject = localObject1;
    }
    while (true)
    {
      return paramObject;
      try
      {
        Object localObject2 = paramObject.getClass();
        if (Build.VERSION.SDK_INT > 10);
        for (paramArrayOfClass = ((Class)localObject2).getMethod(paramString, paramArrayOfClass); ; paramArrayOfClass = ((Class)localObject2).getDeclaredMethod(paramString, paramArrayOfClass))
        {
          paramArrayOfClass.setAccessible(true);
          localObject2 = paramArrayOfObject;
          if (paramArrayOfObject.length == 0)
            localObject2 = null;
          paramObject = paramArrayOfClass.invoke(paramObject, (Object[])localObject2);
          AppMethodBeat.o(65289);
          break;
        }
      }
      catch (Throwable paramObject)
      {
        TbsLog.addLog(997, String.valueOf(paramObject), new Object[0]);
        if ((paramObject.getCause() != null) && (paramObject.getCause().toString().contains("AuthenticationFail")))
        {
          paramObject = new String("AuthenticationFail");
          AppMethodBeat.o(65289);
        }
        else if ((paramString != null) && ((paramString.equalsIgnoreCase("canLoadX5Core")) || (paramString.equalsIgnoreCase("initTesRuntimeEnvironment"))))
        {
          AppMethodBeat.o(65289);
          paramObject = localObject1;
        }
        else
        {
          paramString = new StringWriter();
          paramObject.printStackTrace(new PrintWriter(paramString));
          new StringBuilder("invokeInstance -- exceptions:").append(paramString.toString());
          AppMethodBeat.o(65289);
          paramObject = localObject1;
        }
      }
    }
  }

  public static Object a(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(65286);
    try
    {
      paramString1 = Class.forName(paramString1).getMethod(paramString2, new Class[0]).invoke(null, new Object[0]);
      AppMethodBeat.o(65286);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        TbsLog.addLog(997, String.valueOf(paramString1), new Object[0]);
        AppMethodBeat.o(65286);
        paramString1 = localObject;
      }
    }
  }

  public static Method a(Object paramObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(65290);
    paramObject = paramObject.getClass();
    if (paramObject != Object.class)
      if (paramObject == null)
        AppMethodBeat.o(65290);
    for (paramObject = null; ; paramObject = null)
    {
      while (true)
      {
        return paramObject;
        try
        {
          Method localMethod = paramObject.getDeclaredMethod(paramString, paramArrayOfClass);
          paramObject = localMethod;
          AppMethodBeat.o(65290);
        }
        catch (Exception localException)
        {
          paramObject = paramObject.getSuperclass();
        }
      }
      break;
      AppMethodBeat.o(65290);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.r
 * JD-Core Version:    0.6.2
 */