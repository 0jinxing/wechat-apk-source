package com.tencent.mm.plugin.account.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.tools.b.c.a;

final class RegByMobileRegAIOUI$4
  implements View.OnClickListener
{
  RegByMobileRegAIOUI$4(RegByMobileRegAIOUI paramRegByMobileRegAIOUI, boolean[] paramArrayOfBoolean)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125341);
    if (this.gEb[0] != 0)
      this.gEb[0] = false;
    while (true)
    {
      paramView = c.d(RegByMobileRegAIOUI.k(this.gGd).getContentEditText()).hz(1, 32);
      paramView.zIx = true;
      paramView.a(new c.a()
      {
        public final void JW()
        {
          AppMethodBeat.i(125339);
          h.g(RegByMobileRegAIOUI.4.this.gGd, 2131303149, 2131303152);
          AppMethodBeat.o(125339);
        }

        public final void JX()
        {
          AppMethodBeat.i(125340);
          h.g(RegByMobileRegAIOUI.4.this.gGd, 2131303150, 2131303152);
          AppMethodBeat.o(125340);
        }

        public final void ki(String paramAnonymousString)
        {
          AppMethodBeat.i(125338);
          RegByMobileRegAIOUI.a(RegByMobileRegAIOUI.4.this.gGd, av.amN(RegByMobileRegAIOUI.c(RegByMobileRegAIOUI.4.this.gGd).getText().toString()));
          RegByMobileRegAIOUI.b(RegByMobileRegAIOUI.4.this.gGd, av.amP(RegByMobileRegAIOUI.d(RegByMobileRegAIOUI.4.this.gGd)));
          paramAnonymousString = RegByMobileRegAIOUI.e(RegByMobileRegAIOUI.4.this.gGd) + RegByMobileRegAIOUI.f(RegByMobileRegAIOUI.4.this.gGd);
          RegByMobileRegAIOUI.4.this.gGd.aqX();
          if (RegByMobileRegAIOUI.g(RegByMobileRegAIOUI.4.this.gGd))
          {
            if (bo.isNullOrNil(RegByMobileRegAIOUI.h(RegByMobileRegAIOUI.4.this.gGd)))
              RegByMobileRegAIOUI.c(RegByMobileRegAIOUI.4.this.gGd, com.tencent.mm.au.b.m(RegByMobileRegAIOUI.4.this.gGd, RegByMobileRegAIOUI.d(RegByMobileRegAIOUI.4.this.gGd), RegByMobileRegAIOUI.4.this.gGd.getString(2131298789)));
            paramAnonymousString = RegByMobileRegAIOUI.4.this.gGd.getString(2131305909, new Object[] { aa.dor(), RegByMobileRegAIOUI.h(RegByMobileRegAIOUI.4.this.gGd), "reg", Integer.valueOf(1), Integer.valueOf(0) });
            a.b(RegByMobileRegAIOUI.4.this.gGd, paramAnonymousString, 30847, false);
            AppMethodBeat.o(125338);
          }
          while (true)
          {
            return;
            if (!bo.isNullOrNil(RegByMobileRegAIOUI.i(RegByMobileRegAIOUI.4.this.gGd)))
            {
              RegByMobileRegAIOUI.j(RegByMobileRegAIOUI.4.this.gGd);
              AppMethodBeat.o(125338);
            }
            else
            {
              RegByMobileRegAIOUI.d(RegByMobileRegAIOUI.4.this.gGd, paramAnonymousString);
              AppMethodBeat.o(125338);
            }
          }
        }
      });
      AppMethodBeat.o(125341);
      return;
      com.tencent.mm.plugin.normsg.a.b.oTO.fu("ce_reg", "<Reg>");
      paramView = MotionEvent.obtain(0L, 0L, 1, 0.0F, 0.0F, 65535);
      com.tencent.mm.plugin.normsg.a.b.oTO.a("ce_reg", paramView);
      com.tencent.mm.plugin.normsg.a.b.oTO.TN("ce_reg");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.4
 * JD-Core Version:    0.6.2
 */