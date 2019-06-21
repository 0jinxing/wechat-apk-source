package com.tencent.mm.plugin.exdevice.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.model.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ExdeviceBindDeviceUI$9 extends ClickableSpan
{
  ExdeviceBindDeviceUI$9(ExdeviceBindDeviceUI paramExdeviceBindDeviceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(19833);
    f.ao(this.lze.mController.ylL, "http://o2o.gtimg.com/mydevice/page/deviceHelp.html");
    AppMethodBeat.o(19833);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(19834);
    paramTextPaint.setColor(paramTextPaint.linkColor);
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(19834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.9
 * JD-Core Version:    0.6.2
 */