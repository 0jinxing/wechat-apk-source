package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a;
import com.tencent.mm.plugin.account.friend.a.p;
import com.tencent.mm.plugin.account.friend.a.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.f.a.b;
import com.tencent.mm.ui.f.a.c.a;
import com.tencent.mm.ui.f.a.e;
import java.util.ArrayList;
import java.util.List;

final class InviteFacebookFriendsUI$10$1
  implements c.a
{
  InviteFacebookFriendsUI$10$1(InviteFacebookFriendsUI.10 param10, long[] paramArrayOfLong)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(124884);
    ab.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite error");
    AppMethodBeat.o(124884);
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(124883);
    ab.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite error");
    AppMethodBeat.o(124883);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(124886);
    ab.e("MicroMsg.InviteFacebookFriendsUI", "fbinvite cancle");
    AppMethodBeat.o(124886);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(124885);
    ab.i("MicroMsg.InviteFacebookFriendsUI", "fbinvite oncomplete");
    paramBundle = new ArrayList();
    paramBundle.add(new h.a(33, Integer.toString(this.gBx.length)));
    ((j)g.K(j.class)).XL().c(new com.tencent.mm.az.h(paramBundle));
    for (long l : this.gBx)
    {
      paramBundle = new p();
      paramBundle.username = Long.toString(l);
      paramBundle.gvE = 5;
      paramBundle.fvK = ((int)bo.anT());
      a.getInviteFriendOpenStg().b(paramBundle);
    }
    com.tencent.mm.ui.base.h.a(this.gBy.gBw, 2131299544, 2131297061, 2131297088, 2131296990, new InviteFacebookFriendsUI.10.1.1(this), new InviteFacebookFriendsUI.10.1.2(this));
    AppMethodBeat.o(124885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.10.1
 * JD-Core Version:    0.6.2
 */