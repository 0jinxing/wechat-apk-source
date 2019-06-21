package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
{
  protected boolean isAnimating;
  protected int oIe;
  protected ValueAnimator.AnimatorUpdateListener uCA;
  protected ValueAnimator.AnimatorUpdateListener uCB;
  protected ValueAnimator.AnimatorUpdateListener uCC;
  protected int uCj;
  protected int uCk;
  protected int uCl;
  protected int uCm;
  protected View uCn;
  protected View uCo;
  protected View uCp;
  protected View uCq;
  protected View uCr;
  protected View uCs;
  protected View uCt;
  protected View uCu;
  protected View uCv;
  protected float[][] uCw;
  protected b uCx;
  protected a.a uCy;
  protected ValueAnimator.AnimatorUpdateListener uCz;

  public a(Context paramContext, View paramView1, View paramView2, View paramView3, View paramView4, View paramView5, View paramView6, View paramView7, View paramView8, View paramView9)
  {
    AppMethodBeat.i(8571);
    this.uCx = b.uCH;
    this.uCz = new a.3(this);
    this.uCA = new a.4(this);
    this.uCB = new a.5(this);
    this.uCC = new a.6(this);
    this.uCj = (com.tencent.mm.bz.a.fromDPToPix(paramContext, 48) / 2);
    this.oIe = ((int)paramContext.getResources().getDimension(2131428689));
    this.uCw = new float[3][2];
    this.uCn = paramView1;
    this.uCo = paramView2;
    this.uCp = paramView3;
    this.uCq = paramView4;
    this.uCr = paramView5;
    this.uCs = paramView6;
    this.uCt = paramView7;
    this.uCu = paramView8;
    this.uCv = paramView9;
    this.uCn.post(new a.1(this, paramView1));
    this.uCu.post(new a.2(this, paramView8));
    AppMethodBeat.o(8571);
  }

  public final void JG(int paramInt)
  {
    this.uCw[0][0] = paramInt;
  }

  public final void a(a.a parama)
  {
    this.uCy = parama;
  }

  public final void a(b paramb)
  {
    this.uCx = paramb;
  }

  public void b(b paramb)
  {
    AppMethodBeat.i(8572);
    if (paramb == this.uCx)
    {
      AppMethodBeat.o(8572);
      return;
    }
    switch (7.uCG[paramb.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      this.uCx = paramb;
      AppMethodBeat.o(8572);
      break;
      dbQ();
      continue;
      dbR();
    }
  }

  protected void dbQ()
  {
  }

  protected void dbR()
  {
  }

  public static enum b
  {
    static
    {
      AppMethodBeat.i(8570);
      uCH = new b("Init", 0);
      uCI = new b("Search", 1);
      uCJ = new b[] { uCH, uCI };
      AppMethodBeat.o(8570);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.a
 * JD-Core Version:    0.6.2
 */