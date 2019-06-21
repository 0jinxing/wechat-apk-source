package com.tencent.mm.plugin.bbom;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.chatting.r;

final class d$1
  implements View.OnClickListener
{
  d$1(d paramd, q paramq)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18243);
    r.a(paramView, paramView.getContext(), this.jEl.field_talker);
    AppMethodBeat.o(18243);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.d.1
 * JD-Core Version:    0.6.2
 */