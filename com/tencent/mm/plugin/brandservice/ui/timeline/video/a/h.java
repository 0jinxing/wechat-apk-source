package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/VideoPlayTime;", "", "saveTime", "", "playTime", "", "(JD)V", "getPlayTime", "()D", "getSaveTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "plugin-brandservice_release"})
public final class h
{
  final long jYX;
  final double jYY;

  public h(long paramLong, double paramDouble)
  {
    this.jYX = paramLong;
    this.jYY = paramDouble;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(15347);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof h))
        break label72;
      paramObject = (h)paramObject;
      if (this.jYX == paramObject.jYX)
      {
        i = 1;
        if ((i == 0) || (Double.compare(this.jYY, paramObject.jYY) != 0))
          break label72;
      }
    }
    else
    {
      AppMethodBeat.o(15347);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label72: AppMethodBeat.o(15347);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(15346);
    long l = this.jYX;
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(this.jYY);
    int j = (int)(l ^ l >>> 32);
    AppMethodBeat.o(15346);
    return i * 31 + j;
  }

  public final String toString()
  {
    AppMethodBeat.i(15345);
    String str = "VideoPlayTime(saveTime=" + this.jYX + ", playTime=" + this.jYY + ")";
    AppMethodBeat.o(15345);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.h
 * JD-Core Version:    0.6.2
 */