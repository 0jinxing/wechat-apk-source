package com.tencent.mm.ui.chatting.l.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.f.d.c;
import com.tencent.mm.ui.chatting.f.d.d;
import com.tencent.mm.ui.chatting.l.e;
import java.util.List;

final class a$1
  implements d.c<bi>
{
  a$1(a parama, Bundle paramBundle, d.a parama1)
  {
  }

  public final e b(d.d<bi> paramd)
  {
    AppMethodBeat.i(32713);
    paramd.yYz = this.zak;
    paramd = this.zal.a(this.yYn, this.zak, paramd);
    AppMethodBeat.o(32713);
    return paramd;
  }

  public final void c(d.d<bi> paramd)
  {
    AppMethodBeat.i(32714);
    this.zal.zaf = paramd.enb;
    this.zal.zag = paramd.yYC;
    if (paramd.yYB.size() > 0)
    {
      bi localbi = (bi)paramd.yYB.get(0);
      if (localbi != null)
      {
        this.zal.yZQ = localbi.field_createTime;
        this.zal.zai = localbi.field_msgSeq;
      }
      paramd = (bi)paramd.yYB.get(paramd.yYB.size() - 1);
      if (paramd != null)
      {
        this.zal.yZR = paramd.field_createTime;
        this.zal.zah = paramd.field_msgSeq;
      }
    }
    AppMethodBeat.o(32714);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.a.1
 * JD-Core Version:    0.6.2
 */