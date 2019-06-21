package com.facebook.appevents.codeless;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

class ViewIndexer$ScreenshotTaker
  implements Callable<String>
{
  private WeakReference<View> rootView;

  public ViewIndexer$ScreenshotTaker(View paramView)
  {
    AppMethodBeat.i(72079);
    this.rootView = new WeakReference(paramView);
    AppMethodBeat.o(72079);
  }

  public String call()
  {
    AppMethodBeat.i(72080);
    Object localObject1 = (View)this.rootView.get();
    Object localObject2;
    if ((localObject1 == null) || (((View)localObject1).getWidth() == 0) || (((View)localObject1).getHeight() == 0))
    {
      localObject2 = "";
      AppMethodBeat.o(72080);
    }
    while (true)
    {
      return localObject2;
      localObject2 = Bitmap.createBitmap(((View)localObject1).getWidth(), ((View)localObject1).getHeight(), Bitmap.Config.RGB_565);
      ((View)localObject1).draw(new Canvas((Bitmap)localObject2));
      localObject1 = new ByteArrayOutputStream();
      ((Bitmap)localObject2).compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)localObject1);
      localObject2 = Base64.encodeToString(((ByteArrayOutputStream)localObject1).toByteArray(), 2);
      AppMethodBeat.o(72080);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.ScreenshotTaker
 * JD-Core Version:    0.6.2
 */