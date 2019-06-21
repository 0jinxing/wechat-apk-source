package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.ak;
import com.tencent.pb.common.b.a.a.l;
import com.tencent.pb.common.b.d;

public final class m extends d
{
  public int nCF;
  public String neq;
  public long sZg;

  public m(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(128030);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "hello", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong) });
    a.l locall = new a.l();
    locall.AmO = paramInt3;
    locall.sQS = paramInt1;
    this.nCF = paramInt1;
    locall.sQT = paramLong;
    this.sZg = paramLong;
    locall.groupId = paramString;
    this.neq = paramString;
    locall.kyZ = paramInt2;
    this.AlQ = 3;
    try
    {
      this.AlR = com.tencent.wecall.talkroom.model.c.dTg().auH(paramString);
      c(147, locall);
      AppMethodBeat.o(128030);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "NetSceneVoiceRoomHello constructor", paramString });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128031);
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.ak localak = new com/tencent/pb/common/b/a/a$ak;
        localak.<init>();
        paramArrayOfByte = (a.ak)e.a(localak, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128031);
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
    return "CsCmd.Cmd_V_CSVoiceRoomHelloReq";
  }

  public final int getType()
  {
    return 205;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.m
 * JD-Core Version:    0.6.2
 */