package com.tencent.mm.pluginsdk.ui.applet;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;
import com.tencent.mm.at.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

public final class e
  implements g
{
  private int jNL;
  private int vkb;
  private int vkc;
  e.a vkd;

  public e()
  {
    this(0, 0, 0, null);
  }

  public e(int paramInt1, int paramInt2, int paramInt3, e.a parama)
  {
    this.vkb = paramInt1;
    this.vkc = paramInt2;
    this.jNL = paramInt3;
    this.vkd = parama;
  }

  public final Bitmap a(String paramString, View paramView, b paramb)
  {
    paramView = null;
    AppMethodBeat.i(11687);
    if (this.vkb == 0)
    {
      AppMethodBeat.o(11687);
      paramString = paramView;
    }
    while (true)
    {
      return paramString;
      if ((paramb == null) || (paramb.bitmap == null) || (paramb.bitmap.isRecycled()))
      {
        ab.w("MicroMsg.ReaderAppUI", "onProcessBitmap bitmap is null");
        AppMethodBeat.o(11687);
        paramString = paramView;
      }
      else if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.ReaderAppUI", "onProcessBitmap url is null");
        AppMethodBeat.o(11687);
        paramString = paramView;
      }
      else
      {
        try
        {
          paramString = d.b(paramb.bitmap, this.vkc, this.jNL, true);
          paramb = Bitmap.createScaledBitmap(paramString, this.vkc, this.jNL, true);
          if ((paramb != paramString) && (paramString != null) && (!paramString.isRecycled()))
          {
            ab.i("MicroMsg.ReaderAppUI", "bitmap recycle %s", new Object[] { paramString.toString() });
            paramString.recycle();
          }
          paramString = d.d(paramb, this.vkb);
          if ((paramb != null) && (!paramb.isRecycled()))
          {
            ab.i("MicroMsg.ReaderAppUI", "bitmap recycle %s", new Object[] { paramb.toString() });
            paramb.recycle();
          }
          AppMethodBeat.o(11687);
        }
        catch (OutOfMemoryError paramString)
        {
          ab.w("MicroMsg.ReaderAppUI", "onProcessBitmap OutOfMemoryError %s", new Object[] { paramString.getMessage() });
          AppMethodBeat.o(11687);
          paramString = paramView;
        }
      }
    }
  }

  public final void b(String paramString, View paramView, b paramb)
  {
    AppMethodBeat.i(11688);
    if ((this.vkd != null) && (paramb.bitmap != null) && (!paramb.bitmap.isRecycled()))
    {
      paramView = new e.1(this);
      if (Looper.getMainLooper().getThread() != Thread.currentThread())
        break label72;
      paramView.run();
    }
    while (paramb.from != 2)
    {
      AppMethodBeat.o(11688);
      return;
      label72: al.d(paramView);
    }
    ab.d("MicroMsg.ReaderAppUI", "onImageLoadFinish, url:%s, contentType: %s", new Object[] { paramString, paramb.bqF });
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (q.ahs())
    {
      bool2 = bool1;
      if (!bo.isNullOrNil(paramb.bqF))
      {
        bool2 = bool1;
        if (q.sz(paramString))
        {
          bool2 = bool1;
          if (paramb.bqF.equals("image/webp"))
            bool2 = true;
        }
      }
    }
    int i = paramb.status;
    ab.d("MicroMsg.ReaderAppUI", "onImageLoadFinish, isDownloadWebp: %b, status: %d", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(i) });
    switch (i)
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(11688);
      break;
      if (bool2)
      {
        h.pYm.a(86L, 13L, 1L, false);
        AppMethodBeat.o(11688);
        break;
        h.pYm.a(86L, 2L, 1L, false);
        if (bool2)
        {
          h.pYm.a(86L, 15L, 1L, false);
          AppMethodBeat.o(11688);
          break;
          if (bool2)
            h.pYm.a(86L, 14L, 1L, false);
        }
      }
    }
  }

  public final void sH(String paramString)
  {
    AppMethodBeat.i(11686);
    ab.d("MicroMsg.ReaderAppUI", "onImageLoadStart, url: %s", new Object[] { paramString });
    h.pYm.a(86L, 0L, 1L, false);
    AppMethodBeat.o(11686);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.e
 * JD-Core Version:    0.6.2
 */