package com.tencent.mm.plugin.collect.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class CollectCreateQRCodeUI extends WalletBaseUI
{
  private String eeO = "";
  private WalletFormView kGa;
  private TextView kGb;

  public final boolean c(int paramInt1, int paramInt2, final String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(41241);
    if ((paramm instanceof s))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label358;
      paramString = (s)paramm;
      paramm = new Intent();
      paramm.putExtra("ftf_pay_url", paramString.kCI);
      paramm.putExtra("ftf_fixed_fee", paramString.kCJ);
      paramm.putExtra("ftf_fixed_fee_type", paramString.cuZ);
      paramm.putExtra("ftf_fixed_desc", paramString.desc);
      setResult(-1, paramm);
      finish();
      AppMethodBeat.o(41241);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramm instanceof com.tencent.mm.plugin.collect.model.m))
      {
        paramString = (com.tencent.mm.plugin.collect.model.m)paramm;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (paramString.kCl == 0)
          {
            paramm = new Intent();
            paramm.putExtra("ftf_pay_url", paramString.kCn);
            paramm.putExtra("ftf_fixed_fee", paramString.cSh / 100.0D);
            paramm.putExtra("ftf_fixed_desc", paramString.desc);
            paramm.putExtra("key_currency_unit", paramString.kCw);
            setResult(-1, paramm);
            finish();
            AppMethodBeat.o(41241);
            bool = true;
          }
          else if (paramString.kCo == 0)
          {
            h.b(this.mController.ylL, paramString.kCm, paramString.kCp, false);
            AppMethodBeat.o(41241);
            bool = true;
          }
          else if (paramString.kCo == 1)
          {
            if ((!bo.isNullOrNil(paramString.kCq)) && (!bo.isNullOrNil(paramString.kCr)))
              h.d(this.mController.ylL, paramString.kCm, paramString.kCp, paramString.kCr, paramString.kCq, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  AppMethodBeat.i(41237);
                  if (!bo.isNullOrNil(paramString.kCs))
                  {
                    ab.i("MicroMsg.CollectCreateQRCodeUI", "goto h5: %s", new Object[] { paramString.kCs });
                    e.n(CollectCreateQRCodeUI.this.mController.ylL, paramString.kCs, true);
                  }
                  AppMethodBeat.o(41237);
                }
              }
              , new CollectCreateQRCodeUI.6(this));
            AppMethodBeat.o(41241);
            bool = true;
          }
        }
        else
          ab.e("MicroMsg.CollectCreateQRCodeUI", "net error: %s", new Object[] { paramString });
      }
      else
      {
        label358: AppMethodBeat.o(41241);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969159;
  }

  public final void initView()
  {
    AppMethodBeat.i(41240);
    setMMTitle(2131298360);
    setBackBtn(new CollectCreateQRCodeUI.1(this));
    this.kGa = ((WalletFormView)findViewById(2131822842));
    com.tencent.mm.wallet_core.ui.formview.a.f(this.kGa);
    String str = getIntent().getStringExtra("key_currency_unit");
    if (!bo.isNullOrNil(str))
      this.kGa.getTitleTv().setText(str);
    while (true)
    {
      this.kGa.a(new CollectCreateQRCodeUI.2(this));
      e(this.kGa, 2, false);
      ((Button)findViewById(2131822846)).setOnClickListener(new CollectCreateQRCodeUI.3(this));
      this.kGb = ((TextView)findViewById(2131822845));
      this.kGb.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(41236);
          CollectCreateQRCodeUI.this.aoB();
          com.tencent.mm.plugin.wallet_core.ui.view.a.a(CollectCreateQRCodeUI.this, CollectCreateQRCodeUI.this.getString(2131298361), CollectCreateQRCodeUI.b(CollectCreateQRCodeUI.this), "", 32, new CollectCreateQRCodeUI.4.1(this), new CollectCreateQRCodeUI.4.2(this));
          AppMethodBeat.o(41236);
        }
      });
      AppMethodBeat.o(41240);
      return;
      this.kGa.getTitleTv().setText(ae.dOd());
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41238);
    super.onCreate(paramBundle);
    nf(1335);
    initView();
    AppMethodBeat.o(41238);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41239);
    super.onDestroy();
    ng(1335);
    AppMethodBeat.o(41239);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeUI
 * JD-Core Version:    0.6.2
 */