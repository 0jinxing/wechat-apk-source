package com.tencent.qqvideo.proxy.httpproxy;

import com.tencent.matrix.trace.core.AppMethodBeat;

class TVHttpProxyLoadLibrary$LibraryBrokenHandler
  implements Thread.UncaughtExceptionHandler
{
  private Thread.UncaughtExceptionHandler mParent;

  public TVHttpProxyLoadLibrary$LibraryBrokenHandler(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.mParent = paramUncaughtExceptionHandler;
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    int i = 1;
    AppMethodBeat.i(124391);
    int j;
    if ((!(paramThrowable instanceof UnsatisfiedLinkError)) && ((!(paramThrowable instanceof NoSuchMethodError)) || (!paramThrowable.getMessage().matches(".*sig(nature)?[=:].*"))))
    {
      j = 0;
      if (j == 0)
        break label99;
    }
    while (true)
    {
      try
      {
        TVHttpProxyLoadLibrary.access$1(TVHttpProxyLoadLibrary.access$0());
        j = i;
        Throwable localThrowable = paramThrowable;
        if (j != 0)
          localThrowable = new UnsatisfiedLinkError("Invalid JNI libraries detected and recovered.").initCause(paramThrowable);
        this.mParent.uncaughtException(paramThread, localThrowable);
        AppMethodBeat.o(124391);
        return;
        j = 1;
      }
      catch (Exception localException)
      {
      }
      label99: j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary.LibraryBrokenHandler
 * JD-Core Version:    0.6.2
 */