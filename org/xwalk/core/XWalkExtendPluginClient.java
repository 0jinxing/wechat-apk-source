package org.xwalk.core;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class XWalkExtendPluginClient
{
  private static final String TAG = "XWalkExtendPluginClient";
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;
  private ReflectMethod setPluginTextureScaleStringintfloatfloatMethod;

  static
  {
    AppMethodBeat.i(85633);
    if (!XWalkExtendPluginClient.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(85633);
      return;
    }
  }

  public XWalkExtendPluginClient(XWalkView paramXWalkView)
  {
    AppMethodBeat.i(85630);
    this.setPluginTextureScaleStringintfloatfloatMethod = new ReflectMethod(null, "setPluginTextureScale", new Class[0]);
    this.constructorTypes = new ArrayList();
    this.constructorTypes.add("XWalkViewBridge");
    this.constructorParams = new ArrayList();
    this.constructorParams.add(paramXWalkView);
    reflectionInit();
    AppMethodBeat.o(85630);
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public void onPluginDestroy(String paramString, int paramInt)
  {
  }

  public void onPluginReady(String paramString, int paramInt, SurfaceTexture paramSurfaceTexture)
  {
  }

  public void onPluginTouch(String paramString, int paramInt, MotionEvent paramMotionEvent)
  {
  }

  public void onPluginTouch(String paramString1, int paramInt, String paramString2)
  {
  }

  void reflectionInit()
  {
    AppMethodBeat.i(85632);
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      AppMethodBeat.o(85632);
    }
    while (true)
    {
      return;
      int i = this.constructorTypes.size();
      Object localObject1 = new Class[i + 1];
      int j = 0;
      if (j < i)
      {
        Object localObject2 = this.constructorTypes.get(j);
        if ((localObject2 instanceof String))
        {
          localObject1[j] = this.coreWrapper.getBridgeClass((String)localObject2);
          this.constructorParams.set(j, this.coreWrapper.getBridgeObject(this.constructorParams.get(j)));
        }
        label136: 
        do
          while (true)
          {
            j++;
            break;
            if (!(localObject2 instanceof Class))
              break label136;
            localObject1[j] = ((Class)localObject2);
          }
        while ($assertionsDisabled);
        localObject1 = new AssertionError();
        AppMethodBeat.o(85632);
        throw ((Throwable)localObject1);
      }
      localObject1[i] = Object.class;
      this.constructorParams.add(this);
      localObject1 = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkExtendPluginClientBridge"), (Class[])localObject1);
      try
      {
        this.bridge = ((ReflectConstructor)localObject1).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
        this.setPluginTextureScaleStringintfloatfloatMethod.init(this.bridge, null, "setPluginTextureScale", new Class[] { String.class, Integer.TYPE, Float.TYPE, Float.TYPE });
        AppMethodBeat.o(85632);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        AppMethodBeat.o(85632);
      }
    }
  }

  public void setPluginTextureScale(String paramString, int paramInt, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(85631);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("setPluginTextureScale embed_type:");
      Log.i("XWalkExtendPluginClient", paramString + ",embed_id:" + paramInt + ",xScale:" + paramFloat1 + ",yScale:" + paramFloat2);
      this.setPluginTextureScaleStringintfloatfloatMethod.invoke(new Object[] { paramString, Integer.valueOf(paramInt), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
      AppMethodBeat.o(85631);
      return;
    }
    catch (UnsupportedOperationException paramString)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          paramString = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85631);
          throw paramString;
        }
        XWalkCoreWrapper.handleRuntimeError(paramString);
        AppMethodBeat.o(85631);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkExtendPluginClient
 * JD-Core Version:    0.6.2
 */