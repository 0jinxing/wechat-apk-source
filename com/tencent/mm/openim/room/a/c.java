package com.tencent.mm.openim.room.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;

public final class c
{
  private int ehu = 0;
  public int ehv;

  public final void mG(int paramInt)
  {
    this.ehu |= paramInt;
  }

  final void mH(int paramInt)
  {
    AppMethodBeat.i(78980);
    this.ehu &= (paramInt ^ 0xFFFFFFFF);
    if (this.ehu == 0)
    {
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcUpdateChatroomEnable, this.ehv);
      this.ehv = 0;
    }
    AppMethodBeat.o(78980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.room.a.c
 * JD-Core Version:    0.6.2
 */