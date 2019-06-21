package org.xwalk.core;

import java.util.ArrayList;

public abstract class XWalkExtension
{
  private Object bridge;
  private ReflectMethod broadcastMessageStringMethod = new ReflectMethod(null, "broadcastMessage", new Class[0]);
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes = new ArrayList();
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod onBinaryMessageintbyteArrayMethod = new ReflectMethod(null, "onBinaryMessage", new Class[0]);
  private ReflectMethod onInstanceCreatedintMethod = new ReflectMethod(null, "onInstanceCreated", new Class[0]);
  private ReflectMethod onInstanceDestroyedintMethod = new ReflectMethod(null, "onInstanceDestroyed", new Class[0]);
  private ReflectMethod postBinaryMessageintbyteArrayMethod = new ReflectMethod(null, "postBinaryMessage", new Class[0]);
  private ReflectMethod postMessageintStringMethod = new ReflectMethod(null, "postMessage", new Class[0]);
  private ReflectMethod postWrapperMethod;

  static
  {
    if (!XWalkExtension.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public XWalkExtension(String paramString1, String paramString2)
  {
    this.constructorTypes.add(String.class);
    this.constructorTypes.add(String.class);
    this.constructorParams = new ArrayList();
    this.constructorParams.add(paramString1);
    this.constructorParams.add(paramString2);
    reflectionInit();
  }

  public XWalkExtension(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    this.constructorTypes.add(String.class);
    this.constructorTypes.add(String.class);
    this.constructorTypes.add([Ljava.lang.String.class);
    this.constructorParams = new ArrayList();
    this.constructorParams.add(paramString1);
    this.constructorParams.add(paramString2);
    this.constructorParams.add(paramArrayOfString);
    reflectionInit();
  }

  public void broadcastMessage(String paramString)
  {
    try
    {
      this.broadcastMessageStringMethod.invoke(new Object[] { paramString });
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

  protected Object getBridge()
  {
    return this.bridge;
  }

  public void onBinaryMessage(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      this.onBinaryMessageintbyteArrayMethod.invoke(new Object[] { Integer.valueOf(paramInt), paramArrayOfByte });
      return;
    }
    catch (UnsupportedOperationException paramArrayOfByte)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(paramArrayOfByte);
      }
    }
  }

  public void onInstanceCreated(int paramInt)
  {
    try
    {
      this.onInstanceCreatedintMethod.invoke(new Object[] { Integer.valueOf(paramInt) });
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

  public void onInstanceDestroyed(int paramInt)
  {
    try
    {
      this.onInstanceDestroyedintMethod.invoke(new Object[] { Integer.valueOf(paramInt) });
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

  public abstract void onMessage(int paramInt, String paramString);

  public abstract String onSyncMessage(int paramInt, String paramString);

  public void postBinaryMessage(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      this.postBinaryMessageintbyteArrayMethod.invoke(new Object[] { Integer.valueOf(paramInt), paramArrayOfByte });
      return;
    }
    catch (UnsupportedOperationException paramArrayOfByte)
    {
      while (true)
      {
        if (this.coreWrapper == null)
          throw new RuntimeException("Crosswalk's APIs are not ready yet");
        XWalkCoreWrapper.handleRuntimeError(paramArrayOfByte);
      }
    }
  }

  public void postMessage(int paramInt, String paramString)
  {
    try
    {
      this.postMessageintStringMethod.invoke(new Object[] { Integer.valueOf(paramInt), paramString });
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
        label126: 
        do
          while (true)
          {
            j++;
            break;
            if (!(localObject2 instanceof Class))
              break label126;
            localObject1[j] = ((Class)localObject2);
          }
        while ($assertionsDisabled);
        throw new AssertionError();
      }
      localObject1[i] = Object.class;
      this.constructorParams.add(this);
      localObject1 = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkExtensionBridge"), (Class[])localObject1);
      try
      {
        this.bridge = ((ReflectConstructor)localObject1).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
        this.postMessageintStringMethod.init(this.bridge, null, "postMessageSuper", new Class[] { Integer.TYPE, String.class });
        this.postBinaryMessageintbyteArrayMethod.init(this.bridge, null, "postBinaryMessageSuper", new Class[] { Integer.TYPE, [B.class });
        this.broadcastMessageStringMethod.init(this.bridge, null, "broadcastMessageSuper", new Class[] { String.class });
        this.onInstanceCreatedintMethod.init(this.bridge, null, "onInstanceCreatedSuper", new Class[] { Integer.TYPE });
        this.onInstanceDestroyedintMethod.init(this.bridge, null, "onInstanceDestroyedSuper", new Class[] { Integer.TYPE });
        this.onBinaryMessageintbyteArrayMethod.init(this.bridge, null, "onBinaryMessageSuper", new Class[] { Integer.TYPE, [B.class });
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkExtension
 * JD-Core Version:    0.6.2
 */