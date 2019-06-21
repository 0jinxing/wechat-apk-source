package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.da;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.model.i.a;

public final class c$a extends a
{
  public c$a(c paramc, Context paramContext, View paramView)
  {
    super(paramContext, paramView);
  }

  protected final boolean a(i.a parama, View paramView)
  {
    AppMethodBeat.i(52723);
    bjn();
    boolean bool = super.a(parama, paramView);
    AppMethodBeat.o(52723);
    return bool;
  }

  protected final void b(i.a parama, View paramView)
  {
    AppMethodBeat.i(52724);
    super.b(parama, paramView);
    if (com.tencent.mm.plugin.emoji.h.a.JW(getProductId()))
    {
      parama = new da();
      parama.cwf.cwg = getProductId();
      paramView = parama.cwf;
      if (!com.tencent.mm.plugin.emoji.h.a.blE())
        break label98;
    }
    label98: for (int i = 7; ; i = 3)
    {
      paramView.status = i;
      parama.cwf.progress = getProgress();
      parama.cwf.cwh = this.kRB.kTe;
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      AppMethodBeat.o(52724);
      return;
    }
  }

  protected final void bje()
  {
    AppMethodBeat.i(52722);
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
    AppMethodBeat.o(52722);
  }

  protected final int[] bjf()
  {
    AppMethodBeat.i(52725);
    int i = this.mContext.getResources().getDimensionPixelSize(2131427502);
    AppMethodBeat.o(52725);
    return new int[] { i, i };
  }

  protected final int bjg()
  {
    return -1;
  }

  protected final boolean bjp()
  {
    return true;
  }

  public final void bjs()
  {
    AppMethodBeat.i(52726);
    if (this.kRB == null)
      AppMethodBeat.o(52726);
    while (true)
    {
      return;
      switch (bjn())
      {
      default:
        this.kRH.setVisibility(8);
        this.kRI.setBackgroundResource(2130838005);
        this.kRI.setVisibility(0);
        this.kRK.setVisibility(0);
        this.kRK.setText(2131299170);
        this.kRK.setTextColor(this.mContext.getResources().getColorStateList(2131690723));
        this.kRL.setVisibility(4);
        this.kRL.setImageResource(2130838557);
        this.kRM.setVisibility(4);
        AppMethodBeat.o(52726);
        break;
      case 0:
      case 3:
        this.kRH.setVisibility(8);
        this.kRI.setBackgroundResource(2130838000);
        this.kRI.setVisibility(0);
        this.kRK.setVisibility(0);
        this.kRK.setText(2131299103);
        this.kRK.setTextColor(this.mContext.getResources().getColorStateList(2131690780));
        this.kRL.setVisibility(4);
        this.kRL.setImageResource(2130838557);
        this.kRM.setVisibility(4);
        AppMethodBeat.o(52726);
        break;
      case 6:
        bjq();
        AppMethodBeat.o(52726);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.c.a
 * JD-Core Version:    0.6.2
 */