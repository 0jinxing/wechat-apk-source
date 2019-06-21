package com.tencent.mm.plugin.qqmail.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrsViewControl$2
  implements Runnable
{
  MailAddrsViewControl$2(MailAddrsViewControl paramMailAddrsViewControl, Button paramButton)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68339);
    this.pyH.invalidate();
    this.pyH.setOnTouchListener(new MailAddrsViewControl.2.1(this));
    this.pyG.cdj();
    this.pyG.invalidate();
    AppMethodBeat.o(68339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.2
 * JD-Core Version:    0.6.2
 */