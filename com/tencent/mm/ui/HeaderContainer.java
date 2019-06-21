package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class HeaderContainer extends FrameLayout
{
  private Rect iWy;
  private i yis;
  private y yit;

  public HeaderContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29334);
    this.iWy = new Rect();
    init(paramContext);
    AppMethodBeat.o(29334);
  }

  public HeaderContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(29335);
    this.iWy = new Rect();
    init(paramContext);
    AppMethodBeat.o(29335);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(29338);
    this.yit = new y(paramContext);
    this.yit.setHeaderContainer(this);
    this.yit.setId(2131820646);
    paramContext = new FrameLayout.LayoutParams(-1, -2);
    addView(this.yit, paramContext);
    AppMethodBeat.o(29338);
  }

  public Rect getBackUpFooterRect()
  {
    return this.iWy;
  }

  public y getHeaderView()
  {
    return this.yit;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29337);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(29337);
  }

  public void setAnimController(i parami)
  {
    AppMethodBeat.i(29336);
    this.yis = parami;
    if ((this.yit != null) && (this.yis != null))
      this.yis.a(this.yit);
    AppMethodBeat.o(29336);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HeaderContainer
 * JD-Core Version:    0.6.2
 */