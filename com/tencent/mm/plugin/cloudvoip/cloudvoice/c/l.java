package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.ahk;
import com.tencent.mm.protocal.protobuf.ahl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class l
{
  final Map<String, k> kBt;

  l()
  {
    AppMethodBeat.i(135591);
    this.kBt = new ConcurrentHashMap(1);
    AppMethodBeat.o(135591);
  }

  private void a(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean, l.a parama)
  {
    AppMethodBeat.i(135593);
    j.kzW.R(new l.1(this, parama, paramInt1, paramInt2, paramString, paramk, paramBoolean));
    AppMethodBeat.o(135593);
  }

  private void b(String paramString, l.a parama)
  {
    AppMethodBeat.i(135594);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ahk();
    ((b.a)localObject).fsK = new ahl();
    ((b.a)localObject).fsI = 2985;
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxabusiness/getcloudimsession";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    localObject = ((b.a)localObject).acD();
    ((ahk)((com.tencent.mm.ai.b)localObject).fsG.fsP).csB = paramString;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ai.b)localObject, new l.2(this, parama, paramString));
    AppMethodBeat.o(135594);
  }

  public final void a(String paramString, l.a parama)
  {
    AppMethodBeat.i(135592);
    k localk = (k)this.kBt.get(paramString);
    if ((localk != null) && (localk.isValid()))
    {
      ab.d("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: has valid sessionKey");
      a(0, 0, "", localk, false, parama);
      AppMethodBeat.o(135592);
    }
    while (true)
    {
      return;
      this.kBt.remove(paramString);
      b(paramString, parama);
      AppMethodBeat.o(135592);
    }
  }

  public final void reset(String paramString)
  {
    AppMethodBeat.i(135595);
    ab.i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: on exit");
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(135595);
    while (true)
    {
      return;
      this.kBt.remove(paramString);
      AppMethodBeat.o(135595);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.l
 * JD-Core Version:    0.6.2
 */