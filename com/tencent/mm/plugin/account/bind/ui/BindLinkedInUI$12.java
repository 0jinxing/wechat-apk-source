package com.tencent.mm.plugin.account.bind.ui;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindLinkedInUI$12 extends ClickableSpan
{
  BindLinkedInUI$12(BindLinkedInUI paramBindLinkedInUI)
  {
  }

  public final void onClick(View paramView)
  {
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(13399);
    paramTextPaint.setColor(this.grc.getResources().getColor(2131690208));
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(13399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.12
 * JD-Core Version:    0.6.2
 */