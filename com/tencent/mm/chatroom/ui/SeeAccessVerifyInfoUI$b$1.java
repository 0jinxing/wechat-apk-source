package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import java.util.List;

final class SeeAccessVerifyInfoUI$b$1
  implements View.OnClickListener
{
  SeeAccessVerifyInfoUI$b$1(SeeAccessVerifyInfoUI.b paramb, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104267);
    String str = ((SeeAccessVerifyInfoUI.a)this.elI.elG.get(this.sN)).nickname;
    paramView = null;
    if (SeeAccessVerifyInfoUI.b(this.elI.elC) != null)
      paramView = SeeAccessVerifyInfoUI.b(this.elI.elC).mJ(((SeeAccessVerifyInfoUI.a)this.elI.elG.get(this.sN)).username);
    if (bo.isNullOrNil(paramView))
      paramView = ((j)g.K(j.class)).XM().aoO(bo.nullAsNil(((SeeAccessVerifyInfoUI.a)this.elI.elG.get(this.sN)).username)).Oj();
    while (true)
    {
      SeeAccessVerifyInfoUI.a(this.elI.elC, ((SeeAccessVerifyInfoUI.a)this.elI.elG.get(this.sN)).username, paramView, str, true);
      AppMethodBeat.o(104267);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI.b.1
 * JD-Core Version:    0.6.2
 */