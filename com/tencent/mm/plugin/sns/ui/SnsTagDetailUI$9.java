package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class SnsTagDetailUI$9
  implements ContactListExpandPreference.a
{
  SnsTagDetailUI$9(SnsTagDetailUI paramSnsTagDetailUI)
  {
  }

  public final void JT()
  {
    AppMethodBeat.i(39355);
    if (this.rxD.ehS != null)
      this.rxD.ehS.djD();
    AppMethodBeat.o(39355);
  }

  public final void iA(int paramInt)
  {
    AppMethodBeat.i(39352);
    String str = this.rxD.ehS.KX(paramInt);
    ab.d("MicroMsg.SnsTagDetailUI", "roomPref del " + paramInt + " userName : " + str);
    g.RQ();
    if (bo.bc((String)g.RP().Ry().get(2, null), "").equals(str))
    {
      h.g(this.rxD.mController.ylL, 2131302542, 2131297061);
      AppMethodBeat.o(39352);
    }
    while (true)
    {
      return;
      this.rxD.km(str);
      if (((this.rxD.rxA + " " + bo.c(this.rxD.kPL, ",")).equals(this.rxD.cvZ)) && (this.rxD.qJQ != 0L))
      {
        this.rxD.enableOptionMenu(false);
        AppMethodBeat.o(39352);
      }
      else
      {
        this.rxD.enableOptionMenu(true);
        AppMethodBeat.o(39352);
      }
    }
  }

  public final void iB(int paramInt)
  {
    AppMethodBeat.i(39354);
    String str = this.rxD.ehS.KX(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", str);
    a.gkE.c(localIntent, this.rxD);
    AppMethodBeat.o(39354);
  }

  public final void iC(int paramInt)
  {
    AppMethodBeat.i(39353);
    ab.d("MicroMsg.SnsTagDetailUI", "roomPref add ".concat(String.valueOf(paramInt)));
    SnsTagDetailUI.a(this.rxD);
    AppMethodBeat.o(39353);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagDetailUI.9
 * JD-Core Version:    0.6.2
 */