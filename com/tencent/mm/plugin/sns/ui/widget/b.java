package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  private static b rMR;
  private com.tencent.mm.kiss.widget.textview.a.a rMO = null;
  private int rMP = 0;

  static
  {
    AppMethodBeat.i(40478);
    rMR = new b();
    AppMethodBeat.o(40478);
  }

  public static b cvx()
  {
    return rMR;
  }

  public final com.tencent.mm.kiss.widget.textview.a.a getTextViewConfig()
  {
    AppMethodBeat.i(40476);
    int i = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)(15.0F * com.tencent.mm.bz.a.dm(ah.getContext())));
    if ((this.rMO == null) || ((int)this.rMO.eOg != i))
      this.rMO = com.tencent.mm.kiss.widget.textview.a.b.ST().ad(i).jV(ah.getContext().getResources().getColor(2131690474)).jU(16).a(TextUtils.TruncateAt.END).eNR;
    com.tencent.mm.kiss.widget.textview.a.a locala = this.rMO;
    AppMethodBeat.o(40476);
    return locala;
  }

  public final int getViewWidth()
  {
    AppMethodBeat.i(40477);
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
    AppMethodBeat.o(40477);
    return m;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.b
 * JD-Core Version:    0.6.2
 */