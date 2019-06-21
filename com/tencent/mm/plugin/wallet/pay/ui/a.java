package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hd;
import com.tencent.mm.g.a.hd.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.g;

public final class a
{
  private Dialog gII = null;
  private Context mContext;
  a.a toy = null;

  public a(Context paramContext, a.a parama)
  {
    this.mContext = paramContext;
    this.toy = parama;
  }

  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    AppMethodBeat.i(45954);
    final hd localhd = new hd();
    localhd.cBQ = null;
    localhd.cBP.cBR = paramBoolean;
    if ((paramBoolean) && ((this.gII == null) || ((this.gII != null) && (!this.gII.isShowing()))))
    {
      if (this.gII != null)
        this.gII.dismiss();
      this.gII = g.a(this.mContext, false, new a.2(this));
    }
    localhd.cBP.cBS = paramInt;
    localhd.cBP.cBT = paramString;
    localhd.callback = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(45952);
        ab.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback");
        hd.b localb = localhd.cBQ;
        if ((localb != null) && (localb.cxT))
        {
          ab.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is true");
          a.this.cNM();
          if (a.this.toy == null)
            break label159;
          a.this.toy.c(localb.cxT, localb.cBU, localb.cBV);
          AppMethodBeat.o(45952);
        }
        while (true)
        {
          return;
          if ((localb != null) && (!localb.cxT))
          {
            a.this.cNM();
            if (a.this.toy != null)
              a.this.toy.c(localb.cxT, localb.cBU, localb.cBV);
            ab.e("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is false");
            AppMethodBeat.o(45952);
          }
          else
          {
            ab.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result == null");
            label159: AppMethodBeat.o(45952);
          }
        }
      }
    };
    com.tencent.mm.sdk.b.a.xxA.a(localhd, Looper.getMainLooper());
    AppMethodBeat.o(45954);
  }

  public final void cNM()
  {
    AppMethodBeat.i(45955);
    if (this.gII != null)
    {
      this.gII.dismiss();
      this.gII = null;
    }
    AppMethodBeat.o(45955);
  }

  public final void release()
  {
    this.toy = null;
    this.mContext = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.a
 * JD-Core Version:    0.6.2
 */