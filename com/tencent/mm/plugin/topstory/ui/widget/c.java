package com.tencent.mm.plugin.topstory.ui.widget;

import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public View contentView;
  public String fgd;
  private View sHR;
  private View sHS;
  public com.tencent.mm.plugin.topstory.a.c.f sIa;
  c.a sIb;
  private int sIc;

  public c(View paramView, c.a parama, com.tencent.mm.plugin.topstory.a.c.f paramf, String paramString)
  {
    AppMethodBeat.i(2233);
    this.sIc = 16;
    this.contentView = paramView;
    this.sIa = paramf;
    this.sHR = paramView.findViewById(2131828307);
    this.sHS = paramView.findViewById(2131828311);
    this.sIb = parama;
    this.fgd = paramString;
    paramView.setOnClickListener(new c.1(this));
    AppMethodBeat.o(2233);
  }

  public final void a(View paramView, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(2234);
    int[] arrayOfInt = f.a(paramView.getContext(), paramView, this.contentView, paramBoolean);
    arrayOfInt[0] += 0;
    arrayOfInt[1] += paramInt;
    if ((this.sHS != null) && (this.sHR != null))
    {
      paramInt = f.em(paramView) - f.dip2px(paramView.getContext(), this.sIc);
      if (!paramBoolean)
        break label152;
      this.sHS.setVisibility(0);
      this.sHR.setVisibility(8);
      paramView = (RelativeLayout.LayoutParams)this.sHS.getLayoutParams();
      paramView.leftMargin = paramInt;
      this.sHS.setLayoutParams(paramView);
    }
    while (true)
    {
      paramView = (LinearLayout.LayoutParams)this.contentView.getLayoutParams();
      paramView.topMargin = arrayOfInt[1];
      this.contentView.setLayoutParams(paramView);
      AppMethodBeat.o(2234);
      return;
      label152: this.sHS.setVisibility(8);
      this.sHR.setVisibility(0);
      paramView = (RelativeLayout.LayoutParams)this.sHR.getLayoutParams();
      paramView.leftMargin = paramInt;
      this.sHR.setLayoutParams(paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.c
 * JD-Core Version:    0.6.2
 */