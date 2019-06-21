package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/MPPageFastOpen$Companion;", "", "()V", "COMMAND_USE_NEW_PROFILE", "", "DATA_DIR", "", "LOCAL", "", "MM", "ONLINE", "PRELOAD_DATA", "PRELOAD_DATA_NO_EXPIRE", "PRELOAD_DATA_NULL", "PRELOAD_PROCESS", "PRELOAD_SAVE_TYPE", "PRELOAD_TMPL_ALWAYS_VERIFY_MD5", "PRELOAD_TMPL_LOWER_BOUND", "PRELOAD_TMPL_TEST_NO_FORCE_URL", "PRELOAD_TMPL_TEST_NO_PRELOAD_NEXT", "PRELOAD_TMPL_TEST_NO_RED", "PRELOAD_TYPE", "PRELOAD_USE", "PRELOAD_WEBVIEW", "SDDATA_DIR", "SERVER", "TAG", "TOOL", "TOOLMP", "UNKNOW", "alwaysVerifiyMD5", "register", "", "saveToSDCard", "targetProcess", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$Process;", "useLocalTmpl", "usePreloadData", "usePreloadLowerBound", "usePreloadNullData", "usePreloadTmpl", "usePreloadWebview", "userPreloadDataNoExpire", "userPreloadTestNoPreloadNext", "userPreloadTestNoReDir", "userPreloadTestNotRed", "plugin-brandservice_release"})
public final class g$a
{
  public static boolean aXe()
  {
    AppMethodBeat.i(14847);
    boolean bool = h.aXn().getBoolean("preload_webview", true);
    if (!bool)
      ab.i("MicroMsg.UseNewProfile", "//mppagefastopen webview false");
    AppMethodBeat.o(14847);
    return bool;
  }

  public static boolean aXf()
  {
    AppMethodBeat.i(14848);
    boolean bool = h.aXn().getBoolean("preload_data", true);
    if (!bool)
      ab.i("MicroMsg.UseNewProfile", "//mppagefastopen data false");
    AppMethodBeat.o(14848);
    return bool;
  }

  public static boolean aXg()
  {
    AppMethodBeat.i(14849);
    boolean bool = h.aXn().getBoolean("preload_data_null", false);
    if (!bool)
      ab.i("MicroMsg.UseNewProfile", "//mppagefastopen data null");
    AppMethodBeat.o(14849);
    return bool;
  }

  public static boolean aXh()
  {
    AppMethodBeat.i(14850);
    boolean bool = h.aXn().getBoolean("preload_data_noexpire", false);
    AppMethodBeat.o(14850);
    return bool;
  }

  public static boolean aXi()
  {
    AppMethodBeat.i(14851);
    boolean bool = h.aXn().getBoolean("preload_save_type", false);
    AppMethodBeat.o(14851);
    return bool;
  }

  public static int aXj()
  {
    AppMethodBeat.i(14852);
    int i = h.aXn().getInt("preload_tmpl_lowerbound", -1);
    AppMethodBeat.o(14852);
    return i;
  }

  public static boolean aXk()
  {
    AppMethodBeat.i(14853);
    boolean bool = h.aXn().getBoolean("preload_tmpl_test_noredir", false);
    AppMethodBeat.o(14853);
    return bool;
  }

  public static boolean aXl()
  {
    AppMethodBeat.i(14854);
    boolean bool = h.aXn().getBoolean("preload_tmpl_test_no_preload_next", false);
    AppMethodBeat.o(14854);
    return bool;
  }

  public static boolean aXm()
  {
    AppMethodBeat.i(14855);
    boolean bool = h.aXn().getBoolean("preload_tmpl_test_no_red", false);
    AppMethodBeat.o(14855);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.g.a
 * JD-Core Version:    0.6.2
 */