package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.k.a.a;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.MMNeat7extView.a;
import com.tencent.mm.ui.widget.MMTextView.a;

final class al$b$5
  implements MMNeat7extView.a
{
  al$b$5(al.b paramb, al.f paramf)
  {
  }

  public final void ag(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(33308);
    if (((Boolean)this.zgL.zgQ.getTag(al.b.access$200())).booleanValue())
    {
      a.dHa();
      a.dHb().a(paramCharSequence, ((Long)this.zgL.zgQ.getTag(al.b.access$300())).longValue());
    }
    AppMethodBeat.o(33308);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.b.5
 * JD-Core Version:    0.6.2
 */