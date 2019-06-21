package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public class MultiViewerItem
{
  public Set<Integer> activeParts;
  public boolean needOriginFrame;
  public int renderId;
  public VideoMaterial videoMaterial;

  public MultiViewerItem()
  {
    AppMethodBeat.i(83509);
    this.activeParts = new HashSet();
    this.needOriginFrame = true;
    AppMethodBeat.o(83509);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.MultiViewerItem
 * JD-Core Version:    0.6.2
 */