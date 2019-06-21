package com.tencent.mm.ui.conversation;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class n$1 extends ak
{
  n$1(n paramn)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(34591);
    if (this.zvB.zrd != null)
    {
      this.zvB.zrd.clearCache();
      this.zvB.zrd.notifyDataSetChanged();
    }
    AppMethodBeat.o(34591);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n.1
 * JD-Core Version:    0.6.2
 */