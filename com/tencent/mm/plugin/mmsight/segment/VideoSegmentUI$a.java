package com.tencent.mm.plugin.mmsight.segment;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

final class VideoSegmentUI$a
  implements Runnable
{
  private Context context;
  private ViewGroup lYe;
  private int ozU;
  private int ozV;
  private int ozW;
  private VideoSegmentUI.b ozX;

  private VideoSegmentUI$a(VideoSegmentUI paramVideoSegmentUI, ViewGroup paramViewGroup, int paramInt1, int paramInt2, int paramInt3, VideoSegmentUI.b paramb)
  {
    AppMethodBeat.i(55045);
    this.ozU = paramInt1;
    this.ozV = paramInt2;
    this.ozW = paramInt3;
    this.context = paramViewGroup.getContext();
    this.lYe = paramViewGroup;
    this.ozX = paramb;
    AppMethodBeat.o(55045);
  }

  public final void run()
  {
    AppMethodBeat.i(55046);
    if (this.ozN.isFinishing())
      AppMethodBeat.o(55046);
    while (true)
    {
      return;
      VideoSegmentUI.a.1 local1 = new VideoSegmentUI.a.1(this, this.context);
      int i = this.lYe.getWidth();
      int j = a.al(this.context, 2131428735);
      int k = ((View)VideoSegmentUI.j(this.ozN)).getTop() - j * 2;
      int m = this.ozV;
      int n = this.ozU;
      Object localObject = new Point();
      if (n / m > k / i);
      for (float f = k / n; ; f = i / m)
      {
        ((Point)localObject).x = ((int)(m * f));
        ((Point)localObject).y = ((int)(f * n));
        ab.i("MicroMsg.VideoSegmentUI", "rawWidth %d rawHeight %d  rawDegress %d padding %d validWidth %d validHeight %d scaled %s", new Object[] { Integer.valueOf(this.ozV), Integer.valueOf(this.ozU), Integer.valueOf(this.ozW), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), ((Point)localObject).toString() });
        if ((((Point)localObject).x > 0) && (((Point)localObject).y > 0))
          break label357;
        ab.e("MicroMsg.VideoSegmentUI", "rawWidth %d rawHeight %d padding %d validWidth %d validHeight %d scaled %s", new Object[] { Integer.valueOf(this.ozV), Integer.valueOf(this.ozU), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), ((Point)localObject).toString() });
        if (this.ozX != null)
        {
          localObject = this.ozX;
          ab.e("MicroMsg.VideoSegmentUI", "TextureViewCallback error");
          VideoSegmentUI.m(((VideoSegmentUI.b)localObject).ozN);
          ((VideoSegmentUI.b)localObject).ozN.finish();
          VideoSegmentUI.b(((VideoSegmentUI.b)localObject).ozN);
        }
        AppMethodBeat.o(55046);
        break;
      }
      label357: RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(((Point)localObject).x, ((Point)localObject).y);
      j += (int)((k - ((Point)localObject).y) / 2.0F);
      localLayoutParams.topMargin = j;
      localLayoutParams.bottomMargin = j;
      i = (int)((i - ((Point)localObject).x) / 2.0F);
      localLayoutParams.leftMargin = i;
      localLayoutParams.rightMargin = i;
      local1.setSurfaceTextureListener(this.ozX);
      this.lYe.addView(local1, 0, localLayoutParams);
      AppMethodBeat.o(55046);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.a
 * JD-Core Version:    0.6.2
 */