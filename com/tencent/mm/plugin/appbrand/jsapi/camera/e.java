package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;

public abstract interface e extends f.b, f.c, f.d
{
  public static final e hGY = new e.1();

  public abstract void aDd();

  public abstract void aDf();

  public abstract void aDg();

  public abstract void aDm();

  public abstract void aDn();

  public abstract void ai(String paramString, boolean paramBoolean);

  public abstract boolean da(int paramInt1, int paramInt2);

  public abstract int getCameraId();

  public abstract View getView();

  public abstract void initView();

  public abstract void n(com.tencent.mm.plugin.appbrand.jsapi.c paramc);

  public abstract void release();

  public abstract void setAppId(String paramString);

  public abstract void setCameraId(int paramInt);

  public abstract void setFlash(String paramString);

  public abstract void setFrameLimitSize(int paramInt);

  public abstract void setMode(String paramString);

  public abstract void setNeedOutput(boolean paramBoolean);

  public abstract void setOperateCallBack(c paramc);

  public abstract void setOutPutCallBack(b paramb);

  public abstract void setPage(com.tencent.mm.plugin.appbrand.jsapi.e parame);

  public abstract void setQuality(String paramString);

  public abstract void setScanFreq(int paramInt);

  public abstract void w(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.e
 * JD-Core Version:    0.6.2
 */