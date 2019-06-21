package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DynamicGridView$d extends Handler
{
  private DynamicGridView$d(DynamicGridView paramDynamicGridView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(40365);
    switch (paramMessage.what)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(40365);
      return;
      DynamicGridView localDynamicGridView = this.rLT;
      paramMessage = localDynamicGridView.getChildAt(localDynamicGridView.rLN);
      new StringBuilder("downView ").append(paramMessage).append(",downPos ").append(localDynamicGridView.rLN).append(",lastTouchX ").append(localDynamicGridView.rLO).append(",lastTouchY ").append(localDynamicGridView.rLP);
      if ((!localDynamicGridView.rLx) && (!localDynamicGridView.rLy) && (f.d(paramMessage, localDynamicGridView.rLO, localDynamicGridView.rLP)))
        localDynamicGridView.Ex(localDynamicGridView.rLN);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.d
 * JD-Core Version:    0.6.2
 */