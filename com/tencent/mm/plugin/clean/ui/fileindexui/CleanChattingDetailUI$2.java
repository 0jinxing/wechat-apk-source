package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashSet;

final class CleanChattingDetailUI$2
  implements View.OnClickListener
{
  CleanChattingDetailUI$2(CleanChattingDetailUI paramCleanChattingDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18767);
    paramView = CleanChattingDetailUI.a(this.kxE);
    if (paramView.jur.size() == paramView.iLD.size())
      paramView.jur.clear();
    while (true)
    {
      paramView.bgi();
      CleanChattingDetailUI.a(this.kxE).notifyDataSetChanged();
      AppMethodBeat.o(18767);
      return;
      for (int i = 0; i < paramView.iLD.size(); i++)
        paramView.jur.add(Integer.valueOf(i));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI.2
 * JD-Core Version:    0.6.2
 */