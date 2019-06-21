package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class v$d
{
  long id;
  v.c puR;
  n.b puS;
  n.c puT;
  Map<String, String> puU;
  v.a puV;
  String uri;

  public v$d(v paramv, String paramString, n.b paramb, v.a parama)
  {
    AppMethodBeat.i(68003);
    this.id = System.currentTimeMillis();
    this.uri = paramString;
    this.puS = paramb;
    this.puV = parama;
    AppMethodBeat.o(68003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.v.d
 * JD-Core Version:    0.6.2
 */