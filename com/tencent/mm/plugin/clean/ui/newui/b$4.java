package com.tencent.mm.plugin.clean.ui.newui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class b$4 extends ak
{
  b$4(b paramb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(18850);
    if (!b.b(this.kyI))
      this.kyI.notifyDataSetChanged();
    AppMethodBeat.o(18850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.b.4
 * JD-Core Version:    0.6.2
 */