package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.ui.base.h;

final class a$3
  implements View.OnClickListener
{
  a$3(a parama, Context paramContext, MallTransactionObject paramMallTransactionObject)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43887);
    h.d(this.val$context, this.val$context.getString(2131302382), this.val$context.getString(2131297031), this.val$context.getString(2131302455), this.val$context.getString(2131296868), new a.3.1(this), new a.3.2(this));
    AppMethodBeat.o(43887);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.a.3
 * JD-Core Version:    0.6.2
 */