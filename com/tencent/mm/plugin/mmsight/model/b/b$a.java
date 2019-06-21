package com.tencent.mm.plugin.mmsight.model.b;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.a.a;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;
import java.nio.ByteBuffer;

final class b$a extends ak
{
  public b$a(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(76693);
    byte[] arrayOfByte;
    int i;
    long l;
    int j;
    label284: int k;
    boolean bool;
    if (paramMessage.what == 1)
    {
      arrayOfByte = (byte[])paramMessage.obj;
      if (paramMessage.arg1 != 1)
        break label639;
      i = 1;
      l = paramMessage.arg2;
      if (b.c(this.oxm) != null)
      {
        if (b.d(this.oxm) == null)
          b.a(this.oxm, b.e(this.oxm).alJ());
        if (b.f(this.oxm) != null)
        {
          paramMessage = b.f(this.oxm).bPh();
          if (paramMessage != null)
          {
            j = paramMessage.getRowBytes() * paramMessage.getHeight();
            ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(j);
            localByteBuffer.position(0);
            paramMessage.copyPixelsToBuffer(localByteBuffer);
            localByteBuffer.position(0);
            if (b.g(this.oxm) == null)
              b.a(this.oxm, new byte[j]);
            localByteBuffer.get(b.g(this.oxm));
            SightVideoJNI.blendYuvFrame(arrayOfByte, b.g(this.oxm), b.d(this.oxm).x, b.d(this.oxm).y);
          }
        }
        if (b.h(this.oxm) != null)
        {
          if (b.g(this.oxm) == null)
          {
            if ((b.i(this.oxm) != 90) && (b.i(this.oxm) != 270))
              break label644;
            b.a(this.oxm, d.b(b.h(this.oxm), 360 - b.i(this.oxm)));
            b.a(this.oxm, Bitmap.createScaledBitmap(b.h(this.oxm), b.d(this.oxm).x, b.d(this.oxm).y, true));
            paramMessage = ByteBuffer.allocateDirect(b.h(this.oxm).getRowBytes() * b.h(this.oxm).getHeight());
            paramMessage.position(0);
            b.h(this.oxm).copyPixelsToBuffer(paramMessage);
            paramMessage.position(0);
            b.a(this.oxm, new byte[paramMessage.remaining()]);
            paramMessage.get(b.g(this.oxm));
          }
          SightVideoJNI.blendYuvFrame(arrayOfByte, b.g(this.oxm), b.d(this.oxm).x, b.d(this.oxm).y);
        }
        paramMessage = b.c(this.oxm);
        j = b.d(this.oxm).x;
        k = b.d(this.oxm).y;
        if ((i != 0) || (arrayOfByte == null))
          break label718;
        if ((j != paramMessage.eTi) || (k != paramMessage.eTj))
          break label680;
        bool = false;
        label489: ab.d("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData, needScale: %s, srcSize: [%s, %s], targetSize: [%s, %s], pts: %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramMessage.eTi), Integer.valueOf(paramMessage.eTj), Long.valueOf(l) });
        if (paramMessage.fXZ == null)
          paramMessage.fXZ = new byte[paramMessage.eTi * paramMessage.eTj * 3 >> 1];
        if ((paramMessage.eTl != 19) || (bool))
          break label686;
        System.arraycopy(arrayOfByte, 0, paramMessage.fXZ, 0, arrayOfByte.length);
        label605: paramMessage.fXV += 1;
        paramMessage.b(paramMessage.fXZ, false, l);
      }
    }
    while (true)
    {
      j.owk.g(arrayOfByte);
      AppMethodBeat.o(76693);
      return;
      label639: i = 0;
      break;
      label644: if (b.i(this.oxm) != 180)
        break label284;
      b.a(this.oxm, d.b(b.h(this.oxm), 180.0F));
      break label284;
      label680: bool = true;
      break label489;
      label686: MP4MuxerJNI.yuv420pTo420XXAndScaleLock(arrayOfByte, 2, paramMessage.fXZ, paramMessage.fYa, j, k, j, k, paramMessage.eTi, paramMessage.eTj);
      break label605;
      label718: paramMessage.b(paramMessage.fXZ, true, l);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.b.b.a
 * JD-Core Version:    0.6.2
 */