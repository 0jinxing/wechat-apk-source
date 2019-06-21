package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.f.a.b;
import com.tencent.mm.ui.f.a.c.a;
import com.tencent.mm.ui.f.a.e;
import com.tencent.mm.ui.q;

final class ShowNonWeixinFriendUI$2$1
  implements c.a
{
  ShowNonWeixinFriendUI$2$1(ShowNonWeixinFriendUI.2 param2)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(125587);
    ab.e("MicroMsg.ShowNonWeixinFriendUI", "fbinvite error");
    AppMethodBeat.o(125587);
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(125586);
    ab.e("MicroMsg.ShowNonWeixinFriendUI", "fbinvite error");
    AppMethodBeat.o(125586);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(125589);
    ab.e("MicroMsg.ShowNonWeixinFriendUI", "fbinvite cancle");
    AppMethodBeat.o(125589);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(125588);
    ab.i("MicroMsg.ShowNonWeixinFriendUI", "fbinvite oncomplete");
    h.a(this.gIn.gIm.mController.ylL, 2131299547, 2131297061, new ShowNonWeixinFriendUI.2.1.1(this));
    AppMethodBeat.o(125588);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShowNonWeixinFriendUI.2.1
 * JD-Core Version:    0.6.2
 */