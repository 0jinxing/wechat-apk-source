package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnErrorListener;
import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends com.tencent.mm.plugin.appbrand.e.e
{
  boolean hLW;
  boolean hLX;
  com.tencent.mm.plugin.appbrand.jsapi.u.b.b.c idR;
  g idS;
  f idT;
  h idU;
  private e idV;
  private com.tencent.mm.plugin.appbrand.jsapi.e idW;
  private f.d idX;
  private f.b idY;
  private f.c idZ;
  boolean iea;
  boolean ieb;
  boolean iec;
  boolean ied;
  boolean iee;
  boolean ief;
  private boolean ieg;
  boolean ieh;
  private boolean iei;
  private int iej;
  private int iek;
  int iel;
  int iem;
  private String ien;
  private String ieo;
  private String iep;
  boolean ieq;
  boolean ier;
  private final ConcurrentLinkedQueue<Runnable> ies;
  private Surface mSurface;
  private SurfaceTexture mSurfaceTexture;
  int mVideoHeight;
  int mVideoWidth;

  public c()
  {
    AppMethodBeat.i(117400);
    this.ieh = false;
    this.iei = false;
    this.iem = 0;
    this.ies = new ConcurrentLinkedQueue();
    aGG();
    AppMethodBeat.o(117400);
  }

  private void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, m paramm, int paramInt)
  {
    try
    {
      AppMethodBeat.i(117414);
      release();
      paramc.M(paramInt, paramm.j("ok", null));
      AppMethodBeat.o(117414);
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }

  private void aGG()
  {
    AppMethodBeat.i(117401);
    this.idR = new com.tencent.mm.plugin.appbrand.jsapi.u.b.b.a();
    this.idR.setOnInfoListener(new c.1(this));
    this.idR.setOnErrorListener(new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(117392);
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler onError, what:%d, extra:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (c.this.idT != null)
        {
          c.this.idT.dh(paramAnonymousInt1, paramAnonymousInt2);
          if (c.this.idU != null)
          {
            if (paramAnonymousInt1 != -1024)
              break label93;
            c.this.idU.gq(-paramAnonymousInt2);
          }
        }
        while (true)
        {
          AppMethodBeat.o(117392);
          return false;
          label93: c.this.idU.gq(41L);
        }
      }
    });
    this.idR.setOnPreparedListener(new c.7(this));
    this.idR.setOnCompletionListener(new c.8(this));
    this.idR.setOnSeekCompleteListener(new c.9(this));
    this.idR.setOnVideoSizeChangedListener(new c.10(this));
    this.idR.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener()
    {
      public final void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
      {
        AppMethodBeat.i(117397);
        if (paramAnonymousInt != c.this.iem)
        {
          c.this.iem = paramAnonymousInt;
          ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler onBufferingUpdate, percent:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        }
        if ((c.this.aGN()) && (c.this.iea))
          c.this.idS.oJ(paramAnonymousInt);
        AppMethodBeat.o(117397);
      }
    });
    this.idV = new e();
    this.idU = new d();
    this.idT = new a(this, new f.a()
    {
      public final void I(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(117398);
        ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler send video error event, what:%d, extra:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (c.this.aGN())
          c.this.idS.I(paramAnonymousString, paramAnonymousInt1, paramAnonymousInt2);
        if (c.this.idU != null)
          c.this.idU.gq(0L);
        AppMethodBeat.o(117398);
      }
    });
    AppMethodBeat.o(117401);
  }

  private void aGI()
  {
    AppMethodBeat.i(117405);
    synchronized (this.ies)
    {
      if (this.ies.isEmpty())
        break label97;
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler flushPendingTasks, size:%d", new Object[] { Integer.valueOf(this.ies.size()) });
      Iterator localIterator = this.ies.iterator();
      if (localIterator.hasNext())
        ((Runnable)localIterator.next()).run();
    }
    this.ies.clear();
    label97: AppMethodBeat.o(117405);
  }

  private void aGL()
  {
    AppMethodBeat.i(117416);
    if (this.idW != null)
    {
      if (this.idX != null)
      {
        this.idW.b(this.idX);
        this.idX = null;
      }
      if (this.idY != null)
      {
        this.idW.b(this.idY);
        this.idY = null;
      }
      if (this.idZ != null)
      {
        this.idW.b(this.idZ);
        this.idZ = null;
      }
    }
    AppMethodBeat.o(117416);
  }

  private void aGM()
  {
    try
    {
      AppMethodBeat.i(117422);
      if (this.idR != null)
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler resetMediaPlayer, clear media player");
        this.idR.setOnInfoListener(null);
        this.idR.setOnErrorListener(null);
        this.idR.setOnPreparedListener(null);
        this.idR.setOnCompletionListener(null);
        this.idR.setOnSeekCompleteListener(null);
        this.idR.setOnVideoSizeChangedListener(null);
        this.idR.stop();
        this.idR.reset();
        this.idR.release();
      }
      this.idR = null;
      try
      {
        if ((this.mSurfaceTexture != null) && (this.iea))
        {
          ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler clearSurfaceTexture");
          Object localObject1 = this.mSurfaceTexture;
          EGL10 localEGL10 = (EGL10)EGLContext.getEGL();
          EGLDisplay localEGLDisplay = localEGL10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
          localEGL10.eglInitialize(localEGLDisplay, null);
          Object localObject3 = new EGLConfig[1];
          int[] arrayOfInt = new int[1];
          localEGL10.eglChooseConfig(localEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344 }, (EGLConfig[])localObject3, 1, arrayOfInt);
          arrayOfInt = localObject3[0];
          localObject3 = localEGL10.eglCreateContext(localEGLDisplay, arrayOfInt, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
          localObject1 = localEGL10.eglCreateWindowSurface(localEGLDisplay, arrayOfInt, localObject1, new int[] { 12344 });
          localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject1, (EGLSurface)localObject1, (EGLContext)localObject3);
          GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
          GLES20.glClear(16384);
          localEGL10.eglSwapBuffers(localEGLDisplay, (EGLSurface)localObject1);
          localEGL10.eglDestroySurface(localEGLDisplay, (EGLSurface)localObject1);
          localObject1 = EGL10.EGL_NO_SURFACE;
          localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject1, (EGLSurface)localObject1, EGL10.EGL_NO_CONTEXT);
          localEGL10.eglDestroyContext(localEGLDisplay, (EGLContext)localObject3);
          localEGL10.eglTerminate(localEGLDisplay);
        }
        aGG();
        if (this.idR != null)
        {
          this.idR.setMute(this.iei);
          this.idR.setLooping(this.ieh);
          this.idR.eu(this.ief);
          if (this.mSurface != null)
            this.idR.setSurface(this.mSurface);
        }
        AppMethodBeat.o(117422);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler clearSurfaceTexture error", new Object[] { localException });
      }
    }
    finally
    {
    }
  }

  private void b(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, m paramm, int paramInt)
  {
    int i = 1;
    while (true)
    {
      try
      {
        AppMethodBeat.i(117412);
        if (this.idR == null)
        {
          ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler update, media player is null");
          paramc.M(paramInt, paramm.j("fail", null));
          AppMethodBeat.o(117412);
          return;
        }
        if (!paramJSONObject.has("filePath"))
          break label607;
        Object localObject = l(paramc, paramJSONObject.optString("filePath"));
        if ((bo.isNullOrNil((String)localObject)) || (((String)localObject).equalsIgnoreCase(this.ien)) || (this.idR == null))
          break label607;
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler update, path:%s", new Object[] { localObject });
        if (!bo.isNullOrNil(this.ien))
          aGM();
        this.ien = ((String)localObject);
        this.idR.setDataSource(this.ien);
        if ((paramJSONObject.has("autoplay")) && (this.idR != null))
        {
          this.ief = paramJSONObject.optBoolean("autoplay", false);
          this.idR.eu(this.ief);
        }
        if (paramJSONObject.has("initialTime"))
        {
          double d = paramJSONObject.optDouble("initialTime", 0.0D);
          if (d > 0.0D)
            this.idR.oM((int)(d * 1000.0D));
        }
        if (paramJSONObject.has("loop"))
        {
          this.ieh = paramJSONObject.optBoolean("loop", false);
          this.idR.setLooping(this.ieh);
        }
        if (paramJSONObject.has("muted"))
        {
          this.iei = paramJSONObject.optBoolean("muted", false);
          this.idR.setMute(this.iei);
        }
        if (paramJSONObject.has("autoPauseIfNavigate"))
          this.hLW = paramJSONObject.optBoolean("autoPauseIfNavigate", true);
        if (paramJSONObject.has("autoPauseIfOpenNative"))
          this.hLX = paramJSONObject.optBoolean("autoPauseIfOpenNative", true);
        if (paramJSONObject.has("needEvent"))
        {
          this.ieg = paramJSONObject.optBoolean("needEvent", false);
          if (!this.ieg)
            break label599;
          localObject = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b;
          ((b)localObject).<init>(this, paramc);
          this.idS = ((g)localObject);
          if (paramJSONObject.has("data"))
          {
            localObject = paramJSONObject.optString("data", "");
            this.idS.Cd((String)localObject);
          }
        }
        if (paramJSONObject.has("position"))
        {
          localObject = paramJSONObject.optJSONObject("position");
          if (localObject != null)
          {
            this.iej = ((JSONObject)localObject).optInt("width", 0);
            this.iek = ((JSONObject)localObject).optInt("height", 0);
            ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler update, position:[%d, %d]", new Object[] { Integer.valueOf(this.iej), Integer.valueOf(this.iek) });
          }
          aGH();
        }
        if (paramJSONObject.has("objectFit"))
        {
          this.ieo = paramJSONObject.optString("objectFit", "contain");
          if (bo.isNullOrNil(this.ieo))
            this.ieo = "contain";
          aGH();
        }
        if (i != 0)
          prepareAsync();
        paramc.M(paramInt, paramm.j("ok", null));
        AppMethodBeat.o(117412);
        continue;
      }
      finally
      {
      }
      label599: this.idS = null;
      continue;
      label607: i = 0;
    }
  }

  private void c(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, m paramm, int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(117411);
        if (this.idR == null)
        {
          ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler insert, media player is null");
          paramc.M(paramInt, paramm.j("fail", null));
          AppMethodBeat.o(117411);
          return;
        }
        Object localObject;
        if ((paramc instanceof com.tencent.mm.plugin.appbrand.jsapi.e))
        {
          this.idW = ((com.tencent.mm.plugin.appbrand.jsapi.e)paramc);
          localObject = new com/tencent/mm/plugin/appbrand/jsapi/u/b/c$3;
          ((c.3)localObject).<init>(this);
          this.idX = ((f.d)localObject);
          localObject = new com/tencent/mm/plugin/appbrand/jsapi/u/b/c$4;
          ((c.4)localObject).<init>(this, paramc);
          this.idY = ((f.b)localObject);
          localObject = new com/tencent/mm/plugin/appbrand/jsapi/u/b/c$5;
          ((c.5)localObject).<init>(this);
          this.idZ = ((f.c)localObject);
          this.idW.a(this.idX);
          this.idW.a(this.idY);
          this.idW.a(this.idZ);
        }
        this.ief = paramJSONObject.optBoolean("autoplay", false);
        this.idR.eu(this.ief);
        double d = paramJSONObject.optDouble("initialTime", 0.0D);
        if (d > 0.0D)
          this.idR.oM((int)(d * 1000.0D));
        this.ieh = paramJSONObject.optBoolean("loop", false);
        this.idR.setLooping(this.ieh);
        this.iei = paramJSONObject.optBoolean("muted", false);
        this.idR.setMute(this.iei);
        this.hLW = paramJSONObject.optBoolean("autoPauseIfNavigate", true);
        this.hLX = paramJSONObject.optBoolean("autoPauseIfOpenNative", true);
        this.ieg = paramJSONObject.optBoolean("needEvent", false);
        if (this.ieg)
        {
          localObject = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b;
          ((b)localObject).<init>(this, paramc);
          this.idS = ((g)localObject);
          localObject = paramJSONObject.optString("data", "");
          this.idS.Cd((String)localObject);
          if (paramJSONObject.has("position"))
          {
            localObject = paramJSONObject.optJSONObject("position");
            if (localObject != null)
            {
              this.iej = ((JSONObject)localObject).optInt("width", 0);
              this.iek = ((JSONObject)localObject).optInt("height", 0);
              ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler insert, position:[%d, %d]", new Object[] { Integer.valueOf(this.iej), Integer.valueOf(this.iek) });
            }
          }
          this.ieo = paramJSONObject.optString("objectFit", "contain");
          if (bo.isNullOrNil(this.ieo))
            this.ieo = "contain";
          aGH();
          this.ien = paramJSONObject.optString("filePath");
          this.ien = l(paramc, this.ien);
          if ((!bo.isNullOrNil(this.ien)) && (this.idR != null))
          {
            ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler insert, path:%s", new Object[] { this.ien });
            this.idR.setDataSource(this.ien);
            prepareAsync();
          }
          paramc.M(paramInt, paramm.j("ok", null));
          AppMethodBeat.o(117411);
          continue;
        }
      }
      finally
      {
      }
      this.idS = null;
    }
  }

  private void d(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, m paramm, int paramInt)
  {
    u localu = null;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = false;
    String str;
    boolean bool4;
    while (true)
    {
      try
      {
        AppMethodBeat.i(117415);
        if (this.idR == null)
        {
          ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler operate, media player is null");
          paramc.M(paramInt, paramm.j("fail", null));
          AppMethodBeat.o(117415);
          return;
        }
        str = paramJSONObject.optString("type");
        bool4 = bool3;
        if (!bo.isNullOrNil(str))
        {
          ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler operate, type:%s", new Object[] { str });
          if (str.equalsIgnoreCase("play"))
          {
            oL(25);
            bool4 = play();
          }
        }
        else
        {
          if (!bool4)
            break label956;
          paramJSONObject = "ok";
          label129: paramc.M(paramInt, paramm.j(paramJSONObject, null));
          AppMethodBeat.o(117415);
          continue;
        }
      }
      finally
      {
      }
      if (str.equalsIgnoreCase("pause"))
      {
        oL(26);
        bool4 = pause();
      }
      else
      {
        if (str.equalsIgnoreCase("stop"))
        {
          oL(27);
          if (this.idR != null)
          {
            ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "video stop");
            this.idR.stop();
            if (aGN())
              this.idS.onVideoPause();
          }
          for (bool4 = true; ; bool4 = false)
            break;
        }
        label317: label323: double d;
        if (str.equalsIgnoreCase("seek"))
        {
          oL(28);
          if ((this.idR != null) && (paramJSONObject != null) && (paramJSONObject.has("data")))
          {
            paramJSONObject = paramJSONObject.optJSONArray("data");
            if ((paramJSONObject != null) && (paramJSONObject.length() != 0))
              break label323;
            ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler seek, data array is null");
          }
          for (bool4 = false; ; bool4 = bool2)
          {
            break;
            d = paramJSONObject.optDouble(0, -1.0D);
            if (d < 0.0D)
            {
              ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler seek, invalid position:%s", new Object[] { Double.valueOf(d) });
              break label317;
            }
            ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler seek, position:%s", new Object[] { Double.valueOf(d) });
            seek((int)(1000.0D * d));
          }
        }
        if (str.equalsIgnoreCase("playbackRate"))
        {
          oL(29);
          bool4 = bool3;
          if (this.idR != null)
          {
            bool4 = bool3;
            if (paramJSONObject != null)
            {
              bool4 = bool3;
              if (paramJSONObject.has("data"))
              {
                paramJSONObject = paramJSONObject.optJSONArray("data");
                if ((paramJSONObject == null) || (paramJSONObject.length() == 0))
                {
                  ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler speed, data array is null");
                  bool4 = bool3;
                }
                else
                {
                  d = paramJSONObject.optDouble(0, -1.0D);
                  if (d < 0.0D)
                  {
                    ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler speed, invalid rate:%s", new Object[] { Double.valueOf(d) });
                    bool4 = bool3;
                  }
                  else
                  {
                    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler speed, speed:%s", new Object[] { Double.valueOf(d) });
                    bool4 = this.idR.at((float)d);
                  }
                }
              }
            }
          }
        }
        else if (str.equalsIgnoreCase("requestFullScreen"))
        {
          oL(30);
          if ((paramc instanceof u))
            localu = (u)paramc;
        }
      }
    }
    while (true)
    {
      label596: if (localu == null)
        ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler requestFullscreen, page view is null");
      while (true)
      {
        bool4 = false;
        break;
        if (!(paramc instanceof q))
          break label963;
        localu = ((q)paramc).getCurrentPageView();
        break label596;
        if ((paramJSONObject != null) && (paramJSONObject.has("data")))
        {
          paramJSONObject = paramJSONObject.optJSONArray("data");
          if ((paramJSONObject != null) && (paramJSONObject.length() != 0))
            break label678;
          ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler requestFullscreen, data array is null");
        }
      }
      label678: switch (paramJSONObject.optInt(0, 90))
      {
      default:
        paramJSONObject = "landscape";
      case 90:
      case -90:
      case 0:
      }
      while (true)
      {
        this.iep = localu.isQ;
        if (this.iep == null)
        {
          this.iep = localu.getPageConfig().hfD;
          if (this.iep == null)
            this.iep = "portrait";
        }
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler requestFullscreen, current orientation:%s, target orientation:%s", new Object[] { this.iep, paramJSONObject });
        localu.Dg(paramJSONObject);
        bool4 = bool1;
        break;
        paramJSONObject = "landscape";
        continue;
        paramJSONObject = "landscapeLeft";
        continue;
        paramJSONObject = "portrait";
      }
      bool4 = bool3;
      if (!str.equalsIgnoreCase("exitFullScreen"))
        break;
      oL(31);
      if ((paramc instanceof u))
        paramJSONObject = (u)paramc;
      while (true)
      {
        if (paramJSONObject != null)
          break label896;
        ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler exitFullscreen, page view is null");
        bool4 = bool3;
        break;
        paramJSONObject = localu;
        if ((paramc instanceof q))
          paramJSONObject = ((q)paramc).getCurrentPageView();
      }
      label896: if (this.iep == null)
      {
        ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler exitFullscreen, orientation before fullscreen is null");
        bool4 = bool3;
        break;
      }
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler exitFullscreen, orientation:%s", new Object[] { this.iep });
      paramJSONObject.Dg(this.iep);
      this.iep = null;
      bool4 = true;
      break;
      label956: paramJSONObject = "fail";
      break label129;
      label963: localu = null;
    }
  }

  private static String l(com.tencent.mm.plugin.appbrand.jsapi.c paramc, String paramString)
  {
    AppMethodBeat.i(117413);
    if ((!bo.isNullOrNil(paramString)) && (paramc != null) && (paramc.asE() != null) && (paramc.asE().ca(paramString)))
    {
      paramc = paramc.asE().yg(paramString);
      if (paramc == null)
        AppMethodBeat.o(117413);
    }
    while (true)
    {
      return paramString;
      paramString = "file://" + paramc.getAbsolutePath();
      AppMethodBeat.o(117413);
      continue;
      AppMethodBeat.o(117413);
    }
  }

  private void oL(int paramInt)
  {
    AppMethodBeat.i(117424);
    if (this.idU != null)
      this.idU.gq(paramInt);
    AppMethodBeat.o(117424);
  }

  private void pB()
  {
    AppMethodBeat.i(117423);
    if (this.mSurface != null)
    {
      this.mSurface.release();
      this.mSurface = null;
    }
    AppMethodBeat.o(117423);
  }

  private void release()
  {
    AppMethodBeat.i(117420);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler release");
    if (this.idR != null)
    {
      this.idR.reset();
      this.idR.release();
      this.idR = null;
    }
    if (this.idS != null)
    {
      this.idS.destroy();
      this.idS = null;
    }
    if (this.idT != null)
    {
      this.idT.destroy();
      this.idT = null;
    }
    pB();
    aGL();
    AppMethodBeat.o(117420);
  }

  public final String a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, m paramm, int paramInt)
  {
    AppMethodBeat.i(117410);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", new Object[] { wP(), paramm.getName(), paramJSONObject.toString() });
    if ((paramm instanceof com.tencent.mm.plugin.appbrand.jsapi.u.b.a.b))
    {
      oL(21);
      c(paramc, paramJSONObject, paramm, paramInt);
    }
    while (true)
    {
      AppMethodBeat.o(117410);
      return null;
      if ((paramm instanceof com.tencent.mm.plugin.appbrand.jsapi.u.b.a.e))
      {
        oL(22);
        b(paramc, paramJSONObject, paramm, paramInt);
      }
      else if ((paramm instanceof com.tencent.mm.plugin.appbrand.jsapi.u.b.a.c))
      {
        oL(23);
        d(paramc, paramJSONObject, paramm, paramInt);
      }
      else if ((paramm instanceof com.tencent.mm.plugin.appbrand.jsapi.u.b.a.d))
      {
        oL(24);
        a(paramc, paramm, paramInt);
      }
    }
  }

  public final boolean a(m paramm)
  {
    AppMethodBeat.i(117403);
    boolean bool;
    if ((this.hpN) || ((paramm != null) && (paramm.getName().equals("removeXWebVideo"))))
    {
      bool = true;
      AppMethodBeat.o(117403);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117403);
    }
  }

  final void aGH()
  {
    AppMethodBeat.i(117402);
    Object localObject1;
    Object localObject2;
    int i;
    float f1;
    float f2;
    if (!bo.isNullOrNil(this.ieo))
      if ((this.iea) && (aAn() != null) && (this.idV != null))
      {
        localObject1 = this.idV;
        localObject2 = this.ieo;
        i = this.iej;
        int j = this.iek;
        int k = this.mVideoWidth;
        int m = this.mVideoHeight;
        if (bo.isNullOrNil((String)localObject2))
        {
          ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoScaleHandler", "calculateScale, scale type is null");
          i = 0;
        }
        while (true)
          if (i != 0)
          {
            ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler adjust objectFit:%s, scale:[%s, %s]", new Object[] { this.ieo, Float.valueOf(this.idV.iez), Float.valueOf(this.idV.ieA) });
            localObject1 = aAn();
            localObject2 = getType();
            i = getId();
            f1 = this.idV.iez;
            f2 = this.idV.ieA;
            if ((localObject1 != null) && (((com.tencent.luggage.i.a.a)localObject1).yp() != null))
            {
              ab.i("MicroMsg.AppBrand.SameLayer.WebViewExtendPluginUtil", "applyPluginTextureScale, %s#%d, scale:[%s,%s]", new Object[] { localObject2, Integer.valueOf(i), Float.valueOf(f1), Float.valueOf(f2) });
              ((com.tencent.luggage.i.a.a)localObject1).yp().setPluginTextureScale((String)localObject2, i, f1, f2);
            }
            AppMethodBeat.o(117402);
            label244: return;
            if ((i == 0) || (j == 0) || (k == 0) || (m == 0))
            {
              ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoScaleHandler", "calculateScale, width or height is 0");
              i = 0;
            }
            else if ((((String)localObject2).equalsIgnoreCase(((e)localObject1).iey)) && (((e)localObject1).ieu == i) && (((e)localObject1).iev == j) && (((e)localObject1).videoWidth == k) && (((e)localObject1).videoHeight == m))
            {
              ab.w("MicroMsg.AppBrand.SameLayer.AppBrandVideoScaleHandler", "calculateScale, same as last calculated");
              i = 1;
            }
            else
            {
              ((e)localObject1).iey = ((String)localObject2);
              ((e)localObject1).ieu = i;
              ((e)localObject1).iev = j;
              ((e)localObject1).videoWidth = k;
              ((e)localObject1).videoHeight = m;
              f1 = ((e)localObject1).videoWidth * 1.0F / ((e)localObject1).videoHeight;
              f2 = ((e)localObject1).ieu * 1.0F / ((e)localObject1).iev;
              if (((e)localObject1).iey.equalsIgnoreCase("contain"))
                if (((e)localObject1).ieu < ((e)localObject1).iev)
                {
                  ((e)localObject1).iex = ((int)(((e)localObject1).ieu / f1));
                  ((e)localObject1).iew = ((e)localObject1).ieu;
                  if (((e)localObject1).iex <= ((e)localObject1).iev)
                    break;
                }
            }
          }
      }
    label957: 
    while (true)
    {
      label452: localObject2 = localObject1;
      ((e)localObject2).iew = ((int)(f1 * ((e)localObject2).iev));
      ((e)localObject2).iex = ((e)localObject2).iev;
      while (true)
      {
        ((e)localObject1).iez = (((e)localObject1).iew * 1.0F / ((e)localObject1).ieu);
        ((e)localObject1).ieA = (((e)localObject1).iex * 1.0F / ((e)localObject1).iev);
        ab.d("MicroMsg.AppBrand.SameLayer.AppBrandVideoScaleHandler", "calculateScale, screen[%d, %d], video[%d, %d], measure[%d, %d], scale[%f, %f]", new Object[] { Integer.valueOf(((e)localObject1).ieu), Integer.valueOf(((e)localObject1).iev), Integer.valueOf(((e)localObject1).videoWidth), Integer.valueOf(((e)localObject1).videoHeight), Integer.valueOf(((e)localObject1).iew), Integer.valueOf(((e)localObject1).iex), Float.valueOf(((e)localObject1).iez), Float.valueOf(((e)localObject1).ieA) });
        i = 1;
        break;
        ((e)localObject1).iew = ((int)(((e)localObject1).iev * f1));
        ((e)localObject1).iex = ((e)localObject1).iev;
        if (((e)localObject1).iew > ((e)localObject1).ieu)
        {
          ((e)localObject1).iex = ((int)(((e)localObject1).ieu / f1));
          ((e)localObject1).iew = ((e)localObject1).ieu;
          continue;
          if (((e)localObject1).iey.equalsIgnoreCase("fill"))
          {
            ((e)localObject1).iex = ((e)localObject1).iev;
            ((e)localObject1).iew = ((e)localObject1).ieu;
          }
          else
          {
            if (((e)localObject1).iey.equalsIgnoreCase("cover"))
            {
              if (((e)localObject1).ieu > ((e)localObject1).iev)
              {
                ((e)localObject1).iex = ((int)(((e)localObject1).ieu / f1));
                ((e)localObject1).iew = ((e)localObject1).ieu;
                if (((e)localObject1).iex >= ((e)localObject1).iev)
                  continue;
                break label452;
              }
              ((e)localObject1).iew = ((int)(((e)localObject1).iev * f1));
              ((e)localObject1).iex = ((e)localObject1).iev;
              if (((e)localObject1).iew >= ((e)localObject1).ieu)
                continue;
              ((e)localObject1).iex = ((int)(((e)localObject1).ieu / f1));
              ((e)localObject1).iew = ((e)localObject1).ieu;
              continue;
            }
            if (Math.abs(f1 - f2) > 0.05D)
            {
              if (((e)localObject1).ieu < ((e)localObject1).iev)
              {
                ((e)localObject1).iex = ((int)(((e)localObject1).ieu / f1));
                ((e)localObject1).iew = ((e)localObject1).ieu;
              }
              else
              {
                ((e)localObject1).iew = ((int)(((e)localObject1).iev * f1));
                ((e)localObject1).iex = ((e)localObject1).iev;
              }
            }
            else
            {
              if (((e)localObject1).ieu <= ((e)localObject1).iev)
                break label957;
              ((e)localObject1).iex = ((int)(((e)localObject1).ieu / f1));
              ((e)localObject1).iew = ((e)localObject1).ieu;
            }
          }
        }
      }
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler adjust objectFit, video not prepared");
      AppMethodBeat.o(117402);
      break label244;
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler adjust objectFit, no video objectFit");
      AppMethodBeat.o(117402);
      break label244;
    }
  }

  public final void aGJ()
  {
    AppMethodBeat.i(117407);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "*** handler(%s) handleWebViewForeground", new Object[] { wP() });
    this.ier = false;
    c.13 local13 = new c.13(this);
    if (!a(null))
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler webview foreground, plugin is not ready, add to pending tasks");
      this.ies.add(local13);
      AppMethodBeat.o(117407);
    }
    while (true)
    {
      return;
      local13.run();
      AppMethodBeat.o(117407);
    }
  }

  public final void aGK()
  {
    AppMethodBeat.i(117409);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "*** handler(%s) handleWebViewDestroy", new Object[] { wP() });
    release();
    AppMethodBeat.o(117409);
  }

  final boolean aGN()
  {
    if ((this.ieg) && (this.idS != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void d(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(117404);
    super.d(paramSurfaceTexture);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "*** handler(%s) handlePluginReady", new Object[] { wP() });
    this.ieb = false;
    this.iec = false;
    this.ied = false;
    this.mSurfaceTexture = paramSurfaceTexture;
    this.mSurface = new Surface(paramSurfaceTexture);
    if (this.idR != null)
      this.idR.setSurface(this.mSurface);
    aGI();
    AppMethodBeat.o(117404);
  }

  public final void oK(int paramInt)
  {
    AppMethodBeat.i(117408);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "*** handler(%s) handleWebViewBackground, type:%d", new Object[] { wP(), Integer.valueOf(paramInt) });
    this.ier = true;
    c.2 local2 = new c.2(this, paramInt);
    if (!a(null))
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "handler webview background, plugin is not ready, add to pending tasks");
      this.ies.add(local2);
      AppMethodBeat.o(117408);
    }
    while (true)
    {
      return;
      local2.run();
      AppMethodBeat.o(117408);
    }
  }

  final boolean pause()
  {
    boolean bool = true;
    AppMethodBeat.i(117419);
    if (this.idR != null)
      if (!this.idR.isPlaying())
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "video pause, video is not playing");
        AppMethodBeat.o(117419);
      }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "video pause");
      this.idR.pause();
      if (aGN())
        this.idS.onVideoPause();
      AppMethodBeat.o(117419);
      continue;
      bool = false;
      AppMethodBeat.o(117419);
    }
  }

  final boolean play()
  {
    boolean bool = true;
    AppMethodBeat.i(117418);
    if (this.idR != null)
      if (this.idR.isPlaying())
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "video play, video is playing");
        AppMethodBeat.o(117418);
      }
    while (true)
    {
      return bool;
      if (this.ieq)
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "video play, video has ended playing, clear surface and start again");
        this.ieq = false;
        aGM();
        if (this.idR != null)
        {
          this.ief = true;
          this.idR.eu(true);
          this.idR.setDataSource(this.ien);
          prepareAsync();
        }
        AppMethodBeat.o(117418);
      }
      else if ((this.idR != null) && (this.idR.getState() == 5))
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "video play, video has stopped now, try prepare and start when prepared");
        this.ief = true;
        this.idR.eu(true);
        prepareAsync();
        AppMethodBeat.o(117418);
      }
      else if ((this.idR != null) && (!this.iea))
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "video play, video not prepared yet, start until prepared");
        this.ief = true;
        this.idR.eu(true);
        AppMethodBeat.o(117418);
      }
      else
      {
        this.idR.start();
        if (aGN())
          this.idS.onVideoPlay();
        AppMethodBeat.o(117418);
        continue;
        AppMethodBeat.o(117418);
        bool = false;
      }
    }
  }

  final void prepareAsync()
  {
    AppMethodBeat.i(117417);
    if (this.idR != null)
    {
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "video prepare async");
      this.iea = false;
      this.idR.prepareAsync();
      if (aGN())
        this.idS.onVideoWaiting();
    }
    AppMethodBeat.o(117417);
  }

  public final void seek(int paramInt)
  {
    AppMethodBeat.i(117421);
    if (this.idR != null)
    {
      if (this.idS != null)
        this.idS.onVideoWaiting();
      if (this.idR != null)
        this.iec = this.idR.isPlaying();
      if (this.idR != null)
        this.idR.seekTo(paramInt);
    }
    AppMethodBeat.o(117421);
  }

  public final void yr()
  {
    AppMethodBeat.i(117406);
    super.yr();
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoPluginHandler", "*** handler(%s) handlePluginDestroy", new Object[] { wP() });
    pause();
    AppMethodBeat.o(117406);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.c
 * JD-Core Version:    0.6.2
 */