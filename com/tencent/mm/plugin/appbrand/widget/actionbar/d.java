package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends com.tencent.mm.ui.statusbar.b
{
  private int iUG = 0;
  private boolean iUU = false;
  private int iUV;
  private boolean iUW = false;
  private Integer iUX = null;
  private boolean irI = true;

  public d(Context paramContext)
  {
    super(paramContext);
  }

  private b getActionBar()
  {
    AppMethodBeat.i(87488);
    b localb;
    if (getChildCount() <= 0)
    {
      localb = null;
      AppMethodBeat.o(87488);
    }
    while (true)
    {
      return localb;
      localb = (b)getChildAt(0);
      AppMethodBeat.o(87488);
    }
  }

  public final void K(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(87491);
    this.iUG = paramInt;
    this.iUU = paramBoolean;
    if (!this.irI)
    {
      if (!this.iUW)
        super.a(paramInt, paramBoolean, false);
      AppMethodBeat.o(87491);
    }
    while (true)
    {
      return;
      super.a(paramInt, paramBoolean, true);
      AppMethodBeat.o(87491);
    }
  }

  public final void aOO()
  {
    AppMethodBeat.i(87492);
    K(this.iUG, this.iUU);
    AppMethodBeat.o(87492);
  }

  protected final boolean canAnimate()
  {
    return false;
  }

  public final boolean hasOverlappingRendering()
  {
    return false;
  }

  public final void onViewAdded(View paramView)
  {
    AppMethodBeat.i(87487);
    super.onViewAdded(paramView);
    if (!(paramView instanceof b))
    {
      paramView = new IllegalAccessError("Cant add non ActionBar instance here");
      AppMethodBeat.o(87487);
      throw paramView;
    }
    paramView.setBackground(new d.a(this));
    AppMethodBeat.o(87487);
  }

  public final void pO(int paramInt)
  {
    AppMethodBeat.i(87495);
    if (this.iUX != null)
    {
      paramInt = this.iUX.intValue();
      this.iUV = paramInt;
      super.pO(paramInt);
      AppMethodBeat.o(87495);
    }
    while (true)
    {
      return;
      this.iUV = paramInt;
      if (this.iUW)
      {
        AppMethodBeat.o(87495);
      }
      else
      {
        super.pO(paramInt);
        AppMethodBeat.o(87495);
      }
    }
  }

  public final void setActuallyVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(87493);
    if (paramBoolean != this.irI);
    for (int i = 1; ; i = 0)
    {
      this.irI = paramBoolean;
      if ((i != 0) && (paramBoolean))
      {
        aOO();
        setDeferStatusBarHeightChange(false);
        setWillNotDraw(false);
      }
      if ((i != 0) && (!paramBoolean))
        setDeferStatusBarHeightChange(true);
      AppMethodBeat.o(87493);
      return;
    }
  }

  public final void setDeferStatusBarHeightChange(boolean paramBoolean)
  {
    AppMethodBeat.i(87494);
    if (paramBoolean != this.iUW);
    for (int i = 1; ; i = 0)
    {
      this.iUW = paramBoolean;
      if ((i != 0) && (!paramBoolean))
        super.pO(this.iUV);
      AppMethodBeat.o(87494);
      return;
    }
  }

  public final void setForceTopInsetsHeight(int paramInt)
  {
    AppMethodBeat.i(87496);
    this.iUX = Integer.valueOf(paramInt);
    AppMethodBeat.o(87496);
  }

  public final void setStatusBarColor(int paramInt)
  {
    AppMethodBeat.i(87490);
    K(paramInt, this.iUU);
    AppMethodBeat.o(87490);
  }

  public final void setStatusBarForegroundStyle(boolean paramBoolean)
  {
    AppMethodBeat.i(87489);
    if (getActionBar() == null)
      AppMethodBeat.o(87489);
    while (true)
    {
      return;
      K(getActionBar().getBackgroundColor(), paramBoolean);
      AppMethodBeat.o(87489);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.d
 * JD-Core Version:    0.6.2
 */