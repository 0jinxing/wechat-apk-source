package com.tencent.mm.plugin.mmsight.model;

import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g$b
{
  public Point oum;
  public Point oun;
  public Point ouo;
  public Point oup;
  public Point ouq;
  public Point our;

  public final String toString()
  {
    AppMethodBeat.i(76513);
    Object localObject = new StringBuffer();
    if (this.oum != null)
      ((StringBuffer)localObject).append(this.oum.toString() + ",");
    if (this.oun != null)
      ((StringBuffer)localObject).append(this.oun.toString() + ",");
    if (this.ouo != null)
      ((StringBuffer)localObject).append(this.ouo.toString() + ",");
    if (this.oup != null)
      ((StringBuffer)localObject).append(this.oup.toString() + ",");
    if (this.ouq != null)
      ((StringBuffer)localObject).append(this.ouq.toString() + ",");
    if (this.our != null)
      ((StringBuffer)localObject).append(this.our.toString() + ",");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(76513);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.g.b
 * JD-Core Version:    0.6.2
 */