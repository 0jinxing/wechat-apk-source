package com.tencent.matrix.trace.g;

public final class b
{
  private static String a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    return a(paramArrayOfStackTraceElement, "", -1);
  }

  public static String a(StackTraceElement[] paramArrayOfStackTraceElement, String paramString, int paramInt)
  {
    int i = 3;
    if ((paramArrayOfStackTraceElement == null) || (paramArrayOfStackTraceElement.length < 3));
    StringBuilder localStringBuilder;
    for (paramArrayOfStackTraceElement = ""; ; paramArrayOfStackTraceElement = localStringBuilder.toString())
    {
      return paramArrayOfStackTraceElement;
      int j = paramInt;
      if (paramInt < 0)
        j = 2147483647;
      localStringBuilder = new StringBuilder(" \n");
      for (paramInt = i; (paramInt < paramArrayOfStackTraceElement.length - 3) && (paramInt < j); paramInt++)
      {
        localStringBuilder.append(paramString);
        localStringBuilder.append("at ");
        localStringBuilder.append(paramArrayOfStackTraceElement[paramInt].getClassName());
        localStringBuilder.append(":");
        localStringBuilder.append(paramArrayOfStackTraceElement[paramInt].getMethodName());
        localStringBuilder.append("(" + paramArrayOfStackTraceElement[paramInt].getLineNumber() + ")");
        localStringBuilder.append("\n");
      }
    }
  }

  public static String getStack()
  {
    return a(new Throwable().getStackTrace());
  }

  public static String p(long paramLong1, long paramLong2)
  {
    String str;
    if (paramLong1 <= 0L)
      if (paramLong2 > 1000L)
        str = "0%";
    while (true)
    {
      return str;
      str = "100%";
      continue;
      if (paramLong1 >= paramLong2)
        str = "100%";
      else
        str = String.format("%.2f", new Object[] { Float.valueOf(1.0F * (float)paramLong1 / (float)paramLong2 * 100.0F) }) + "%";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.g.b
 * JD-Core Version:    0.6.2
 */