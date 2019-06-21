package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

final class CleanChattingUI$4
  implements View.OnClickListener
{
  CleanChattingUI$4(CleanChattingUI paramCleanChattingUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18782);
    paramView = CleanChattingUI.a(this.kxM);
    if (paramView.jur.size() == paramView.getCount())
      paramView.jur.clear();
    while (true)
    {
      paramView.notifyDataSetChanged();
      paramView.kxj.a(paramView.jur);
      AppMethodBeat.o(18782);
      return;
      for (int i = 0; i < paramView.getCount(); i++)
        paramView.jur.add(Integer.valueOf(i));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI.4
 * JD-Core Version:    0.6.2
 */