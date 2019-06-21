package com.tencent.mm.plugin.order.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends ClickableSpan
{
  private int eHE;
  private int mColor;
  private Context mContext;
  public a peT;

  public a(Context paramContext)
  {
    AppMethodBeat.i(43927);
    this.mContext = null;
    this.peT = null;
    this.mColor = -1;
    this.eHE = -1;
    this.mContext = paramContext;
    this.mColor = this.mContext.getResources().getColor(2131690261);
    this.eHE = -1;
    AppMethodBeat.o(43927);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43928);
    if (this.peT != null)
      this.peT.onClick(paramView);
    AppMethodBeat.o(43928);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(43929);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setFakeBoldText(true);
    paramTextPaint.setColor(this.mColor);
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.bgColor = this.eHE;
    AppMethodBeat.o(43929);
  }

  public static abstract interface a
  {
    public abstract void onClick(View paramView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.c.a
 * JD-Core Version:    0.6.2
 */