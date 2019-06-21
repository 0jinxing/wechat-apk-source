package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class MMVisiblePasswordEditText extends EditText
{
  public String jjo;
  final Drawable yyM;
  final Drawable yyN;
  private boolean yyO;

  public MMVisiblePasswordEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106955);
    this.jjo = "";
    this.yyM = getResources().getDrawable(2131231546);
    this.yyN = getResources().getDrawable(2131231547);
    this.yyO = false;
    dzF();
    AppMethodBeat.o(106955);
  }

  public MMVisiblePasswordEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106956);
    this.jjo = "";
    this.yyM = getResources().getDrawable(2131231546);
    this.yyN = getResources().getDrawable(2131231547);
    this.yyO = false;
    dzF();
    AppMethodBeat.o(106956);
  }

  private void dAl()
  {
    AppMethodBeat.i(106958);
    int i = getSelectionStart();
    int j = getSelectionEnd();
    if (this.yyO)
    {
      setInputType(1);
      dAm();
    }
    while (true)
    {
      setSelection(i, j);
      AppMethodBeat.o(106958);
      return;
      setInputType(129);
      dAn();
    }
  }

  private void dAm()
  {
    AppMethodBeat.i(106959);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.yyN, getCompoundDrawables()[3]);
    AppMethodBeat.o(106959);
  }

  private void dAn()
  {
    AppMethodBeat.i(106960);
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.yyM, getCompoundDrawables()[3]);
    AppMethodBeat.o(106960);
  }

  private void dzF()
  {
    AppMethodBeat.i(106957);
    this.yyM.setBounds(0, 0, this.yyM.getIntrinsicWidth(), this.yyM.getIntrinsicHeight());
    this.yyN.setBounds(0, 0, this.yyN.getIntrinsicWidth(), this.yyN.getIntrinsicHeight());
    ab.d("MicroMsg.MMVisiblePasswordEditText", "closeEye width %d height %d", new Object[] { Integer.valueOf(this.yyM.getIntrinsicWidth()), Integer.valueOf(this.yyM.getIntrinsicHeight()) });
    dAl();
    setHeight(this.yyM.getIntrinsicHeight() + getResources().getDimensionPixelSize(2131427815) * 5);
    setOnTouchListener(new MMVisiblePasswordEditText.1(this));
    AppMethodBeat.o(106957);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMVisiblePasswordEditText
 * JD-Core Version:    0.6.2
 */