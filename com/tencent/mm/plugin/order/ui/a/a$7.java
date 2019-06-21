package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.HelpCenter;
import com.tencent.mm.plugin.order.model.MallTransactionObject;

final class a$7
  implements View.OnClickListener
{
  a$7(a parama, Context paramContext, MallTransactionObject paramMallTransactionObject)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43892);
    if (paramView.getTag() == null)
      AppMethodBeat.o(43892);
    while (true)
    {
      return;
      if ((paramView.getTag() instanceof MallOrderDetailObject.HelpCenter))
      {
        paramView = (MallOrderDetailObject.HelpCenter)paramView.getTag();
        a.a(this.val$context, paramView.url, this.pbT);
      }
      AppMethodBeat.o(43892);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.a.7
 * JD-Core Version:    0.6.2
 */