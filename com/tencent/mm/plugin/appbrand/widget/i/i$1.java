package com.tencent.mm.plugin.appbrand.widget.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.q;
import java.io.File;

final class i$1
  implements Runnable
{
  i$1(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87570);
    Object localObject = this.jpC.hwf.asE().yg(this.jpC.jpu);
    if (localObject == null)
    {
      this.jpC.jpv.a("Failed to load icon via temp file", this.jpC);
      AppMethodBeat.o(87570);
    }
    while (true)
    {
      return;
      localObject = BitmapFactory.decodeFile(((File)localObject).getPath());
      if (localObject != null)
      {
        this.jpC.I((Bitmap)localObject);
        AppMethodBeat.o(87570);
      }
      else
      {
        this.jpC.jpv.a("Failed to load icon via temp file", this.jpC);
        AppMethodBeat.o(87570);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.i.1
 * JD-Core Version:    0.6.2
 */