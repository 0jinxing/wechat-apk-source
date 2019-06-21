package com.tencent.mm.booter.cache;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.cache.MCacheItem;
import com.tencent.mm.cache.f.a;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.u;
import java.util.Map;

public final class a extends f.a
{
  public static a edm;
  private final f<String, Bitmap> edn;

  private a()
  {
    AppMethodBeat.i(15884);
    Context localContext = ah.getContext();
    if (com.tencent.mm.platformtools.a.a.values == null);
    try
    {
      com.tencent.mm.platformtools.a.a.values = u.amt(bo.convertStreamToString(localContext.getAssets().open("profile.ini")));
      if (com.tencent.mm.platformtools.a.a.values == null)
      {
        localContext = null;
        this.edn = new b(bo.getInt(localContext, 2000), getClass());
        AppMethodBeat.o(15884);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ProfileUtil", "exception:%s", new Object[] { bo.l(localException) });
        continue;
        String str = (String)com.tencent.mm.platformtools.a.a.values.get("BACKGROUND_BITMAP_CACHE_LIMIT");
      }
    }
  }

  public static void destroy()
  {
    AppMethodBeat.i(15886);
    if (edm == null)
      AppMethodBeat.o(15886);
    while (true)
    {
      return;
      edm.edn.clear();
      AppMethodBeat.o(15886);
    }
  }

  public static void prepare()
  {
    AppMethodBeat.i(15885);
    if (edm == null)
      edm = new a();
    AppMethodBeat.o(15885);
  }

  public final void b(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(15889);
    ab.v("MicroMsg.MMCacheImpl", "setting bitmap: %s", new Object[] { paramString });
    this.edn.k(paramString, paramBitmap);
    AppMethodBeat.o(15889);
  }

  public final Bitmap getBitmap(String paramString)
  {
    AppMethodBeat.i(15887);
    ab.v("MicroMsg.MMCacheImpl", "getting bitmap: %s", new Object[] { paramString });
    paramString = (Bitmap)this.edn.get(paramString);
    AppMethodBeat.o(15887);
    return paramString;
  }

  public final MCacheItem jM(String paramString)
  {
    AppMethodBeat.i(15888);
    ab.v("MicroMsg.MMCacheImpl", "getting cache item: %s", new Object[] { paramString });
    AppMethodBeat.o(15888);
    return null;
  }

  public final void jN(String paramString)
  {
    AppMethodBeat.i(15890);
    ab.v("MicroMsg.MMCacheImpl", "setting cache item: %s", new Object[] { paramString });
    AppMethodBeat.o(15890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.cache.a
 * JD-Core Version:    0.6.2
 */