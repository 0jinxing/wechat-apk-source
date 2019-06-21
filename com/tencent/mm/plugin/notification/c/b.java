package com.tencent.mm.plugin.notification.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class b
{
  int currentIndex;
  public ArrayList<Long> oVR;

  public b()
  {
    AppMethodBeat.i(23111);
    this.currentIndex = 0;
    this.oVR = new ArrayList();
    this.currentIndex = 0;
    AppMethodBeat.o(23111);
  }

  public final long bWJ()
  {
    AppMethodBeat.i(23113);
    long l1 = -1L;
    long l2 = l1;
    if (this.oVR.size() > 0)
    {
      l2 = l1;
      if (this.currentIndex < this.oVR.size())
        l2 = ((Long)this.oVR.get(this.currentIndex)).longValue();
    }
    ab.d("MicroMsg.FailMsglist", "getNextSendMsgId:%d, currentIndex:%d, msgIdList.size:%d", new Object[] { Long.valueOf(l2), Integer.valueOf(this.currentIndex), Integer.valueOf(this.oVR.size()) });
    this.currentIndex += 1;
    AppMethodBeat.o(23113);
    return l2;
  }

  public final void clear()
  {
    AppMethodBeat.i(23115);
    this.oVR.clear();
    this.currentIndex = 0;
    AppMethodBeat.o(23115);
  }

  public final boolean contains(long paramLong)
  {
    AppMethodBeat.i(23114);
    boolean bool = this.oVR.contains(Long.valueOf(paramLong));
    AppMethodBeat.o(23114);
    return bool;
  }

  public final long get(int paramInt)
  {
    AppMethodBeat.i(23116);
    long l = ((Long)this.oVR.get(paramInt)).longValue();
    AppMethodBeat.o(23116);
    return l;
  }

  public final void js(long paramLong)
  {
    AppMethodBeat.i(23112);
    ab.d("MicroMsg.FailMsglist", "addMsgId:%d, currentIndex:%d, size:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(this.currentIndex), Integer.valueOf(this.oVR.size()) });
    this.oVR.add(Long.valueOf(paramLong));
    AppMethodBeat.o(23112);
  }

  public final void remove(long paramLong)
  {
    AppMethodBeat.i(23117);
    this.oVR.remove(Long.valueOf(paramLong));
    AppMethodBeat.o(23117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.c.b
 * JD-Core Version:    0.6.2
 */