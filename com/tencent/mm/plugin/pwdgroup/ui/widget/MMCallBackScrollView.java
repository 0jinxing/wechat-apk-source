package com.tencent.mm.plugin.pwdgroup.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public class MMCallBackScrollView extends ScrollView
{
  private ak mHandler;
  private int mState;
  private int prR;
  private MMCallBackScrollView.a prS;

  public MMCallBackScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(24041);
    this.mState = 0;
    this.mHandler = new MMCallBackScrollView.1(this);
    AppMethodBeat.o(24041);
  }

  public MMCallBackScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(24042);
    this.mState = 0;
    this.mHandler = new MMCallBackScrollView.1(this);
    AppMethodBeat.o(24042);
  }

  private void Bm(int paramInt)
  {
    AppMethodBeat.i(24040);
    if ((this.prS != null) && (this.mState != paramInt))
    {
      this.mState = paramInt;
      this.prS.cm(paramInt);
    }
    AppMethodBeat.o(24040);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(24043);
    boolean bool = super.onTouchEvent(paramMotionEvent);
    this.prR = getScrollY();
    switch (paramMotionEvent.getAction())
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(24043);
      return bool;
      if (this.mHandler != null)
      {
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(), 5L);
        continue;
        Bm(1);
      }
    }
  }

  public void setMMOnScrollListener(MMCallBackScrollView.a parama)
  {
    this.prS = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.widget.MMCallBackScrollView
 * JD-Core Version:    0.6.2
 */