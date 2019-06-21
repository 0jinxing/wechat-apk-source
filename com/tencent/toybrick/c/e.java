package com.tencent.toybrick.c;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.f.a;

public final class e extends g<e, a>
{
  public static final int AFW = 2130970844;
  private int AGz;

  public final void a(a parama)
  {
    AppMethodBeat.i(113215);
    if (this.AGz == 0)
      this.AGz = ((int)this.AGA.getResources().getDimension(2131427593));
    parama.apJ.setLayoutParams(new RecyclerView.LayoutParams(-1, this.AGz));
    AppMethodBeat.o(113215);
  }

  public final g.b dSy()
  {
    return g.b.AGO;
  }

  public final a fy(View paramView)
  {
    AppMethodBeat.i(113216);
    paramView = new a(paramView);
    AppMethodBeat.o(113216);
    return paramView;
  }

  public final int getLayoutResource()
  {
    return AFW;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.c.e
 * JD-Core Version:    0.6.2
 */