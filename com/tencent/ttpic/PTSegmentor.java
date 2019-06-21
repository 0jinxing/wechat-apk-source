package com.tencent.ttpic;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.ApiHelper;
import com.tencent.ttpic.device.DeviceInstance;
import com.tencent.ttpic.fabby.FabbyManager;
import com.tencent.ttpic.fabby.FabbyUtil;
import com.tencent.ttpic.gles.SegmentDataPipe;
import com.tencent.ttpic.manager.FeatureManager;
import com.tencent.ttpic.thread.SegmentGLThread;
import com.tencent.ttpic.util.FrameUtil;

public class PTSegmentor
{
  private static final ThreadLocal<PTSegmentor> INSTANCE;
  private static String[] NOT_SUPPORT_DEVICE;
  private boolean firstSeg;
  private volatile SegmentDataPipe mDetDataPipe;
  private BaseFilter mRotateFilter;
  private h mRotateFrame;
  private SegmentGLThread mSegGLThread;
  private final Object mSegmentLock;

  static
  {
    AppMethodBeat.i(81609);
    INSTANCE = new ThreadLocal()
    {
      protected final PTSegmentor initialValue()
      {
        AppMethodBeat.i(81597);
        PTSegmentor localPTSegmentor = new PTSegmentor();
        AppMethodBeat.o(81597);
        return localPTSegmentor;
      }
    };
    NOT_SUPPORT_DEVICE = new String[] { "QIHOO_1503-A01" };
    AppMethodBeat.o(81609);
  }

  public PTSegmentor()
  {
    AppMethodBeat.i(81600);
    this.mRotateFilter = new BaseFilter(GLSLRender.bJB);
    this.mRotateFrame = new h();
    this.mSegmentLock = new Object();
    AppMethodBeat.o(81600);
  }

  private PTSegAttr genSegAttr(h paramh)
  {
    AppMethodBeat.i(81607);
    PTSegAttr localPTSegAttr = new PTSegAttr();
    localPTSegAttr.setMaskFrame(paramh);
    AppMethodBeat.o(81607);
    return localPTSegAttr;
  }

  public static PTSegmentor getInstance()
  {
    AppMethodBeat.i(81601);
    PTSegmentor localPTSegmentor = (PTSegmentor)INSTANCE.get();
    AppMethodBeat.o(81601);
    return localPTSegmentor;
  }

  private boolean inBlackList(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(81603);
    String[] arrayOfString = NOT_SUPPORT_DEVICE;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
      if (arrayOfString[j].equals(paramString))
      {
        bool = true;
        AppMethodBeat.o(81603);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(81603);
    }
  }

  private void setDataPipe(SegmentDataPipe paramSegmentDataPipe)
  {
    AppMethodBeat.i(81604);
    synchronized (this.mSegmentLock)
    {
      this.mDetDataPipe = paramSegmentDataPipe;
      this.mSegmentLock.notifyAll();
      AppMethodBeat.o(81604);
      return;
    }
  }

  public void destroy()
  {
    AppMethodBeat.i(81605);
    this.mRotateFilter.ClearGLSL();
    this.mRotateFrame.clear();
    if (this.mSegGLThread != null)
    {
      this.mSegGLThread.destroy();
      this.mSegGLThread = null;
    }
    AppMethodBeat.o(81605);
  }

  public PTSegAttr detectFrame(h paramh, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(81606);
    if ((this.mSegGLThread != null) && (this.mSegGLThread.isInitReady()) && (paramBoolean) && (FabbyManager.getInstance().IsInitSuccess()) && (FeatureManager.isSegmentationReady()))
      if (this.firstSeg)
        break label194;
    while (true)
    {
      synchronized (this.mSegmentLock)
      {
        try
        {
          if (this.mDetDataPipe == null)
          {
            this.mSegmentLock.wait();
            continue;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localObject2 = this.mDetDataPipe;
          this.mDetDataPipe = null;
        }
        this.mSegGLThread.postSegJob(paramh, FabbyUtil.isHorizon(paramInt));
        this.firstSeg = false;
        if ((localObject2 != null) && (((SegmentDataPipe)localObject2).mTexFrame.width == paramh.width))
        {
          paramh = ((SegmentDataPipe)localObject2).mMaskFrame;
          localObject2 = paramh;
          if (paramh != null)
            localObject2 = FrameUtil.rotateCorrect(paramh, paramh.width, paramh.height, -paramInt, this.mRotateFilter, this.mRotateFrame);
          paramh = genSegAttr((h)localObject2);
          AppMethodBeat.o(81606);
          return paramh;
        }
      }
      paramh = null;
      continue;
      label194: Object localObject2 = null;
    }
  }

  @TargetApi(17)
  public void init()
  {
    AppMethodBeat.i(81602);
    if ((ApiHelper.hasJellyBeanMR1()) && (this.mSegGLThread == null) && (!inBlackList(DeviceInstance.getInstance().getDeviceName())))
    {
      this.mSegGLThread = new SegmentGLThread(EGL14.eglGetCurrentContext());
      this.mSegGLThread.setOnDataReadyListener(new PTSegmentor.2(this));
    }
    this.mRotateFilter.ApplyGLSLFilter();
    this.firstSeg = true;
    AppMethodBeat.o(81602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.PTSegmentor
 * JD-Core Version:    0.6.2
 */