package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.al;

final class i$4
  implements Runnable
{
  i$4(String paramString, g paramg, aar paramaar, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74122);
    i.a(this.cgl, this.meE, this.mjL);
    al.d(this.cfC);
    AppMethodBeat.o(74122);
  }

  public final String toString()
  {
    AppMethodBeat.i(74123);
    String str = super.toString() + "|sendFavFile";
    AppMethodBeat.o(74123);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.i.4
 * JD-Core Version:    0.6.2
 */