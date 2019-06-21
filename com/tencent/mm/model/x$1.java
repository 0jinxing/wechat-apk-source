package com.tencent.mm.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.at.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

final class x$1 extends ak
{
  x$1(x paramx, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(77800);
    try
    {
      Object localObject;
      Bitmap localBitmap;
      if (this.flk.flj != null)
      {
        paramMessage = (x.c)paramMessage.obj;
        if ((paramMessage.flo) && (q.ahs()))
        {
          localObject = q.sA(paramMessage.url);
          ab.d("MicroMsg.GetPicService", "convert webp, originPicFormat:%s, file:%s, url:%s", new Object[] { localObject, paramMessage.filename, paramMessage.url });
          localBitmap = d.aml(paramMessage.filename);
          if (localBitmap == null)
            break label227;
          if (!bo.isNullOrNil((String)localObject))
          {
            if (!((String)localObject).toLowerCase().contains("png"))
              break label176;
            ab.d("MicroMsg.GetPicService", "convert webp to png");
            d.a(localBitmap, 100, Bitmap.CompressFormat.PNG, paramMessage.filename, true);
          }
        }
      }
      while (true)
      {
        int i = e.cs(paramMessage.filename);
        if ((i > 0) && (g.RK()))
          ao.a.flv.cm(i, 0);
        localObject = new com/tencent/mm/model/x$1$1;
        ((x.1.1)localObject).<init>(this, paramMessage);
        al.d((Runnable)localObject);
        AppMethodBeat.o(77800);
        return;
        label176: ab.d("MicroMsg.GetPicService", "convert webp to jpg");
        d.a(localBitmap, 100, Bitmap.CompressFormat.JPEG, paramMessage.filename, true);
      }
    }
    catch (Exception paramMessage)
    {
      while (true)
      {
        ab.e("MicroMsg.GetPicService", "exception:%s", new Object[] { bo.l(paramMessage) });
        AppMethodBeat.o(77800);
        continue;
        label227: ab.d("MicroMsg.GetPicService", "decode webp picture failed");
        x.a(this.flk, 14L, 1L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.x.1
 * JD-Core Version:    0.6.2
 */