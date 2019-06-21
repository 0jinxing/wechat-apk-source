package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.bo;

final class a$1$1
  implements Runnable
{
  a$1$1(a.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(541);
    long l = bo.yz();
    a.m(this.lZw.lZv).connect(new a.1.1.1(this, l));
    AppMethodBeat.o(541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.1.1
 * JD-Core Version:    0.6.2
 */