package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Message;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a.m;
import com.tencent.mm.plugin.scanner.e;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.plugin.scanner.util.h;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;

final class BaseScanUI$16 extends ak
{
  BaseScanUI$16(BaseScanUI paramBaseScanUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(80928);
    h localh;
    while (true)
    {
      synchronized (BaseScanUI.s(this.qbV))
      {
        localh = BaseScanUI.a(this.qbV);
        if (paramMessage == null)
        {
          ab.w("MicroMsg.scanner.BaseScanUI", "selectScanModeHandler msg is null");
          AppMethodBeat.o(80928);
          return;
        }
      }
      if (BaseScanUI.D(this.qbV))
      {
        ab.w("MicroMsg.scanner.BaseScanUI", "selectScanModeHandler click too quick, msg.what=[%s]", new Object[] { Integer.valueOf(paramMessage.what) });
        AppMethodBeat.o(80928);
      }
      else
      {
        BaseScanUI.f(this.qbV, true);
        if (BaseScanUI.i(this.qbV) != null)
        {
          if (BaseScanUI.j(this.qbV) == paramMessage.what)
          {
            BaseScanUI.f(this.qbV, false);
            AppMethodBeat.o(80928);
          }
          else
          {
            BaseScanUI.i(this.qbV).onPause();
            if (BaseScanUI.i(this.qbV).cgO() != null)
              BaseScanUI.i(this.qbV).cgO().sI();
            BaseScanUI.i(this.qbV).onDestroy();
            BaseScanUI.a(this.qbV, null);
          }
        }
        else
        {
          if ((!BaseScanUI.b(this.qbV)) || (BaseScanUI.c(this.qbV)))
            BaseScanUI.b(this.qbV, false);
          while (true)
          {
            if ((!BaseScanUI.E(this.qbV)) || (paramMessage.what == 1))
              break label294;
            Toast.makeText(this.qbV, 2131302728, 0).show();
            this.qbV.X(1, 0L);
            BaseScanUI.f(this.qbV, false);
            AppMethodBeat.o(80928);
            break;
            BaseScanUI.b(this.qbV, true);
          }
          label294: if (!this.qbV.isFinishing())
            break;
          ab.w("MicroMsg.scanner.BaseScanUI", "selectScanModeHandler is invoke after ui was destroyed, msg.what=[%s]", new Object[] { Integer.valueOf(paramMessage.what) });
          AppMethodBeat.o(80928);
        }
      }
    }
    if (localh != null)
      localh.Cd(paramMessage.what);
    this.qbV.cgZ();
    BaseScanUI.c(this.qbV, false);
    BaseScanUI.a(this.qbV, paramMessage.what);
    switch (paramMessage.what)
    {
    case 6:
    case 7:
    default:
    case 1:
    case 4:
    case 8:
    case 2:
    case 3:
    case 5:
    }
    while (true)
    {
      if ((localh != null) && (localh.isOpen()) && (localh.lUE))
      {
        localh.cic();
        localh.Cf(1);
      }
      m.pZK.reset();
      if ((BaseScanUI.j(this.qbV) != 3) || (!r.cio()))
        BaseScanUI.I(this.qbV);
      BaseScanUI.f(this.qbV, false);
      AppMethodBeat.o(80928);
      break;
      if (BaseScanUI.F(this.qbV))
      {
        this.qbV.setMMTitle(2131302736);
        BaseScanUI.a(this.qbV, new p(this.qbV, BaseScanUI.z(this.qbV), BaseScanUI.G(this.qbV), 1));
      }
      else
      {
        this.qbV.setMMTitle(2131302737);
        BaseScanUI.a(this.qbV, new p(this.qbV, BaseScanUI.z(this.qbV), BaseScanUI.G(this.qbV), 0));
        continue;
        this.qbV.setMMTitle(2131302737);
        BaseScanUI.a(this.qbV, new p(this.qbV, BaseScanUI.z(this.qbV), BaseScanUI.G(this.qbV), 2));
        continue;
        this.qbV.setMMTitle(2131302736);
        BaseScanUI.a(this.qbV, new p(this.qbV, BaseScanUI.z(this.qbV), BaseScanUI.G(this.qbV), 1));
        continue;
        this.qbV.setMMTitle(r.fT(r.qiQ, this.qbV.getString(2131302746)));
        BaseScanUI.a(this.qbV, new k(this.qbV, BaseScanUI.z(this.qbV)));
        continue;
        this.qbV.setMMTitle(2131302734);
        BaseScanUI.a(this.qbV, new o(this.qbV, BaseScanUI.z(this.qbV)));
        if (r.cio())
        {
          paramMessage = new Intent();
          Bitmap localBitmap = d.eB(BaseScanUI.H(this.qbV));
          if (localBitmap != null);
          try
          {
            ??? = Bitmap.CompressFormat.JPEG;
            e.cgy();
            d.a(localBitmap, 70, (Bitmap.CompressFormat)???, e.Wd("jpg"), true);
            e.cgy();
            paramMessage.putExtra("key_first_background", e.Wd("jpg"));
            paramMessage.setClass(this.qbV, ScanTranslationCaptureUI.class);
            this.qbV.startActivity(paramMessage);
            this.qbV.overridePendingTransition(2131034130, 2131034130);
            BaseScanUI.B(this.qbV);
          }
          catch (Exception localException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "get scan ui bg failed!", new Object[0]);
          }
          this.qbV.setMMTitle(2131302738);
          BaseScanUI.a(this.qbV, new q(this.qbV, BaseScanUI.z(this.qbV)));
          BaseScanUI.c(this.qbV, true);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.16
 * JD-Core Version:    0.6.2
 */