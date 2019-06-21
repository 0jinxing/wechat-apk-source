package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import android.view.View;
import com.davemorrissey.labs.subscaleview.view.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.WxImageView;

final class f$6$1
  implements Runnable
{
  f$6$1(f.6 param6, View paramView, String paramString)
  {
  }

  public final void run()
  {
    boolean bool1 = true;
    AppMethodBeat.i(32140);
    f.6 local6 = this.yVA;
    WxImageView localWxImageView = (WxImageView)this.val$view;
    String str = this.yVA.hVm;
    Object localObject = this.yVz;
    int i = this.yVA.yVy;
    if ((f.b(local6.yVu) != null) && (localWxImageView != null) && (!bo.isNullOrNil(str)))
    {
      int j = f.k(local6.yVu);
      boolean bool2;
      if (f.l(local6.yVu) == null)
      {
        bool2 = true;
        if ((f.l(local6.yVu) == null) || (!f.l(local6.yVu).isRecycled()))
          break label229;
      }
      while (true)
      {
        ab.i("MicroMsg.ImageGalleryLazyLoader", "alvinluo loadWxImageView position: %d, mLastPosition: %d, previewBitmap == null: %b, recycle: %b", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        if ((i != f.k(local6.yVu)) || (f.l(local6.yVu) == null) || (f.l(local6.yVu).isRecycled()))
          break label269;
        localObject = f.l(local6.yVu);
        if (localObject != null)
          break label234;
        localObject = new NullPointerException("Bitmap must not be null");
        AppMethodBeat.o(32140);
        throw ((Throwable)localObject);
        bool2 = false;
        break;
        label229: bool1 = false;
      }
      label234: localObject = new a((Bitmap)localObject);
    }
    while (true)
    {
      f.b(local6.yVu).a(localWxImageView, str, (a)localObject);
      AppMethodBeat.o(32140);
      return;
      label269: if (!bo.isNullOrNil((String)localObject))
        localObject = a.af((String)localObject);
      else
        localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.f.6.1
 * JD-Core Version:    0.6.2
 */