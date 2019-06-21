package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class c
{
  private static c rNa;
  private com.tencent.mm.kiss.widget.textview.a.a rMO = null;
  public int rMP = 0;

  static
  {
    AppMethodBeat.i(40502);
    rNa = new c();
    AppMethodBeat.o(40502);
  }

  public static c cvy()
  {
    return rNa;
  }

  public final com.tencent.mm.kiss.widget.textview.a.a getTextViewConfig()
  {
    AppMethodBeat.i(40500);
    int i = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)(15.0F * com.tencent.mm.bz.a.dm(ah.getContext())));
    if ((this.rMO == null) || ((int)this.rMO.eOg != i))
      this.rMO = b.ST().ad(i).jV(ah.getContext().getResources().getColor(2131690474)).jU(16).eNR;
    com.tencent.mm.kiss.widget.textview.a.a locala = this.rMO;
    AppMethodBeat.o(40500);
    return locala;
  }

  public final int getViewWidth()
  {
    AppMethodBeat.i(40501);
    if (this.rMP <= 0)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      int i = localDisplayMetrics.widthPixels;
      int j = (int)(ah.getResources().getDimension(2131427812) + ah.getResources().getDimension(2131427812));
      int k = (int)ah.getResources().getDimension(2131428676);
      m = (int)ah.getResources().getDimension(2131427812);
      this.rMP = (i - k - j - m);
      ab.i("MicroMsg.SnsCommentPreloadTextViewConfig", "screenWidth " + i + " textViewWidth " + this.rMP + " padding: " + j + " marginLeft: " + k + " thisviewPadding: " + m);
    }
    int m = this.rMP;
    AppMethodBeat.o(40501);
    return m;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.c
 * JD-Core Version:    0.6.2
 */