package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.x5.a.a.a.a.b;
import java.util.ArrayList;

public class XWalkProxyWebViewClientExtension extends b
{
  private static final String TAG = "XWalkProxyWebViewClientExtension";
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;

  static
  {
    AppMethodBeat.i(85745);
    if (!XWalkProxyWebViewClientExtension.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(85745);
      return;
    }
  }

  public XWalkProxyWebViewClientExtension()
  {
    AppMethodBeat.i(85743);
    this.constructorTypes = new ArrayList();
    this.constructorParams = new ArrayList();
    reflectionInit();
    AppMethodBeat.o(85743);
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  void reflectionInit()
  {
    AppMethodBeat.i(85744);
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      AppMethodBeat.o(85744);
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
        AppMethodBeat.o(85744);
        throw ((Throwable)localObject1);
      }
      localObject1[i] = Object.class;
      this.constructorParams.add(this);
      localObject1 = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkProxyWebViewClientExtensionBridge"), (Class[])localObject1);
      try
      {
        this.bridge = ((ReflectConstructor)localObject1).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
        AppMethodBeat.o(85744);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        AppMethodBeat.o(85744);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkProxyWebViewClientExtension
 * JD-Core Version:    0.6.2
 */