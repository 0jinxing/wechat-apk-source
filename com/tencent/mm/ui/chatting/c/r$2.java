package com.tencent.mm.ui.chatting.c;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.d.a;

final class r$2
  implements Runnable
{
  r$2(r paramr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31441);
    Bundle localBundle = new Bundle();
    localBundle.putLong("MSG_ID", r.a(this.yQd).field_msgId);
    this.yQd.cgL.yTz.ax(localBundle);
    AppMethodBeat.o(31441);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.r.2
 * JD-Core Version:    0.6.2
 */