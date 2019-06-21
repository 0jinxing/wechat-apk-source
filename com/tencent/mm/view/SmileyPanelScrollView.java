package com.tencent.mm.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class SmileyPanelScrollView extends View
{
  private static boolean DEBUG = false;
  private int AaA;
  private boolean AaB;
  private boolean AaC;
  public int AaD;
  public int AaE;
  public float AaF;
  public boolean AaG;
  private boolean AaH;
  public int AaI;
  private int AaJ;
  private SmileyPanelScrollView.a AaK;
  private b Aak;
  private com.tencent.mm.view.f.a Aal;
  private Drawable Aam;
  private Drawable Aan;
  private Drawable Aao;
  private Drawable Aap;
  private int Aaq;
  public int Aar;
  private int Aas;
  private Paint Aat;
  private int Aau;
  private int Aav;
  private int Aaw;
  private int Aax;
  private int Aay;
  private int Aaz;
  private int STATE_NONE;
  private Context mContext;
  private int mHeight;
  private int mState;
  private int mWidth;
  private int xJ;
  private int xM;

  public SmileyPanelScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62944);
    this.AaB = false;
    this.AaC = false;
    this.AaD = -1;
    this.AaE = -1;
    this.AaG = false;
    this.AaH = false;
    this.AaI = 0;
    this.AaJ = 1;
    this.STATE_NONE = 0;
    this.mState = this.STATE_NONE;
    this.AaK = new SmileyPanelScrollView.a(this);
    init(paramContext);
    AppMethodBeat.o(62944);
  }

  public SmileyPanelScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62945);
    this.AaB = false;
    this.AaC = false;
    this.AaD = -1;
    this.AaE = -1;
    this.AaG = false;
    this.AaH = false;
    this.AaI = 0;
    this.AaJ = 1;
    this.STATE_NONE = 0;
    this.mState = this.STATE_NONE;
    this.AaK = new SmileyPanelScrollView.a(this);
    init(paramContext);
    AppMethodBeat.o(62945);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(62946);
    this.mContext = paramContext;
    this.Aam = com.tencent.mm.svg.a.a.f(getResources(), 2131231944);
    this.Aao = this.mContext.getResources().getDrawable(2130840238);
    this.Aan = this.mContext.getResources().getDrawable(2130840237);
    this.Aap = this.mContext.getResources().getDrawable(2130840240);
    this.Aau = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 12);
    this.Aav = this.Aan.getIntrinsicHeight();
    this.Aaw = this.Aan.getIntrinsicWidth();
    this.Aax = this.Aap.getIntrinsicHeight();
    this.Aaz = this.Aao.getIntrinsicHeight();
    this.AaA = this.Aao.getIntrinsicWidth();
    ab.d("MicroMsg.SmileyPanelScrollView", "init mDotPadding:%d mDotHeight:%d mDotWidth:%d", new Object[] { Integer.valueOf(this.Aau), Integer.valueOf(this.Aav), Integer.valueOf(this.Aaw) });
    this.Aat = new Paint();
    this.Aat.setColor(-65536);
    this.Aat.setAntiAlias(true);
    this.Aat.setTextAlign(Paint.Align.CENTER);
    this.mWidth = getMeasuredWidth();
    this.mHeight = getMeasuredHeight();
    this.Aas = (this.Aay / (this.Aaw + this.Aau));
    ab.d("MicroMsg.SmileyPanelScrollView", "init mWidth:%d mHeight:%d mTrackWidth:%d mMaxDot:%d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.Aay), Integer.valueOf(this.Aas) });
    AppMethodBeat.o(62946);
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(62948);
    super.draw(paramCanvas);
    SmileyPanelScrollView.a locala = this.AaK;
    int i;
    if (locala.AaM.getState() != locala.AaM.AaJ)
    {
      i = 102;
      if (this.Aaq <= this.Aas)
        break label500;
      this.AaB = true;
      j = (this.mHeight - this.Aax) / 2;
      k = (this.mWidth - this.Aay) / 2;
      this.xJ = (k - this.AaA / 2);
      this.xM = (this.xJ + this.Aay + this.AaA);
      if (DEBUG)
      {
        paramCanvas.drawLine(this.xJ, 0.0F, this.xJ, this.mHeight, this.Aat);
        paramCanvas.drawLine(this.xM, 0.0F, this.xM, this.mHeight, this.Aat);
      }
      this.Aap.setBounds(k, j, this.Aay + k, this.Aax + j);
      this.Aap.setAlpha(i);
      this.Aap.draw(paramCanvas);
      j = (this.mHeight - this.Aaz) / 2;
      if ((!this.AaC) && (!this.AaG))
        break label387;
      k = this.Aay / (this.Aaq - 1) * this.Aar + k - this.AaA / 2;
    }
    while (true)
    {
      this.Aao.setBounds(k, j, this.AaA + k, this.Aaz + j);
      this.Aao.draw(paramCanvas);
      if ((getState() == this.AaJ) && (i < 255))
        invalidate();
      AppMethodBeat.o(62948);
      return;
      long l = SystemClock.uptimeMillis();
      if (l > locala.mStartTime + locala.AaL)
        k = 255;
      while (true)
      {
        i = k;
        break;
        i = (int)((l - locala.mStartTime) * 153L / locala.AaL) + 102;
        k = i;
        if (i < 102)
          k = 102;
      }
      label387: if (this.AaE == this.AaD)
        k = this.Aay / (this.Aaq - 1) * this.AaD + k - this.AaA / 2 + (int)(this.Aay / (this.Aaq - 1) * this.AaF);
      else
        k = this.Aay / (this.Aaq - 1) * this.AaD + k - this.AaA / 2 - (int)(this.Aay / (this.Aaq - 1) * (1.0F - this.AaF));
    }
    label500: this.AaB = false;
    int j = (this.mHeight - this.Aav) / 2;
    int k = (this.mWidth - ((this.Aau + this.Aaw) * (this.Aaq - 1) + this.Aaw)) / 2;
    this.xJ = (k - (this.AaA - this.Aaw) / 2);
    this.xM = (this.xJ + this.Aaw * this.Aaq + this.Aau * (this.Aaq - 1) + (this.AaA - this.Aaw));
    if (DEBUG)
    {
      paramCanvas.drawLine(this.xJ, 0.0F, this.xJ, this.mHeight, this.Aat);
      paramCanvas.drawLine(this.xM, 0.0F, this.xM, this.mHeight, this.Aat);
    }
    this.Aan.setBounds(k, j, this.Aaw + k, this.Aav + j);
    int m = (this.Aam.getIntrinsicWidth() - this.Aaw) / 2;
    int n = (this.Aam.getIntrinsicHeight() - this.Aav) / 2;
    this.Aam.setBounds(k - m, j - n, m + (this.Aaw + k), n + (this.Aav + j));
    j = (this.mHeight - this.Aaz) / 2;
    if ((this.AaC) || (this.AaG))
    {
      k -= (this.AaA - this.Aaw) / 2;
      this.Aao.setBounds(k, j, this.AaA + k, this.Aaz + j);
      j = 0;
      label825: if (j >= this.Aaq)
        break label958;
      paramCanvas.save();
      if (j > 0)
        paramCanvas.translate((this.Aaw + this.Aau) * j, 0.0F);
      if ((j != 0) || (!this.AaH))
        break label939;
      this.Aam.draw(paramCanvas);
    }
    while (true)
    {
      paramCanvas.restore();
      j++;
      break label825;
      k = k - (this.AaA - this.Aaw) / 2 + (int)((this.Aaw + this.Aau) * (this.AaE - this.AaD + this.AaF));
      break;
      label939: this.Aan.setAlpha(i);
      this.Aan.draw(paramCanvas);
    }
    label958: if (this.AaD > this.Aaq - 1)
      this.AaD = (this.Aaq - 1);
    j = (this.Aaw + this.Aau) * this.AaD;
    if (k + j > this.xM)
    {
      k = 0;
      ab.i("MicroMsg.SmileyPanelScrollView", "over right.");
    }
    while (true)
    {
      paramCanvas.save();
      paramCanvas.translate(k, 0.0F);
      this.Aao.draw(paramCanvas);
      paramCanvas.restore();
      break;
      k = j;
    }
  }

  public final void f(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(62947);
    ab.d("MicroMsg.SmileyPanelScrollView", "setDot dotCount:%d selectDot:%d force:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean1) });
    this.Aaq = paramInt1;
    if (paramInt2 < 0)
      paramInt1 = 0;
    while (true)
    {
      this.Aar = paramInt1;
      if ((this.AaE == -1) || (paramBoolean1) || (this.AaI == 0))
        this.AaE = this.Aar;
      if ((this.AaD == -1) || (paramBoolean1) || (this.AaI == 0))
      {
        this.AaD = this.Aar;
        this.AaF = 0.0F;
      }
      this.AaH = paramBoolean2;
      invalidate();
      AppMethodBeat.o(62947);
      return;
      paramInt1 = paramInt2;
      if (paramInt2 > this.Aaq)
        paramInt1 = this.Aaq;
    }
  }

  public int getState()
  {
    return this.mState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(62949);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != this.mWidth)
    {
      this.mWidth = getMeasuredWidth();
      this.mHeight = getMeasuredHeight();
      this.Aay = (this.mWidth - (this.Aal.getColumnWidth() - this.Aal.Aed) - com.tencent.mm.bz.a.al(this.mContext, 2131427863) * 2);
      this.Aas = (this.Aay / (this.Aaw + this.Aau));
      ab.d("MicroMsg.SmileyPanelScrollView", "onSizeChanged mWidth:%d mHeight:%d mTrackWidth:%d mMaxDot:%d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.Aay), Integer.valueOf(this.Aas) });
      if (this.mHeight == 0)
      {
        ab.i("MicroMsg.SmileyPanelScrollView", "user default height");
        this.mHeight = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 16);
      }
    }
    AppMethodBeat.o(62949);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(62950);
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    boolean bool;
    if ((j < this.xJ - this.Aau) || (j > this.xM + this.Aau))
    {
      ab.d("MicroMsg.SmileyPanelScrollView", "over x :%d mLeft:%d mRight:%d ", new Object[] { Integer.valueOf(j), Integer.valueOf(this.xJ), Integer.valueOf(this.xM) });
      if (i == 0)
      {
        bool = super.onTouchEvent(paramMotionEvent);
        AppMethodBeat.o(62950);
        return bool;
      }
    }
    for (int k = 1; ; k = 0)
    {
      int m;
      if (k == 0)
      {
        m = j;
        if (j < this.xJ)
          m = this.xJ;
        j = m;
        if (m > this.xM)
          j = this.xM;
        if (this.AaB)
        {
          m = this.Aay / (this.Aaq - 1);
          m = (j - this.xJ) / m;
          label175: j = m;
          if (m > this.Aaq - 1)
            j = this.Aaq - 1;
          this.Aak.Qz(j);
          this.AaD = j;
          this.AaE = j;
        }
      }
      else
      {
        switch (i)
        {
        default:
        case 0:
        case 2:
        case 1:
        case 3:
        }
      }
      while (true)
      {
        AppMethodBeat.o(62950);
        bool = true;
        break;
        m = (j - this.xJ + this.Aau) / (this.Aaw + this.Aau);
        break label175;
        if (k == 0)
        {
          this.AaC = true;
          this.AaG = true;
          setState(this.AaJ);
          this.AaK.dMJ();
          invalidate();
          continue;
          if ((k == 0) && (getState() != this.AaJ))
          {
            setState(this.AaJ);
            this.AaK.dMJ();
            invalidate();
            continue;
            setState(this.STATE_NONE);
            this.AaC = false;
            invalidate();
          }
        }
      }
    }
  }

  public void setOnPageSelectListener(b paramb)
  {
    this.Aak = paramb;
  }

  public void setSmileyPanelStg(com.tencent.mm.view.f.a parama)
  {
    this.Aal = parama;
  }

  public void setState(int paramInt)
  {
    this.mState = paramInt;
  }

  public static abstract interface b
  {
    public abstract void Qz(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyPanelScrollView
 * JD-Core Version:    0.6.2
 */