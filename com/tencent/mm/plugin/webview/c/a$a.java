package com.tencent.mm.plugin.webview.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.protocal.protobuf.buz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$a
{
  boolean cxT;
  boolean isRunning;
  private b ueT;
  private String ueU;
  private long ueV;

  private a$a(a parama)
  {
  }

  private static String dz(String paramString, int paramInt)
  {
    AppMethodBeat.i(5651);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString);
    localStringBuffer.append(paramInt);
    paramString = com.tencent.mm.a.g.x(localStringBuffer.toString().getBytes());
    AppMethodBeat.o(5651);
    return paramString;
  }

  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(5652);
    if (bo.isNullOrNil(paramString1))
      if (paramString2 == null)
      {
        paramString2 = "";
        ab.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "error query:%s type:%d pagebuf:%s ", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2 });
        AppMethodBeat.o(5652);
      }
    while (true)
    {
      return;
      paramString2 = paramString2.toString();
      break;
      String str = dz(paramString1, paramInt1);
      if ((!bo.isNullOrNil(this.ueU)) && (this.ueU.equals(str)) && (System.currentTimeMillis() - this.ueV <= 8000L) && (bo.isNullOrNil(paramString2)))
      {
        if (this.cxT)
        {
          ab.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "hit the search cache %s", new Object[] { paramString1 });
          h.JR(paramInt2).a(this.ueT.cWk().wWr, true, aa.b(this.ueT.cWk().wok), this.ueT.cWk().won);
          AppMethodBeat.o(5652);
        }
        else if (this.isRunning)
        {
          if (this.ueT != null)
            this.ueT.ueW = paramInt2;
          ab.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "wait the netscene running");
          AppMethodBeat.o(5652);
        }
        else
        {
          ab.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "netscene error try again");
        }
      }
      else
      {
        ab.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "start New NetScene query:%s newMD5:%s webviewID:%d", new Object[] { paramString1, str, Integer.valueOf(paramInt2) });
        if (this.ueT != null)
          com.tencent.mm.kernel.g.Rg().c(this.ueT);
        this.ueU = str;
        this.ueV = System.currentTimeMillis();
        this.isRunning = true;
        this.cxT = false;
        com.tencent.mm.kernel.g.Rg().a(234, this.ueS);
        this.ueT = new b(paramInt1, paramString1, paramString2.getBytes(), paramInt2, paramLong);
        com.tencent.mm.kernel.g.Rg().a(this.ueT, 0);
        AppMethodBeat.o(5652);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.c.a.a
 * JD-Core Version:    0.6.2
 */