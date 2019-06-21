package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p
{
  @TargetApi(11)
  public static void ci(View paramView)
  {
    AppMethodBeat.i(52001);
    if (paramView.getLayerType() == 1)
      AppMethodBeat.o(52001);
    while (true)
    {
      return;
      paramView.setLayerType(1, null);
      AppMethodBeat.o(52001);
    }
  }

  @TargetApi(11)
  public static void w(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(52002);
    if ((paramInt1 >= 2048) || (paramInt2 >= 2048));
    for (paramInt1 = 1; ; paramInt1 = 2)
    {
      if (paramView.getLayerType() != paramInt1)
        paramView.setLayerType(paramInt1, null);
      AppMethodBeat.o(52002);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.p
 * JD-Core Version:    0.6.2
 */