package com.tencent.mm.at;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cache.e.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class c
{
  private HashMap<String, c> fDl;

  public c()
  {
    AppMethodBeat.i(78167);
    this.fDl = new HashMap();
    AppMethodBeat.o(78167);
  }

  public static void h(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(78169);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.CdnImageService", "push fail, key is null");
      AppMethodBeat.o(78169);
    }
    while (true)
    {
      return;
      e.a.a("local_cdn_img_cache", paramString, paramBitmap);
      AppMethodBeat.o(78169);
    }
  }

  public static Bitmap kR(String paramString)
  {
    AppMethodBeat.i(78170);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.CdnImageService", "get fail, key is null");
      paramString = null;
      AppMethodBeat.o(78170);
    }
    while (true)
    {
      return paramString;
      paramString = (Bitmap)e.a.J("local_cdn_img_cache", paramString);
      AppMethodBeat.o(78170);
    }
  }

  public final void a(String paramString, c paramc)
  {
    AppMethodBeat.i(78172);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.CdnImageService", "do load fail, url is empty");
      AppMethodBeat.o(78172);
    }
    while (true)
    {
      return;
      Bitmap localBitmap = kR(paramString);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        ab.i("MicroMsg.CdnImageService", "do load ok, url[%s], bitmap exists", new Object[] { paramString });
        if (paramc != null)
          paramc.C(localBitmap);
        AppMethodBeat.o(78172);
      }
      else
      {
        if (localBitmap == null);
        for (boolean bool = true; ; bool = false)
        {
          ab.w("MicroMsg.CdnImageService", "try to download: url[%s], src bitmap is null[%B]", new Object[] { paramString, Boolean.valueOf(bool) });
          if (!this.fDl.containsKey(paramString))
            break label145;
          ab.w("MicroMsg.CdnImageService", "contains url[%s]", new Object[] { paramString });
          AppMethodBeat.o(78172);
          break;
        }
        label145: this.fDl.put(paramString, paramc);
        d.post(new c.b(paramString, this.fDl), "CdnImageService_download");
        AppMethodBeat.o(78172);
      }
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(78168);
    super.finalize();
    AppMethodBeat.o(78168);
  }

  public final void rZ(String paramString)
  {
    AppMethodBeat.i(78171);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.CdnImageService", "stop load fail, url is empty");
      AppMethodBeat.o(78171);
    }
    while (true)
    {
      return;
      this.fDl.remove(paramString);
      AppMethodBeat.o(78171);
    }
  }

  static final class a
    implements Runnable
  {
    private HashMap<String, c.c> fDl;
    private Bitmap fDm;
    private String url;

    public a(String paramString, Bitmap paramBitmap, HashMap<String, c.c> paramHashMap)
    {
      this.url = paramString;
      this.fDm = paramBitmap;
      this.fDl = paramHashMap;
    }

    public final void run()
    {
      AppMethodBeat.i(78165);
      o.ahk();
      c.h(this.url, this.fDm);
      if (this.fDl != null)
      {
        localObject = (c.c)this.fDl.remove(this.url);
        if (localObject != null)
          ((c.c)localObject).C(this.fDm);
      }
      if (this.url == null);
      for (Object localObject = "null"; ; localObject = this.url)
      {
        ab.i("MicroMsg.CdnImageService", "finish download post job, url[%s]", new Object[] { localObject });
        AppMethodBeat.o(78165);
        return;
      }
    }
  }

  public static abstract interface c
  {
    public abstract void C(Bitmap paramBitmap);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.c
 * JD-Core Version:    0.6.2
 */