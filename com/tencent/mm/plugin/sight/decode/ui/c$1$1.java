package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.ui.base.h;
import java.io.File;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, Bitmap paramBitmap, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70277);
    Object localObject = (ImageView)this.qyU.qyT.findViewById(2131823993);
    ((ImageView)localObject).setImageBitmap(this.pKM);
    ((ImageView)localObject).setVisibility(0);
    localObject = new Intent();
    ((Intent)localObject).setAction("android.intent.action.VIEW");
    k.a(this.qyU.qyT.getContext(), (Intent)localObject, new File(this.hWl), "video/*");
    try
    {
      this.qyU.qyT.getContext().startActivity(Intent.createChooser((Intent)localObject, this.qyU.qyT.getContext().getString(2131297077)));
      AppMethodBeat.o(70277);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.VideoPopupHelper", "startActivity fail, activity not found");
        h.g(this.qyU.qyT.getContext(), 2131301729, 2131301730);
        AppMethodBeat.o(70277);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.c.1.1
 * JD-Core Version:    0.6.2
 */