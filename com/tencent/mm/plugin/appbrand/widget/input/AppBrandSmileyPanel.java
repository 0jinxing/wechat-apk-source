package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;
import com.tencent.mm.plugin.appbrand.widget.input.panel.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.x;

public final class AppBrandSmileyPanel extends AppBrandSmileyPanelBase
  implements e
{
  private int jfI = -1;
  private int jfJ = -1;
  private boolean mInLayout = false;

  public AppBrandSmileyPanel(Context paramContext)
  {
    super(paramContext);
  }

  public AppBrandSmileyPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private int getPanelDefaultHeightInPort()
  {
    AppMethodBeat.i(134276);
    if (this.jfI < 0)
      this.jfI = x.gs(getContext());
    int i;
    if (this.jfI > 0)
    {
      i = this.jfI;
      AppMethodBeat.o(134276);
    }
    while (true)
    {
      return i;
      getManager();
      int[] arrayOfInt = c.aMw();
      i = Math.max(arrayOfInt[0], arrayOfInt[1]) / 2 - getContext().getResources().getDimensionPixelSize(2131427535);
      this.jfI = i;
      AppMethodBeat.o(134276);
    }
  }

  private int getPanelHeightInLandscape()
  {
    AppMethodBeat.i(134275);
    getManager();
    int[] arrayOfInt = c.aMw();
    int i;
    if ((this.jfJ > 0) && (this.jfJ < arrayOfInt[1]))
    {
      i = this.jfJ;
      AppMethodBeat.o(134275);
    }
    while (true)
    {
      return i;
      i = Math.min(arrayOfInt[0], arrayOfInt[1]) / 2 - getContext().getResources().getDimensionPixelSize(2131427535);
      AppMethodBeat.o(134275);
    }
  }

  public final boolean aQV()
  {
    boolean bool = true;
    AppMethodBeat.i(134283);
    ab.d("MicroMsg.AppBrandSmileyPanel", "[scrollUp] isRealHeightSettled, mForcePanelHeight %d, height %d, measuredHeight %d", new Object[] { Integer.valueOf(this.jfJ), Integer.valueOf(getHeight()), Integer.valueOf(getMeasuredHeight()) });
    if ((this.jfJ > 0) && (this.jfJ == getMeasuredHeight()))
      AppMethodBeat.o(134283);
    while (true)
    {
      return bool;
      AppMethodBeat.o(134283);
      bool = false;
    }
  }

  public final c aQY()
  {
    AppMethodBeat.i(134278);
    ak localak = new ak();
    AppMethodBeat.o(134278);
    return localak;
  }

  public final boolean aQZ()
  {
    AppMethodBeat.i(134282);
    boolean bool;
    if (d.iW(18))
    {
      bool = super.isInLayout();
      AppMethodBeat.o(134282);
    }
    while (true)
    {
      return bool;
      bool = this.mInLayout;
      AppMethodBeat.o(134282);
    }
  }

  public final int getAppropriateHeightInPort()
  {
    AppMethodBeat.i(134277);
    int i;
    if (this.jfJ > 0)
    {
      i = this.jfJ;
      AppMethodBeat.o(134277);
    }
    while (true)
    {
      return i;
      i = getPanelDefaultHeightInPort();
      AppMethodBeat.o(134277);
    }
  }

  public final int getForcedPanelHeight()
  {
    return this.jfJ;
  }

  public final View getPanelView()
  {
    return this;
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(134281);
    this.mInLayout = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.mInLayout = false;
    AppMethodBeat.o(134281);
  }

  public final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134279);
    if (!isShown())
    {
      du(paramInt1, View.MeasureSpec.makeMeasureSpec(0, -2147483648));
      AppMethodBeat.o(134279);
      return;
    }
    if (!j.gu(getContext()));
    for (paramInt2 = getPanelHeightInLandscape(); ; paramInt2 = getAppropriateHeightInPort())
    {
      du(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      AppMethodBeat.o(134279);
      break;
    }
  }

  public final boolean qD(int paramInt)
  {
    if ((paramInt > 0) && (this.jfJ != paramInt))
      this.jfJ = paramInt;
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(134280);
    qG(paramInt);
    if (paramInt == 0)
      initView();
    AppMethodBeat.o(134280);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.AppBrandSmileyPanel
 * JD-Core Version:    0.6.2
 */