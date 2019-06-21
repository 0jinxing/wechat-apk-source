package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama, MallTransactionObject paramMallTransactionObject, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43884);
    if (!bo.isNullOrNil(this.pbT.pcm))
      e.ae(this.val$context, this.pbT.pcm);
    AppMethodBeat.o(43884);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.a.1
 * JD-Core Version:    0.6.2
 */