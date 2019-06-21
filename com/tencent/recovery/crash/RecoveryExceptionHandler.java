package com.tencent.recovery.crash;

import com.tencent.recovery.Recovery;

public class RecoveryExceptionHandler
  implements Thread.UncaughtExceptionHandler
{
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Recovery.dPW();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.crash.RecoveryExceptionHandler
 * JD-Core Version:    0.6.2
 */