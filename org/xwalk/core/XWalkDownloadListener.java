package org.xwalk.core;

import android.content.Context;
import java.util.ArrayList;

public abstract class XWalkDownloadListener
{
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes = new ArrayList();
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;

  static
  {
    if (!XWalkDownloadListener.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public XWalkDownloadListener(Context paramContext)
  {
    this.constructorTypes.add(Context.class);
    this.constructorParams = new ArrayList();
    this.constructorParams.add(paramContext);
    reflectionInit();
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public abstract void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong);

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
      Object localObject = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkDownloadListenerBridge"), arrayOfClass);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkDownloadListener
 * JD-Core Version:    0.6.2
 */