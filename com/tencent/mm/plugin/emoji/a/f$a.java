package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$a extends a
{
  public f$a(f paramf, Context paramContext, View paramView)
  {
    super(paramContext, paramView);
  }

  protected final void bje()
  {
    AppMethodBeat.i(52743);
    this.kRE.setVisibility(8);
    bjm();
    this.kRH.setVisibility(8);
    this.kRL.setVisibility(8);
    this.kRM.setVisibility(8);
    this.kRD.setVisibility(0);
    this.iDT.setVisibility(0);
    this.kRJ.setVisibility(0);
    this.kRI.setVisibility(0);
    this.kRK.setVisibility(0);
    AppMethodBeat.o(52743);
  }

  protected final int[] bjf()
  {
    AppMethodBeat.i(52744);
    int i = com.tencent.mm.bz.a.al(this.mContext, 2131428362);
    AppMethodBeat.o(52744);
    return new int[] { i, i };
  }

  protected final int bjg()
  {
    AppMethodBeat.i(52745);
    int i = com.tencent.mm.bz.a.al(this.mContext, 2131428361);
    AppMethodBeat.o(52745);
    return i;
  }

  protected final boolean bjp()
  {
    AppMethodBeat.i(52746);
    boolean bool = f.a(this.kSo);
    AppMethodBeat.o(52746);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.f.a
 * JD-Core Version:    0.6.2
 */