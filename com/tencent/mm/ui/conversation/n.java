package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.a;
import com.tencent.mm.sdk.b.c;

public final class n
  implements a
{
  Activity czX;
  MessageQueue.IdleHandler jQs;
  c kTz;
  Runnable zky;
  h zrd;
  ConversationListView zuW;
  c zvA;
  c zvz;

  public n()
  {
    AppMethodBeat.i(34608);
    this.kTz = null;
    this.zvz = null;
    this.zvA = null;
    this.zky = new n.10(this);
    AppMethodBeat.o(34608);
  }

  public final void k(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(34609);
    if (this.zrd != null)
      this.zrd.notifyDataSetChanged();
    AppMethodBeat.o(34609);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n
 * JD-Core Version:    0.6.2
 */