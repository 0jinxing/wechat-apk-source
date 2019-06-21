package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMLoadScrollView;

public class FavDetailScrollView extends MMLoadScrollView
{
  private FavDetailScrollView.a mpD;

  public FavDetailScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public FavDetailScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(74670);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((getScrollY() == 0) && (this.mpD != null))
    {
      this.mpD.bwf();
      AppMethodBeat.o(74670);
    }
    while (true)
    {
      return;
      if (this.mpD != null)
        this.mpD.bwe();
      AppMethodBeat.o(74670);
    }
  }

  public void setOnScrollChangeListener(FavDetailScrollView.a parama)
  {
    this.mpD = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavDetailScrollView
 * JD-Core Version:    0.6.2
 */