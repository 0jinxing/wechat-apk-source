package com.tencent.matrix.a.c;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public final class a
{
  private static String bWa = null;
  private static String sPackageName = null;

  public static void ce(String paramString)
  {
    bWa = paramString;
  }

  public static String getPackageName()
  {
    return sPackageName;
  }

  public static String getProcessName()
  {
    return bWa;
  }

  public static String getThrowableStack(Throwable paramThrowable)
  {
    Object localObject = paramThrowable.getStackTrace();
    if (localObject == null);
    for (paramThrowable = ""; ; paramThrowable = ((StringBuffer)localObject).toString())
    {
      return paramThrowable;
      paramThrowable = new ArrayList(localObject.length);
      for (int i = 0; i < localObject.length; i++)
      {
        String str = localObject[i].getClassName();
        if ((!str.contains("com.tencent.matrix")) && (!str.contains("java.lang.reflect")) && (!str.contains("$Proxy2")) && (!str.contains("android.os")))
          paramThrowable.add(localObject[i]);
      }
      if ((paramThrowable.size() > 10) && (sPackageName != null))
      {
        localObject = paramThrowable.listIterator(paramThrowable.size());
        do
        {
          if (!((ListIterator)localObject).hasPrevious())
            break;
          if (!((StackTraceElement)((ListIterator)localObject).previous()).getClassName().contains(sPackageName))
            ((ListIterator)localObject).remove();
        }
        while (paramThrowable.size() > 10);
      }
      localObject = new StringBuffer(paramThrowable.size());
      paramThrowable = paramThrowable.iterator();
      while (paramThrowable.hasNext())
        ((StringBuffer)localObject).append((StackTraceElement)paramThrowable.next()).append('\n');
    }
  }

  public static void setPackageName(Context paramContext)
  {
    if (sPackageName == null)
      sPackageName = paramContext.getPackageName();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.c.a
 * JD-Core Version:    0.6.2
 */