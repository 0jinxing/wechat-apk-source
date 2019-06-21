package com.tencent.mm.plugin.gallery.ui;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class h$b
  implements Runnable
{
  final WeakReference<ImageView> mSg;

  h$b(ImageView paramImageView)
  {
    AppMethodBeat.i(138612);
    this.mSg = new WeakReference(paramImageView);
    AppMethodBeat.o(138612);
  }

  public final void run()
  {
    AppMethodBeat.i(21606);
    Object localObject = (ImageView)this.mSg.get();
    if (localObject == null)
    {
      localObject = null;
      if ((localObject != null) && ((localObject instanceof h)))
        break label56;
      ab.w("MicroMsg.ThumbDrawable", "[tomys] ownerView is null or not a ThumbDrawable, ignore this task.");
      AppMethodBeat.o(21606);
    }
    while (true)
    {
      return;
      localObject = ((ImageView)localObject).getDrawable();
      break;
      label56: ab.v("MicroMsg.ThumbDrawable", "invalidateSelf");
      localObject = (h)localObject;
      h.a((h)localObject, e.bBY().Nz(((h)localObject).mFilePath));
      if ((((h)localObject).mSc != null) && (h.a((h)localObject) != null) && (!h.a((h)localObject).isRecycled()))
        ((h)localObject).mSc.bCx();
      if ((h.a((h)localObject) == null) || (h.a((h)localObject).isRecycled()))
      {
        e.bBY().b(((h)localObject).mFilePath, ((h)localObject).cyQ, ((h)localObject).mNC, ((h)localObject).mND);
        ab.v("MicroMsg.ThumbDrawable", "invalidateSelf! mBitmap is null! path:%s", new Object[] { ((h)localObject).mFilePath });
      }
      ((h)localObject).mSd = SystemClock.uptimeMillis();
      ((h)localObject).invalidateSelf();
      AppMethodBeat.o(21606);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.h.b
 * JD-Core Version:    0.6.2
 */