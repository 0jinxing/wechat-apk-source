package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$2
  implements Runnable
{
  h$2(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24229);
    ab.d("MicroMsg.RecordMsgBaseAdapter", "refresh adapter");
    this.pKu.notifyDataSetChanged();
    AppMethodBeat.o(24229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.h.2
 * JD-Core Version:    0.6.2
 */