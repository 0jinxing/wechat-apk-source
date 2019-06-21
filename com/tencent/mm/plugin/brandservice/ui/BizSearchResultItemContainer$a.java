package com.tencent.mm.plugin.brandservice.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizSearchResultItemContainer$a
{
  View jLA;
  View jLB;
  View jLz;

  private void w(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    AppMethodBeat.i(13901);
    View localView = this.jLz;
    if (paramBoolean1)
    {
      j = 0;
      localView.setVisibility(j);
      this.jLA.setVisibility(8);
      localView = this.jLB;
      if (!paramBoolean2)
        break label71;
    }
    label71: for (int j = i; ; j = 8)
    {
      localView.setVisibility(j);
      AppMethodBeat.o(13901);
      return;
      j = 8;
      break;
    }
  }

  public final void sd(int paramInt)
  {
    AppMethodBeat.i(13900);
    switch (paramInt)
    {
    default:
      w(false, false);
      AppMethodBeat.o(13900);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      w(true, false);
      AppMethodBeat.o(13900);
      continue;
      w(false, true);
      AppMethodBeat.o(13900);
      continue;
      w(false, false);
      AppMethodBeat.o(13900);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer.a
 * JD-Core Version:    0.6.2
 */