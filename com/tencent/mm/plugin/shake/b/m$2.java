package com.tencent.mm.plugin.shake.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.t;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;

final class m$2
  implements be.a
{
  m$2(m paramm)
  {
  }

  public final void a(ak paramak, be parambe)
  {
    AppMethodBeat.i(24476);
    if ((paramak != null) && (t.nC(paramak.field_username)))
      paramak.setUsername("");
    AppMethodBeat.o(24476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.m.2
 * JD-Core Version:    0.6.2
 */