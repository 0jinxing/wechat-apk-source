package com.tencent.mm.plugin.luckymoney.appbrand.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.ui.g;
import com.tencent.mm.ui.widget.MMEditText;

public class WxaLuckyMoneyTextInputView extends LinearLayout
  implements com.tencent.mm.plugin.luckymoney.ui.c
{
  private TextView iDT;
  private g nSr;
  private MMEditText nTP;

  public WxaLuckyMoneyTextInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(42136);
    paramContext = LayoutInflater.from(paramContext).inflate(2130971247, this, true);
    this.nTP = ((MMEditText)paramContext.findViewById(2131825665));
    this.iDT = ((TextView)paramContext.findViewById(2131825664));
    this.nTP.setOnFocusChangeListener(new WxaLuckyMoneyTextInputView.1(this));
    paramContext = com.tencent.mm.ui.tools.b.c.d(this.nTP).hz(0, 24);
    paramContext.zIx = false;
    paramContext.a(null);
    AppMethodBeat.o(42136);
  }

  public final int bKW()
  {
    return 0;
  }

  public String getInput()
  {
    AppMethodBeat.i(42137);
    String str = this.nTP.getText().toString();
    AppMethodBeat.o(42137);
    return str;
  }

  public int getInputViewId()
  {
    AppMethodBeat.i(42140);
    int i = getId();
    AppMethodBeat.o(42140);
    return i;
  }

  public final void onError()
  {
  }

  public final void restore()
  {
  }

  public void setHintText(String paramString)
  {
    AppMethodBeat.i(42138);
    this.nTP.setHint(paramString);
    AppMethodBeat.o(42138);
  }

  public void setOnInputValidChangerListener(g paramg)
  {
    this.nSr = paramg;
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(42139);
    this.iDT.setText(paramString);
    AppMethodBeat.o(42139);
  }

  public final String xH(int paramInt)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.view.WxaLuckyMoneyTextInputView
 * JD-Core Version:    0.6.2
 */