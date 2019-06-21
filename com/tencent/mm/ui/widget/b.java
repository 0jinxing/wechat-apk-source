package com.tencent.mm.ui.widget;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ae;

public final class b
{
  private Rect eAp;
  private int maxHeight;
  private int sjj;
  private View view;
  private b.a zLV;
  private boolean zLW;
  private int zLX;
  private int zLY;
  private int zLZ;
  Runnable zMa;
  Runnable zMb;

  public b(View paramView, b.a parama)
  {
    AppMethodBeat.i(107853);
    this.eAp = new Rect();
    this.zLW = false;
    this.view = paramView;
    this.zLV = parama;
    this.zLZ = ae.fr(paramView.getContext());
    this.sjj = x.gq(paramView.getContext());
    AppMethodBeat.o(107853);
  }

  private boolean dKz()
  {
    AppMethodBeat.i(107857);
    boolean bool = x.gu(this.view.getContext());
    AppMethodBeat.o(107857);
    return bool;
  }

  private boolean isInMultiWindowMode()
  {
    AppMethodBeat.i(107858);
    boolean bool;
    if ((d.iW(24)) && ((this.view.getContext() instanceof Activity)))
    {
      bool = ((Activity)this.view.getContext()).isInMultiWindowMode();
      AppMethodBeat.o(107858);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107858);
    }
  }

  public final void PR(int paramInt)
  {
    AppMethodBeat.i(107854);
    if ((!dKz()) || (isInMultiWindowMode()))
    {
      ab.i("MicroMsg.InputPanelHelper", "onMeasure: delay call runnable");
      AppMethodBeat.o(107854);
    }
    while (true)
    {
      return;
      int i = this.zLX;
      int j = this.eAp.height();
      this.zLX = View.MeasureSpec.getSize(paramInt);
      this.view.getWindowVisibleDisplayFrame(this.eAp);
      if (!this.zLW)
      {
        if (j != this.eAp.bottom)
        {
          bool1 = true;
          label85: this.zLW = bool1;
        }
      }
      else
      {
        this.zLY = this.eAp.bottom;
        if (this.zLY > this.maxHeight - this.zLZ)
          this.maxHeight = this.zLY;
        paramInt = this.maxHeight - this.zLY;
        if (paramInt <= this.zLZ)
          break label278;
      }
      label278: for (boolean bool1 = true; ; bool1 = false)
      {
        if (bool1)
          this.sjj = paramInt;
        if (paramInt != this.zLZ)
          break label284;
        this.zLV.m(false, this.sjj - paramInt);
        if (((!this.zLW) || (i <= this.zLX + this.zLZ)) && (i >= this.zLX - this.zLZ))
          break label344;
        ab.i("MicroMsg.InputPanelHelper", "onMeasure: run, %s", new Object[] { Boolean.valueOf(bool1) });
        this.zLW = false;
        if (!bool1)
          break label323;
        if (this.zMa == null)
          break label344;
        this.zMa.run();
        this.zMa = null;
        AppMethodBeat.o(107854);
        break;
        bool1 = false;
        break label85;
      }
      label284: b.a locala = this.zLV;
      if (paramInt > this.zLZ);
      for (boolean bool2 = true; ; bool2 = false)
      {
        locala.m(bool2, this.sjj);
        break;
      }
      label323: if (this.zMb != null)
      {
        this.zMb.run();
        this.zMb = null;
      }
      label344: AppMethodBeat.o(107854);
    }
  }

  public final void aA(Runnable paramRunnable)
  {
    AppMethodBeat.i(107856);
    this.zMb = paramRunnable;
    this.zMa = null;
    this.view.postDelayed(new b.2(this), 200L);
    AppMethodBeat.o(107856);
  }

  public final void az(Runnable paramRunnable)
  {
    AppMethodBeat.i(107855);
    this.zMa = paramRunnable;
    this.zMb = null;
    this.view.postDelayed(new b.1(this), 200L);
    AppMethodBeat.o(107855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b
 * JD-Core Version:    0.6.2
 */