package com.tencent.mm.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMPinProgressBtn$1
  implements Runnable
{
  MMPinProgressBtn$1(MMPinProgressBtn paramMMPinProgressBtn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107898);
    if (this.zMC.getVisibility() != 0)
    {
      ab.i("MicroMsg.MMPinProgressBtn", "cur progress bar not visiable, stop auto pregress");
      AppMethodBeat.o(107898);
    }
    while (true)
    {
      return;
      MMPinProgressBtn.a(this.zMC, MMPinProgressBtn.a(this.zMC) + 1);
      if (MMPinProgressBtn.a(this.zMC) >= MMPinProgressBtn.b(this.zMC))
      {
        MMPinProgressBtn.a(this.zMC, MMPinProgressBtn.a(this.zMC) - 1);
        ab.i("MicroMsg.MMPinProgressBtn", "match auto progress max, return");
        AppMethodBeat.o(107898);
      }
      else
      {
        this.zMC.invalidate();
        this.zMC.postDelayed(MMPinProgressBtn.c(this.zMC), 200L);
        AppMethodBeat.o(107898);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMPinProgressBtn.1
 * JD-Core Version:    0.6.2
 */