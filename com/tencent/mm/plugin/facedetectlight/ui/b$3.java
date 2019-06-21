package com.tencent.mm.plugin.facedetectlight.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.facedetectaction.b.a.1;
import com.tencent.mm.plugin.facedetectaction.b.a.2;
import com.tencent.mm.plugin.facedetectaction.b.a.a;
import com.tencent.mm.plugin.facedetectaction.b.a.b;
import com.tencent.mm.plugin.facedetectaction.b.d;
import com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.youtu.ytfacetrace.YTFaceTraceInterface;
import com.tencent.youtu.ytfacetrace.YTFaceTraceInterface.FaceDetectResult;

final class b$3
  implements Runnable
{
  b$3(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(762);
    h localh;
    if (!b.d(this.mdJ))
    {
      localh = h.pYm;
      if (b.e(this.mdJ) == 1)
      {
        l = 3L;
        localh.a(917L, l, 1L, false);
        b.d(this.mdJ);
      }
    }
    else
    {
      localh = h.pYm;
      if (b.e(this.mdJ) != 1)
        break label107;
    }
    label107: for (long l = 2L; ; l = 38L)
    {
      localh.a(917L, l, 1L, false);
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(761);
          Object localObject1;
          Object localObject2;
          Object localObject3;
          int i;
          Object localObject4;
          Object localObject5;
          Object localObject6;
          Object localObject7;
          int j;
          int k;
          int m;
          Object localObject8;
          if (b.e(b.3.this.mdJ) == 1)
          {
            c localc = c.a.btY();
            localObject1 = b.f(b.3.this.mdJ);
            localObject2 = b.g(b.3.this.mdJ);
            localObject3 = b.h(b.3.this.mdJ);
            i = b.i(b.3.this.mdJ);
            localObject4 = b.3.this.mdJ.mdy;
            localObject5 = b.j(b.3.this.mdJ);
            byte[] arrayOfByte = b.k(b.3.this.mdJ);
            localObject6 = b.l(b.3.this.mdJ);
            localObject7 = b.m(b.3.this.mdJ);
            j = b.n(b.3.this.mdJ);
            k = b.o(b.3.this.mdJ);
            m = b.p(b.3.this.mdJ);
            localObject8 = b.q(b.3.this.mdJ);
            ab.i("MicroMsg.FaceReflectLogic", "initPreviewDetect（）");
            localc.mContext = ((Context)localObject1);
            localc.mdw = ((t)localObject3);
            localc.hGq = i;
            localc.mbZ = ((TextView)localObject4);
            localc.mdI = ((com.tencent.mm.plugin.facedetectlight.ui.a.b)localObject2);
            localc.mdz = ((FaceReflectMask)localObject5);
            localc.mdQ = j;
            localc.mDesiredPreviewWidth = k;
            localc.mDesiredPreviewHeight = m;
            localc.mdR = ((Point)localObject8);
            localc.lWX = arrayOfByte;
            localc.mdC = ((String)localObject6);
            localc.mAppId = ((String)localObject7);
            ab.i("MicroMsg.FaceReflectLogic", "mConfig is ".concat(String.valueOf(arrayOfByte)));
            ab.i("MicroMsg.FaceReflectLogic", "mBioID is " + localc.mdC);
            ab.i("MicroMsg.FaceReflectLogic", "mAppId is ".concat(String.valueOf(localObject7)));
            localc.mcb = new Rect(0, 0, 0, 0);
            localc.mcc = new Rect(0, 0, 0, 0);
            localc.mch = new c.1(localc);
            if (com.tencent.mm.plugin.facedetect.e.a.btw().lZc)
              com.tencent.mm.plugin.facedetect.e.a.btw().a(localc.mdQ, localc.mDesiredPreviewWidth, localc.mDesiredPreviewHeight, localc.mdR.x, localc.mDesiredPreviewHeight, false);
            localObject3 = c.a.btY();
            ab.i("MicroMsg.FaceReflectLogic", "initFaceDetect（）");
          }
          while (true)
          {
            try
            {
              localObject5 = ((c)localObject3).mContext;
              localObject7 = ((c)localObject3).mdw.etv;
              k = ((c)localObject3).hGq;
              localObject6 = new com/tencent/mm/plugin/facedetectlight/ui/c$3;
              ((c.3)localObject6).<init>((c)localObject3);
              YTFaceTraceInterface.start((Context)localObject5, (Camera)localObject7, k, (YTFaceTraceInterface.FaceDetectResult)localObject6, ((c)localObject3).mch);
              AppMethodBeat.o(761);
              return;
            }
            catch (Exception localException2)
            {
              ab.i("MicroMsg.FaceReflectLogic", "init FaceDetect() failed ：%s ", new Object[] { localException2.getMessage() });
              AppMethodBeat.o(761);
              continue;
            }
            localObject3 = a.b.btO();
            localObject2 = b.r(b.3.this.mdJ).getApplicationContext();
            localObject8 = b.r(b.3.this.mdJ);
            localObject7 = b.h(b.3.this.mdJ).etv;
            j = b.i(b.3.this.mdJ);
            localObject1 = b.3.this.mdJ.mdy;
            localObject4 = b.s(b.3.this.mdJ);
            i = b.n(b.3.this.mdJ);
            Point localPoint = new Point(b.o(b.3.this.mdJ), b.p(b.3.this.mdJ));
            k = b.t(b.3.this.mdJ);
            localObject6 = b.u(b.3.this.mdJ);
            m = b.o(b.3.this.mdJ);
            int n = b.p(b.3.this.mdJ);
            ab.i("MicroMsg.FaceActionLogic", "initFaceDetect（）");
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mContext = ((Context)localObject2);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mCamera = ((Camera)localObject7);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).hGq = j;
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mbZ = ((TextView)localObject1);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mbY = ((FaceActionUI)localObject8);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mca = ((a.a)localObject4);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mbW = k;
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mbX = ((String)localObject6);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mDesiredPreviewWidth = m;
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mDesiredPreviewHeight = n;
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mcb = new Rect(0, 0, 0, 0);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mcc = new Rect(0, 0, 0, 0);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mch = new a.1((com.tencent.mm.plugin.facedetectaction.b.a)localObject3);
            ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mci = new a.2((com.tencent.mm.plugin.facedetectaction.b.a)localObject3);
            try
            {
              YTFaceTraceInterface.start(((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mContext, ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mCamera, ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).hGq, ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mci, ((com.tencent.mm.plugin.facedetectaction.b.a)localObject3).mch);
              ab.i("MicroMsg.FaceActionLogic", "init face detect, camera, rotate: %s", new Object[] { Integer.valueOf(i) });
              d.mcq.fcR = i;
              localObject3 = d.mcq;
              j = localPoint.x;
              k = localPoint.y;
              ((d)localObject3).mcz = j;
              ((d)localObject3).mcA = k;
              AppMethodBeat.o(761);
            }
            catch (Exception localException1)
            {
              while (true)
                ab.i("MicroMsg.FaceActionLogic", "init FaceDetect() failed ：%s ", new Object[] { localException1.getMessage() });
            }
          }
        }
      });
      AppMethodBeat.o(762);
      return;
      l = 39L;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.b.3
 * JD-Core Version:    0.6.2
 */