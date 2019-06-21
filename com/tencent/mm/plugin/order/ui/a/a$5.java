package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;
import java.util.List;

final class a$5
  implements View.OnClickListener
{
  a$5(a parama, MallTransactionObject paramMallTransactionObject, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43890);
    paramView = new LinkedList();
    LinkedList localLinkedList = new LinkedList();
    if (!bo.isNullOrNil(this.pbT.pcm))
    {
      localLinkedList.add(Integer.valueOf(0));
      paramView.add(this.val$context.getString(2131305078));
    }
    if (!bo.isNullOrNil(this.pbT.pbP))
    {
      localLinkedList.add(Integer.valueOf(1));
      paramView.add(this.val$context.getString(2131305079));
    }
    if (!bo.isNullOrNil(this.pbT.pcv))
    {
      localLinkedList.add(Integer.valueOf(2));
      paramView.add(this.val$context.getString(2131305081));
    }
    if (localLinkedList.size() == 1)
    {
      com.tencent.mm.plugin.order.model.a.a(((Integer)localLinkedList.get(0)).intValue(), this.val$context, this.pbT);
      AppMethodBeat.o(43890);
    }
    while (true)
    {
      return;
      h.a(this.val$context, null, paramView, localLinkedList, null, true, new a.5.1(this));
      AppMethodBeat.o(43890);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.a.5
 * JD-Core Version:    0.6.2
 */