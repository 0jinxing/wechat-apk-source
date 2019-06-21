package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.k.a.a;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.MMNeat7extView.a;
import com.tencent.mm.ui.widget.MMTextView.a;

final class al$a$6
  implements MMNeat7extView.a
{
  al$a$6(al.a parama, al.f paramf)
  {
  }

  public final void ag(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(33292);
    if (((Boolean)this.zgL.zgQ.getTag(al.a.biE())).booleanValue())
    {
      a.dHa();
      a.dHb().a(paramCharSequence, ((Long)this.zgL.zgQ.getTag(al.a.cML())).longValue());
    }
    AppMethodBeat.o(33292);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.a.6
 * JD-Core Version:    0.6.2
 */