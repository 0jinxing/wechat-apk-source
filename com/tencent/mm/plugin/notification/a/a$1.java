package com.tencent.mm.plugin.notification.a;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;

final class a$1 extends ak
{
  a$1(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(23094);
    super.handleMessage(paramMessage);
    paramMessage = paramMessage.getData().getString("com.tencent.mm.notification.observer");
    aw.RS().m(new a.1.1(this, paramMessage), 500L);
    AppMethodBeat.o(23094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.a.a.1
 * JD-Core Version:    0.6.2
 */