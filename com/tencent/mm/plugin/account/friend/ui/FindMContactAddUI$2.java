package com.tencent.mm.plugin.account.friend.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.q;

final class FindMContactAddUI$2
  implements f
{
  FindMContactAddUI$2(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(108514);
    if (FindMContactAddUI.a(this.gxb) != null)
    {
      FindMContactAddUI.a(this.gxb).dismiss();
      FindMContactAddUI.b(this.gxb);
    }
    if (FindMContactAddUI.o(this.gxb) != null)
    {
      g.Rg().b(30, FindMContactAddUI.o(this.gxb));
      FindMContactAddUI.p(this.gxb);
    }
    if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
    {
      Toast.makeText(this.gxb.mController.ylL, paramString, 1).show();
      AppMethodBeat.o(108514);
    }
    while (true)
    {
      return;
      if ((FindMContactAddUI.k(this.gxb) != null) && (FindMContactAddUI.k(this.gxb).contains("2")))
      {
        paramString = new Intent(this.gxb, FindMContactInviteUI.class);
        paramString.putExtra("regsetinfo_ticket", FindMContactAddUI.l(this.gxb));
        paramString.putExtra("login_type", FindMContactAddUI.m(this.gxb));
        paramString.putExtra("regsetinfo_NextStyle", FindMContactAddUI.e(this.gxb));
        MMWizardActivity.J(this.gxb, paramString);
        AppMethodBeat.o(108514);
      }
      else
      {
        FindMContactAddUI.n(this.gxb);
        AppMethodBeat.o(108514);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI.2
 * JD-Core Version:    0.6.2
 */