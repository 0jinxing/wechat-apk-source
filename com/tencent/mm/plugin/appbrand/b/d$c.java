package com.tencent.mm.plugin.appbrand.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$c extends h
{
  d$c(d paramd, i parami)
  {
    super(parami);
  }

  public final void enter()
  {
    AppMethodBeat.i(86854);
    super.enter();
    this.gWL.xCt.sendEmptyMessageDelayed(4, this.gWL.gPI.ye().hhb * 1000L);
    AppMethodBeat.o(86854);
  }

  public final void exit()
  {
    AppMethodBeat.i(86855);
    super.exit();
    this.gWL.xCt.removeMessages(4);
    AppMethodBeat.o(86855);
  }

  public final String getName()
  {
    AppMethodBeat.i(86852);
    String str = this.gWL.mName + "|BackgroundTemporary";
    AppMethodBeat.o(86852);
    return str;
  }

  public final boolean k(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(86853);
    switch (paramMessage.what)
    {
    default:
      bool = super.k(paramMessage);
      AppMethodBeat.o(86853);
    case 4:
    case 10:
    case 3:
    }
    while (true)
    {
      return bool;
      paramMessage = new ActivityManager.RunningAppProcessInfo();
      ActivityManager.getMyMemoryState(paramMessage);
      ab.i(this.gWL.TAG, "BackgroundTemporary process TO_SUSPEND_FROM_BACKGROUND, current process importance %d", new Object[] { Integer.valueOf(paramMessage.importance) });
      if (paramMessage.importance == 100)
      {
        d.a(this.gWL, this.gWL.gWF);
        AppMethodBeat.o(86853);
      }
      else
      {
        d.a(this.gWL, this.gWL.gWD);
        AppMethodBeat.o(86853);
        continue;
        ab.i(this.gWL.TAG, "BackgroundTemporary process ON_SYSTEM_SCREEN_OFF");
        d.a(this.gWL, this.gWL.gWF);
        AppMethodBeat.o(86853);
        continue;
        d.a(this.gWL, this.gWL.gWB);
        AppMethodBeat.o(86853);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.d.c
 * JD-Core Version:    0.6.2
 */