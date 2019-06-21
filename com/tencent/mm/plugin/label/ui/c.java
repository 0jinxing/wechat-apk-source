package com.tencent.mm.plugin.label.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMTextView;

public final class c
{
  MMTextView nJb;
  TextView nJc;
  LinearLayout nJd;

  public c(View paramView)
  {
    AppMethodBeat.i(22701);
    this.nJb = ((MMTextView)paramView.findViewById(2131823062));
    this.nJc = ((TextView)paramView.findViewById(2131823063));
    this.nJd = ((LinearLayout)paramView.findViewById(2131823061));
    AppMethodBeat.o(22701);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.c
 * JD-Core Version:    0.6.2
 */