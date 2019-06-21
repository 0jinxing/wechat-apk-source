package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.a.a.a;
import com.tencent.pb.common.b.a.a.al;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.ay;
import com.tencent.pb.common.b.a.a.ba;
import com.tencent.pb.common.b.a.a.d;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.common.c.c;
import com.tencent.wecall.talkroom.model.k;

public final class d extends com.tencent.pb.common.b.d
{
  public String AJu;
  public boolean ALr;
  public int mType;

  public d(String paramString1, String[] paramArrayOfString, byte[] paramArrayOfByte, String paramString2, a.ay paramay, int paramInt1, int paramInt2, long paramLong, String paramString3, boolean paramBoolean, String paramString4)
  {
    AppMethodBeat.i(128013);
    this.ALr = true;
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "create" });
    a.d locald = new a.d();
    try
    {
      locald.Amx = paramString1;
      this.AJu = paramString1;
      locald.AmC = paramInt1;
      this.AlR = paramInt1;
      if (paramay != null)
        locald.AmE = paramay;
      paramString1 = new com/tencent/pb/common/b/a/a$at;
      paramString1.<init>();
      paramString1.name = paramString2;
      paramString1.AoT = paramString4;
      paramString1.AoS = a.dPM();
      paramString1.cAO = paramInt2;
      this.mType = paramInt2;
      this.ALr = paramBoolean;
      paramString1.AoL = paramLong;
      locald.Amz = paramString1;
      locald.AmG = paramArrayOfString;
      paramString1 = paramString3;
      if (paramString3 == null)
        paramString1 = "";
      locald.AmF = paramString1;
      paramString1 = new com/tencent/pb/common/b/a/a$al;
      paramString1.<init>();
      if (paramArrayOfByte != null)
        paramString1.buffer = paramArrayOfByte;
      for (paramString1.iLen = paramArrayOfByte.length; ; paramString1.iLen = 0)
      {
        paramArrayOfString = new com/tencent/pb/common/b/a/a$ba;
        paramArrayOfString.<init>();
        paramArrayOfString.type = 3;
        paramArrayOfString.ApN = paramString1;
        locald.AmB = paramArrayOfString;
        this.AlQ = 3;
        locald.AmD = 2;
        locald.netType = k.ju(com.tencent.pb.common.c.d.sZj);
        c(139, locald);
        AppMethodBeat.o(128013);
        return;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
        c.w(this.TAG2, new Object[] { "NetSceneCreateVoiceGroup constructor", paramString1 });
    }
  }

  public final Object ch(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128014);
    c.d("MicroMsg.Voip", new Object[] { this.TAG2, "data2Resp" });
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        a.z localz = new com/tencent/pb/common/b/a/a$z;
        localz.<init>();
        paramArrayOfByte = (a.z)e.a(localz, paramArrayOfByte, paramArrayOfByte.length);
        AppMethodBeat.o(128014);
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
    return "CsCmd.Cmd_V_CSCreateVoiceGroupReq";
  }

  public final int getType()
  {
    return 201;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.a.d
 * JD-Core Version:    0.6.2
 */