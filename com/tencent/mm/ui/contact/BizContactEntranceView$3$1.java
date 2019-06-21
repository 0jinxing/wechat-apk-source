package com.tencent.mm.ui.contact;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizContactEntranceView$3$1
  implements Runnable
{
  BizContactEntranceView$3$1(BizContactEntranceView.3 param3, long paramLong1, long paramLong2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33541);
    TextView localTextView = BizContactEntranceView.c(this.zlj.zlg);
    if ((BizContactEntranceView.b(this.zlj.zlg)) && (this.zlh > this.zli));
    for (int i = 0; ; i = 4)
    {
      localTextView.setVisibility(i);
      AppMethodBeat.o(33541);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.BizContactEntranceView.3.1
 * JD-Core Version:    0.6.2
 */