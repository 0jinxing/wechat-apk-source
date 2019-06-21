package com.tencent.mm.plugin.talkroom.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.o;

final class a$1 extends ak
{
  a$1(a parama)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(25888);
    super.handleMessage(paramMessage);
    a.a(this.szf).dismiss();
    AppMethodBeat.o(25888);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.a.1
 * JD-Core Version:    0.6.2
 */