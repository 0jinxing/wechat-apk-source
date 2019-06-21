package com.tencent.mm.media.i;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/util/CodeMan;", "", "taskName", "", "(Ljava/lang/String;)V", "testTime", "Lcom/tencent/mm/compatible/util/CodeInfo$TestTime;", "begin", "", "diff", "getdiff", "", "mark", "toString", "plugin-mediaeditor_release"})
public final class a
{
  public g.a eOm;
  private final String eOn;

  public a(String paramString)
  {
    AppMethodBeat.i(13113);
    this.eOn = paramString;
    this.eOm = new g.a();
    this.eOm.reset();
    AppMethodBeat.o(13113);
  }

  public final void SW()
  {
    AppMethodBeat.i(13111);
    ab.i("MicroMsg.CodeUtil", toString());
    AppMethodBeat.o(13111);
  }

  public final String toString()
  {
    AppMethodBeat.i(13112);
    String str = "CodeMan task " + this.eOn + " cost : " + this.eOm.Mr();
    AppMethodBeat.o(13112);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.i.a
 * JD-Core Version:    0.6.2
 */