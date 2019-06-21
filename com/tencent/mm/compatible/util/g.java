package com.tencent.mm.compatible.util;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  public static String Mp()
  {
    AppMethodBeat.i(93077);
    String str = new java.lang.Throwable().getStackTrace()[1].toString();
    AppMethodBeat.o(93077);
    return str;
  }

  public static String Mq()
  {
    AppMethodBeat.i(93078);
    Object localObject = new java.lang.Throwable().getStackTrace()[1];
    int i = ((StackTraceElement)localObject).getMethodName().lastIndexOf('.');
    localObject = ((StackTraceElement)localObject).getMethodName().substring(i + 1) + "(" + ((StackTraceElement)localObject).getFileName() + ":" + ((StackTraceElement)localObject).getLineNumber() + ")";
    AppMethodBeat.o(93078);
    return localObject;
  }

  public static int getLine()
  {
    AppMethodBeat.i(93076);
    int i = new java.lang.Throwable().getStackTrace()[1].getLineNumber();
    AppMethodBeat.o(93076);
    return i;
  }

  public static final class a
  {
    public long evE;

    public a()
    {
      AppMethodBeat.i(93073);
      this.evE = SystemClock.elapsedRealtime();
      AppMethodBeat.o(93073);
    }

    public final long Mr()
    {
      AppMethodBeat.i(93075);
      long l1 = SystemClock.elapsedRealtime();
      long l2 = this.evE;
      AppMethodBeat.o(93075);
      return l1 - l2;
    }

    public final void reset()
    {
      AppMethodBeat.i(138534);
      this.evE = SystemClock.elapsedRealtime();
      AppMethodBeat.o(138534);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.g
 * JD-Core Version:    0.6.2
 */