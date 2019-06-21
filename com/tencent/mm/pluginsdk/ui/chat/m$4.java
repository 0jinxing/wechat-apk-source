package com.tencent.mm.pluginsdk.ui.chat;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.HorizontalListView.a;

final class m$4
  implements HorizontalListView.a
{
  m$4(m paramm)
  {
  }

  public final boolean o(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(62457);
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(62457);
      return false;
      this.voP.mHandler.sendEmptyMessage(20002);
      continue;
      this.voP.mHandler.sendEmptyMessageDelayed(20001, 3000L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.m.4
 * JD-Core Version:    0.6.2
 */