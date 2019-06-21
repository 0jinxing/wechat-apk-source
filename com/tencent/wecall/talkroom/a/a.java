package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.ag;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.j;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class a extends d
{
  public int ALq;
  public int AlR;
  public int nCF;
  public String neq;
  public long sZg;

  public a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(128007);
    this.neq = null;
    this.nCF = 0;
    this.sZg = 0L;
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "NetSceneAckVoiceGroup" });
    a.j localj = new a.j();
    try
    {
      localj.groupId = paramString;
      this.neq = paramString;
      localj.sQS = paramInt1;
      this.nCF = paramInt1;
      localj.sQT = paramLong;
      this.sZg = paramLong;
      this.ALq = paramInt3;
      this.AlR = paramInt2;
      paramString = new com/tencent/pb/common/b/a/a$al;
      paramString.<init>();
      paramString.iLen = 0;
      a.ba localba = new com/tencent/pb/common/b/a/a$ba;
      localba.<init>();
      localba.type = 3;
      localba.ApN = paramString;
      localj.AmB = localba;
      this.AlQ = 3;
      this.AlR = paramInt2;
      c(189, localj);
      AppMethodBeat.o(128007);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        c.w(this.TAG2, new Object[] { "NetSceneAckVoiceGroup constructor", paramString });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128008);
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.ag localag = new com/tencent/pb/common/b/a/a$ag;
        localag.<init>();
        paramArrayOfByte = (a.ag)e.a(localag, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128008);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        c.w(this.TAG2, new Object[] { "data2Resp", paramArrayOfByte.getMessage() });
        paramArrayOfByte = null;
        continue;
      }
      paramArrayOfByte = null;
    }
  }

  public final String dPt()
  {
    return "CsCmd.Cmd_V_CSVoiceAckReq";
  }

  public final int getType()
  {
    return 206;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.a
 * JD-Core Version:    0.6.2
 */