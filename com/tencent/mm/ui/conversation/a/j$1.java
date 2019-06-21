package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;

final class j$1
  implements View.OnClickListener
{
  j$1(j paramj, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34664);
    paramView = new Intent();
    paramView.putExtra("Invite_friends", 1);
    d.b(this.val$context, "subapp", ".ui.pluginapp.InviteFriendsBy3rdUI", paramView);
    h.pYm.e(14034, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(34664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.j.1
 * JD-Core Version:    0.6.2
 */