package com.tencent.mm.view;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;

final class SmileyGrid$9
  implements AdapterView.OnItemClickListener
{
  SmileyGrid$9(SmileyGrid paramSmileyGrid)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(62906);
    paramAdapterView = paramAdapterView.getAdapter().getItem(paramInt);
    if ((paramAdapterView instanceof f))
    {
      paramInt = ((f)paramAdapterView).position;
      paramAdapterView = com.tencent.mm.cb.e.dqK().qL(paramInt);
      ((d)g.M(d.class)).getProvider().bZ(paramAdapterView, paramInt);
      if (SmileyGrid.d(this.Aaf) != null)
        if (!SmileyGrid.f(this.Aaf))
          break label150;
    }
    label150: for (paramAdapterView = com.tencent.mm.cb.e.dqK().qK(paramInt); ; paramAdapterView = com.tencent.mm.cb.e.dqK().getText(paramInt))
    {
      SmileyGrid.d(this.Aaf).append(paramAdapterView);
      h.pYm.e(13470, new Object[] { paramAdapterView.replaceAll(",", " "), Integer.valueOf(SmileyGrid.b(this.Aaf)), Integer.valueOf(1) });
      AppMethodBeat.o(62906);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyGrid.9
 * JD-Core Version:    0.6.2
 */