package com.google.android.exoplayer2.h;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class s
{
  IOException biw;
  final ExecutorService bqJ;
  s.b<? extends s.c> bqK;

  public s(String paramString)
  {
    AppMethodBeat.i(95852);
    this.bqJ = v.aO(paramString);
    AppMethodBeat.o(95852);
  }

  public final <T extends s.c> long a(T paramT, s.a<T> parama, int paramInt)
  {
    AppMethodBeat.i(95853);
    Looper localLooper = Looper.myLooper();
    if (localLooper != null);
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      long l = SystemClock.elapsedRealtime();
      new s.b(this, localLooper, paramT, parama, paramInt, l).start(0L);
      AppMethodBeat.o(95853);
      return l;
    }
  }

  public final boolean a(s.d paramd)
  {
    AppMethodBeat.i(95855);
    boolean bool1 = false;
    boolean bool2;
    if (this.bqK != null)
    {
      this.bqK.cancel(true);
      bool2 = bool1;
      if (paramd != null)
      {
        this.bqJ.execute(new s.e(paramd));
        bool2 = bool1;
      }
    }
    while (true)
    {
      this.bqJ.shutdown();
      AppMethodBeat.o(95855);
      return bool2;
      bool2 = bool1;
      if (paramd != null)
      {
        paramd.rZ();
        bool2 = true;
      }
    }
  }

  public final void cancelLoading()
  {
    AppMethodBeat.i(95854);
    this.bqK.cancel(false);
    AppMethodBeat.o(95854);
  }

  public final boolean isLoading()
  {
    if (this.bqK != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.s
 * JD-Core Version:    0.6.2
 */