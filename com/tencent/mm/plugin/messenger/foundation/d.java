package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.az.n;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.al;
import com.tencent.mm.storage.ao;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bc;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bj;
import com.tencent.mm.storage.br;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.bw;
import com.tencent.mm.storage.cb;
import com.tencent.mm.storage.x;
import java.util.HashMap;

public final class d
  implements c, j
{
  aj oqb;
  bw oqc;
  bj oqd;
  al oqe;
  n oqf;
  com.tencent.mm.az.a oqg;
  br oqh;
  ao oqi;
  ay oqj;
  aw oqk;
  bg oql;
  bu oqm;
  cb oqn;
  x oqo;
  bc oqp;

  public final com.tencent.mm.plugin.messenger.foundation.a.a.g bOl()
  {
    AppMethodBeat.i(1028);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.az.a locala = this.oqg;
    AppMethodBeat.o(1028);
    return locala;
  }

  public final com.tencent.mm.plugin.messenger.foundation.a.a.b bOm()
  {
    AppMethodBeat.i(1029);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN().QU();
    x localx = this.oqo;
    AppMethodBeat.o(1029);
    return localx;
  }

  public final void onAccountInitialized(e.c paramc)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(1030);
    Object localObject;
    if (this.oqb != null)
    {
      localObject = this.oqb;
      ((aj)localObject).xXl.clear();
      ((aj)localObject).xXm.clear();
    }
    if (this.oqf != null)
    {
      localObject = this.oqf;
      ((n)localObject).fBy = new HashMap();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(681, (com.tencent.mm.ai.f)localObject);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(806, (com.tencent.mm.ai.f)localObject);
    }
    AppMethodBeat.o(1030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.d
 * JD-Core Version:    0.6.2
 */