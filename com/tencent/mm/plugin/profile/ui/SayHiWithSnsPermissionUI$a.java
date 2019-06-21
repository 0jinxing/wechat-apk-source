package com.tencent.mm.plugin.profile.ui;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;

final class SayHiWithSnsPermissionUI$a extends ClickableSpan
{
  public String hHV;

  public SayHiWithSnsPermissionUI$a(SayHiWithSnsPermissionUI paramSayHiWithSnsPermissionUI, String paramString)
  {
    this.hHV = paramString;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23777);
    SayHiWithSnsPermissionUI.b(this.ppC).setText(j.b(this.ppC, bo.nullAsNil(this.hHV), SayHiWithSnsPermissionUI.b(this.ppC).getTextSize()));
    SayHiWithSnsPermissionUI.b(this.ppC).setSelection(SayHiWithSnsPermissionUI.b(this.ppC).getText().length());
    SayHiWithSnsPermissionUI.m(this.ppC).setVisibility(8);
    SayHiWithSnsPermissionUI.l(this.ppC)[4] = 1;
    AppMethodBeat.o(23777);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(23778);
    paramTextPaint.setColor(this.ppC.getResources().getColor(2131689769));
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(23778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.a
 * JD-Core Version:    0.6.2
 */