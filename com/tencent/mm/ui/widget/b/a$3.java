package com.tencent.mm.ui.widget.b;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMListPopupWindow;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.o;

final class a$3
  implements AdapterView.OnItemClickListener
{
  a$3(a parama)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112757);
    if (a.b(this.zSe) != null)
      a.b(this.zSe).onMMMenuItemSelected(a.a(this.zSe).getItem(paramInt), paramInt);
    if ((a.c(this.zSe) != null) && (a.c(this.zSe).gKG.isShowing()))
      a.c(this.zSe).dismiss();
    AppMethodBeat.o(112757);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.a.3
 * JD-Core Version:    0.6.2
 */