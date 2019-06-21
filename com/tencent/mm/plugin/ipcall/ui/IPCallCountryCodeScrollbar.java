package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.base.o;

public class IPCallCountryCodeScrollbar extends View
{
  public static final String[] nBP = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
  private Paint aFY;
  private int biG;
  private float eOg;
  private float faL;
  protected float nBQ;
  protected int nBR;
  protected String[] nBS;
  private float nBT;
  private o nBU;
  private TextView nBV;
  private int nBW;
  private IPCallCountryCodeScrollbar.a nBX;

  public IPCallCountryCodeScrollbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(22108);
    this.nBT = 0.0F;
    this.nBS = new String[] { "↑" };
    this.nBQ = 1.3F;
    this.nBR = 79;
    setFocusable(true);
    setFocusableInTouchMode(true);
    this.nBW = BackwardSupportUtil.b.b(paramContext, 3.0F);
    paramAttributeSet = inflate(paramContext, getToastLayoutId(), null);
    int i = BackwardSupportUtil.b.b(paramContext, this.nBR);
    this.nBU = new o(paramAttributeSet, i, i);
    this.nBV = ((TextView)paramAttributeSet.findViewById(2131827560));
    this.aFY = new Paint();
    this.aFY.setAntiAlias(true);
    this.aFY.setColor(-11119018);
    this.aFY.setTextAlign(Paint.Align.CENTER);
    AppMethodBeat.o(22108);
  }

  public final void Pf(String paramString)
  {
    AppMethodBeat.i(22107);
    String[] arrayOfString1 = nBP;
    int i = arrayOfString1.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      if (arrayOfString1[j].equals(paramString))
        k = 1;
      j++;
    }
    if (k == 0)
      paramString = "#";
    i = this.nBS.length + 1;
    String[] arrayOfString2 = new String[i];
    String[] arrayOfString3 = this.nBS;
    int m = arrayOfString3.length;
    k = 0;
    j = 0;
    if (k < m)
    {
      arrayOfString1 = arrayOfString3[k];
      if (arrayOfString1.equals(paramString))
        AppMethodBeat.o(22107);
    }
    while (true)
    {
      return;
      arrayOfString2[j] = arrayOfString1;
      k++;
      j++;
      break;
      arrayOfString2[(i - 1)] = paramString;
      this.nBS = arrayOfString2;
      AppMethodBeat.o(22107);
    }
  }

  protected int getToastLayoutId()
  {
    return 2130970675;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(22109);
    super.onDraw(paramCanvas);
    int k = getMeasuredHeight();
    int m = getMeasuredWidth();
    this.eOg = (k / (this.nBS.length * this.nBQ));
    int n = getResources().getDimensionPixelSize(2131427813);
    if (this.eOg > n)
      this.eOg = n;
    this.aFY.setTextSize(this.eOg);
    if (this.nBT != this.eOg)
    {
      this.nBT = this.eOg;
      post(new IPCallCountryCodeScrollbar.1(this, m, k));
    }
    if (this.eOg == n)
    {
      float f = (k - this.nBS.length * this.eOg * this.nBQ) / 2.0F;
      for (i = j; i < this.nBS.length; i++)
        paramCanvas.drawText(this.nBS[i], m / 2.0F, this.eOg + f + i * this.eOg * this.nBQ, this.aFY);
      AppMethodBeat.o(22109);
    }
    while (true)
    {
      return;
      while (i < this.nBS.length)
      {
        paramCanvas.drawText(this.nBS[i], m / 2.0F, this.eOg + i * this.eOg * this.nBQ, this.aFY);
        i++;
      }
      AppMethodBeat.o(22109);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(22110);
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2))
    {
      this.faL = paramMotionEvent.getY();
      if (this.faL < 0.0F)
        this.faL = 0.0F;
      if (this.faL > getMeasuredHeight())
        this.faL = getMeasuredHeight();
      setBackgroundDrawable(a.g(getContext(), 2130840089));
      float f1 = this.faL;
      float f2 = this.eOg * this.nBQ;
      int i = (int)((f1 - (getMeasuredHeight() - this.nBS.length * f2) / 2.0F) / f2);
      int j = i;
      if (i < 0)
        j = 0;
      i = j;
      if (j >= this.nBS.length)
        i = this.nBS.length - 1;
      this.biG = i;
      if (this.biG != -1)
        break label259;
      this.nBV.setText(2131302792);
      this.nBU.showAtLocation(this, 17, 0, 0);
      if (this.nBX != null)
      {
        if (this.biG != -1)
          break label278;
        this.nBX.kp(a.an(getContext(), 2131302792));
      }
    }
    while (true)
    {
      invalidate();
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        setBackgroundResource(0);
        this.nBU.dismiss();
      }
      AppMethodBeat.o(22110);
      return true;
      label259: this.nBV.setText(this.nBS[this.biG]);
      break;
      label278: this.nBX.kp(this.nBS[this.biG]);
    }
  }

  public void setOnScrollBarTouchListener(IPCallCountryCodeScrollbar.a parama)
  {
    this.nBX = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar
 * JD-Core Version:    0.6.2
 */