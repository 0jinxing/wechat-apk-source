package com.tencent.mm.plugin.luckymoney.appbrand.ui;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.a.h.a;
import com.tencent.mm.plugin.luckymoney.b.a;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.luckymoney.model.j;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.luckymoney.ui.c;
import com.tencent.mm.plugin.luckymoney.ui.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.TenpaySecureEditText;

public class WxaLuckyMoneyMoneyInputView extends LinearLayout
  implements c
{
  private TextWatcher arx;
  private TextView iDT;
  private TenpaySecureEditText nSo;
  private TextView nSp;
  private View nSq;
  private g nSr;
  private i nSs;
  private double nSt;
  private double nSu;
  public h.a nSv;

  public WxaLuckyMoneyMoneyInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(42005);
    this.arx = new WxaLuckyMoneyMoneyInputView.1(this);
    a.bKN();
    this.nSs = a.bKO().bLu();
    paramContext = LayoutInflater.from(paramContext).inflate(2130971244, this, true);
    this.nSo = ((TenpaySecureEditText)paramContext.findViewById(2131825536));
    this.nSo.addTextChangedListener(this.arx);
    this.iDT = ((TextView)paramContext.findViewById(2131825535));
    this.nSq = paramContext.findViewById(2131825534);
    this.nSp = ((TextView)paramContext.findViewById(2131825537));
    AppMethodBeat.o(42005);
  }

  public final int bKW()
  {
    int i = 0;
    AppMethodBeat.i(42011);
    if (bo.isNullOrNil(this.nSo.getText().toString()))
      AppMethodBeat.o(42011);
    while (true)
    {
      return i;
      double d = bo.getDouble(this.nSo.getText().toString(), -1.0D);
      if (d < 0.0D)
      {
        i = 3;
        AppMethodBeat.o(42011);
      }
      else if ((d > this.nSt) && (this.nSt > 0.0D))
      {
        i = 1;
        AppMethodBeat.o(42011);
      }
      else if ((d < this.nSu) && (d > 0.0D))
      {
        i = 2;
        AppMethodBeat.o(42011);
      }
      else
      {
        AppMethodBeat.o(42011);
      }
    }
  }

  public double getInput()
  {
    AppMethodBeat.i(42006);
    double d = bo.getDouble(this.nSo.getText().toString(), 0.0D);
    AppMethodBeat.o(42006);
    return d;
  }

  public int getInputViewId()
  {
    AppMethodBeat.i(42014);
    int i = getId();
    AppMethodBeat.o(42014);
    return i;
  }

  public final void onError()
  {
    AppMethodBeat.i(42013);
    this.iDT.setTextColor(x.eq(getContext()));
    this.nSo.setTextColor(x.eq(getContext()));
    this.nSp.setTextColor(x.eq(getContext()));
    AppMethodBeat.o(42013);
  }

  public final void restore()
  {
    AppMethodBeat.i(42012);
    this.iDT.setTextColor(-16777216);
    this.nSo.setTextColor(-16777216);
    this.nSp.setTextColor(-16777216);
    AppMethodBeat.o(42012);
  }

  public void setAmount(String paramString)
  {
    AppMethodBeat.i(42010);
    this.nSo.setText(paramString);
    AppMethodBeat.o(42010);
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(42004);
    this.nSo.setHint(paramString);
    AppMethodBeat.o(42004);
  }

  public void setMaxAmount(double paramDouble)
  {
    this.nSt = paramDouble;
  }

  public void setMaxLen(int paramInt)
  {
    AppMethodBeat.i(42009);
    this.nSo.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
    AppMethodBeat.o(42009);
  }

  public void setMinAmount(double paramDouble)
  {
    this.nSu = paramDouble;
  }

  public void setOnInputValidChangerListener(g paramg)
  {
    this.nSr = paramg;
  }

  public void setShowGroupIcon(boolean paramBoolean)
  {
    AppMethodBeat.i(42008);
    if (paramBoolean)
    {
      this.nSq.setVisibility(0);
      AppMethodBeat.o(42008);
    }
    while (true)
    {
      return;
      this.nSq.setVisibility(8);
      AppMethodBeat.o(42008);
    }
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(42007);
    this.iDT.setText(paramString);
    AppMethodBeat.o(42007);
  }

  public void setType(h.a parama)
  {
    this.nSv = parama;
  }

  public final String xH(int paramInt)
  {
    AppMethodBeat.i(42015);
    a.bKN();
    this.nSs = a.bKO().bLu();
    String str;
    if (paramInt == 1)
      if (this.nSv == h.a.nRX)
      {
        str = getContext().getString(2131301210, new Object[] { Math.round(this.nSt), bo.bc(this.nSs.nRU, "") });
        AppMethodBeat.o(42015);
      }
    while (true)
    {
      return str;
      str = getContext().getString(2131301074, new Object[] { Math.round(this.nSt), bo.bc(this.nSs.nRU, "") });
      AppMethodBeat.o(42015);
      continue;
      if (paramInt == 2)
      {
        str = getContext().getString(2131301076, new Object[] { e.F(this.nSu), bo.bc(this.nSs.nRU, "") });
        AppMethodBeat.o(42015);
      }
      else
      {
        str = null;
        AppMethodBeat.o(42015);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView
 * JD-Core Version:    0.6.2
 */