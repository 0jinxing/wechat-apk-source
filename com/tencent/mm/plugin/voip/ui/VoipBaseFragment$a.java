package com.tencent.mm.plugin.voip.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;

public final class VoipBaseFragment$a
  implements Runnable
{
  public VoipBaseFragment$a(VoipBaseFragment paramVoipBaseFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4845);
    ab.i("MicroMsg.VoipBaseFragment", "try load blur bitmap,timestamp: " + System.currentTimeMillis());
    Bitmap localBitmap1 = b.a(this.sWy.edV, false, -1);
    if ((localBitmap1 == null) || (this.sWy.sWp == null))
      AppMethodBeat.o(4845);
    while (true)
    {
      return;
      int i = 0;
      while (true)
      {
        if (((this.sWy.sWp.getHeight() != 0) && (this.sWy.sWp.getWidth() != 0)) || (i >= 10))
          break label126;
        try
        {
          Thread.sleep(300L);
          i++;
        }
        catch (InterruptedException localInterruptedException)
        {
          ab.e("MicroMsg.VoipBaseFragment", "wait voip initialize interrupted");
          AppMethodBeat.o(4845);
        }
      }
      continue;
      label126: final Bitmap localBitmap2 = localBitmap1;
      if (localBitmap1.getHeight() <= localBitmap1.getWidth())
      {
        localBitmap2 = localBitmap1;
        if (localBitmap1.getHeight() / 5 > 0)
        {
          localBitmap2 = localBitmap1;
          if ((int)(localBitmap1.getHeight() * 0.6D) > 0)
            localBitmap2 = Bitmap.createBitmap(localBitmap1, localBitmap1.getWidth() / 5, localBitmap1.getHeight() / 5, (int)(localBitmap1.getHeight() * 0.6D), (int)(localBitmap1.getHeight() * 0.6D), null, false);
        }
      }
      float f = 1.0F * this.sWy.sWp.getHeight() / this.sWy.sWp.getWidth();
      i = (int)(localBitmap2.getHeight() / f);
      localBitmap2 = d.a(localBitmap2, localBitmap2.getHeight(), i, true, false);
      if (localBitmap2 == null)
      {
        ab.e("MicroMsg.VoipBaseFragment", "extract Thumb Nail for blur background failed");
        AppMethodBeat.o(4845);
      }
      else
      {
        try
        {
          localBitmap2 = d.e(localBitmap2, 20);
          ab.i("MicroMsg.VoipBaseFragment", "blur ok, timestamp: " + System.currentTimeMillis());
          this.sWy.iGP.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(4844);
              if (VoipBaseFragment.a.this.sWy.sWq != null)
              {
                VoipBaseFragment.a.this.sWy.sWq.setBackgroundDrawable(new BitmapDrawable(localBitmap2));
                VoipBaseFragment.a.this.sWy.sWq.getBackground().setAlpha(128);
              }
              VoipBaseFragment.a(VoipBaseFragment.a.this.sWy);
              AppMethodBeat.o(4844);
            }
          });
          AppMethodBeat.o(4845);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.VoipBaseFragment", "fastblur failed: " + localException.getMessage());
          AppMethodBeat.o(4845);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipBaseFragment.a
 * JD-Core Version:    0.6.2
 */