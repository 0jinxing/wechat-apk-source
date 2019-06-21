package com.tencent.mm.plugin.fts.ui;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;

final class FTSChattingConvUI$a extends RecyclerView.a<FTSChattingConvUI.b>
{
  String[] mIC;

  FTSChattingConvUI$a(FTSChattingConvUI paramFTSChattingConvUI)
  {
    AppMethodBeat.i(61793);
    if (!t.mN(FTSChattingConvUI.a(paramFTSChattingConvUI)))
    {
      this.mIC = new String[7];
      this.mIC[0] = paramFTSChattingConvUI.getResources().getString(2131302806);
      this.mIC[1] = paramFTSChattingConvUI.getResources().getString(2131302808);
      this.mIC[2] = paramFTSChattingConvUI.getResources().getString(2131302807);
      this.mIC[3] = paramFTSChattingConvUI.getResources().getString(2131302812);
      this.mIC[4] = paramFTSChattingConvUI.getResources().getString(2131302810);
      this.mIC[5] = paramFTSChattingConvUI.getResources().getString(2131302811);
      this.mIC[6] = paramFTSChattingConvUI.getResources().getString(2131302805);
      AppMethodBeat.o(61793);
    }
    while (true)
    {
      return;
      this.mIC = new String[8];
      this.mIC[0] = paramFTSChattingConvUI.getResources().getString(2131302809);
      this.mIC[1] = paramFTSChattingConvUI.getResources().getString(2131302806);
      this.mIC[2] = paramFTSChattingConvUI.getResources().getString(2131302808);
      this.mIC[3] = paramFTSChattingConvUI.getResources().getString(2131302807);
      this.mIC[4] = paramFTSChattingConvUI.getResources().getString(2131302812);
      this.mIC[5] = paramFTSChattingConvUI.getResources().getString(2131302810);
      this.mIC[6] = paramFTSChattingConvUI.getResources().getString(2131302811);
      this.mIC[7] = paramFTSChattingConvUI.getResources().getString(2131302805);
      AppMethodBeat.o(61793);
    }
  }

  public final int getItemCount()
  {
    return this.mIC.length;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSChattingConvUI.a
 * JD-Core Version:    0.6.2
 */