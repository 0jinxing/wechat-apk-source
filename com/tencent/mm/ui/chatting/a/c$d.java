package com.tencent.mm.ui.chatting.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$d extends RecyclerView.v
{
  TextView gnf;

  public c$d(c paramc, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(31153);
    this.gnf = ((TextView)paramView.findViewById(2131823899));
    this.gnf.setTextColor(c.a(paramc).getResources().getColor(2131690054));
    paramView.findViewById(2131821019).setBackgroundColor(c.a(paramc).getResources().getColor(2131690048));
    AppMethodBeat.o(31153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.c.d
 * JD-Core Version:    0.6.2
 */