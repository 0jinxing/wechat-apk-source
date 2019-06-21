package com.tencent.mm.plugin.wallet_core.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$5
  implements View.OnClickListener
{
  a$5(LinearLayout paramLinearLayout1, LinearLayout paramLinearLayout2, TextView paramTextView1, TextView paramTextView2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47857);
    this.tNd.setVisibility(0);
    this.tNe.setVisibility(8);
    this.tNf.setText("");
    this.tNc.setText("");
    AppMethodBeat.o(47857);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.a.5
 * JD-Core Version:    0.6.2
 */