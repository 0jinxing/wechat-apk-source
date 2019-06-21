package com.google.android.exoplayer2.f.a;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.List;

final class c$a
{
  public static final int blU;
  public static final int blV;
  public static final int blW;
  static final int[] blX;
  private static final int[] blY;
  private static final int[] blZ;
  private static final boolean[] bma;
  static final int[] bmb;
  private static final int[] bmc;
  private static final int[] bmd;
  static final int[] bme;
  boolean aIB;
  private int backgroundColor;
  final List<SpannableString> blI;
  private final SpannableStringBuilder blJ;
  private int blL;
  boolean bmf;
  boolean bmg;
  int bmh;
  int bmi;
  int bmj;
  boolean bmk;
  private int bml;
  int bmm;
  int bmn;
  private int bmo;
  private int bmp;
  private int bmq;
  private int bmr;
  private int foregroundColor;
  int priority;
  int row;
  int rowCount;

  static
  {
    AppMethodBeat.i(95593);
    blU = m(2, 2, 2, 0);
    blV = m(0, 0, 0, 0);
    blW = m(0, 0, 0, 3);
    blX = new int[] { 0, 0, 0, 0, 0, 2, 0 };
    blY = new int[] { 0, 0, 0, 0, 0, 0, 2 };
    blZ = new int[] { 3, 3, 3, 3, 3, 3, 1 };
    bma = new boolean[] { 0, 0, 0, 1, 1, 1, 0 };
    bmb = new int[] { blV, blW, blV, blV, blW, blV, blV };
    bmc = new int[] { 0, 1, 2, 3, 4, 3, 4 };
    bmd = new int[] { 0, 0, 0, 0, 0, 3, 3 };
    bme = new int[] { blV, blV, blV, blV, blV, blW, blW };
    AppMethodBeat.o(95593);
  }

  public c$a()
  {
    AppMethodBeat.i(95581);
    this.blI = new LinkedList();
    this.blJ = new SpannableStringBuilder();
    reset();
    AppMethodBeat.o(95581);
  }

