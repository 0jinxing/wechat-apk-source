package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class e extends a
{
  private TextView uUr;
  private View uUs;
  public LinearLayout uUt;

  public e(View paramView, k paramk)
  {
    super(paramView, paramk);
    AppMethodBeat.i(27157);
    this.uUt = ((LinearLayout)paramView.findViewById(2131826378));
    this.uUt.setVisibility(0);
    this.uUr = ((TextView)paramView.findViewById(2131826379));
    this.uUs = paramView.findViewById(2131826380);
    AppMethodBeat.o(27157);
  }

  public final void a(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27158);
    if (paramc.getType() != -3)
      AppMethodBeat.o(27158);
    Object localObject;
    while (true)
    {
      return;
      if (this.uSJ.uQI == 3)
      {
        this.uUt.setVisibility(8);
        AppMethodBeat.o(27158);
      }
      else
      {
        this.uUt.setVisibility(0);
        localObject = (com.tencent.mm.plugin.wenote.model.a.e)paramc;
        if (((com.tencent.mm.plugin.wenote.model.a.e)localObject).uOe > 0L)
          break;
        AppMethodBeat.o(27158);
      }
    }
    paramc = this.uUr.getContext();
    long l = ((com.tencent.mm.plugin.wenote.model.a.e)localObject).uOe;
    if (l < 3600000L);
    for (paramc = ""; ; paramc = DateFormat.format(paramc.getString(2131299662), l))
    {
      localObject = this.uUr.getContext().getString(2131301746);
      paramc = (String)localObject + " " + paramc;
      this.uUr.setText(paramc);
      AppMethodBeat.o(27158);
      break;
    }
  }

  public final int dfW()
  {
    return -3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.e
 * JD-Core Version:    0.6.2
 */