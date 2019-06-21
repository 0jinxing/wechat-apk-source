package com.tencent.mm.plugin.fts.ui;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FTSChattingConvUI$b extends RecyclerView.v
{
  TextView exj;

  public FTSChattingConvUI$b(FTSChattingConvUI paramFTSChattingConvUI, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(61796);
    this.exj = ((TextView)paramView.findViewById(2131820678));
    this.exj.setOnClickListener(paramFTSChattingConvUI);
    AppMethodBeat.o(61796);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSChattingConvUI.b
 * JD-Core Version:    0.6.2
 */