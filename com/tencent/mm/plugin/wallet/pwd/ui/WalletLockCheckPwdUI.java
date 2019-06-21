package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.si;
import com.tencent.mm.plugin.wallet.pwd.a.e;
import com.tencent.mm.plugin.wallet.pwd.a.p;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;

public class WalletLockCheckPwdUI extends WalletBaseUI
{
  private String JU;
  private TextView iDT;
  private TextView kiF;
  private r tlb;
  private EditHintPasswdView tsd;
  private int tse = -1;

  private void E(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(46345);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt);
    localIntent.putExtra("key_token", paramString1);
    localIntent.putExtra("key_type", paramString2);
    setResult(-1, localIntent);
    finish();
    AppMethodBeat.o(46345);
  }

  private void Hk(int paramInt)
  {
    AppMethodBeat.i(46344);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt);
    setResult(-1, localIntent);
    finish();
    AppMethodBeat.o(46344);
  }

  public final boolean bwQ()
  {
    return true;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46346);
    ab.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo WalletLockCheckPwdUI errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramm instanceof r))
    {
      paramm = (r)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if ("next_action.switch_on_pattern".equals(getIntent().getStringExtra("next_action")))
        {
          ab.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo start to open wallet lock after check pwd");
          paramString = new Intent();
          paramString.putExtra("action", "action.switch_on_pattern");
          paramString.putExtra("next_action", "next_action.switch_on_pattern");
          paramString.putExtra("token", paramm.token);
          paramString.putExtra("type", paramm.tuh);
          paramString.putExtra("key_wallet_lock_type", this.tse);
          paramString.setPackage(ah.getPackageName());
          if (this.tse == 2)
            paramString.putExtra("key_pay_passwd", this.tsd.getText());
          paramm = new si();
          paramm.cOC.cOE = paramString;
          paramm.cOC.czX = this;
          paramm.cOC.requestCode = 1;
          a.xxA.m(paramm);
          AppMethodBeat.o(46346);
        }
      while (true)
      {
        return bool;
        E(0, paramm.token, paramm.tuh);
        break;
        if ((paramInt1 != 1000) || (paramInt2 != 3))
          break label331;
        E(-1, null, null);
        AppMethodBeat.o(46346);
      }
    }
    if ((paramm instanceof p))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
        Hk(0);
      while (true)
      {
        AppMethodBeat.o(46346);
        break;
        Hk(-1);
      }
    }
    if ((paramm instanceof e))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label342;
      Hk(0);
    }
    while (true)
    {
      label331: AppMethodBeat.o(46346);
      bool = false;
      break;
      label342: Hk(-1);
    }
  }

  public final int getLayoutId()
  {
    return 2130971083;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(46347);
    if (paramIntent == null);
    while (true)
    {
      ab.v("MicroMsg.WalletLockCheckPwdUI", "alvinluo WalletLockCheckPwdUI onActivityResult requestCode: %d, resultCode: %d, data == null: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      setResult(paramInt2, paramIntent);
      finish();
      AppMethodBeat.o(46347);
      return;
      bool = false;
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(46342);
    ab.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo onBackPressed");
    Hk(4);
    AppMethodBeat.o(46342);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46340);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    this.tse = getIntent().getIntExtra("key_wallet_lock_type", -1);
    this.JU = getIntent().getStringExtra("action");
    ab.v("MicroMsg.WalletLockCheckPwdUI", "alvinluo wallet lock type: %d, action: %s", new Object[] { Integer.valueOf(this.tse), this.JU });
    this.tsd = ((EditHintPasswdView)findViewById(2131824902));
    this.iDT = ((TextView)findViewById(2131824899));
    this.kiF = ((TextView)findViewById(2131828754));
    paramBundle = getIntent().getStringExtra("key_wallet_lock_input_new_fp_tips");
    if (this.tse == 2)
    {
      this.iDT.setText(2131305476);
      if ((this.JU.equals("action.touchlock_need_verify_paypwd")) && (!bo.isNullOrNil(paramBundle)))
        this.kiF.setText(paramBundle);
    }
    while (true)
    {
      this.tsd.setOnInputValidListener(new WalletLockCheckPwdUI.3(this));
      e(this.tsd, 0, false);
      setBackBtn(new WalletLockCheckPwdUI.1(this));
      findViewById(2131828753).setOnClickListener(new WalletLockCheckPwdUI.2(this));
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(-2147483648);
        paramBundle.setStatusBarColor(getResources().getColor(2131690691));
        if (Build.VERSION.SDK_INT >= 23)
          paramBundle.getDecorView().setSystemUiVisibility(8192);
      }
      this.mController.contentView.setFitsSystemWindows(true);
      AppMethodBeat.o(46340);
      return;
      if (this.tse == 1)
        this.iDT.setText(2131305477);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(46341);
    super.onResume();
    if (this.tsd != null)
      this.tsd.cey();
    AppMethodBeat.o(46341);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(46343);
    super.wU(paramInt);
    this.tsd.cey();
    AppMethodBeat.o(46343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI
 * JD-Core Version:    0.6.2
 */