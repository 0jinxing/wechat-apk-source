package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.ui.base.WxImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

final class f$6
  implements az.a
{
  private Bitmap mQQ = null;
  private boolean yVx = false;

  f$6(f paramf, String paramString, int paramInt)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(32142);
    boolean bool;
    if ((f.b(this.yVu) == null) || (TextUtils.isEmpty(this.hVm)))
    {
      AppMethodBeat.o(32142);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        if (f.e(this.yVu).containsKey(this.hVm))
        {
          int i = ((Integer)f.e(this.yVu).get(this.hVm)).intValue();
          Object localObject = (WeakReference)f.i(this.yVu).get(i);
          if (localObject != null)
          {
            View localView = (View)((WeakReference)localObject).get();
            if ((localView != null) && ((localView instanceof WxImageView)))
            {
              localObject = (String)f.j(this.yVu).get(i);
              this.yVx = true;
              ak localak = f.c(this.yVu);
              f.6.1 local1 = new com/tencent/mm/ui/chatting/gallery/f$6$1;
              local1.<init>(this, localView, (String)localObject);
              localak.post(local1);
              AppMethodBeat.o(32142);
              bool = true;
            }
          }
        }
        else
        {
          this.mQQ = f.b(this.yVu).loadImage(this.hVm);
          AppMethodBeat.o(32142);
          bool = true;
        }
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.ImageGalleryLazyLoader", "try to load Bmp fail: %s", new Object[] { localException.getMessage() });
        this.mQQ = null;
        AppMethodBeat.o(32142);
        bool = false;
      }
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(32141);
    f.d(this.yVu);
    if (!this.yVx)
      if (f.e(this.yVu).containsKey(this.hVm))
      {
        i = ((Integer)f.e(this.yVu).get(this.hVm)).intValue();
        if (f.f(this.yVu))
          break label170;
        f.g(this.yVu).put(i, this.mQQ);
      }
    Object localObject;
    int j;
    while (true)
    {
      this.yVu.u(this.hVm, this.mQQ);
      this.yVu.c(this.yVy, this.mQQ);
      localObject = this.mQQ;
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
        break;
      j = 0;
      ab.i("MicroMsg.ImageGalleryLazyLoader", "bmp size : %s", new Object[] { Integer.valueOf(j) });
      this.mQQ = null;
      f.h(this.yVu);
      AppMethodBeat.o(32141);
      return false;
      label170: f.a(this.yVu, i, this.mQQ);
    }
    if (Build.VERSION.SDK_INT >= 12);
    for (int i = ((Bitmap)localObject).getByteCount(); ; i = ((Bitmap)localObject).getRowBytes() * ((Bitmap)localObject).getHeight())
    {
      j = i;
      if (i >= 0)
        break;
      localObject = new IllegalStateException("Negative size: ".concat(String.valueOf(localObject)));
      AppMethodBeat.o(32141);
      throw ((Throwable)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.f.6
 * JD-Core Version:    0.6.2
 */