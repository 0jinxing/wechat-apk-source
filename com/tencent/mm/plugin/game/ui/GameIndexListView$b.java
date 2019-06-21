package com.tencent.mm.plugin.game.ui;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.d;
import java.util.LinkedList;

public final class GameIndexListView$b extends RecyclerView.a<GameIndexListView.b.a>
{
  LinkedList<d> njl;

  public GameIndexListView$b(GameIndexListView paramGameIndexListView)
  {
    AppMethodBeat.i(111975);
    this.njl = new LinkedList();
    AppMethodBeat.o(111975);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(111977);
    int i = this.njl.size();
    AppMethodBeat.o(111977);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(111976);
    paramInt = ((d)this.njl.get(paramInt)).type;
    AppMethodBeat.o(111976);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameIndexListView.b
 * JD-Core Version:    0.6.2
 */