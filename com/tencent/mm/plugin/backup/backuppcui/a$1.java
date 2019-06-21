package com.tencent.mm.plugin.backup.backuppcui;

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
    AppMethodBeat.i(17567);
    if (a.a(this.jwG).contains(Integer.valueOf(this.sN)))
      a.a(this.jwG).remove(Integer.valueOf(this.sN));
    while (true)
    {
      this.jwG.notifyDataSetChanged();
      a.b(this.jwG).a(a.a(this.jwG));
      AppMethodBeat.o(17567);
      return;
      a.a(this.jwG).add(Integer.valueOf(this.sN));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.a.1
 * JD-Core Version:    0.6.2
 */