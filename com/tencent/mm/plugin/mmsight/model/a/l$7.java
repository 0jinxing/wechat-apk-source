package com.tencent.mm.plugin.mmsight.model.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

final class l$7
  implements Runnable
{
  l$7(l paraml, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76600);
    l locall = this.owx;
    Object localObject1 = this.hWX;
    if (localObject1 != null);
    try
    {
      if (localObject1.length == 0)
      {
        ab.e("MicroMsg.MMSightFFMpegRecorder", "saveVideoThumbImpl, data is null");
        locall.fcT = false;
        AppMethodBeat.o(76600);
      }
      while (true)
      {
        return;
        if (!bo.isNullOrNil(locall.thumbPath))
          break;
        ab.e("MicroMsg.MMSightFFMpegRecorder", "saveVideoThumbImpl, thumbpath is null");
        locall.fcT = false;
        AppMethodBeat.o(76600);
      }
      int i;
      label94: int j;
      label117: int k;
      label248: float f;
      if ((locall.fcR == 0) || (locall.fcR == 180))
      {
        i = locall.fcO;
        if ((locall.fcR != 0) && (locall.fcR != 180))
          break label434;
        j = locall.fcP;
        localObject2 = new android/graphics/YuvImage;
        ((YuvImage)localObject2).<init>((byte[])localObject1, 17, i, j, null);
        Rect localRect = new android/graphics/Rect;
        localRect.<init>(0, 0, i, j);
        localObject1 = new java/io/ByteArrayOutputStream;
        ((ByteArrayOutputStream)localObject1).<init>();
        ((YuvImage)localObject2).compressToJpeg(localRect, 100, (OutputStream)localObject1);
        localObject2 = ((ByteArrayOutputStream)localObject1).toByteArray();
        localObject1 = MMBitmapFactory.decodeByteArray((byte[])localObject2, 0, localObject2.length);
        localObject2 = localObject1;
        if (locall.fcY != null)
        {
          localObject2 = localObject1;
          if (Math.min(((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight()) > locall.fcY.fAf)
          {
            k = ((Bitmap)localObject1).getWidth();
            j = ((Bitmap)localObject1).getHeight();
            if (locall.fcY.fAf <= 0)
              break label443;
            i = locall.fcY.fAf;
            if (k >= j)
              break label454;
            f = k * 1.0F / i;
            j = (int)(j / f);
            label274: localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject1, i, j, true);
          }
        }
        if ((locall.fdb) && (locall.fdc != 180))
          break label482;
        j = locall.fcR;
        i = j;
        if (locall.fdc == 180)
        {
          j += 180;
          i = j;
          if (j > 360)
            i = j - 360;
        }
      }
      for (Object localObject2 = d.b((Bitmap)localObject2, i); ; localObject2 = localObject1)
      {
        d.a((Bitmap)localObject2, 60, Bitmap.CompressFormat.JPEG, locall.thumbPath, true);
        ab.i("MicroMsg.MMSightFFMpegRecorder", "saveVideoThumb to: %s, cameraOrientation: %s, width: %s, height: %s", new Object[] { locall.thumbPath, Integer.valueOf(locall.fcR), Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
        AppMethodBeat.o(76600);
        break;
        i = locall.fcP;
        break label94;
        label434: j = locall.fcO;
        break label117;
        label443: i = locall.fcY.width;
        break label248;
        label454: f = j * 1.0F / i;
        k = (int)(k / f);
        j = i;
        i = k;
        break label274;
        label482: if (Math.abs(locall.fcR - locall.fdc) != 0)
          break label569;
        localObject1 = d.b((Bitmap)localObject2, 180.0F);
        ab.i("MicroMsg.MMSightFFMpegRecorder", "bitmap recycle %s", new Object[] { localObject2.toString() });
        ((Bitmap)localObject2).recycle();
      }
    }
    catch (Exception localException)
    {
      label569: 
      while (true)
      {
        ab.e("MicroMsg.MMSightFFMpegRecorder", "saveVideoThumb error: %s", new Object[] { localException.getMessage() });
        locall.fcT = false;
        AppMethodBeat.o(76600);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.l.7
 * JD-Core Version:    0.6.2
 */