package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.ahl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class l$2
  implements b.a
{
  l$2(l paraml, l.a parama, String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(135590);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramb.fsH.fsP == null))
    {
      ab.e("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: get sessionkey fail,errType:" + paramInt1 + ",errCode:" + paramInt2);
      l.a(this.kBw, paramInt1, paramInt2, paramString, null, false, this.kBu);
      AppMethodBeat.o(135590);
    }
    while (true)
    {
      return;
      paramb = (ahl)paramb.fsH.fsP;
      paramString = new k();
      paramString.kBq = paramb.wcw;
      paramString.kBs = bo.yz();
      paramString.kBr = paramb.wnU;
      ab.i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: getSession sessionKey: %s", new Object[] { paramString });
      this.kBw.kBt.put(this.hxh, paramString);
      l.a(this.kBw, 0, 0, "", paramString, true, this.kBu);
      AppMethodBeat.o(135590);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.l.2
 * JD-Core Version:    0.6.2
 */