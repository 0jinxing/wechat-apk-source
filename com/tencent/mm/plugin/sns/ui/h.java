package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h extends LinearLayout
{
  private Context context;
  private int jJF;
  private int rhk;
  private LinearLayout rhl;

  public h(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(38162);
    this.jJF = 0;
    this.rhk = 6;
    this.context = paramContext;
    setOrientation(1);
    AppMethodBeat.o(38162);
  }

  public final void addView(View paramView)
  {
    AppMethodBeat.i(38163);
    if (this.jJF % this.rhk == 0)
    {
      this.rhl = new LinearLayout(this.context);
      this.rhl.setOrientation(0);
      this.rhl.addView(paramView);
      super.addView(this.rhl);
    }
    while (true)
    {
      this.jJF += 1;
      AppMethodBeat.o(38163);
      return;
      this.rhl.addView(paramView);
    }
  }

  public final void setLineMaxCounte(int paramInt)
  {
    if (paramInt > 0)
      this.rhk = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.h
 * JD-Core Version:    0.6.2
 */