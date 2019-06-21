package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.ad;
import com.tencent.pb.common.b.a.a.g;
import com.tencent.pb.common.b.d;

public final class i extends d
{
  public i(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(128023);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneRejectVoiceGroup" });
    a.g localg = new a.g();
    try
    {
      localg.groupId = paramString;
      localg.sQS = paramInt1;
      localg.sQT = paramLong;
      localg.boZ = paramInt2;
      this.AlQ = 3;
      this.AlR = com.tencent.wecall.talkroom.model.c.dTg().auH(paramString);
      c(181, localg);
      AppMethodBeat.o(128023);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "NetSceneRejectVoiceGroup constructor", paramString });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128024);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.ad localad = new com/tencent/pb/common/b/a/a$ad;
        localad.<init>();
        paramArrayOfByte = (a.ad)e.a(localad, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128024);
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
    return "CsCmd.Cmd_V_CSRejectEnterVoiceRoomReq";
  }

  public final int getType()
  {
    return 207;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.i
 * JD-Core Version:    0.6.2
 */