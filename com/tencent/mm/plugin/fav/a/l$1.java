package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class l$1
  implements Runnable
{
  l$1(l paraml, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102669);
    String str = bo.cd(this.mfq);
    g.RP().Ry().set(225283, str);
    AppMethodBeat.o(102669);
  }

  public final String toString()
  {
    AppMethodBeat.i(102670);
    String str = super.toString() + "|save";
    AppMethodBeat.o(102670);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.l.1
 * JD-Core Version:    0.6.2
 */