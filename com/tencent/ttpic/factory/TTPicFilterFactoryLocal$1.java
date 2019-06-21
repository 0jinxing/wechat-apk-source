package com.tencent.ttpic.factory;

import android.graphics.Bitmap;
import com.tencent.a.a;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.util.e;
import com.tencent.view.g;
import java.io.File;

final class TTPicFilterFactoryLocal$1
  implements Runnable
{
  TTPicFilterFactoryLocal$1(int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81924);
    try
    {
      Object localObject1 = TTPicFilterFactoryLocal.preloadBaseLUTImage();
      if (localObject1 == null)
        AppMethodBeat.o(81924);
      while (true)
      {
        return;
        int i = g.at((Bitmap)localObject1);
        h localh = new com/tencent/filter/h;
        localh.<init>();
        BaseFilter localBaseFilter = a.createFilter(this.val$filterId);
        localBaseFilter.ApplyGLSLFilter(true, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
        localBaseFilter.RenderProcess(i, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), -1, 0.0D, localh);
        for (Object localObject2 = localh; (((h)localObject2).bJA != null) && (localObject2.bJA.texture[0] != 0); localObject2 = ((h)localObject2).bJA);
        localObject1 = g.aK(localObject2.texture[0], ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        BitmapUtils.saveBitmap2PNG((Bitmap)localObject1, TTPicFilterFactoryLocal.LUT_DIR_ROOT + File.separator + this.val$filterName + ".png");
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = TTPicFilterFactoryLocal.LUT_DIR_ROOT + File.separator + this.val$filterName + ".png";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        e.iF((String)localObject2, TTPicFilterFactoryLocal.LUT_DIR_ROOT + File.separator + this.val$filterName + ".png2");
        localObject2 = new java/io/File;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((File)localObject2).<init>(TTPicFilterFactoryLocal.LUT_DIR_ROOT + File.separator + this.val$filterName + ".png");
        ((File)localObject2).delete();
        g.Sk(i);
        localh.clear();
        localBaseFilter.ClearGLSL();
        AppMethodBeat.o(81924);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
        AppMethodBeat.o(81924);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.factory.TTPicFilterFactoryLocal.1
 * JD-Core Version:    0.6.2
 */