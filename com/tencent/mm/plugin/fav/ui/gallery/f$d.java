package com.tencent.mm.plugin.fav.ui.gallery;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$d extends RecyclerView.v
{
  TextView kuL;
  View.OnLongClickListener mlV;
  ImageView mok;
  View mol;
  ImageView mom;
  View mon;
  CheckBox moo;
  View mop;

  public f$d(f paramf, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(74577);
    this.mlV = new f.d.4(this);
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
    this.mok.setOnTouchListener(new f.d.1(this, paramf));
    this.mok.setOnClickListener(new f.d.2(this, paramf));
    this.mok.setOnLongClickListener(this.mlV);
    this.mop.setOnClickListener(new f.d.3(this, paramf));
    AppMethodBeat.o(74577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.d
 * JD-Core Version:    0.6.2
 */