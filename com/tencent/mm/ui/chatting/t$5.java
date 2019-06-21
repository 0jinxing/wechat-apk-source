package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.g;

final class t$5
  implements Runnable
{
  t$5(t paramt, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30739);
    g.a(this.yKf.mContext, this.pAc, this.yKf.mContext.getString(2131298056), null, null);
    AppMethodBeat.o(30739);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.t.5
 * JD-Core Version:    0.6.2
 */