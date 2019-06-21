package com.tencent.mm.plugin.account.friend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.i;

final class FindMContactAddUI$8
  implements View.OnClickListener
{
  FindMContactAddUI$8(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108521);
    paramView = new StringBuilder();
    g.RN();
    paramView = paramView.append(com.tencent.mm.kernel.a.Rb()).append(",").append(this.gxb.getClass().getName()).append(",R300_300_AddAllButton,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R300_300_AddAllButton") + ",3");
    if (FindMContactAddUI.e(this.gxb) == 2)
    {
      FindMContactAddUI.c(this.gxb).dl(true);
      FindMContactAddUI.c(this.gxb).notifyDataSetChanged();
      FindMContactAddUI.f(this.gxb).setVisibility(8);
      if (FindMContactAddUI.g(this.gxb) == null)
        break label244;
      FindMContactAddUI.g(this.gxb).setVisibility(0);
      AppMethodBeat.o(108521);
    }
    while (true)
    {
      return;
      if (FindMContactAddUI.e(this.gxb) == 1)
      {
        FindMContactAddUI.c(this.gxb).dl(true);
        FindMContactAddUI.c(this.gxb).notifyDataSetChanged();
        FindMContactAddUI.i(this.gxb);
        AppMethodBeat.o(108521);
      }
      else
      {
        FindMContactAddUI.c(this.gxb).dl(true);
        FindMContactAddUI.c(this.gxb).notifyDataSetChanged();
        FindMContactAddUI.f(this.gxb).setVisibility(8);
        if (FindMContactAddUI.g(this.gxb) != null)
          FindMContactAddUI.g(this.gxb).setVisibility(0);
        label244: AppMethodBeat.o(108521);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI.8
 * JD-Core Version:    0.6.2
 */