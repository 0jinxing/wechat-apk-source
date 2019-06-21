package com.tencent.mm.ui.contact;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;

final class ModRemarkNameUI$c extends ClickableSpan
{
  public String hHV;

  public ModRemarkNameUI$c(ModRemarkNameUI paramModRemarkNameUI, String paramString)
  {
    this.hHV = paramString;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33750);
    ModRemarkNameUI.a(this.znY).setText(j.b(this.znY, ah.nullAsNil(this.hHV), ModRemarkNameUI.a(this.znY).getTextSize()));
    ModRemarkNameUI.a(this.znY).setSelection(ModRemarkNameUI.a(this.znY).getText().length());
    ModRemarkNameUI.l(this.znY).setVisibility(8);
    AppMethodBeat.o(33750);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(33751);
    paramTextPaint.setColor(this.znY.getResources().getColor(2131689769));
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(33751);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ModRemarkNameUI.c
 * JD-Core Version:    0.6.2
 */