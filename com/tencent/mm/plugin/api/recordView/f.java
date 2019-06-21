package com.tencent.mm.plugin.api.recordView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.a;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.c;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.f;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.g;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.h;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.plugin.mmsight.model.e;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class f extends MMSightRecordView.e
  implements g.a, d.a, com.tencent.mm.plugin.mmsight.model.f
{
  private int audioSampleRate;
  private Context context;
  private int fps;
  private int fzS;
  private com.tencent.mm.plugin.mmsight.model.a.d gLK;
  e gLL;
  int gLM;
  private int gLN;
  float gLO;
  private int gLP;
  private boolean gLQ;
  private ObservableTextureView gLR;
  MMSightCameraGLSurfaceView gLS;
  boolean gLT;
  private MMSightRecordView.a gLU;
  boolean gLV;
  boolean gLW;
  int gLX;
  Point gLY;
  private Point gLZ;
  private boolean gMa;
  private boolean gMb;
  private g gMc;
  MMSightRecordView.d gMd;
  MMSightRecordView.c gMe;
  private boolean gMf;
  private float gMg;
  private WindowManager gMh;
  h gMi;
  private Point gMj;
  private byte[] gMk;
  private int videoBitrate;
  private String videoPath;

  public f()
  {
    AppMethodBeat.i(76344);
    this.gLQ = true;
    this.gLT = false;
    this.gLV = false;
    this.gLW = false;
    this.gLX = -1;
    this.gMa = true;
    this.gMb = true;
    this.gMf = false;
    this.gMg = 1.0F;
    this.gMh = null;
    this.gMi = null;
    this.gMj = new Point(0, 0);
    this.gMk = null;
    AppMethodBeat.o(76344);
  }

  private void asq()
  {
    AppMethodBeat.i(76367);
    if ((this.gLL != null) && (this.gLL.bPu()))
      if (!this.gLL.oud)
        break label98;
    label98: int i;
    for (this.gLZ = new Point(com.tencent.mm.plugin.mmsight.d.ev((int)(this.gLL.getPreviewWidth() / this.gLO), this.gLL.getPreviewHeight()), this.gLL.getPreviewWidth()); ; this.gLZ = new Point(this.gLL.getPreviewHeight(), i))
    {
      ab.i("MicroMsg.MMSightRecordViewImpl", "initVideoSize: %s", new Object[] { this.gLZ });
      AppMethodBeat.o(76367);
      return;
      i = com.tencent.mm.plugin.mmsight.d.ev((int)(this.gLL.getPreviewHeight() * this.gLO), this.gLL.getPreviewWidth());
    }
  }

  private int asz()
  {
    AppMethodBeat.i(76381);
    if (this.gMh == null)
      this.gMh = ((WindowManager)ah.getContext().getSystemService("window"));
    int i;
    if (this.gMh == null)
    {
      AppMethodBeat.o(76381);
      i = 0;
    }
    while (true)
    {
      return i;
      switch (this.gMh.getDefaultDisplay().getRotation())
      {
      default:
        AppMethodBeat.o(76381);
        i = 0;
        break;
      case 0:
        AppMethodBeat.o(76381);
        i = 0;
        break;
      case 1:
        i = 90;
        AppMethodBeat.o(76381);
        break;
      case 2:
        i = 180;
        AppMethodBeat.o(76381);
        break;
      case 3:
        i = 270;
        AppMethodBeat.o(76381);
      }
    }
  }

  public final boolean EL()
  {
    AppMethodBeat.i(76355);
    ab.i("MicroMsg.MMSightRecordViewImpl", "startRecord, recorder: %s", new Object[] { this.gLK });
    asp();
    boolean bool;
    if (this.gLK == null)
    {
      ab.e("MicroMsg.MMSightRecordViewImpl", "startRecord error, recorder is null!");
      AppMethodBeat.o(76355);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = asz();
      ab.i("MicroMsg.MMSightRecordViewImpl", "screen rotate: %s", new Object[] { Integer.valueOf(i) });
      if ((i == 90) || (i == 270));
      for (i = this.gLK.b(this.gLL.getOrientation(), true, 360 - i); ; i = this.gLK.b(this.gLL.getOrientation(), false, i))
      {
        ab.i("MicroMsg.MMSightRecordViewImpl", "startRecord now, ret: %s", new Object[] { Integer.valueOf(i) });
        if (i < 0)
          break label163;
        AppMethodBeat.o(76355);
        bool = true;
        break;
      }
      label163: AppMethodBeat.o(76355);
      bool = false;
    }
  }

  public final boolean O(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76376);
    boolean bool1;
    if (paramArrayOfByte == null)
    {
      bool1 = false;
      AppMethodBeat.o(76376);
      return bool1;
    }
    int i;
    Object localObject1;
    if (this.gMi != null)
    {
      i = asz();
      localObject1 = this.gMi;
      if ((((h)localObject1).eCM) || (((h)localObject1).gMv != null))
        ((h)localObject1).queue(new h.2((h)localObject1, paramArrayOfByte, i));
    }
    int j;
    int k;
    if ((this.gLO > 0.0F) && (this.gLM > 0) && (this.gLL != null))
    {
      j = this.gLL.getPreviewWidth();
      i = this.gLL.getPreviewHeight();
      if (this.gLL.oud)
      {
        k = (int)(this.gLL.getPreviewWidth() / this.gLO);
        if (k >= i)
          break label1095;
        if ((!this.gLV) && (this.gMk == null))
        {
          this.gMk = new byte[j * k * 3 >> 1];
          localObject1 = this.gMk;
          label175: bo.yz();
          SightVideoJNI.cropCameraDataLongEdge(paramArrayOfByte, (byte[])localObject1, i, this.gLZ.x, j);
          i = k;
          if (this.gLV)
            i = this.gLZ.x;
          this.gMf = true;
        }
      }
    }
    while (true)
    {
      label218: Object localObject2 = localObject1;
      a locala;
      int m;
      int n;
      if (this.gLS != null)
      {
        localObject2 = this.gLS;
        k = this.gLL.getOrientation();
        if ((i != ((MMSightCameraGLSurfaceView)localObject2).gLw) || (j != ((MMSightCameraGLSurfaceView)localObject2).gLx) || (k != ((MMSightCameraGLSurfaceView)localObject2).fcf))
        {
          ab.i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), localObject2 });
          ((MMSightCameraGLSurfaceView)localObject2).gLw = i;
          ((MMSightCameraGLSurfaceView)localObject2).gLx = j;
          ((MMSightCameraGLSurfaceView)localObject2).fcf = k;
        }
        j = asz();
        localObject2 = this.gLS;
        if ((localObject1 == null) || (((MMSightCameraGLSurfaceView)localObject2).gLE == null) || (((MMSightCameraGLSurfaceView)localObject2).gLE.gLv))
          break label1045;
        locala = ((MMSightCameraGLSurfaceView)localObject2).gLE;
        k = ((MMSightCameraGLSurfaceView)localObject2).gLw;
        m = ((MMSightCameraGLSurfaceView)localObject2).gLx;
        n = ((MMSightCameraGLSurfaceView)localObject2).fcf;
        i = 0;
      }
      while (true)
      {
        try
        {
          if ((locala.gLx != m) || (locala.gLw != k) || (locala.rotate != n) || (locala.gLD != j))
            i = 1;
          if (i != 0)
            ab.d("MicroMsg.MMSightCameraGLRenderer", "setDrawFrame, frameData: %s, frameWidth: %s, frameHeight: %s, rotate: %s, isLandScape, frameSizeChange: %s, this %s", new Object[] { localObject1, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Boolean.valueOf(locala.fdb), Boolean.TRUE, locala });
          locala.frameData = ((byte[])localObject1);
          locala.gLw = k;
          locala.gLx = m;
          locala.rotate = n;
          locala.gLD = j;
          if (i != 0)
          {
            locala.eZU = ByteBuffer.allocateDirect(m * k);
            locala.eZV = ByteBuffer.allocateDirect(k * m / 2);
            locala.eZU.order(ByteOrder.nativeOrder());
            locala.eZV.order(ByteOrder.nativeOrder());
            if (locala.gLB != null)
            {
              locala.eZi.put(locala.gLB);
              locala.eZi.position(0);
            }
          }
          if ((locala.eZU != null) && (locala.eZV != null))
          {
            locala.eZU.put((byte[])localObject1, 0, k * m);
            locala.eZU.position(0);
            locala.eZV.put((byte[])localObject1, k * m, k * m / 2);
            locala.eZV.position(0);
          }
          ((MMSightCameraGLSurfaceView)localObject2).requestRender();
          localObject2 = localObject1;
          if (this.gLU != null)
          {
            localObject1 = getPreviewSize();
            this.gLU.q(paramArrayOfByte, ((Point)localObject1).x, ((Point)localObject1).y);
          }
          boolean bool2 = true;
          j = 0;
          bool1 = bool2;
          i = j;
          if (this.gLK != null)
          {
            bool1 = bool2;
            i = j;
            if (this.gLK.getFrameDataCallback() != null)
            {
              if ((!this.gLV) || (!this.gMf))
                break label1067;
              bool1 = this.gLK.getFrameDataCallback().O((byte[])localObject2);
              i = 1;
            }
          }
          if ((i != 0) && ((this.gLK == null) || (this.gLK.WL() != d.c.ovB)))
            com.tencent.mm.plugin.mmsight.model.a.j.owk.g((byte[])localObject2);
          AppMethodBeat.o(76376);
          break;
          localObject1 = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(this.gLZ.x * this.gLZ.y * 3 >> 1));
          break label175;
          k = (int)(i * this.gLO);
          if (k >= j)
            break label1089;
          if ((!this.gLV) && (this.gMk == null))
          {
            this.gMk = new byte[k * i * 3 >> 1];
            localObject1 = this.gMk;
            bo.yz();
            SightVideoJNI.cropCameraData(paramArrayOfByte, (byte[])localObject1, i, j, this.gLZ.y);
            j = this.gLZ.y;
            this.gMf = true;
            break label218;
          }
          localObject1 = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(this.gLZ.x * this.gLZ.y * 3 >> 1));
          continue;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MMSightCameraGLRenderer", "setDrawFrame error: %s", new Object[] { localException.getMessage() });
          continue;
        }
        label1045: ab.v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
        localObject2 = localObject1;
        continue;
        localObject2 = paramArrayOfByte;
        continue;
        label1067: bool1 = this.gLK.getFrameDataCallback().O(paramArrayOfByte);
        i = j;
      }
      label1089: localObject1 = paramArrayOfByte;
      continue;
      label1095: localObject1 = paramArrayOfByte;
    }
  }

  public final void a(MMSightRecordView.g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(76357);
    if ((paramg != null) && (this.gLL != null) && (this.gLL.bPu()))
    {
      if (paramBoolean)
        this.gLL.bPr();
      if (paramBoolean)
      {
        al.n(new f.5(this, paramg, paramBoolean), 100L);
        AppMethodBeat.o(76357);
      }
    }
    while (true)
    {
      return;
      b(paramg, paramBoolean);
      AppMethodBeat.o(76357);
    }
  }

  public final void a(MMSightRecordView.h paramh)
  {
    AppMethodBeat.i(76356);
    if (this.gLK != null)
    {
      ab.i("MicroMsg.MMSightRecordViewImpl", "stopRecord, stopCallback: %s", new Object[] { paramh });
      this.gLK.a(new f.3(this, paramh));
      this.gLK.v(new f.4(this, paramh));
      this.gLK = null;
    }
    AppMethodBeat.o(76356);
  }

  public final void a(ByteBuffer paramByteBuffer, MMSightRecordView.f paramf)
  {
    AppMethodBeat.i(76382);
    if ((paramf == null) && (paramByteBuffer == null))
    {
      if (this.gMi != null)
      {
        this.gMi.release();
        this.gMi = null;
      }
      AppMethodBeat.o(76382);
    }
    while (true)
    {
      return;
      if (this.gMi == null)
      {
        this.gMi = new h();
        Point localPoint = getPreviewSize();
        this.gMi.h(localPoint.x, localPoint.y, this.gLL.getOrientation(), this.gMj.x, this.gMj.y);
        this.gMi.gMw = new f.7(this, paramf, paramByteBuffer);
        this.gMi.a(this.gLS.fag);
      }
      AppMethodBeat.o(76382);
    }
  }

  final void asA()
  {
    AppMethodBeat.i(76383);
    Point localPoint = getPreviewSize();
    this.gMj.y = this.gLN;
    this.gMj.x = (localPoint.x * this.gLN / localPoint.y);
    if ((getCameraRotation() == 0) || (getCameraRotation() == 180))
    {
      int i = this.gMj.y;
      this.gMj.y = this.gMj.x;
      this.gMj.x = i;
    }
    if (this.gMi != null)
    {
      localPoint = getPreviewSize();
      this.gMi.h(localPoint.x, localPoint.y, this.gLL.getOrientation(), this.gMj.x, this.gMj.y);
    }
    AppMethodBeat.o(76383);
  }

  public final void aso()
  {
    AppMethodBeat.i(76353);
    asp();
    AppMethodBeat.o(76353);
  }

  final void asp()
  {
    AppMethodBeat.i(76354);
    if (this.gLT)
    {
      ab.i("MicroMsg.MMSightRecordViewImpl", "initRecorder, already init");
      AppMethodBeat.o(76354);
    }
    while (true)
    {
      return;
      if (this.gLK != null)
      {
        ab.i("MicroMsg.MMSightRecordViewImpl", "startRecord, recorder not null, stop first");
        this.gLK.cancel();
        if (this.gLL != null)
          this.gLL.b(this.gLK.getFrameDataCallback());
        this.gLK = null;
      }
      if ((this.gLM > 0) && (this.gLP > 0) && (this.videoBitrate > 0) && (this.fps > 0) && (this.fzS > 0) && (this.audioSampleRate > 0) && (this.gLL != null) && (this.gLL.getEncodeVideoBestSize() != null))
      {
        VideoTransPara localVideoTransPara = new VideoTransPara();
        localVideoTransPara.width = this.gLM;
        localVideoTransPara.height = ((int)(this.gLM / this.gLO));
        localVideoTransPara.duration = this.gLP;
        localVideoTransPara.videoBitrate = this.videoBitrate;
        localVideoTransPara.fps = this.fps;
        localVideoTransPara.fzS = this.fzS;
        localVideoTransPara.audioSampleRate = this.audioSampleRate;
        localVideoTransPara.fzU = 2;
        localVideoTransPara.fzV = 1;
        localVideoTransPara.fzT = 1;
        com.tencent.mm.plugin.mmsight.model.j.ouz.fcY = localVideoTransPara;
        com.tencent.mm.plugin.mmsight.model.j.ouz.videoBitrate = this.videoBitrate;
        com.tencent.mm.plugin.mmsight.model.j.ouz.fay = this.gLM;
        k.bPR();
        this.gLK = k.p(localVideoTransPara);
        if (this.gLK == null)
        {
          ab.e("MicroMsg.MMSightRecordViewImpl", "can not get media recorder!");
          if (this.gMd != null)
            this.gMd.aDo();
          AppMethodBeat.o(76354);
        }
        else
        {
          this.gLK.setFilePath(this.videoPath);
          if ((this.gLV) && (this.gLL != null) && (this.gLL.bPu()))
            asq();
          int i = this.gLL.getEncodeVideoBestSize().x;
          int j = this.gLL.getEncodeVideoBestSize().y;
          int k = j;
          int m = i;
          if (this.gLZ != null)
          {
            k = j;
            m = i;
            if (this.gLV)
            {
              m = this.gLZ.x;
              k = this.gLZ.y;
            }
          }
          j = (int)(m * this.gMg);
          m = (int)(k * this.gMg);
          k = com.tencent.mm.plugin.mmsight.d.yP(j);
          m = com.tencent.mm.plugin.mmsight.d.yP(m);
          ab.i("MicroMsg.MMSightRecordViewImpl", "initRecorder, videoWidth: %s, videoHeight: %s, videoSizeRatio: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Float.valueOf(this.gMg) });
          if ((this.gLZ != null) && (this.gLV))
            this.gLK.s(this.gLZ.y, this.gLZ.x, k, m);
          while (true)
          {
            this.gLK.WR();
            this.gLK.a(this);
            if (this.gLK.ko(this.gLL.getOrientation()))
              break label625;
            ab.e("MicroMsg.MMSightRecordViewImpl", "init recorder error");
            if (this.gMd != null)
              this.gMd.aDo();
            AppMethodBeat.o(76354);
            break;
            this.gLK.s(this.gLL.getPreviewWidth(), this.gLL.getPreviewHeight(), k, m);
          }
          label625: al.n(new f.2(this), 100L);
          this.gLT = true;
        }
      }
      else
      {
        AppMethodBeat.o(76354);
      }
    }
  }

  final void asr()
  {
    AppMethodBeat.i(76369);
    if ((this.gLL != null) && (this.gLL.bPu()))
      if (this.gLL.oud)
      {
        int i = (int)(this.gLL.getPreviewWidth() / this.gLO);
        this.gLY = new Point(this.gLL.getPreviewWidth(), i);
        AppMethodBeat.o(76369);
      }
    while (true)
    {
      return;
      this.gLY = new Point((int)(this.gLL.getPreviewHeight() * this.gLO), this.gLL.getPreviewHeight());
      AppMethodBeat.o(76369);
    }
  }

  final void ass()
  {
    AppMethodBeat.i(76371);
    ab.i("MicroMsg.MMSightRecordViewImpl", "setFlashModeImpl, mode: %s", new Object[] { Integer.valueOf(this.gLX) });
    switch (this.gLX)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(76371);
      while (true)
      {
        return;
        this.gLL.bPr();
        AppMethodBeat.o(76371);
        continue;
        this.gLL.bPs();
        AppMethodBeat.o(76371);
      }
      this.gLL.bPt();
    }
  }

  public final void ast()
  {
    AppMethodBeat.i(76372);
    ab.i("MicroMsg.MMSightRecordViewImpl", "setHalfPreviewVideoSize");
    this.gMg = 0.5F;
    AppMethodBeat.o(76372);
  }

  public final void asu()
  {
    AppMethodBeat.i(76373);
    ab.i("MicroMsg.MMSightRecordViewImpl", "set34PreviewVideoSize");
    this.gMg = 0.75F;
    AppMethodBeat.o(76373);
  }

  public final void asv()
  {
    AppMethodBeat.i(76377);
    ab.i("MicroMsg.MMSightRecordViewImpl", "onError: %s", new Object[] { Integer.valueOf(1) });
    this.gLK.reset();
    AppMethodBeat.o(76377);
  }

  public final void asw()
  {
    AppMethodBeat.i(76378);
    if ((this.gLL != null) && (this.gLL.bPu()) && (this.gMb))
      this.gLL.bPp();
    AppMethodBeat.o(76378);
  }

  public final void asx()
  {
    AppMethodBeat.i(76379);
    if ((this.gLL != null) && (this.gLL.bPu()) && (this.gMa))
      this.gLL.d(true, false, 1);
    AppMethodBeat.o(76379);
  }

  public final void asy()
  {
    AppMethodBeat.i(76380);
    if ((this.gLL != null) && (this.gLL.bPu()) && (this.gMa))
      this.gLL.d(false, false, 1);
    AppMethodBeat.o(76380);
  }

  public final void b(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(76345);
    this.context = paramContext;
    this.gLR = new ObservableTextureView(paramContext);
    this.gLS = new MMSightCameraGLSurfaceView(paramContext);
    int i = com.tencent.mm.bz.a.fromDPToPix(paramContext, 1);
    Object localObject = new FrameLayout.LayoutParams(i, i);
    paramViewGroup.addView(this.gLR, (ViewGroup.LayoutParams)localObject);
    localObject = new ViewGroup.MarginLayoutParams(-1, -1);
    paramViewGroup.addView(this.gLS, (ViewGroup.LayoutParams)localObject);
    this.gMc = new g();
    this.gMc.gMu = this;
    this.gLS.setOnTouchListener(this.gMc);
    com.tencent.mm.plugin.mmsight.model.j.bPw();
    ab.i("MicroMsg.MMSightRecordViewImpl", "init view, context: %s", new Object[] { paramContext });
    AppMethodBeat.o(76345);
  }

  final void b(MMSightRecordView.g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(76358);
    this.gLL.a(new f.6(this, paramBoolean, paramg), false, asz());
    AppMethodBeat.o(76358);
  }

  public final int getCameraRotation()
  {
    AppMethodBeat.i(76364);
    int i;
    if (this.gLL != null)
    {
      i = this.gLL.getOrientation();
      AppMethodBeat.o(76364);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(76364);
    }
  }

  public final Bitmap getCurrentFramePicture()
  {
    Object localObject1 = null;
    AppMethodBeat.i(76374);
    Object localObject2;
    int i;
    int j;
    int k;
    if ((this.gLL != null) && (this.gLL.bPu()))
    {
      e locale = this.gLL;
      if (locale.fbl != null)
      {
        locale.fbk = true;
        localObject2 = new byte[locale.fbl.length];
        System.arraycopy(locale.fbl, 0, localObject2, 0, locale.fbl.length);
        locale.fbk = false;
        if (localObject2 == null)
          break label457;
        i = this.gLL.getPreviewWidth();
        j = this.gLL.getPreviewHeight();
        if (!this.gLL.oud)
          break label338;
        k = (int)(this.gLL.getPreviewWidth() / this.gLO);
        if (k >= j)
          break label471;
        if ((this.gLV) || (this.gMk != null))
          break label306;
        this.gMk = new byte[i * k * 3 >> 1];
        localObject1 = this.gMk;
        label159: SightVideoJNI.cropCameraDataLongEdge((byte[])localObject2, (byte[])localObject1, j, this.gLZ.x, i);
        j = k;
        if (this.gLV)
          j = this.gLZ.x;
        this.gMf = true;
      }
    }
    while (true)
    {
      localObject2 = localObject1;
      label306: label338: label468: 
      while (true)
      {
        localObject1 = new YuvImage((byte[])localObject2, 17, j, i, null);
        localObject2 = new ByteArrayOutputStream();
        ((YuvImage)localObject1).compressToJpeg(new Rect(0, 0, j, i), 100, (OutputStream)localObject2);
        localObject2 = ((ByteArrayOutputStream)localObject2).toByteArray();
        localObject1 = MMBitmapFactory.decodeByteArray((byte[])localObject2, 0, localObject2.length);
        localObject2 = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject1, this.gLL.getOrientation());
        ab.i("MicroMsg.MMSightRecordViewImpl", "bitmap recycle %s", new Object[] { localObject1 });
        ((Bitmap)localObject1).recycle();
        AppMethodBeat.o(76374);
        while (true)
        {
          return localObject2;
          localObject2 = null;
          break;
          localObject1 = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(this.gLZ.x * this.gLZ.y * 3 >> 1));
          break label159;
          k = (int)(j * this.gLO);
          if (k >= i)
            break label468;
          if ((!this.gLV) && (this.gMk == null))
            this.gMk = new byte[k * j * 3 >> 1];
          for (localObject1 = this.gMk; ; localObject1 = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(this.gLZ.x * this.gLZ.y * 3 >> 1)))
          {
            SightVideoJNI.cropCameraData((byte[])localObject2, (byte[])localObject1, j, i, this.gLZ.y);
            i = this.gLZ.y;
            this.gMf = true;
            localObject2 = localObject1;
            break;
          }
          AppMethodBeat.o(76374);
          localObject2 = localObject1;
        }
      }
      label457: label471: localObject1 = localObject2;
    }
  }

  public final Point getDrawSizePoint()
  {
    AppMethodBeat.i(76363);
    ab.i("MicroMsg.MMSightRecordViewImpl", "getDrawSizePoint : %s", new Object[] { this.gMj.toString() });
    Point localPoint = this.gMj;
    AppMethodBeat.o(76363);
    return localPoint;
  }

  public final int getFlashMode()
  {
    return this.gLX;
  }

  public final Point getPictureSize()
  {
    AppMethodBeat.i(76360);
    Point localPoint;
    if ((this.gLL != null) && (this.gLL.bPu()))
      if (!this.gLW)
      {
        localPoint = new Point(this.gLL.getPreviewWidth(), this.gLL.getPreviewHeight());
        AppMethodBeat.o(76360);
      }
    while (true)
    {
      return localPoint;
      asr();
      localPoint = this.gLY;
      AppMethodBeat.o(76360);
      continue;
      localPoint = null;
      AppMethodBeat.o(76360);
    }
  }

  public final Point getPreviewSize()
  {
    AppMethodBeat.i(76362);
    int j;
    if ((this.gLL.getOrientation() == 0) || (this.gLL.getOrientation() == 180))
    {
      i = 1;
      if (i == 0)
        break label104;
      j = this.gLL.getPreviewWidth();
      label43: if (i == 0)
        break label115;
    }
    label104: label115: for (int i = this.gLL.getPreviewHeight(); ; i = this.gLL.getPreviewWidth())
    {
      ab.i("MicroMsg.MMSightRecordViewImpl", "getPreviewSize : %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      Point localPoint = new Point(j, i);
      AppMethodBeat.o(76362);
      return localPoint;
      i = 0;
      break;
      j = this.gLL.getPreviewHeight();
      break label43;
    }
  }

  public final String getVideoFilePath()
  {
    AppMethodBeat.i(76352);
    String str;
    if ((this.gLK != null) && (this.gLT))
    {
      str = this.gLK.getFilePath();
      AppMethodBeat.o(76352);
    }
    while (true)
    {
      return str;
      str = this.videoPath;
      AppMethodBeat.o(76352);
    }
  }

  public final Point getVideoSize()
  {
    AppMethodBeat.i(76361);
    Point localPoint;
    if ((this.gLL != null) && (this.gLL.bPu()))
    {
      int i = this.gLL.getEncodeVideoBestSize().x;
      int j = this.gLL.getEncodeVideoBestSize().y;
      int k = j;
      int m = i;
      if (this.gLZ != null)
      {
        k = j;
        m = i;
        if (this.gLV)
        {
          m = this.gLZ.x;
          k = this.gLZ.y;
        }
      }
      m = (int)(m * this.gMg);
      k = (int)(k * this.gMg);
      localPoint = new Point(com.tencent.mm.plugin.mmsight.d.yP(m), com.tencent.mm.plugin.mmsight.d.yP(k));
      AppMethodBeat.o(76361);
    }
    while (true)
    {
      return localPoint;
      localPoint = null;
      AppMethodBeat.o(76361);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(76375);
    ab.i("MicroMsg.MMSightRecordViewImpl", "release, camera: %s, recorder: %s", new Object[] { this.gLL, this.gLK });
    if (this.gLL != null)
      this.gLL.bPq();
    if (this.gLK != null)
    {
      this.gLK.a(null);
      this.gLK.v(null);
      this.gLK = null;
    }
    if (this.gMi != null)
      this.gMi.release();
    this.gLT = false;
    this.gLV = false;
    this.gLW = false;
    this.gLY = null;
    this.gLZ = null;
    this.gLX = -1;
    this.gMa = true;
    this.gMb = true;
    com.tencent.mm.plugin.mmsight.model.a.j.owk.WY();
    AppMethodBeat.o(76375);
  }

  public final void setClipPictureSize(boolean paramBoolean)
  {
    AppMethodBeat.i(76368);
    this.gLW = paramBoolean;
    if ((this.gLW) && (this.gLL != null) && (this.gLL.bPu()))
      asr();
    AppMethodBeat.o(76368);
  }

  public final void setClipVideoSize(boolean paramBoolean)
  {
    AppMethodBeat.i(76366);
    this.gLV = paramBoolean;
    if ((this.gLV) && (this.gLL != null) && (this.gLL.bPu()))
      asq();
    AppMethodBeat.o(76366);
  }

  public final void setDisplayRatio(float paramFloat)
  {
    AppMethodBeat.i(76346);
    int i = asz();
    ab.i("MicroMsg.MMSightRecordViewImpl", "setDisplayRatio: %s, screenRotation: %s", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(i) });
    this.gLO = paramFloat;
    if ((i == 90) || (i == 270))
      this.gLO = (1.0F / this.gLO);
    AppMethodBeat.o(76346);
  }

  public final void setEnableDragZoom(boolean paramBoolean)
  {
    this.gMa = paramBoolean;
  }

  public final void setEnableTouchFocus(boolean paramBoolean)
  {
    this.gMb = paramBoolean;
  }

  public final void setFlashMode(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(76370);
    this.gLX = paramInt;
    e locale = this.gLL;
    if ((this.gLL != null) && (this.gLL.bPu()));
    while (true)
    {
      ab.i("MicroMsg.MMSightRecordViewImpl", "setFlashMode: %s, camera: %s, previewing: %s", new Object[] { Integer.valueOf(paramInt), locale, Boolean.valueOf(bool) });
      if ((this.gLL != null) && (this.gLL.bPu()))
        ass();
      AppMethodBeat.o(76370);
      return;
      bool = false;
    }
  }

  public final void setFrameDataCallback(MMSightRecordView.a parama)
  {
    this.gLU = parama;
  }

  public final void setInitDoneCallback(MMSightRecordView.c paramc)
  {
    this.gMe = paramc;
  }

  public final void setInitErrorCallback(MMSightRecordView.d paramd)
  {
    this.gMd = paramd;
  }

  public final void setPreviewSizeLimit(int paramInt)
  {
    AppMethodBeat.i(76347);
    ab.i("MicroMsg.MMSightRecordViewImpl", "setPreviewSizeLimit: %s", new Object[] { Integer.valueOf(paramInt) });
    this.gLM = paramInt;
    AppMethodBeat.o(76347);
  }

  public final void setRGBSizeLimit(int paramInt)
  {
    AppMethodBeat.i(76348);
    ab.i("MicroMsg.MMSightRecordViewImpl", "setRGBSizeLimit: %s", new Object[] { Integer.valueOf(paramInt) });
    this.gLN = paramInt;
    AppMethodBeat.o(76348);
  }

  public final void setUseBackCamera(boolean paramBoolean)
  {
    AppMethodBeat.i(76359);
    ab.i("MicroMsg.MMSightRecordViewImpl", "setUseBackCamera: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.gLQ = paramBoolean;
    AppMethodBeat.o(76359);
  }

  public final void setVideoFilePath(String paramString)
  {
    AppMethodBeat.i(76351);
    ab.i("MicroMsg.MMSightRecordViewImpl", "setVideoFilePath: %s", new Object[] { paramString });
    this.videoPath = paramString;
    AppMethodBeat.o(76351);
  }

  public final void setVideoPara$2e715812(int paramInt)
  {
    AppMethodBeat.i(76350);
    this.gLP = paramInt;
    this.videoBitrate = 4800000;
    this.fps = 30;
    this.fzS = 64000;
    this.audioSampleRate = 44100;
    ab.i("MicroMsg.MMSightRecordViewImpl", "setVideoPara, maxDuration: %s, videoBitrate: %s, fps: %s, audioBitrate: %s, audioSampleRate: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(4800000), Integer.valueOf(30), Integer.valueOf(64000), Integer.valueOf(44100) });
    AppMethodBeat.o(76350);
  }

  public final void startPreview()
  {
    AppMethodBeat.i(76349);
    ab.i("MicroMsg.MMSightRecordViewImpl", "startPreview, displayRatio: %s, previewSizeLimit: %s", new Object[] { Float.valueOf(this.gLO), Integer.valueOf(this.gLM) });
    if ((this.gLO > 0.0F) && (this.gLM > 0))
    {
      VideoTransPara localVideoTransPara = new VideoTransPara();
      localVideoTransPara.width = this.gLM;
      localVideoTransPara.height = ((int)(this.gLM / this.gLO));
      ab.i("MicroMsg.MMSightRecordViewImpl", "para width: %s, height: %s", new Object[] { Integer.valueOf(localVideoTransPara.width), Integer.valueOf(localVideoTransPara.height) });
      this.gLL = new e(localVideoTransPara, -1);
      this.gLL.a(this);
      if (!this.gLL.v(this.context, this.gLQ))
      {
        ab.i("MicroMsg.MMSightRecordViewImpl", "open camera failed!");
        if (this.gMd != null)
          this.gMd.aDo();
        AppMethodBeat.o(76349);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MMSightRecordViewImpl", "open camera finish");
      if (this.gLR.isAvailable())
      {
        if (this.gLL.a(this.gLR.getSurfaceTexture(), this.gLM, this.gLO, this.gLV) < 0)
        {
          ab.e("MicroMsg.MMSightRecordViewImpl", "start preview failed!");
          if (this.gMd != null)
            this.gMd.aDo();
        }
        if (this.gLX != -1)
          ass();
        this.gLL.bPn();
        ab.i("MicroMsg.MMSightRecordViewImpl", "do start preview directly");
        asp();
        asA();
        if (this.gMi != null)
          this.gMi.a(this.gLS.fag);
        AppMethodBeat.o(76349);
      }
      else
      {
        this.gLR.setTextureChangeCallback(new f.1(this));
        AppMethodBeat.o(76349);
      }
    }
  }

  public final void switchCamera()
  {
    AppMethodBeat.i(76365);
    if ((this.gLL != null) && (this.gLL.bPu()) && ((this.gLK == null) || (this.gLK.WL() != d.c.ovB)))
    {
      this.gLL.a(this.context, this.gLR.getSurfaceTexture(), this.gLM, this.gLO, this.gLV);
      if (this.gMi != null)
      {
        Point localPoint = getPreviewSize();
        this.gMi.h(localPoint.x, localPoint.y, this.gLL.getOrientation(), this.gMj.x, this.gMj.y);
      }
    }
    AppMethodBeat.o(76365);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.f
 * JD-Core Version:    0.6.2
 */