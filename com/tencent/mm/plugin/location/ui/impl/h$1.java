package com.tencent.mm.plugin.location.ui.impl;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$1
  implements ViewStub.OnInflateListener
{
  h$1(h paramh)
  {
  }

  public final void onInflate(ViewStub paramViewStub, View paramView)
  {
    AppMethodBeat.i(113695);
    paramView.findViewById(2131826350).setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        return true;
      }
    });
    AppMethodBeat.o(113695);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h.1
 * JD-Core Version:    0.6.2
 */