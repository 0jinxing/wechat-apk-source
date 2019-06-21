package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class t$1
  implements View.OnClickListener
{
  t$1(t paramt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30735);
    new Intent().putExtra("composeType", 1);
    d.H(this.yKf.mContext, "qqmail", ".ui.ComposeUI");
    AppMethodBeat.o(30735);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.t.1
 * JD-Core Version:    0.6.2
 */