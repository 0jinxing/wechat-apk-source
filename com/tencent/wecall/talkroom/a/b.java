package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.a;
import com.tencent.pb.common.b.a.a.x;
import com.tencent.pb.common.b.d;

public final class b extends d
{
  public int nCF;
  public String neq;
  public long sZg;

  public b(String paramString, int paramInt, long paramLong, String[] paramArrayOfString)
  {
    AppMethodBeat.i(128009);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.TAG2, "addmember", paramString });
    a.a locala = new a.a();
    try
    {
      locala.groupId = paramString;
      this.neq = paramString;
      locala.sQS = paramInt;
      this.nCF = paramInt;
      locala.sQT = paramLong;
      this.sZg = paramLong;
      locala.Amw = paramArrayOfString;
      locala.sQS = paramInt;
      this.AlQ = 3;
      this.AlR = com.tencent.wecall.talkroom.model.c.dTg().auH(paramString);
      c(145, locala);
      AppMethodBeat.o(128009);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        com.tencent.pb.common.c.c.w(this.TAG2, new Object[] { "NetSceneAddVoiceGroupMember constructor", paramString });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128010);
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.x localx = new com/tencent/pb/common/b/a/a$x;
        localx.<init>();
        paramArrayOfByte = (a.x)e.a(localx, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128010);
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
    return "CsCmd.Cmd_V_CSAddVoiceGroupMemberReq";
  }

  public final int getType()
  {
    return 204;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.b
 * JD-Core Version:    0.6.2
 */