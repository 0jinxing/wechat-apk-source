package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class MallProductSubmitUI$2
  implements AdapterView.OnItemClickListener
{
  MallProductSubmitUI$2(MallProductSubmitUI paramMallProductSubmitUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44140);
    b localb = (b)paramView.getTag();
    switch (localb.type)
    {
    default:
    case 2:
    case 1:
    }
    while (true)
    {
      MallProductSubmitUI.c(this.pjU).a(this.pjU, paramView, paramInt);
      AppMethodBeat.o(44140);
      return;
      Object localObject = MallProductSubmitUI.b(this.pjU).pgO;
      if ((((m)localObject).phs.phG != null) && (((m)localObject).phs.phG.size() > 0))
      {
        paramAdapterView = new ArrayList();
        localObject = ((m)localObject).phs.phG.iterator();
        while (((Iterator)localObject).hasNext())
          paramAdapterView.add((String)((Iterator)localObject).next());
        localb.pis = paramAdapterView;
        continue;
        if ((localb.pis instanceof String))
          MallProductSubmitUI.b(this.pjU).pgX = ((String)localb.pis);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSubmitUI.2
 * JD-Core Version:    0.6.2
 */