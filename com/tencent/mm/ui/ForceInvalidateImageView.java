package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ForceInvalidateImageView extends ImageView
{
  public ForceInvalidateImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ForceInvalidateImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  @TargetApi(8)
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    AppMethodBeat.i(29302);
    if (paramInt == 0)
      invalidate();
    super.onVisibilityChanged(paramView, paramInt);
    AppMethodBeat.o(29302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ForceInvalidateImageView
 * JD-Core Version:    0.6.2
 */