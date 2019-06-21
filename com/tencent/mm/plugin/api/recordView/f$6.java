package com.tencent.mm.plugin.api.recordView;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.g;
import com.tencent.mm.plugin.mmsight.model.e;
import com.tencent.mm.plugin.mmsight.model.e.b;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.ByteArrayOutputStream;

final class f$6
  implements e.b
{
  f$6(f paramf, boolean paramBoolean, MMSightRecordView.g paramg)
  {
  }

  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(138315);
    if (this.gMo)
      this.gMl.gLL.bPs();
    if ((paramArrayOfByte == null) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
    {
      ab.e("MicroMsg.MMSightRecordViewImpl", "onPictureYuvTaken, data is null!!");
      this.gMn.aDq();
      AppMethodBeat.o(138315);
      return;
    }
    label473: 
    while (true)
    {
      try
      {
        if (!this.gMl.gLW)
          break label473;
        this.gMl.asr();
        if (this.gMl.gLL.oud)
        {
          if (this.gMl.gLY.y >= paramInt1)
            break label473;
          localObject = new byte[this.gMl.gLY.x * this.gMl.gLY.y * 3 >> 1];
          SightVideoJNI.cropCameraDataLongEdge(paramArrayOfByte, (byte[])localObject, paramInt1, this.gMl.gLY.y, paramInt2);
          paramInt1 = this.gMl.gLY.y;
          paramInt2 = this.gMl.gLY.x;
          paramArrayOfByte = (byte[])localObject;
          localObject = new android/graphics/YuvImage;
          ((YuvImage)localObject).<init>(paramArrayOfByte, 17, paramInt1, paramInt2, null);
          ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
          localByteArrayOutputStream.<init>();
          paramArrayOfByte = new android/graphics/Rect;
          paramArrayOfByte.<init>(0, 0, paramInt1, paramInt2);
          ((YuvImage)localObject).compressToJpeg(paramArrayOfByte, 100, localByteArrayOutputStream);
          paramArrayOfByte = localByteArrayOutputStream.toByteArray();
          localObject = MMBitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
          if (paramInt4 != 90)
          {
            paramInt1 = paramInt3;
            if (paramInt4 != 270);
          }
          else
          {
            paramInt1 = (paramInt3 - paramInt4 + 360) % 360;
          }
          if ((paramInt1 != 0) && (paramInt1 != 360))
            continue;
          paramArrayOfByte = ((Bitmap)localObject).copy(Bitmap.Config.ARGB_8888, false);
          ab.i("MicroMsg.MMSightRecordViewImpl", "bitmap recycle %s", new Object[] { localObject.toString() });
          ((Bitmap)localObject).recycle();
          this.gMn.F(paramArrayOfByte);
          AppMethodBeat.o(138315);
          break;
        }
        if (this.gMl.gLY.x >= paramInt2)
          break label473;
        Object localObject = new byte[this.gMl.gLY.x * this.gMl.gLY.y * 3 >> 1];
        SightVideoJNI.cropCameraData(paramArrayOfByte, (byte[])localObject, paramInt1, paramInt2, this.gMl.gLY.x);
        paramInt1 = this.gMl.gLY.y;
        paramInt2 = this.gMl.gLY.x;
        paramArrayOfByte = (byte[])localObject;
        continue;
        paramArrayOfByte = d.b((Bitmap)localObject, paramInt1);
        continue;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.MMSightRecordViewImpl", paramArrayOfByte, "saveCaptureYuvDataToBitmap error: %s", new Object[] { paramArrayOfByte.getMessage() });
        this.gMn.aDq();
        AppMethodBeat.o(138315);
      }
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.f.6
 * JD-Core Version:    0.6.2
 */