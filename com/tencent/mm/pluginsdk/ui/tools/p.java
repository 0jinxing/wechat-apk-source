package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class p
{
  private static int vvz = -1;

  public static void a(View paramView, VideoSightView paramVideoSightView)
  {
    AppMethodBeat.i(70414);
    if ((paramView == null) || (paramVideoSightView == null))
    {
      ab.e("VideoSightHelper", "null view object " + paramView + "," + paramVideoSightView);
      AppMethodBeat.o(70414);
    }
    while (true)
    {
      return;
      if (paramView.getVisibility() == 0)
        paramVideoSightView.addOnLayoutChangeListener(new p.1(paramView));
      AppMethodBeat.o(70414);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.p
 * JD-Core Version:    0.6.2
 */