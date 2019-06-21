package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class WalletBindDepositUI extends WalletBaseUI
{
  private Button gEZ;
  private boolean nfA;
  private WalletFormView tEp;
  private WalletFormView tFS;
  private ElementQuery tvu;
  private WalletFormView uYT;

  public WalletBindDepositUI()
  {
    AppMethodBeat.i(48674);
    this.nfA = true;
    this.tvu = new ElementQuery();
    AppMethodBeat.o(48674);
  }

  private void cu()
  {
    AppMethodBeat.i(48677);
    if (bo.isNullOrNil(this.tvu.nuL))
    {
      this.tFS.setText("");
      AppMethodBeat.o(48677);
    }
    while (true)
    {
      return;
      if (2 == this.tvu.tyE)
      {
        this.tFS.setText(this.tvu.nuL + " " + getString(2131304760));
        AppMethodBeat.o(48677);
      }
      else
      {
        this.tFS.setText(this.tvu.nuL + " " + getString(2131304780));
        AppMethodBeat.o(48677);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(48679);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof t)))
    {
      paramString = (t)paramm;
      if (paramString.tun != null)
        if (!paramString.tun.cPr())
        {
          h.g(this, 2131304611, 2131297061);
          AppMethodBeat.o(48679);
          bool1 = bool2;
        }
    }
    while (true)
    {
      return bool1;
      this.tvu = paramString.tun;
      cu();
      if ((this.tvu.tyC) && (this.tvu.isError()))
      {
        h.g(this, 2131304582, 2131297061);
        AppMethodBeat.o(48679);
        bool1 = bool2;
      }
      else
      {
        paramString = com.tencent.mm.wallet_core.a.aE(this);
        if (paramString != null)
        {
          paramInt2 = this.tvu.tuo;
          if (paramString == null)
          {
            label145: if (bool1)
              break label254;
            if (!paramString.cRY())
              break label235;
            ab.w("MicroMsg.WalletBindDepositUI", "Overseas user try to bind domestic card!");
            h.g(this, 2131304515, 2131297061);
          }
          while (true)
          {
            this.tEp.cey();
            AppMethodBeat.o(48679);
            bool1 = bool2;
            break;
            if (!paramString.mqu.containsKey("key_support_bankcard"))
            {
              bool1 = true;
              break label145;
            }
            paramInt1 = paramString.dNE();
            if (paramInt1 == 0)
            {
              bool1 = true;
              break label145;
            }
            bool1 = Bankcard.gh(paramInt1, paramInt2);
            break label145;
            label235: ab.w("MicroMsg.WalletBindDepositUI", "Domestic user try to bind international card!");
            h.g(this, 2131304514, 2131297061);
          }
        }
        label254: cu();
        AppMethodBeat.o(48679);
        bool1 = bool2;
        continue;
        AppMethodBeat.o(48679);
        bool1 = false;
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971038;
  }

  public final void initView()
  {
    AppMethodBeat.i(48676);
    setMMTitle(2131304613);
    this.tEp = ((WalletFormView)findViewById(2131828578));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.tEp);
    this.tFS = ((WalletFormView)findViewById(2131823369));
    this.uYT = ((WalletFormView)findViewById(2131828579));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.uYT);
    this.gEZ = ((Button)findViewById(2131822846));
    e(this.tEp, 0, false);
    e(this.uYT, 0, false);
    this.tFS.setOnClickListener(new WalletBindDepositUI.1(this));
    this.gEZ.setOnClickListener(new WalletBindDepositUI.2(this));
    AppMethodBeat.o(48676);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48678);
    ab.i("MicroMsg.WalletBindDepositUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(48678);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(48678);
      break;
      paramIntent = (ElementQuery)paramIntent.getParcelableExtra("elemt_query");
      if (paramIntent.cPr())
      {
        this.tvu = paramIntent;
        cu();
        AppMethodBeat.o(48678);
        break;
      }
      h.g(this, 2131304611, 2131297061);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48675);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(48675);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI
 * JD-Core Version:    0.6.2
 */