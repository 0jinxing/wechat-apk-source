package org.xwalk.core;

import java.util.ArrayList;

public abstract class XWalkNotifyChannelListener
{
  private Object bridge;
  private ArrayList<Object> constructorParams = new ArrayList();
  private ArrayList<Object> constructorTypes = new ArrayList();
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;

  static
  {
    if (!XWalkNotifyChannelListener.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public XWalkNotifyChannelListener()
  {
    reflectionInit();
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public abstract void onNotifyCallBackChannel(int paramInt, Object[] paramArrayOfObject);

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
      Object localObject = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkNotifyChannelListenerBridge"), arrayOfClass);
      try
      {
        this.bridge = ((ReflectConstructor)localObject).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkNotifyChannelListener
 * JD-Core Version:    0.6.2
 */