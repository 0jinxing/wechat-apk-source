package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18739);
    if (a.a(this.kxk).contains(Integer.valueOf(this.sN)))
      a.a(this.kxk).remove(Integer.valueOf(this.sN));
    while (true)
    {
      this.kxk.notifyDataSetChanged();
      a.b(this.kxk).a(a.a(this.kxk));
      AppMethodBeat.o(18739);
      return;
      a.a(this.kxk).add(Integer.valueOf(this.sN));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.a.1
 * JD-Core Version:    0.6.2
 */