package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.matrix.trace.core.AppMethodBeat;

class PerformanceTracer$BufferSizeCheck
{
  private int lastSize = 0;
  private int maxMismatch = 0;
  private final String name;
  private int sizeMismatchCount = 0;

  public PerformanceTracer$BufferSizeCheck(String paramString)
  {
    this.name = paramString;
  }

  public int getMaxMismatch()
  {
    return this.maxMismatch;
  }

  public String getName()
  {
    return this.name;
  }

  public int getSizeMismatchCount()
  {
    return this.sizeMismatchCount;
  }

  void onEnd(int paramInt)
  {
    AppMethodBeat.i(128438);
    if (paramInt != this.lastSize)
    {
      paramInt = this.lastSize - paramInt;
      if (Math.abs(paramInt) > this.maxMismatch)
        this.maxMismatch = paramInt;
      this.sizeMismatchCount += 1;
    }
    AppMethodBeat.o(128438);
  }

  void onStart(int paramInt)
  {
    this.lastSize = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.BufferSizeCheck
 * JD-Core Version:    0.6.2
 */