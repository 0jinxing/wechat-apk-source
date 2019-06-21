package com.tencent.mm.plugin.sight.draft.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.l;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.sdk.platformtools.ab;

final class b$c
  implements View.OnClickListener
{
  private b$c(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25000);
    if (!(paramView.getTag() instanceof b.e))
      AppMethodBeat.o(25000);
    while (true)
    {
      return;
      b.f(this.qzH).clw();
      paramView = (b.e)paramView.getTag();
      if (paramView.qzO == null)
      {
        ab.e("MicroMsg.SightDraftContainerAdapter", "draftInfo is NULL");
        AppMethodBeat.o(25000);
      }
      else
      {
        paramView.qzO.field_fileStatus = 6;
        o.alp().c(paramView.qzO, new String[] { "localId" });
        this.qzH.a(null, null);
        if (b.d(this.qzH) != null)
          b.d(this.qzH);
        AppMethodBeat.o(25000);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.b.c
 * JD-Core Version:    0.6.2
 */