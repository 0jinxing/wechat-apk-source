package com.tencent.mm.plugin.account.ui;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class RegByMobileRegAIOUI$21 extends ClickableSpan
{
  RegByMobileRegAIOUI$21(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125364);
    bo.M(this.gGd.mController.ylL, this.gGd.getString(2131304194));
    AppMethodBeat.o(125364);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(125365);
    paramTextPaint.setColor(this.gGd.getResources().getColor(2131690208));
    paramTextPaint.setUnderlineText(true);
    AppMethodBeat.o(125365);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.21
 * JD-Core Version:    0.6.2
 */