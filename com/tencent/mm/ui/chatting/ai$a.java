package com.tencent.mm.ui.chatting;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnHoverListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(14)
public final class ai$a
  implements View.OnHoverListener
{
  private ai.b yLU;

  public ai$a(ai.b paramb)
  {
    this.yLU = paramb;
  }

  public final boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30960);
    boolean bool;
    if (this.yLU != null)
    {
      bool = this.yLU.f(paramView, paramMotionEvent);
      AppMethodBeat.o(30960);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(30960);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ai.a
 * JD-Core Version:    0.6.2
 */