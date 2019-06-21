package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.a;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AppBrandCameraView extends RelativeLayout
  implements e, f.b, f.c, f.d
{
  private ImageView cAw;
  private String fcU;
  private Rect hGA;
  private int hGB;
  private c hGC;
  private b hGD;
  private MMSightRecordView hGE;
  private String hGF;
  private String hGG;
  int hGH;
  private boolean hGI;
  private long hGJ;
  private long hGK;
  private d hGL;
  private boolean hGM;
  MMSightRecordView.a hGN;
  private com.tencent.mm.plugin.appbrand.jsapi.e hGm;
  private String hGn;
  private int hGo;
  private AppBrandCameraView.a hGp;
  private int hGq;
  private String hGr;
  private String hGs;
  private String hGt;
  private boolean hGu;
  private boolean hGv;
  private int hGw;
  private int hGx;
  private int hGy;
  private int hGz;
  private String mAppId;
  private Context mContext;

  public AppBrandCameraView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(130937);
    this.hGn = "scanCode";
    this.hGr = "back";
    this.hGs = "auto";
    this.hGt = "high";
    this.hGv = false;
    this.hGw = 1080;
    this.hGx = 1920;
    this.hGy = 1080;
    this.hGz = 1920;
    this.hGH = -1;
    this.hGI = false;
    this.hGJ = -1L;
    this.hGK = -1L;
    this.hGN = new MMSightRecordView.a()
    {
      public final void q(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(130912);
        if (AppBrandCameraView.d(AppBrandCameraView.this) != null)
          AppBrandCameraView.d(AppBrandCameraView.this).q(paramAnonymousArrayOfByte, paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(130912);
      }
    };
    init(paramContext);
    AppMethodBeat.o(130937);
  }

  public AppBrandCameraView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(130938);
    this.hGn = "scanCode";
    this.hGr = "back";
    this.hGs = "auto";
    this.hGt = "high";
    this.hGv = false;
    this.hGw = 1080;
    this.hGx = 1920;
    this.hGy = 1080;
    this.hGz = 1920;
    this.hGH = -1;
    this.hGI = false;
    this.hGJ = -1L;
    this.hGK = -1L;
    this.hGN = new MMSightRecordView.a()
    {
      public final void q(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(130912);
        if (AppBrandCameraView.d(AppBrandCameraView.this) != null)
          AppBrandCameraView.d(AppBrandCameraView.this).q(paramAnonymousArrayOfByte, paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(130912);
      }
    };
    init(paramContext);
    AppMethodBeat.o(130938);
  }

  public AppBrandCameraView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(130939);
    this.hGn = "scanCode";
    this.hGr = "back";
    this.hGs = "auto";
    this.hGt = "high";
    this.hGv = false;
    this.hGw = 1080;
    this.hGx = 1920;
    this.hGy = 1080;
    this.hGz = 1920;
    this.hGH = -1;
    this.hGI = false;
    this.hGJ = -1L;
    this.hGK = -1L;
    this.hGN = new MMSightRecordView.a()
    {
      public final void q(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(130912);
        if (AppBrandCameraView.d(AppBrandCameraView.this) != null)
          AppBrandCameraView.d(AppBrandCameraView.this).q(paramAnonymousArrayOfByte, paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(130912);
      }
    };
    init(paramContext);
    AppMethodBeat.o(130939);
  }

  public static void aDc()
  {
    AppMethodBeat.i(130936);
    j.hHa = new AppBrandCameraView.1();
    AppMethodBeat.o(130936);
  }

  private void aDe()
  {
    AppMethodBeat.i(130952);
    ab.i("MicroMsg.AppBrandCameraView", "initCamera.");
    if (!a.a.aDb().aDa())
    {
      Toast.makeText(this.mContext, 2131301445, 1).show();
      ab.w("MicroMsg.AppBrandCameraView", "no permission");
      AppMethodBeat.o(130952);
    }
    while (true)
    {
      return;
      if (this.hGE == null)
        break;
      ab.i("MicroMsg.AppBrandCameraView", "initCamera recordView not null.");
      AppMethodBeat.o(130952);
    }
    if (this.cAw == null)
    {
      this.cAw = new ImageView(this.mContext);
      this.cAw.setScaleType(ImageView.ScaleType.FIT_XY);
      addView(this.cAw, new ViewGroup.LayoutParams(-1, -1));
    }
    while (true)
    {
      this.hGE = new MMSightRecordView(this.mContext);
      this.hGM = false;
      addView(this.hGE);
      this.hGE.setPreviewSizeLimit(720);
      this.hGE.setRGBSizeLimit(this.hGo);
      this.hGE.osY.asu();
      this.hGE.setDisplayRatio(this.hGw * 1.0F / this.hGx);
      this.hGE.setVideoPara$2e715812(600000);
      this.hGE.setVideoFilePath(this.hGF);
      this.hGE.setClipPictureSize(true);
      this.hGE.setClipVideoSize(true);
      this.hGE.setUseBackCamera("back".equals(this.hGr));
      this.hGE.setFrameDataCallback(this.hGN);
      this.hGE.setInitErrorCallback(new AppBrandCameraView.2(this));
      this.hGE.setInitDoneCallback(new AppBrandCameraView.3(this));
      this.hGE.osY.startPreview();
      this.hGE.osY.aso();
      this.hGH = 1;
      AppMethodBeat.o(130952);
      break;
      this.cAw.setImageBitmap(null);
    }
  }

  private void aDh()
  {
    AppMethodBeat.i(130956);
    this.fcU = (com.tencent.mm.compatible.util.e.euR + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" }));
    AppMethodBeat.o(130956);
  }

  private void aDi()
  {
    AppMethodBeat.i(130957);
    String str = "MicroMsg_" + System.currentTimeMillis();
    this.hGF = (com.tencent.mm.compatible.util.e.euR + str + ".mp4");
    this.hGG = (com.tencent.mm.compatible.util.e.euR + str + ".jpeg");
    if (this.hGE != null)
      this.hGE.setVideoFilePath(this.hGF);
    AppMethodBeat.o(130957);
  }

  private void aDj()
  {
    AppMethodBeat.i(130958);
    if ((this.hGE == null) || (this.hGs == null))
      AppMethodBeat.o(130958);
    while (true)
    {
      return;
      if (this.hGs.equals("auto"))
      {
        this.hGE.setFlashMode(3);
        AppMethodBeat.o(130958);
      }
      else if (this.hGs.equals("torch"))
      {
        this.hGE.setFlashMode(1);
        AppMethodBeat.o(130958);
      }
      else if (this.hGs.equals("on"))
      {
        if ((this.hGH == 2) || (this.hGH == 4) || (!this.hGs.equals("on")))
        {
          this.hGE.setFlashMode(1);
          AppMethodBeat.o(130958);
        }
      }
      else if (this.hGs.equals("torch"))
      {
        this.hGE.setFlashMode(1);
        AppMethodBeat.o(130958);
      }
      else
      {
        this.hGE.setFlashMode(2);
        AppMethodBeat.o(130958);
      }
    }
  }

  private void aDk()
  {
    AppMethodBeat.i(130959);
    ab.i("MicroMsg.AppBrandCameraView", "setCameraMode mode:%s", new Object[] { this.hGn });
    aDl();
    if ((!bo.isNullOrNil(this.hGn)) && (this.hGn.equals("scanCode")));
    for (this.hGp = new AppBrandCameraView.c(this, (byte)0); ; this.hGp = new b((byte)0))
    {
      this.hGp.init();
      AppMethodBeat.o(130959);
      return;
    }
  }

  private void aDl()
  {
    AppMethodBeat.i(130960);
    if (this.hGp != null)
    {
      this.hGp.release();
      this.hGp = null;
    }
    AppMethodBeat.o(130960);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(130940);
    this.mContext = paramContext;
    LayoutInflater.from(paramContext).inflate(2130968665, this);
    AppMethodBeat.o(130940);
  }

  public final void aDd()
  {
    AppMethodBeat.i(130951);
    if (this.hGp != null)
      this.hGp.aDd();
    AppMethodBeat.o(130951);
  }

  public final void aDf()
  {
    AppMethodBeat.i(130953);
    if (this.hGE == null)
    {
      ab.i("MicroMsg.AppBrandCameraView", "recordView is null");
      AppMethodBeat.o(130953);
    }
    while (true)
    {
      return;
      aDk();
      aDj();
      AppMethodBeat.o(130953);
    }
  }

  public final void aDg()
  {
    AppMethodBeat.i(130955);
    if (this.hGC == null)
      AppMethodBeat.o(130955);
    while (true)
    {
      return;
      if (this.hGL == null)
      {
        AppMethodBeat.o(130955);
      }
      else
      {
        this.hGL.a(this.hGE);
        this.hGL = null;
        AppMethodBeat.o(130955);
      }
    }
  }

  public final void aDm()
  {
    AppMethodBeat.i(130963);
    if (this.hGp != null)
      this.hGp.aDm();
    AppMethodBeat.o(130963);
  }

  public final void aDn()
  {
    AppMethodBeat.i(130964);
    if (this.hGp != null)
      this.hGp.aDn();
    AppMethodBeat.o(130964);
  }

  public final void ai(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(130943);
    if (bo.isEqual(this.hGr, paramString))
      AppMethodBeat.o(130943);
    while (true)
    {
      return;
      if (bo.isEqual(this.hGn, "scanCode"))
      {
        AppMethodBeat.o(130943);
      }
      else
      {
        this.hGr = paramString;
        if ((!paramBoolean) && (this.hGE != null))
          this.hGE.osY.switchCamera();
        AppMethodBeat.o(130943);
      }
    }
  }

  public final boolean da(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(130946);
    boolean bool;
    if ((this.hGw == paramInt1) && (this.hGx == paramInt2))
    {
      bool = false;
      AppMethodBeat.o(130946);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.AppBrandCameraView", "setViewSize");
      this.hGw = paramInt1;
      this.hGx = paramInt2;
      bool = true;
      AppMethodBeat.o(130946);
    }
  }

  public int getCameraId()
  {
    return this.hGq;
  }

  public View getView()
  {
    return this;
  }

  public final void initView()
  {
    AppMethodBeat.i(130941);
    ab.i("MicroMsg.AppBrandCameraView", "initView");
    if (!a.a.aDb().aDa())
      AppMethodBeat.o(130941);
    while (true)
    {
      return;
      aDi();
      aDh();
      aDe();
      aDf();
      AppMethodBeat.o(130941);
    }
  }

  public final void n(com.tencent.mm.plugin.appbrand.jsapi.c paramc)
  {
    AppMethodBeat.i(130954);
    if (this.hGC == null)
      AppMethodBeat.o(130954);
    while (true)
    {
      return;
      if (this.hGE == null)
      {
        ab.w("MicroMsg.AppBrandCameraView", "listenFrameChange recordView null");
        this.hGC.g("camera illegal state", -1, -1, -1);
        AppMethodBeat.o(130954);
      }
      else
      {
        if (this.hGL == null)
          this.hGL = new d(paramc);
        int i = this.hGE.getDrawSizePoint().x;
        int j = this.hGE.getDrawSizePoint().y;
        paramc = this.hGL;
        MMSightRecordView localMMSightRecordView = this.hGE;
        if (localMMSightRecordView == null)
          ab.w("MicroMsg.FrameDataCallbackHelper", "listenFrameChange recordView null");
        for (int k = -1; ; k = paramc.hGW)
        {
          if (k >= 0)
            break label291;
          this.hGC.g("camera illegal state", -1, -1, -1);
          AppMethodBeat.o(130954);
          break;
          if (paramc.hGW != -2147483648)
          {
            ab.i("MicroMsg.FrameDataCallbackHelper", "listenFrameChange destroy last one bufferId:%d", new Object[] { Integer.valueOf(paramc.hGW) });
            paramc.hGU.oQ(paramc.hGW);
          }
          paramc.hGW = paramc.hGU.oS(i * j * 4);
          ab.i("MicroMsg.FrameDataCallbackHelper", "listenFrameChange bufferId:%d height:%d width:%d", new Object[] { Integer.valueOf(paramc.hGW), Integer.valueOf(j), Integer.valueOf(i) });
          paramc.hGV = true;
          localMMSightRecordView.a(paramc.hGU.oR(paramc.hGW), paramc);
        }
        label291: this.hGC.g(null, k, i, j);
        AppMethodBeat.o(130954);
      }
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(130949);
    if (this.hGL != null)
      this.hGL.a(this.hGE);
    release();
    AppMethodBeat.o(130949);
  }

  public final void release()
  {
    AppMethodBeat.i(130950);
    ab.i("MicroMsg.AppBrandCameraView", "release");
    try
    {
      if (this.hGE != null)
      {
        this.hGE.osY.release();
        removeView(this.hGE);
        this.hGH = -1;
        this.hGE = null;
      }
      aDl();
      AppMethodBeat.o(130950);
      return;
    }
    finally
    {
      AppMethodBeat.o(130950);
    }
  }

  public void setAppId(String paramString)
  {
    this.mAppId = paramString;
  }

  public void setCameraId(int paramInt)
  {
    this.hGq = paramInt;
  }

  public void setFlash(String paramString)
  {
    AppMethodBeat.i(130944);
    if (bo.isEqual(this.hGs, paramString))
      AppMethodBeat.o(130944);
    while (true)
    {
      return;
      this.hGs = paramString;
      AppMethodBeat.o(130944);
    }
  }

  public void setFrameLimitSize(int paramInt)
  {
    AppMethodBeat.i(130942);
    ab.i("MicroMsg.AppBrandCameraView", "setFrameLimitSize:%d", new Object[] { Integer.valueOf(paramInt) });
    this.hGo = paramInt;
    AppMethodBeat.o(130942);
  }

  public void setMode(String paramString)
  {
    this.hGn = paramString;
  }

  public void setNeedOutput(boolean paramBoolean)
  {
    this.hGu = paramBoolean;
  }

  public void setOperateCallBack(c paramc)
  {
    this.hGC = paramc;
  }

  public void setOutPutCallBack(b paramb)
  {
    this.hGD = paramb;
  }

  public void setPage(com.tencent.mm.plugin.appbrand.jsapi.e parame)
  {
    this.hGm = parame;
  }

  public void setQuality(String paramString)
  {
    AppMethodBeat.i(130945);
    if (bo.isEqual(this.hGt, paramString))
      AppMethodBeat.o(130945);
    while (true)
    {
      return;
      this.hGt = paramString;
      AppMethodBeat.o(130945);
    }
  }

  public void setScanFreq(int paramInt)
  {
    AppMethodBeat.i(130961);
    ab.i("MicroMsg.AppBrandCameraView", "scanFreq:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      ab.e("MicroMsg.AppBrandCameraView", "scanFreq is err");
      AppMethodBeat.o(130961);
    }
    while (true)
    {
      return;
      this.hGB = paramInt;
      AppMethodBeat.o(130961);
    }
  }

  public final void w(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(130962);
    ab.i("MicroMsg.AppBrandCameraView", "x:%d, y:%d, w:%d, h:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if ((paramInt3 <= 0) || (paramInt4 <= 0))
      AppMethodBeat.o(130962);
    while (true)
    {
      return;
      this.hGA = new Rect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
      AppMethodBeat.o(130962);
    }
  }

  public final void wU()
  {
    AppMethodBeat.i(130948);
    ab.i("MicroMsg.AppBrandCameraView", "onUIResume");
    while (true)
    {
      d locald;
      try
      {
        aDe();
        aDk();
        aDj();
        if (this.hGL != null)
        {
          locald = this.hGL;
          MMSightRecordView localMMSightRecordView = this.hGE;
          ab.i("MicroMsg.FrameDataCallbackHelper", "onUIResume mNeedCallback:%b", new Object[] { Boolean.valueOf(locald.hGV) });
          if (locald.hGV)
          {
            if (localMMSightRecordView != null)
              continue;
            ab.w("MicroMsg.FrameDataCallbackHelper", "onUIResume recordView null");
          }
        }
        return;
        if (locald.hGW == -2147483648)
        {
          ab.w("MicroMsg.FrameDataCallbackHelper", "onUIResume invalid mCurrentSharedBufferId");
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(130948);
      }
      if (locald.hGU == null)
        ab.w("MicroMsg.FrameDataCallbackHelper", "onUIResume mSharedBufferAddon null");
      else
        localObject.a(locald.hGU.oR(locald.hGW), locald);
    }
  }

  public final void wW()
  {
    AppMethodBeat.i(130947);
    ab.i("MicroMsg.AppBrandCameraView", "onUIPause");
    Object localObject;
    if (this.hGH == 2)
    {
      ab.d("MicroMsg.AppBrandCameraView", "onStopRecord fromOnPause");
      localObject = new HashMap();
      ((Map)localObject).put("cameraId", Integer.valueOf(this.hGq));
      ((Map)localObject).put("errMsg", "stop on record");
      localObject = new JSONObject((Map)localObject).toString();
      new k().j(this.hGm).AM((String)localObject).aCj();
    }
    if (this.hGE != null)
    {
      localObject = this.hGE.getCurrentFramePicture();
      if (localObject != null)
        this.cAw.setImageBitmap((Bitmap)localObject);
    }
    if (this.hGL != null)
    {
      d locald = this.hGL;
      localObject = this.hGE;
      ab.i("MicroMsg.FrameDataCallbackHelper", "onUIPause mNeedCallback:%b", new Object[] { Boolean.valueOf(locald.hGV) });
      if (localObject != null)
        break label250;
      ab.w("MicroMsg.FrameDataCallbackHelper", "onUIPause recordView null");
    }
    while (true)
    {
      release();
      localObject = new HashMap();
      ((Map)localObject).put("cameraId", Integer.valueOf(getCameraId()));
      localObject = new JSONObject((Map)localObject).toString();
      new i().j(this.hGm).AM((String)localObject).aCj();
      AppMethodBeat.o(130947);
      return;
      label250: ((MMSightRecordView)localObject).a(null, null);
    }
  }

  final class b
    implements AppBrandCameraView.a
  {
    private b()
    {
    }

    private void Q(int paramInt, String paramString)
    {
      AppMethodBeat.i(130921);
      if (AppBrandCameraView.q(AppBrandCameraView.this) != null)
        AppBrandCameraView.q(AppBrandCameraView.this).Q(paramInt, paramString);
      AppMethodBeat.o(130921);
    }

    private void d(int paramInt, String paramString1, String paramString2, String paramString3)
    {
      AppMethodBeat.i(130923);
      if (AppBrandCameraView.q(AppBrandCameraView.this) != null)
        AppBrandCameraView.q(AppBrandCameraView.this).d(paramInt, paramString1, g(AppBrandCameraView.b(AppBrandCameraView.this), paramString2), g(AppBrandCameraView.b(AppBrandCameraView.this), paramString3));
      AppBrandCameraView.p(AppBrandCameraView.this);
      AppMethodBeat.o(130923);
    }

    static String g(com.tencent.mm.plugin.appbrand.jsapi.c paramc, String paramString)
    {
      AppMethodBeat.i(130925);
      if (bo.isNullOrNil(paramString))
        AppMethodBeat.o(130925);
      while (true)
      {
        return paramString;
        com.tencent.mm.plugin.appbrand.r.j localj = new com.tencent.mm.plugin.appbrand.r.j();
        if (paramc.asE().a(new File(paramString), "", true, localj) == com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
        {
          paramString = (String)localj.value;
          AppMethodBeat.o(130925);
        }
        else
        {
          paramString = null;
          AppMethodBeat.o(130925);
        }
      }
    }

    final boolean a(Bitmap paramBitmap, String paramString)
    {
      boolean bool1 = true;
      AppMethodBeat.i(130919);
      if ((paramBitmap != null) && (!paramBitmap.isRecycled()));
      while (true)
      {
        try
        {
          AppBrandCameraView.b(AppBrandCameraView.this, paramBitmap.getWidth());
          AppBrandCameraView.c(AppBrandCameraView.this, paramBitmap.getHeight());
          int i = 90;
          if ("normal".equals(AppBrandCameraView.n(AppBrandCameraView.this)))
          {
            i = 44;
            com.tencent.mm.sdk.platformtools.d.a(paramBitmap, i, Bitmap.CompressFormat.JPEG, paramString, true);
            ab.i("MicroMsg.AppBrandCameraView", "bitmap filelen %s", new Object[] { Long.valueOf(com.tencent.mm.vfs.e.asZ(paramString)) });
            AppMethodBeat.o(130919);
            return bool1;
          }
          boolean bool2 = "low".equals(AppBrandCameraView.n(AppBrandCameraView.this));
          if (!bool2)
            continue;
          i = 25;
          continue;
        }
        catch (Exception paramBitmap)
        {
          ab.e("MicroMsg.AppBrandCameraView", "error for saveBitmapToImage %s", new Object[] { paramBitmap.getMessage() });
        }
        AppMethodBeat.o(130919);
        bool1 = false;
      }
    }

    public final void aDd()
    {
      AppMethodBeat.i(130918);
      ab.i("MicroMsg.AppBrandCameraView", "takePicture.");
      if (AppBrandCameraView.f(AppBrandCameraView.this) == null)
      {
        ab.i("MicroMsg.AppBrandCameraView", "recordView is null");
        AppMethodBeat.o(130918);
      }
      while (true)
      {
        return;
        if (AppBrandCameraView.g(AppBrandCameraView.this) == 2)
        {
          ab.w("MicroMsg.AppBrandCameraView", "takePicture is recording!!");
          AppMethodBeat.o(130918);
        }
        else if ((AppBrandCameraView.h(AppBrandCameraView.this)) || (bo.az(AppBrandCameraView.i(AppBrandCameraView.this)) < 300L))
        {
          ab.i("MicroMsg.AppBrandCameraView", "not the right time to take picture.");
          AppMethodBeat.o(130918);
        }
        else if (!AppBrandCameraView.j(AppBrandCameraView.this))
        {
          ab.w("MicroMsg.AppBrandCameraView", "takePicture err, isn't init done");
          AppBrandCameraView.a(AppBrandCameraView.this, -1, null, "camera has not been initialized");
          AppMethodBeat.o(130918);
        }
        else
        {
          AppBrandCameraView.a(AppBrandCameraView.this, bo.yz());
          AppBrandCameraView.k(AppBrandCameraView.this);
          AppBrandCameraView.a(AppBrandCameraView.this, 3);
          AppBrandCameraView.f(AppBrandCameraView.this).a(new AppBrandCameraView.b.1(this), "on".equals(AppBrandCameraView.m(AppBrandCameraView.this)));
          AppMethodBeat.o(130918);
        }
      }
    }

    public final void aDm()
    {
      AppMethodBeat.i(130920);
      ab.i("MicroMsg.AppBrandCameraView", "startRecord.");
      a locala = a.a.aDb();
      if ((!locala.hGi) || (!locala.hGj))
        ab.i("MicroMsg.AppBrandCameraMrg", "no all permission");
      int i;
      if ((locala.hGi) && (locala.hGj))
      {
        i = 1;
        if (i != 0)
          break label103;
        Toast.makeText(AppBrandCameraView.o(AppBrandCameraView.this), 2131301445, 1).show();
        ab.w("MicroMsg.AppBrandCameraView", "no micro phone permission");
        Q(-1, "permission");
        AppMethodBeat.o(130920);
      }
      while (true)
      {
        return;
        i = 0;
        break;
        label103: if (AppBrandCameraView.g(AppBrandCameraView.this) == 2)
        {
          ab.w("MicroMsg.AppBrandCameraView", "startRecord is recording!!");
          Q(-1, "is recording");
          AppMethodBeat.o(130920);
        }
        else if (!AppBrandCameraView.j(AppBrandCameraView.this))
        {
          ab.w("MicroMsg.AppBrandCameraView", "startRecord err, isn't init done");
          Q(-1, "camera has not been initialized");
          AppMethodBeat.o(130920);
        }
        else if (AppBrandCameraView.f(AppBrandCameraView.this).osY.EL())
        {
          AppBrandCameraView.b(AppBrandCameraView.this, bo.yz());
          AppBrandCameraView.a(AppBrandCameraView.this, 2);
          Q(0, "");
          AppBrandCameraView.p(AppBrandCameraView.this);
          AppMethodBeat.o(130920);
        }
        else
        {
          ab.w("MicroMsg.AppBrandCameraView", "startRecord fail !!");
          Q(-1, "startRecord fail");
          AppMethodBeat.o(130920);
        }
      }
    }

    public final void aDn()
    {
      AppMethodBeat.i(130924);
      long l = bo.az(AppBrandCameraView.w(AppBrandCameraView.this));
      if (l < 1500L)
      {
        ab.i("MicroMsg.AppBrandCameraView", "stopRecord in %d ms later", new Object[] { Long.valueOf(1500L - l) });
        al.n(new AppBrandCameraView.b.3(this), 1500L - l);
        AppMethodBeat.o(130924);
      }
      while (true)
      {
        return;
        stopRecord();
        AppMethodBeat.o(130924);
      }
    }

    public final void init()
    {
    }

    public final void q(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(130917);
      if (!AppBrandCameraView.e(AppBrandCameraView.this))
        AppMethodBeat.o(130917);
      while (true)
      {
        return;
        AppMethodBeat.o(130917);
      }
    }

    public final void release()
    {
    }

    public final void stopRecord()
    {
      AppMethodBeat.i(130922);
      ab.i("MicroMsg.AppBrandCameraView", "stopRecord");
      if (AppBrandCameraView.f(AppBrandCameraView.this) == null)
      {
        ab.i("MicroMsg.AppBrandCameraView", "recordView is null");
        d(-1, "camera is null", null, null);
        AppMethodBeat.o(130922);
      }
      while (true)
      {
        return;
        if (AppBrandCameraView.g(AppBrandCameraView.this) != 2)
        {
          ab.w("MicroMsg.AppBrandCameraView", "stopRecord is not recording!!");
          d(-1, "is not recording", null, null);
          AppMethodBeat.o(130922);
        }
        else if (AppBrandCameraView.r(AppBrandCameraView.this))
        {
          ab.i("MicroMsg.AppBrandCameraView", "recordView is IsStopping");
          d(-1, "is stopping", null, null);
          AppMethodBeat.o(130922);
        }
        else
        {
          AppBrandCameraView.a(AppBrandCameraView.this, true);
          AppBrandCameraView.f(AppBrandCameraView.this).a(new AppBrandCameraView.b.2(this));
          AppMethodBeat.o(130922);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView
 * JD-Core Version:    0.6.2
 */