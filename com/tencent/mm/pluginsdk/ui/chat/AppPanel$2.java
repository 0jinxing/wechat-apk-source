package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.MMFlipper.b;

final class AppPanel$2
  implements MMFlipper.b
{
  AppPanel$2(AppPanel paramAppPanel)
  {
  }

  public final void BZ(int paramInt)
  {
    AppMethodBeat.i(27742);
    AppPanel.e(this.vmj).setSelectedDot(paramInt);
    AppMethodBeat.o(27742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppPanel.2
 * JD-Core Version:    0.6.2
 */