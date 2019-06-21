package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.r.a;
import com.tencent.mm.storage.r.c;

final class a$1
  implements r.c
{
  a$1(a parama)
  {
  }

  public final void a(Object paramObject, r.a parama)
  {
    AppMethodBeat.i(14098);
    if ((parama != null) && (parama.xIe))
      AppMethodBeat.o(14098);
    while (true)
    {
      return;
      Looper.myQueue().addIdleHandler(new a.1.1(this, paramObject, parama));
      AppMethodBeat.o(14098);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.1
 * JD-Core Version:    0.6.2
 */