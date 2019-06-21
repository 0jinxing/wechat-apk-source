package com.tencent.mm.plugin.report.b;

import com.tencent.c.a.a.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.protocal.protobuf.bob;
import com.tencent.mm.protocal.protobuf.boc;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements f
{
  public final void cm(String paramString)
  {
    AppMethodBeat.i(123497);
    ab.i("MicroMsg.MidHelper", "QueryMid onDispatch2WXServer req:%s limit:%d", new Object[] { paramString, Integer.valueOf(d.access$000()) });
    if (d.Fd() <= 0)
    {
      ab.e("MicroMsg.MidHelper", "THE FUCKING querymid do too much! :%d", new Object[] { Integer.valueOf(d.access$000()) });
      AppMethodBeat.o(123497);
    }
    while (true)
    {
      return;
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new bob();
      ((b.a)localObject).fsK = new boc();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/querymid";
      ((b.a)localObject).fsI = 684;
      localObject = ((b.a)localObject).acD();
      ((bob)((b)localObject).fsG.fsP).lWq = paramString;
      ((bob)((b)localObject).fsG.fsP).nbk = 1;
      w.a((b)localObject, new d.1.1(this), true);
      AppMethodBeat.o(123497);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.d.1
 * JD-Core Version:    0.6.2
 */