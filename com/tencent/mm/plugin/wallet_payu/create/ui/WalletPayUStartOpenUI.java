package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.a.c;
import com.tencent.mm.plugin.wallet_payu.create.a.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class WalletPayUStartOpenUI extends WalletBaseUI
{
  private String gDV;
  private WalletPayUOpenIntroView tTo;
  private MMFormMobileInputView tTp;
  private EditText tTq;
  private EditText tTr;
  private Button tTs;
  private TextView tTt;
  private TextView tTu;
  private String tTv;

  private String cNE()
  {
    AppMethodBeat.i(48399);
    String str;
    if (this.tTp.getCountryCode().startsWith("+"))
    {
      str = this.tTp.getCountryCode().substring(1);
      AppMethodBeat.o(48399);
    }
    while (true)
    {
      return str;
      str = this.tTp.getCountryCode();
      AppMethodBeat.o(48399);
    }
  }

  private boolean cTd()
  {
    AppMethodBeat.i(48400);
    boolean bool;
    if ((!bo.isNullOrNil(cNE())) && (!bo.isNullOrNil(this.tTr.getText().toString())))
    {
      bool = true;
      AppMethodBeat.o(48400);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48400);
    }
  }

  private void cTe()
  {
    AppMethodBeat.i(48401);
    if (this.tTp.getVisibility() == 0)
      if (cTd())
      {
        this.tTv = cNE();
        this.gDV = this.tTp.getMobileNumber();
        this.tTs.setEnabled(true);
        AppMethodBeat.o(48401);
      }
    while (true)
    {
      return;
      this.tTs.setEnabled(false);
      AppMethodBeat.o(48401);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean cNR()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130970356;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48397);
    super.onCreate(paramBundle);
    this.gDV = this.mBundle.getString("key_mobile");
    this.tTv = this.mBundle.getString("dial_code");
    if (bo.isNullOrNil(this.tTv))
      this.tTv = "27";
    this.tTo = ((WalletPayUOpenIntroView)findViewById(2131826514));
    this.tTo.setPagerData(new d[] { new d(2130839795, 2131305227, 2131305221), new d(2130839796, 2131305228, 2131305222), new d(2130839797, 2131305229, 2131305223) });
    this.tTp = ((MMFormMobileInputView)findViewById(2131826515));
    this.tTs = ((Button)findViewById(2131823199));
    this.tTq = this.tTp.getCountryCodeEditText();
    this.tTr = this.tTp.getMobileNumberEditText();
    if (!bo.isNullOrNil(this.gDV))
      this.tTr.setText(this.gDV);
    if (!bo.isNullOrNil(this.tTv))
      this.tTq.setText(this.tTv);
    paramBundle = new WalletPayUStartOpenUI.1(this);
    this.tTr.addTextChangedListener(paramBundle);
    this.tTq.addTextChangedListener(paramBundle);
    this.tTs.setOnClickListener(new WalletPayUStartOpenUI.2(this));
    this.tTt = ((TextView)findViewById(2131826505));
    c.a(this, this.tTt);
    this.tTu = ((TextView)findViewById(2131826516));
    this.tTu.setText(ae.dOc());
    AppMethodBeat.o(48397);
  }

  public void onResume()
  {
    AppMethodBeat.i(48398);
    super.onResume();
    cTe();
    AppMethodBeat.o(48398);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI
 * JD-Core Version:    0.6.2
 */