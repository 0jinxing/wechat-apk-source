package com.tencent.mm.fontdecode;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class PathExtractor
{
  private long eAW;
  private String filePath;

  static
  {
    AppMethodBeat.i(114793);
    System.loadLibrary("fontdecode");
    AppMethodBeat.o(114793);
  }

  public PathExtractor(String paramString)
  {
    AppMethodBeat.i(114788);
    this.filePath = paramString;
    this.eAW = nInit(paramString);
    if (this.eAW != 0L)
    {
      ab.i("MicroMsg.PathExtractor", "create for %s, %d", new Object[] { paramString, Long.valueOf(this.eAW) });
      AppMethodBeat.o(114788);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.PathExtractor", "create for %s failed", new Object[] { paramString });
      AppMethodBeat.o(114788);
    }
  }

  private static native boolean nExtractPath(long paramLong, char paramChar, Path paramPath, int[] paramArrayOfInt);

  private static native void nFinalize(long paramLong);

  private static native void nGetMetrics(long paramLong, Metrics paramMetrics);

  private static native long nInit(String paramString);

  private static native void nSetTextSize(long paramLong, int paramInt);

  public final void a(Metrics paramMetrics)
  {
    AppMethodBeat.i(114790);
    if (paramMetrics == null)
    {
      ab.w("MicroMsg.PathExtractor", "metrics is null");
      AppMethodBeat.o(114790);
    }
    while (true)
    {
      return;
      nGetMetrics(this.eAW, paramMetrics);
      paramMetrics.height *= 0.015625F;
      paramMetrics.ascender *= 0.015625F;
      paramMetrics.descender *= 0.015625F;
      AppMethodBeat.o(114790);
    }
  }

  public final boolean a(char paramChar, Path paramPath, RectF paramRectF)
  {
    boolean bool1 = true;
    AppMethodBeat.i(114791);
    int[] arrayOfInt = new int[4];
    try
    {
      bool2 = nExtractPath(this.eAW, paramChar, paramPath, arrayOfInt);
      if (bool2)
      {
        Matrix localMatrix = new Matrix();
        localMatrix.setScale(0.015625F, 0.015625F);
        paramPath.transform(localMatrix);
        paramRectF.set(arrayOfInt[0] * 0.015625F, arrayOfInt[3] * 0.015625F, arrayOfInt[2] * 0.015625F, arrayOfInt[1] * 0.015625F);
        ab.i("MicroMsg.PathExtractor", "load path for ".concat(String.valueOf(paramChar)));
        AppMethodBeat.o(114791);
        bool2 = bool1;
        return bool2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.PathExtractor", "extract path error %c", new Object[] { Character.valueOf(paramChar) });
        boolean bool2 = false;
        continue;
        ab.w("MicroMsg.PathExtractor", "not such char ".concat(String.valueOf(paramChar)));
        AppMethodBeat.o(114791);
        bool2 = false;
      }
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(114792);
    try
    {
      nFinalize(this.eAW);
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(114792);
    }
  }

  public final boolean isValid()
  {
    if (this.eAW != 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void setTextSize(int paramInt)
  {
    AppMethodBeat.i(114789);
    ab.i("MicroMsg.PathExtractor", "set text size %d, %d", new Object[] { Long.valueOf(this.eAW), Integer.valueOf(paramInt) });
    nSetTextSize(this.eAW, paramInt);
    AppMethodBeat.o(114789);
  }

  @Keep
  public static class Metrics
  {
    public float ascender;
    public float descender;
    public float height;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.fontdecode.PathExtractor
 * JD-Core Version:    0.6.2
 */