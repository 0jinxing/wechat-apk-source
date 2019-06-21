package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.af;
import com.tencent.pb.common.b.a.a.i;
import com.tencent.pb.common.b.d;

public final class l extends d
{
  public int nCF;
  public String neq;
  public long sZg;

  public l(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(128028);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneSwitchVideoGroup" });
    a.i locali = new a.i();
    try
    {
      locali.groupId = paramString;
      this.neq = paramString;
      locali.nwu = paramInt1;
      this.nCF = paramInt1;
      locali.nwv = paramLong;
      this.sZg = paramLong;
      locali.action = paramInt2;
      locali.timestamp = System.currentTimeMillis();
      this.AlQ = 3;
      this.AlR = com.tencent.wecall.talkroom.model.c.dTg().auH(paramString);
      c(243, locali);
      AppMethodBeat.o(128028);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "NetSceneSwitchVideoGroup constructor", paramString });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128029);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.af localaf = new com/tencent/pb/common/b/a/a$af;
        localaf.<init>();
        paramArrayOfByte = (a.af)e.a(localaf, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128029);
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
    return "CsCmd.Cmd_V_CSSwitchVideoGroupReq";
  }

  public final int getType()
  {
    return 214;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.l
 * JD-Core Version:    0.6.2
 */