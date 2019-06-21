package com.tencent.mm.plugin.card.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class n$1
  implements View.OnClickListener
{
  n$1(n paramn, ViewGroup paramViewGroup)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88762);
    paramView = (Button)this.kqT.findViewById(2131821968);
    View localView = this.kqT.findViewById(2131821964);
    if ((paramView.getVisibility() == 0) && (localView.getVisibility() == 0))
      AppMethodBeat.o(88762);
    while (true)
    {
      return;
      if (localView.getVisibility() == 0)
      {
        if (!l.isNetworkAvailable(this.kqU.jiE.mController.ylL))
        {
          d.a(this.kqU.jiE, this.kqU.jiE.getString(2131297846), false);
          AppMethodBeat.o(88762);
        }
        else
        {
          localView.setVisibility(8);
          this.kqT.findViewById(2131821963).setVisibility(0);
        }
      }
      else
      {
        this.kqU.kqH.d(c.krE);
        AppMethodBeat.o(88762);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.n.1
 * JD-Core Version:    0.6.2
 */