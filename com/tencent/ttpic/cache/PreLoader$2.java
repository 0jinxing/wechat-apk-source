package com.tencent.ttpic.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;

class PreLoader$2
  implements Runnable
{
  PreLoader$2(PreLoader paramPreLoader, int paramInt)
  {
  }

  public void run()
  {
    AppMethodBeat.i(81831);
    this.this$0.preloadNewImages(this.val$index);
    PreLoader.access$002(this.this$0, false);
    AppMethodBeat.o(81831);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.PreLoader.2
 * JD-Core Version:    0.6.2
 */