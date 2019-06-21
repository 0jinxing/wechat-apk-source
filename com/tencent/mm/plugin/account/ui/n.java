package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.hy;
import com.tencent.mm.g.a.hy.b;
import com.tencent.mm.g.a.hz;
import com.tencent.mm.g.a.hz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import java.util.List;

public final class n
  implements f, MobileVerifyUI.b
{
  private String elr = null;
  private MobileVerifyUI gEE;
  private String gsy = "";
  private int gsz = 2;

  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    AppMethodBeat.i(125247);
    this.gEE = paramMobileVerifyUI;
    this.elr = paramMobileVerifyUI.getIntent().getStringExtra("regsetinfo_ticket");
    this.gsy = paramMobileVerifyUI.getIntent().getStringExtra("regsetinfo_NextStep");
    this.gsz = paramMobileVerifyUI.getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    AppMethodBeat.o(125247);
  }

  public final boolean a(final MobileVerifyUI.a parama)
  {
    AppMethodBeat.i(125248);
    switch (n.3.gEI[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(125248);
      return false;
      parama = new hy();
      parama.cCS.context = this.gEE;
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      parama = parama.cCT.cCU;
      Object localObject = new hz();
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      localObject = ((hz)localObject).cCV.cCW;
      g.Rg().a(132, this);
      parama = new x(this.gEE.cFl, 2, this.gEE.grL.getText().toString().trim(), "", parama, (String)localObject);
      g.Rg().a(parama, 0);
      localObject = this.gEE;
      MobileVerifyUI localMobileVerifyUI = this.gEE;
      this.gEE.getString(2131297061);
      ((MobileVerifyUI)localObject).ehJ = h.b(localMobileVerifyUI, this.gEE.getString(2131297578), true, new n.2(this, parama));
      continue;
      g.Rg().a(132, this);
      parama = new x(this.gEE.cFl, 1, "", 0, "");
      g.Rg().a(parama, 0);
      continue;
      parama = new hy();
      parama.cCS.context = this.gEE;
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      parama = parama.cCT.cCU;
      localObject = new hz();
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      localObject = ((hz)localObject).cCV.cCW;
      g.Rg().a(132, this);
      parama = new x(this.gEE.cFl, 2, this.gEE.grL.getText().toString().trim(), "", parama, (String)localObject);
      g.Rg().a(parama, 0);
      localMobileVerifyUI = this.gEE;
      localObject = this.gEE;
      this.gEE.getString(2131297061);
      localMobileVerifyUI.ehJ = h.b((Context)localObject, this.gEE.getString(2131297578), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(125244);
          g.Rg().c(parama);
          g.Rg().b(132, n.this);
          AppMethodBeat.o(125244);
        }
      });
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 0;
    AppMethodBeat.i(125249);
    ab.i("MicroMsg.MobileVerifyQQRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.gEE.ehJ != null)
    {
      this.gEE.ehJ.dismiss();
      this.gEE.ehJ = null;
    }
    if (paramm.getType() == 132)
    {
      g.Rg().b(132, this);
      if ((((x)paramm).Ah() == 2) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.kernel.a.unhold();
        paramInt1 = i;
        if (com.tencent.mm.pluginsdk.a.fB(this.gEE).size() != 0)
          paramInt1 = 1;
        if ((this.gsy != null) && (this.gsy.contains("1")) && (paramInt1 != 0))
        {
          com.tencent.mm.plugin.b.a.wA("R300_300_QQ");
          paramm = new Intent(this.gEE, FindMContactAddUI.class);
          paramm.addFlags(67108864);
          paramm.putExtra("regsetinfo_ticket", this.elr);
          paramm.putExtra("regsetinfo_NextStep", this.gsy);
          paramm.putExtra("regsetinfo_NextStyle", this.gsz);
          paramm.putExtra("login_type", 1);
          paramString = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gEE);
          paramString.addFlags(67108864);
          MMWizardActivity.b(this.gEE, paramm, paramString);
          this.gEE.finish();
          AppMethodBeat.o(125249);
        }
      }
    }
    while (true)
    {
      return;
      paramString = com.tencent.mm.plugin.account.a.a.gkE.bh(this.gEE);
      paramString.addFlags(67108864);
      this.gEE.startActivity(paramString);
      this.gEE.gFj = 4;
      this.gEE.finish();
      AppMethodBeat.o(125249);
      continue;
      AppMethodBeat.o(125249);
      continue;
      if (this.gEE.j(paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(125249);
      }
      else
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
          Toast.makeText(this.gEE, this.gEE.getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(125249);
      }
    }
  }

  public final void start()
  {
  }

  public final void stop()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.n
 * JD-Core Version:    0.6.2
 */