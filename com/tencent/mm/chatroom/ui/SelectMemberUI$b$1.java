package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class SelectMemberUI$b$1
  implements Runnable
{
  SelectMemberUI$b$1(SelectMemberUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104413);
    SelectMemberUI.b.a(this.emL, true);
    long l = System.currentTimeMillis();
    this.emL.Q(this.emL.emG.Kx());
    SelectMemberUI.b.a(this.emL);
    ab.i("MicroMsg.SelectMemberAdapter", "[load data] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    al.d(new SelectMemberUI.b.1.1(this));
    AppMethodBeat.o(104413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.b.1
 * JD-Core Version:    0.6.2
 */