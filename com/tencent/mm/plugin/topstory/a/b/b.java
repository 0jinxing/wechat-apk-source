package com.tencent.mm.plugin.topstory.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.chw;

public final class b
{
  public long mLr;
  public boolean pZZ;
  public chw sAX;
  public boolean sAY;

  public b(chw paramchw)
  {
    AppMethodBeat.i(96381);
    this.sAX = paramchw;
    this.mLr = System.currentTimeMillis();
    AppMethodBeat.o(96381);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(96382);
    boolean bool;
    if (paramObject == null)
    {
      bool = false;
      AppMethodBeat.o(96382);
    }
    while (true)
    {
      return bool;
      paramObject = (b)paramObject;
      bool = this.sAX.xgS.equals(paramObject.sAX.xgS);
      AppMethodBeat.o(96382);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.b.b
 * JD-Core Version:    0.6.2
 */