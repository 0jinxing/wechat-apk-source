package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.b;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundNative;", "", "()V", "draw", "", "initView", "nativeInit", "nativeRelease", "setupGlslFiles", "vertexShader", "", "fragmentShader", "vertexFrameBuffer", "fragFrameBuffer", "textureVertexShader", "textureFragmentShader", "bgVertexShader", "bgFragmentShader", "surfaceChanged", "width", "", "height", "surfaceCreated", "Companion", "plugin-appbrand-integration_release"})
public final class DynamicBackgroundNative
{
  public static final DynamicBackgroundNative.a iZA;

  static
  {
    AppMethodBeat.i(135252);
    iZA = new DynamicBackgroundNative.a((byte)0);
    AppMethodBeat.o(135252);
  }

  public DynamicBackgroundNative()
  {
    AppMethodBeat.i(135251);
    if (b.aPe())
      d.aPO();
    try
    {
      System.loadLibrary("dynamicBg");
      AppMethodBeat.o(135251);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DynamicBackgroundNative", localThrowable, "alvinluo DynamicBackgroundNative exception", new Object[0]);
        d.aPL();
        AppMethodBeat.o(135251);
      }
    }
  }

  public final native void draw();

  public final native void initView();

  public final native void nativeInit();

  public final native void nativeRelease();

  public final native void setupGlslFiles(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8);

  public final native void surfaceChanged(int paramInt1, int paramInt2);

  public final native void surfaceCreated(int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundNative
 * JD-Core Version:    0.6.2
 */