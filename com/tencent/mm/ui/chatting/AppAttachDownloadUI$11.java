package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppAttachDownloadUI$11
  implements View.OnTouchListener
{
  AppAttachDownloadUI$11(AppAttachDownloadUI paramAppAttachDownloadUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(30274);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(30274);
      return false;
      AppAttachDownloadUI.b(this.yGh, (int)paramMotionEvent.getRawX());
      AppAttachDownloadUI.c(this.yGh, (int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI.11
 * JD-Core Version:    0.6.2
 */