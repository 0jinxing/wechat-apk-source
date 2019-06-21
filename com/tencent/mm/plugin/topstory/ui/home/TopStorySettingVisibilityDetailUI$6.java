package com.tencent.mm.plugin.topstory.ui.home;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class TopStorySettingVisibilityDetailUI$6
  implements ContactListExpandPreference.a
{
  TopStorySettingVisibilityDetailUI$6(TopStorySettingVisibilityDetailUI paramTopStorySettingVisibilityDetailUI)
  {
  }

  public final void JT()
  {
    AppMethodBeat.i(1643);
    if (this.sCO.ehS != null)
      this.sCO.ehS.djD();
    AppMethodBeat.o(1643);
  }

  public final void iA(int paramInt)
  {
    AppMethodBeat.i(1640);
    String str = this.sCO.ehS.KX(paramInt);
    ab.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "roomPref del " + paramInt + " userName : " + str);
    g.RQ();
    if (bo.bc((String)g.RP().Ry().get(2, null), "").equals(str))
    {
      h.b(this.sCO.mController.ylL, this.sCO.getString(2131302542), "", true);
      AppMethodBeat.o(1640);
    }
    while (true)
    {
      return;
      this.sCO.km(str);
      if (((this.sCO.rxA + " " + bo.c(this.sCO.kPL, ",")).equals(this.sCO.cvZ)) && (this.sCO.qJQ != 0L))
      {
        this.sCO.enableOptionMenu(false);
        AppMethodBeat.o(1640);
      }
      else
      {
        this.sCO.enableOptionMenu(true);
        AppMethodBeat.o(1640);
      }
    }
  }

  public final void iB(int paramInt)
  {
    AppMethodBeat.i(1642);
    String str = this.sCO.ehS.KX(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", str);
    d.b(this.sCO, "profile", ".ui.ContactInfoUI", localIntent);
    AppMethodBeat.o(1642);
  }

  public final void iC(int paramInt)
  {
    AppMethodBeat.i(1641);
    ab.d("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "roomPref add ".concat(String.valueOf(paramInt)));
    TopStorySettingVisibilityDetailUI.c(this.sCO);
    AppMethodBeat.o(1641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI.6
 * JD-Core Version:    0.6.2
 */