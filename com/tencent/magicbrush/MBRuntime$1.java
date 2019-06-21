package com.tencent.magicbrush;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MBRuntime$1
  implements Runnable
{
  MBRuntime$1(MBRuntime paramMBRuntime, long paramLong1, long paramLong2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115787);
    if (this.bSn.mNativeInst == 0L)
      AppMethodBeat.o(115787);
    while (true)
    {
      return;
      MBRuntime.access$100(this.bSn, this.bSn.mNativeInst, this.bSl, this.bSm);
      AppMethodBeat.o(115787);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.MBRuntime.1
 * JD-Core Version:    0.6.2
 */