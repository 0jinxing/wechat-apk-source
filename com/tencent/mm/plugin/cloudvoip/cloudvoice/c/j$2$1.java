package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.tu;
import com.tencent.mm.protocal.protobuf.tv;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class j$2$1
  implements Runnable
{
  j$2$1(j.2 param2, tv paramtv, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135510);
    e locale = j.l(this.kAL.kAJ);
    Object localObject = this.kAK;
    if ((localObject == null) || (((tv)localObject).vEN == null) || (((tv)localObject).vEN.size() == 0))
    {
      locale.kzy.clear();
      if (j.e(this.kAL.kAJ) != j.d.kBo)
        break label226;
      if (this.crd != 0)
        break label186;
      j.m(this.kAL.kAJ).a(0, 0, "ok", j.l(this.kAL.kAJ).kzy);
      AppMethodBeat.o(135510);
    }
    while (true)
    {
      return;
      localObject = ((tv)localObject).vEN;
      locale.kzy.clear();
      Iterator localIterator = ((LinkedList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (tu)localIterator.next();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a locala = new com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a();
        locala.kyZ = ((tu)localObject).wbi;
        locala.openId = ((tu)localObject).vGs;
        locale.kzy.add(locala);
      }
      break;
      label186: ab.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: invalid member list change. will ignore");
      j.m(this.kAL.kAJ).a(-10087, this.crd, "error in member change", null);
      AppMethodBeat.o(135510);
      continue;
      label226: ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room. do not notify");
      AppMethodBeat.o(135510);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.2.1
 * JD-Core Version:    0.6.2
 */