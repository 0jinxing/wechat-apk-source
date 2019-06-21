package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.location.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class k$a
  implements az.a
{
  private byte[] data;
  private String mFilePath;
  boolean nKd;
  private int nKe;
  private int nKf;
  String url;

  public k$a(k paramk, boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(113330);
    this.url = "";
    this.nKd = true;
    this.nKd = paramBoolean;
    this.nKe = paramk.w;
    this.nKf = paramk.h;
    this.url = paramString1;
    while (this.nKe * this.nKf > 270000)
    {
      this.nKe = ((int)(this.nKe / 1.2D));
      this.nKf = ((int)(this.nKf / 1.2D));
    }
    this.mFilePath = paramString2;
    ab.i("MicroMsg.StaticMapServer", "get url %s %s", new Object[] { paramString1, bo.bc(this.mFilePath, "") });
    AppMethodBeat.o(113330);
  }

  public final boolean acf()
  {
    AppMethodBeat.i(113331);
    this.data = bo.ano(this.url);
    if (this.data != null)
      e.b(this.mFilePath, this.data, this.data.length);
    AppMethodBeat.o(113331);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(113332);
    StringBuilder localStringBuilder = new StringBuilder("http onPostExecute ");
    boolean bool;
    if (this.data == null)
    {
      bool = true;
      ab.i("MicroMsg.StaticMapServer", bool + " isGoole: " + this.nKd);
      if (this.data != null)
        break label235;
      if (!this.nKd)
        break label219;
      if (this.nKg.nKc != null)
        break label93;
      k.a(this.nKg, false);
      AppMethodBeat.o(113332);
    }
    while (true)
    {
      return false;
      bool = false;
      break;
      label93: this.url = String.format("http://st.map.qq.com/api?size=%d*%d&center=%f,%f&zoom=%d&referer=weixin", new Object[] { Integer.valueOf(this.nKe), Integer.valueOf(this.nKf), Float.valueOf(this.nKg.nKc.fBs), Float.valueOf(this.nKg.nKc.fBr), Integer.valueOf(this.nKg.nKc.cED) });
      this.nKg.fBz.e(new a(this.nKg, false, this.url, k.b(this.nKg.nKc)));
      AppMethodBeat.o(113332);
      continue;
      label219: k.a(this.nKg, false);
      AppMethodBeat.o(113332);
      continue;
      label235: k.a(this.nKg, true);
      AppMethodBeat.o(113332);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.k.a
 * JD-Core Version:    0.6.2
 */