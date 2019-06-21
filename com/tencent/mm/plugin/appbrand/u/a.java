package com.tencent.mm.plugin.appbrand.u;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.storage.c;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/xweb_ext/XWebABTests;", "", "()V", "TAG", "", "XWEB_ABTEST_COMMAND", "XWEB_VIDEO_COMMAND", "clearXwebVideoCommandValue", "", "getXwebVideoCommandValue", "", "openXWebMapSameLayer", "", "openXWebSameLayerRendering", "setXwebVideoCommandValue", "value", "plugin-appbrand-integration_release"})
public final class a
{
  public static final a jqp;

  static
  {
    AppMethodBeat.i(135274);
    jqp = new a();
    AppMethodBeat.o(135274);
  }

  public static final void aSi()
  {
    AppMethodBeat.i(135270);
    as.amF("xweb_abtest_command").removeValueForKey("xweb_video_command_value");
    AppMethodBeat.o(135270);
  }

  public static final boolean aSj()
  {
    boolean bool = false;
    AppMethodBeat.i(135272);
    int i = as.amF("xweb_abtest_command").decodeInt("xweb_video_command_value", -1);
    if (i >= 0)
      if (i == 1)
      {
        AppMethodBeat.o(135272);
        bool = true;
      }
    c localc;
    while (true)
    {
      return bool;
      AppMethodBeat.o(135272);
      continue;
      if (f.IS_FLAVOR_RED)
      {
        AppMethodBeat.o(135272);
        bool = true;
      }
      else
      {
        com.tencent.mm.ipcinvoker.wx_extension.a.a.PW();
        localc = com.tencent.mm.ipcinvoker.wx_extension.a.a.ll("100439");
        if (localc == null)
        {
          ab.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "openXWebSameLayerRendering, item is null");
          AppMethodBeat.o(135272);
        }
        else
        {
          if (localc.isValid())
            break;
          ab.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "openXWebSameLayerRendering, item not valid");
          AppMethodBeat.o(135272);
        }
      }
    }
    if (bo.getInt((String)localc.dru().get("useXWebVideo"), 0) == 1);
    for (bool = true; ; bool = false)
    {
      ab.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "openXWebSameLayerRendering, abtestFlag:%b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(135272);
      break;
    }
  }

  public static final boolean aSk()
  {
    AppMethodBeat.i(135273);
    int i;
    if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIt, 0) == 1)
    {
      i = 1;
      if ((i == 0) || (!XWalkEnvironment.isCurrentVersionSupportMapExtendPluginForAppbrand()))
        break label52;
      AppMethodBeat.o(135273);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break;
      label52: AppMethodBeat.o(135273);
    }
  }

  public static final void rh(int paramInt)
  {
    AppMethodBeat.i(135271);
    as.amF("xweb_abtest_command").encode("xweb_video_command_value", paramInt);
    AppMethodBeat.o(135271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.u.a
 * JD-Core Version:    0.6.2
 */