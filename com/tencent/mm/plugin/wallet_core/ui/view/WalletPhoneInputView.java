package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.au.b.a;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WalletPhoneInputView extends LinearLayout
{
  private int mMode;
  private WalletFormView tNO;
  private WalletFormView tNP;
  private TenpaySecureEditText tNQ;
  private Map<String, b.a> tNR;
  private String tNS;
  private String tNT;
  private boolean tNU;

  public WalletPhoneInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(47913);
    this.mMode = 0;
    this.tNS = "";
    this.tNT = "";
    this.tNU = true;
    init(paramContext);
    a(paramContext, paramAttributeSet, -1);
    AppMethodBeat.o(47913);
  }

  public WalletPhoneInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(47914);
    this.mMode = 0;
    this.tNS = "";
    this.tNT = "";
    this.tNU = true;
    init(paramContext);
    a(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.o(47914);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    AppMethodBeat.i(47916);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.WalletPhoneInputViewAttrs, paramInt, 0);
    paramInt = localTypedArray.getResourceId(0, 0);
    if (paramInt != 0)
    {
      paramAttributeSet = paramContext.getString(paramInt);
      this.tNP.setHint(paramAttributeSet);
    }
    paramInt = localTypedArray.getResourceId(1, 0);
    if (paramInt != 0)
    {
      paramContext = paramContext.getString(paramInt);
      this.tNP.setTitleText(paramContext);
    }
    AppMethodBeat.o(47916);
  }

  private void cSy()
  {
    AppMethodBeat.i(47919);
    this.tNO.setText(this.tNS);
    this.tNQ.setText(this.tNT);
    AppMethodBeat.o(47919);
  }

  private void cSz()
  {
    AppMethodBeat.i(47920);
    b.a locala = (b.a)this.tNR.get("86");
    this.tNT = locala.fHD;
    this.tNS = locala.fHE;
    cSy();
    AppMethodBeat.o(47920);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(47915);
    inflate(paramContext, 2130971154, this);
    this.tNO = ((WalletFormView)findViewById(2131829014));
    this.tNP = ((WalletFormView)findViewById(2131829015));
    this.tNO.setOnClickListener(new WalletPhoneInputView.1(this));
    this.tNQ = ((TenpaySecureEditText)this.tNP.findViewById(2131829013));
    this.tNQ.setFixedHeaderText("+");
    if ((getContext() instanceof MMActivity))
    {
      this.tNP.setOnInfoIvClickListener(new WalletPhoneInputView.2(this));
      this.tNP.setLogicDelegate(new WalletPhoneInputView.3(this));
    }
    paramContext = b.G(getContext(), getContext().getString(2131298789));
    this.tNR = new HashMap();
    Iterator localIterator = paramContext.iterator();
    while (localIterator.hasNext())
    {
      paramContext = (b.a)localIterator.next();
      this.tNR.put(paramContext.fHD, paramContext);
    }
    AppMethodBeat.o(47915);
  }

  public final boolean cSA()
  {
    if (this.mMode == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void cSB()
  {
    AppMethodBeat.i(47921);
    this.mMode = 0;
    cSz();
    this.tNO.setVisibility(8);
    this.tNQ.setVisibility(8);
    AppMethodBeat.o(47921);
  }

  public final void cSC()
  {
    AppMethodBeat.i(47922);
    this.mMode = 1;
    cSz();
    this.tNO.setVisibility(0);
    this.tNQ.setVisibility(0);
    this.tNQ.addTextChangedListener(new WalletPhoneInputView.4(this));
    this.tNQ.setOnFocusChangeListener(new WalletPhoneInputView.5(this));
    AppMethodBeat.o(47922);
  }

  public final boolean e(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(47918);
    String str;
    if (paramInt1 == 65521)
      if (paramInt2 == 100)
      {
        str = paramIntent.getStringExtra("country_name");
        paramIntent = paramIntent.getStringExtra("couttry_code");
        ab.i("MicroMsg.WalletPhoneInputView", "countryName: %s, countryCode: %s", new Object[] { this.tNS, this.tNT });
        if ((bo.isNullOrNil(str)) || (bo.isNullOrNil(paramIntent)))
        {
          ab.i("MicroMsg.WalletPhoneInputView", "cancel pick");
          AppMethodBeat.o(47918);
        }
      }
    while (true)
    {
      return bool;
      this.tNS = str;
      this.tNT = paramIntent;
      this.tNU = false;
      cSy();
      this.tNQ.clearFocus();
      AppMethodBeat.o(47918);
      continue;
      AppMethodBeat.o(47918);
      bool = false;
    }
  }

  public String getCountryCode()
  {
    AppMethodBeat.i(47917);
    String str;
    if (cSA())
    {
      str = "86";
      AppMethodBeat.o(47917);
    }
    while (true)
    {
      return str;
      str = this.tNQ.getText().toString();
      AppMethodBeat.o(47917);
    }
  }

  public WalletFormView getPhoneNumberEt()
  {
    return this.tNP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView
 * JD-Core Version:    0.6.2
 */