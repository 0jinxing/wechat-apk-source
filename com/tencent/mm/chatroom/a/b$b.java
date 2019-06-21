package com.tencent.mm.chatroom.a;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.ui.c;
import com.tencent.mm.chatroom.ui.c.a;

public final class b$b extends RecyclerView.v
{
  final c ehb;

  public b$b(View paramView, c.a parama)
  {
    super(paramView);
    AppMethodBeat.i(103891);
    this.ehb = ((c)paramView);
    this.ehb.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
    this.ehb.setClickable(true);
    this.ehb.setOnDayClickListener(parama);
    AppMethodBeat.o(103891);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.a.b.b
 * JD-Core Version:    0.6.2
 */