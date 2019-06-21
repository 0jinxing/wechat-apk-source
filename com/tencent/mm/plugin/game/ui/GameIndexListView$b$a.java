package com.tencent.mm.plugin.game.ui;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class GameIndexListView$b$a extends RecyclerView.v
{
  public View contentView;

  public GameIndexListView$b$a(GameIndexListView.b paramb, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(111974);
    this.contentView = ((ViewGroup)paramView).getChildAt(0);
    AppMethodBeat.o(111974);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameIndexListView.b.a
 * JD-Core Version:    0.6.2
 */