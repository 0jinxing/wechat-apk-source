package com.tencent.mm.plugin.webview.ui.tools.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.eb;
import com.tencent.mm.g.a.ec;
import com.tencent.mm.g.a.ef;
import com.tencent.mm.g.a.ef.b;
import com.tencent.mm.g.a.el;
import com.tencent.mm.g.a.el.b;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.pluginsdk.ui.tools.t.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  implements t.a
{
  private static final byte[] ltL = { -2, 1, 1 };
  private static b uAk;
  public String cwz;
  public boolean hasInit = false;
  public byte[] uAa = null;
  public boolean uAc = false;
  public b.a uAj;
  public int uAl = -1;
  public boolean uAm = false;

  public static boolean bE(byte[] paramArrayOfByte)
  {
    boolean bool = true;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length >= 9) && (paramArrayOfByte[(paramArrayOfByte.length - 7)] == 1) && (paramArrayOfByte[(paramArrayOfByte.length - 8)] == 1) && (paramArrayOfByte[(paramArrayOfByte.length - 9)] == -2));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public static b dbr()
  {
    AppMethodBeat.i(8329);
    if (uAk == null)
      uAk = new b();
    b localb = uAk;
    AppMethodBeat.o(8329);
    return localb;
  }

  public final void dbp()
  {
    AppMethodBeat.i(8330);
    ab.i("MicroMsg.webview.WebViewExDeviceMgr", "stopPlugin, isScaning = %s", new Object[] { Boolean.valueOf(this.uAc) });
    if (this.uAc)
    {
      localObject = new ef();
      ((ef)localObject).cxG.cwA = false;
      ((ef)localObject).cxG.cwz = this.cwz;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if (!((ef)localObject).cxH.cwB)
        ab.e("MicroMsg.webview.WebViewExDeviceMgr", "stopScanWXDevice fail");
      this.uAc = false;
    }
    this.hasInit = false;
    if (this.uAj != null)
    {
      a.xxA.d(this.uAj.uAn);
      a.xxA.d(this.uAj.uAo);
      a.xxA.d(this.uAj.uAp);
      a.xxA.d(this.uAj.uAd);
      a.xxA.d(this.uAj.qwh);
      this.uAj = null;
    }
    this.uAa = null;
    Object localObject = new el();
    ((el)localObject).cxX.ceI = "";
    ((el)localObject).cxX.direction = 0;
    ((el)localObject).cxX.clear = true;
    a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    ab.i("MicroMsg.webview.WebViewExDeviceMgr", "stop EcDeviceMgr for webview %s", new Object[] { Boolean.valueOf(((el)localObject).cxY.cwB) });
    AppMethodBeat.o(8330);
  }

  public final void dbq()
  {
  }

  public final void ft(Context paramContext)
  {
  }

  public final String getName()
  {
    return "WebViewExDeviceMgr";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.a.b
 * JD-Core Version:    0.6.2
 */