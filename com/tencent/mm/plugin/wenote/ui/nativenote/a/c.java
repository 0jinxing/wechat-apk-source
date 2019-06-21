package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.plugin.wenote.ui.nativenote.b.a;
import com.tencent.mm.plugin.wenote.ui.nativenote.b.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends RecyclerView.a<a>
{
  private final String TAG;
  private k uSJ;
  private g uUi;

  public c(k paramk)
  {
    AppMethodBeat.i(27143);
    this.TAG = "MicroMsg.Note.NoteRecyclerViewAdapter";
    this.uSJ = paramk;
    this.uUi = new g();
    AppMethodBeat.o(27143);
  }

  private void a(a parama, int paramInt)
  {
    boolean bool = true;
    while (true)
    {
      try
      {
        AppMethodBeat.i(27144);
        com.tencent.mm.plugin.wenote.model.a.c localc = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(paramInt);
        if ((localc != null) && (localc.getType() == parama.dfW()))
        {
          parama.a(localc, paramInt, localc.getType());
          AppMethodBeat.o(27144);
          return;
        }
        if (localc == null)
        {
          ab.e("MicroMsg.Note.NoteRecyclerViewAdapter", "onBindViewHolder, item is null %b, position is %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt) });
          AppMethodBeat.o(27144);
          continue;
        }
      }
      finally
      {
      }
      bool = false;
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(27146);
    int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().size();
    AppMethodBeat.o(27146);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(27145);
    com.tencent.mm.plugin.wenote.model.a.c localc = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(paramInt);
    if (localc != null)
    {
      paramInt = localc.getType();
      AppMethodBeat.o(27145);
    }
    while (true)
    {
      return paramInt;
      ab.e("MicroMsg.Note.NoteRecyclerViewAdapter", "getItemViewType, item is null, position is %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(27145);
      paramInt = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.a.c
 * JD-Core Version:    0.6.2
 */