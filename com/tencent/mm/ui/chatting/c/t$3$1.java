package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class t$3$1
  implements Runnable
{
  t$3$1(t.3 param3, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31476);
    if ((!bo.isNullOrNil(t.e(this.yQD.yQA))) && (!bo.isNullOrNil(this.cgF)) && (this.cgF.equals(t.e(this.yQD.yQA))))
      this.yQD.yQA.qr(false);
    AppMethodBeat.o(31476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.t.3.1
 * JD-Core Version:    0.6.2
 */