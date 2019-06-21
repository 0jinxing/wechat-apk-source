package com.tencent.mm.model.gdpr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.aje;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.cxd;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2$1
  implements b.a
{
  c$2$1(c.2 param2, com.tencent.mm.vending.g.b paramb)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb)
  {
    AppMethodBeat.i(1490);
    btd localbtd = (btd)paramb.fsH.fsP;
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (localbtd != null))
    {
      i = 1;
      if (i == 0)
        break label252;
      paramString = (aje)paramb.fsH.fsP;
      if (paramString.wpb == null)
      {
        paramString.wpb = new cxd();
        paramString.wpb.cyE = -1;
      }
      ab.i("MicroMsg.MPGdprPolicyUtil", "onGetAuthCgiBack, business(%s), appId(%s), back(%d %d)", new Object[] { this.fot.jdField_for.fon, this.fot.val$appId, Integer.valueOf(paramString.wpb.cyE), Integer.valueOf(paramString.state) });
      if (paramString.wpb.cyE == 0)
        break label183;
      this.fot.foq.kL(0);
      this.bQV.cR(Boolean.FALSE);
      AppMethodBeat.o(1490);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label183: if (paramString.state <= 0)
      {
        this.bQV.B(new Object[] { Boolean.TRUE });
        AppMethodBeat.o(1490);
      }
      else
      {
        this.fot.foq.kL(0);
        this.bQV.cR(Boolean.FALSE);
        AppMethodBeat.o(1490);
        continue;
        label252: ab.e("MicroMsg.MPGdprPolicyUtil", "onGetAuthCgiBack, business(%s), appId(%s), back(%d %d %s)", new Object[] { this.fot.jdField_for.fon, this.fot.val$appId, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString });
        this.fot.foq.kL(0);
        this.bQV.cR(Boolean.FALSE);
        AppMethodBeat.o(1490);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.gdpr.c.2.1
 * JD-Core Version:    0.6.2
 */