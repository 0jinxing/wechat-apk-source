package com.tencent.mm.plugin.webview.ui.tools.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dv;
import com.tencent.mm.g.a.ee;
import com.tencent.mm.g.a.ev;
import com.tencent.mm.pluginsdk.ui.tools.t.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
  implements t.a
{
  private static String eSg = "lan";
  private static a uzZ;
  public String cwz;
  public boolean hasInit = false;
  public byte[] uAa = null;
  private int uAb = -1;
  public boolean uAc = false;
  public a.a uzY;

  public static a dbo()
  {
    AppMethodBeat.i(8315);
    if (uzZ == null)
      uzZ = new a();
    a locala = uzZ;
    AppMethodBeat.o(8315);
    return locala;
  }

  public final void dbp()
  {
    AppMethodBeat.i(8316);
    ab.i("MicroMsg.webview.WebViewExDeviceLanMgr", "stopPlugin, isScaning = %s", new Object[] { Boolean.valueOf(this.uAc) });
    if (this.uAc)
    {
      localObject = new ev();
      ((ev)localObject).cyp.cwA = false;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      this.uAc = false;
    }
    this.hasInit = false;
    if (this.uzY != null)
    {
      com.tencent.mm.sdk.b.a.xxA.d(this.uzY.uAd);
      com.tencent.mm.sdk.b.a.xxA.d(this.uzY.uAe);
      com.tencent.mm.sdk.b.a.xxA.d(this.uzY.uAg);
      com.tencent.mm.sdk.b.a.xxA.d(this.uzY.uAf);
      com.tencent.mm.sdk.b.a.xxA.d(this.uzY.uAh);
      this.uzY = null;
    }
    this.uAa = null;
    Object localObject = new ee();
    ((ee)localObject).cxF.cwA = false;
    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    AppMethodBeat.o(8316);
  }

  public final void dbq()
  {
  }

  public final void ft(Context paramContext)
  {
  }

  public final String getName()
  {
    return "WebViewExDeviceLanMgr";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.a.a
 * JD-Core Version:    0.6.2
 */