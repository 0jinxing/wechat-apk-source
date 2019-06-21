package com.tencent.mm.ui.contact;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.ui.base.MMClearEditText;

final class ContactRemarkInfoModUI$c extends ClickableSpan
{
  public String hHV;

  public ContactRemarkInfoModUI$c(ContactRemarkInfoModUI paramContactRemarkInfoModUI, String paramString)
  {
    this.hHV = paramString;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33649);
    ContactRemarkInfoModUI.f(this.zmg);
    ContactRemarkInfoModUI.a(this.zmg, true, -1);
    ContactRemarkInfoModUI.g(this.zmg).setText(j.b(this.zmg, ah.nullAsNil(this.hHV), ContactRemarkInfoModUI.g(this.zmg).getTextSize()));
    ContactRemarkInfoModUI.g(this.zmg).setSelection(ContactRemarkInfoModUI.g(this.zmg).getText().length());
    ContactRemarkInfoModUI.x(this.zmg).setVisibility(8);
    AppMethodBeat.o(33649);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(33650);
    paramTextPaint.setColor(this.zmg.getResources().getColor(2131689769));
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(33650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.c
 * JD-Core Version:    0.6.2
 */