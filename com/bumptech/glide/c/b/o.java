package com.bumptech.glide.c.b;

import android.os.Looper;
import com.bumptech.glide.c.h;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class o<Z>
  implements u<Z>
{
  private final boolean aBS;
  private int aBT;
  private boolean aBU;
  private a azJ;
  private h azP;
  final boolean azQ;
  final u<Z> azR;

  o(u<Z> paramu, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(91837);
    this.azR = ((u)i.d(paramu, "Argument must not be null"));
    this.azQ = paramBoolean1;
    this.aBS = paramBoolean2;
    AppMethodBeat.o(91837);
  }

  final void a(h paramh, a parama)
  {
    this.azP = paramh;
    this.azJ = parama;
  }

  final void acquire()
  {
    AppMethodBeat.i(91842);
    Object localObject;
    if (this.aBU)
    {
      localObject = new IllegalStateException("Cannot acquire a recycled resource");
      AppMethodBeat.o(91842);
      throw ((Throwable)localObject);
    }
    if (!Looper.getMainLooper().equals(Looper.myLooper()))
    {
      localObject = new IllegalThreadStateException("Must call acquire on the main thread");
      AppMethodBeat.o(91842);
      throw ((Throwable)localObject);
    }
    this.aBT += 1;
    AppMethodBeat.o(91842);
  }

  public final Z get()
  {
    AppMethodBeat.i(91839);
    Object localObject = this.azR.get();
    AppMethodBeat.o(91839);
    return localObject;
  }

  public final int getSize()
  {
    AppMethodBeat.i(91840);
    int i = this.azR.getSize();
    AppMethodBeat.o(91840);
    return i;
  }

  public final Class<Z> mK()
  {
    AppMethodBeat.i(91838);
    Class localClass = this.azR.mK();
    AppMethodBeat.o(91838);
    return localClass;
  }

  public final void recycle()
  {
    AppMethodBeat.i(91841);
    IllegalStateException localIllegalStateException;
    if (this.aBT > 0)
    {
      localIllegalStateException = new IllegalStateException("Cannot recycle a resource while it is still acquired");
      AppMethodBeat.o(91841);
      throw localIllegalStateException;
    }
    if (this.aBU)
    {
      localIllegalStateException = new IllegalStateException("Cannot recycle a resource that has already been recycled");
      AppMethodBeat.o(91841);
      throw localIllegalStateException;
    }
    this.aBU = true;
    if (this.aBS)
      this.azR.recycle();
    AppMethodBeat.o(91841);
  }

  final void release()
  {
    AppMethodBeat.i(91843);
    Object localObject;
    if (this.aBT <= 0)
    {
      localObject = new IllegalStateException("Cannot release a recycled or not yet acquired resource");
      AppMethodBeat.o(91843);
      throw ((Throwable)localObject);
    }
    if (!Looper.getMainLooper().equals(Looper.myLooper()))
    {
      localObject = new IllegalThreadStateException("Must call release on the main thread");
      AppMethodBeat.o(91843);
      throw ((Throwable)localObject);
    }
    int i = this.aBT - 1;
    this.aBT = i;
    if (i == 0)
      this.azJ.b(this.azP, this);
    AppMethodBeat.o(91843);
  }

  public final String toString()
  {
    AppMethodBeat.i(91844);
    String str = "EngineResource{isCacheable=" + this.azQ + ", listener=" + this.azJ + ", key=" + this.azP + ", acquired=" + this.aBT + ", isRecycled=" + this.aBU + ", resource=" + this.azR + '}';
    AppMethodBeat.o(91844);
    return str;
  }

  static abstract interface a
  {
    public abstract void b(h paramh, o<?> paramo);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.o
 * JD-Core Version:    0.6.2
 */