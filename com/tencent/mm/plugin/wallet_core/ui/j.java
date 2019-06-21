package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class j extends ClickableSpan
{
  private int eHE;
  public int mColor;
  private Context mContext;
  public j.a tHw;

  public j(Context paramContext)
  {
    AppMethodBeat.i(47362);
    this.mContext = null;
    this.tHw = null;
    this.mColor = -1;
    this.eHE = -1;
    this.mContext = paramContext;
    this.mColor = this.mContext.getResources().getColor(2131690631);
    this.eHE = this.mContext.getResources().getColor(2131690597);
    AppMethodBeat.o(47362);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(47363);
    if (this.tHw != null)
      this.tHw.onClick(paramView);
    AppMethodBeat.o(47363);
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(47364);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setFakeBoldText(false);
    paramTextPaint.setColor(this.mColor);
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.bgColor = this.eHE;
    AppMethodBeat.o(47364);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.j
 * JD-Core Version:    0.6.2
 */