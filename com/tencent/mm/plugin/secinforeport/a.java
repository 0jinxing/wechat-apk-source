package com.tencent.mm.plugin.secinforeport;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.secinforeport.a.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.st;
import com.tencent.mm.protocal.protobuf.su;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.charset.Charset;
import java.util.LinkedList;

public enum a
  implements b
{
  static
  {
    AppMethodBeat.i(57474);
    qjb = new a("INSTANCE");
    qjc = new a[] { qjb };
    AppMethodBeat.o(57474);
  }

  public final void a(int paramInt1, String paramString, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(57473);
    if (paramString == null)
    {
      ab.w("MicroMsg.ClipBordReportImpl", "operationInfo isNullOrNil");
      AppMethodBeat.o(57473);
    }
    while (true)
    {
      return;
      if (!g.RK())
      {
        AppMethodBeat.o(57473);
      }
      else
      {
        st localst = new st();
        localst.wah = paramInt1;
        localst.waj = paramInt2;
        paramString = paramString.getBytes(Charset.forName("UTF-8"));
        localst.wai = new SKBuiltinBuffer_t().setBuffer(paramString);
        if (!bo.cb(paramArrayOfByte))
          localst.wak = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
        paramString = new su();
        paramString.wam.add(localst);
        paramString.wal = paramString.wam.size();
        ((j)g.K(j.class)).XL().c(new j.a(211, paramString));
        AppMethodBeat.o(57473);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.secinforeport.a
 * JD-Core Version:    0.6.2
 */