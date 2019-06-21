package com.tencent.sqlitelint.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.SQLiteLint;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;

public class SQLiteLintUtil
{
  private static final int DEFAULT_MAX_STACK_LAYER = 6;
  private static final String TAG = "SQLiteLint.SQLiteLintUtil";
  public static final String YYYY_MM_DD_HH_mm = "yyyy-MM-dd HH:mm";

  public static String extractDbName(String paramString)
  {
    Object localObject = null;
    String[] arrayOfString = null;
    AppMethodBeat.i(94122);
    if (isNullOrNil(paramString))
    {
      AppMethodBeat.o(94122);
      paramString = arrayOfString;
    }
    while (true)
    {
      return paramString;
      arrayOfString = paramString.split("/");
      paramString = localObject;
      if (arrayOfString != null)
      {
        paramString = localObject;
        if (arrayOfString.length > 0)
          paramString = arrayOfString[(arrayOfString.length - 1)];
      }
      AppMethodBeat.o(94122);
    }
  }

  public static String formatTime(String paramString, long paramLong)
  {
    AppMethodBeat.i(94124);
    paramString = new SimpleDateFormat(paramString).format(new Date(paramLong));
    AppMethodBeat.o(94124);
    return paramString;
  }

  public static int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(94123);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
        AppMethodBeat.o(94123);
      while (true)
      {
        return paramInt;
        int i = Integer.parseInt(paramString);
        paramInt = i;
        AppMethodBeat.o(94123);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        AppMethodBeat.o(94123);
    }
  }

  public static String getThrowableStack()
  {
    AppMethodBeat.i(94128);
    try
    {
      Object localObject = new java/lang/Throwable;
      ((Throwable)localObject).<init>();
      localObject = getThrowableStack((Throwable)localObject);
      AppMethodBeat.o(94128);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        SLog.e("SQLiteLint.SQLiteLintUtil", "getThrowableStack ex %s", new Object[] { localThrowable.getMessage() });
        String str = "";
        AppMethodBeat.o(94128);
      }
    }
  }

  public static String getThrowableStack(Throwable paramThrowable)
  {
    AppMethodBeat.i(94127);
    if (paramThrowable == null)
    {
      paramThrowable = "";
      AppMethodBeat.o(94127);
    }
    while (true)
    {
      return paramThrowable;
      paramThrowable = stackTraceToString(paramThrowable.getStackTrace());
      AppMethodBeat.o(94127);
    }
  }

  public static boolean isNullOrNil(String paramString)
  {
    AppMethodBeat.i(94121);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = true;
      AppMethodBeat.o(94121);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94121);
    }
  }

  public static void mkdirs(String paramString)
  {
    AppMethodBeat.i(94125);
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      paramString = paramString.getParentFile();
      if (paramString != null)
        paramString.mkdirs();
    }
    AppMethodBeat.o(94125);
  }

  public static String nullAsNil(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  public static String stackTraceToString(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    AppMethodBeat.i(94126);
    if (paramArrayOfStackTraceElement == null)
    {
      paramArrayOfStackTraceElement = "";
      AppMethodBeat.o(94126);
    }
    while (true)
    {
      return paramArrayOfStackTraceElement;
      Object localObject = new ArrayList(paramArrayOfStackTraceElement.length);
      for (int i = 0; i < paramArrayOfStackTraceElement.length; i++)
        if (!paramArrayOfStackTraceElement[i].getClassName().contains("com.tencent.sqlitelint"))
          ((ArrayList)localObject).add(paramArrayOfStackTraceElement[i]);
      if ((((ArrayList)localObject).size() > 6) && (SQLiteLint.sPackageName != null))
      {
        paramArrayOfStackTraceElement = ((ArrayList)localObject).listIterator(((ArrayList)localObject).size());
        do
        {
          if (!paramArrayOfStackTraceElement.hasPrevious())
            break;
          if (!((StackTraceElement)paramArrayOfStackTraceElement.previous()).getClassName().contains(SQLiteLint.sPackageName))
            paramArrayOfStackTraceElement.remove();
        }
        while (((ArrayList)localObject).size() > 6);
      }
      paramArrayOfStackTraceElement = new StringBuffer(((ArrayList)localObject).size());
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        paramArrayOfStackTraceElement.append((StackTraceElement)((Iterator)localObject).next()).append('\n');
      paramArrayOfStackTraceElement = paramArrayOfStackTraceElement.toString();
      AppMethodBeat.o(94126);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.util.SQLiteLintUtil
 * JD-Core Version:    0.6.2
 */