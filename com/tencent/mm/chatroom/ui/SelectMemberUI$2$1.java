package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;

final class SelectMemberUI$2$1
  implements ap.a
{
  SelectMemberUI$2$1(SelectMemberUI.2 param2)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(104408);
    ab.d("MicroMsg.SelectMemberUI", "searchEvent onTimerExpired");
    SelectMemberUI.b localb = this.emI.emG.emB;
    String str = SelectMemberUI.b(this.emI.emG).getText().toString();
    ab.i("MicroMsg.SelectMemberAdapter", "search:%s isLoading:%s", new Object[] { bo.anv(str), Boolean.valueOf(localb.isLoading) });
    if (!localb.isLoading)
    {
      localb.ema = str;
      localb.kn(str);
      al.d(new SelectMemberUI.b.2(localb));
    }
    AppMethodBeat.o(104408);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI.2.1
 * JD-Core Version:    0.6.2
 */