package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class am$a
{
  public String cIY;
  public int clear;
  public long fJB;
  public String id;
  public long oak;
  public int tZU;
  public String text;
  public long timestamp;
  public int type;
  public int uaU;
  public int uaV;
  public int uaW;
  int uaX;

  public am$a()
  {
    AppMethodBeat.i(124206);
    this.fJB = System.currentTimeMillis();
    AppMethodBeat.o(124206);
  }

  final String aDu()
  {
    AppMethodBeat.i(124208);
    String str = this.id + "&" + this.uaU + "&" + this.uaV + "&" + this.oak + "&" + this.tZU + "&" + this.type + "&" + this.text + "&" + this.cIY + "&" + this.timestamp + "&" + this.uaW + "&" + this.fJB + "&" + this.uaX;
    AppMethodBeat.o(124208);
    return str;
  }

  public final boolean isValid()
  {
    boolean bool1 = false;
    AppMethodBeat.i(124207);
    boolean bool2;
    if (this.clear == 1)
    {
      AppMethodBeat.o(124207);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (this.uaV > d.vxo)
      {
        ab.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "msgid %s clientVersion %d invalid ,curVer is %d", new Object[] { this.id, Integer.valueOf(this.uaV), Integer.valueOf(d.vxo) });
        AppMethodBeat.o(124207);
        bool2 = bool1;
      }
      else
      {
        if (System.currentTimeMillis() > this.fJB + this.oak * 1000L);
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label140;
          ab.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "msgid %s expired", new Object[] { this.id });
          AppMethodBeat.o(124207);
          bool2 = bool1;
          break;
        }
        label140: String str = this.uaU + "h5 version valid ? %b, red.h5 %d, cur.h5 %s, red.timestamp %d, last rec.timestamp %d";
        if (aa.HV(0) >= this.tZU);
        for (bool2 = true; ; bool2 = false)
        {
          ab.i("MicroMsg.WebSearch.WebSearchRedPointMgr", str, new Object[] { Boolean.valueOf(bool2), Integer.valueOf(this.tZU), Integer.valueOf(aa.HV(0)), Long.valueOf(this.timestamp), Long.valueOf(am.cVu()) });
          if ((aa.HV(0) < this.tZU) || (this.timestamp <= am.cVu()))
            break label271;
          AppMethodBeat.o(124207);
          bool2 = true;
          break;
        }
        label271: AppMethodBeat.o(124207);
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.am.a
 * JD-Core Version:    0.6.2
 */