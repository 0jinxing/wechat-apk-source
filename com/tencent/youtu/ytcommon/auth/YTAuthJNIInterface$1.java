package com.tencent.youtu.ytcommon.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;

final class YTAuthJNIInterface$1 extends TimerTask
{
  public final void run()
  {
    AppMethodBeat.i(118063);
    String str = YTAuthJNIInterface.access$000();
    if (str != "")
      YTAuthJNIInterface.report(str);
    AppMethodBeat.o(118063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.1
 * JD-Core Version:    0.6.2
 */