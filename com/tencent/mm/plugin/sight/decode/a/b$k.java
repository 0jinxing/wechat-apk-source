package com.tencent.mm.plugin.sight.decode.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
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
    AppMethodBeat.i(70250);
    this.qyh = new WeakReference(null);
    AppMethodBeat.o(70250);
  }

  public final void run()
  {
    View localView = null;
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(70251);
    try
    {
      if ((b.n(this.qxW) == null) || (!b.n(this.qxW).isValid()))
      {
        i = this.qxW.hashCode();
        j = hashCode();
        label75: boolean bool5;
        label88: boolean bool6;
        if (b.n(this.qxW) == null)
        {
          bool3 = true;
          if (b.o(this.qxW) != null)
            break label278;
          bool4 = true;
          if (this.qyh.get() != null)
            break label284;
          bool5 = true;
          if (b.p(this.qxW) != null)
            break label290;
          bool6 = true;
          label101: ab.w("MicroMsg.SightPlayController", "#0x%x-#0x%x want draw thumb, but surface status error, surface null ? %B, thumb bgView null ? %B, thumb null ? %B, mask null ? %B", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool6) });
          if (b.p(this.qxW) != null)
            break label358;
          localObject2 = (Bitmap)this.qyh.get();
          if (b.o(this.qxW) != null)
            localView = (View)b.o(this.qxW).get();
          if ((localView != null) && (localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
            break label308;
          if (localView != null)
            break label296;
          bool3 = true;
          label231: if (localObject2 != null)
            break label302;
          bool4 = bool2;
          label239: ab.e("MicroMsg.SightPlayController", "bgView:%B, thumb:%B", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
          AppMethodBeat.o(70251);
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
          label308: localObject3 = new com/tencent/mm/plugin/sight/decode/a/b$k$1;
          ((1)localObject3).<init>(this, localView, (Bitmap)localObject2);
          localView.post((Runnable)localObject3);
          AppMethodBeat.o(70251);
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
        AppMethodBeat.o(70251);
        continue;
        label358: if ((b.q(this.qxW) != null) && (b.q(this.qxW).getWidth() == b.p(this.qxW).getWidth()))
        {
          j = b.q(this.qxW).getHeight();
          i = b.p(this.qxW).getHeight();
          if (j == i)
            break label456;
        }
        label456: label591: Object localObject1;
        try
        {
          b.a(this.qxW, Bitmap.createBitmap(b.p(this.qxW).getWidth(), b.p(this.qxW).getHeight(), Bitmap.Config.ARGB_8888));
          if ((b.q(this.qxW) == null) || (this.qyh.get() == null) || (((Bitmap)this.qyh.get()).isRecycled()))
            if (b.q(this.qxW) == null)
            {
              bool3 = true;
              if (this.qyh.get() != null)
                break label591;
              bool4 = bool1;
              ab.e("MicroMsg.SightPlayController", "mThubmBgBmp:%B, thumbRef:%B", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
              AppMethodBeat.o(70251);
            }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.SightPlayController", localException2, "try to create thumb bmp error:%s", new Object[] { localException2.getMessage() });
            b.a(this.qxW, null);
            continue;
            bool3 = false;
            continue;
            bool4 = false;
          }
          long l = System.nanoTime();
          SightVideoJNI.handleThumb((Bitmap)this.qyh.get(), b.q(this.qxW), b.p(this.qxW));
          ab.i("MicroMsg.SightPlayController", "handle thumb use %d us", new Object[] { Long.valueOf((System.nanoTime() - l) / 1000L) });
          localObject2 = b.q(this.qxW);
          if (b.o(this.qxW) != null);
          for (localObject1 = (View)b.o(this.qxW).get(); ; localObject1 = null)
          {
            if ((localObject1 != null) && (localObject2 != null))
              break label712;
            AppMethodBeat.o(70251);
            break;
          }
          label712: localObject3 = new com/tencent/mm/plugin/sight/decode/a/b$k$2;
          ((2)localObject3).<init>(this, (View)localObject1, (Bitmap)localObject2);
          ((View)localObject1).post((Runnable)localObject3);
          AppMethodBeat.o(70251);
        }
        continue;
        int i = this.qxW.hashCode();
        int j = hashCode();
        if (this.qyh.get() == null);
        for (boolean bool3 = true; ; bool3 = false)
        {
          ab.d("MicroMsg.SightPlayController", "#0x%x-#0x%x draw thumb, thumb empty ? %B", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool3) });
          if (b.o(this.qxW) != null)
          {
            localObject2 = (View)b.o(this.qxW).get();
            if (localObject2 != null)
            {
              localObject1 = new com/tencent/mm/plugin/sight/decode/a/b$k$3;
              ((b.k.3)localObject1).<init>(this, (View)localObject2);
              ((View)localObject2).post((Runnable)localObject1);
            }
          }
          if (this.qyh.get() != null)
            break label888;
          SightVideoJNI.drawSurfaceColor(b.n(this.qxW), 0);
          AppMethodBeat.o(70251);
          break;
        }
        label888: SightVideoJNI.drawSurfaceThumb(b.n(this.qxW), (Bitmap)this.qyh.get(), b.p(this.qxW));
        AppMethodBeat.o(70251);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.k
 * JD-Core Version:    0.6.2
 */