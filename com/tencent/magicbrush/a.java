package com.tencent.magicbrush;

import android.util.SparseLongArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public final MBRuntime bSg;
  public SparseLongArray bSh;

  a(MBRuntime paramMBRuntime)
  {
    AppMethodBeat.i(115779);
    this.bSh = new SparseLongArray();
    this.bSg = paramMBRuntime;
    AppMethodBeat.o(115779);
  }

  public final float fQ(int paramInt)
  {
    AppMethodBeat.i(115780);
    float f = (yt() - paramInt) * 1000.0F / (float)c.az(this.bSh.get(paramInt));
    AppMethodBeat.o(115780);
    return f;
  }

  public final a.a getCurrentFps()
  {
    AppMethodBeat.i(115781);
    synchronized (this.bSg)
    {
      if (this.bSg.mNativeInst == 0L)
      {
        locala = new com/tencent/magicbrush/a$a;
        locala.<init>(this);
        AppMethodBeat.o(115781);
        return locala;
      }
      a.a locala = new com/tencent/magicbrush/a$a;
      locala.<init>(this);
      float[] arrayOfFloat = this.bSg.nativeGetCurrentFps(this.bSg.mNativeInst);
      locala.bSi = arrayOfFloat[0];
      locala.bSj = arrayOfFloat[1];
      AppMethodBeat.o(115781);
    }
  }

  public final float ys()
  {
    AppMethodBeat.i(115782);
    synchronized (this.bSg)
    {
      if (this.bSg.mNativeInst == 0L)
      {
        f = -1.0F;
        AppMethodBeat.o(115782);
        return f;
      }
      float f = this.bSg.nativeGetCurrentFpsVariance(this.bSg.mNativeInst);
      AppMethodBeat.o(115782);
    }
  }

  public final int yt()
  {
    AppMethodBeat.i(115783);
    synchronized (this.bSg)
    {
      if (this.bSg.mNativeInst == 0L)
      {
        i = -1;
        AppMethodBeat.o(115783);
        return i;
      }
      int i = this.bSg.nativeGetFrameCounter(this.bSg.mNativeInst);
      AppMethodBeat.o(115783);
    }
  }

  public final int yu()
  {
    AppMethodBeat.i(115784);
    synchronized (this.bSg)
    {
      if (this.bSg.mNativeInst == 0L)
      {
        i = 0;
        AppMethodBeat.o(115784);
        return i;
      }
      int i = this.bSg.nativeGetDrawCalls(this.bSg.mNativeInst);
      AppMethodBeat.o(115784);
    }
  }

  public final int yv()
  {
    AppMethodBeat.i(115785);
    synchronized (this.bSg)
    {
      if (this.bSg.mNativeInst == 0L)
      {
        i = 0;
        AppMethodBeat.o(115785);
        return i;
      }
      int i = this.bSg.nativeGetVertexes(this.bSg.mNativeInst);
      AppMethodBeat.o(115785);
    }
  }

  public final int yw()
  {
    AppMethodBeat.i(115786);
    synchronized (this.bSg)
    {
      if (this.bSg.mNativeInst == 0L)
      {
        i = 0;
        AppMethodBeat.o(115786);
        return i;
      }
      int i = this.bSg.nativeGetTriangles(this.bSg.mNativeInst);
      AppMethodBeat.o(115786);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.a
 * JD-Core Version:    0.6.2
 */