package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

public final class MMGestureGallery$l extends ak
{
  private boolean cOV;
  private long mSL;
  WeakReference<MMGestureGallery> yyI;

  public MMGestureGallery$l(WeakReference<MMGestureGallery> paramWeakReference)
  {
    this.yyI = paramWeakReference;
  }

  public final void D(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(107681);
    this.cOV = paramBoolean;
    j(0, paramLong, 0L);
    AppMethodBeat.o(107681);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(107679);
    super.handleMessage(paramMessage);
    removeMessages(paramMessage.what);
    MMGestureGallery localMMGestureGallery;
    if (this.yyI != null)
    {
      localMMGestureGallery = (MMGestureGallery)this.yyI.get();
      if (localMMGestureGallery != null)
        if (paramMessage.what == 0)
        {
          if ((MMGestureGallery.o(localMMGestureGallery) == 1) || (this.cOV))
          {
            ab.d("MicroMsg.MMGestureGallery", "single click over!");
            if (MMGestureGallery.h(localMMGestureGallery) != null)
              MMGestureGallery.c(localMMGestureGallery).post(new MMGestureGallery.l.1(this, localMMGestureGallery));
          }
          MMGestureGallery.a(localMMGestureGallery, 0);
          AppMethodBeat.o(107679);
        }
    }
    while (true)
    {
      return;
      if (paramMessage.what == 1)
      {
        if ((MMGestureGallery.R(localMMGestureGallery) != null) && (!MMGestureGallery.R(localMMGestureGallery).bCR()))
        {
          MMGestureGallery.R(localMMGestureGallery).play();
          sendEmptyMessageDelayed(paramMessage.what, this.mSL);
          AppMethodBeat.o(107679);
        }
        else
        {
          MMGestureGallery.S(localMMGestureGallery);
          AppMethodBeat.o(107679);
        }
      }
      else
      {
        removeMessages(2);
        if (MMGestureGallery.T(localMMGestureGallery) != null)
          MMGestureGallery.c(localMMGestureGallery).post(new MMGestureGallery.l.2(this, localMMGestureGallery));
        AppMethodBeat.o(107679);
      }
    }
  }

  public final void j(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(107680);
    this.mSL = paramLong2;
    sendEmptyMessageDelayed(paramInt, paramLong1);
    AppMethodBeat.o(107680);
  }

  public final void release()
  {
    AppMethodBeat.i(107682);
    removeMessages(0);
    removeMessages(1);
    removeMessages(2);
    AppMethodBeat.o(107682);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.l
 * JD-Core Version:    0.6.2
 */