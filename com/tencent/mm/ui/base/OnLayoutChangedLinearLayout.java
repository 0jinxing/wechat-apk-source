package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.DrawnCallBackLinearLayout;

public class OnLayoutChangedLinearLayout extends DrawnCallBackLinearLayout
{
  public OnLayoutChangedLinearLayout.a yAx;

  public OnLayoutChangedLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  @TargetApi(11)
  public OnLayoutChangedLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107082);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.yAx != null)
      this.yAx.dyX();
    AppMethodBeat.o(107082);
  }

  public void setOnChattingLayoutChangedListener(OnLayoutChangedLinearLayout.a parama)
  {
    this.yAx = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.OnLayoutChangedLinearLayout
 * JD-Core Version:    0.6.2
 */