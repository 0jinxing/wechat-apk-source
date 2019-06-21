package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface HorizontalListViewV2$d
{
  public abstract void a(a parama);

  public static enum a
  {
    static
    {
      AppMethodBeat.i(106343);
      ytk = new a("SCROLL_STATE_IDLE", 0);
      ytl = new a("SCROLL_STATE_TOUCH_SCROLL", 1);
      ytm = new a("SCROLL_STATE_FLING", 2);
      ytn = new a[] { ytk, ytl, ytm };
      AppMethodBeat.o(106343);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HorizontalListViewV2.d
 * JD-Core Version:    0.6.2
 */