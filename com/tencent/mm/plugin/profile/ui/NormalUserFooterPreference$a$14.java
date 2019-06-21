package com.tencent.mm.plugin.profile.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.a.uh;
import com.tencent.mm.g.a.uh.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.c;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class NormalUserFooterPreference$a$14
  implements View.OnClickListener
{
  NormalUserFooterPreference$a$14(NormalUserFooterPreference.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23691);
    paramView = this.poS;
    Object localObject = new uh();
    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    int i;
    if ((!NormalUserFooterPreference.a(paramView.poR).field_username.equals(((uh)localObject).cQt.talker)) && ((((uh)localObject).cQt.cQv) || (((uh)localObject).cQt.cQw)))
      if (((uh)localObject).cQt.cQu)
      {
        i = 2131297782;
        Toast.makeText(NormalUserFooterPreference.b(paramView.poR).mController.ylL, i, 0).show();
        ab.i("MicroMsg.NormalUserFooterPreference", "voip is running, can't do this");
      }
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(16055, new Object[] { Integer.valueOf(c.am(NormalUserFooterPreference.b(this.poS.poR).getIntent())), Integer.valueOf(5) });
      AppMethodBeat.o(23691);
      return;
      i = 2131297783;
      break;
      if (!com.tencent.mm.r.a.bH(NormalUserFooterPreference.b(paramView.poR)))
      {
        localObject = new sz();
        ((sz)localObject).cPf.cPh = true;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
        localObject = ((sz)localObject).cPg.cPj;
        if (!bo.isNullOrNil((String)localObject))
        {
          ab.v("MicroMsg.NormalUserFooterPreference", "Talkroom is on: ".concat(String.valueOf(localObject)));
          com.tencent.mm.ui.base.h.d(NormalUserFooterPreference.b(paramView.poR), NormalUserFooterPreference.b(paramView.poR).getString(2131303996), "", NormalUserFooterPreference.b(paramView.poR).getString(2131296994), NormalUserFooterPreference.b(paramView.poR).getString(2131296868), new NormalUserFooterPreference.a.2(paramView), new NormalUserFooterPreference.a.3(paramView));
        }
        else
        {
          paramView.cbq();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.14
 * JD-Core Version:    0.6.2
 */