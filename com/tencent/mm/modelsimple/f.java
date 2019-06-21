package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.p.a;
import com.tencent.mm.protocal.p.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;
import junit.framework.Assert;

public final class f extends m
  implements k
{
  public byte[] content;
  private com.tencent.mm.ai.f ehi;
  public String fOt;
  private q ftU;

  public f(l.e parame)
  {
    AppMethodBeat.i(16569);
    this.fOt = "";
    parame = (p.b)parame;
    this.fOt = parame.fOt;
    this.content = parame.content;
    AppMethodBeat.o(16569);
  }

  public f(List<String> paramList, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16568);
    this.fOt = "";
    if ((paramList.size() > 0) && (paramArrayOfByte != null));
    int i;
    String str;
    for (boolean bool2 = true; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      i = (int)(System.currentTimeMillis() / 1000L);
      str = (String)paramList.get(0);
      for (int j = 1; j < paramList.size(); j++)
        str = str + "," + ((String)paramList.get(j)).trim();
    }
    this.ftU = new f.a();
    paramList = (p.a)this.ftU.acF();
    paramList.cAd = 111;
    paramList.bJt = 0;
    paramList.fQi = i;
    if (str != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      paramList.vyw = str;
      if (paramArrayOfByte == null)
        break label266;
    }
    label266: for (bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      paramList.vyx = paramArrayOfByte;
      ab.d("MicroMsg.NetSceneDirectSend", "NetSceneDirectSend: cmdId=111 seq=".concat(String.valueOf(i)));
      ab.d("MicroMsg.NetSceneDirectSend", "NetSceneDirectSend: lstReceiver=" + str + " status = " + o.t(paramArrayOfByte, 0));
      AppMethodBeat.o(16568);
      return;
      bool2 = false;
      break;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(16570);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(16570);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16571);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16571);
  }

  public final boolean acI()
  {
    return true;
  }

  public final int getType()
  {
    return 10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.f
 * JD-Core Version:    0.6.2
 */