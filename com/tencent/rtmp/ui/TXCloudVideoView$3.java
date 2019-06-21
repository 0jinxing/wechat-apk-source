package com.tencent.rtmp.ui;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import com.tencent.liteav.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCloudVideoView$3
  implements ScaleGestureDetector.OnScaleGestureListener
{
  TXCloudVideoView$3(TXCloudVideoView paramTXCloudVideoView)
  {
  }

  public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    float f1 = 1.1F;
    AppMethodBeat.i(65587);
    int i;
    float f2;
    if (TXCloudVideoView.access$100(this.a) != null)
    {
      i = TXCloudVideoView.access$100(this.a).e();
      if (i > 0)
      {
        f2 = paramScaleGestureDetector.getScaleFactor();
        if (f2 <= 1.0F)
          break label224;
        f2 = 0.2F / i * (i - TXCloudVideoView.access$200(this.a)) + 1.0F;
        if (f2 > 1.1F)
          break label324;
      }
    }
    while (true)
    {
      label76: int j = Math.round(TXCloudVideoView.access$200(this.a) * f1);
      int k = j;
      if (j == TXCloudVideoView.access$200(this.a))
      {
        if (f1 > 1.0F)
          k = j + 1;
      }
      else
      {
        label119: j = k;
        if (k >= i)
          j = i;
        k = j;
        if (j <= 1)
          k = 1;
        if (f1 <= 1.0F)
          break label285;
        if (k >= TXCloudVideoView.access$200(this.a))
          break label315;
        k = TXCloudVideoView.access$200(this.a);
      }
      label285: label315: 
      while (true)
      {
        TXCloudVideoView.access$202(this.a, k);
        if (TXCloudVideoView.access$100(this.a) != null)
          TXCloudVideoView.access$100(this.a).a(TXCloudVideoView.access$200(this.a));
        AppMethodBeat.o(65587);
        return false;
        i = 0;
        break;
        label224: if (f2 >= 1.0F)
          break label318;
        f2 = 1.0F - 0.2F / i * TXCloudVideoView.access$200(this.a);
        f1 = f2;
        if (f2 < 0.9F)
          break label76;
        f1 = 0.9F;
        break label76;
        k = j;
        if (f1 >= 1.0F)
          break label119;
        k = j - 1;
        break label119;
        if ((f1 < 1.0F) && (k > TXCloudVideoView.access$200(this.a)))
          k = TXCloudVideoView.access$200(this.a);
      }
      label318: f1 = f2;
      continue;
      label324: f1 = f2;
    }
  }

  public boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    return true;
  }

  public void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.ui.TXCloudVideoView.3
 * JD-Core Version:    0.6.2
 */