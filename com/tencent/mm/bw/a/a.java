package com.tencent.mm.bw.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qbar.QbarNative;
import java.util.Arrays;

public final class a
{
  public static Bitmap a(Context paramContext, Bitmap paramBitmap, byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(108283);
    int i = paramBitmap.getWidth();
    int j = BackwardSupportUtil.b.b(paramContext, 197.0F);
    int k = j;
    if (j < i)
      k = i;
    j = (int)(paramArrayOfInt[0] * 0.1D);
    k /= (paramArrayOfInt[0] + j * 2);
    if (k == 0)
      k = 1;
    while (true)
    {
      int m = j * k;
      int n = k * (paramArrayOfInt[0] + j * 2);
      int i1 = paramArrayOfInt[1] * k + j * (k * 2);
      j = n;
      if (n < i)
        j = i;
      n = i1;
      if (i1 < i)
        n = i;
      Bitmap localBitmap = Bitmap.createBitmap(j, n, Bitmap.Config.ARGB_8888);
      paramContext = new int[j * n];
      i1 = (j - i) / 2;
      int i2 = 0;
      for (int i3 = i1; (i3 < j - i1) && (i2 < i); i3++)
      {
        int i4 = 0;
        int i5 = i1;
        while ((i5 < n - i1) && (i4 < i))
        {
          paramContext[(i3 * j + i5)] = paramBitmap.getPixel(i4, i2);
          i5++;
          i4++;
        }
        i2++;
      }
      for (i = 0; i < paramArrayOfInt[1]; i++)
        for (i1 = 0; i1 < paramArrayOfInt[0]; i1++)
        {
          if (paramArrayOfByte[(paramArrayOfInt[0] * i + i1)] == 1)
            for (i3 = 0; i3 < k; i3++)
              for (i2 = 0; i2 < k; i2++)
                if (paramContext[((i * k + m + i3) * j + i1 * k + m + i2)] == 0)
                  paramContext[((i * k + m + i3) * j + i1 * k + m + i2)] = -16777216;
          for (i3 = 0; i3 < k; i3++)
            for (i2 = 0; i2 < k; i2++)
              if (paramContext[((i * k + m + i3) * j + i1 * k + m + i2)] == 0)
                paramContext[((i * k + m + i3) * j + i1 * k + m + i2)] = -1;
        }
      localBitmap.setPixels(paramContext, 0, j, 0, 0, j, n);
      AppMethodBeat.o(108283);
      return localBitmap;
    }
  }

