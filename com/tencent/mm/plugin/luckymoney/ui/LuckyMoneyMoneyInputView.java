package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.b.a;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.luckymoney.model.j;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.TenpaySecureEditText;

public class LuckyMoneyMoneyInputView extends LinearLayout
  implements c
{
  private TextWatcher arx;
  private TextView iDT;
  public int mType;
  private ImageView nSO;
  private TenpaySecureEditText nSo;
  private TextView nSp;
  private g nSr;
  private i nSs;
  private double nSt;
  private double nSu;

  public LuckyMoneyMoneyInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(42741);
    this.arx = new LuckyMoneyMoneyInputView.1(this);
    a.bKN();
    this.nSs = a.bKO().bLu();
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(2130969984, this, true);
    this.nSo = ((TenpaySecureEditText)paramAttributeSet.findViewById(2131825536));
    this.nSo.setTypeface(e.aA(paramContext, 3));
    this.nSo.addTextChangedListener(this.arx);
    this.iDT = ((TextView)paramAttributeSet.findViewById(2131825535));
    this.nSO = ((ImageView)paramAttributeSet.findViewById(2131825534));
    this.nSp = ((TextView)paramAttributeSet.findViewById(2131825537));
    AppMethodBeat.o(42741);
  }

  private boolean bMA()
  {
    AppMethodBeat.i(42752);
    boolean bool;
    if ((this.nSs != null) && (!bo.isNullOrNil(this.nSs.nWL)))
    {
      bool = true;
      AppMethodBeat.o(42752);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(42752);
    }
  }

  public final int bKW()
  {
    int i = 0;
    AppMethodBeat.i(42748);
    if (bo.isNullOrNil(this.nSo.getText().toString()))
      AppMethodBeat.o(42748);
    while (true)
    {
      return i;
      double d = bo.getDouble(this.nSo.getText().toString(), -1.0D);
      if (d < 0.0D)
      {
        i = 3;
        AppMethodBeat.o(42748);
      }
      else if ((d > this.nSt) && (this.nSt > 0.0D))
      {
        i = 1;
        AppMethodBeat.o(42748);
      }
      else if ((d < this.nSu) && (d > 0.0D))
      {
        i = 2;
        AppMethodBeat.o(42748);
      }
      else
      {
        AppMethodBeat.o(42748);
      }
    }
  }

  public double getInput()
  {
    AppMethodBeat.i(42742);
    double d = bo.getDouble(this.nSo.getText().toString(), 0.0D);
    AppMethodBeat.o(42742);
    return d;
  }

  public int getInputViewId()
  {
    AppMethodBeat.i(42751);
    int i = getId();
    AppMethodBeat.o(42751);
    return i;
  }

  public final void onError()
  {
    AppMethodBeat.i(42750);
    this.iDT.setTextColor(x.eq(getContext()));
    this.nSo.setTextColor(x.eq(getContext()));
    this.nSp.setTextColor(x.eq(getContext()));
    AppMethodBeat.o(42750);
  }

  public final void restore()
  {
    AppMethodBeat.i(42749);
    this.iDT.setTextColor(-16777216);
    this.nSo.setTextColor(-16777216);
    this.nSp.setTextColor(-16777216);
    AppMethodBeat.o(42749);
  }

  public void setAmount(String paramString)
  {
    AppMethodBeat.i(42747);
    this.nSo.setText(paramString);
    AppMethodBeat.o(42747);
  }

  public void setGroupIconIv(int paramInt)
  {
    AppMethodBeat.i(42745);
    this.nSO.setImageResource(paramInt);
    AppMethodBeat.o(42745);
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(42740);
    this.nSo.setHint(paramString);
    AppMethodBeat.o(42740);
  }

  public void setMaxAmount(double paramDouble)
  {
    this.nSt = paramDouble;
  }

  public void setMaxLen(int paramInt)
  {
    AppMethodBeat.i(42746);
    this.nSo.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
    AppMethodBeat.o(42746);
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
    AppMethodBeat.i(42744);
    if (paramBoolean)
    {
      this.nSO.setVisibility(0);
      AppMethodBeat.o(42744);
    }
    while (true)
    {
      return;
      this.nSO.setVisibility(8);
      AppMethodBeat.o(42744);
    }
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(42743);
    this.iDT.setText(paramString);
    AppMethodBeat.o(42743);
  }

  public void setType(int paramInt)
  {
    this.mType = paramInt;
  }

  public final String xH(int paramInt)
  {
    AppMethodBeat.i(42753);
    a.bKN();
    this.nSs = a.bKO().bLu();
    String str;
    if (paramInt == 1)
      if (this.mType == 1)
      {
        str = getContext().getString(2131301210, new Object[] { Math.round(this.nSt), bo.bc(this.nSs.nRU, "") });
        AppMethodBeat.o(42753);
      }
    while (true)
    {
      return str;
      if (bMA())
      {
        str = getContext().getString(2131301075, new Object[] { this.nSs.nWL, Math.round(this.nSt), bo.bc(this.nSs.nRU, "") });
        AppMethodBeat.o(42753);
      }
      else
      {
        str = getContext().getString(2131301074, new Object[] { Math.round(this.nSt), bo.bc(this.nSs.nRU, "") });
        AppMethodBeat.o(42753);
        continue;
        if (paramInt == 2)
        {
          if (bMA())
          {
            str = getContext().getString(2131301077, new Object[] { this.nSs.nWL, e.F(this.nSu), bo.bc(this.nSs.nRU, "") });
            AppMethodBeat.o(42753);
          }
          else
          {
            str = getContext().getString(2131301076, new Object[] { e.F(this.nSu), bo.bc(this.nSs.nRU, "") });
            AppMethodBeat.o(42753);
          }
        }
        else
        {
          str = null;
          AppMethodBeat.o(42753);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView
 * JD-Core Version:    0.6.2
 */