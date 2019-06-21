package com.tencent.mm.plugin.story.model.e;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.f.c;
import com.tencent.mm.media.f.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/mix/StoryFrameRetriever;", "Lcom/tencent/mm/media/mix/FrameRetriever;", "drawingRect", "", "editorItems", "", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "width", "", "height", "videoWidth", "videoHeight", "rotate", "([FLjava/util/List;IIIII)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "bitmap", "Landroid/graphics/Bitmap;", "canvas", "Landroid/graphics/Canvas;", "centerCropScale", "", "drawer", "Lcom/tencent/mm/media/mix/EditorFrameDrawer;", "drawingMatrix", "Landroid/graphics/Matrix;", "getEditorItems", "()Ljava/util/List;", "paint", "Landroid/graphics/Paint;", "calcCenterCropScale", "drawingWidth", "drawingHeight", "destroy", "", "requestNextFrame", "Lcom/tencent/mm/media/mix/FrameInfo;", "start", "plugin-story_release"})
public final class a
  implements d
{
  private final String TAG;
  private final Paint aFY;
  private final Bitmap bitmap;
  private final Canvas bmG;
  private final List<com.tencent.mm.media.editor.a.b> eWG;
  private final com.tencent.mm.media.f.b lim;
  private final Matrix rWr;
  private float rWs;
  private final int rotate;

  public a(float[] paramArrayOfFloat, List<com.tencent.mm.media.editor.a.b> paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(109330);
    this.eWG = paramList;
    this.rotate = paramInt5;
    this.TAG = "MicroMsg.StoryFrameRetriever";
    this.aFY = new Paint();
    paramList = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    j.o(paramList, "Bitmap.createBitmap(widt… Bitmap.Config.ARGB_8888)");
    this.bitmap = paramList;
    this.bmG = new Canvas(this.bitmap);
    this.lim = new com.tencent.mm.media.f.b(this.eWG);
    this.rWr = new Matrix();
    ab.i(this.TAG, "create StoryFrameRetriever, drawRect:" + Arrays.toString(paramArrayOfFloat) + ", width:" + paramInt1 + ", height:" + paramInt2 + ", videoWidth:" + paramInt3 + ", videoHeight:" + paramInt4);
    this.aFY.setAntiAlias(true);
    this.aFY.setFilterBitmap(true);
    this.rWr.postTranslate(-paramArrayOfFloat[2] / 2.0F, -paramArrayOfFloat[3] / 2.0F);
    this.rWr.postRotate(-this.rotate);
    float f1;
    float f2;
    float f3;
    switch (this.rotate)
    {
    default:
      f1 = Math.max(paramInt1 / paramArrayOfFloat[2], paramInt2 / paramArrayOfFloat[3]);
      ab.i(this.TAG, "scale:".concat(String.valueOf(f1)));
      this.rWr.postScale(f1, f1);
      if ((paramInt3 > 0) && (paramInt4 > 0))
      {
        f2 = paramArrayOfFloat[2];
        f3 = paramArrayOfFloat[3];
        paramInt5 = Math.min(paramInt3, paramInt4);
        paramInt3 = Math.max(paramInt3, paramInt4);
        if (((paramInt5 >= f2) || (paramInt3 >= f3)) && ((paramInt5 <= f2) || (paramInt3 <= f3)))
          break label681;
        f1 = paramInt5 / paramInt3;
        paramInt4 = (int)f2;
        paramInt3 = (int)(paramInt4 / f1);
      }
      break;
    case 90:
    case 270:
    }
    while (true)
    {
      float f4 = paramInt4 / paramInt3;
      float f5;
      if (f2 > f3)
      {
        f1 = f2 / f4;
        if (f1 >= f3)
          break label674;
        f5 = f3 * f4;
        f1 = f3;
      }
      while (true)
      {
        f4 = paramInt4 / f5;
        float f6 = paramInt3 / f1;
        float f7 = Math.min(f4, f6);
        ab.i(this.TAG, "calcCenterCropScale, drawingSize:[" + f2 + ',' + f3 + "], bitmapSize:[" + paramInt4 + ',' + paramInt3 + "], scaleSize:[" + f5 + ',' + f1 + "], centerCropScale:" + f7 + ", scaleX:" + f4 + ", scaleY:" + f6);
        this.rWs = f7;
        this.rWr.postScale(this.rWs, this.rWs);
        this.rWr.postTranslate(paramInt1 / 2.0F, paramInt2 / 2.0F);
        AppMethodBeat.o(109330);
        return;
        f1 = Math.max(paramInt2 / paramArrayOfFloat[2], paramInt1 / paramArrayOfFloat[3]);
        break;
        f5 = f3 * f4;
        if (f5 < f2)
        {
          f1 = f2 / f4;
          f5 = f2;
        }
        else
        {
          f1 = f3;
          continue;
          label674: f5 = f2;
        }
      }
      label681: paramInt4 = paramInt5;
    }
  }

  public final c UX()
  {
    AppMethodBeat.i(109327);
    c localc;
    if (this.eWG.size() == 0)
    {
      localc = null;
      AppMethodBeat.o(109327);
    }
    while (true)
    {
      return localc;
      int i = this.bmG.save();
      this.bmG.drawColor(0, PorterDuff.Mode.MULTIPLY);
      this.bmG.concat(this.rWr);
      try
      {
        l = this.lim.a(this.bmG, this.aFY);
        this.bmG.restoreToCount(i);
        localc = new c(this.bitmap, l);
        AppMethodBeat.o(109327);
      }
      catch (Exception localException)
      {
        while (true)
          long l = 9223372036854775807L;
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(109329);
    try
    {
      Iterator localIterator = ((Iterable)this.eWG).iterator();
      while (localIterator.hasNext())
        ((com.tencent.mm.media.editor.a.b)localIterator.next()).destroy();
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace(this.TAG, (Throwable)localException, "destroy error", new Object[0]);
      AppMethodBeat.o(109329);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109329);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(109328);
    try
    {
      Iterator localIterator = ((Iterable)this.eWG).iterator();
      while (localIterator.hasNext())
        ((com.tencent.mm.media.editor.a.b)localIterator.next()).init();
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace(this.TAG, (Throwable)localException, "start error", new Object[0]);
      AppMethodBeat.o(109328);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109328);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.e.a
 * JD-Core Version:    0.6.2
 */