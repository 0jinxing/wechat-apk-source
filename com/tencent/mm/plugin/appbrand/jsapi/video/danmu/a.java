package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements d
{
  private static int iaK;
  private static int iaL;
  private int MW;
  private int acq;
  private int acy;
  private StaticLayout eNO;
  private SpannableString iaM;
  private int iaN;
  private int iaO;
  private int iaP;
  private int iaQ;
  private int iaR;
  private float iaS;
  private Context mContext;

  public a(Context paramContext, SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126593);
    this.iaP = -1;
    this.MW = -1;
    this.mContext = paramContext;
    this.iaM = paramSpannableString;
    this.iaQ = b.E(this.mContext, b.iaT);
    this.MW = paramInt1;
    this.iaS = 3.0F;
    this.iaR = paramInt2;
    paramSpannableString = new TextPaint();
    paramSpannableString.setAntiAlias(true);
    paramSpannableString.setColor(this.MW);
    paramSpannableString.setTextSize(this.iaQ);
    paramContext = paramSpannableString.getFontMetrics();
    this.acy = ((int)Math.ceil(paramContext.descent - paramContext.top) + 2);
    this.eNO = new StaticLayout(this.iaM, paramSpannableString, (int)Layout.getDesiredWidth(this.iaM, 0, this.iaM.length(), paramSpannableString) + 1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    this.acq = this.eNO.getWidth();
    AppMethodBeat.o(126593);
  }

  public final boolean a(d paramd)
  {
    boolean bool = true;
    AppMethodBeat.i(126596);
    if (paramd.getWidth() + paramd.getCurrX() > iaK)
      AppMethodBeat.o(126596);
    while (true)
    {
      return bool;
      if (this.iaP < 0)
        this.iaP = b.E(this.mContext, 20);
      if (paramd.aGa() >= this.iaS)
      {
        if ((paramd.aGa() == this.iaS) && (iaK - (paramd.getCurrX() + paramd.getWidth()) < this.iaP))
        {
          AppMethodBeat.o(126596);
        }
        else
        {
          AppMethodBeat.o(126596);
          bool = false;
        }
      }
      else if ((paramd.getCurrX() + paramd.getWidth()) / (paramd.aGa() * b.aGd()) * this.iaS * b.aGd() > iaK - this.iaP * 1.5D)
      {
        AppMethodBeat.o(126596);
      }
      else
      {
        AppMethodBeat.o(126596);
        bool = false;
      }
    }
  }

  public final float aGa()
  {
    return this.iaS;
  }

  public final boolean aGb()
  {
    AppMethodBeat.i(126595);
    boolean bool;
    if ((this.iaN < 0) && (Math.abs(this.iaN) > this.acq))
    {
      bool = true;
      AppMethodBeat.o(126595);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(126595);
    }
  }

  public final int aGc()
  {
    return this.iaR;
  }

  public final void b(Canvas paramCanvas, boolean paramBoolean)
  {
    AppMethodBeat.i(126594);
    int i = paramCanvas.getWidth();
    int j = paramCanvas.getHeight();
    if ((i != iaK) || (j != iaL))
    {
      iaK = i;
      iaL = j;
    }
    paramCanvas.save();
    paramCanvas.translate(this.iaN, this.iaO);
    this.eNO.draw(paramCanvas);
    paramCanvas.restore();
    if (!paramBoolean)
      this.iaN = ((int)(this.iaN - b.aGd() * this.iaS));
    AppMethodBeat.o(126594);
  }

  public final void dg(int paramInt1, int paramInt2)
  {
    this.iaN = paramInt1;
    this.iaO = paramInt2;
  }

  public final int getCurrX()
  {
    return this.iaN;
  }

  public final int getWidth()
  {
    return this.acq;
  }

  public final boolean oB(int paramInt)
  {
    boolean bool = false;
    if (paramInt < this.iaR);
    while (true)
    {
      return bool;
      if (paramInt - this.iaR <= b.iaU)
        bool = true;
    }
  }

  public final boolean oC(int paramInt)
  {
    if (paramInt - this.iaR > b.iaU);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.danmu.a
 * JD-Core Version:    0.6.2
 */