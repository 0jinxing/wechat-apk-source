package com.tencent.magicbrush.handler.image;

import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class a$e
  implements Runnable
{
  private String bUh;
  private volatile boolean bUi;
  private WeakReference<MBRuntime> bUj;
  private WeakReference<a> bUk;
  private final a.e.a bUl;

  a$e(MBRuntime paramMBRuntime, a parama, String paramString)
  {
    AppMethodBeat.i(115969);
    this.bUi = false;
    this.bUl = new a.e.a();
    this.bUh = paramString;
    this.bUj = new WeakReference(paramMBRuntime);
    this.bUk = new WeakReference(parama);
    AppMethodBeat.o(115969);
  }

  public final void run()
  {
    AppMethodBeat.i(115970);
    if (this.bUi)
      AppMethodBeat.o(115970);
    while (true)
    {
      return;
      if (this.bUk.get() == null)
      {
        AppMethodBeat.o(115970);
      }
      else
      {
        IBitmap localIBitmap = ((a)this.bUk.get()).loadBitmapSync(this.bUh);
        if (this.bUi)
        {
          if (localIBitmap != null)
            localIBitmap.recycle();
          AppMethodBeat.o(115970);
        }
        else
        {
          MBRuntime localMBRuntime = (MBRuntime)this.bUj.get();
          if ((localMBRuntime == null) || (this.bUi))
          {
            if (localIBitmap != null)
              localIBitmap.recycle();
            AppMethodBeat.o(115970);
          }
          else
          {
            localMBRuntime.notifyImageDecoded(this.bUh, localIBitmap, this.bUl);
            AppMethodBeat.o(115970);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.image.a.e
 * JD-Core Version:    0.6.2
 */