package com.tencent.mm.platformtools;

import android.os.Build.VERSION;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r
{
  public static void ci(View paramView)
  {
    AppMethodBeat.i(16669);
    if (paramView == null)
      AppMethodBeat.o(16669);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 11)
      {
        new u();
        if (Build.VERSION.SDK_INT >= 11)
          paramView.setLayerType(1, null);
      }
      AppMethodBeat.o(16669);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.r
 * JD-Core Version:    0.6.2
 */