package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;

final class j extends Handler
{
  j(Looper paramLooper, QbSdk.PreInitCallback paramPreInitCallback, Context paramContext)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(63987);
    switch (paramMessage.what)
    {
    default:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(63987);
      while (true)
      {
        return;
        if (this.a != null)
          this.a.onViewInitFinished(false);
        TbsLog.writeLogToDisk();
        AppMethodBeat.o(63987);
        continue;
        QbSdk.a(TbsExtensionFunctionManager.getInstance().canUseFunction(this.b, "disable_unpreinit.txt"));
        if (QbSdk.j)
        {
          paramMessage = bv.a().c();
          if (paramMessage != null)
            paramMessage.a(this.b);
        }
        if (this.a != null)
          this.a.onViewInitFinished(true);
        TbsLog.writeLogToDisk();
        AppMethodBeat.o(63987);
      }
      if (this.a != null)
        this.a.onCoreInitFinished();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.j
 * JD-Core Version:    0.6.2
 */