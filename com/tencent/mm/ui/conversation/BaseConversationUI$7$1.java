package com.tencent.mm.ui.conversation;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseConversationUI$7$1
  implements View.OnApplyWindowInsetsListener
{
  BaseConversationUI$7$1(BaseConversationUI.7 param7)
  {
  }

  @TargetApi(20)
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    AppMethodBeat.i(34055);
    if (paramWindowInsets == null)
      AppMethodBeat.o(34055);
    while (true)
    {
      return paramWindowInsets;
      ab.i("MicroMsg.BaseConversationUI", "OnApplyWindowInsetsListener %s", new Object[] { paramWindowInsets });
      paramWindowInsets.consumeSystemWindowInsets();
      BaseConversationUI.access$1300(this.zqH.zqF, this.zqH.ypu, paramWindowInsets.getSystemWindowInsetTop(), new Rect(paramWindowInsets.getSystemWindowInsetLeft(), paramWindowInsets.getSystemWindowInsetTop(), paramWindowInsets.getSystemWindowInsetRight(), paramWindowInsets.getSystemWindowInsetBottom()), this.zqH.ypv);
      AppMethodBeat.o(34055);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.7.1
 * JD-Core Version:    0.6.2
 */