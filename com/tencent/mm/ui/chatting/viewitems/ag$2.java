package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ag$2
  implements View.OnClickListener
{
  ag$2(ag paramag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33269);
    ab.d("MicroMsg.ChattingItemNewXmlSysImpl", "clicked");
    AppMethodBeat.o(33269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ag.2
 * JD-Core Version:    0.6.2
 */