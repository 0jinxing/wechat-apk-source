package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.b.a;
import com.tencent.mm.plugin.luckymoney.model.i;
import com.tencent.mm.plugin.luckymoney.model.j;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.sdk.platformtools.bo;
import com.tenpay.android.wechat.TenpaySecureEditText;

public class LuckyMoneyNumInputView extends LinearLayout
  implements c
{
  private TextWatcher arx;
  private TextView iDT;
  private int mNum;
  private g nSr;
  private i nSs;
  private TenpaySecureEditText ogB;
  private TextView ogC;
  private int ogD;
  private int ogE;

  public LuckyMoneyNumInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(42883);
    this.mNum = 1;
    this.ogD = 2147483647;
    this.ogE = 1;
    this.arx = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        AppMethodBeat.i(42881);
        if (LuckyMoneyNumInputView.a(LuckyMoneyNumInputView.this) != null)
        {
          paramAnonymousEditable = LuckyMoneyNumInputView.a(LuckyMoneyNumInputView.this);
          LuckyMoneyNumInputView.this.getInputViewId();
          paramAnonymousEditable.bLa();
        }
        AppMethodBeat.o(42881);
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }
    };
    paramContext = LayoutInflater.from(paramContext).inflate(2130969991, this, true);
    this.iDT = ((TextView)paramContext.findViewById(2131825597));
    this.ogB = ((TenpaySecureEditText)paramContext.findViewById(2131825536));
    this.ogC = ((TextView)paramContext.findViewById(2131825598));
    this.ogB.setText(this.mNum);
    this.ogB.addTextChangedListener(this.arx);
    AppMethodBeat.o(42883);
  }

  private boolean bMA()
  {
    AppMethodBeat.i(42891);
    boolean bool;
    if ((this.nSs != null) && (!bo.isNullOrNil(this.nSs.nWL)))
    {
      bool = true;
      AppMethodBeat.o(42891);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(42891);
    }
  }

  public final int bKW()
  {
    int i = 0;
    AppMethodBeat.i(42887);
    if (bo.isNullOrNil(this.ogB.getText().toString()))
      AppMethodBeat.o(42887);
    while (true)
    {
      return i;
      int j = bo.getInt(this.ogB.getText().toString(), -1);
      if (j < 0)
      {
        i = 3;
        AppMethodBeat.o(42887);
      }
      else if ((j > this.ogD) && (this.ogD > 0))
      {
        i = 1;
        AppMethodBeat.o(42887);
      }
      else if ((j < this.ogE) && (this.ogE > 0))
      {
        i = 2;
        AppMethodBeat.o(42887);
      }
      else
      {
        AppMethodBeat.o(42887);
      }
    }
  }

  public int getInput()
  {
    AppMethodBeat.i(42885);
    try
    {
      i = Integer.parseInt(this.ogB.getText().toString(), 10);
      AppMethodBeat.o(42885);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i = 0;
        AppMethodBeat.o(42885);
      }
    }
  }

  public int getInputViewId()
  {
    AppMethodBeat.i(42890);
    int i = getId();
    AppMethodBeat.o(42890);
    return i;
  }

  public final void onError()
  {
    AppMethodBeat.i(42889);
    this.iDT.setTextColor(x.eq(getContext()));
    this.ogB.setTextColor(x.eq(getContext()));
    this.ogC.setTextColor(x.eq(getContext()));
    AppMethodBeat.o(42889);
  }

  public final void restore()
  {
    AppMethodBeat.i(42888);
    this.iDT.setTextColor(-16777216);
    this.ogB.setTextColor(-16777216);
    this.ogC.setTextColor(-16777216);
    AppMethodBeat.o(42888);
  }

  public void setHint(String paramString)
  {
    AppMethodBeat.i(42882);
    this.ogB.setHint(paramString);
    AppMethodBeat.o(42882);
  }

  public void setMaxNum(int paramInt)
  {
    int i = 3;
    AppMethodBeat.i(42884);
    this.ogD = paramInt;
    int j = 0;
    int k = paramInt;
    paramInt = j;
    while (k > 0)
    {
      paramInt++;
      k /= 10;
    }
    if (paramInt <= 3)
      paramInt = i;
    while (true)
    {
      this.ogB.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
      AppMethodBeat.o(42884);
      return;
    }
  }

  public void setMinNum(int paramInt)
  {
    this.ogE = paramInt;
  }

  public void setNum(String paramString)
  {
    AppMethodBeat.i(42886);
    this.ogB.setText(paramString);
    this.ogB.setSelection(this.ogB.getText().length());
    this.mNum = bo.getInt(paramString, 0);
    AppMethodBeat.o(42886);
  }

  public void setOnInputValidChangerListener(g paramg)
  {
    this.nSr = paramg;
  }

  public final String xH(int paramInt)
  {
    AppMethodBeat.i(42892);
    a.bKN();
    this.nSs = a.bKO().bLu();
    String str;
    if (paramInt == 1)
      if (bMA())
      {
        str = getContext().getString(2131301154, new Object[] { Integer.valueOf(this.ogD), this.nSs.nWL });
        AppMethodBeat.o(42892);
      }
    while (true)
    {
      return str;
      str = getContext().getString(2131301153, new Object[] { Integer.valueOf(this.ogD) });
      AppMethodBeat.o(42892);
      continue;
      if (paramInt == 2)
      {
        if (bMA())
        {
          str = getContext().getString(2131301152, new Object[] { Integer.valueOf(this.ogE), this.nSs.nWL });
          AppMethodBeat.o(42892);
        }
        else
        {
          str = getContext().getString(2131301151, new Object[] { Integer.valueOf(this.ogE) });
          AppMethodBeat.o(42892);
        }
      }
      else
      {
        str = null;
        AppMethodBeat.o(42892);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView
 * JD-Core Version:    0.6.2
 */