package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.avx;
import com.tencent.mm.sdk.platformtools.ab;

final class a$b$1
  implements b.a
{
  a$b$1(a.b paramb, c paramc, String paramString1, String paramString2)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(10817);
    ab.i("MicroMsg.IPCInvoke_DoAuthorize", "onSceneEnd errType[%d], errCode[%d] ,errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      a.b.b(this.eFW, false, "cgi fail");
      AppMethodBeat.o(10817);
    }
    while (true)
    {
      return;
      if (paramb.fsH.fsP != null)
      {
        paramb = (avx)paramb.fsH.fsP;
        paramInt1 = paramb.wzH.cyE;
        paramString = paramb.wzH.cyF;
        ab.i("MicroMsg.IPCInvoke_DoAuthorize", "NetSceneJSAuthorize jsErrcode[%d], jsErrmsg[%s]", new Object[] { Integer.valueOf(paramInt1), paramString });
        if (paramInt1 == -12000)
        {
          a.b.a(this.hmN, this.hmM, a.b.Ae(paramb.ncH), a.b.Ae(paramb.vDm), paramb.wlE, new a.a()
          {
            public final void l(Bundle paramAnonymousBundle)
            {
              AppMethodBeat.i(10816);
              int i = paramAnonymousBundle.getInt("retCode");
              if (i == 0)
              {
                i = paramAnonymousBundle.getInt("resultCode");
                paramAnonymousBundle = paramAnonymousBundle.getBundle("resultData");
                a.b.a(a.b.1.this.hmN, a.b.1.this.hmM, a.b.1.this.val$appId, paramAnonymousBundle, i, a.b.1.this.eFW);
                AppMethodBeat.o(10816);
              }
              while (true)
              {
                return;
                a.b.b(a.b.1.this.eFW, false, "deny");
                ab.e("MicroMsg.IPCInvoke_DoAuthorize", "authorize fail, retCode[%d]", new Object[] { Integer.valueOf(i) });
                AppMethodBeat.o(10816);
              }
            }
          });
          AppMethodBeat.o(10817);
        }
        else if (paramInt1 == 0)
        {
          a.b.a(this.hmN, this.hmM);
          a.b.b(this.eFW, true, "");
          AppMethodBeat.o(10817);
        }
        else
        {
          ab.e("MicroMsg.IPCInvoke_DoAuthorize", "onSceneEnd NetSceneJSAuthorize ERROR %s", new Object[] { paramString });
          a.b.b(this.eFW, false, String.valueOf(paramString));
        }
      }
      else
      {
        AppMethodBeat.o(10817);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.a.b.1
 * JD-Core Version:    0.6.2
 */