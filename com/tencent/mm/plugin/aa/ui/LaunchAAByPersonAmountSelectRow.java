package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class LaunchAAByPersonAmountSelectRow extends LinearLayout
{
  private ImageView eks;
  private TextView goa;
  private WalletFormView gob;
  private View goc;
  private TextWatcher god;
  private String username;

  public LaunchAAByPersonAmountSelectRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(40780);
    this.god = null;
    init(paramContext);
    AppMethodBeat.o(40780);
  }

  public LaunchAAByPersonAmountSelectRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(40781);
    this.god = null;
    init(paramContext);
    AppMethodBeat.o(40781);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(40782);
    v.hu(paramContext).inflate(2130969917, this, true);
    this.eks = ((ImageView)findViewById(2131823704));
    this.goa = ((TextView)findViewById(2131821556));
    this.gob = ((WalletFormView)findViewById(2131825206));
    this.goc = findViewById(2131821128);
    AppMethodBeat.o(40782);
  }

  public double getAmount()
  {
    double d = 0.0D;
    AppMethodBeat.i(40784);
    String str = this.gob.getText().toString();
    if ((bo.isNullOrNil(str)) || ("".equals(str)))
      AppMethodBeat.o(40784);
    while (true)
    {
      return d;
      d = bo.getDouble(str, 0.0D);
      AppMethodBeat.o(40784);
    }
  }

  public WalletFormView getMoneyEdit()
  {
    return this.gob;
  }

  public String getUsername()
  {
    return this.username;
  }

  public void setDividerVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(40785);
    View localView = this.goc;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(40785);
      return;
    }
  }

  public void setTextWatcher(TextWatcher paramTextWatcher)
  {
    AppMethodBeat.i(40783);
    this.god = paramTextWatcher;
    this.gob.a(paramTextWatcher);
    AppMethodBeat.o(40783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectRow
 * JD-Core Version:    0.6.2
 */