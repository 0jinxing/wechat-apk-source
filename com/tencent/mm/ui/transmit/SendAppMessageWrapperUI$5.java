package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class SendAppMessageWrapperUI$5
  implements q.a
{
  SendAppMessageWrapperUI$5(SendAppMessageWrapperUI paramSendAppMessageWrapperUI)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(35217);
    this.zKA.setResult(-1);
    this.zKA.finish();
    paramString = ReportUtil.c(this.zKA.getIntent().getExtras(), 0);
    ReportUtil.a(this.zKA, paramString, false);
    AppMethodBeat.o(35217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.5
 * JD-Core Version:    0.6.2
 */