package com.tencent.mm.plugin.cdndownloader.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class c extends j<a>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(963);
    fnj = new String[] { j.a(a.ccO, "CdnDownloadInfo") };
    AppMethodBeat.o(963);
  }

  public c(e parame)
  {
    super(parame, a.ccO, "CdnDownloadInfo", null);
  }

  public final boolean HG(String paramString)
  {
    AppMethodBeat.i(962);
    boolean bool = hY("CdnDownloadInfo", String.format("delete from %s where %s=%s", new Object[] { "CdnDownloadInfo", "downloadUrlHashCode", Integer.valueOf(paramString.hashCode()) }));
    AppMethodBeat.o(962);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.f.c
 * JD-Core Version:    0.6.2
 */