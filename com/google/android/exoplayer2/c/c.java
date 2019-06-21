package com.google.android.exoplayer2.c;

import com.google.android.exoplayer2.c.b.d;
import com.google.android.exoplayer2.c.d.g;
import com.google.android.exoplayer2.c.f.p;
import com.google.android.exoplayer2.c.f.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;

public final class c
  implements h
{
  private static final Constructor<? extends e> aSK;
  private int aSL;
  private int aSM;
  private int aSN;
  private int aSO;
  private int aSP = 1;
  private int aSQ;

  static
  {
    AppMethodBeat.i(94858);
    Object localObject = null;
    try
    {
      Constructor localConstructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(e.class).getConstructor(new Class[0]);
      localObject = localConstructor;
      label27: aSK = localObject;
      AppMethodBeat.o(94858);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label27;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label27;
    }
  }

  public final e[] ra()
  {
    int i = 11;
    try
    {
      AppMethodBeat.i(94857);
      if (aSK == null);
      while (true)
      {
        e[] arrayOfe = new e[i];
        Object localObject2 = new com/google/android/exoplayer2/c/b/d;
        ((d)localObject2).<init>(this.aSL);
        arrayOfe[0] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/d/e;
        ((com.google.android.exoplayer2.c.d.e)localObject2).<init>(this.aSN);
        arrayOfe[1] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/d/g;
        ((g)localObject2).<init>(this.aSM);
        arrayOfe[2] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/c/b;
        ((com.google.android.exoplayer2.c.c.b)localObject2).<init>(this.aSO);
        arrayOfe[3] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/f/c;
        ((com.google.android.exoplayer2.c.f.c)localObject2).<init>();
        arrayOfe[4] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/f/a;
        ((com.google.android.exoplayer2.c.f.a)localObject2).<init>();
        arrayOfe[5] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/f/u;
        ((u)localObject2).<init>(this.aSP, this.aSQ);
        arrayOfe[6] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/a/b;
        ((com.google.android.exoplayer2.c.a.b)localObject2).<init>();
        arrayOfe[7] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/e/c;
        ((com.google.android.exoplayer2.c.e.c)localObject2).<init>();
        arrayOfe[8] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/f/p;
        ((p)localObject2).<init>();
        arrayOfe[9] = localObject2;
        localObject2 = new com/google/android/exoplayer2/c/g/a;
        ((com.google.android.exoplayer2.c.g.a)localObject2).<init>();
        arrayOfe[10] = localObject2;
        localObject2 = aSK;
        if (localObject2 != null);
        try
        {
          arrayOfe[11] = ((e)aSK.newInstance(new Object[0]));
          AppMethodBeat.o(94857);
          return arrayOfe;
          i = 12;
        }
        catch (Exception localException)
        {
          localObject2 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject2).<init>("Unexpected error creating FLAC extractor", localException);
          AppMethodBeat.o(94857);
          throw ((Throwable)localObject2);
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.c
 * JD-Core Version:    0.6.2
 */