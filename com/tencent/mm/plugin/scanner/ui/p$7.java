package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.scanner.a.m;
import com.tencent.mm.plugin.scanner.util.d;
import com.tencent.mm.plugin.u.a.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.concurrent.atomic.AtomicBoolean;

final class p$7
  implements b.a
{
  p$7(p paramp, Activity paramActivity)
  {
  }

  public final void Vv(String paramString)
  {
    AppMethodBeat.i(81210);
    m.pZK.BU(m.pZI);
    if (this.qfp.qfd != null)
      this.qfp.qfd.chP();
    if ((this.qfp.ehJ == null) || (!this.qfp.ehJ.isShowing()))
    {
      this.qfp.qff = false;
      this.qfp.qfe.set(false);
      this.qfp.qfg = false;
      AppMethodBeat.o(81210);
    }
    while (true)
    {
      return;
      if (this.qfp.qet != null)
        this.qfp.qet.kj(true);
      this.qfp.ehJ.dismiss();
      m.pZK.bHT();
      h.a(this.val$activity, 2131302099, 2131297061, new p.7.2(this));
      this.qfp.qfe.set(false);
      AppMethodBeat.o(81210);
    }
  }

  public final void a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 1;
    AppMethodBeat.i(81209);
    m.pZK.BU(m.pZI);
    if (this.qfp.qfd != null)
      this.qfp.qfd.chP();
    if ((this.qfp.ehJ == null) || (!this.qfp.ehJ.isShowing()))
    {
      this.qfp.qff = false;
      this.qfp.qfg = false;
      AppMethodBeat.o(81209);
    }
    while (true)
    {
      return;
      if (this.qfp.qet != null)
        this.qfp.qet.kj(true);
      this.qfp.ehJ.dismiss();
      if (!bo.isNullOrNil(paramString2))
        break;
      m.pZK.bHT();
      h.a(this.val$activity, 2131302099, 2131297061, new p.7.1(this));
      AppMethodBeat.o(81209);
    }
    bv.aaq().c(10237, new Object[] { Integer.valueOf(1) });
    this.qfp.qet.cha();
    int j = i;
    if (paramInt1 != 19)
      if (paramInt1 != 22)
        break label252;
    label252: for (j = i; ; j = 2)
    {
      p.a(this.qfp, j, paramString2, paramArrayOfByte, paramInt1, paramInt2);
      this.qfp.qfg = false;
      this.qfp.qfe.set(false);
      AppMethodBeat.o(81209);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.p.7
 * JD-Core Version:    0.6.2
 */