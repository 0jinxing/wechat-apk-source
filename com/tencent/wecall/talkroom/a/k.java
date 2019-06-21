package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.ae;
import com.tencent.pb.common.b.a.a.h;
import com.tencent.pb.common.b.d;

public final class k extends d
{
  public int nCF;
  public String neq;
  public long sZg;

  public k(String paramString1, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(128026);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneSubscribeLargeVideo" });
    a.h localh = new a.h();
    try
    {
      localh.groupId = paramString1;
      this.neq = paramString1;
      localh.nwu = paramInt;
      this.nCF = paramInt;
      localh.nwv = paramLong;
      this.sZg = paramLong;
      localh.emc = paramString2;
      localh.timestamp = System.currentTimeMillis();
      com.tencent.pb.common.c.c.i("MicroMsg.Voip", new Object[] { "roomId: %d, roomKey: %d, groupId: %s, ownerUserName: %s, timestamp: %d", Integer.valueOf(localh.nwu), Long.valueOf(localh.nwv), localh.groupId, localh.emc, Long.valueOf(localh.timestamp) });
      this.AlQ = 3;
      this.AlR = com.tencent.wecall.talkroom.model.c.dTg().auH(paramString1);
      c(245, localh);
      AppMethodBeat.o(128026);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "NetSceneSwitchVideoGroup constructor", paramString1 });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128027);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.ae localae = new com/tencent/pb/common/b/a/a$ae;
        localae.<init>();
        paramArrayOfByte = (a.ae)e.a(localae, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128027);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "data2Resp", paramArrayOfByte.getMessage() });
        paramArrayOfByte = null;
        continue;
      }
      paramArrayOfByte = null;
    }
  }

  public final String dPt()
  {
    return "CsCmd.Cmd_V_CSSubscribeLargeVideoReq";
  }

  public final int getType()
  {
    return 800;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.k
 * JD-Core Version:    0.6.2
 */