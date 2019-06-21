package com.tencent.magicbrush;

import com.tencent.magicbrush.c.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MBRuntime$3
  implements Runnable
{
  MBRuntime$3(MBRuntime paramMBRuntime)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115789);
    if (this.bSn.mNativeInst == 0L)
      AppMethodBeat.o(115789);
    while (true)
    {
      return;
      if (MBRuntime.access$300(this.bSn).enable_request_animation_frame)
        MBRuntime.access$400(this.bSn).pause();
      MBRuntime.access$500(this.bSn, this.bSn.mNativeInst);
      AppMethodBeat.o(115789);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.MBRuntime.3
 * JD-Core Version:    0.6.2
 */