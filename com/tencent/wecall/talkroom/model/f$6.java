package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.a.a;
import com.tencent.pb.common.c.c;
import java.util.concurrent.atomic.AtomicInteger;

final class f$6
  implements com.tencent.pb.talkroom.sdk.b
{
  f$6(f paramf, AtomicInteger paramAtomicInteger1, AtomicInteger paramAtomicInteger2)
  {
  }

  public final int X(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(127875);
    if (!f.l(this.AKd))
    {
      AppMethodBeat.o(127875);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      try
      {
        b localb = f.c(this.AKd);
        i = (short)paramInt;
        AtomicInteger localAtomicInteger1 = this.AKp;
        AtomicInteger localAtomicInteger2 = this.AKq;
        if ((!a.Alr) || (localb.AIV == null));
        for (i = 1; ; i = localb.AIV.GetAudioData(paramArrayOfByte, i, localAtomicInteger1, localAtomicInteger2))
        {
          if ((this.AKd.AJS) && (i >= 0))
          {
            this.AKd.AJS = false;
            c.w("TalkRoomService", new Object[] { "onPlayPcmDataCallBack len: ", Integer.valueOf(paramInt), " ret: ", Integer.valueOf(i) });
          }
          AppMethodBeat.o(127875);
          paramInt = i;
          break;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        c.w("TalkRoomService", new Object[] { "initMediaComponent play", paramArrayOfByte });
        paramInt = -1;
        AppMethodBeat.o(127875);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f.6
 * JD-Core Version:    0.6.2
 */