package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public class RegByQQAuthUI extends MMActivity
  implements f
{
  private String account;
  private String cIR;
  private String cxb;
  private ProgressDialog ehJ = null;
  private EditText gHh = null;
  private int gHi;
  private String guf;

  public final int getLayoutId()
  {
    return 2130970500;
  }

  public final void initView()
  {
    AppMethodBeat.i(125505);
    this.gHi = getIntent().getIntExtra("RegByQQ_BindUin", 0);
    this.guf = getIntent().getStringExtra("RegByQQ_RawPsw");
    this.account = getIntent().getStringExtra("RegByQQ_Account");
    this.cxb = getIntent().getStringExtra("RegByQQ_Ticket");
    this.cIR = getIntent().getStringExtra("RegByQQ_Nick");
    ab.v("MicroMsg.RegByQQAuthUI", "values : bindUin:" + this.gHi + "  pass:" + this.guf + "  ticket:" + this.cxb);
    this.gHh = ((EditText)findViewById(2131826954));
    if ((this.cIR != null) && (!this.cIR.equals("")))
      this.gHh.setText(this.cIR);
    setMMTitle(2131302319);
    addTextOptionMenu(0, getString(2131296989), new RegByQQAuthUI.1(this));
    setBackBtn(new RegByQQAuthUI.2(this));
    AppMethodBeat.o(125505);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125501);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(125501);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125502);
    super.onDestroy();
    AppMethodBeat.o(125502);
  }

  public void onPause()
  {
    AppMethodBeat.i(125504);
    super.onPause();
    g.Rg().b(126, this);
    AppMethodBeat.o(125504);
  }

  public void onResume()
  {
    AppMethodBeat.i(125503);
    super.onResume();
    g.Rg().a(126, this);
    AppMethodBeat.o(125503);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125506);
    ab.i("MicroMsg.RegByQQAuthUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (!bo.cv(this))
      AppMethodBeat.o(125506);
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        switch (paramm.getType())
        {
        default:
        case 126:
        }
        while (true)
        {
          AppMethodBeat.o(125506);
          break;
          com.tencent.mm.kernel.a.unhold();
          av.fly.ak("login_user_name", this.account);
          paramString = new Intent(this, BindMContactIntroUI.class);
          paramString.putExtra("key_upload_scene", 1);
          paramString.putExtra("skip", true);
          paramm = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
          paramm.addFlags(67108864);
          paramm.putExtra("LauncherUI.enter_from_reg", true);
          MMWizardActivity.b(this, paramString, paramm);
        }
      }
      if (paramm.getType() == 126)
      {
        paramm = com.tencent.mm.h.a.jY(paramString);
        if (paramm != null)
        {
          paramm.a(this, null, null);
          AppMethodBeat.o(125506);
        }
      }
      else
      {
        int i;
        if (com.tencent.mm.plugin.account.a.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
          i = 1;
        while (true)
        {
          if (i == 0)
            break label491;
          AppMethodBeat.o(125506);
          break;
          if (paramInt1 == 4);
          switch (paramInt2)
          {
          default:
            i = 0;
            break;
          case -1:
            if (g.Rg().acS() == 5)
            {
              h.g(this, 2131301656, 2131301655);
              i = 1;
            }
            break;
          case -3:
            h.g(this, 2131296903, 2131302317);
            i = 1;
            break;
          case -4:
            h.g(this, 2131296902, 2131302317);
            i = 1;
            break;
          case -12:
            h.g(this, 2131302318, 2131302317);
            i = 1;
            break;
          case -11:
            h.g(this, 2131302316, 2131302317);
            i = 1;
            break;
          case -72:
            h.g(this.mController.ylL, 2131302315, 2131297061);
            i = 1;
            break;
          case -75:
            h.g(this.mController.ylL, 2131296516, 2131297061);
            i = 1;
          }
        }
        label491: Toast.makeText(this, getString(2131299990, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(125506);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByQQAuthUI
 * JD-Core Version:    0.6.2
 */