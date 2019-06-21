package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;
import java.util.List;

final class SightSettingsUI$a$1
  implements View.OnClickListener
{
  SightSettingsUI$a$1(SightSettingsUI.a parama, SightSettingsUI.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55281);
    SightSettingsUI.b localb = this.oDr;
    LinkedList localLinkedList = new LinkedList();
    paramView = new LinkedList();
    for (int i = 0; i < localb.oDu.length; i++)
    {
      localLinkedList.add(localb.oDu[i]);
      paramView.add(Integer.valueOf(i));
    }
    h.a(localb.oDq, "", localLinkedList, paramView, "", new SightSettingsUI.b.1(localb));
    AppMethodBeat.o(55281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightSettingsUI.a.1
 * JD-Core Version:    0.6.2
 */