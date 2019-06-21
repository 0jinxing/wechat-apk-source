package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class WalletForgotPwdSelectUI extends WalletBaseUI
{
  private View tru;
  private View trv;

  private void cOB()
  {
    AppMethodBeat.i(46268);
    ab.i("MicroMsg.WalletForgotPwdSelectUI", "goToBankcard");
    this.mBundle.putBoolean("key_select_bank_card", true);
    dOD().a(this, 0, this.mBundle);
    AppMethodBeat.o(46268);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971096;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46269);
    ab.i("MicroMsg.WalletForgotPwdSelectUI", "onActivityResult, requestCode: %s, resultCode: %s, data: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent });
    int i = paramIntent.getIntExtra("err_code", 0);
    int j = paramIntent.getIntExtra("scene", 0);
    int k = paramIntent.getIntExtra("countFace", 0);
    long l = paramIntent.getLongExtra("totalTime", 0L);
    int m = paramIntent.getIntExtra("err_type", 6);
    ab.i("MicroMsg.WalletForgotPwdSelectUI", "errCode： ".concat(String.valueOf(i)));
    ab.i("MicroMsg.WalletForgotPwdSelectUI", "scene： ".concat(String.valueOf(j)));
    ab.i("MicroMsg.WalletForgotPwdSelectUI", "countFace： ".concat(String.valueOf(k)));
    ab.i("MicroMsg.WalletForgotPwdSelectUI", "totalTime： ".concat(String.valueOf(l)));
    ab.i("MicroMsg.WalletForgotPwdSelectUI", "errorType： ".concat(String.valueOf(m)));
    if (paramInt1 == 233)
      if (paramInt2 == -1)
      {
        ab.i("MicroMsg.WalletForgotPwdSelectUI", "resultCode：RESULT_OK");
        if ((paramIntent != null) && (paramIntent.getExtras() != null))
        {
          paramIntent = paramIntent.getExtras().getString("token");
          if ((dOD() != null) && (!bo.isNullOrNil(paramIntent)))
          {
            h.pYm.e(15774, new Object[] { Integer.valueOf(dOD().mqu.getInt("key_forgot_scene", 1)), Integer.valueOf(4) });
            h.pYm.e(15711, new Object[] { Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(k), Long.valueOf(l), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i) });
          }
          this.mBundle.putString("key_face_action_result_token", paramIntent);
          this.mBundle.putBoolean("key_is_set_pwd_after_face_action", true);
          dOD().a(this, 0, this.mBundle);
          finish();
          AppMethodBeat.o(46269);
        }
      }
      else if ((paramIntent != null) && (paramIntent.getExtras() != null))
      {
        paramIntent = paramIntent.getExtras().getString("click_other_verify_btn");
        if ((bo.isNullOrNil(paramIntent)) || (!paramIntent.equalsIgnoreCase("yes")))
          break label677;
      }
    label677: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      ab.i("MicroMsg.WalletForgotPwdSelectUI", "isClickOtherVerify: %s", new Object[] { paramIntent });
      if (paramInt1 != 0)
      {
        ab.i("MicroMsg.WalletForgotPwdSelectUI", "check face failed, click other verify");
        if (dOD() != null)
        {
          h.pYm.e(15774, new Object[] { Integer.valueOf(dOD().mqu.getInt("key_forgot_scene", 1)), Integer.valueOf(5) });
          h.pYm.e(15711, new Object[] { Integer.valueOf(j), Integer.valueOf(3), Integer.valueOf(k), Long.valueOf(l), Integer.valueOf(1), Integer.valueOf(m), Integer.valueOf(i) });
        }
        cOB();
      }
      if (paramInt2 == 0)
      {
        ab.i("MicroMsg.WalletForgotPwdSelectUI", "resultCode：RESULT_CANCELED");
        if (dOD() != null)
        {
          h.pYm.e(15774, new Object[] { Integer.valueOf(dOD().mqu.getInt("key_forgot_scene", 1)), Integer.valueOf(6) });
          h.pYm.e(15711, new Object[] { Integer.valueOf(j), Integer.valueOf(2), Integer.valueOf(k), Long.valueOf(l), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(i) });
        }
      }
      AppMethodBeat.o(46269);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46267);
    super.onCreate(paramBundle);
    xE(Color.parseColor("#FFFFFF"));
    dyb();
    MY(8);
    this.tru = findViewById(2131828794);
    this.trv = findViewById(2131828795);
    this.tru.setOnClickListener(new WalletForgotPwdSelectUI.1(this));
    this.trv.setOnClickListener(new WalletForgotPwdSelectUI.2(this));
    AppMethodBeat.o(46267);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI
 * JD-Core Version:    0.6.2
 */