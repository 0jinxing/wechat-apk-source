package org.xwalk.core;

import java.util.ArrayList;
import java.util.List;

public abstract class WebViewExtensionInterface
{
  private Object bridge;
  private ArrayList<Object> constructorParams = new ArrayList();
  private ArrayList<Object> constructorTypes = new ArrayList();
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;

  static
  {
    if (!WebViewExtensionInterface.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public WebViewExtensionInterface()
  {
    reflectionInit();
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public abstract int getHostByName(String paramString, List<String> paramList);

  public abstract Object onMiscCallBack(String paramString, Object[] paramArrayOfObject);

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
      localObject1 = new ReflectConstructor(this.coreWrapper.getBridgeClass("WebViewExtensionInterfaceBridge"), (Class[])localObject1);
      try
      {
        this.bridge = ((ReflectConstructor)localObject1).newInstance(this.constructorParams.toArray());
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
 * Qualified Name:     org.xwalk.core.WebViewExtensionInterface
 * JD-Core Version:    0.6.2
 */