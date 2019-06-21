package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.plugin.wenote.model.d;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.ab;

final class i$4
  implements View.OnClickListener
{
  i$4(i parami)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27168);
    if (this.uUQ.uSJ.uQI == 2)
    {
      this.uUQ.uSJ.uQw.dfP().deh();
      this.uUQ.uSJ.deV();
    }
    int i = ((RecyclerView.v)paramView.getTag()).kj();
    ld localld = new ld();
    if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(i) == null)
    {
      ab.e("Micromsg.NoteOtherItemHolder", "click not response, null == NoteDataManager.getMgr().get(position),position is %d,datalist size = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().size()) });
      AppMethodBeat.o(27168);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.wenote.model.c.ddG().uMN == null)
      {
        ab.e("Micromsg.NoteOtherItemHolder", "getWnNoteBase is null");
        AppMethodBeat.o(27168);
      }
      else
      {
        ab.i("Micromsg.NoteOtherItemHolder", "click item, type is %d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(i).getType()) });
        localld.cGU.cGW = ((o)com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(i)).uOo;
        localld.cGU.context = paramView.getContext();
        localld.cGU.type = 1;
        com.tencent.mm.plugin.wenote.model.c.ddG().uMN.b(localld);
        AppMethodBeat.o(27168);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.i.4
 * JD-Core Version:    0.6.2
 */