package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d$a extends a
{
  public d$a(d paramd, Context paramContext, View paramView)
  {
    super(paramContext, paramView);
  }

  protected final void bje()
  {
    AppMethodBeat.i(52734);
    this.kRE.setVisibility(8);
    this.kRG.setVisibility(8);
    this.kRF.setVisibility(0);
    this.kRH.setVisibility(8);
    this.kRL.setVisibility(8);
    this.kRM.setVisibility(8);
    this.kRD.setVisibility(0);
    this.iDT.setVisibility(0);
    this.kRJ.setVisibility(0);
    this.kRI.setVisibility(0);
    this.kRI.setBackgroundDrawable(null);
    this.kRK.setVisibility(0);
    AppMethodBeat.o(52734);
  }

  protected final int[] bjf()
  {
    AppMethodBeat.i(52735);
    int i = com.tencent.mm.bz.a.al(this.mContext, 2131428366);
    AppMethodBeat.o(52735);
    return new int[] { i, i };
  }

  protected final int bjg()
  {
    AppMethodBeat.i(52736);
    int i = com.tencent.mm.bz.a.al(this.mContext, 2131428367);
    AppMethodBeat.o(52736);
    return i;
  }

  protected final boolean bjp()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.d.a
 * JD-Core Version:    0.6.2
 */