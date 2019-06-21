package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelfriend.a;
import com.tencent.mm.ui.base.h;

final class LoginIndepPass$13
  implements View.OnClickListener
{
  LoginIndepPass$13(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124981);
    h.a(this.gCE, this.gCE.getString(2131302306) + LoginIndepPass.c(this.gCE), this.gCE.getString(2131302307), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(124980);
        g.Rg().a(145, LoginIndepPass.13.this.gCE);
        final a locala = new a(LoginIndepPass.d(LoginIndepPass.13.this.gCE), 16, "", 0, "");
        g.Rg().a(locala, 0);
        LoginIndepPass localLoginIndepPass = LoginIndepPass.13.this.gCE;
        paramAnonymousDialogInterface = LoginIndepPass.13.this.gCE;
        LoginIndepPass.13.this.gCE.getString(2131297061);
        LoginIndepPass.a(localLoginIndepPass, h.b(paramAnonymousDialogInterface, LoginIndepPass.13.this.gCE.getString(2131296965), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            AppMethodBeat.i(124979);
            g.Rg().c(locala);
            g.Rg().b(701, LoginIndepPass.13.this.gCE);
            g.Rg().b(252, LoginIndepPass.13.this.gCE);
            AppMethodBeat.o(124979);
          }
        }));
        AppMethodBeat.o(124980);
      }
    }
    , new LoginIndepPass.13.2(this));
    AppMethodBeat.o(124981);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginIndepPass.13
 * JD-Core Version:    0.6.2
 */