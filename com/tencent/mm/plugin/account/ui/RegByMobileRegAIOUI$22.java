package com.tencent.mm.plugin.account.ui;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class RegByMobileRegAIOUI$22 extends ClickableSpan
{
  RegByMobileRegAIOUI$22(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125366);
    bo.M(this.gGd.mController.ylL, this.gGd.getString(2131305909, new Object[] { aa.dor(), aa.doq(), "reg", Integer.valueOf(1), Integer.valueOf(0) }));
    AppMethodBeat.o(125366);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(125367);
    paramTextPaint.setColor(this.gGd.getResources().getColor(2131690208));
    paramTextPaint.setUnderlineText(true);
    AppMethodBeat.o(125367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.22
 * JD-Core Version:    0.6.2
 */