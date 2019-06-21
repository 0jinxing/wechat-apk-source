package com.b.a.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

class p
{
  final long bFB;
  final long bFC;
  final int what;

  p(int paramInt)
  {
    this(paramInt, System.currentTimeMillis(), SystemClock.elapsedRealtime());
    AppMethodBeat.i(55679);
    AppMethodBeat.o(55679);
  }

  private p(int paramInt, long paramLong1, long paramLong2)
  {
    this.what = paramInt;
    this.bFB = paramLong1;
    this.bFC = paramLong2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.b.a.a.p
 * JD-Core Version:    0.6.2
 */