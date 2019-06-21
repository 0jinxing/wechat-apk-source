package com.tencent.xweb.xwalk;

import android.os.Handler;
import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;

public class XWAppBrandEngine
{
  public static XWAppBrandEngine.b ARM;
  private int ARI;
  private HashMap<Integer, XWAppBrandEngine.a> ARJ;
  private boolean ARK;
  public ArrayList<Runnable> ARL;
  private Handler mHandler;
  private long mInstance;
  private Timer mTimer;

  static
  {
    AppMethodBeat.i(4172);
    ClassLoader localClassLoader = XWAppBrandEngine.class.getClassLoader();
    k.a("mmv8", localClassLoader);
    k.a("jsengine", localClassLoader);
    ARM = null;
    AppMethodBeat.o(4172);
  }

  public XWAppBrandEngine()
  {
    AppMethodBeat.i(4168);
    this.mTimer = new Timer();
    this.ARI = 0;
    this.ARJ = new HashMap();
    this.ARK = false;
    this.ARL = new ArrayList();
    this.mHandler = new Handler();
    this.mInstance = nativeCreated();
    AppMethodBeat.o(4168);
  }

  private native void addJsInterface(long paramLong, Object paramObject, String paramString);

  private native String evaluateJavascript(long paramLong, String paramString);

  private native ByteBuffer getNativeBuffer(long paramLong, int paramInt);

  private native int getNativeBufferId(long paramLong);

  private native long nativeCreated();

  private native void nativeFinalize(long paramLong);

  private native void notifyClearTimer(long paramLong, int paramInt);

  private native boolean notifyRunTimer(long paramLong, int paramInt);

  private native boolean removeJsInterface(long paramLong, String paramString);

  @Keep
  public static void reportException(String paramString1, String paramString2, long paramLong)
  {
    if (ARM != null);
  }

  private native void setNativeBuffer(long paramLong, int paramInt, ByteBuffer paramByteBuffer);

  @Keep
  public void clearTimer(int paramInt)
  {
    AppMethodBeat.i(4170);
    if (!this.ARJ.containsKey(Integer.valueOf(paramInt)))
      AppMethodBeat.o(4170);
    while (true)
    {
      return;
      ((XWAppBrandEngine.a)this.ARJ.get(Integer.valueOf(paramInt))).cancel();
      this.ARJ.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(4170);
    }
  }

  @Keep
  public void onLog(int paramInt, String paramString)
  {
  }

  @Keep
  public int setTimer(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(4169);
    int i = this.ARI + 1;
    this.ARI = i;
    XWAppBrandEngine.a locala = new XWAppBrandEngine.a(this, i, paramBoolean);
    this.ARJ.put(Integer.valueOf(i), locala);
    int j = paramInt;
    if (paramInt <= 0)
      j = 1;
    if (paramBoolean)
      this.mTimer.schedule(locala, j, j);
    while (true)
    {
      AppMethodBeat.o(4169);
      return i;
      this.mTimer.schedule(locala, j);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.XWAppBrandEngine
 * JD-Core Version:    0.6.2
 */