package com.tencent.mm.svg;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b
{
  private static a<Paint> ycF;
  private static a<float[]> ycG;
  private static a<Matrix> ycH;
  private static a<Path> ycI;
  private static final float[] ycJ;

  static
  {
    AppMethodBeat.i(70062);
    ycF = new a();
    ycG = new a();
    ycH = new a();
    ycI = new a();
    ycJ = new float[9];
    AppMethodBeat.o(70062);
  }

  protected static Paint a(Looper paramLooper, Paint paramPaint)
  {
    try
    {
      AppMethodBeat.i(70058);
      Paint localPaint = (Paint)ycF.dvC();
      if (localPaint == null)
      {
        localPaint = new android/graphics/Paint;
        localPaint.<init>();
      }
      while (true)
      {
        if (paramPaint != null)
          localPaint.set(paramPaint);
        ycF.a(paramLooper, localPaint);
        AppMethodBeat.o(70058);
        return localPaint;
        localPaint.reset();
      }
    }
    finally
    {
    }
    throw paramLooper;
  }

  protected static void f(Looper paramLooper)
  {
    try
    {
      AppMethodBeat.i(70057);
      ycF.e(paramLooper);
      ycG.e(paramLooper);
      ycH.e(paramLooper);
      ycI.e(paramLooper);
      AppMethodBeat.o(70057);
      return;
    }
    finally
    {
      paramLooper = finally;
    }
    throw paramLooper;
  }

  protected static float[] g(Looper paramLooper)
  {
    try
    {
      AppMethodBeat.i(70059);
      float[] arrayOfFloat = (float[])ycG.dvC();
      if (arrayOfFloat == null)
        arrayOfFloat = new float[9];
      while (true)
      {
        ycG.a(paramLooper, arrayOfFloat);
        AppMethodBeat.o(70059);
        return arrayOfFloat;
        System.arraycopy(ycJ, 0, arrayOfFloat, 0, 9);
      }
    }
    finally
    {
    }
    throw paramLooper;
  }

  protected static Matrix h(Looper paramLooper)
  {
    try
    {
      AppMethodBeat.i(70060);
      Matrix localMatrix = (Matrix)ycH.dvC();
      if (localMatrix == null)
      {
        localMatrix = new android/graphics/Matrix;
        localMatrix.<init>();
      }
      while (true)
      {
        ycH.a(paramLooper, localMatrix);
        AppMethodBeat.o(70060);
        return localMatrix;
        localMatrix.reset();
      }
    }
    finally
    {
    }
    throw paramLooper;
  }

  protected static Path i(Looper paramLooper)
  {
    try
    {
      AppMethodBeat.i(70061);
      Path localPath = (Path)ycI.dvC();
      if (localPath == null)
      {
        localPath = new android/graphics/Path;
        localPath.<init>();
      }
      while (true)
      {
        ycI.a(paramLooper, localPath);
        AppMethodBeat.o(70061);
        return localPath;
        localPath.reset();
      }
    }
    finally
    {
    }
    throw paramLooper;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.b
 * JD-Core Version:    0.6.2
 */