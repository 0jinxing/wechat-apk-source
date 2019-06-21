package com.tencent.mm.plugin.backup.backupmoveui;

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
    AppMethodBeat.i(17318);
    if (a.a(this.jut).contains(Integer.valueOf(this.sN)))
      a.a(this.jut).remove(Integer.valueOf(this.sN));
    while (true)
    {
      this.jut.notifyDataSetChanged();
      a.b(this.jut).a(a.a(this.jut));
      AppMethodBeat.o(17318);
      return;
      a.a(this.jut).add(Integer.valueOf(this.sN));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.a.1
 * JD-Core Version:    0.6.2
 */