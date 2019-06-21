package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.a.a;

final class f$5
  implements com.tencent.pb.talkroom.sdk.c
{
  f$5(f paramf)
  {
  }

  public final void Y(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(127874);
    try
    {
      boolean bool = f.l(this.AKd);
      if (!bool)
      {
        AppMethodBeat.o(127874);
        return;
      }
      if (f.m(this.AKd))
        for (int i = 0; i < paramArrayOfByte.length; i++)
          paramArrayOfByte[i] = ((byte)0);
      b localb;
      short s;
      if (f.l(this.AKd))
      {
        localb = f.c(this.AKd);
        s = (short)paramInt;
        if ((a.Alr) && (localb.AIV != null))
          break label139;
      }
      while (true)
      {
        if (this.AKd.AJR)
        {
          this.AKd.AJR = false;
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "onRecPcmDataCallBack len: ", Integer.valueOf(paramInt) });
        }
        AppMethodBeat.o(127874);
        break;
        label139: localb.AIV.SendAudio(paramArrayOfByte, s, 0);
      }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "initMediaComponent record", paramArrayOfByte });
        AppMethodBeat.o(127874);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f.5
 * JD-Core Version:    0.6.2
 */