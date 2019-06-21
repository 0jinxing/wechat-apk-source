package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;

final class SeeAccessVerifyInfoUI$2
  implements View.OnClickListener
{
  SeeAccessVerifyInfoUI$2(SeeAccessVerifyInfoUI paramSeeAccessVerifyInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104262);
    ad localad = ((j)g.K(j.class)).XM().aoO(bo.nullAsNil(SeeAccessVerifyInfoUI.a(this.elC)));
    String str = localad.field_nickname;
    paramView = null;
    if (SeeAccessVerifyInfoUI.b(this.elC) != null)
      paramView = SeeAccessVerifyInfoUI.b(this.elC).mJ(SeeAccessVerifyInfoUI.a(this.elC));
    Object localObject = paramView;
    if (bo.isNullOrNil(paramView))
      localObject = localad.Oj();
    SeeAccessVerifyInfoUI.a(this.elC, SeeAccessVerifyInfoUI.a(this.elC), (String)localObject, str, false);
    AppMethodBeat.o(104262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI.2
 * JD-Core Version:    0.6.2
 */