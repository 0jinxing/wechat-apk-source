package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public final class an
{
  public static String doQ()
  {
    AppMethodBeat.i(52153);
    try
    {
      Object localObject = new java/lang/Throwable;
      ((Throwable)localObject).<init>();
      localObject = ((Throwable)localObject).getStackTrace();
      if ((localObject == null) || (localObject.length < 3))
      {
        localObject = "";
        AppMethodBeat.o(52153);
      }
      while (true)
      {
        return localObject;
        String str2 = localObject[2].getClassName().substring(15);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        str2 = str2 + ":" + localObject[2].getMethodName();
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject = str2 + "(" + localObject[2].getLineNumber() + ")";
        AppMethodBeat.o(52153);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.e("MicroMsg.Util.MMStack", "getCaller e:%s", new Object[] { l(localThrowable) });
        String str1 = "";
        AppMethodBeat.o(52153);
      }
    }
  }

  public static String doR()
  {
    AppMethodBeat.i(52154);
    Object localObject = new Throwable().getStackTrace();
    if ((localObject == null) || (localObject.length < 4))
    {
      localObject = "";
      AppMethodBeat.o(52154);
    }
    while (true)
    {
      return localObject;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 3; i < localObject.length; i++)
        if ((localObject[i].getClassName().contains("com.tencent.mm")) && (!localObject[i].getClassName().contains("sdk.platformtools.Log")))
        {
          localStringBuilder.append("[");
          localStringBuilder.append(localObject[i].getClassName().substring(15));
          localStringBuilder.append(":");
          localStringBuilder.append(localObject[i].getMethodName());
          localStringBuilder.append("(" + localObject[i].getLineNumber() + ")]");
        }
      localObject = localStringBuilder.toString();
      AppMethodBeat.o(52154);
    }
  }

  public static String l(Throwable paramThrowable)
  {
    AppMethodBeat.i(52155);
    if (paramThrowable == null)
    {
      paramThrowable = "";
      AppMethodBeat.o(52155);
    }
    while (true)
    {
      return paramThrowable;
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        PrintStream localPrintStream = new java/io/PrintStream;
        localPrintStream.<init>(localByteArrayOutputStream);
        paramThrowable.printStackTrace(localPrintStream);
        paramThrowable = localByteArrayOutputStream.toString();
        localPrintStream.close();
        localByteArrayOutputStream.close();
        AppMethodBeat.o(52155);
      }
      catch (Exception paramThrowable)
      {
        paramThrowable = "";
        AppMethodBeat.o(52155);
      }
    }
  }

  public static String stackTraceToString(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    AppMethodBeat.i(52156);
    if ((paramArrayOfStackTraceElement == null) || (paramArrayOfStackTraceElement.length < 4))
    {
      paramArrayOfStackTraceElement = "";
      AppMethodBeat.o(52156);
    }
    while (true)
    {
      return paramArrayOfStackTraceElement;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 3; i < paramArrayOfStackTraceElement.length; i++)
        if ((paramArrayOfStackTraceElement[i].getClassName().contains("com.tencent.mm")) && (!paramArrayOfStackTraceElement[i].getClassName().contains("sdk.platformtools.Log")))
        {
          localStringBuilder.append("[");
          localStringBuilder.append(paramArrayOfStackTraceElement[i].getClassName().substring(15));
          localStringBuilder.append(":");
          localStringBuilder.append(paramArrayOfStackTraceElement[i].getMethodName());
          localStringBuilder.append("(" + paramArrayOfStackTraceElement[i].getLineNumber() + ")]");
        }
      paramArrayOfStackTraceElement = localStringBuilder.toString();
      AppMethodBeat.o(52156);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(52152);
    String str = doR();
    AppMethodBeat.o(52152);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.an
 * JD-Core Version:    0.6.2
 */