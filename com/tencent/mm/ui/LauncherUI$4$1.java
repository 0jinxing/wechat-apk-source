package com.tencent.mm.ui;

import android.os.Process;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.sdk.platformtools.ab;

final class LauncherUI$4$1
  implements Runnable
{
  LauncherUI$4$1(LauncherUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138620);
    WXHardCoderJNI.terminateApp(Process.myTid(), SystemClock.elapsedRealtimeNanos());
    ab.i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp done");
    AppMethodBeat.o(138620);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUI.4.1
 * JD-Core Version:    0.6.2
 */