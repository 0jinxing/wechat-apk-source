package com.tencent.neattextview.textview.layout;

import android.text.TextPaint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.neattextview.textview.a.a;
import java.util.ArrayList;

public class NeatLayout extends c
{
  private int AkN = 0;

  static
  {
    AppMethodBeat.i(3257);
    System.loadLibrary("linebreak");
    AppMethodBeat.o(3257);
  }

  public NeatLayout(CharSequence paramCharSequence, float[] paramArrayOfFloat)
  {
    super(paramCharSequence, paramArrayOfFloat);
  }

  private native int nComputeBreak(String paramString, float[] paramArrayOfFloat1, float paramFloat1, float paramFloat2, int[] paramArrayOfInt, float[] paramArrayOfFloat2, float paramFloat3, boolean[] paramArrayOfBoolean1, char[] paramArrayOfChar1, float[] paramArrayOfFloat3, char[] paramArrayOfChar2, float[] paramArrayOfFloat4, boolean[] paramArrayOfBoolean2);

  public final void a(TextPaint paramTextPaint, float paramFloat, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(3256);
    float f1 = paramTextPaint.getTextSize() / 2.0F;
    float f2;
    int i;
    int[] arrayOfInt;
    float[] arrayOfFloat;
    boolean[] arrayOfBoolean;
    int j;
    float f3;
    label112: float f4;
    if (paramBoolean)
    {
      f2 = paramTextPaint.getTextSize() / 6.0F;
      i = this.AjZ.length();
      arrayOfInt = new int[i];
      arrayOfFloat = new float[i];
      arrayOfBoolean = new boolean[i];
      j = nComputeBreak(this.AjZ, this.Akb, 0.0F, paramFloat + f1, arrayOfInt, arrayOfFloat, f2, arrayOfBoolean, a.AjU, this.Ake, a.AjT, this.Akd, this.Aky);
      this.AkN = j;
      f3 = 0.0F;
      i = 0;
      if ((i >= j) || (i >= paramInt))
        break label156;
      f4 = arrayOfFloat[i];
      if (f3 >= f4)
        break label446;
      f3 = f4;
    }
    label156: label432: label446: 
    while (true)
    {
      i++;
      break label112;
      f2 = 0.0F;
      break;
      float f5 = Math.min(f3, paramFloat);
      i = 0;
      int k = 0;
      if ((k < j) && (k < paramInt))
      {
        int m = arrayOfInt[k];
        paramBoolean = arrayOfBoolean[k];
        int n = m - i;
        f3 = 0.0F;
        f4 = paramFloat - arrayOfFloat[k];
        int i1;
        if (Math.abs(f4) <= f1)
          i1 = 1;
        int i2;
        while (i1 != 0)
        {
          i2 = n;
          if (m - 1 >= 0)
          {
            i2 = n;
            if (this.Aka[(m - 1)] == '\n')
              i2 = n - 1;
          }
          n = i;
          int i3 = i2;
          while (true)
            if (n < m)
            {
              i2 = i3;
              if (this.Aka[n] != '\n')
              {
                i2 = i3;
                if (this.Akb[n] == 0.0F)
                  i2 = i3 - 1;
              }
              n++;
              i3 = i2;
              continue;
              i1 = 0;
              break;
            }
          f3 = f4 / (Math.max(2, i3) - 1);
        }
        label361: char[] arrayOfChar;
        if (i1 != 0)
        {
          f4 = paramFloat;
          arrayOfChar = this.Aka;
          paramTextPaint = this.Akb;
          i2 = this.Akg.size();
          if (i1 == 0)
            break label432;
        }
        for (float f6 = paramFloat; ; f6 = f5)
        {
          a(arrayOfChar, i, m, f4, paramTextPaint, i2, f3, paramBoolean, f2, f6);
          k++;
          i = m;
          break;
          f4 = arrayOfFloat[k];
          break label361;
        }
      }
      AppMethodBeat.o(3256);
      return;
    }
  }

  public final int dPe()
  {
    return this.AkN;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.layout.NeatLayout
 * JD-Core Version:    0.6.2
 */