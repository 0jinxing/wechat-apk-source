package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.lucky.a.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.e;
import java.util.Map;

final class ContentFragment$3
  implements Runnable
{
  ContentFragment$3(ContentFragment paramContentFragment, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void run()
  {
    float f = 1.0F;
    Runnable local1 = null;
    AppMethodBeat.i(37618);
    ab.i("ContentFragment", "download bg ok path %s ", new Object[] { this.bSt });
    try
    {
      Object localObject1;
      Object localObject3;
      int i;
      int j;
      int k;
      int m;
      if (ContentFragment.d(this.rdr).rei)
      {
        ContentFragment.e(this.rdr);
        localObject1 = this.rds;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = h.gj((String)localObject1, this.hWi + "_blurimg");
        if (!e.ct((String)localObject3))
        {
          Bitmap localBitmap2 = d.decodeFile(this.bSt, null);
          localObject1 = local1;
          if (localBitmap2 != null)
          {
            if ((localBitmap2.getHeight() < ContentFragment.f(this.rdr)) || (localBitmap2.getWidth() < ContentFragment.g(this.rdr)))
              f = Math.max(ContentFragment.g(this.rdr) * 1.0F / localBitmap2.getWidth(), 1.0F * ContentFragment.f(this.rdr) / localBitmap2.getHeight());
            localObject1 = d.a(localBitmap2, f, f);
            i = ((Bitmap)localObject1).getWidth();
            j = ContentFragment.g(this.rdr);
            k = ((Bitmap)localObject1).getHeight();
            m = ContentFragment.f(this.rdr);
          }
        }
      }
      while (true)
      {
        try
        {
          localObject1 = Bitmap.createBitmap((Bitmap)localObject1, i - j >>> 1, k - m >>> 1, ContentFragment.g(this.rdr), ContentFragment.f(this.rdr));
          if (localObject1 == null)
            break;
          localObject1 = a.a((Bitmap)localObject1, (String)localObject3, Color.argb(140, 0, 0, 0), 180);
          if (localObject1 == null)
          {
            localObject1 = local1;
            local1 = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$3$1;
            local1.<init>(this, (Bitmap)localObject1);
            al.d(local1);
            AppMethodBeat.o(37618);
            return;
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          ab.printErrStackTrace("ContentFragment", localOutOfMemoryError, "", new Object[0]);
          localBitmap1 = null;
          continue;
          localBitmap1 = localBitmap1.Xi();
          continue;
        }
        Bitmap localBitmap1 = BitmapFactory.decodeFile((String)localObject3);
        continue;
        localBitmap1 = d.decodeFile(this.bSt, null);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("ContentFragment", "the backgroundCoverUrl is set error ,because " + localException.toString());
        AppMethodBeat.o(37618);
        continue;
        Object localObject2 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.3
 * JD-Core Version:    0.6.2
 */