package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.ai;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class j extends d
{
  public String neq;

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128025);
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.ai localai = new com/tencent/pb/common/b/a/a$ai;
        localai.<init>();
        paramArrayOfByte = (a.ai)e.a(localai, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128025);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        c.w(this.TAG2, new Object[] { "data2Resp", paramArrayOfByte });
        paramArrayOfByte = null;
        continue;
      }
      paramArrayOfByte = null;
    }
  }

  public final String dPt()
  {
    return "CsCmd.Cmd_V_CSVoiceMemberWhisperReq";
  }

  public final int getType()
  {
    return 213;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.j
 * JD-Core Version:    0.6.2
 */