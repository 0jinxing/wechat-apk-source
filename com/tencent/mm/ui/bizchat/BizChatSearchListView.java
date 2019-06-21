package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class BizChatSearchListView extends ListView
{
  private BizChatSearchListView.a yEv;

  public BizChatSearchListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public BizChatSearchListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30134);
    if (this.yEv != null)
      this.yEv.aWe();
    boolean bool;
    if (super.onInterceptTouchEvent(paramMotionEvent))
    {
      bool = true;
      AppMethodBeat.o(30134);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30134);
    }
  }

  public void setOnTouchListener(BizChatSearchListView.a parama)
  {
    this.yEv = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSearchListView
 * JD-Core Version:    0.6.2
 */