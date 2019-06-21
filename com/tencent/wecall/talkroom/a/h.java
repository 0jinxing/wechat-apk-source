package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.aj;
import com.tencent.pb.common.b.a.a.k;
import com.tencent.wecall.talkroom.model.k;

public final class h extends com.tencent.pb.common.b.d
{
  public String groupId;
  public int nwu;
  public long nwv;

  public h(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(128021);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneRejectVoiceGroup" });
    a.k localk = new a.k();
    try
    {
      localk.groupId = paramString;
      localk.sQS = paramInt1;
      localk.sQT = paramLong;
      localk.kyZ = paramInt2;
      localk.AmD = 2;
      localk.netType = k.ju(com.tencent.pb.common.c.d.sZj);
      this.AlQ = 3;
      this.AlR = com.tencent.wecall.talkroom.model.c.dTg().auH(paramString);
      c(211, localk);
      AppMethodBeat.o(128021);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "NetSceneRedirect constructor", paramString });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128022);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.aj localaj = new com/tencent/pb/common/b/a/a$aj;
        localaj.<init>();
        paramArrayOfByte = (a.aj)e.a(localaj, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128022);
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
    return "CsCmd.Cmd_V_CSVoiceRedirectReq";
  }

  public final int getType()
  {
    return 211;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.h
 * JD-Core Version:    0.6.2
 */