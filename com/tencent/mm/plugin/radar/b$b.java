package com.tencent.mm.plugin.radar;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.h;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.i;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.IOException;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/SubCoreRadar$onAccountPostReset$1", "Lcom/tencent/mm/pluginsdk/ui/LazyBitmapDrawable$BitmapLoader;", "defaultBitmap", "Landroid/graphics/Bitmap;", "defaultBitmapRoundCorner", "mAvatarBitmapCache", "Lcom/tencent/mm/algorithm/MMLRUMap;", "", "Ljava/lang/ref/WeakReference;", "getDefaultBitmap", "getDefaultBitmapRoundCorner", "loadBitmap", "tag", "loadFromCache", "loadHdBitmap", "width", "", "height", "customFillet", "watch", "", "drawable", "Lcom/tencent/mm/pluginsdk/ui/LazyBitmapDrawable;", "plugin-radar_release"})
public final class b$b
  implements i.a
{
  private Bitmap cdX;
  private Bitmap pAI;
  private final h<String, WeakReference<Bitmap>> pAJ;

  b$b()
  {
    AppMethodBeat.i(102858);
    this.pAJ = new h(15);
    AppMethodBeat.o(102858);
  }

  private Bitmap cdw()
  {
    AppMethodBeat.i(102855);
    if ((this.pAI == null) && (AZ() != null));
    try
    {
      Bitmap localBitmap1 = this.cdX;
      Bitmap localBitmap2 = this.cdX;
      if (localBitmap2 == null)
        j.dWJ();
      this.pAI = com.tencent.mm.sdk.platformtools.d.a(localBitmap1, false, localBitmap2.getWidth() / 2);
      localBitmap2 = this.pAI;
      AppMethodBeat.o(102855);
      return localBitmap2;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace(b.access$getTAG$cp(), (Throwable)localException, "", new Object[0]);
    }
  }

  public final Bitmap AZ()
  {
    AppMethodBeat.i(102854);
    if (this.cdX == null);
    try
    {
      Object localObject = ah.getContext();
      j.o(localObject, "MMApplicationContext.getContext()");
      this.cdX = BackwardSupportUtil.b.a(((Context)localObject).getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
      localObject = this.cdX;
      AppMethodBeat.o(102854);
      return localObject;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.printErrStackTrace(b.access$getTAG$cp(), (Throwable)localIOException, "", new Object[0]);
    }
  }

  public final void a(i parami)
  {
    AppMethodBeat.i(102852);
    j.p(parami, "drawable");
    if ((parami instanceof d.a))
      o.acd().a((d.a)parami);
    AppMethodBeat.o(102852);
  }

  public final Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(102857);
    j.p(paramString, "tag");
    AppMethodBeat.o(102857);
    return null;
  }

  public final Bitmap cQ(String paramString)
  {
    AppMethodBeat.i(102853);
    j.p(paramString, "tag");
    WeakReference localWeakReference = (WeakReference)this.pAJ.get(paramString);
    Object localObject;
    if ((localWeakReference != null) && (localWeakReference.get() != null))
    {
      localObject = localWeakReference.get();
      if (localObject == null)
      {
        paramString = new v("null cannot be cast to non-null type android.graphics.Bitmap");
        AppMethodBeat.o(102853);
        throw paramString;
      }
      if ((!((Bitmap)localObject).isRecycled()) && (!(j.j((Bitmap)localWeakReference.get(), AZ()) ^ true)));
    }
    else
    {
      localObject = com.tencent.mm.ah.b.pW(paramString);
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
      {
        paramString = cdw();
        AppMethodBeat.o(102853);
      }
    }
    while (true)
    {
      return paramString;
      localObject = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, false, ((Bitmap)localObject).getWidth() / 2);
      this.pAJ.k(paramString, new WeakReference(localObject));
      paramString = (String)localObject;
      break;
      paramString = (Bitmap)localWeakReference.get();
      AppMethodBeat.o(102853);
    }
  }

  public final Bitmap cR(String paramString)
  {
    AppMethodBeat.i(102856);
    j.p(paramString, "tag");
    AppMethodBeat.o(102856);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.b
 * JD-Core Version:    0.6.2
 */