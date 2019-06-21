package com.tencent.mm.plugin.gallery.view;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

public final class MultiGestureImageView$j extends ak
{
  WeakReference<MultiGestureImageView> aIp;
  boolean cOV;
  private long mSL;

  public MultiGestureImageView$j(WeakReference<MultiGestureImageView> paramWeakReference)
  {
    Object localObject;
    this.aIp = localObject;
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(21638);
    super.handleMessage(paramMessage);
    removeMessages(paramMessage.what);
    MultiGestureImageView localMultiGestureImageView;
    if (this.aIp != null)
    {
      localMultiGestureImageView = (MultiGestureImageView)this.aIp.get();
      if (localMultiGestureImageView != null)
        if (paramMessage.what == 0)
        {
          if ((MultiGestureImageView.a(localMultiGestureImageView) == 1) || (this.cOV))
          {
            ab.d("MicroMsg.MuitlGestureImageView", "single click over!");
            if (MultiGestureImageView.b(localMultiGestureImageView) != null)
              localMultiGestureImageView.getHandler().post(new MultiGestureImageView.j.1(this, localMultiGestureImageView));
          }
          MultiGestureImageView.c(this.mSE);
          AppMethodBeat.o(21638);
        }
    }
    while (true)
    {
      return;
      if (paramMessage.what == 1)
      {
        if ((MultiGestureImageView.d(this.mSE) != null) && (!MultiGestureImageView.d(this.mSE).bCR()))
        {
          MultiGestureImageView.d(this.mSE).play();
          sendEmptyMessageDelayed(paramMessage.what, this.mSL);
          AppMethodBeat.o(21638);
        }
        else
        {
          MultiGestureImageView.e(localMultiGestureImageView);
          AppMethodBeat.o(21638);
        }
      }
      else
      {
        removeMessages(2);
        if (MultiGestureImageView.f(localMultiGestureImageView) != null)
          localMultiGestureImageView.getHandler().post(new MultiGestureImageView.j.2(this, localMultiGestureImageView));
        AppMethodBeat.o(21638);
      }
    }
  }

  public final void j(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(21639);
    this.mSL = paramLong2;
    sendEmptyMessageDelayed(paramInt, paramLong1);
    AppMethodBeat.o(21639);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.j
 * JD-Core Version:    0.6.2
 */