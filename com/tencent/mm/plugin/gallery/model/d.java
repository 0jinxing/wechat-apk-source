package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Vector;

public final class d
{
  l<d.b, String> fry;
  Vector<d.b> ghp;
  com.tencent.mm.a.f<String, d.a> mNF;
  f mNG;
  private final d.b mNH;

  public d()
  {
    AppMethodBeat.i(21243);
    this.fry = new d.1(this);
    this.ghp = new Vector();
    this.mNH = new d.2(this);
    this.mNF = new b(100, new d.3(this), getClass());
    f localf = new f(new File(e.eSn + "/diskcache"));
    localf.mNZ = ah.getContext().getSharedPreferences(ah.doA(), 0).getInt("com.tencent.mm.gallery.cache.suffix", 0);
    localf.bCh();
    localf.wl(-1);
    this.mNG = localf;
    this.fry.a(this.mNH, null);
    AppMethodBeat.o(21243);
  }

  public final Bitmap getBitmap(String paramString)
  {
    AppMethodBeat.i(21244);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.GalleryCache", "null filepath");
      AppMethodBeat.o(21244);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if (this.mNF == null)
      {
        ab.w("MicroMsg.GalleryCache", "want to get bitmap, but gallery cache is null");
        AppMethodBeat.o(21244);
        paramString = null;
      }
      else if (this.mNF.aj(paramString))
      {
        Object localObject = (d.a)this.mNF.ai(paramString);
        if (localObject == null)
        {
          ab.d("MicroMsg.GalleryCache", "weakreference is null! %s", new Object[] { paramString });
          this.mNF.remove(paramString);
          AppMethodBeat.o(21244);
          paramString = null;
        }
        else
        {
          localObject = ((d.a)localObject).bitmap;
          if (localObject != null)
          {
            if (((Bitmap)localObject).isRecycled())
            {
              ab.i("MicroMsg.GalleryCache", "cahce bitmap has recycled: %s", new Object[] { paramString });
              this.mNF.remove(paramString);
              AppMethodBeat.o(21244);
              paramString = null;
            }
            else
            {
              ab.i("MicroMsg.GalleryCache", "get cached bitmap:".concat(String.valueOf(paramString)));
              AppMethodBeat.o(21244);
              paramString = (String)localObject;
            }
          }
          else
          {
            this.mNF.remove(paramString);
            ab.i("MicroMsg.GalleryCache", "get bitmap is null! %s", new Object[] { paramString });
          }
        }
      }
      else
      {
        AppMethodBeat.o(21244);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.d
 * JD-Core Version:    0.6.2
 */