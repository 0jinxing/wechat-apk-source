package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.profile.b;
import com.tencent.mm.plugin.profile.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

final class k$1
  implements View.OnClickListener
{
  k$1(k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23566);
    k localk = this.pno;
    if (paramView.getId() == 2131823024)
      h.pYm.e(16055, new Object[] { Integer.valueOf(c.am(localk.crP.getIntent())), Integer.valueOf(2) });
    if (localk.ehM == null)
    {
      ab.e("MicroMsg.ContactWidgetNormal", "contact is null");
      AppMethodBeat.o(23566);
    }
    while (true)
    {
      return;
      if (!a.jh(localk.ehM.field_type))
      {
        if (!bo.isNullOrNil(localk.ehM.field_encryptUsername))
        {
          localk.UT(localk.ehM.field_encryptUsername);
          AppMethodBeat.o(23566);
        }
        else
        {
          localk.UT(localk.ehM.field_username);
          AppMethodBeat.o(23566);
        }
      }
      else
      {
        paramView = new Intent();
        paramView.putExtra("Contact_Scene", localk.gwP);
        paramView.putExtra("Contact_User", localk.ehM.field_username);
        paramView.putExtra("Contact_RoomNickname", localk.crP.getIntent().getStringExtra("Contact_RoomNickname"));
        paramView.putExtra("view_mode", true);
        paramView.putExtra("contact_phone_number_by_md5", localk.pnm);
        paramView.putExtra("contact_phone_number_list", localk.ehM.dur);
        b.gkE.m(paramView, localk.crP);
        AppMethodBeat.o(23566);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.k.1
 * JD-Core Version:    0.6.2
 */