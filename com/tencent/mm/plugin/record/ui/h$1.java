package com.tencent.mm.plugin.record.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class h$1 extends ak
{
  h$1(h paramh, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(24228);
    if (paramMessage.what == 1)
    {
      ab.d("MicroMsg.RecordMsgBaseAdapter", "do play music");
      this.pKu.notifyDataSetChanged();
    }
    AppMethodBeat.o(24228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.h.1
 * JD-Core Version:    0.6.2
 */