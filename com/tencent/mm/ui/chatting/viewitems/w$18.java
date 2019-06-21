package com.tencent.mm.ui.chatting.viewitems;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.widget.a.d;
import java.util.Map;

final class w$18
  implements View.OnClickListener
{
  w$18(w paramw, Map paramMap, boolean paramBoolean, bd parambd, bi parambi)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33150);
    String str = bo.nullAsNil((String)this.opJ.get(".msg.fromusername"));
    paramView = new d(w.b(this.zeW).yTx.getContext(), 1, true);
    if (this.zfm)
      paramView.q(w.b(this.zeW).yTx.getMMResources().getString(2131301853), 3);
    while (true)
    {
      paramView.rBl = new w.18.1(this);
      paramView.rBm = new w.18.2(this, str);
      paramView.cpD();
      AppMethodBeat.o(33150);
      return;
      paramView.q(w.b(this.zeW).yTx.getMMResources().getString(2131301837), 3);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.18
 * JD-Core Version:    0.6.2
 */