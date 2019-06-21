package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class n extends RecyclerView.v
{
  public final ImageView eks;
  public final TextView gne;
  public final ProgressBar gtQ;
  public final TextView gtb;
  public final TextView hrg;
  public final ImageView iyo;
  public final LinearLayout kuD;
  public final MMPinProgressBtn kuH;
  public final CheckBox kuN;
  public final ImageView kuP;
  public final View kuR;
  public final TextView timeTv;

  private n(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(54333);
    this.kuD = ((LinearLayout)paramView.findViewById(2131822738));
    this.eks = ((ImageView)paramView.findViewById(2131821183));
    this.gtb = ((TextView)paramView.findViewById(2131821227));
    this.timeTv = ((TextView)paramView.findViewById(2131820988));
    this.kuN = ((CheckBox)paramView.findViewById(2131821593));
    this.kuR = paramView.findViewById(2131822747);
    this.kuP = ((ImageView)paramView.findViewById(2131822427));
    this.iyo = ((ImageView)paramView.findViewById(2131821226));
    this.gne = ((TextView)paramView.findViewById(2131821185));
    this.hrg = ((TextView)paramView.findViewById(2131820993));
    this.kuH = ((MMPinProgressBtn)paramView.findViewById(2131822617));
    this.gtQ = ((ProgressBar)paramView.findViewById(2131821605));
    this.kuD.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(54331);
        a locala = (a)paramAnonymousView.getTag();
        if (locala == null)
          AppMethodBeat.o(54331);
        while (true)
        {
          return;
          locala.a(paramAnonymousView, locala);
          AppMethodBeat.o(54331);
        }
      }
    });
    this.kuR.setOnClickListener(new n.2(this));
    AppMethodBeat.o(54333);
  }

  public static RecyclerView.v m(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(54334);
    paramViewGroup = new n(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969133, paramViewGroup, false));
    AppMethodBeat.o(54334);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.n
 * JD-Core Version:    0.6.2
 */