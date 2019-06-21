package org.xwalk.core;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Map;

public class XWalkWebResourceRequestHandler
  implements XWalkWebResourceRequest
{
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod getMethodMethod;
  private ReflectMethod getRequestHeadersMethod;
  private ReflectMethod getUrlMethod;
  private ReflectMethod hasGestureMethod;
  private ReflectMethod isForMainFrameMethod;
  private ReflectMethod postWrapperMethod;

  public XWalkWebResourceRequestHandler(Object paramObject)
  {
    AppMethodBeat.i(86049);
    this.getUrlMethod = new ReflectMethod(null, "getUrl", new Class[0]);
    this.isForMainFrameMethod = new ReflectMethod(null, "isForMainFrame", new Class[0]);
    this.hasGestureMethod = new ReflectMethod(null, "hasGesture", new Class[0]);
    this.getMethodMethod = new ReflectMethod(null, "getMethod", new Class[0]);
    this.getRequestHeadersMethod = new ReflectMethod(null, "getRequestHeaders", new Class[0]);
    this.bridge = paramObject;
    reflectionInit();
    AppMethodBeat.o(86049);
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  public String getMethod()
  {
    AppMethodBeat.i(86053);
    try
    {
      String str = (String)this.getMethodMethod.invoke(new Object[0]);
      AppMethodBeat.o(86053);
      return str;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(86053);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        RuntimeException localRuntimeException = null;
        AppMethodBeat.o(86053);
      }
    }
  }

  public Map<String, String> getRequestHeaders()
  {
    AppMethodBeat.i(86054);
    try
    {
      Map localMap = (Map)this.getRequestHeadersMethod.invoke(new Object[0]);
      AppMethodBeat.o(86054);
      return localMap;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(86054);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        RuntimeException localRuntimeException = null;
        AppMethodBeat.o(86054);
      }
    }
  }

  public Uri getUrl()
  {
    AppMethodBeat.i(86050);
    try
    {
      Uri localUri = (Uri)this.getUrlMethod.invoke(new Object[0]);
      AppMethodBeat.o(86050);
      return localUri;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(86050);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        RuntimeException localRuntimeException = null;
        AppMethodBeat.o(86050);
      }
    }
  }

  public boolean hasGesture()
  {
    AppMethodBeat.i(86052);
    try
    {
      bool = ((Boolean)this.hasGestureMethod.invoke(new Object[0])).booleanValue();
      AppMethodBeat.o(86052);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        RuntimeException localRuntimeException;
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(86052);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        AppMethodBeat.o(86052);
        boolean bool = false;
      }
    }
  }

  public boolean isForMainFrame()
  {
    AppMethodBeat.i(86051);
    try
    {
      bool = ((Boolean)this.isForMainFrameMethod.invoke(new Object[0])).booleanValue();
      AppMethodBeat.o(86051);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        RuntimeException localRuntimeException;
        if (this.coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(86051);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        AppMethodBeat.o(86051);
        boolean bool = false;
      }
    }
  }

  void reflectionInit()
  {
    AppMethodBeat.i(86055);
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      AppMethodBeat.o(86055);
    }
    while (true)
    {
      return;
      this.getUrlMethod.init(this.bridge, null, "getUrlSuper", new Class[0]);
      this.isForMainFrameMethod.init(this.bridge, null, "isForMainFrameSuper", new Class[0]);
      this.hasGestureMethod.init(this.bridge, null, "hasGestureSuper", new Class[0]);
      this.getMethodMethod.init(this.bridge, null, "getMethodSuper", new Class[0]);
      this.getRequestHeadersMethod.init(this.bridge, null, "getRequestHeadersSuper", new Class[0]);
      AppMethodBeat.o(86055);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkWebResourceRequestHandler
 * JD-Core Version:    0.6.2
 */