package com.tencent.mm.plugin.clean.ui.newui;

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
    AppMethodBeat.i(18840);
    if (a.a(this.kyG).contains(Integer.valueOf(this.sN)))
      a.a(this.kyG).remove(Integer.valueOf(this.sN));
    while (true)
    {
      this.kyG.notifyDataSetChanged();
      a.b(this.kyG).a(a.a(this.kyG));
      AppMethodBeat.o(18840);
      return;
      a.a(this.kyG).add(Integer.valueOf(this.sN));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.a.1
 * JD-Core Version:    0.6.2
 */