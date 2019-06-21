package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.b;
import com.tencent.pb.common.b.a.a.y;
import com.tencent.pb.common.b.d;

public final class c extends d
{
  public c(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(128011);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneCancelCreateVoiceGroup" });
    a.b localb = new a.b();
    try
    {
      localb.Amx = paramString;
      localb.boZ = paramInt1;
      this.AlQ = 3;
      this.AlR = paramInt2;
      c(183, localb);
      AppMethodBeat.o(128011);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "NetSceneCancelCreateVoiceGroup constructor", paramString });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128012);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.y localy = new com/tencent/pb/common/b/a/a$y;
        localy.<init>();
        paramArrayOfByte = (a.y)e.a(localy, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128012);
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
    return "CsCmd.Cmd_V_CSCancelCreateVoiceGroupReq";
  }

  public final int getType()
  {
    return 208;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.c
 * JD-Core Version:    0.6.2
 */