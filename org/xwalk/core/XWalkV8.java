package org.xwalk.core;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class XWalkV8
{
  private ReflectMethod addJavascriptInterfaceObjectStringMethod;
  private Object bridge;
  private ReflectMethod cleanupMethod;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod evaluateJavascriptStringValueCallbackMethod;
  private ReflectMethod initintMethod;
  private ReflectMethod postWrapperMethod;

  static
  {
    AppMethodBeat.i(85938);
    if (!XWalkV8.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(85938);
      return;
    }
  }

  public XWalkV8()
  {
    AppMethodBeat.i(85932);
    this.initintMethod = new ReflectMethod(null, "init", new Class[0]);
    this.evaluateJavascriptStringValueCallbackMethod = new ReflectMethod(null, "evaluateJavascript", new Class[0]);
    this.cleanupMethod = new ReflectMethod(null, "cleanup", new Class[0]);
    this.addJavascriptInterfaceObjectStringMethod = new ReflectMethod(null, "addJavascriptInterface", new Class[0]);
    this.constructorTypes = new ArrayList();
    this.constructorParams = new ArrayList();
    reflectionInit();
    AppMethodBeat.o(85932);
  }

  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(85936);
    try
    {
      this.addJavascriptInterfaceObjectStringMethod.invoke(new Object[] { paramObject, paramString });
      AppMethodBeat.o(85936);
      return;
    }
    catch (UnsupportedOperationException paramObject)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          paramObject = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85936);
          throw paramObject;
        }
        XWalkCoreWrapper.handleRuntimeError(paramObject);
        AppMethodBeat.o(85936);
      }
    }
  }

  public void cleanup()
  {
    AppMethodBeat.i(85935);
    try
    {
      this.cleanupMethod.invoke(new Object[0]);
      AppMethodBeat.o(85935);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        RuntimeException localRuntimeException;
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85935);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        AppMethodBeat.o(85935);
      }
    }
  }

  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(85934);
    try
    {
      this.evaluateJavascriptStringValueCallbackMethod.invoke(new Object[] { paramString, paramValueCallback });
      AppMethodBeat.o(85934);
      return;
    }
    catch (UnsupportedOperationException paramString)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          paramString = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85934);
          throw paramString;
        }
        XWalkCoreWrapper.handleRuntimeError(paramString);
        AppMethodBeat.o(85934);
      }
    }
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public void init(int paramInt)
  {
    AppMethodBeat.i(85933);
    try
    {
      this.initintMethod.invoke(new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(85933);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        RuntimeException localRuntimeException;
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85933);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        AppMethodBeat.o(85933);
      }
    }
  }

  void reflectionInit()
  {
    AppMethodBeat.i(85937);
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      AppMethodBeat.o(85937);
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
        AppMethodBeat.o(85937);
        throw ((Throwable)localObject1);
      }
      localObject1[i] = Object.class;
      this.constructorParams.add(this);
      localObject1 = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkV8Bridge"), (Class[])localObject1);
      try
      {
        this.bridge = ((ReflectConstructor)localObject1).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
        this.initintMethod.init(this.bridge, null, "initSuper", new Class[] { Integer.TYPE });
        this.evaluateJavascriptStringValueCallbackMethod.init(this.bridge, null, "evaluateJavascriptSuper", new Class[] { String.class, ValueCallback.class });
        this.cleanupMethod.init(this.bridge, null, "cleanupSuper", new Class[0]);
        this.addJavascriptInterfaceObjectStringMethod.init(this.bridge, null, "addJavascriptInterfaceSuper", new Class[] { Object.class, String.class });
        AppMethodBeat.o(85937);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        AppMethodBeat.o(85937);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkV8
 * JD-Core Version:    0.6.2
 */