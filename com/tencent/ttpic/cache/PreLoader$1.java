package com.tencent.ttpic.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;

class PreLoader$1
  implements Runnable
{
  PreLoader$1(PreLoader paramPreLoader)
  {
  }

  public void run()
  {
    AppMethodBeat.i(81830);
    this.this$0.prepareImages();
    AppMethodBeat.o(81830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.PreLoader.1
 * JD-Core Version:    0.6.2
 */