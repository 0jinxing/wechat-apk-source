package com.tencent.mm.plugin.sns.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rj;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.b;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
  implements b.b
{
  public c qGl;

  public a()
  {
    AppMethodBeat.i(35875);
    this.qGl = new a.1(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.qGl);
    af.cnA().a(this);
    AppMethodBeat.o(35875);
  }

  public final void Xw(String paramString)
  {
    AppMethodBeat.i(35876);
    ab.i("MicroMsg.FTS.FTSSnsImageDownloadLogic", "onThumbFinish mediaId=%s", new Object[] { paramString });
    rj localrj = new rj();
    localrj.cNq.cuy = 2;
    localrj.cNq.cHr = paramString;
    String str = an.fZ(af.getAccSnsPath(), paramString);
    localrj.cNq.path = (str + i.Xa(paramString));
    com.tencent.mm.sdk.b.a.xxA.m(localrj);
    AppMethodBeat.o(35876);
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
  }

  public final void cmu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.f.a
 * JD-Core Version:    0.6.2
 */