package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.bwd;
import com.tencent.mm.protocal.w.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import junit.framework.Assert;

public final class v extends m
  implements k
{
  private f ehi;
  private final q ftU;

  public v(int paramInt, String paramString)
  {
    this(paramInt, paramString, "");
  }

  public v(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(78596);
    this.ftU = new b();
    w.a locala = (w.a)this.ftU.acF();
    locala.vyK.jBB = r.Yz();
    bwd localbwd = locala.vyK;
    Object localObject = new StringBuilder();
    int i = paramInt;
    if (paramInt == 0)
      i = 64;
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(i).append(";");
    localObject = paramString1;
    if (paramString1 == null)
      localObject = "";
    localbwd.ncM = ((String)localObject);
    ab.d("MicroMsg.NetSceneSendCard", "content:" + locala.vyK.ncM);
    Assert.assertTrue("empty sendcard", true);
    locala.vyK.wIi = 64;
    if ((paramString2 != null) && (paramString2.length() > 0))
      locala.vyK.wWU = paramString2;
    AppMethodBeat.o(78596);
  }

  public v(String paramString)
  {
    AppMethodBeat.i(78597);
    this.ftU = new b();
    w.a locala = (w.a)this.ftU.acF();
    locala.vyK.jBB = r.Yz();
    locala.vyK.ncM = paramString;
    ab.d("MicroMsg.NetSceneSendCard", "content:".concat(String.valueOf(paramString)));
    locala.vyK.wrF = bo.h((Integer)g.RP().Ry().get(66561, null));
    Assert.assertTrue("empty sendcard", true);
    locala.vyK.wIi = 128;
    AppMethodBeat.o(78597);
  }

  public v(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(78598);
    this.ftU = new b();
    w.a locala = (w.a)this.ftU.acF();
    locala.vyK.jBB = r.Yz();
    locala.vyK.ncM = paramString;
    ab.d("MicroMsg.NetSceneSendCard", "content:".concat(String.valueOf(paramString)));
    locala.vyK.wrF = bo.h((Integer)g.RP().Ry().get(66561, null));
    int i;
    if (paramBoolean1)
    {
      i = 1;
      if (!paramBoolean2)
        break label146;
    }
    label146: for (int j = 4; ; j = 0)
    {
      Assert.assertTrue("empty sendcard", true);
      locala.vyK.wIi = (j | (i | 0x0 | 0x0) | 0x8);
      AppMethodBeat.o(78598);
      return;
      i = 0;
      break;
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(78599);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(78599);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78600);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramq.ZS().vyn, this);
    AppMethodBeat.o(78600);
  }

  public final int getType()
  {
    return 26;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.v
 * JD-Core Version:    0.6.2
 */