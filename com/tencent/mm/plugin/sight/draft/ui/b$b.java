package com.tencent.mm.plugin.sight.draft.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.j;

final class b$b
  implements View.OnLongClickListener
{
  private b$b(b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(24999);
    if (!(paramView.getTag() instanceof b.e))
      AppMethodBeat.o(24999);
    while (true)
    {
      return true;
      paramView = (b.e)paramView.getTag();
      if (paramView.qzO == null)
      {
        AppMethodBeat.o(24999);
      }
      else if (-1 == paramView.qzO.field_fileStatus)
      {
        AppMethodBeat.o(24999);
      }
      else
      {
        this.qzH.a(b.d.qzJ, true);
        AppMethodBeat.o(24999);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.b.b
 * JD-Core Version:    0.6.2
 */