package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class k$6
  implements View.OnClickListener
{
  k$6(k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33717);
    ab.d("MicroMsg.FMessageContactView", "initMultiNew, goto FMessageConversationUI");
    aw.ZK();
    c.Ry().set(143618, Integer.valueOf(0));
    d.b(k.d(this.zmB), "subapp", ".ui.friend.FMessageConversationUI", new Intent());
    AppMethodBeat.o(33717);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.k.6
 * JD-Core Version:    0.6.2
 */