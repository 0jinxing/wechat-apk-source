package com.tencent.mm.at.a.f;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class c
  implements Runnable
{
  private Bitmap bitmap;
  private b fHp;
  private com.tencent.mm.at.a.c fHr;
  private String key;
  private String url;

  public c(String paramString1, com.tencent.mm.at.a.c paramc, Bitmap paramBitmap, b paramb, String paramString2)
  {
    this.url = paramString1;
    this.fHr = paramc;
    this.bitmap = paramBitmap;
    this.fHp = paramb;
    this.key = paramString2;
  }

  public final void run()
  {
    AppMethodBeat.i(116112);
    if ((!bo.isNullOrNil(this.url)) && (this.fHr != null) && (this.bitmap != null) && (!this.bitmap.isRecycled()) && (this.fHp != null))
    {
      Object localObject1 = this.fHp;
      Object localObject2 = this.fHr;
      localObject2 = (String)((b)localObject1).fGN.get(Integer.valueOf(((com.tencent.mm.at.a.c)localObject2).eQF));
      if (this.url.equals(localObject2))
      {
        localObject1 = this.fHr;
        localObject2 = this.bitmap;
        if ((Looper.myLooper() == Looper.getMainLooper()) && (((com.tencent.mm.at.a.c)localObject1).eQD != null))
        {
          localObject1 = (ImageView)((com.tencent.mm.at.a.c)localObject1).eQD.get();
          if (localObject1 != null)
            ((ImageView)localObject1).setImageBitmap((Bitmap)localObject2);
        }
        this.fHp.a(this.fHr);
        AppMethodBeat.o(116112);
      }
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.imageloader.ImageShowTask", "[cpan] url is not equals view url.");
      AppMethodBeat.o(116112);
      continue;
      ab.w("MicroMsg.imageloader.ImageShowTask", "[cpan] run something is null.");
      AppMethodBeat.o(116112);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.f.c
 * JD-Core Version:    0.6.2
 */