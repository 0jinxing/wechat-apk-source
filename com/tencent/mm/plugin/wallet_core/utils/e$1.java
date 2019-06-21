package com.tencent.mm.plugin.wallet_core.utils;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.protocal.protobuf.btr;

final class e$1
  implements o.a
{
  e$1(e.a parama, btr parambtr, Context paramContext)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(48016);
    if (this.tPm != null)
    {
      e.a(this.val$context, this.tPn);
      this.tPm.a(this.tPn);
      AppMethodBeat.o(48016);
    }
    while (true)
    {
      return;
      e.a(this.val$context, this.tPn);
      AppMethodBeat.o(48016);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.e.1
 * JD-Core Version:    0.6.2
 */