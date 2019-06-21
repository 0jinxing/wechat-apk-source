package com.tencent.mm.ui.widget.b;

import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.base.l;

final class a$2
  implements View.OnLongClickListener
{
  a$2(a parama, View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(112756);
    ai.v("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view long click", new Object[0]);
    a.a(this.zSe).clear();
    a.a(this.zSe, paramView);
    this.zSd.onCreateContextMenu(a.a(this.zSe), paramView, null);
    if ((paramView.getTag(2131820679) instanceof int[]))
    {
      paramView = (int[])paramView.getTag(2131820679);
      if (paramView == null)
        this.zSe.dn(0, 0);
    }
    while (true)
    {
      AppMethodBeat.o(112756);
      return true;
      this.zSe.dn(paramView[0], paramView[1]);
      continue;
      this.zSe.dn(0, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.a.2
 * JD-Core Version:    0.6.2
 */