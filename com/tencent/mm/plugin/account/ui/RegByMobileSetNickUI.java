package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.plugin.account.bind.ui.BindQQUI;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.MMEditText.c;

@Deprecated
public class RegByMobileSetNickUI extends MMActivity
  implements f
{
  private String cFl;
  private ProgressDialog ehJ = null;
  private EditText gGu;
  private q gGv = null;
  private boolean gGw;

  public final int getLayoutId()
  {
    return 2130970498;
  }

  public final void initView()
  {
    AppMethodBeat.i(125433);
    setMMTitle(2131302284);
    this.gGu = ((EditText)findViewById(2131826941));
    this.gGu.addTextChangedListener(new MMEditText.c(this.gGu, null, 16));
    addTextOptionMenu(0, getString(2131296944), new RegByMobileSetNickUI.1(this));
    setBackBtn(new RegByMobileSetNickUI.2(this));
    AppMethodBeat.o(125433);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125431);
    super.onCreate(paramBundle);
    this.gGw = getIntent().getBooleanExtra("is_sync_addr", false);
    this.cFl = getIntent().getExtras().getString("bindmcontact_mobile");
    initView();
    g.Rg().a(126, this);
    AppMethodBeat.o(125431);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125432);
    if (this.gGv != null)
    {
      q localq = this.gGv;
      t localt = localq.gFy;
      localt.cancel();
      localt.che.stopTimer();
      localt.reset();
      localq.text = null;
    }
    g.Rg().b(126, this);
    super.onDestroy();
    AppMethodBeat.o(125432);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125434);
    boolean bool;
    if (paramInt == 4)
    {
      finish();
      bool = true;
      AppMethodBeat.o(125434);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(125434);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125435);
    ab.i("MicroMsg.RegByMobileSetNickUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (!bo.cv(this))
      AppMethodBeat.o(125435);
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramInt1 = r.YD();
        ab.d("MicroMsg.RegByMobileSetNickUI", "Reg By mobile status = " + paramInt1 + " isSync = " + this.gGw);
        if (this.gGw)
        {
          paramInt1 &= -131073;
          l.apP();
          getApplicationContext();
          com.tencent.mm.platformtools.a.anC();
          label145: ab.d("MicroMsg.RegByMobileSetNickUI", "Reg By mobile update = ".concat(String.valueOf(paramInt1)));
          g.RP().Ry().set(7, Integer.valueOf(paramInt1));
          if (this.gGw)
            break label330;
        }
        label330: for (paramInt1 = 1; ; paramInt1 = 2)
        {
          paramString = new act();
          paramString.wkw = 17;
          paramString.pvD = paramInt1;
          ((j)g.K(j.class)).XL().c(new j.a(23, paramString));
          com.tencent.mm.plugin.account.a.a.gkF.BS();
          av.fly.ak("login_user_name", this.cFl);
          paramString = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
          paramString.putExtra("LauncherUI.enter_from_reg", true);
          paramString.addFlags(67108864);
          if (!((s)paramm).fPC)
            break label335;
          MMWizardActivity.b(this, new Intent(this, BindQQUI.class).putExtra("bindqq_regbymobile", 1), paramString);
          AppMethodBeat.o(125435);
          break;
          paramInt1 |= 131072;
          break label145;
        }
        label335: MMWizardActivity.b(this, new Intent(this, BindFacebookUI.class), paramString);
        AppMethodBeat.o(125435);
      }
      else if (paramm.getType() == 126)
      {
        paramm = com.tencent.mm.h.a.jY(paramString);
        if (paramm != null)
        {
          paramm.a(this, null, null);
          AppMethodBeat.o(125435);
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
            break label510;
          AppMethodBeat.o(125435);
          break;
          switch (paramInt1)
          {
          default:
          case 4:
          }
          do
          {
            i = 0;
            break;
            if ((paramInt2 == -7) || (paramInt2 == -10))
            {
              h.g(this, 2131302221, 2131302222);
              i = 1;
              break;
            }
          }
          while (paramInt2 != -75);
          h.g(this, 2131296516, 2131302222);
          i = 1;
        }
        label510: Toast.makeText(this, getString(2131299990, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(125435);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSetNickUI
 * JD-Core Version:    0.6.2
 */