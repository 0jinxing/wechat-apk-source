package com.tencent.qqmusic.mediaplayer.perf;

import java.util.List;

public abstract interface PerformanceTracer$Visitor
{
  public abstract void visitSpeedCheck(List<PerformanceTracer.SpeedCheck> paramList, PerformanceTracer.OverallInfo paramOverallInfo);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor
 * JD-Core Version:    0.6.2
 */