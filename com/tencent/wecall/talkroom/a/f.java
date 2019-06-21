package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.ab;
import com.tencent.pb.common.b.a.a.f;
import com.tencent.pb.common.b.d;

public final class f extends d
{
  public f(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(128018);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "eixt", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    a.f localf = new a.f();
    try
    {
      localf.groupId = paramString;
      localf.sQS = paramInt1;
      localf.sQT = paramLong;
      localf.boZ = paramInt2;
      this.AlQ = 2;
      this.AlR = com.tencent.wecall.talkroom.model.c.dTg().auH(paramString);
      c(143, localf);
      AppMethodBeat.o(128018);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "NetSceneExitVoiceRoom constructor", paramString });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128019);
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.ab localab = new com/tencent/pb/common/b/a/a$ab;
        localab.<init>();
        paramArrayOfByte = (a.ab)e.a(localab, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128019);
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
    return "CsCmd.Cmd_V_CSExitVoiceRoomReq";
  }

  public final int getType()
  {
    return 203;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.f
 * JD-Core Version:    0.6.2
 */