package org.xwalk.core;

import java.util.ArrayList;

public abstract class XWalkLogMessageListener
{
  private Object bridge;
  private ArrayList<Object> constructorParams = new ArrayList();
  private ArrayList<Object> constructorTypes = new ArrayList();
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;

  static
  {
    if (!XWalkLogMessageListener.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public XWalkLogMessageListener()
  {
    reflectionInit();
  }

  public XWalkLogMessageListener(XWalkCoreWrapper paramXWalkCoreWrapper)
  {
    this.coreWrapper = paramXWalkCoreWrapper;
    reflectionInit();
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public abstract void onLogMessage(int paramInt1, String paramString1, int paramInt2, String paramString2);

  void reflectionInit()
  {
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.initEmbeddedMode();
      this.coreWrapper = XWalkCoreWrapper.getInstance();
    }
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
        label133: 
        do
          while (true)
          {
            j++;
            break;
            if (!(localObject instanceof Class))
              break label133;
            arrayOfClass[j] = ((Class)localObject);
          }
        while ($assertionsDisabled);
        throw new AssertionError();
      }
      arrayOfClass[i] = Object.class;
      this.constructorParams.add(this);
      Object localObject = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkLogMessageListenerBridge"), arrayOfClass);
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
 * Qualified Name:     org.xwalk.core.XWalkLogMessageListener
 * JD-Core Version:    0.6.2
 */