package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb, MallTransactionObject paramMallTransactionObject, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43895);
    if (!bo.isNullOrNil(this.pbT.pcm))
      e.ae(this.val$context, this.pbT.pcm);
    AppMethodBeat.o(43895);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.b.1
 * JD-Core Version:    0.6.2
 */