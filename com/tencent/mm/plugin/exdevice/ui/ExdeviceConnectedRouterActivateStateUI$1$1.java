package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceConnectedRouterActivateStateUI$1$1
  implements Runnable
{
  ExdeviceConnectedRouterActivateStateUI$1$1(ExdeviceConnectedRouterActivateStateUI.1 param1, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19917);
    if ((this.crd == 0) && ((this.crc == 0) || (this.crc == 4)))
    {
      this.lAA.lAz.uQ(2);
      AppMethodBeat.o(19917);
    }
    while (true)
    {
      return;
      if (this.crc == 4)
      {
        if (this.crd == 90000)
        {
          this.lAA.lAz.uQ(3);
          AppMethodBeat.o(19917);
        }
        else
        {
          this.lAA.lAz.uQ(5);
          AppMethodBeat.o(19917);
        }
      }
      else
      {
        this.lAA.lAz.uQ(4);
        AppMethodBeat.o(19917);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI.1.1
 * JD-Core Version:    0.6.2
 */