package com.tencent.mm.plugin.sns.ui;

import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class TextViewMultilineEllipse$a
{
  float rmA;
  float rmB;
  boolean rmx;
  ArrayList<int[]> rmy;
  float rmz;

  public TextViewMultilineEllipse$a()
  {
    AppMethodBeat.i(39843);
    this.rmx = false;
    this.rmy = new ArrayList();
    AppMethodBeat.o(39843);
  }

  public final int a(String paramString, int paramInt, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(39844);
    paramInt = a(paramString, null, null, -1, paramInt, paramTextPaint);
    AppMethodBeat.o(39844);
    return paramInt;
  }

  public final int a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(39845);
    this.rmy.clear();
    this.rmx = false;
    this.rmz = 0.0F;
    this.rmA = 0.0F;
    this.rmB = 0.0F;
    if (paramInt2 == -1)
    {
      this.rmy.add(new int[] { 0, paramString1.length() });
      paramInt1 = (int)(paramTextPaint.measureText(paramString1) + 0.5F);
      AppMethodBeat.o(39845);
    }
    while (true)
    {
      return paramInt1;
      if (paramString2 != null)
        this.rmA = paramTextPaint.measureText(paramString2);
      if (paramString3 != null)
        this.rmB = paramTextPaint.measureText(paramString3);
      int i = -1;
      float f1 = 0.0F;
      int j = 1;
      int k = 0;
      int m = paramInt2;
      paramInt2 = k;
      if (paramInt2 < paramString1.length())
      {
        k = i;
        if (i == -1)
          k = paramInt2;
        if (this.rmy.size() == paramInt1)
          this.rmx = true;
      }
      else
      {
        if (this.rmx)
        {
          paramString2 = (int[])this.rmy.get(this.rmy.size() - 1);
          this.rmz = paramTextPaint.measureText(paramString1.substring(paramString2[0], paramString2[1] + 1));
        }
        if (this.rmy.size() != 0)
          break label576;
        paramInt1 = 0;
        AppMethodBeat.o(39845);
        continue;
      }
      float f2 = paramTextPaint.measureText(paramString1.charAt(paramInt2));
      i = 0;
      int n;
      label307: int i1;
      int i2;
      if (paramString1.charAt(paramInt2) == '\n')
      {
        i = 1;
        this.rmy.add(new int[] { k, paramInt2 - 1 });
        n = paramInt2;
        if (i == 0)
          break label502;
        paramInt2 = -1;
        f2 = 0.0F;
        i1 = j;
        f1 = f2;
        i = paramInt2;
        i2 = m;
        if (this.rmy.size() == paramInt1 - 1)
        {
          i2 = (int)(m - (this.rmA + this.rmB));
          i1 = 0;
          i = paramInt2;
          f1 = f2;
        }
      }
      while (true)
      {
        paramInt2 = n + 1;
        j = i1;
        m = i2;
        break;
        n = paramInt2;
        if (f1 + f2 < m)
          break label307;
        i = 1;
        if (paramString1.charAt(paramInt2) != ' ')
        {
          n = paramInt2;
          if (j != 0);
        }
        else
        {
          n = paramInt2 - 1;
          this.rmy.add(new int[] { k, n });
          break label307;
        }
        while (paramString1.charAt(n) != ' ')
          n--;
        this.rmy.add(new int[] { k, n });
        break label307;
        label502: f2 = f1 + f2;
        i1 = j;
        f1 = f2;
        i = k;
        i2 = m;
        if (n == paramString1.length() - 1)
        {
          this.rmy.add(new int[] { k, n });
          i1 = j;
          f1 = f2;
          i = k;
          i2 = m;
        }
      }
      label576: if (this.rmy.size() == 1)
      {
        paramInt1 = (int)(paramTextPaint.measureText(paramString1) + 0.5F);
        AppMethodBeat.o(39845);
      }
      else
      {
        AppMethodBeat.o(39845);
        paramInt1 = m;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.TextViewMultilineEllipse.a
 * JD-Core Version:    0.6.2
 */