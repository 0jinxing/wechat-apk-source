package com.tencent.xweb.util;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import org.xwalk.core.Log;

public final class e
{
  public static Object avm(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(4020);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(4020);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = Class.forName(paramString).newInstance();
        AppMethodBeat.o(4020);
      }
      catch (Throwable paramString)
      {
        AppMethodBeat.o(4020);
        paramString = localObject;
      }
    }
  }

  public static Object b(String paramString1, String paramString2, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    Object localObject = null;
    AppMethodBeat.i(4019);
    try
    {
      paramString1 = Class.forName(paramString1).getMethod(paramString2, paramArrayOfClass);
      paramString1.setAccessible(true);
      paramString1 = paramString1.invoke(null, paramArrayOfObject);
      AppMethodBeat.o(4019);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        AppMethodBeat.o(4019);
        paramString1 = localObject;
      }
    }
  }

  public static Object c(Object paramObject, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    Object localObject1 = null;
    AppMethodBeat.i(4022);
    if (paramObject == null)
    {
      AppMethodBeat.o(4022);
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
          AppMethodBeat.o(4022);
          break;
        }
      }
      catch (Throwable paramObject)
      {
        if ((paramObject.getCause() != null) && (paramObject.getCause().toString().contains("AuthenticationFail")))
        {
          paramObject = new String("AuthenticationFail");
          AppMethodBeat.o(4022);
        }
        else if ((paramString == null) || ((!paramString.equalsIgnoreCase("canLoadX5Core")) && (!paramString.equalsIgnoreCase("initTesRuntimeEnvironment"))))
        {
          paramString = new StringWriter();
          paramObject.printStackTrace(new PrintWriter(paramString));
          Log.e("ReflectionUtils", "invokeInstance -- exceptions:" + paramString.toString());
          AppMethodBeat.o(4022);
          paramObject = localObject1;
        }
        else
        {
          AppMethodBeat.o(4022);
          paramObject = localObject1;
        }
      }
    }
  }

  public static Object iJ(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(4018);
    try
    {
      paramString1 = Class.forName(paramString1).getMethod(paramString2, new Class[0]).invoke(null, new Object[0]);
      AppMethodBeat.o(4018);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        AppMethodBeat.o(4018);
        paramString1 = localObject;
      }
    }
  }

  public static Object n(Object paramObject, String paramString)
  {
    AppMethodBeat.i(4021);
    paramObject = c(paramObject, paramString, null, new Object[0]);
    AppMethodBeat.o(4021);
    return paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.util.e
 * JD-Core Version:    0.6.2
 */