package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l extends RecyclerView.v
{
  public TextView gnf;
  public LinearLayout kuD;
  public ProgressBar kuE;

  private l(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(54325);
    this.kuD = ((LinearLayout)paramView.findViewById(2131822738));
    this.gnf = ((TextView)paramView.findViewById(2131822740));
    this.kuE = ((ProgressBar)paramView.findViewById(2131822739));
    AppMethodBeat.o(54325);
  }

  public static RecyclerView.v m(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(54326);
    paramViewGroup = new l(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969131, paramViewGroup, false));
    AppMethodBeat.o(54326);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.l
 * JD-Core Version:    0.6.2
 */