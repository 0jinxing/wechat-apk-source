package com.tencent.neattextview.textview.layout;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class c
  implements a
{
  private static final char[] AjX = { '…' };
  private static final String AjY = new String(AjX);
  protected String AjZ;
  protected char[] Aka;
  protected float[] Akb;
  protected float[] Akc;
  protected float[] Akd = new float[com.tencent.neattextview.textview.a.a.AjT.length];
  protected float[] Ake = new float[com.tencent.neattextview.textview.a.a.AjU.length];
  protected HashMap<Character, Float> Akf = new HashMap(com.tencent.neattextview.textview.a.a.AjT.length);
  public ArrayList<b> Akg = new ArrayList();
  private LinkedList<com.tencent.neattextview.textview.b.b> Akh = new LinkedList();
  private float Aki;
  private float Akj;
  private float Akk;
  private float Akl;
  private int Akm;
  private TextPaint Akn = new TextPaint();
  private float[] Ako;
  e<ImageSpan> Akp = new e(ImageSpan.class);
  e<AbsoluteSizeSpan> Akq = new e(AbsoluteSizeSpan.class);
  e<RelativeSizeSpan> Akr = new e(RelativeSizeSpan.class);
  private e<BackgroundColorSpan> Aks = new e(BackgroundColorSpan.class);
  e<ForegroundColorSpan> Akt = new e(ForegroundColorSpan.class);
  e<ClickableSpan> Aku = new e(ClickableSpan.class);
  e<LineBackgroundSpan> Akv = new e(LineBackgroundSpan.class);
  private float Akw = 0.0F;
  private LinkedList<com.tencent.neattextview.textview.b.c> Akx;
  protected boolean[] Aky;
  private int btF = 0;
  protected CharSequence mText;
  protected TextPaint oz;
  private float uSe;

  public c(CharSequence paramCharSequence, float[] paramArrayOfFloat)
  {
    this.mText = paramCharSequence;
    this.AjZ = paramCharSequence.toString();
    this.Aka = this.AjZ.toCharArray();
    if (paramArrayOfFloat != null)
    {
      this.Akb = new float[paramArrayOfFloat.length];
      System.arraycopy(paramArrayOfFloat, 0, this.Akb, 0, paramArrayOfFloat.length);
    }
  }

  private void a(TextUtils.TruncateAt paramTruncateAt, float paramFloat, TextPaint paramTextPaint)
  {
    int i;
    float f;
    if ((paramTruncateAt != null) && (paramTruncateAt != TextUtils.TruncateAt.MARQUEE))
      if ((this.mText != null) && (this.Akg.size() > 0) && (this.mText.length() > ((b)this.Akg.get(this.Akg.size() - 1)).getEnd()))
      {
        i = 1;
        if (i == 0)
          break label290;
        f = paramTextPaint.measureText(AjY) + paramTextPaint.getTextSize() / 6.0F + paramFloat;
        if ((this.btF != 1) || (paramTruncateAt != TextUtils.TruncateAt.MIDDLE))
          break label225;
        paramTruncateAt = (b)this.Akg.get(0);
        i = paramTruncateAt.getStart();
        paramFloat = 0.0F;
        label128: if (i >= paramTruncateAt.getEnd())
          break label219;
        paramFloat += this.Akb[i];
        if (paramFloat < this.uSe / 2.0F)
          break label213;
      }
    while (true)
    {
      label160: paramFloat = 0.0F;
      while (true)
        if (i > 0)
        {
          paramFloat += this.Akb[i];
          if (paramFloat < f)
          {
            this.Akb[i] = 0.0F;
            this.Aka[i] = ((char)0);
            i--;
            continue;
            i = 0;
            break;
            label213: i++;
            break label128;
            label219: i = 0;
            break label160;
            label225: if (paramTruncateAt != TextUtils.TruncateAt.END)
              break label291;
            i = ((b)this.Akg.get(this.Akg.size() - 1)).getEnd() - 1;
            break label160;
          }
        }
      if (i >= 0)
      {
        this.Akb[i] = f;
        this.Aka[i] = ((char)AjX[0]);
      }
      label290: return;
      label291: i = 0;
    }
  }

  private void a(CharSequence paramCharSequence, TextPaint paramTextPaint, boolean[] paramArrayOfBoolean)
  {
    int i = 0;
    Object localObject;
    if ((paramCharSequence instanceof Spanned))
    {
      localObject = (Spanned)paramCharSequence;
      j = paramCharSequence.length();
      this.Akp.a((Spanned)localObject, j);
      this.Akq.a((Spanned)localObject, j);
      this.Akr.a((Spanned)localObject, j);
      this.Akt.a((Spanned)localObject, j);
      this.Aks.a((Spanned)localObject, j);
      this.Aku.a((Spanned)localObject, j);
      this.Akv.a((Spanned)localObject, j);
    }
    this.Akn.set(paramTextPaint);
    int k;
    int m;
    int n;
    for (int j = 0; j < this.Akq.AkP; j++)
    {
      ((AbsoluteSizeSpan[])this.Akq.AkQ)[j].updateMeasureState(this.Akn);
      k = this.Akq.AkR[j];
      m = this.Akq.AkS[j];
      n = m - k;
      paramTextPaint = new float[n];
      this.Akn.getTextWidths(paramCharSequence, k, m, paramTextPaint);
      System.arraycopy(paramTextPaint, 0, this.Akb, k, n);
      if (this.Akc == null)
        this.Akc = new float[paramCharSequence.length()];
      this.Akc[k] = this.Akn.getTextSize();
    }
    for (j = 0; j < this.Akr.AkP; j++)
    {
      ((RelativeSizeSpan[])this.Akr.AkQ)[j].updateMeasureState(this.Akn);
      n = this.Akr.AkR[j];
      k = this.Akr.AkS[j];
      m = k - n;
      paramTextPaint = new float[m];
      this.Akn.getTextWidths(paramCharSequence, n, k, paramTextPaint);
      System.arraycopy(paramTextPaint, 0, this.Akb, n, m);
      if (this.Akc == null)
        this.Akc = new float[paramCharSequence.length()];
      this.Akc[n] = this.Akn.getTextSize();
    }
    for (j = 0; j < this.Akp.AkP; j++)
    {
      paramTextPaint = ((ImageSpan[])this.Akp.AkQ)[j];
      m = this.Akp.AkR[j];
      k = this.Akp.AkS[j];
      paramTextPaint = paramTextPaint.getDrawable();
      localObject = new Rect();
      if (paramTextPaint != null)
        ((Rect)localObject).set(paramTextPaint.getBounds());
      this.Akb[m] = ((Rect)localObject).width();
      paramArrayOfBoolean[m] = true;
      for (n = m + 1; (n < m + (k - m)) && (n < this.Akb.length); n++)
      {
        this.Akb[n] = 0.0F;
        paramArrayOfBoolean[n] = true;
      }
      if (this.Akc == null)
        this.Akc = new float[paramCharSequence.length()];
      this.Akc[m] = ((Rect)localObject).height();
    }
    for (j = 0; ; j++)
    {
      n = i;
      if (j >= this.Aks.AkP)
        break;
      paramCharSequence = ((BackgroundColorSpan[])this.Aks.AkQ)[j];
      m = this.Aks.AkR[j];
      n = this.Aks.AkS[j];
      this.Akh.add(new com.tencent.neattextview.textview.b.a(m, n, paramCharSequence));
    }
    while (n < this.Aku.AkP)
    {
      paramCharSequence = ((ClickableSpan[])this.Aku.AkQ)[n];
      j = this.Aku.AkR[n];
      i = this.Aku.AkS[n];
      this.Akh.add(new com.tencent.neattextview.textview.b.c(j, i, paramCharSequence));
      n++;
    }
  }

  private void d(Paint paramPaint)
  {
    this.Akf.clear();
    Rect localRect = new Rect();
    char[] arrayOfChar = com.tencent.neattextview.textview.a.a.AjT;
    int i = arrayOfChar.length;
    int j = 0;
    int k = 0;
    float f1;
    while (j < i)
    {
      char c = arrayOfChar[j];
      f1 = paramPaint.measureText(String.valueOf(c));
      paramPaint.getTextBounds(String.valueOf(c), 0, 1, localRect);
      float f2 = localRect.right;
      this.Akd[k] = (f1 - f2);
      k++;
      j++;
    }
    arrayOfChar = com.tencent.neattextview.textview.a.a.AjU;
    i = arrayOfChar.length;
    k = 0;
    j = 0;
    if (k < i)
    {
      paramPaint.getTextBounds(String.valueOf(arrayOfChar[k]), 0, 1, localRect);
      if (localRect.left > 0);
      for (f1 = localRect.left; ; f1 = 0.0F)
      {
        this.Ake[j] = f1;
        this.Akf.put(Character.valueOf(com.tencent.neattextview.textview.a.a.AjU[j]), Float.valueOf(f1));
        j++;
        k++;
        break;
      }
    }
  }

  public final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    paramCanvas.save();
    paramCanvas.translate(paramFloat1, paramFloat2);
    paramFloat1 = 0.0F;
    Object localObject = this.Akh.iterator();
    while (((Iterator)localObject).hasNext())
      ((com.tencent.neattextview.textview.b.b)((Iterator)localObject).next()).a(paramCanvas, this.oz, this.Akg);
    Iterator localIterator = this.Akg.iterator();
    while (localIterator.hasNext())
    {
      localObject = (b)localIterator.next();
      ((b)localObject).a(paramCanvas, this.oz, paramFloat1);
      paramFloat1 = ((b)localObject).getHeight() + paramFloat1;
    }
    paramCanvas.restore();
  }

  public final void a(TextPaint paramTextPaint, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt1, TextUtils.TruncateAt paramTruncateAt, float paramFloat6, boolean paramBoolean, int paramInt2)
  {
    this.oz = new TextPaint(paramTextPaint);
    this.Aki = paramFloat2;
    this.uSe = paramFloat1;
    this.Akj = paramFloat3;
    this.Akk = paramFloat4;
    this.btF = paramInt1;
    this.Akl = paramFloat5;
    this.Ako = null;
    this.Akm = paramInt2;
    paramInt2 = this.mText.length();
    if (this.Akb == null)
    {
      this.Akb = new float[paramInt2];
      paramTextPaint.getTextWidths(this.AjZ, this.Akb);
    }
    this.Aky = new boolean[paramInt2];
    a(this.mText, paramTextPaint, this.Aky);
    d(paramTextPaint);
    a(paramTextPaint, paramFloat1, paramInt1, paramBoolean);
    a(paramTruncateAt, paramFloat6, paramTextPaint);
  }

  protected abstract void a(TextPaint paramTextPaint, float paramFloat, int paramInt, boolean paramBoolean);

  protected final void a(char[] paramArrayOfChar, int paramInt1, int paramInt2, float paramFloat1, float[] paramArrayOfFloat, int paramInt3, float paramFloat2, boolean paramBoolean, float paramFloat3, float paramFloat4)
  {
    Paint.FontMetrics localFontMetrics = this.oz.getFontMetrics();
    float f1 = localFontMetrics.bottom - localFontMetrics.top;
    float f2 = f1;
    if (this.Akc != null)
    {
      int i = paramInt1;
      while (true)
      {
        f2 = f1;
        if (i >= paramInt2)
          break;
        f2 = f1;
        if (f1 < this.Akc[i])
          f2 = this.Akc[i];
        i++;
        f1 = f2;
      }
    }
    f1 = f2 + this.Akl;
    paramArrayOfChar = new d(this, paramArrayOfChar, paramInt1, paramInt2, this.Akw, paramArrayOfFloat, paramFloat1, f1, paramFloat2, this.oz, paramBoolean, paramFloat3, paramInt3, this.Akm, paramFloat4);
    this.Akw += f1;
    this.Akg.add(paramArrayOfChar);
  }

  public final void an(CharSequence paramCharSequence)
  {
    a(paramCharSequence, this.oz, this.Aky);
  }

  public int dPe()
  {
    return this.Akg.size();
  }

  public final List<com.tencent.neattextview.textview.b.c> dPf()
  {
    if (this.Akx == null)
    {
      this.Akx = new LinkedList();
      Iterator localIterator = this.Akh.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.neattextview.textview.b.b localb = (com.tencent.neattextview.textview.b.b)localIterator.next();
        if (localb.getClass() == com.tencent.neattextview.textview.b.c.class)
          this.Akx.add((com.tencent.neattextview.textview.b.c)localb);
      }
    }
    return this.Akx;
  }

  public final float[] dPg()
  {
    return this.Akb;
  }

  public final String dPn()
  {
    return this.AjZ;
  }

  public final float[] dPo()
  {
    if (this.Ako == null)
    {
      Iterator localIterator = this.Akg.iterator();
      float f1 = 0.0F;
      float f2 = 0.0F;
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        float f3 = f1;
        if (f1 < localb.getWidth())
          f3 = localb.getWidth();
        f2 = localb.getHeight() + f2;
        f1 = f3;
      }
      this.Ako = new float[] { f1, f2 };
    }
    return this.Ako;
  }

  public final HashMap<Character, Float> dPp()
  {
    return this.Akf;
  }

  public final int getLineBaseline(int paramInt)
  {
    int i = this.Akg.size();
    b localb;
    if (i > paramInt)
      localb = (b)this.Akg.get(paramInt);
    for (paramInt = (int)localb.dPm(); ; paramInt = 0)
    {
      return paramInt;
      if (i > 0)
      {
        localb = (b)this.Akg.get(i - 1);
        break;
      }
    }
  }

  public final int getLineBottom(int paramInt)
  {
    int i = this.Akg.size();
    b localb;
    if (i > paramInt)
      localb = (b)this.Akg.get(paramInt);
    for (paramInt = (int)localb.dPh().bottom; ; paramInt = 0)
    {
      return paramInt;
      if (i > 0)
      {
        localb = (b)this.Akg.get(i - 1);
        break;
      }
    }
  }

  public final int getLineForOffset(int paramInt)
  {
    Iterator localIterator = this.Akg.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if ((localb.getStart() > paramInt) || (paramInt >= localb.getEnd()));
    }
    while (true)
    {
      return i;
      i++;
      break;
      i--;
    }
  }

  public final int getLineForVertical(int paramInt)
  {
    int i = (int)(paramInt - this.Akk);
    Iterator localIterator = this.Akg.iterator();
    float f1 = 0.0F;
    paramInt = 0;
    float f2;
    if (localIterator.hasNext())
    {
      Object localObject = (b)localIterator.next();
      f2 = f1;
      if (f1 == 0.0F)
        f2 = ((b)localObject).dPi().top;
      localObject = ((b)localObject).dPi();
      if (!((RectF)localObject).contains(((RectF)localObject).centerX(), i));
    }
    while (true)
    {
      return paramInt;
      paramInt++;
      f1 = f2;
      break;
      if (i <= f1)
        paramInt = 0;
      else
        paramInt--;
    }
  }

  public final float getLineRight(int paramInt)
  {
    if (this.Akg.size() > paramInt);
    for (float f = ((b)this.Akg.get(paramInt)).dPh().right; ; f = 0.0F)
      return f;
  }

  public final int getLineStart(int paramInt)
  {
    if (this.Akg.size() > paramInt);
    for (paramInt = ((b)this.Akg.get(paramInt)).getStart(); ; paramInt = this.Aka.length)
      return paramInt;
  }

  public final int getLineTop(int paramInt)
  {
    int i = this.Akg.size();
    b localb;
    if (i > paramInt)
      localb = (b)this.Akg.get(paramInt);
    for (paramInt = (int)localb.dPh().top; ; paramInt = 0)
    {
      return paramInt;
      if (i > 0)
      {
        localb = (b)this.Akg.get(i - 1);
        break;
      }
    }
  }

  public final float getLineWidth(int paramInt)
  {
    if (this.Akg.size() > paramInt);
    for (float f = ((b)this.Akg.get(paramInt)).dPh().width(); ; f = 0.0F)
      return f;
  }

  public final int getOffsetForHorizontal(int paramInt, float paramFloat)
  {
    float f = this.Akj;
    if (this.Akg.size() > paramInt);
    for (paramInt = ((b)this.Akg.get(paramInt)).QU((int)(paramFloat - f)); ; paramInt = 0)
      return paramInt;
  }

  public final float getPrimaryHorizontal(int paramInt)
  {
    int i = getLineForOffset(paramInt);
    if (i < 0);
    for (float f = 0.0F; ; f = ((b)this.Akg.get(i)).getPrimaryHorizontal(paramInt))
      return f;
  }

  public final CharSequence getText()
  {
    return this.mText;
  }

  public final TextPaint getTextPaint()
  {
    return this.oz;
  }

  public final int hQ(int paramInt1, int paramInt2)
  {
    paramInt1 = (int)(paramInt1 - this.Akj);
    paramInt2 = (int)(paramInt2 - this.Akk);
    Iterator localIterator = this.Akg.iterator();
    b localb;
    do
    {
      if (!localIterator.hasNext())
        break;
      localb = (b)localIterator.next();
    }
    while (!localb.dPi().contains(paramInt1, paramInt2));
    for (paramInt1 = localb.QU(paramInt1); ; paramInt1 = this.Aka.length)
      return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.layout.c
 * JD-Core Version:    0.6.2
 */