  public static int m(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 255;
    AppMethodBeat.i(95592);
    a.bh(paramInt1, 4);
    a.bh(paramInt2, 4);
    a.bh(paramInt3, 4);
    a.bh(paramInt4, 4);
    switch (paramInt4)
    {
    default:
      paramInt4 = 255;
      if (paramInt1 > 1)
      {
        paramInt1 = 255;
        label77: if (paramInt2 <= 1)
          break label132;
        paramInt2 = 255;
        label86: if (paramInt3 <= 1)
          break label137;
      }
      break;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    label132: label137: for (paramInt3 = i; ; paramInt3 = 0)
    {
      paramInt1 = Color.argb(paramInt4, paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(95592);
      return paramInt1;
      paramInt4 = 255;
      break;
      paramInt4 = 127;
      break;
      paramInt4 = 0;
      break;
      paramInt1 = 0;
      break label77;
      paramInt2 = 0;
      break label86;
    }
  }

  public static int s(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(95591);
    paramInt1 = m(paramInt1, paramInt2, paramInt3, 0);
    AppMethodBeat.o(95591);
    return paramInt1;
  }

  private SpannableString sT()
  {
    AppMethodBeat.i(95589);
    Object localObject = new SpannableStringBuilder(this.blJ);
    int i = ((SpannableStringBuilder)localObject).length();
    if (i > 0)
    {
      if (this.bmp != -1)
        ((SpannableStringBuilder)localObject).setSpan(new StyleSpan(2), this.bmp, i, 33);
      if (this.blL != -1)
        ((SpannableStringBuilder)localObject).setSpan(new UnderlineSpan(), this.blL, i, 33);
      if (this.bmq != -1)
        ((SpannableStringBuilder)localObject).setSpan(new ForegroundColorSpan(this.foregroundColor), this.bmq, i, 33);
      if (this.bmr != -1)
        ((SpannableStringBuilder)localObject).setSpan(new BackgroundColorSpan(this.backgroundColor), this.bmr, i, 33);
    }
    localObject = new SpannableString((CharSequence)localObject);
    AppMethodBeat.o(95589);
    return localObject;
  }

  public final void append(char paramChar)
  {
    AppMethodBeat.i(95588);
    if (paramChar == '\n')
    {
      this.blI.add(sT());
      this.blJ.clear();
      if (this.bmp != -1)
        this.bmp = 0;
      if (this.blL != -1)
        this.blL = 0;
      if (this.bmq != -1)
        this.bmq = 0;
      if (this.bmr != -1)
        this.bmr = 0;
      while (((this.bmk) && (this.blI.size() >= this.rowCount)) || (this.blI.size() >= 15))
        this.blI.remove(0);
    }
    this.blJ.append(paramChar);
    AppMethodBeat.o(95588);
  }

  public final void be(int paramInt1, int paramInt2)
  {
    this.bmo = paramInt1;
    this.bml = paramInt2;
  }

  public final void bf(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95586);
    if ((this.bmq != -1) && (this.foregroundColor != paramInt1))
      this.blJ.setSpan(new ForegroundColorSpan(this.foregroundColor), this.bmq, this.blJ.length(), 33);
    if (paramInt1 != blU)
    {
      this.bmq = this.blJ.length();
      this.foregroundColor = paramInt1;
    }
    if ((this.bmr != -1) && (this.backgroundColor != paramInt2))
      this.blJ.setSpan(new BackgroundColorSpan(this.backgroundColor), this.bmr, this.blJ.length(), 33);
    if (paramInt2 != blV)
    {
      this.bmr = this.blJ.length();
      this.backgroundColor = paramInt2;
    }
    AppMethodBeat.o(95586);
  }

  public final void clear()
  {
    AppMethodBeat.i(95584);
    this.blI.clear();
    this.blJ.clear();
    this.bmp = -1;
    this.blL = -1;
    this.bmq = -1;
    this.bmr = -1;
    this.row = 0;
    AppMethodBeat.o(95584);
  }

  public final void h(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(95585);
    if (this.bmp != -1)
      if (!paramBoolean1)
      {
        this.blJ.setSpan(new StyleSpan(2), this.bmp, this.blJ.length(), 33);
        this.bmp = -1;
      }
    label133: label139: 
    while (true)
    {
      if (this.blL != -1)
      {
        if (paramBoolean2)
          break label133;
        this.blJ.setSpan(new UnderlineSpan(), this.blL, this.blJ.length(), 33);
        this.blL = -1;
        AppMethodBeat.o(95585);
      }
      while (true)
      {
        return;
        if (!paramBoolean1)
          break label139;
        this.bmp = this.blJ.length();
        break;
        if (paramBoolean2)
          this.blL = this.blJ.length();
        AppMethodBeat.o(95585);
      }
    }
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(95582);
    boolean bool;
    if ((!this.bmf) || ((this.blI.isEmpty()) && (this.blJ.length() == 0)))
    {
      bool = true;
      AppMethodBeat.o(95582);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95582);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(95583);
    clear();
    this.bmf = false;
    this.aIB = false;
    this.priority = 4;
    this.bmg = false;
    this.bmh = 0;
    this.bmi = 0;
    this.bmj = 0;
    this.rowCount = 15;
    this.bmk = true;
    this.bml = 0;
    this.bmm = 0;
    this.bmn = 0;
    this.bmo = blV;
    this.foregroundColor = blU;
    this.backgroundColor = blV;
    AppMethodBeat.o(95583);
  }

  public final void sR()
  {
    AppMethodBeat.i(95587);
    int i = this.blJ.length();
    if (i > 0)
      this.blJ.delete(i - 1, i);
    AppMethodBeat.o(95587);
  }

  public final b sX()
  {
    boolean bool = false;
    AppMethodBeat.i(95590);
    Object localObject;
    if (isEmpty())
    {
      localObject = null;
      AppMethodBeat.o(95590);
      return localObject;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    for (int i = 0; i < this.blI.size(); i++)
    {
      localSpannableStringBuilder.append((CharSequence)this.blI.get(i));
      localSpannableStringBuilder.append('\n');
    }
    localSpannableStringBuilder.append(sT());
    label162: float f1;
    float f2;
    label191: label203: int j;
    switch (this.bml)
    {
    default:
      localObject = new IllegalArgumentException("Unexpected justification value: " + this.bml);
      AppMethodBeat.o(95590);
      throw ((Throwable)localObject);
    case 0:
    case 3:
      localObject = Layout.Alignment.ALIGN_NORMAL;
      if (this.bmg)
      {
        f1 = this.bmi / 99.0F;
        f2 = this.bmh / 99.0F;
        if (this.bmj % 3 != 0)
          break label317;
        i = 0;
        if (this.bmj / 3 != 0)
          break label339;
        j = 0;
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      if (this.bmo != blV)
        bool = true;
      localObject = new b(localSpannableStringBuilder, (Layout.Alignment)localObject, f2 * 0.9F + 0.05F, i, f1 * 0.9F + 0.05F, j, bool, this.bmo, this.priority);
      AppMethodBeat.o(95590);
      break;
      localObject = Layout.Alignment.ALIGN_OPPOSITE;
      break label162;
      localObject = Layout.Alignment.ALIGN_CENTER;
      break label162;
      f1 = this.bmi / 209.0F;
      f2 = this.bmh / 74.0F;
      break label191;
      label317: if (this.bmj % 3 == 1)
      {
        i = 1;
        break label203;
      }
      i = 2;
      break label203;
      label339: if (this.bmj / 3 == 1)
        j = 1;
      else
        j = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.a.c.a
 * JD-Core Version:    0.6.2
 */