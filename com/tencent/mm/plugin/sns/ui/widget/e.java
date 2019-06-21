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

public final class e
{
  private static e rNh;
  private static final int rNk;
  public int rMP = 0;
  private com.tencent.mm.kiss.widget.textview.a.a rNi = null;
  private com.tencent.mm.kiss.widget.textview.a.a rNj = null;

  static
  {
    AppMethodBeat.i(40522);
    rNh = new e();
    rNk = com.tencent.mm.bz.a.am(ah.getContext(), 2131427511);
    AppMethodBeat.o(40522);
  }

  public static e cvB()
  {
    return rNh;
  }

  public static float getTextSize()
  {
    AppMethodBeat.i(40521);
    float f = (int)(rNk * com.tencent.mm.bz.a.dm(ah.getContext()));
    AppMethodBeat.o(40521);
    return f;
  }

  public final com.tencent.mm.kiss.widget.textview.a.a cvC()
  {
    AppMethodBeat.i(40519);
    int i = (int)(rNk * com.tencent.mm.bz.a.dm(ah.getContext()));
    if ((this.rNj == null) || ((int)this.rNj.eOg != i))
      this.rNj = b.ST().jU(8388627).jV(ah.getContext().getResources().getColor(2131690316)).ad(i).SU().eNR;
    com.tencent.mm.kiss.widget.textview.a.a locala = this.rNj;
    AppMethodBeat.o(40519);
    return locala;
  }

  public final com.tencent.mm.kiss.widget.textview.a.a getTextViewConfig()
  {
    AppMethodBeat.i(40518);
    int i = (int)(rNk * com.tencent.mm.bz.a.dm(ah.getContext()));
    if ((this.rNi == null) || ((int)this.rNi.eOg != i))
      this.rNi = b.ST().jU(8388627).jV(ah.getContext().getResources().getColor(2131690316)).ad(i).eNR;
    com.tencent.mm.kiss.widget.textview.a.a locala = this.rNi;
    AppMethodBeat.o(40518);
    return locala;
  }

  public final int getViewWidth()
  {
    AppMethodBeat.i(40520);
    if (this.rMP <= 0)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      int i = localDisplayMetrics.widthPixels;
      j = (int)(ah.getResources().getDimension(2131427812) + ah.getResources().getDimension(2131427812));
      int k = (int)ah.getResources().getDimension(2131428676);
      int m = (int)ah.getResources().getDimension(2131427812);
      this.rMP = (i - k - j);
      ab.i("MicroMsg.SnsPostDescPreloadTextViewConfig", "screenWidth " + i + " textViewWidth " + this.rMP + " padding: " + j + " marginLeft: " + k + " thisviewPadding: " + m);
    }
    int j = this.rMP;
    AppMethodBeat.o(40520);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.e
 * JD-Core Version:    0.6.2
 */