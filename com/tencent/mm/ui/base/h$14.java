package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$14
  implements View.OnClickListener
{
  h$14(LinearLayout paramLinearLayout, h.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(106418);
    for (int i = 0; i < this.qmm.getChildCount(); i++)
    {
      TextView localTextView = (TextView)this.qmm.getChildAt(i);
      if (localTextView.getId() != 2131823800)
        localTextView.setCompoundDrawablesWithIntrinsicBounds(2131231852, 0, 0, 0);
    }
    ((TextView)paramView).setCompoundDrawablesWithIntrinsicBounds(2131231853, 0, 0, 0);
    paramView.post(new h.14.1(this, ((Integer)paramView.getTag()).intValue()));
    AppMethodBeat.o(106418);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h.14
 * JD-Core Version:    0.6.2
 */