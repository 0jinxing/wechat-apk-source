package com.tencent.mm.plugin.voip.video;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.c.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.compatible.e.z;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.a.d;
import com.tencent.mm.plugin.voip.b;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.model.s;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements Camera.PreviewCallback
{
  a$2(a parama)
  {
  }

  public final void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(5021);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      h.pYm.a(159L, 0L, 1L, false);
      h.pYm.a(159L, 3L, 1L, false);
      if (this.sZQ.sZD != null)
        this.sZQ.sZD.bSo();
      AppMethodBeat.o(5021);
    }
    while (true)
    {
      return;
      if (this.sZQ.sZw != null)
        break;
      ab.e("MicroMsg.Voip.CaptureRender", "onPreviewFrame mSize is null");
      AppMethodBeat.o(5021);
    }
    int i;
    int j;
    int k;
    int m;
    if (this.sZQ.sZD != null)
    {
      i = 1;
      if (this.sZQ.sZn)
      {
        j = j.tbu;
        k = j;
        if (!q.etc.eqY)
          break label611;
        k = j;
        if (q.etc.eqX.rotate == 0)
          break label611;
        m = q.etc.eqX.erF;
        i = 1;
        k = j;
        j = i;
      }
    }
    while (true)
    {
      label172: label180: boolean bool;
      if (k > 0)
      {
        i = 32;
        paramCamera = this.sZQ;
        if ((j != 0) || (k <= 0))
          break label528;
        bool = true;
        label198: paramCamera.sZo = bool;
        int n = this.sZQ.sZw.width;
        k = this.sZQ.sZw.height;
        if (j == 0)
          break label534;
        if (this.sZQ.sZG == null)
        {
          j = n * k * 3 / 2;
          this.sZQ.sZG = new byte[j];
          this.sZQ.sZG[0] = ((byte)90);
        }
        Object localObject = b.cIj();
        int i1 = paramArrayOfByte.length;
        j = this.sZQ.sZx;
        paramCamera = this.sZQ.sZG;
        int i2 = this.sZQ.sZG.length;
        localObject = ((r)localObject).sSP.sNl.sPr;
        if ((((m)localObject).kzf != m.kze) && (((m)localObject).sNl.sPp.cKK()) && (((m)localObject).sNl.cIP()))
          ((m)localObject).sNl.sPp.videoRorate90D(paramArrayOfByte, i1, n, k, j, paramCamera, i2, n, k, m);
        this.sZQ.sZD.a(this.sZQ.sZG, this.sZQ.sZG.length, n, k, this.sZQ.sZx, i);
      }
      while (true)
        if (d.cLu() >= 8)
        {
          if (this.sZQ.mdw == null)
          {
            ab.e("MicroMsg.Voip.CaptureRender", "the camera is null and has been release");
            AppMethodBeat.o(5021);
            break;
            m = j.tbv;
            k = m;
            if (!q.etc.era)
              break label611;
            k = m;
            if (q.etc.eqZ.rotate == 0)
              break label611;
            i = q.etc.eqZ.erF;
            j = 1;
            k = m;
            m = i;
            break label172;
            i = 0;
            break label180;
            label528: bool = false;
            break label198;
            label534: this.sZQ.sZD.a(paramArrayOfByte, paramArrayOfByte.length, this.sZQ.sZw.width, this.sZQ.sZw.height, this.sZQ.sZx, i);
            continue;
          }
          if (this.sZQ.mdw != null)
            this.sZQ.mdw.addCallbackBuffer(paramArrayOfByte);
        }
      AppMethodBeat.o(5021);
      break;
      label611: j = 0;
      m = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.a.2
 * JD-Core Version:    0.6.2
 */