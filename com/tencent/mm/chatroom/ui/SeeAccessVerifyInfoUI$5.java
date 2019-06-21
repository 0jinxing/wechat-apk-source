package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.c.c;
import com.tencent.mm.ci.f;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.c.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

final class SeeAccessVerifyInfoUI$5
  implements View.OnClickListener
{
  SeeAccessVerifyInfoUI$5(SeeAccessVerifyInfoUI paramSeeAccessVerifyInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104266);
    SeeAccessVerifyInfoUI localSeeAccessVerifyInfoUI = this.elC;
    paramView = this.elC.mController.ylL;
    this.elC.getString(2131297061);
    SeeAccessVerifyInfoUI.a(localSeeAccessVerifyInfoUI, h.b(paramView, this.elC.getString(2131296386), false, null));
    if (t.mP(SeeAccessVerifyInfoUI.g(this.elC)))
    {
      new a(SeeAccessVerifyInfoUI.a(this.elC), SeeAccessVerifyInfoUI.g(this.elC), SeeAccessVerifyInfoUI.k(this.elC), new LinkedList(bo.hT(SeeAccessVerifyInfoUI.l(this.elC), ","))).acy().b(this.elC).b(new SeeAccessVerifyInfoUI.5.1(this));
      AppMethodBeat.o(104266);
    }
    while (true)
    {
      return;
      new c(SeeAccessVerifyInfoUI.m(this.elC), SeeAccessVerifyInfoUI.a(this.elC), SeeAccessVerifyInfoUI.g(this.elC), SeeAccessVerifyInfoUI.k(this.elC), new LinkedList(bo.P(SeeAccessVerifyInfoUI.l(this.elC).split(",")))).acy().b(this.elC).b(new SeeAccessVerifyInfoUI.5.2(this));
      AppMethodBeat.o(104266);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI.5
 * JD-Core Version:    0.6.2
 */