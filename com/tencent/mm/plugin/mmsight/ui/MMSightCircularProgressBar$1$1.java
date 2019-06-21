package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMSightCircularProgressBar$1$1
  implements Runnable
{
  MMSightCircularProgressBar$1$1(MMSightCircularProgressBar.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55079);
    if (MMSightCircularProgressBar.a(this.oAP.oAO) != null)
      MMSightCircularProgressBar.a(this.oAP.oAO).bnW();
    AppMethodBeat.o(55079);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar.1.1
 * JD-Core Version:    0.6.2
 */