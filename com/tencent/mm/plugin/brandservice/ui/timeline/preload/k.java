package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/TmplInfoEx;", "", "()V", "genTmplFDPath", "", "tmplType", "", "uid", "genTmplPath", "genTmplZipPath", "file", "plugin-brandservice_release"})
public final class k
{
  public static final k jTx;

  static
  {
    AppMethodBeat.i(14952);
    jTx = new k();
    AppMethodBeat.o(14952);
  }

  public static final String ak(int paramInt, String paramString)
  {
    AppMethodBeat.i(14948);
    j.p(paramString, "uid");
    paramString = b.aXA() + paramInt + '_' + paramString + ".html";
    ab.i(l.Ow(), "genTmplPath() tmplPath:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(14948);
    return paramString;
  }

  public static final String am(int paramInt, String paramString)
  {
    AppMethodBeat.i(14951);
    j.p(paramString, "uid");
    paramString = b.aXA() + paramInt + '_' + paramString + ".fd";
    ab.i(l.Ow(), "genTmplPath() genTmplFDPath:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(14951);
    return paramString;
  }

  public static final String q(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(14949);
    j.p(paramString1, "uid");
    j.p(paramString2, "file");
    paramString1 = b.aXA() + paramInt + '_' + paramString1 + '/' + paramString2;
    ab.i(l.Ow(), "genTmplPath() tmplPath:".concat(String.valueOf(paramString1)));
    AppMethodBeat.o(14949);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.k
 * JD-Core Version:    0.6.2
 */