package com.tencent.mm.plugin.profile;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.at;
import com.tencent.mm.g.a.at.a;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

final class a$6$1
  implements Runnable
{
  a$6$1(a.6 param6, at paramat)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23209);
    String str1 = this.pkm.ctP.ctQ;
    this.pkn.pkl.jiE.getIntent().putExtra("inviteer", str1);
    String str2 = a.b(this.pkn.pkl.eih, this.pkm.ctP.ctQ);
    ab.i("MicroMsg.NewContactWidgetNormal", "[ChatroomMemberInviterUpdatedEvent callback] inviter:%s inviterDisplayName:%s", new Object[] { str1, str2 });
    if (bo.isNullOrNil(str2))
    {
      ao.a.flu.a(str1, "", new a.6.1.1(this, str1));
      AppMethodBeat.o(23209);
    }
    while (true)
    {
      return;
      a.a(this.pkn.pkl.iFE, this.pkn.pkl.jiE, str1, str2);
      AppMethodBeat.o(23209);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.6.1
 * JD-Core Version:    0.6.2
 */