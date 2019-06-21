package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "Landroid/widget/TableLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "specialLayoutFlag", "", "layout", "", "l", "", "t", "r", "b", "flag", "onLayout", "changed", "plugin-radar_release"})
public final class RadarSpecialTableLayout extends TableLayout
{
  private boolean pCR;

  public RadarSpecialTableLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(103015);
    AppMethodBeat.o(103015);
  }

  public RadarSpecialTableLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103014);
    AppMethodBeat.o(103014);
  }

  public final void D(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(103012);
    this.pCR = true;
    super.layout(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(103012);
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(103013);
    int i;
    int j;
    if ((!this.pCR) && (paramInt2 < 0))
    {
      i = paramInt4 - paramInt2;
      j = 1;
    }
    while (true)
    {
      this.pCR = false;
      if (j == 0)
      {
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(103013);
      }
      while (true)
      {
        return;
        layout(paramInt1, 0, paramInt3, i);
        AppMethodBeat.o(103013);
      }
      j = 0;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout
 * JD-Core Version:    0.6.2
 */