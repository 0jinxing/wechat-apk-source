package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bcr;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

@Deprecated
public final class k extends j.b
{
  private bcr fLF;

  public k(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt, String paramString9, String paramString10)
  {
    super(1);
    AppMethodBeat.i(59999);
    this.fLF = new bcr();
    this.fLF.wGW = 2048;
    this.fLF.wcB = new bts().alV(bo.nullAsNil(paramString1));
    this.fLF.wyX = new bts().alV(bo.nullAsNil(paramString2));
    this.fLF.vCf = 0;
    this.fLF.wGX = new bts().alV(bo.nullAsNil(paramString3));
    this.fLF.wGY = new bts().alV(bo.nullAsNil(paramString4));
    this.fLF.jBT = 0;
    paramString2 = e.e(bo.nullAsNil(paramString5), 0, -1);
    paramString3 = this.fLF;
    if (paramString2 == null)
    {
      paramString1 = new byte[0];
      paramString3.wGU = new b(paramString1);
      paramString1 = this.fLF;
      if (paramString2 != null)
        break label315;
    }
    label315: for (int i = 0; ; i = paramString2.length)
    {
      paramString1.wGT = i;
      this.fLF.guN = 0;
      this.fLF.guR = 0;
      this.fLF.guQ = bo.nullAsNil(paramString6);
      this.fLF.guP = bo.nullAsNil(paramString7);
      this.fLF.guO = bo.nullAsNil(paramString8);
      this.fLF.vCi = paramInt;
      this.fLF.wBV = bo.nullAsNil(paramString9);
      this.fLF.wHd = 0;
      this.fLF.guS = bo.nullAsNil(paramString10);
      this.fLF.wBX = 0;
      this.fLF.wBW = "";
      this.oqT = this.fLF;
      AppMethodBeat.o(59999);
      return;
      paramString1 = paramString2;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.k
 * JD-Core Version:    0.6.2
 */