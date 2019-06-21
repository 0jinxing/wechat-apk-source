package com.tencent.mm.plugin.mmsight.segment;

import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

final class VideoSegmentUI$a$1 extends MMTextureView
{
  VideoSegmentUI$a$1(VideoSegmentUI.a parama, Context paramContext)
  {
    super(paramContext);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55044);
    ab.d("MicroMsg.VideoSegmentUI", "onMeasure video size[%d, %d, %d] spec[%d, %d]", new Object[] { Integer.valueOf(VideoSegmentUI.a.a(this.ozY)), Integer.valueOf(VideoSegmentUI.a.b(this.ozY)), Integer.valueOf(VideoSegmentUI.a.c(this.ozY)), Integer.valueOf(View.getDefaultSize(1, paramInt1)), Integer.valueOf(View.getDefaultSize(1, paramInt2)) });
    if ((VideoSegmentUI.a.c(this.ozY) == 90) || (VideoSegmentUI.a.c(this.ozY) == 270))
    {
      Matrix localMatrix = new Matrix();
      localMatrix.set(getMatrix());
      int i = View.getDefaultSize(1, paramInt1);
      int j = View.getDefaultSize(1, paramInt2);
      float f1 = i / 2.0F;
      float f2 = j / 2.0F;
      float f3 = j / i;
      localMatrix.postRotate(VideoSegmentUI.a.c(this.ozY), f1, f2);
      localMatrix.postScale(1.0F / f3, f3, f1, f2);
      setTransform(localMatrix);
      ab.i("MicroMsg.VideoSegmentUI", "rotate transform mDegrees[%d] screenSize[%d, %d]", new Object[] { Integer.valueOf(VideoSegmentUI.a.c(this.ozY)), Integer.valueOf(i), Integer.valueOf(j) });
    }
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(55044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.a.1
 * JD-Core Version:    0.6.2
 */