package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class HardDeviceChattingItemView extends LinearLayout
{
  private boolean mHasInit;

  public HardDeviceChattingItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onFinishInflate()
  {
    AppMethodBeat.i(30940);
    super.onFinishInflate();
    if (!this.mHasInit)
      this.mHasInit = true;
    AppMethodBeat.o(30940);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.HardDeviceChattingItemView
 * JD-Core Version:    0.6.2
 */