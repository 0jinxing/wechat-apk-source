package com.tencent.toybrick.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.toybrick.f.a;
import java.lang.ref.WeakReference;

final class c$1 extends Handler
{
  c$1(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(113234);
    super.handleMessage(paramMessage);
    if (paramMessage.what == 2)
    {
      c.c localc = (c.c)paramMessage.obj;
      paramMessage = (a)c.c.a(localc).get();
      if ((paramMessage != null) && (paramMessage.AHp.hashCode() == c.c.b(localc)))
      {
        c.c.d(localc).H(paramMessage, c.c.c(localc));
        AppMethodBeat.o(113234);
      }
    }
    while (true)
    {
      return;
      ai.w("WhenHandler", "[WhenHandler] has loaded! but not right,holder has changed!", new Object[0]);
      AppMethodBeat.o(113234);
      continue;
      if (paramMessage.what == 3)
      {
        paramMessage = (c.d)paramMessage.obj;
        c.d.c(paramMessage).d(c.d.a(paramMessage).get(), ((Boolean)c.d.b(paramMessage)).booleanValue());
      }
      AppMethodBeat.o(113234);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.e.c.1
 * JD-Core Version:    0.6.2
 */