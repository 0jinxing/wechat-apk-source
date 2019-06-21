package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.al;

final class i$3
  implements Runnable
{
  i$3(aar paramaar, Context paramContext, String paramString, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74120);
    if (this.mjL.dataType == 15)
      i.a(this.val$context, this.cgl, this.mjL);
    while (true)
    {
      al.d(this.cfC);
      AppMethodBeat.o(74120);
      return;
      i.b(this.val$context, this.cgl, this.mjL);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(74121);
    String str = super.toString() + "|sendFavVideo";
    AppMethodBeat.o(74121);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.i.3
 * JD-Core Version:    0.6.2
 */