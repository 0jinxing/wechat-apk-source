package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.b.a.d;

final class e
{
  int auo;
  d lFy;
  int lFz;

  private e(int paramInt1, int paramInt2, String paramString1, String paramString2, d paramd)
  {
    AppMethodBeat.i(20235);
    this.auo = paramInt1;
    this.lFz = paramInt2;
    if (paramInt1 != 0)
      if (paramd != null)
      {
        this.lFy = paramd;
        AppMethodBeat.o(20235);
      }
    while (true)
    {
      return;
      paramd = new d();
      paramd.field_username = paramString2;
      paramd.field_appusername = paramString1;
      paramd.field_ranknum = 0;
      paramd.field_selfLikeState = 0;
      paramd.field_rankID = "";
      paramd.field_likecount = 0;
      paramd.field_score = 0;
      this.lFy = paramd;
      AppMethodBeat.o(20235);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(20236);
    String str = "{ view type: " + this.auo + " display flag: " + this.lFz;
    if (this.lFy != null);
    for (str = str + this.lFy.toString(); ; str = str + " mExdeviceRankInfo is null")
    {
      str = str + "}";
      AppMethodBeat.o(20236);
      return str;
    }
  }

  static final class a
  {
    int auo;
    String lCH;
    d lFy = null;
    int lFz;
    String username;

    public final e bqg()
    {
      AppMethodBeat.i(20234);
      e locale = new e(this.auo, this.lFz, this.lCH, this.username, this.lFy, (byte)0);
      AppMethodBeat.o(20234);
      return locale;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.e
 * JD-Core Version:    0.6.2
 */