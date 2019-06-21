package com.tencent.mm.plugin.appbrand.widget.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87561);
    try
    {
      b localb = this.jpt;
      Object localObject = Base64.decode(this.jpt.jpu, 0);
      localObject = BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length);
      if (localObject == null)
        localb.jpv.a("Failed to load icon via base64 icon", localb);
      this.jpt.I((Bitmap)localObject);
      AppMethodBeat.o(87561);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        this.jpt.jpv.a("Failed to load icon via base64 icon", this.jpt);
        AppMethodBeat.o(87561);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.b.1
 * JD-Core Version:    0.6.2
 */