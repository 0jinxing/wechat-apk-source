package com.tencent.mm.plugin.account.ui;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class k$3 extends ClickableSpan
{
  k$3(k paramk, MobileInputUI paramMobileInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125116);
    bo.M(this.gDA.mController.ylL, this.gDA.getString(2131304189));
    AppMethodBeat.o(125116);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(125117);
    paramTextPaint.setColor(this.gDA.getResources().getColor(2131690208));
    paramTextPaint.setUnderlineText(true);
    AppMethodBeat.o(125117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.k.3
 * JD-Core Version:    0.6.2
 */