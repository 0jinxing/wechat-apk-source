package org.xwalk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

public abstract class XWalkExternalExtensionManager
{
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes = new ArrayList();
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod getViewActivityMethod = new ReflectMethod(null, "getViewActivity", new Class[0]);
  private ReflectMethod getViewContextMethod = new ReflectMethod(null, "getViewContext", new Class[0]);
  private ReflectMethod loadExtensionStringMethod = new ReflectMethod(null, "loadExtension", new Class[0]);
  private ReflectMethod onActivityResultintintIntentMethod = new ReflectMethod(null, "onActivityResult", new Class[0]);
  private ReflectMethod onDestroyMethod = new ReflectMethod(null, "onDestroy", new Class[0]);
  private ReflectMethod onPauseMethod = new ReflectMethod(null, "onPause", new Class[0]);
  private ReflectMethod onResumeMethod = new ReflectMethod(null, "onResume", new Class[0]);
  private ReflectMethod onStartMethod = new ReflectMethod(null, "onStart", new Class[0]);
  private ReflectMethod onStopMethod = new ReflectMethod(null, "onStop", new Class[0]);
  private ReflectMethod postWrapperMethod;

  static
  {
    if (!XWalkExternalExtensionManager.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public XWalkExternalExtensionManager(XWalkView paramXWalkView)
  {
    this.constructorTypes.add("XWalkViewBridge");
    this.constructorParams = new ArrayList();
    this.constructorParams.add(paramXWalkView);
    reflectionInit();
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  @Deprecated
  public Activity getViewActivity()
  {
    try
    {
      Activity localActivity = (Activity)this.getViewActivityMethod.invoke(new Object[0]);
      return localActivity;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
        Object localObject = null;
      }
    }
  }

  public Context getViewContext()
  {
    try
    {
      Context localContext = (Context)this.getViewContextMethod.invoke(new Object[0]);
      return localContext;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
        Object localObject = null;
      }
    }
  }

  public void loadExtension(String paramString)
  {
    try
    {
      this.loadExtensionStringMethod.invoke(new Object[] { paramString });
      return;
    }
    catch (UnsupportedOperationException paramString)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(paramString);
      }
    }
  }

  @Deprecated
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      this.onActivityResultintintIntentMethod.invoke(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent });
      return;
    }
    catch (UnsupportedOperationException paramIntent)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(paramIntent);
      }
    }
  }

  public void onDestroy()
  {
    try
    {
      this.onDestroyMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
      }
    }
  }

  public abstract void onNewIntent(Intent paramIntent);

  public void onPause()
  {
    try
    {
      this.onPauseMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
      }
    }
  }

  public void onResume()
  {
    try
    {
      this.onResumeMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
      }
    }
  }

  public void onStart()
  {
    try
    {
      this.onStartMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
      }
    }
  }

  public void onStop()
  {
    try
    {
      this.onStopMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
      }
    }
  }

  void reflectionInit()
  {
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
      XWalkCoreWrapper.reserveReflectObject(this);
    while (true)
    {
      return;
      int i = this.constructorTypes.size();
      Class[] arrayOfClass = new Class[i + 1];
      int j = 0;
      if (j < i)
      {
        localObject = this.constructorTypes.get(j);
        if ((localObject instanceof String))
        {
          arrayOfClass[j] = this.coreWrapper.getBridgeClass((String)localObject);
          this.constructorParams.set(j, this.coreWrapper.getBridgeObject(this.constructorParams.get(j)));
        }
        label126: 
        do
          while (true)
          {
            j++;
            break;
            if (!(localObject instanceof Class))
              break label126;
            arrayOfClass[j] = ((Class)localObject);
          }
        while ($assertionsDisabled);
        throw new AssertionError();
      }
      arrayOfClass[i] = Object.class;
      this.constructorParams.add(this);
      Object localObject = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkExternalExtensionManagerBridge"), arrayOfClass);
      try
      {
        this.bridge = ((ReflectConstructor)localObject).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
        this.getViewActivityMethod.init(this.bridge, null, "getViewActivitySuper", new Class[0]);
        this.getViewContextMethod.init(this.bridge, null, "getViewContextSuper", new Class[0]);
        this.loadExtensionStringMethod.init(this.bridge, null, "loadExtensionSuper", new Class[] { String.class });
        this.onStartMethod.init(this.bridge, null, "onStartSuper", new Class[0]);
        this.onResumeMethod.init(this.bridge, null, "onResumeSuper", new Class[0]);
        this.onPauseMethod.init(this.bridge, null, "onPauseSuper", new Class[0]);
        this.onStopMethod.init(this.bridge, null, "onStopSuper", new Class[0]);
        this.onDestroyMethod.init(this.bridge, null, "onDestroySuper", new Class[0]);
        this.onActivityResultintintIntentMethod.init(this.bridge, null, "onActivityResultSuper", new Class[] { Integer.TYPE, Integer.TYPE, Intent.class });
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkExternalExtensionManager
 * JD-Core Version:    0.6.2
 */