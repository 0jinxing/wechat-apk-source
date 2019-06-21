package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.avv;
import com.tencent.mm.sdk.platformtools.ab;

final class a$b$2
  implements b.a
{
  a$b$2(a.b paramb, c paramc, int paramInt, String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(10818);
    ab.d("MicroMsg.IPCInvoke_DoAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      a.b.b(this.eFW, false, "cgi fail");
      AppMethodBeat.o(10818);
    }
    while (true)
    {
      return;
      if (paramb.fsH.fsP != null)
      {
        if (this.hmP == 2)
        {
          a.b.b(this.eFW, false, "cgi fail");
          AppMethodBeat.o(10818);
        }
        else
        {
          paramString = (avv)paramb.fsH.fsP;
          paramInt1 = paramString.wzH.cyE;
          ab.i("MicroMsg.IPCInvoke_DoAuthorize", "NetSceneJSAuthorizeConfirm jsErrcode[%d], jsErrmsg[%s]", new Object[] { Integer.valueOf(paramInt1), paramString.wzH.cyF });
          if (paramInt1 == 0)
          {
            a.b.a(this.hmN, this.hmM);
            a.b.b(this.eFW, true, "");
            AppMethodBeat.o(10818);
          }
          else
          {
            a.b.b(this.eFW, false, "cgi fail");
          }
        }
      }
      else
        AppMethodBeat.o(10818);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.a.b.2
 * JD-Core Version:    0.6.2
 */