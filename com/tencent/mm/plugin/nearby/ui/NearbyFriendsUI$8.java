package com.tencent.mm.plugin.nearby.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.modelstat.e;
import com.tencent.mm.plugin.nearby.a.c;
import com.tencent.mm.ui.base.h;

final class NearbyFriendsUI$8
  implements b.a
{
  NearbyFriendsUI$8(NearbyFriendsUI paramNearbyFriendsUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(55449);
    if (NearbyFriendsUI.d(this.oQs))
      AppMethodBeat.o(55449);
    while (true)
    {
      return false;
      NearbyFriendsUI.e(this.oQs);
      if (!this.oQs.eVT)
        break;
      if (NearbyFriendsUI.f(this.oQs) != null)
      {
        NearbyFriendsUI.f(this.oQs).dismiss();
        NearbyFriendsUI.a(this.oQs, null);
      }
      com.tencent.mm.plugin.report.service.g.BP(11);
      AppMethodBeat.o(55449);
    }
    label151: boolean bool;
    if (paramBoolean)
    {
      if (NearbyFriendsUI.f(this.oQs) != null)
        NearbyFriendsUI.f(this.oQs).setMessage(this.oQs.getString(2131301620));
      NearbyFriendsUI.a(this.oQs, new NearbyFriendsUI.a(this.oQs, paramFloat2, paramFloat1, (int)paramDouble2));
      e locale = e.akf();
      if (paramInt == 0)
      {
        paramBoolean = false;
        if (NearbyFriendsUI.g(this.oQs) != null)
          break label266;
        bool = false;
        label164: locale.a(2001, paramBoolean, bool, paramFloat1, paramFloat2, (int)paramDouble2);
        NearbyFriendsUI.a(this.oQs, new c(NearbyFriendsUI.h(this.oQs), NearbyFriendsUI.i(this.oQs).fBs, NearbyFriendsUI.i(this.oQs).fBr, NearbyFriendsUI.i(this.oQs).accuracy, paramInt, "", ""));
        com.tencent.mm.kernel.g.Rg().a(NearbyFriendsUI.b(this.oQs), 0);
      }
    }
    while (true)
    {
      AppMethodBeat.o(55449);
      break;
      paramBoolean = true;
      break label151;
      label266: bool = NearbyFriendsUI.g(this.oQs).fBD;
      break label164;
      com.tencent.mm.plugin.report.service.g.BP(11);
      if (NearbyFriendsUI.f(this.oQs) != null)
      {
        NearbyFriendsUI.f(this.oQs).dismiss();
        NearbyFriendsUI.a(this.oQs, null);
      }
      this.oQs.findViewById(2131826298).setVisibility(0);
      NearbyFriendsUI.j(this.oQs).setVisibility(8);
      NearbyFriendsUI.k(this.oQs);
      if ((!NearbyFriendsUI.l(this.oQs)) && (!d.agA()))
      {
        NearbyFriendsUI.m(this.oQs);
        h.a(this.oQs, this.oQs.getString(2131300421), this.oQs.getString(2131297061), this.oQs.getString(2131300878), this.oQs.getString(2131296868), false, new NearbyFriendsUI.8.1(this), null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.8
 * JD-Core Version:    0.6.2
 */