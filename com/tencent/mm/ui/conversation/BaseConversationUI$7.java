package com.tencent.mm.ui.conversation;

import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView;

final class BaseConversationUI$7
  implements Runnable
{
  BaseConversationUI$7(BaseConversationUI paramBaseConversationUI, int[] paramArrayOfInt, HomeUI.FitSystemWindowLayoutView paramFitSystemWindowLayoutView, ViewGroup paramViewGroup)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34056);
    this.zqF.getSupportActionBar().getCustomView().getLocationInWindow(this.ypt);
    int i = this.ypt[1];
    if (i > 0)
    {
      BaseConversationUI.access$1300(this.zqF, this.ypu, i, new Rect(0, i, 0, 0), this.ypv);
      AppMethodBeat.o(34056);
    }
    while (true)
    {
      return;
      if (d.iW(20))
        this.ypu.setOnApplyWindowInsetsListener(new BaseConversationUI.7.1(this));
      AppMethodBeat.o(34056);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.7
 * JD-Core Version:    0.6.2
 */