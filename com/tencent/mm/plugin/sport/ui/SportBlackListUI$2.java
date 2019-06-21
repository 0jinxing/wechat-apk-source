package com.tencent.mm.plugin.sport.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.storage.bd;
import java.util.List;

final class SportBlackListUI$2
  implements ContactListExpandPreference.a
{
  SportBlackListUI$2(SportBlackListUI paramSportBlackListUI)
  {
  }

  public final void JT()
  {
    AppMethodBeat.i(25140);
    SportBlackListUI.a(this.rPV).djD();
    AppMethodBeat.o(25140);
  }

  public final void iA(int paramInt)
  {
    AppMethodBeat.i(25137);
    String str = SportBlackListUI.a(this.rPV).KX(paramInt);
    SportBlackListUI.b(this.rPV).remove(str);
    SportBlackListUI.a(this.rPV).u(null, SportBlackListUI.b(this.rPV));
    SportBlackListUI.a(this.rPV).refresh();
    aw.ZK();
    t.h(c.XM().aoO(str));
    com.tencent.mm.plugin.sport.a.d.kT(40);
    AppMethodBeat.o(25137);
  }

  public final void iB(int paramInt)
  {
    AppMethodBeat.i(25139);
    String str = SportBlackListUI.a(this.rPV).KX(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", str);
    com.tencent.mm.bp.d.b(this.rPV, "profile", ".ui.ContactInfoUI", localIntent);
    AppMethodBeat.o(25139);
  }

  public final void iC(int paramInt)
  {
    AppMethodBeat.i(25138);
    SportBlackListUI.c(this.rPV);
    AppMethodBeat.o(25138);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.ui.SportBlackListUI.2
 * JD-Core Version:    0.6.2
 */