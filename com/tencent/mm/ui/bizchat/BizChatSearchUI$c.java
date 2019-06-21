package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizChatSearchUI$c
{
  private View jLA;
  private View jLB;
  private View jLz;

  private void w(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    AppMethodBeat.i(30158);
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
      AppMethodBeat.o(30158);
      return;
      j = 8;
      break;
    }
  }

  public final View hQ(Context paramContext)
  {
    AppMethodBeat.i(30156);
    paramContext = View.inflate(paramContext, 2130969940, null);
    this.jLz = paramContext.findViewById(2131825264);
    this.jLA = paramContext.findViewById(2131822252);
    this.jLB = paramContext.findViewById(2131825265);
    this.jLz.setVisibility(8);
    this.jLA.setVisibility(8);
    this.jLB.setVisibility(8);
    AppMethodBeat.o(30156);
    return paramContext;
  }

  public final void sd(int paramInt)
  {
    AppMethodBeat.i(30157);
    switch (paramInt)
    {
    default:
      w(false, false);
      AppMethodBeat.o(30157);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      w(true, false);
      AppMethodBeat.o(30157);
      continue;
      w(false, true);
      AppMethodBeat.o(30157);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSearchUI.c
 * JD-Core Version:    0.6.2
 */