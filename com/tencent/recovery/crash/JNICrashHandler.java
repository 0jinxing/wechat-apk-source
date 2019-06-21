package com.tencent.recovery.crash;

import com.tencent.recovery.Recovery;
import com.tencent.recovery.log.RecoveryLog;

public class JNICrashHandler
{
  private static final String TAG = "Recovery.JNICrashHandler";

  private static void onCrash()
  {
    RecoveryLog.i("Recovery.JNICrashHandler", "onCrash", new Object[0]);
    Recovery.dPW();
  }

  public static native void testSignal(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.crash.JNICrashHandler
 * JD-Core Version:    0.6.2
 */