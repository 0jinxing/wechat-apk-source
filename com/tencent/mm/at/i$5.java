package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class i$5
  implements ap.a
{
  i$5(i parami)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(78289);
    try
    {
      i.e(this.fEQ);
      AppMethodBeat.o(78289);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.ImgService", "exception:%s", new Object[] { bo.l(localException) });
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(78290);
    String str = super.toString() + "|scenePusher";
    AppMethodBeat.o(78290);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.i.5
 * JD-Core Version:    0.6.2
 */