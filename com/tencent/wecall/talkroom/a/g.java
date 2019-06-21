package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.ac;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class g extends d
{
  public String neq;

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128020);
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.ac localac = new com/tencent/pb/common/b/a/a$ac;
        localac.<init>();
        paramArrayOfByte = (a.ac)e.a(localac, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128020);
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
    return "CsCmd.Cmd_V_CSModifyVoiceGroupInfoReq";
  }

  public final int getType()
  {
    return 209;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.g
 * JD-Core Version:    0.6.2
 */