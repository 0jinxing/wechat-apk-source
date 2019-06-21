package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import com.tencent.recovery.Recovery;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CrashMonitorForJni
{
  private static final String TAG = "MicroMsg.CrashMonitorForJni";
  private static a sCrashExtraMessageGetter;

  private static void OnCrash(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(126235);
    Recovery.dPW();
    new StringBuilder("OnCrash sig:").append(paramInt1).append("  stack:").append(paramString);
    b.g(paramInt1, paramString);
    AppMethodBeat.o(126235);
  }

  private static CharSequence getAllThreadJavaStack()
  {
    AppMethodBeat.i(126236);
    StringBuilder localStringBuilder1 = new StringBuilder(8192);
    StringBuilder localStringBuilder2 = new StringBuilder(2048);
    Iterator localIterator = Thread.getAllStackTraces().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      Thread localThread = (Thread)((Map.Entry)localObject).getKey();
      localObject = (StackTraceElement[])((Map.Entry)localObject).getValue();
      localStringBuilder2.setLength(0);
      localStringBuilder2.append("\n (").append(localThread.getId()).append(") [").append(localThread.getName()).append("] ************\n");
      int i = 0;
      for (int j = 0; j < localObject.length; j++)
      {
        if (localObject[j].toString().startsWith("com.tencent.mm."))
          i = 1;
        localStringBuilder2.append("\tat ").append(localObject[j].toString()).append("\n");
      }
      if (i != 0)
        localStringBuilder1.append(localStringBuilder2);
    }
    AppMethodBeat.o(126236);
    return localStringBuilder1;
  }

  public static String getCrashThreadJavaStack()
  {
    AppMethodBeat.i(126237);
    StringWriter localStringWriter = new StringWriter();
    Object localObject1 = new PrintWriter(localStringWriter);
    Object localObject2 = sCrashExtraMessageGetter;
    if (localObject2 != null)
    {
      ((PrintWriter)localObject1).append("\n");
      ((PrintWriter)localObject1).append(((a)localObject2).Bu());
      ((PrintWriter)localObject1).append("\n");
    }
    Throwable localThrowable = new Throwable("\n******* Java stack for JNI crash *******");
    localObject2 = localThrowable.getStackTrace();
    if (localObject2.length > 1)
    {
      StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[localObject2.length - 1];
      for (int i = 0; i < arrayOfStackTraceElement.length; i++)
        arrayOfStackTraceElement[i] = localObject2[(i + 1)];
      localThrowable.setStackTrace(arrayOfStackTraceElement);
    }
    localThrowable.printStackTrace((PrintWriter)localObject1);
    ((PrintWriter)localObject1).append(getAllThreadJavaStack());
    ((PrintWriter)localObject1).append('\n');
    localObject1 = localStringWriter.toString();
    AppMethodBeat.o(126237);
    return localObject1;
  }

  public static native void setClientVersionMsg(String paramString);

  public static void setCrashExtraMessageGetter(a parama)
  {
    sCrashExtraMessageGetter = parama;
  }

  public static abstract interface a
  {
    public abstract String Bu();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.CrashMonitorForJni
 * JD-Core Version:    0.6.2
 */