package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MaskLayout;

final class UnfamiliarContactDetailUI$c extends RecyclerView.v
{
  View apJ;
  MaskLayout emP;
  TextView jXx;
  CheckBox moo;
  TextView qqe;
  ImageView qqf;
  ImageView qqg;
  LinearLayout qqh;
  LinearLayout qqi;

  public UnfamiliarContactDetailUI$c(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(127660);
    this.apJ = paramView;
    this.emP = ((MaskLayout)paramView.findViewById(2131828382));
    this.jXx = ((TextView)paramView.findViewById(2131828383));
    this.qqe = ((TextView)paramView.findViewById(2131828381));
    this.qqf = ((ImageView)paramView.findViewById(2131828384));
    this.qqg = ((ImageView)paramView.findViewById(2131828385));
    this.qqh = ((LinearLayout)paramView.findViewById(2131828386));
    this.moo = ((CheckBox)paramView.findViewById(2131820932));
    this.qqi = ((LinearLayout)paramView.findViewById(2131823475));
    this.qqh.setOnClickListener(new UnfamiliarContactDetailUI.c.1(this, paramUnfamiliarContactDetailUI));
    paramView.setOnClickListener(new UnfamiliarContactDetailUI.c.2(this, paramUnfamiliarContactDetailUI));
    AppMethodBeat.o(127660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.c
 * JD-Core Version:    0.6.2
 */