package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.view.Surface;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class b$k
  implements Runnable
{
  WeakReference<Bitmap> qyh;

  private b$k(b paramb)
  {
    AppMethodBeat.i(37433);
    this.qyh = new WeakReference(null);
    AppMethodBeat.o(37433);
  }

  public final void run()
  {
    View localView = null;
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(37434);
    try
    {
      if ((b.m(this.rct) == null) || (!b.m(this.rct).isValid()))
      {
        i = this.rct.hashCode();
        j = hashCode();
        label75: boolean bool5;
        label88: boolean bool6;
        if (b.m(this.rct) == null)
        {
          bool3 = true;
          if (b.n(this.rct) != null)
            break label278;
          bool4 = true;
          if (this.qyh.get() != null)
            break label284;
          bool5 = true;
          if (b.o(this.rct) != null)
            break label290;
          bool6 = true;
          label101: ab.w("MicroMsg.SightPlayController", "#0x%x-#0x%x want draw thumb, but surface status error, surface null ? %B, thumb bgView null ? %B, thumb null ? %B, mask null ? %B", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool6) });
          if (b.o(this.rct) != null)
            break label358;
          localObject2 = (Bitmap)this.qyh.get();
          if (b.n(this.rct) != null)
            localView = (View)b.n(this.rct).get();
          if ((localView != null) && (localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
            break label308;
          if (localView != null)
            break label296;
          bool3 = true;
          label231: if (localObject2 != null)
            break label302;
          bool4 = bool2;
          label239: ab.e("MicroMsg.SightPlayController", "bgView:%B, thumb:%B", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
          AppMethodBeat.o(37434);
        }
        while (true)
        {
          return;
          bool3 = false;
          break;
          label278: bool4 = false;
          break label75;
          label284: bool5 = false;
          break label88;
          label290: bool6 = false;
          break label101;
          label296: bool3 = false;
          break label231;
          label302: bool4 = false;
          break label239;
          label308: localObject3 = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/b$k$1;
          ((b.k.1)localObject3).<init>(this, localView, (Bitmap)localObject2);
          localView.post((Runnable)localObject3);
          AppMethodBeat.o(37434);
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        boolean bool4;
        Object localObject2;
        Object localObject3;
        ab.printErrStackTrace("MicroMsg.SightPlayController", localException1, "", new Object[0]);
        AppMethodBeat.o(37434);
        continue;
        label358: if ((b.p(this.rct) != null) && (b.p(this.rct).getWidth() == b.o(this.rct).getWidth()))
        {
          j = b.p(this.rct).getHeight();
          i = b.o(this.rct).getHeight();
          if (j == i)
            break label456;
        }
        label456: label591: Object localObject1;
        try
        {
          b.a(this.rct, Bitmap.createBitmap(b.o(this.rct).getWidth(), b.o(this.rct).getHeight(), Bitmap.Config.ARGB_8888));
          if ((b.p(this.rct) == null) || (this.qyh.get() == null) || (((Bitmap)this.qyh.get()).isRecycled()))
            if (b.p(this.rct) == null)
            {
              bool3 = true;
              if (this.qyh.get() != null)
                break label591;
              bool4 = bool1;
              ab.e("MicroMsg.SightPlayController", "mThubmBgBmp:%B, thumbRef:%B", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
              AppMethodBeat.o(37434);
            }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.SightPlayController", localException2, "try to create thumb bmp error:%s", new Object[] { localException2.getMessage() });
            b.a(this.rct, null);
            continue;
            bool3 = false;
            continue;
            bool4 = false;
          }
          long l = System.nanoTime();
          SightVideoJNI.handleThumb((Bitmap)this.qyh.get(), b.p(this.rct), b.o(this.rct));
          ab.i("MicroMsg.SightPlayController", "handle thumb use %d us", new Object[] { Long.valueOf((System.nanoTime() - l) / 1000L) });
          localObject2 = b.p(this.rct);
          if (b.n(this.rct) != null);
          for (localObject1 = (View)b.n(this.rct).get(); ; localObject1 = null)
          {
            if ((localObject1 != null) && (localObject2 != null))
              break label712;
            AppMethodBeat.o(37434);
            break;
          }
          label712: localObject3 = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/b$k$2;
          ((b.k.2)localObject3).<init>(this, (View)localObject1, (Bitmap)localObject2);
          ((View)localObject1).post((Runnable)localObject3);
          AppMethodBeat.o(37434);
        }
        continue;
        int j = this.rct.hashCode();
        int i = hashCode();
        if (this.qyh.get() == null);
        for (boolean bool3 = true; ; bool3 = false)
        {
          ab.d("MicroMsg.SightPlayController", "#0x%x-#0x%x draw thumb, thumb empty ? %B", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool3) });
          if (b.n(this.rct) != null)
          {
            localObject2 = (View)b.n(this.rct).get();
            if (localObject2 != null)
            {
              localObject1 = new com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/b$k$3;
              ((b.k.3)localObject1).<init>(this, (View)localObject2);
              ((View)localObject2).post((Runnable)localObject1);
            }
          }
          if (this.qyh.get() != null)
            break label888;
          SightVideoJNI.drawSurfaceColor(b.m(this.rct), 0);
          AppMethodBeat.o(37434);
          break;
        }
        label888: SightVideoJNI.drawSurfaceThumb(b.m(this.rct), (Bitmap)this.qyh.get(), b.o(this.rct));
        AppMethodBeat.o(37434);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.k
 * JD-Core Version:    0.6.2
 */