package com.tencent.mm.y;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class c$a
{
  float[] eHr;
  float[] eHs;
  int eHt;

  public c$a(List<PointF> paramList)
  {
    AppMethodBeat.i(116273);
    Object localObject;
    this.eHt = localObject.size();
    this.eHr = new float[this.eHt];
    this.eHs = new float[this.eHt];
    for (int i = 0; i < this.eHt; i++)
    {
      this.eHr[i] = ((PointF)localObject.get(i)).x;
      this.eHs[i] = ((PointF)localObject.get(i)).y;
    }
    new StringBuilder("lasso size:").append(this.eHt);
    AppMethodBeat.o(116273);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.c.a
 * JD-Core Version:    0.6.2
 */