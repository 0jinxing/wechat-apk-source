package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class LaunchAAByPersonRow extends LinearLayout
{
  private ImageView goC;
  private TextView goD;
  private TextView goE;
  private WalletFormView goF;
  private TextView goG;
  private String username;

  public LaunchAAByPersonRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(40819);
    init();
    AppMethodBeat.o(40819);
  }

  public LaunchAAByPersonRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(40820);
    init();
    AppMethodBeat.o(40820);
  }

  private void init()
  {
    AppMethodBeat.i(40821);
    inflate(getContext(), 2130969920, this);
    this.goC = ((ImageView)findViewById(2131825214));
    this.goD = ((TextView)findViewById(2131825215));
    this.goF = ((WalletFormView)findViewById(2131825217));
    this.goE = ((TextView)findViewById(2131825207));
    this.goG = ((TextView)findViewById(2131825216));
    AppMethodBeat.o(40821);
  }

  public WalletFormView getAmountEditView()
  {
    return this.goF;
  }

  public double getMoneyAmount()
  {
    double d = 0.0D;
    AppMethodBeat.i(40822);
    String str = this.goF.getText().toString();
    if ((bo.isNullOrNil(str)) || ("".equals(str)))
      AppMethodBeat.o(40822);
    while (true)
    {
      return d;
      d = bo.getDouble(str, 0.0D);
      AppMethodBeat.o(40822);
    }
  }

  public String getUsername()
  {
    return this.username;
  }

  public void setAmountTextChangeWatcher(TextWatcher paramTextWatcher)
  {
    AppMethodBeat.i(40823);
    if (paramTextWatcher != null)
      this.goF.a(paramTextWatcher);
    AppMethodBeat.o(40823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonRow
 * JD-Core Version:    0.6.2
 */