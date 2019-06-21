package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class at$1
  implements View.OnClickListener
{
  at$1(at paramat)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33439);
    ab.d("MicroMsg.ChattingItemWxaSubscribeSysImpl", "hy: textview clicked");
    AppMethodBeat.o(33439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.at.1
 * JD-Core Version:    0.6.2
 */