package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class MallProductUI$3
  implements AdapterView.OnItemClickListener
{
  MallProductUI$3(MallProductUI paramMallProductUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44159);
    b localb = (b)paramView.getTag();
    switch (localb.type)
    {
    default:
    case 2:
    }
    while (true)
    {
      MallProductUI.f(this.pke).a(this.pke, paramView, paramInt);
      AppMethodBeat.o(44159);
      return;
      Object localObject = this.pke.piK.pgO;
      if ((((m)localObject).phs.phG != null) && (((m)localObject).phs.phG.size() > 0))
      {
        paramAdapterView = new ArrayList();
        localObject = ((m)localObject).phs.phG.iterator();
        while (((Iterator)localObject).hasNext())
          paramAdapterView.add((String)((Iterator)localObject).next());
        localb.pis = paramAdapterView;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.3
 * JD-Core Version:    0.6.2
 */