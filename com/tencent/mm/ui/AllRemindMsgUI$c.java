package com.tencent.mm.ui;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AllRemindMsgUI$c extends RecyclerView.v
{
  View apJ;
  TextView gne;
  ImageView gvq;
  TextView jXx;
  TextView yeA;

  public AllRemindMsgUI$c(AllRemindMsgUI paramAllRemindMsgUI, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(29126);
    this.apJ = paramView;
    this.gne = ((TextView)paramView.findViewById(2131820678));
    this.yeA = ((TextView)paramView.findViewById(2131826965));
    this.jXx = ((TextView)paramView.findViewById(2131826964));
    this.gvq = ((ImageView)paramView.findViewById(2131823704));
    this.apJ.setOnClickListener(new AllRemindMsgUI.c.1(this, paramAllRemindMsgUI));
    this.apJ.setOnTouchListener(new AllRemindMsgUI.c.2(this, paramAllRemindMsgUI));
    this.apJ.setOnLongClickListener(new AllRemindMsgUI.c.3(this, paramAllRemindMsgUI));
    AppMethodBeat.o(29126);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.c
 * JD-Core Version:    0.6.2
 */