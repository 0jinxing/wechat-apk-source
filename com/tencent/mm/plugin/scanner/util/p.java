package com.tencent.mm.plugin.scanner.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.i.a;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.r;
import java.util.HashMap;
import java.util.Map;

public final class p
{
  private g.a fFk;
  private Map<String, p.a> jxd;

  public p()
  {
    AppMethodBeat.i(81486);
    this.jxd = new HashMap();
    this.fFk = new p.1(this);
    AppMethodBeat.o(81486);
  }

  public static String Wr(String paramString)
  {
    AppMethodBeat.i(81487);
    paramString = r.Yz() + "_" + paramString + "_" + System.currentTimeMillis();
    AppMethodBeat.o(81487);
    return paramString;
  }

  public final void a(String paramString1, String paramString2, int paramInt, p.a parama)
  {
    AppMethodBeat.i(81488);
    g localg = new g();
    localg.egl = this.fFk;
    localg.field_mediaId = paramString1;
    localg.field_fullpath = paramString2;
    localg.field_fileType = paramInt;
    localg.field_priority = a.efC;
    localg.field_needStorage = false;
    localg.field_isStreamMedia = false;
    localg.field_force_aeskeycdn = true;
    localg.field_trysafecdn = false;
    this.jxd.put(paramString1, parama);
    f.afx().e(localg);
    AppMethodBeat.o(81488);
  }

  public final class b
  {
    public String aeskey;
    public int errCode;
    public String fileId;

    public b()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.p
 * JD-Core Version:    0.6.2
 */