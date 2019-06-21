package com.tencent.mm.ui.widget.b;

import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import java.util.Iterator;
import java.util.List;

final class a$1
  implements AdapterView.OnItemLongClickListener
{
  a$1(a parama, View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112755);
    a.a(this.zSe).clear();
    ai.v("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView long click", new Object[0]);
    paramAdapterView = new AdapterView.AdapterContextMenuInfo(paramView, paramInt, paramLong);
    this.zSd.onCreateContextMenu(a.a(this.zSe), paramView, paramAdapterView);
    paramView = a.a(this.zSe).yvT.iterator();
    while (paramView.hasNext())
      ((m)paramView.next()).yvW = paramAdapterView;
    this.zSe.dn(0, 0);
    AppMethodBeat.o(112755);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.a.1
 * JD-Core Version:    0.6.2
 */