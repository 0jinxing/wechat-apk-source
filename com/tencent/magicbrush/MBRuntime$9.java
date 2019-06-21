package com.tencent.magicbrush;

import com.tencent.magicbrush.handler.image.IMBImageHandler.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MBRuntime$9
  implements Runnable
{
  MBRuntime$9(MBRuntime paramMBRuntime, IMBImageHandler.a parama, String paramString, Object paramObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115795);
    if (this.bSn.mNativeInst == 0L)
    {
      this.bSs.ag(this.bSu);
      AppMethodBeat.o(115795);
    }
    while (true)
    {
      return;
      MBRuntime.access$1100(this.bSn, this.bSn.mNativeInst, this.bSt, this.bSu);
      AppMethodBeat.o(115795);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.MBRuntime.9
 * JD-Core Version:    0.6.2
 */