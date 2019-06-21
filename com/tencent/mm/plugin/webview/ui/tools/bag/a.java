package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.graphics.PointF;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  static final int uxY = i * i;
  boolean mIsShowing;
  int mScreenHeight;
  int mScreenWidth;
  a.a uxZ;
  final a.b uya;
  boolean uyb;
  PointF uyc;
  boolean uyd;
  boolean uye;

  static
  {
    int i = b.uyo;
  }

  public a(a.b paramb)
  {
    AppMethodBeat.i(8145);
    this.uyc = new PointF();
    this.uya = paramb;
    WindowManager localWindowManager = (WindowManager)ah.getContext().getSystemService("window");
    paramb = new WindowManager.LayoutParams();
    if (d.iW(26))
      paramb.type = 2038;
    while (true)
    {
      paramb.format = 1;
      paramb.flags = 40;
      paramb.gravity = 85;
      paramb.width = b.uyp;
      paramb.height = b.uyp;
      paramb.x = 0;
      paramb.y = 0;
      this.uxZ = new a.a(ah.getContext());
      try
      {
        this.uxZ.setVisibility(8);
        localWindowManager.addView(this.uxZ, paramb);
        AppMethodBeat.o(8145);
        return;
        paramb.type = 2002;
      }
      catch (Exception paramb)
      {
        while (true)
        {
          ab.e("MicroMsg.BagCancelController", "showCanceller add failed %s", new Object[] { paramb });
          AppMethodBeat.o(8145);
        }
      }
    }
  }

  public final void daX()
  {
    AppMethodBeat.i(8146);
    WindowManager localWindowManager = (WindowManager)ah.getContext().getSystemService("window");
    try
    {
      localWindowManager.removeView(this.uxZ);
      AppMethodBeat.o(8146);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.BagCancelController", "whenBagUnAttach remove failed %s", new Object[] { localException });
        AppMethodBeat.o(8146);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.a
 * JD-Core Version:    0.6.2
 */