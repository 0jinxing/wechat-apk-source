package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

final class b$1
  implements g
{
  b$1(b paramb, int paramInt)
  {
  }

  public final Bitmap a(String paramString, View paramView, com.tencent.mm.at.a.d.b paramb)
  {
    Object localObject = null;
    AppMethodBeat.i(14132);
    if (this.jNO == 0)
    {
      AppMethodBeat.o(14132);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if ((paramb == null) || (paramb.bitmap == null) || (paramb.bitmap.isRecycled()))
      {
        ab.w("MicroMsg.BizTimeLineImgMsgHandler", "onProcessBitmap bitmap is null");
        AppMethodBeat.o(14132);
        paramString = localObject;
      }
      else if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.BizTimeLineImgMsgHandler", "onProcessBitmap url is null");
        AppMethodBeat.o(14132);
        paramString = localObject;
      }
      else
      {
        try
        {
          int i = a.gd(paramView.getContext()) - (int)(a.getDensity(paramView.getContext()) * 16.0F);
          if (this.jNP.jNL != 0);
          for (int j = this.jNP.jNL; ; j = (int)(i / 2.35D))
          {
            paramString = d.b(paramb.bitmap, i, j, true);
            paramView = Bitmap.createScaledBitmap(paramString, i, j, true);
            if ((paramView != paramString) && (paramString != null) && (!paramString.isRecycled()))
            {
              ab.i("MicroMsg.BizTimeLineImgMsgHandler", "bitmap recycled %s", new Object[] { paramString });
              paramString.recycle();
            }
            paramString = d.d(paramView, this.jNO);
            if ((paramView != null) && (!paramView.isRecycled()))
              paramView.recycle();
            AppMethodBeat.o(14132);
            break;
          }
        }
        catch (OutOfMemoryError paramString)
        {
          ab.w("MicroMsg.BizTimeLineImgMsgHandler", "onProcessBitmap OutOfMemoryError %s", new Object[] { paramString.getMessage() });
          AppMethodBeat.o(14132);
          paramString = localObject;
        }
      }
    }
  }

  public final void b(String paramString, View paramView, com.tencent.mm.at.a.d.b paramb)
  {
  }

  public final void sH(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.b.1
 * JD-Core Version:    0.6.2
 */