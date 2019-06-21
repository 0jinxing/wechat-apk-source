package com.tencent.mm.plugin.choosemsgfile.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.storage.bi;

public final class b extends g
{
  private j.b kul;
  private String kum;

  public b(com.tencent.mm.plugin.choosemsgfile.b.c.g paramg, bi parambi)
  {
    super(paramg, parambi);
  }

  private j.b bfv()
  {
    AppMethodBeat.i(54287);
    if (this.kul == null)
      this.kul = j.b.me(this.kua.field_content);
    j.b localb = this.kul;
    AppMethodBeat.o(54287);
    return localb;
  }

  protected final String aan()
  {
    AppMethodBeat.i(54291);
    Object localObject;
    if ((this.kum == null) && (bfv() != null) && (bfv().csD != null) && (bfv().csD.length() > 0))
    {
      localObject = com.tencent.mm.plugin.s.a.aUq().aiE(bfv().csD);
      if (localObject != null)
        this.kum = ((com.tencent.mm.pluginsdk.model.app.b)localObject).field_fileFullPath;
    }
    if (this.kum != null)
    {
      localObject = this.kum;
      AppMethodBeat.o(54291);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(54291);
    }
  }

  public final String bfo()
  {
    AppMethodBeat.i(54288);
    String str;
    if (bfv() != null)
    {
      str = bfv().fgp;
      AppMethodBeat.o(54288);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(54288);
    }
  }

  public final int bfp()
  {
    AppMethodBeat.i(54290);
    int i;
    if (bfv() != null)
    {
      i = bfv().fgo;
      AppMethodBeat.o(54290);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(54290);
    }
  }

  public final String getFileName()
  {
    AppMethodBeat.i(54289);
    String str;
    if (bfv() != null)
    {
      str = bfv().title;
      AppMethodBeat.o(54289);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(54289);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.b
 * JD-Core Version:    0.6.2
 */