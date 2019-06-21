package com.tencent.mm.plugin.exdevice.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceBindDeviceUI$10 extends ClickableSpan
{
  ExdeviceBindDeviceUI$10(ExdeviceBindDeviceUI paramExdeviceBindDeviceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(19835);
    this.lze.finish();
    AppMethodBeat.o(19835);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(19836);
    paramTextPaint.setColor(paramTextPaint.linkColor);
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(19836);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.10
 * JD-Core Version:    0.6.2
 */