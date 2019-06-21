package com.tencent.rtmp.ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.liteav.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCloudVideoView$a
  implements Runnable
{
  private View b;
  private MotionEvent c;

  private TXCloudVideoView$a(TXCloudVideoView paramTXCloudVideoView)
  {
  }

  public void a(MotionEvent paramMotionEvent)
  {
    this.c = paramMotionEvent;
  }

  public void a(View paramView)
  {
    this.b = paramView;
  }

  public void run()
  {
    AppMethodBeat.i(65568);
    if ((TXCloudVideoView.access$100(this.a) != null) && (TXCloudVideoView.access$400(this.a)))
      TXCloudVideoView.access$100(this.a).a(this.c.getX() / this.b.getWidth(), this.c.getY() / this.b.getHeight());
    if (TXCloudVideoView.access$400(this.a))
      this.a.onTouchFocus((int)this.c.getX(), (int)this.c.getY());
    AppMethodBeat.o(65568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.ui.TXCloudVideoView.a
 * JD-Core Version:    0.6.2
 */