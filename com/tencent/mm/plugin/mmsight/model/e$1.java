package com.tencent.mm.plugin.mmsight.model;

import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.base.model.a;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class e$1
  implements Camera.PreviewCallback
{
  e$1(e parame)
  {
  }

  public final void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(76468);
    if (!this.ouh.otZ)
    {
      ab.i("MicroMsg.MMSightCamera", "onPreviewFrame: %s %s", new Object[] { paramArrayOfByte, this.ouh.erH });
      this.ouh.otZ = true;
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      ab.e("MicroMsg.MMSightCamera", "onPreviewFrame, frame data is null!!");
      AppMethodBeat.o(76468);
      return;
    }
    paramCamera = this.ouh.otX;
    if (paramCamera.jDk == 0)
    {
      paramCamera.jDj += 1;
      paramCamera.jDi = bo.ank(m.Lz());
    }
    paramCamera.jDk += 1;
    int i;
    label126: byte[] arrayOfByte;
    long l1;
    label366: long l2;
    int j;
    boolean bool;
    if (paramCamera.jDk >= 90)
    {
      i = 0;
      paramCamera.jDk = i;
      if ((e.a(this.ouh)) || (this.ouh.faZ == null) || (this.ouh.faZ.size() <= 0))
        break label948;
      if (this.ouh.fbc == null)
        break label585;
      arrayOfByte = j.owk.g(Integer.valueOf(this.ouh.fav.lZe * this.ouh.fbc.y * 3 / 2));
      e.b(this.ouh).jl(1L);
      l1 = bo.yz();
      SightVideoJNI.cropCameraData(paramArrayOfByte, arrayOfByte, this.ouh.fav.lZe, this.ouh.fav.lZf, this.ouh.fbc.y);
      if (this.ouh.fbc.x >= this.ouh.fav.lZe)
        break label942;
      paramCamera = j.owk.g(Integer.valueOf(this.ouh.fbc.x * this.ouh.fbc.y * 3 / 2));
      SightVideoJNI.cropCameraDataLongEdge(arrayOfByte, paramCamera, this.ouh.fav.lZe, this.ouh.fbc.x, this.ouh.fbc.y);
      j.owk.g(arrayOfByte);
      l2 = bo.az(l1);
      e.c(this.ouh).jl(l2);
      if (!this.ouh.fas)
      {
        l1 = bo.yz();
        i = this.ouh.fbc.x;
        j = this.ouh.fbc.y;
        if ((this.ouh.fbb.rotate != 270) && (this.ouh.fbb.rotate != 90))
          break label579;
        bool = true;
        label457: SightVideoJNI.mirrorCameraData(paramCamera, i, j, bool);
        l2 = bo.az(l1);
        e.d(this.ouh).jl(l2);
      }
      bool = e.a(this.ouh, paramCamera);
      l1 = bo.az(l1);
      if (bool)
        e.e(this.ouh).jl(l1);
    }
    while (true)
    {
      e.b(this.ouh, paramCamera);
      if (e.f(this.ouh) == e.a.oui)
        e.g(this.ouh).jl(1L);
      while (true)
      {
        this.ouh.erH.addCallbackBuffer(paramArrayOfByte);
        AppMethodBeat.o(76468);
        break;
        i = paramCamera.jDk;
        break label126;
        label579: bool = false;
        break label457;
        label585: l1 = bo.yz();
        label657: label754: e locale;
        if (!this.ouh.fas)
        {
          j = this.ouh.fav.lZe;
          i = this.ouh.fav.lZf;
          if ((this.ouh.fbb.rotate == 270) || (this.ouh.fbb.rotate == 90))
          {
            bool = true;
            SightVideoJNI.mirrorCameraData(paramArrayOfByte, j, i, bool);
            l2 = bo.az(l1);
            e.d(this.ouh).jl(l2);
          }
        }
        else
        {
          if ((!this.ouh.otW) || (this.ouh.otV == null))
            break label899;
          SightVideoJNI.paddingYuvData16(paramArrayOfByte, this.ouh.otV, this.ouh.otT.x, this.ouh.otS.y, this.ouh.otT.y);
          paramCamera = this.ouh.otV;
          bool = e.a(this.ouh, paramCamera);
          l1 = bo.az(l1);
          if (bool)
            e.e(this.ouh).jl(l1);
          if (this.ouh.otW)
          {
            arrayOfByte = paramArrayOfByte;
            if (this.ouh.otV != null);
          }
          else
          {
            arrayOfByte = paramArrayOfByte;
            if (bool)
              arrayOfByte = j.owk.g(Integer.valueOf(paramArrayOfByte.length));
          }
          if ((this.ouh.otW) && (this.ouh.otV != null))
          {
            locale = this.ouh;
            if (!bool)
              break label904;
          }
        }
        label899: label904: for (paramArrayOfByte = j.owk.g(Integer.valueOf(this.ouh.otV.length)); ; paramArrayOfByte = this.ouh.otV)
        {
          locale.otV = paramArrayOfByte;
          paramArrayOfByte = arrayOfByte;
          break;
          bool = false;
          break label657;
          paramCamera = paramArrayOfByte;
          break label754;
        }
        if (e.f(this.ouh) == e.a.ouj)
          e.h(this.ouh).jl(1L);
      }
      label942: paramCamera = arrayOfByte;
      break label366;
      label948: arrayOfByte = paramArrayOfByte;
      paramCamera = paramArrayOfByte;
      paramArrayOfByte = arrayOfByte;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.e.1
 * JD-Core Version:    0.6.2
 */