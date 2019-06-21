package com.tencent.mm.plugin.choosemsgfile.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.choosemsgfile.b.d.a;

final class ChooseMsgFileUI$3
  implements Runnable
{
  ChooseMsgFileUI$3(ChooseMsgFileUI paramChooseMsgFileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54446);
    Button localButton = ChooseMsgFileUI.k(this.kvQ);
    if (ChooseMsgFileUI.a(this.kvQ).getSelectCount() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      AppMethodBeat.o(54446);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.3
 * JD-Core Version:    0.6.2
 */