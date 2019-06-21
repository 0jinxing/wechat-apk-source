package org.xwalk.core;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Map;

public class WebViewExtension
{
  public static final String EXTENSION_ADD_FILTER_RESOURCES = "AddFilterResources";
  private static final String TAG = "XWalkLib.WebViewExtension";
  private static WebViewExtensionInterface mWebViewExtensionInterface;
  private static WebViewExtensionListener mWebViewExtensionListener;
  private static WebViewExtension sInstance;
  private ReflectMethod SetExtensionMethod;
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod postWrapperMethod;

  static
  {
    AppMethodBeat.i(85534);
    if (!WebViewExtension.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(85534);
      return;
    }
  }

  public WebViewExtension()
  {
    AppMethodBeat.i(85528);
    this.SetExtensionMethod = new ReflectMethod(null, "SetExtension", new Class[0]);
    this.constructorTypes = new ArrayList();
    this.constructorParams = new ArrayList();
    reflectionInit();
    AppMethodBeat.o(85528);
  }

  public static void SetExtension(WebViewExtensionListener paramWebViewExtensionListener)
  {
    AppMethodBeat.i(85529);
    Log.i("XWalkLib.WebViewExtension", "SetExtension WebViewExtensionInterface");
    mWebViewExtensionListener = paramWebViewExtensionListener;
    try
    {
      updateExtension(true);
      AppMethodBeat.o(85529);
      return;
    }
    catch (Exception paramWebViewExtensionListener)
    {
      while (true)
      {
        Log.i("XWalkLib.WebViewExtension", "SetExtension refelction not ready, updateExtension when available:" + paramWebViewExtensionListener.getMessage());
        AppMethodBeat.o(85529);
      }
    }
  }

  public static boolean addFilterResources(Resources paramResources, Map<Long, Integer> paramMap)
  {
    AppMethodBeat.i(85531);
    boolean bool = invokeExtensionMethod("AddFilterResources", new Object[] { paramResources, paramMap });
    AppMethodBeat.o(85531);
    return bool;
  }

  private static WebViewExtension getInstance()
  {
    AppMethodBeat.i(85527);
    if (sInstance == null)
      sInstance = new WebViewExtension();
    WebViewExtension localWebViewExtension = sInstance;
    AppMethodBeat.o(85527);
    return localWebViewExtension;
  }

  public static boolean invokeExtensionMethod(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(85532);
    boolean bool;
    if (mWebViewExtensionListener != null)
    {
      mWebViewExtensionListener.onMiscCallBack(paramString, paramArrayOfObject);
      bool = true;
      AppMethodBeat.o(85532);
    }
    while (true)
    {
      return bool;
      Log.e("XWalkLib.WebViewExtension", "InvokeExtensionMethod interface is null,method:".concat(String.valueOf(paramString)));
      bool = false;
      AppMethodBeat.o(85532);
    }
  }

  public static void updateExtension(boolean paramBoolean)
  {
    AppMethodBeat.i(85530);
    if ((mWebViewExtensionListener != null) && ((paramBoolean == true) || (mWebViewExtensionInterface == null)))
    {
      getInstance();
      Log.i("XWalkLib.WebViewExtension", "updateExtension");
      mWebViewExtensionInterface = new WebViewExtension.1();
      getInstance().SetExtensionMethod.invoke(new Object[] { mWebViewExtensionInterface.getBridge() });
    }
    AppMethodBeat.o(85530);
  }

  protected Object getBridge()
  {
    return this.bridge;
  }

  void reflectionInit()
  {
    AppMethodBeat.i(85533);
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      AppMethodBeat.o(85533);
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
        AppMethodBeat.o(85533);
        throw ((Throwable)localObject1);
      }
      localObject1[i] = Object.class;
      this.constructorParams.add(this);
      localObject1 = new ReflectConstructor(this.coreWrapper.getBridgeClass("WebViewExtensionBridge"), (Class[])localObject1);
      try
      {
        this.bridge = ((ReflectConstructor)localObject1).newInstance(this.constructorParams.toArray());
        if (this.postWrapperMethod != null)
          this.postWrapperMethod.invoke(new Object[0]);
        this.SetExtensionMethod.init(this.bridge, null, "SetExtensionSuper", new Class[] { this.coreWrapper.getBridgeClass("WebViewExtensionInterfaceBridge") });
        AppMethodBeat.o(85533);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        AppMethodBeat.o(85533);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.WebViewExtension
 * JD-Core Version:    0.6.2
 */