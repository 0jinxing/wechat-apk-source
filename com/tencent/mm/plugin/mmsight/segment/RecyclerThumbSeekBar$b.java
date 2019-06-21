package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.o;
import com.tencent.mm.memory.o.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

final class RecyclerThumbSeekBar$b
  implements Runnable
{
  private WeakReference<ImageView> aIp;
  boolean fIa;
  private ak handler;
  private int oyB;
  private Bitmap oyC;

  RecyclerThumbSeekBar$b(RecyclerThumbSeekBar paramRecyclerThumbSeekBar, int paramInt, ImageView paramImageView, Bitmap paramBitmap, ak paramak)
  {
    AppMethodBeat.i(54986);
    this.fIa = false;
    this.oyB = paramInt;
    this.aIp = new WeakReference(paramImageView);
    this.handler = paramak;
    this.oyC = paramBitmap;
    AppMethodBeat.o(54986);
  }

  public final void run()
  {
    AppMethodBeat.i(54987);
    if (this.fIa)
    {
      o.fdT.f(this.oyC);
      AppMethodBeat.o(54987);
    }
    while (true)
    {
      return;
      if ((ImageView)this.aIp.get() == null)
      {
        o.fdT.f(this.oyC);
        AppMethodBeat.o(54987);
      }
      else
      {
        try
        {
          d locald = RecyclerThumbSeekBar.g(this.oyy).bQd();
          if (this.oyC == null)
          {
            o localo = o.fdT;
            o.b localb = new com/tencent/mm/memory/o$b;
            localb.<init>(locald.getScaledWidth(), locald.getScaledHeight());
            this.oyC = localo.a(localb);
          }
          locald.reuseBitmap(this.oyC);
          if (!this.fIa)
            this.oyC = locald.getFrameAtTime(this.oyB);
          RecyclerThumbSeekBar.g(this.oyy).a(locald);
          if ((this.oyC == null) || (this.fIa) || (this.aIp.get() == null))
            break label262;
          this.handler.post(new RecyclerThumbSeekBar.a(this.oyy, this.oyC, (ImageView)this.aIp.get(), this));
          AppMethodBeat.o(54987);
        }
        catch (Exception localException)
        {
          ab.e("RecyclerThumbSeekBar", "get bitmap error " + localException.getMessage());
          o.fdT.f(this.oyC);
          AppMethodBeat.o(54987);
        }
        continue;
        label262: o.fdT.f(this.oyC);
        AppMethodBeat.o(54987);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar.b
 * JD-Core Version:    0.6.2
 */