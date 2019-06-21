package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.n;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class o extends n
{
  private a tJt;

  public o(a parama)
  {
    this(parama, (byte)0);
  }

  private o(a parama, byte paramByte)
  {
    super(2, null);
    this.tJt = parama;
  }

  public o(String paramString, a parama)
  {
    this(parama, (byte)0);
    AppMethodBeat.i(47535);
    if (!bo.isNullOrNil(paramString))
      gP(Color.parseColor(paramString), ah.getContext().getResources().getColor(2131690480));
    AppMethodBeat.o(47535);
  }

  public final void Hy(int paramInt)
  {
    AppMethodBeat.i(47537);
    Context localContext = ah.getContext();
    super.Hy(paramInt);
    if (paramInt == 5)
      gP(localContext.getResources().getColor(2131690691), localContext.getResources().getColor(2131690480));
    AppMethodBeat.o(47537);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47536);
    if (this.tJt != null)
      this.tJt.df(paramView);
    AppMethodBeat.o(47536);
  }

  public static abstract interface a
  {
    public abstract void df(View paramView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.o
 * JD-Core Version:    0.6.2
 */