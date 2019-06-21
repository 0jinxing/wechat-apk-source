package com.tencent.mm.ui.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.aka;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class b$2
  implements w.a
{
  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(29953);
    ab.i("MicroMsg.AppBrandServiceHelper", "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramString = (aka)paramb.fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramString != null) && (paramString.wpA != null))
    {
      paramm = new StringBuilder();
      paramb = paramString.wpA.iterator();
      while (paramb.hasNext())
      {
        String str = (String)paramb.next();
        paramm.append(str + "|");
      }
      ab.d("MicroMsg.AppBrandServiceHelper", "block_qr_prefix:%s, size:%d", new Object[] { paramm.toString(), Integer.valueOf(paramString.wpA.size()) });
      g.RP().Ry().set(ac.a.xOB, paramm.toString());
    }
    AppMethodBeat.o(29953);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.b.2
 * JD-Core Version:    0.6.2
 */