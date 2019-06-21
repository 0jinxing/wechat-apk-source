package com.tencent.mm.plugin.account.friend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.i;

final class FindMContactAddUI$9
  implements View.OnClickListener
{
  FindMContactAddUI$9(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108522);
    FindMContactAddUI.f(this.gxb).setVisibility(0);
    FindMContactAddUI.g(this.gxb).setVisibility(8);
    FindMContactAddUI.c(this.gxb).dl(false);
    FindMContactAddUI.c(this.gxb).notifyDataSetChanged();
    AppMethodBeat.o(108522);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI.9
 * JD-Core Version:    0.6.2
 */