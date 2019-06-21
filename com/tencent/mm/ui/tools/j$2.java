package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.l;

final class j$2
  implements View.OnLongClickListener
{
  j$2(j paramj, View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(107702);
    ab.v("MicroMsg.MMSubMenuHelper", "registerForContextMenu normal view long click");
    j.a(this.zFW).clear();
    this.zFV.onCreateContextMenu(j.a(this.zFW), paramView, null);
    this.zFW.cuu();
    boolean bool;
    if (j.a(this.zFW).size() > 0)
    {
      bool = true;
      AppMethodBeat.o(107702);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107702);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.j.2
 * JD-Core Version:    0.6.2
 */