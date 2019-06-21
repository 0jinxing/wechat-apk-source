package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.ccw;
import com.tencent.mm.protocal.protobuf.coj;
import com.tencent.mm.protocal.protobuf.cqb;
import com.tencent.mm.protocal.protobuf.cqc;
import java.util.LinkedList;

public final class j extends n<cqb, cqc>
{
  public j(long paramLong1, long paramLong2, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(4727);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cqb();
    ((b.a)localObject).fsK = new cqc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipspeedresult";
    ((b.a)localObject).fsI = 901;
    ((b.a)localObject).fsL = 901;
    ((b.a)localObject).fsM = 1000000901;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cqb)this.ehh.fsG.fsP;
    ((cqb)localObject).xod = paramLong1;
    ((cqb)localObject).wen = paramLong2;
    ((cqb)localObject).vZF = paramInt1;
    ((cqb)localObject).xoe = new bts().alV(paramString1);
    ((cqb)localObject).xof = new bts().alV(paramString2);
    ((cqb)localObject).vNH = 0.0D;
    ((cqb)localObject).vNI = 0.0D;
    ((cqb)localObject).wem = paramInt2;
    ((cqb)localObject).xog = paramInt3;
    paramInt1 = 0;
    for (int i = 0; i < paramInt3; i++)
    {
      paramString1 = new ccw();
      paramInt2 = paramInt1 + 1;
      paramString1.xce = paramArrayOfInt[paramInt1];
      paramInt1 = paramInt2 + 1;
      paramString1.xcf = paramArrayOfInt[paramInt2];
      paramInt2 = paramInt1 + 1;
      paramString1.xcg = paramArrayOfInt[paramInt1];
      paramString1.xch = new coj();
      paramString2 = paramString1.xch;
      paramInt1 = paramInt2 + 1;
      paramString2.xfs = paramArrayOfInt[paramInt2];
      paramString2 = paramString1.xch;
      paramInt2 = paramInt1 + 1;
      paramString2.wOO = paramArrayOfInt[paramInt1];
      paramInt1 = paramInt2 + 1;
      paramString1.xci = paramArrayOfInt[paramInt2];
      int j = paramInt1 + 1;
      paramString1.xcj = paramArrayOfInt[paramInt1];
      paramInt2 = j + 1;
      paramString1.xck = paramArrayOfInt[j];
      paramInt1 = paramInt2 + 1;
      paramString1.xcl = paramArrayOfInt[paramInt2];
      j = 0;
      while (j < paramString1.xcl)
      {
        paramInt2 = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.xcm.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          paramInt2 = paramInt1 + 1;
        }
        j++;
        paramInt1 = paramInt2;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < paramArrayOfInt.length)
      {
        paramString1.xcn = paramArrayOfInt[paramInt1];
        paramInt2 = paramInt1 + 1;
      }
      j = 0;
      for (paramInt1 = paramInt2; j < paramString1.xcn; paramInt1 = paramInt2)
      {
        paramInt2 = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.xco.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          paramInt2 = paramInt1 + 1;
        }
        j++;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < paramArrayOfInt.length)
      {
        paramString1.xcp = paramArrayOfInt[paramInt1];
        paramInt2 = paramInt1 + 1;
      }
      j = 0;
      paramInt1 = paramInt2;
      paramInt2 = j;
      while (paramInt2 < paramString1.xcp)
      {
        j = paramInt1;
        if (paramInt1 < paramArrayOfInt.length)
        {
          paramString1.xcq.add(Integer.valueOf(paramArrayOfInt[paramInt1]));
          j = paramInt1 + 1;
        }
        paramInt2++;
        paramInt1 = j;
      }
      a.Logi("MicroMsg.NetSceneVoipSpeedResult", "SpeedResult: pkt_size[" + paramString1.xcf + "], pkt_count[" + paramString1.xcg + "], svr_ip[" + paramString1.xch.xfs + "], avg_rtt[" + paramString1.xci + "], min_rtt[" + paramString1.xcj + "], max_rtt[" + paramString1.xck + "], rtt_count[" + paramString1.xcl + "], down_seq_count[" + paramString1.xcn + "], up_seq_count[" + paramString1.xcp + "]");
      ((cqb)localObject).wpo.add(paramString1);
    }
    AppMethodBeat.o(4727);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4728);
    j.1 local1 = new j.1(this);
    AppMethodBeat.o(4728);
    return local1;
  }

  public final int getType()
  {
    return 901;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.j
 * JD-Core Version:    0.6.2
 */