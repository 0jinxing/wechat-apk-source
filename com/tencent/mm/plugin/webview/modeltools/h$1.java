package com.tencent.mm.plugin.webview.modeltools;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.ui.widget.MMWebView;

final class h$1
  implements ak.a
{
  h$1(h paramh)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(7007);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(7007);
      return false;
      paramMessage = this.upu.upq.getBitmap();
      if (paramMessage != null)
      {
        d.post(new h.b(this.upu, paramMessage), "ViewCaptureHelper_SaveBitmap");
        this.upu.upq = null;
        continue;
        if (this.upu.ups != null)
          this.upu.ups.BY(this.upu.upr);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.h.1
 * JD-Core Version:    0.6.2
 */