package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.protocal.protobuf.cpl;
import com.tencent.mm.protocal.protobuf.cpm;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends n<cpl, cpm>
{
  public e(int paramInt, long paramLong, String paramString)
  {
    AppMethodBeat.i(4710);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cpl();
    ((b.a)localObject).fsK = new cpm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipgetroominfo";
    ((b.a)localObject).fsI = 303;
    ((b.a)localObject).fsL = 119;
    ((b.a)localObject).fsM = 1000000119;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cpl)this.ehh.fsG.fsP;
    ((cpl)localObject).wem = paramInt;
    ((cpl)localObject).wen = paramLong;
    ((cpl)localObject).xmT = paramString;
    ((cpl)localObject).jCt = 1;
    ((cpl)localObject).xlQ = System.currentTimeMillis();
    AppMethodBeat.o(4710);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4712);
    e.1 local1 = new e.1(this);
    AppMethodBeat.o(4712);
    return local1;
  }

  public final void fW(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4711);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      cpm localcpm = (cpm)cKx();
      if (localcpm != null)
        ab.i("MicroMsg.Voip.GetRoomInfo", "roomId:%d, roomKey:%s, memberCount:%d, inviteType:%d", new Object[] { Integer.valueOf(localcpm.wem), Long.valueOf(localcpm.wen), Integer.valueOf(localcpm.ehB), Integer.valueOf(localcpm.xmL) });
      AppMethodBeat.o(4711);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Voip.GetRoomInfo", "Get RoomInfo error");
      AppMethodBeat.o(4711);
    }
  }

  public final int getType()
  {
    return 303;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.e
 * JD-Core Version:    0.6.2
 */