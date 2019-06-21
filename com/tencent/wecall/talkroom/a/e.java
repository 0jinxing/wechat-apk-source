package com.tencent.wecall.talkroom.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.e;
import com.tencent.pb.common.c.c;
import com.tencent.wecall.talkroom.model.k;

public final class e extends com.tencent.pb.common.b.d
{
  public String AJt;
  public int ALs;
  public int nCF;
  public String neq;
  public long sZg;

  public e(e parame)
  {
    AppMethodBeat.i(128015);
    this.neq = null;
    this.nCF = 0;
    this.sZg = 0L;
    this.ALs = 0;
    this.AJt = null;
    this.neq = parame.neq;
    this.nCF = parame.nCF;
    this.sZg = parame.sZg;
    this.ALs = parame.ALs;
    this.AJt = parame.AJt;
    this.AlN = parame.AlN;
    this.AlP = parame.AlP;
    this.AlR = parame.AlR;
    this.AlQ = 1;
    AppMethodBeat.o(128015);
  }

  public e(String paramString1, int paramInt1, long paramLong, byte[] paramArrayOfByte, int paramInt2, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(128016);
    this.neq = null;
    this.nCF = 0;
    this.sZg = 0L;
    this.ALs = 0;
    this.AJt = null;
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "enter2", paramString1, Integer.valueOf(paramInt1), Long.valueOf(paramLong), paramString2 });
    a.e locale = new a.e();
    try
    {
      locale.groupId = paramString1;
      this.neq = paramString1;
      locale.sQS = paramInt1;
      this.nCF = paramInt1;
      locale.sQT = paramLong;
      this.sZg = paramLong;
      locale.AmJ = paramInt3;
      this.ALs = paramInt3;
      paramString1 = new com/tencent/pb/common/b/a/a$at;
      paramString1.<init>();
      paramString1.AoT = paramString2;
      locale.Amz = paramString1;
      this.AJt = paramString2;
      c.d("MicroMsg.Voip", new Object[] { this.TAG2, "wXgroupId", locale.Amz.AoT });
      paramString1 = new com/tencent/pb/common/b/a/a$al;
      paramString1.<init>();
      if (paramArrayOfByte != null)
        paramString1.buffer = paramArrayOfByte;
      for (paramString1.iLen = paramArrayOfByte.length; ; paramString1.iLen = 0)
      {
        paramArrayOfByte = new com/tencent/pb/common/b/a/a$ba;
        paramArrayOfByte.<init>();
        paramArrayOfByte.type = 3;
        paramArrayOfByte.ApN = paramString1;
        locale.AmB = paramArrayOfByte;
        this.AlQ = 2;
        this.AlR = paramInt2;
        locale.AmD = 2;
        locale.netType = k.ju(com.tencent.pb.common.c.d.sZj);
        c(141, locale);
        AppMethodBeat.o(128016);
        return;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
        c.w(this.TAG2, new Object[] { "NetSceneEnterVoiceRoom constructor", paramString1 });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128017);
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.aa localaa = new com/tencent/pb/common/b/a/a$aa;
        localaa.<init>();
        paramArrayOfByte = (a.aa)com.google.a.a.e.a(localaa, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128017);
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
    return "CsCmd.Cmd_V_CSEnterVoiceRoomReq";
  }

  public final int getType()
  {
    return 202;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.e
 * JD-Core Version:    0.6.2
 */