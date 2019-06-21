package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class XWalkHitTestResult
{
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod enumtypeClassValueOfMethod;
  private ReflectMethod getExtraMethod;
  private ReflectMethod getTypeMethod;
  private ReflectMethod postWrapperMethod;

  public XWalkHitTestResult(Object paramObject)
  {
    AppMethodBeat.i(85646);
    this.enumtypeClassValueOfMethod = new ReflectMethod();
    this.getTypeMethod = new ReflectMethod(null, "getType", new Class[0]);
    this.getExtraMethod = new ReflectMethod(null, "getExtra", new Class[0]);
    this.bridge = paramObject;
    reflectionInit();
    AppMethodBeat.o(85646);
  }

  private Object Converttype(XWalkHitTestResult.type paramtype)
  {
    AppMethodBeat.i(85645);
    paramtype = this.enumtypeClassValueOfMethod.invoke(new Object[] { paramtype.toString() });
    AppMethodBeat.o(85645);
    return paramtype;
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public String getExtra()
  {
    AppMethodBeat.i(85648);
    try
    {
      String str = (String)this.getExtraMethod.invoke(new Object[0]);
      AppMethodBeat.o(85648);
      return str;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85648);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        RuntimeException localRuntimeException = null;
        AppMethodBeat.o(85648);
      }
    }
  }

  public XWalkHitTestResult.type getType()
  {
    AppMethodBeat.i(85647);
    try
    {
      XWalkHitTestResult.type localtype = XWalkHitTestResult.type.valueOf(this.getTypeMethod.invoke(new Object[0]).toString());
      AppMethodBeat.o(85647);
      return localtype;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(85647);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        RuntimeException localRuntimeException = null;
        AppMethodBeat.o(85647);
      }
    }
  }

  void reflectionInit()
  {
    AppMethodBeat.i(85649);
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      AppMethodBeat.o(85649);
    }
    while (true)
    {
      return;
      this.enumtypeClassValueOfMethod.init(null, this.coreWrapper.getBridgeClass("XWalkHitTestResultInternal$type"), "valueOf", new Class[] { String.class });
      this.getTypeMethod.init(this.bridge, null, "getTypeSuper", new Class[0]);
      this.getExtraMethod.init(this.bridge, null, "getExtraSuper", new Class[0]);
      AppMethodBeat.o(85649);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkHitTestResult
 * JD-Core Version:    0.6.2
 */