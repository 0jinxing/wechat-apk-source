package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class m extends RecyclerView.v
{
  public final ProgressBar gtQ;
  public final View kuF;
  public final ImageView kuG;
  public final MMPinProgressBtn kuH;
  public final TextView kuI;
  public final TextView kuJ;
  public final View kuK;
  public final TextView kuL;
  public final ImageView kuM;
  public final CheckBox kuN;
  public final View kuO;
  public ImageView kuP;

  private m(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(54329);
    this.kuF = paramView.findViewById(2131822738);
    this.kuG = ((ImageView)paramView.findViewById(2131821842));
    this.kuH = ((MMPinProgressBtn)paramView.findViewById(2131822617));
    this.gtQ = ((ProgressBar)paramView.findViewById(2131821605));
    this.kuK = paramView.findViewById(2131822743);
    this.kuL = ((TextView)paramView.findViewById(2131822745));
    this.kuI = ((TextView)paramView.findViewById(2131822741));
    this.kuJ = ((TextView)paramView.findViewById(2131822742));
    this.kuM = ((ImageView)paramView.findViewById(2131822711));
    this.kuN = ((CheckBox)paramView.findViewById(2131821593));
    this.kuO = paramView.findViewById(2131822746);
    this.kuP = ((ImageView)paramView.findViewById(2131822427));
    this.kuG.setOnClickListener(new m.1(this));
    this.kuO.setOnClickListener(new m.2(this));
    AppMethodBeat.o(54329);
  }

  public static RecyclerView.v m(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(54330);
    paramViewGroup = new m(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969132, paramViewGroup, false));
    AppMethodBeat.o(54330);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.m
 * JD-Core Version:    0.6.2
 */