  private static Bitmap a(Context paramContext, byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(108287);
    paramContext = paramContext.getResources().getDisplayMetrics();
    int i = paramContext.widthPixels;
    int j = paramContext.heightPixels;
    int k;
    if (i < j)
    {
      i = (int)(i * 0.8D);
      k = (int)(paramArrayOfInt[0] * 0.1D);
      i /= (paramArrayOfInt[0] + k * 2);
      if (i != 0)
        break label1638;
      i = 1;
    }
    label565: label571: label1638: 
    while (true)
    {
      int m = k * i;
      int n = i * (paramArrayOfInt[0] + k * 2);
      int i1 = paramArrayOfInt[1] * i + i * 2 * k;
      Bitmap localBitmap = Bitmap.createBitmap(n, i1, Bitmap.Config.ARGB_8888);
      int[] arrayOfInt1 = new int[n * i1];
      int i2 = i / 2;
      int i3 = i / 2;
      paramContext = new Canvas(localBitmap);
      Paint localPaint = new Paint();
      localPaint.setAntiAlias(true);
      Arrays.fill(arrayOfInt1, -1);
      int[] arrayOfInt2 = new int[6];
      arrayOfInt2[0] = (i * 3 + i / 2);
      arrayOfInt2[1] = (i * 3 + i / 2);
      arrayOfInt2[2] = ((paramArrayOfInt[0] - 1 - 3) * i + i / 2);
      arrayOfInt2[3] = (i * 3 + i / 2);
      arrayOfInt2[4] = (i * 3 + i / 2);
      arrayOfInt2[5] = ((paramArrayOfInt[1] - 1 - 3) * i + i / 2);
      int i4;
      int i5;
      int i6;
      for (j = 0; ; j++)
      {
        if (j >= paramArrayOfInt[1])
          break label571;
        for (i4 = 0; ; i4++)
        {
          if (i4 >= paramArrayOfInt[0])
            break label565;
          if (paramArrayOfByte[(paramArrayOfInt[0] * j + i4)] == 1)
          {
            if (((j >= 0) && (j <= 6) && (i4 >= 0) && (i4 <= 6)) || ((j >= 0) && (j <= 6) && (i4 >= paramArrayOfInt[0] - 7) && (i4 <= paramArrayOfInt[0] - 1)) || ((j >= paramArrayOfInt[1] - 7) && (j <= paramArrayOfInt[1] - 1) && (i4 >= 0) && (i4 <= 6)))
              i5 = 0;
            while (true)
              if (i5 < i)
              {
                i6 = 0;
                while (true)
                  if (i6 < i)
                  {
                    arrayOfInt1[((j * i + m + i5) * n + i4 * i + m + i6)] = -1;
                    i6++;
                    continue;
                    i = j;
                    break;
                  }
                i5++;
                continue;
                if (dmD())
                  for (i5 = 0; i5 < i; i5++)
                    for (i6 = 0; i6 < i; i6++)
                      arrayOfInt1[((j * i + m + i5) * n + i4 * i + m + i6)] = -3041484;
                for (i5 = 0; i5 < i; i5++)
                  for (i6 = 0; i6 < i; i6++)
                    arrayOfInt1[((j * i + m + i5) * n + i4 * i + m + i6)] = -2598591;
              }
          }
        }
      }
      localBitmap.setPixels(arrayOfInt1, 0, n, 0, 0, n, i1);
      for (j = 0; j < 3; j++)
      {
        localPaint.setColor(-2598591);
        localPaint.setStyle(Paint.Style.FILL);
        paramContext.drawCircle(i * k + arrayOfInt2[(j * 2)], i * k + arrayOfInt2[(j * 2 + 1)], i * 3 + i3, localPaint);
        localPaint.setColor(-1);
        paramContext.drawCircle(i * k + arrayOfInt2[(j * 2)], i * k + arrayOfInt2[(j * 2 + 1)], i * 2 + i2, localPaint);
      }
      for (j = 0; j < 3; j++)
      {
        localPaint.setColor(-3041484);
        localPaint.setStyle(Paint.Style.FILL);
        i1 = arrayOfInt2[(j * 2)];
        i4 = i * 1 / 4;
        i2 = arrayOfInt2[(j * 2 + 1)];
        n = i * 1 / 4;
        i5 = arrayOfInt2[(j * 2)];
        m = i * 1 / 4;
        i6 = arrayOfInt2[(j * 2 + 1)];
        i3 = i * 1 / 4;
        paramContext.drawRect(i * k + i1 - i - i4, i * k + i2 - i - n, m + (i * k + i5 + i), i3 + (i * k + i6 + i), localPaint);
      }
      for (j = 0; j < 3; j++)
      {
        localPaint.setColor(-1);
        localPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        paramArrayOfByte = new Path();
        paramArrayOfByte.moveTo(i * k + arrayOfInt2[(j * 2)] - i - i * 1 / 4, i * k + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        paramArrayOfByte.quadTo(i * k + arrayOfInt2[(j * 2)], i * k + arrayOfInt2[(j * 2 + 1)] - i, i * k + arrayOfInt2[(j * 2)] + i + i / 4, i * k + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        paramArrayOfByte.lineTo(i * k + arrayOfInt2[(j * 2)] - i - i * 1 / 4, i * k + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        paramArrayOfByte.close();
        paramContext.drawPath(paramArrayOfByte, localPaint);
        paramArrayOfByte.moveTo(i * k + arrayOfInt2[(j * 2)] - i - i * 1 / 4, i * k + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        paramArrayOfByte.quadTo(i * k + arrayOfInt2[(j * 2)] - i, i * k + arrayOfInt2[(j * 2 + 1)], i * k + arrayOfInt2[(j * 2)] - i - i / 4, i * k + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        paramArrayOfByte.lineTo(i * k + arrayOfInt2[(j * 2)] - i - i * 1 / 4, i * k + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        paramArrayOfByte.close();
        paramContext.drawPath(paramArrayOfByte, localPaint);
        paramArrayOfByte.moveTo(i * k + arrayOfInt2[(j * 2)] + i + i * 1 / 4, i * k + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        paramArrayOfByte.quadTo(i * k + arrayOfInt2[(j * 2)], i * k + arrayOfInt2[(j * 2 + 1)] + i, i * k + arrayOfInt2[(j * 2)] - i - i / 4, i * k + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        paramArrayOfByte.lineTo(i * k + arrayOfInt2[(j * 2)] + i + i * 1 / 4, i * k + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        paramArrayOfByte.close();
        paramContext.drawPath(paramArrayOfByte, localPaint);
        paramArrayOfByte.moveTo(i * k + arrayOfInt2[(j * 2)] + i + i * 1 / 4, i * k + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        paramArrayOfByte.quadTo(i * k + arrayOfInt2[(j * 2)] + i, i * k + arrayOfInt2[(j * 2 + 1)], i * k + arrayOfInt2[(j * 2)] + i + i / 4, i * k + arrayOfInt2[(j * 2 + 1)] - i - i * 1 / 4);
        paramArrayOfByte.lineTo(i * k + arrayOfInt2[(j * 2)] + i + i * 1 / 4, i * k + arrayOfInt2[(j * 2 + 1)] + i + i * 1 / 4);
        paramArrayOfByte.close();
        paramContext.drawPath(paramArrayOfByte, localPaint);
      }
      AppMethodBeat.o(108287);
      return localBitmap;
    }
  }

  private static Bitmap a(Context paramContext, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(108285);
    paramContext = paramContext.getResources().getDisplayMetrics();
    int i = paramContext.widthPixels;
    int j = paramContext.heightPixels;
    int k;
    if (i < j)
    {
      i = (int)(i * 0.8D);
      k = (int)(paramArrayOfInt[0] * 0.1D);
      if (paramInt != 12)
        break label249;
      i /= (paramArrayOfInt[0] + k * 2);
      paramInt = i;
      if (i == 0)
        paramInt = 1;
      j = paramInt;
      i = paramInt;
      paramInt = j;
    }
    while (true)
    {
      label91: int m = k * i;
      int n = i * (paramArrayOfInt[0] + k * 2);
      int i1 = paramArrayOfInt[1] * paramInt + i * 2 * k;
      Bitmap localBitmap = Bitmap.createBitmap(n, i1, Bitmap.Config.ARGB_8888);
      paramContext = new int[n * i1];
      Arrays.fill(paramContext, -1);
      label362: label368: for (j = 0; ; j++)
      {
        if (j >= paramArrayOfInt[1])
          break label374;
        for (k = 0; ; k++)
        {
          if (k >= paramArrayOfInt[0])
            break label368;
          int i3;
          if (paramArrayOfByte[(paramArrayOfInt[0] * j + k)] == 1)
            for (i2 = 0; ; i2++)
            {
              if (i2 >= paramInt)
                break label362;
              i3 = 0;
              while (true)
                if (i3 < i)
                {
                  paramContext[((j * paramInt + m + i2) * n + k * i + m + i3)] = -16777216;
                  i3++;
                  continue;
                  i = j;
                  break;
                  label249: if (paramInt != 5)
                    break label397;
                  i /= (paramArrayOfInt[0] + k * 2);
                  paramInt = i;
                  if (i == 0)
                    paramInt = 1;
                  j = paramArrayOfInt[0] * paramInt / paramArrayOfInt[1];
                  i = paramInt;
                  paramInt = j;
                  break label91;
                }
            }
          for (int i2 = 0; i2 < paramInt; i2++)
            for (i3 = 0; i3 < i; i3++)
              paramContext[((j * paramInt + m + i2) * n + k * i + m + i3)] = -1;
        }
      }
      label374: localBitmap.setPixels(paramContext, 0, n, 0, 0, n, i1);
      AppMethodBeat.o(108285);
      return localBitmap;
      label397: paramInt = 0;
      i = 0;
    }
  }

  public static Bitmap b(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(108284);
    byte[] arrayOfByte = new byte[40000];
    int[] arrayOfInt = new int[2];
    paramInt2 = QbarNative.a(arrayOfByte, arrayOfInt, paramString, paramInt1, paramInt2, "UTF-8");
    QbarNative.nativeRelease();
    if (paramInt2 == 0)
    {
      paramContext = a(paramContext, arrayOfByte, arrayOfInt, paramInt1);
      if (paramContext == null)
      {
        ab.i("MicroMsg.QRCodeBitmapFactory", "createBitmap bm is error result %d %s", new Object[] { Integer.valueOf(paramInt2), bo.dpG().toString() });
        AppMethodBeat.o(108284);
      }
    }
    while (true)
    {
      return paramContext;
      ab.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", new Object[] { paramContext });
      break;
      ab.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", new Object[] { Integer.valueOf(paramInt2), bo.dpG().toString() });
      paramContext = null;
      AppMethodBeat.o(108284);
    }
  }

  public static Bitmap bF(Context paramContext, String paramString)
  {
    AppMethodBeat.i(108286);
    byte[] arrayOfByte = new byte[40000];
    int[] arrayOfInt = new int[2];
    int i = QbarNative.a(arrayOfByte, arrayOfInt, paramString, 12, 1, "UTF-8");
    QbarNative.nativeRelease();
    if (i == 0)
    {
      paramContext = a(paramContext, arrayOfByte, arrayOfInt);
      if (paramContext == null)
      {
        ab.i("MicroMsg.QRCodeBitmapFactory", "createBitmap bm is error result %d %s", new Object[] { Integer.valueOf(i), bo.dpG().toString() });
        AppMethodBeat.o(108286);
      }
    }
    while (true)
    {
      return paramContext;
      ab.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", new Object[] { paramContext });
      break;
      ab.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", new Object[] { Integer.valueOf(i), bo.dpG().toString() });
      paramContext = null;
      AppMethodBeat.o(108286);
    }
  }

  private static boolean dmD()
  {
    AppMethodBeat.i(108288);
    boolean[] arrayOfBoolean = new boolean[10];
    arrayOfBoolean[5] = true;
    int i = arrayOfBoolean[((int)(java.lang.Math.random() * 10.0D))];
    AppMethodBeat.o(108288);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bw.a.a
 * JD-Core Version:    0.6.2
 */