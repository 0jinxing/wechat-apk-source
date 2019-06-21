package com.tencent.mm.plugin.luckymoney.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.t.a;
import com.tencent.mm.api.u;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;

public final class a
{
  public static void a(ViewGroup paramViewGroup, ChatFooterPanel paramChatFooterPanel, int paramInt, t.a parama)
  {
    AppMethodBeat.i(43090);
    paramChatFooterPanel.setEntranceScene(paramInt);
    paramChatFooterPanel.setVisibility(0);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, (int)paramViewGroup.getResources().getDimension(2131428477));
    localLayoutParams.gravity = 80;
    paramViewGroup.removeAllViews();
    paramViewGroup.addView(paramChatFooterPanel, localLayoutParams);
    paramViewGroup = u.AH();
    paramViewGroup.ccZ = parama;
    paramChatFooterPanel.setCallback(paramViewGroup);
    AppMethodBeat.o(43090);
  }

  public static void a(ChatFooterPanel paramChatFooterPanel)
  {
    AppMethodBeat.i(43089);
    paramChatFooterPanel.setBackgroundResource(2130837979);
    paramChatFooterPanel.bf(false);
    paramChatFooterPanel.AE();
    paramChatFooterPanel.onResume();
    AppMethodBeat.o(43089);
  }

  public static boolean a(Context paramContext, ChatFooterPanel paramChatFooterPanel)
  {
    boolean bool = false;
    AppMethodBeat.i(43088);
    if (paramChatFooterPanel == null)
      AppMethodBeat.o(43088);
    while (true)
    {
      return bool;
      paramChatFooterPanel.onPause();
      if (paramChatFooterPanel.getVisibility() == 0)
      {
        paramChatFooterPanel.setVisibility(8);
        paramContext = AnimationUtils.loadAnimation(paramContext, 2131034227);
        paramContext.setAnimationListener(new a.1(paramChatFooterPanel));
        paramChatFooterPanel.startAnimation(paramContext);
        bool = true;
        AppMethodBeat.o(43088);
      }
      else
      {
        AppMethodBeat.o(43088);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.a.a
 * JD-Core Version:    0.6.2
 */