package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class n
  implements Runnable
{
  public ListView Ej;
  public int mMode;
  public long zGO;
  public int zGP;
  public int zGQ;
  public int zGR;
  private final int zGS;
  public int zGT;

  public n(ListView paramListView)
  {
    AppMethodBeat.i(107753);
    this.zGO = System.currentTimeMillis();
    this.Ej = paramListView;
    this.zGS = ViewConfiguration.get(this.Ej.getContext()).getScaledFadingEdgeLength();
    ab.d("ScrollerRunnable", "mExtraScroll: %d", new Object[] { Integer.valueOf(this.zGS) });
    AppMethodBeat.o(107753);
  }

  public final void run()
  {
    AppMethodBeat.i(107754);
    if (System.currentTimeMillis() - this.zGO > 10000L)
      AppMethodBeat.o(107754);
    int j;
    label68: View localView;
    while (true)
    {
      return;
      i = this.Ej.getHeight();
      j = this.Ej.getFirstVisiblePosition();
      switch (this.mMode)
      {
      default:
        AppMethodBeat.o(107754);
        break;
      case 1:
        k = this.Ej.getChildCount() - 1;
        j += k;
        if (k < 0)
        {
          AppMethodBeat.o(107754);
        }
        else
        {
          int m;
          int n;
          if (j == this.zGQ)
          {
            if (this.zGT > 20)
            {
              this.Ej.setSelection(this.zGP);
              ab.d("ScrollerRunnable", "dz:try scroll at same item more than 10, direct seletion");
            }
          }
          else
          {
            this.zGT = 0;
            localView = this.Ej.getChildAt(k);
            m = localView.getHeight();
            n = localView.getTop();
            if (j >= this.Ej.getCount() - 1)
              break label279;
          }
          for (k = this.zGS; ; k = this.Ej.getPaddingBottom())
          {
            this.Ej.smoothScrollBy(k + (m - (i - n)), this.zGR);
            this.zGQ = j;
            if (j >= this.zGP)
              break label68;
            this.Ej.post(this);
            AppMethodBeat.o(107754);
            break;
            this.Ej.post(this);
            this.zGT += 1;
            ab.d("ScrollerRunnable", "dz:try scroll lastpos = %d", new Object[] { Integer.valueOf(j) });
            AppMethodBeat.o(107754);
            break;
          }
        }
        break;
      case 2:
        label279: if (j == this.zGQ)
        {
          if (this.zGT > 20)
          {
            this.Ej.setSelection(this.zGP);
            ab.d("ScrollerRunnable", "dz:try scroll at same item more than 10, direct seletion");
          }
        }
        else
        {
          this.zGT = 0;
          localView = this.Ej.getChildAt(0);
          if (localView != null)
            break label398;
          AppMethodBeat.o(107754);
          continue;
        }
        this.Ej.post(this);
        this.zGT += 1;
        ab.d("ScrollerRunnable", "dz:try scroll firstPos = %d", new Object[] { Integer.valueOf(j) });
        AppMethodBeat.o(107754);
      }
    }
    label398: int i = localView.getTop();
    if (j > 0);
    for (int k = this.zGS; ; k = this.Ej.getPaddingTop())
    {
      this.Ej.smoothScrollBy(i - k, this.zGR);
      this.zGQ = j;
      if (j <= this.zGP)
        break;
      this.Ej.post(this);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.n
 * JD-Core Version:    0.6.2
 */