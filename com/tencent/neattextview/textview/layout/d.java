package com.tencent.neattextview.textview.layout;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.RelativeSizeSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements b
{
  private static Comparator<Integer> AkA;
  private static final TextPaint Akz;
  private c AkB;
  private char[] AkC;
  private int AkD;
  private float AkE;
  private boolean AkF;
  private float AkG;
  private float AkH;
  private float AkI;
  private RectF AkJ;
  private RectF AkK;
  private LinkedList<Integer> AkL;
  private float AkM;
  private float[] Akb;
  private int Akm;
  public int Ls;
  public int aqm;
  private float mHeight;
  private float mWidth;

  static
  {
    AppMethodBeat.i(3255);
    Akz = new TextPaint(1);
    AkA = new Comparator()
    {
    };
    AppMethodBeat.o(3255);
  }

  public d(c paramc, char[] paramArrayOfChar, int paramInt1, int paramInt2, float paramFloat1, float[] paramArrayOfFloat, float paramFloat2, float paramFloat3, float paramFloat4, TextPaint paramTextPaint, boolean paramBoolean, float paramFloat5, int paramInt3, int paramInt4, float paramFloat6)
  {
    AppMethodBeat.i(3244);
    this.AkG = -1.0F;
    this.AkH = 0.0F;
    this.AkI = 0.0F;
    this.AkJ = new RectF();
    this.AkK = new RectF();
    this.AkL = null;
    this.AkB = paramc;
    this.AkC = paramArrayOfChar;
    this.aqm = paramInt1;
    this.Ls = paramInt2;
    this.AkD = paramInt3;
    this.Akb = paramArrayOfFloat;
    this.AkE = paramFloat4;
    this.AkH = paramFloat5;
    this.AkF = paramBoolean;
    this.mHeight = paramFloat3;
    this.mWidth = paramFloat2;
    this.AkI = paramFloat6;
    this.Akm = paramInt4;
    paramc = paramTextPaint.getFontMetrics();
    paramFloat5 = paramc.leading - paramc.top;
    paramFloat4 = paramc.bottom;
    paramFloat3 = paramc.leading;
    this.AkM = ((this.mHeight - paramc.bottom + paramc.top) / 2.0F + paramFloat1 - paramc.top);
    this.AkJ.set(0.0F, this.AkM - paramFloat5, 0.0F + paramFloat2, paramFloat4 - paramFloat3 + this.AkM);
    this.AkK.set(0.0F, this.AkM - paramFloat5, 0.0F + paramFloat6, this.AkJ.top + this.mHeight);
    AppMethodBeat.o(3244);
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    AppMethodBeat.i(3254);
    this.aqm = paramObjectInputStream.readInt();
    this.Ls = paramObjectInputStream.readInt();
    this.Akb = ((float[])paramObjectInputStream.readObject());
    this.AkJ = new RectF(paramObjectInputStream.readFloat(), paramObjectInputStream.readFloat(), paramObjectInputStream.readFloat(), paramObjectInputStream.readFloat());
    this.AkF = paramObjectInputStream.readBoolean();
    this.AkE = paramObjectInputStream.readFloat();
    this.AkG = paramObjectInputStream.readFloat();
    AppMethodBeat.o(3254);
  }

  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    AppMethodBeat.i(3253);
    paramObjectOutputStream.writeInt(this.aqm);
    paramObjectOutputStream.writeInt(this.Ls);
    paramObjectOutputStream.writeObject(this.Akb);
    paramObjectOutputStream.writeFloat(this.AkJ.left);
    paramObjectOutputStream.writeFloat(this.AkJ.top);
    paramObjectOutputStream.writeFloat(this.AkJ.right);
    paramObjectOutputStream.writeFloat(this.AkJ.bottom);
    paramObjectOutputStream.writeBoolean(this.AkF);
    paramObjectOutputStream.writeFloat(this.AkE);
    paramObjectOutputStream.writeFloat(dPl());
    AppMethodBeat.o(3253);
  }

  public final int QU(int paramInt)
  {
    AppMethodBeat.i(3249);
    int i = this.aqm;
    float f1 = this.AkJ.left + dPl();
    int j = this.aqm;
    int k = this.aqm;
    int m = 0;
    label143: label149: float f2;
    if (k < this.Ls)
    {
      int n = m;
      if (k + 1 < this.Ls)
      {
        n = m;
        if (this.Akb[(k + 1)] != 0.0F)
        {
          n = m;
          if (m != 0)
            break label149;
          if ((!this.AkF) || (this.Akb[(k + 1)] != this.AkH))
            break label143;
        }
        for (m = 1; ; m = 0)
        {
          n = m;
          if (m == 0)
            break label149;
          n = m;
          i++;
          m = n;
          k++;
          break;
        }
      }
      f2 = f1;
      if (n != 0)
        f2 = f1 + this.AkH;
      f1 = f2 + (this.Akb[j] + this.AkE);
      if ((f2 <= paramInt) && (paramInt < f1))
      {
        AppMethodBeat.o(3249);
        paramInt = i;
      }
    }
    while (true)
    {
      return paramInt;
      if (f2 > paramInt)
      {
        paramInt = this.aqm;
        AppMethodBeat.o(3249);
      }
      else if (paramInt > this.AkJ.right)
      {
        if (this.Ls == this.AkC.length)
        {
          paramInt = this.Ls;
          AppMethodBeat.o(3249);
        }
        else
        {
          paramInt = this.Ls - 1;
          AppMethodBeat.o(3249);
        }
      }
      else
      {
        i++;
        m = 0;
        j = k + 1;
        break;
        paramInt = this.Ls;
        AppMethodBeat.o(3249);
      }
    }
  }

  public final void a(Canvas paramCanvas, TextPaint paramTextPaint, float paramFloat)
  {
    AppMethodBeat.i(3245);
    float f1 = dPl();
    Paint.FontMetrics localFontMetrics = paramTextPaint.getFontMetrics();
    float f2 = (this.mHeight - localFontMetrics.bottom + localFontMetrics.top) / 2.0F + paramFloat - localFontMetrics.top;
    int i = this.aqm;
    int j = this.Ls;
    int[] arrayOfInt1 = this.AkB.Akv.AkR;
    int[] arrayOfInt2 = this.AkB.Akv.AkS;
    Object localObject = (LineBackgroundSpan[])this.AkB.Akv.AkQ;
    LinkedList localLinkedList = new LinkedList();
    for (int k = 0; k < this.AkB.Akv.AkP; k++)
      if ((arrayOfInt1[k] < j) && (arrayOfInt2[k] > i))
        localLinkedList.add(localObject[k]);
    localObject = localLinkedList.iterator();
    while (((Iterator)localObject).hasNext())
      ((LineBackgroundSpan)((Iterator)localObject).next()).drawBackground(paramCanvas, paramTextPaint, (int)this.AkJ.left, (int)this.AkJ.right, (int)this.AkJ.top, (int)f2, (int)this.AkJ.bottom, this.AkB.getText(), this.aqm, this.Ls, this.AkD);
    int m = this.aqm;
    k = 0;
    j = this.aqm;
    f1 = 0.0F + f1;
    int n;
    if (j < this.Ls)
    {
      i = k;
      float f3;
      float f4;
      if (j + 1 < this.Ls)
      {
        i = k;
        f3 = f2;
        n = m;
        f4 = f1;
        if (this.Akb[(j + 1)] == 0.0F)
          break label497;
        i = k;
        if (k == 0)
          if ((!this.AkF) || (this.Akb[(j + 1)] != this.AkH))
            break label519;
      }
      label519: for (k = 1; ; k = 0)
      {
        i = k;
        f3 = f2;
        n = m;
        f4 = f1;
        if (k == 0)
        {
          i = k;
          n = j + 1;
          localObject = (ImageSpan)this.AkB.Akp.hS(m, n);
          if (localObject == null)
            break label525;
          Akz.set(paramTextPaint);
          ((ImageSpan)localObject).draw(paramCanvas, "", m, n, f1, 0, (int)f2, (int)(this.mHeight + paramFloat), Akz);
          f4 = f1;
          if (i != 0)
            f4 = f1 + this.AkH;
          i = 0;
          f4 += this.Akb[m] + this.AkE;
          f3 = f2;
        }
        label497: j++;
        k = i;
        f2 = f3;
        m = n;
        f1 = f4;
        break;
      }
      label525: k = 0;
      Akz.set(paramTextPaint);
      localObject = (AbsoluteSizeSpan)this.AkB.Akq.hS(m, n);
      if (localObject != null)
      {
        k = 1;
        ((AbsoluteSizeSpan)localObject).updateDrawState(Akz);
      }
      localObject = (RelativeSizeSpan)this.AkB.Akr.hS(m, n);
      if (localObject != null)
      {
        k = 1;
        ((RelativeSizeSpan)localObject).updateDrawState(Akz);
      }
      localObject = (ForegroundColorSpan)this.AkB.Akt.hS(m, n);
      if (localObject != null)
        ((ForegroundColorSpan)localObject).updateDrawState(Akz);
      localObject = (ClickableSpan)this.AkB.Aku.hS(m, n);
      if (localObject != null)
        ((ClickableSpan)localObject).updateDrawState(Akz);
      if (k == 0)
        break label734;
      f2 = (this.mHeight - localFontMetrics.bottom + localFontMetrics.top) / 2.0F + paramFloat - localFontMetrics.top;
    }
    label734: 
    while (true)
    {
      paramCanvas.drawText(this.AkC, m, n - m, f1, f2, Akz);
      break;
      AppMethodBeat.o(3245);
      return;
    }
  }

  public final float[] dPg()
  {
    return this.Akb;
  }

  public final RectF dPh()
  {
    return this.AkJ;
  }

  public final RectF dPi()
  {
    return this.AkK;
  }

  public final float dPj()
  {
    return this.AkE;
  }

  public final boolean dPk()
  {
    return this.AkF;
  }

  public final float dPl()
  {
    AppMethodBeat.i(3247);
    if (this.AkG != -1.0F)
    {
      f1 = this.AkG;
      AppMethodBeat.o(3247);
      return f1;
    }
    float f2;
    if ((this.Akm & 0x7) == 1)
    {
      int i = this.aqm;
      int j = this.aqm;
      for (f2 = 0.0F; j < this.Ls; f2 = f1)
      {
        int k;
        if (j + 1 < this.Ls)
        {
          k = i;
          f1 = f2;
          if (this.Akb[(j + 1)] == 0.0F);
        }
        else
        {
          f1 = f2 + (this.Akb[i] + this.AkE);
          k = j + 1;
        }
        j++;
        i = k;
      }
    }
    for (float f1 = (this.AkI - f2) / 2.0F; ; f1 = 0.0F)
    {
      f1 = Math.max(0.0F, f1);
      if ((this.AkB.Akp.hS(this.aqm, this.aqm + 1) == null) && (this.AkB.dPp().containsKey(Character.valueOf(this.AkC[this.aqm]))))
      {
        f1 -= ((Float)this.AkB.dPp().get(Character.valueOf(this.AkC[this.aqm]))).floatValue();
        this.AkG = f1;
        AppMethodBeat.o(3247);
        break;
      }
      this.AkG = f1;
      f1 = this.AkG;
      AppMethodBeat.o(3247);
      break;
    }
  }

  public final float dPm()
  {
    return this.AkM;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(3250);
    boolean bool;
    if (paramObject == null)
    {
      AppMethodBeat.o(3250);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((paramObject.getStart() != this.aqm) || (paramObject.getEnd() != this.Ls) || (!paramObject.dPh().equals(this.AkJ)) || (paramObject.dPk() != this.AkF) || (paramObject.dPj() != this.AkE) || (paramObject.dPl() != this.AkG))
        {
          AppMethodBeat.o(3250);
          bool = false;
        }
        else
        {
          for (int i = this.aqm; ; i++)
          {
            if (i >= this.Ls)
              break label174;
            if (this.Akb[i] != paramObject.dPg()[i])
            {
              AppMethodBeat.o(3250);
              bool = false;
              break;
            }
          }
          label174: bool = true;
          AppMethodBeat.o(3250);
        }
      }
      else
      {
        AppMethodBeat.o(3250);
        bool = false;
      }
    }
  }

  public final int getEnd()
  {
    return this.Ls;
  }

  public final float getHeight()
  {
    return this.mHeight;
  }

  public final float getPrimaryHorizontal(int paramInt)
  {
    AppMethodBeat.i(3248);
    float f1 = this.AkJ.left + dPl();
    int i = this.aqm;
    int j = this.aqm;
    int k = 0;
    if ((j < this.Ls) && (j < paramInt))
    {
      int m = k;
      int n;
      float f2;
      if (j + 1 < this.Ls)
      {
        m = k;
        n = i;
        f2 = f1;
        if (this.Akb[(j + 1)] == 0.0F)
          break label183;
        m = k;
        if (k == 0)
          if ((!this.AkF) || (this.Akb[(j + 1)] != this.AkH))
            break label199;
      }
      label183: label199: for (k = 1; ; k = 0)
      {
        m = k;
        n = i;
        f2 = f1;
        if (k == 0)
        {
          m = k;
          f2 = f1;
          if (m != 0)
            f2 = f1 + this.AkH;
          f2 += this.Akb[i] + this.AkE;
          m = 0;
          n = j + 1;
        }
        j++;
        k = m;
        i = n;
        f1 = f2;
        break;
      }
    }
    AppMethodBeat.o(3248);
    return f1;
  }

  public final int getStart()
  {
    return this.aqm;
  }

  public final float getWidth()
  {
    return this.mWidth;
  }

  public final RectF hR(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3246);
    RectF localRectF = new RectF();
    if (paramInt1 >= paramInt2)
      AppMethodBeat.o(3246);
    while (true)
    {
      return localRectF;
      float f1 = dPl();
      for (int i = this.aqm; i < paramInt1; i++)
        f1 += this.Akb[i] + this.AkE;
      float f2 = f1;
      while (paramInt1 < paramInt2)
      {
        f2 += this.Akb[paramInt1] + this.AkE;
        paramInt1++;
      }
      localRectF.set(f1, this.AkJ.top, f2, this.AkJ.bottom);
      AppMethodBeat.o(3246);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(3251);
    int i = this.aqm;
    int j = this.Ls;
    int k = (int)this.mHeight;
    int m = (int)this.mWidth;
    int n = (int)this.AkG;
    int i1 = this.AkJ.hashCode();
    AppMethodBeat.o(3251);
    return i + j + k + m + n + i1;
  }

  public final String toString()
  {
    AppMethodBeat.i(3252);
    String str = "MeasuredLine{mStart=" + this.aqm + ", mEnd=" + this.Ls + ", mLetter=" + this.AkE + ", isSmartLetter=" + this.AkF + ", mHeight=" + this.mHeight + ", mWidth=" + this.mWidth + ", mLeftOffset=" + this.AkG + ", mLineRect=" + this.AkJ + ", mLineRect=" + this.AkK + '}';
    AppMethodBeat.o(3252);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.layout.d
 * JD-Core Version:    0.6.2
 */