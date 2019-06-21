package com.tencent.mm.plugin.pwdgroup.ui.widget;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMCallBackScrollView$1 extends ak
{
  MMCallBackScrollView$1(MMCallBackScrollView paramMMCallBackScrollView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(24039);
    int i = this.prT.getScrollY();
    if (i == MMCallBackScrollView.a(this.prT))
    {
      MMCallBackScrollView.a(this.prT, 0);
      AppMethodBeat.o(24039);
    }
    while (true)
    {
      return;
      MMCallBackScrollView.b(this.prT, i);
      MMCallBackScrollView.b(this.prT).sendMessageDelayed(MMCallBackScrollView.b(this.prT).obtainMessage(), 5L);
      MMCallBackScrollView.a(this.prT, 1);
      AppMethodBeat.o(24039);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView.1
 * JD-Core Version:    0.6.2
 */