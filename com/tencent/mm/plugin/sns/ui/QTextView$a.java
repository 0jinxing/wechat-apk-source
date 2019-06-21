package com.tencent.mm.plugin.sns.ui;

import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;

final class QTextView$a
{
  private static HashMap<String, Integer> rmC;
  private String key;
  float rmA;
  float rmB;
  private int rmw;
  boolean rmx;
  ArrayList<int[]> rmy;
  float rmz;

  static
  {
    AppMethodBeat.i(38528);
    rmC = new HashMap();
    AppMethodBeat.o(38528);
  }

  public QTextView$a()
  {
    AppMethodBeat.i(38525);
    this.rmw = 0;
    this.key = "";
    this.rmx = false;
    this.rmy = new ArrayList();
    AppMethodBeat.o(38525);
  }

  public final int a(String paramString, int paramInt, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(38526);
    paramInt = a(paramString, null, null, -1, paramInt, paramTextPaint);
    AppMethodBeat.o(38526);
    return paramInt;
  }

  public final int a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(38527);
    String str = paramString1 + paramString2 + paramString3 + paramInt1 + paramInt2;
    if (str.equals(this.key))
    {
      paramInt1 = this.rmw;
      AppMethodBeat.o(38527);
    }
    while (true)
    {
      return paramInt1;
      this.key = str;
      this.rmy.clear();
      this.rmx = false;
      this.rmz = 0.0F;
      this.rmA = 0.0F;
      this.rmB = 0.0F;
      if (paramInt2 == -1)
      {
        this.rmy.add(new int[] { 0, paramString1.length() });
        this.rmw = ((int)(paramTextPaint.measureText(paramString1) + 0.5F));
        paramInt1 = this.rmw;
        AppMethodBeat.o(38527);
      }
      else
      {
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
            break label675;
          this.rmw = 0;
          paramInt1 = this.rmw;
          AppMethodBeat.o(38527);
          continue;
        }
        float f2 = paramTextPaint.measureText(paramString1.charAt(paramInt2));
        i = 0;
        int n;
        label389: int i1;
        int i2;
        if (paramString1.charAt(paramInt2) == '\n')
        {
          i = 1;
          this.rmy.add(new int[] { k, paramInt2 - 1 });
          n = paramInt2;
          if (i == 0)
            break label601;
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
            break label389;
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
            break label389;
          }
          do
          {
            paramInt2 = n;
            if (paramString1.charAt(n) == ' ')
              break;
            paramInt2 = n - 1;
            n = paramInt2;
          }
          while (paramInt2 != 0);
          this.rmy.add(new int[] { k, paramInt2 });
          n = paramInt2;
          break label389;
          label601: f2 = f1 + f2;
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
        label675: if (this.rmy.size() == 1)
        {
          this.rmw = ((int)(paramTextPaint.measureText(paramString1) + 0.5F));
          paramInt1 = this.rmw;
          AppMethodBeat.o(38527);
        }
        else
        {
          this.rmw = m;
          paramInt1 = this.rmw;
          AppMethodBeat.o(38527);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.QTextView.a
 * JD-Core Version:    0.6.2
 */