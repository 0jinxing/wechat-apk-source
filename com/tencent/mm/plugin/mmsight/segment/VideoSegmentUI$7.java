package com.tencent.mm.plugin.mmsight.segment;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class VideoSegmentUI$7
  implements Runnable
{
  VideoSegmentUI$7(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final void run()
  {
    final boolean bool = true;
    AppMethodBeat.i(55038);
    Object localObject1 = null;
    try
    {
      VideoSegmentUI.d(this.ozN).stop();
      int i = VideoSegmentUI.e(this.ozN);
      long l1 = bo.yz();
      VideoSegmentUI.i(this.ozN).b(VideoSegmentUI.f(this.ozN), VideoSegmentUI.g(this.ozN), VideoSegmentUI.h(this.ozN));
      localObject2 = VideoSegmentUI.i(this.ozN);
      long l2 = ()(VideoSegmentUI.j(this.ozN).bQa() * i);
      float f = VideoSegmentUI.j(this.ozN).bQb();
      i = ((f)localObject2).O(l2, ()(i * f));
      if (i < 0)
      {
        ab.i("MicroMsg.VideoSegmentUI", "clip failed! %s", new Object[] { Integer.valueOf(i) });
        localObject2 = new com/tencent/mm/plugin/mmsight/segment/VideoSegmentUI$7$1;
        ((1)localObject2).<init>(this);
        al.d((Runnable)localObject2);
        AppMethodBeat.o(55038);
        return;
      }
      Bitmap localBitmap = com.tencent.mm.plugin.mmsight.d.tv(VideoSegmentUI.g(this.ozN));
      if (localBitmap != null)
      {
        PInt localPInt1 = new com/tencent/mm/pointers/PInt;
        localPInt1.<init>();
        PInt localPInt2 = new com/tencent/mm/pointers/PInt;
        localPInt2.<init>();
        localObject2 = localBitmap;
        if (com.tencent.mm.plugin.mmsight.d.a(localBitmap.getWidth(), localBitmap.getHeight(), VideoSegmentUI.h(this.ozN).fAf, localPInt1, localPInt2))
          localObject2 = Bitmap.createScaledBitmap(localBitmap, localPInt1.value, localPInt2.value, true);
        ab.i("MicroMsg.VideoSegmentUI", "getBitmap size = [%d, %d]", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
        com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject2, 80, Bitmap.CompressFormat.JPEG, VideoSegmentUI.l(this.ozN), true);
        ab.i("MicroMsg.VideoSegmentUI", "create video thumb. use %dms", new Object[] { Long.valueOf(bo.az(l1)) });
      }
      for (localObject2 = localObject1; ; localObject2 = localObject1)
      {
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(55037);
            if (VideoSegmentUI.k(VideoSegmentUI.7.this.ozN) != null)
              VideoSegmentUI.k(VideoSegmentUI.7.this.ozN).dismiss();
            if (VideoSegmentUI.j(VideoSegmentUI.7.this.ozN) != null)
              VideoSegmentUI.j(VideoSegmentUI.7.this.ozN).iX(false);
            VideoSegmentUI.a(VideoSegmentUI.7.this.ozN, bool, this.ozR);
            AppMethodBeat.o(55037);
          }
        });
        AppMethodBeat.o(55038);
        break;
        ab.e("MicroMsg.VideoSegmentUI", "getVideoThumb failed!");
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2 = localException.getMessage();
        ab.printErrStackTrace("MicroMsg.VideoSegmentUI", localException, "UnexpectedException when clip : [%s]", new Object[] { localException.getMessage() });
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.7
 * JD-Core Version:    0.6.2
 */