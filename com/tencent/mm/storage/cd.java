package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class cd extends j<cc>
  implements g.a
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(116827);
    fnj = new String[] { j.a(cc.ccO, "VoiceTransText") };
    AppMethodBeat.o(116827);
  }

  public cd(e parame)
  {
    this(parame, cc.ccO, "VoiceTransText");
  }

  private cd(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final boolean a(cc paramcc)
  {
    boolean bool = false;
    AppMethodBeat.i(116824);
    if (paramcc == null)
      AppMethodBeat.o(116824);
    while (true)
    {
      return bool;
      paramcc = paramcc.Hl();
      if (this.bSd.replace("VoiceTransText", "msgId", paramcc) >= 0L)
      {
        bool = true;
        AppMethodBeat.o(116824);
      }
      else
      {
        AppMethodBeat.o(116824);
      }
    }
  }

  public final cc aqb(String paramString)
  {
    cc localcc = null;
    AppMethodBeat.i(116825);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(116825);
    for (paramString = localcc; ; paramString = localcc)
    {
      return paramString;
      localcc = new cc();
      paramString = this.bSd.a("VoiceTransText", null, "cmsgId=?", new String[] { String.valueOf(paramString) }, null, null, null, 2);
      if (paramString.moveToFirst())
        localcc.d(paramString);
      paramString.close();
      AppMethodBeat.o(116825);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cd
 * JD-Core Version:    0.6.2
 */