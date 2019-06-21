package com.tencent.mm.ui.chatting.a;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$d extends RecyclerView.v
{
  TextView kuL;
  ImageView mok;
  View mol;
  ImageView mom;
  View mon;
  CheckBox moo;
  View mop;

  public b$d(b paramb, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(31137);
    this.mok = ((ImageView)paramView.findViewById(2131823900));
    this.mol = paramView.findViewById(2131823904);
    this.mon = paramView.findViewById(2131823906);
    this.kuL = ((TextView)paramView.findViewById(2131822745));
    this.mom = ((ImageView)paramView.findViewById(2131823908));
    this.moo = ((CheckBox)paramView.findViewById(2131823909));
    this.mop = paramView.findViewById(2131823910);
    this.mop.setVisibility(8);
    this.moo.setVisibility(8);
    this.mol.setVisibility(8);
    this.kuL.setVisibility(8);
    this.mon.setVisibility(8);
    this.mok.setOnClickListener(new b.d.1(this, paramb));
    this.mop.setOnClickListener(new b.d.2(this, paramb));
    AppMethodBeat.o(31137);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.b.d
 * JD-Core Version:    0.6.2
 */