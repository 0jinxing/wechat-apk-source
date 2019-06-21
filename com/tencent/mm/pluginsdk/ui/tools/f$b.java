package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;
import java.util.HashMap;

final class f$b
  implements Runnable
{
  private int eTi;
  private int eTj;
  private String url;
  private String[] vuL;
  private String vuM;

  private f$b(f paramf)
  {
  }

  private Bitmap ajZ(String paramString)
  {
    AppMethodBeat.i(79933);
    Object localObject;
    if (paramString == null)
    {
      localObject = null;
      AppMethodBeat.o(79933);
      return localObject;
    }
    if ((this.eTj <= 0) || (this.eTi <= 0))
      localObject = x.vv(paramString);
    String str;
    Bitmap localBitmap;
    do
    {
      AppMethodBeat.o(79933);
      break;
      str = paramString + "_" + this.eTi + "_" + this.eTj;
      localBitmap = x.q(str, this.eTi, this.eTj);
      localObject = localBitmap;
    }
    while (localBitmap != null);
    int i = BackwardSupportUtil.ExifHelper.bJ(paramString);
    if ((90 == i) || (270 == i));
    for (paramString = d.d(paramString, this.eTi, this.eTj, true); ; paramString = d.d(paramString, this.eTj, this.eTi, true))
    {
      while (true)
      {
        localObject = paramString;
        if (paramString == null)
          break;
        localObject = d.b(paramString, i);
        try
        {
          d.a((Bitmap)localObject, 100, Bitmap.CompressFormat.PNG, str, false);
        }
        catch (IOException paramString)
        {
          ab.printErrStackTrace("MicroMsg.ImageEngine", paramString, "", new Object[0]);
        }
      }
      break;
    }
  }

  public final void run()
  {
    AppMethodBeat.i(79934);
    if (this.vuC.vur)
    {
      ab.w("MicroMsg.ImageEngine", "on load image jog, isQuit, return");
      AppMethodBeat.o(79934);
    }
    while (true)
    {
      return;
      Object localObject2;
      int i;
      synchronized (this.vuC.eMl)
      {
        if (this.vuC.vuu.get(this.vuM) == null)
        {
          ab.w("MicroMsg.ImageEngine", "check before decode, no match wait to render view, renderKey is %s, return", new Object[] { this.vuM });
          AppMethodBeat.o(79934);
          continue;
        }
        ??? = null;
        localObject2 = null;
        if (this.vuL != null)
        {
          i = 0;
          ??? = localObject2;
          if (i < this.vuL.length)
          {
            if (i != 0)
              break label353;
            ??? = ajZ(this.vuL[0]);
            localObject2 = ???;
            if (??? == null)
              break label432;
            this.vuC.vuw.put(this.vuM, ???);
          }
        }
        label146: localObject2 = ???;
        if (??? == null)
        {
          localObject2 = ???;
          if (!bo.isNullOrNil(this.url))
          {
            ??? = x.a(this.vuC.h(this.vuM, this.url, this.eTi, this.eTj));
            localObject2 = ???;
            if (??? != null)
            {
              this.vuC.vuw.put(this.vuM, ???);
              localObject2 = ???;
            }
          }
        }
        if (localObject2 == null);
      }
      synchronized (this.vuC.eMl)
      {
        ImageView localImageView = (ImageView)this.vuC.vuu.get(this.vuM);
        if (localImageView != null)
        {
          this.vuC.vuv.remove(localImageView);
          localObject6 = (f.d)this.vuC.vuy.dls();
          ((f.d)localObject6).cAw = localImageView;
          ((f.d)localObject6).mQQ = localObject2;
          this.vuC.fbD.post((Runnable)localObject6);
        }
        this.vuC.vuu.remove(this.vuM);
        this.vuC.vuz.cy(this);
        AppMethodBeat.o(79934);
        continue;
        localObject3 = finally;
        AppMethodBeat.o(79934);
        throw localObject3;
        label353: Object localObject6 = f.o(this.vuL[i], this.url, this.eTi, this.eTj);
        Object localObject4 = (Bitmap)this.vuC.vuw.get((String)localObject6);
        ??? = localObject4;
        if (localObject4 == null)
          ??? = ajZ(this.vuL[i]);
        localObject4 = ???;
        if (??? != null)
        {
          this.vuC.vuw.put((String)localObject6, ???);
          break label146;
        }
        label432: i++;
        ??? = localObject4;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.f.b
 * JD-Core Version:    0.6.2
 */