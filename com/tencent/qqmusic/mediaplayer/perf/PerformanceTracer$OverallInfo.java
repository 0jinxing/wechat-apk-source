package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

class PerformanceTracer$OverallInfo
{
  final IDataSource dataSource;
  final long timeCostInMs;
  final long totalPcmToBePlayed;

  PerformanceTracer$OverallInfo(IDataSource paramIDataSource, long paramLong1, long paramLong2)
  {
    this.dataSource = paramIDataSource;
    this.timeCostInMs = paramLong1;
    this.totalPcmToBePlayed = paramLong2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.OverallInfo
 * JD-Core Version:    0.6.2
 */