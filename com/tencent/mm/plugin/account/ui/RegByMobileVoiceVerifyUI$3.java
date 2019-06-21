package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelfriend.a;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.ui.base.h;

final class RegByMobileVoiceVerifyUI$3
  implements View.OnClickListener
{
  RegByMobileVoiceVerifyUI$3(RegByMobileVoiceVerifyUI paramRegByMobileVoiceVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125465);
    if ((RegByMobileVoiceVerifyUI.b(this.gGS) == 0) || (RegByMobileVoiceVerifyUI.b(this.gGS) == 2) || (RegByMobileVoiceVerifyUI.b(this.gGS) == 3))
    {
      RegByMobileVoiceVerifyUI.a(this.gGS, new a(RegByMobileVoiceVerifyUI.c(this.gGS), RegByMobileVoiceVerifyUI.d(this.gGS), "", 1, RegByMobileVoiceVerifyUI.a(this.gGS)));
      g.Rg().a(RegByMobileVoiceVerifyUI.e(this.gGS), 0);
      h.a(this.gGS, 2131297596, 2131297061, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(125463);
          RegByMobileVoiceVerifyUI.3.this.gGS.finish();
          AppMethodBeat.o(125463);
        }
      });
      AppMethodBeat.o(125465);
    }
    while (true)
    {
      return;
      if ((RegByMobileVoiceVerifyUI.b(this.gGS) == 4) || (RegByMobileVoiceVerifyUI.b(this.gGS) == 1))
      {
        RegByMobileVoiceVerifyUI.a(this.gGS, new x(RegByMobileVoiceVerifyUI.c(this.gGS), 1, "", 1, RegByMobileVoiceVerifyUI.a(this.gGS)));
        g.Rg().a(RegByMobileVoiceVerifyUI.f(this.gGS), 0);
        h.a(this.gGS, 2131297596, 2131297061, new RegByMobileVoiceVerifyUI.3.2(this));
      }
      AppMethodBeat.o(125465);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI.3
 * JD-Core Version:    0.6.2
 */