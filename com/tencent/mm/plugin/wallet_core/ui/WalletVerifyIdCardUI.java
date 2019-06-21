package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.c.n.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

public class WalletVerifyIdCardUI extends WalletBaseUI
{
  private TextView iDT;
  private boolean tLj;
  private i tLl;
  private n.a tLm;
  private EditHintPasswdView tLs;

  public WalletVerifyIdCardUI()
  {
    AppMethodBeat.i(47722);
    this.tLl = new i();
    this.tLj = false;
    this.tLm = new n.a()
    {
      public final void cRX()
      {
        AppMethodBeat.i(47721);
        WalletVerifyIdCardUI.b(WalletVerifyIdCardUI.this);
        AppMethodBeat.o(47721);
      }
    };
    AppMethodBeat.o(47722);
  }

  private boolean cRY()
  {
    AppMethodBeat.i(47726);
    boolean bool = this.mBundle.getBoolean("key_is_oversea", false);
    AppMethodBeat.o(47726);
    return bool;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(47725);
    if ((paramm instanceof n))
      if ((paramInt2 != 0) && (((n)paramm).cNi))
      {
        h.a(this.mController.ylL, paramString, null, false, new WalletVerifyIdCardUI.3(this));
        bool = true;
        AppMethodBeat.o(47725);
      }
    while (true)
    {
      return bool;
      this.tLs.cey();
      break;
      AppMethodBeat.o(47725);
    }
  }

  public final int getLayoutId()
  {
    return 2130971182;
  }

  public final boolean i(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47727);
    ab.i("MicroMsg.WalletVerifyIdCardUI", "onPreSceneEnd %s %s", new Object[] { Integer.valueOf(paramInt2), paramm });
    if (((paramm instanceof n)) && (paramInt2 == 0))
    {
      this.tLj = true;
      t.makeText(this, 2131305116, 0).show();
      ab.i("MicroMsg.WalletVerifyIdCardUI", "tag it isCertInstalled ok");
    }
    AppMethodBeat.o(47727);
    return true;
  }

  public final void initView()
  {
    AppMethodBeat.i(47724);
    this.iDT = ((TextView)findViewById(2131829077));
    this.tLs = ((EditHintPasswdView)findViewById(2131829078));
    String str1 = this.mBundle.getString("key_true_name");
    String str2 = this.mBundle.getString("key_cre_name");
    String str3 = this.mBundle.getString("key_cre_type");
    this.iDT.setText(getString(2131304832, new Object[] { str1, str2 }));
    this.tLs.setEditTextMaxLength(4);
    this.tLs.setEditTextSize(34.0F);
    this.tLs.setOnInputValidListener(new WalletVerifyIdCardUI.2(this));
    if ("1".equals(str3))
    {
      e(this.tLs, 1, false);
      AppMethodBeat.o(47724);
    }
    while (true)
    {
      return;
      e(this.tLs, 1, true);
      AppMethodBeat.o(47724);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47723);
    super.onCreate(paramBundle);
    this.tLl = new i(this.mBundle);
    initView();
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131690691)));
    paramBundle = getSupportActionBar().getCustomView();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.findViewById(2131821128);
      if (paramBundle != null)
        paramBundle.setBackgroundColor(getResources().getColor(2131690597));
    }
    if (d.iW(21))
    {
      if (!d.iW(23))
        break label157;
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    while (true)
    {
      setMMTitle("");
      setBackBtn(new WalletVerifyIdCardUI.1(this), 2131230737);
      AppMethodBeat.o(47723);
      return;
      label157: getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI
 * JD-Core Version:    0.6.2
 */