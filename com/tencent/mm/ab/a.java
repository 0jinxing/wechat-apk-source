package com.tencent.mm.ab;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/kt/CodeMan;", "", "taskName", "", "(Ljava/lang/String;)V", "testTime", "Lcom/tencent/mm/compatible/util/CodeInfo$TestTime;", "begin", "", "diff", "getdiff", "", "mark", "toString", "libktcomm_release"})
public final class a
{
  public g.a eOm;
  private final String eOn;

  public a(String paramString)
  {
    AppMethodBeat.i(114168);
    this.eOn = paramString;
    this.eOm = new g.a();
    this.eOm.reset();
    AppMethodBeat.o(114168);
  }

  public final void SW()
  {
    AppMethodBeat.i(114166);
    ab.i("MicroMsg.CodeUtil", toString());
    AppMethodBeat.o(114166);
  }

  public final String toString()
  {
    AppMethodBeat.i(114167);
    String str = "CodeMan task " + this.eOn + " cost : " + this.eOm.Mr();
    AppMethodBeat.o(114167);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.a
 * JD-Core Version:    0.6.2
 */