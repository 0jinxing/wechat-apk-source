package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.appbrand.aa;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.ui.ae;

public final class AppBrandNearbyWebViewUI extends WebViewUI
{
  private static Boolean evG = null;

  // ERROR //
  public static boolean Mt()
  {
    // Byte code:
    //   0: sipush 17072
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 10	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:evG	Ljava/lang/Boolean;
    //   9: ifnonnull +69 -> 78
    //   12: new 26	java/io/FileInputStream
    //   15: astore_0
    //   16: new 28	java/io/File
    //   19: astore_1
    //   20: aload_1
    //   21: invokestatic 34	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   24: ldc 36
    //   26: invokespecial 39	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   29: aload_0
    //   30: aload_1
    //   31: invokespecial 42	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   34: aload_0
    //   35: astore_1
    //   36: new 44	java/util/Properties
    //   39: astore_2
    //   40: aload_0
    //   41: astore_1
    //   42: aload_2
    //   43: invokespecial 45	java/util/Properties:<init>	()V
    //   46: aload_0
    //   47: astore_1
    //   48: aload_2
    //   49: aload_0
    //   50: invokevirtual 49	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   53: aload_0
    //   54: astore_1
    //   55: aload_2
    //   56: ldc 51
    //   58: ldc 53
    //   60: invokevirtual 57	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   63: ldc 59
    //   65: invokevirtual 65	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   68: invokestatic 71	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   71: putstatic 10	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:evG	Ljava/lang/Boolean;
    //   74: aload_0
    //   75: invokevirtual 74	java/io/FileInputStream:close	()V
    //   78: getstatic 10	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:evG	Ljava/lang/Boolean;
    //   81: invokevirtual 77	java/lang/Boolean:booleanValue	()Z
    //   84: istore_3
    //   85: sipush 17072
    //   88: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   91: iload_3
    //   92: ireturn
    //   93: astore_1
    //   94: aconst_null
    //   95: astore_0
    //   96: aload_0
    //   97: astore_1
    //   98: getstatic 83	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   101: putstatic 10	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:evG	Ljava/lang/Boolean;
    //   104: aload_0
    //   105: ifnull -27 -> 78
    //   108: aload_0
    //   109: invokevirtual 74	java/io/FileInputStream:close	()V
    //   112: goto -34 -> 78
    //   115: astore_1
    //   116: goto -38 -> 78
    //   119: astore_1
    //   120: aconst_null
    //   121: astore_0
    //   122: aload_0
    //   123: ifnull +7 -> 130
    //   126: aload_0
    //   127: invokevirtual 74	java/io/FileInputStream:close	()V
    //   130: sipush 17072
    //   133: invokestatic 80	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_1
    //   137: athrow
    //   138: astore_1
    //   139: goto -61 -> 78
    //   142: astore_0
    //   143: goto -13 -> 130
    //   146: astore_2
    //   147: aload_1
    //   148: astore_0
    //   149: aload_2
    //   150: astore_1
    //   151: goto -29 -> 122
    //   154: astore_1
    //   155: goto -59 -> 96
    //
    // Exception table:
    //   from	to	target	type
    //   12	34	93	java/lang/Exception
    //   108	112	115	java/lang/Exception
    //   12	34	119	finally
    //   74	78	138	java/lang/Exception
    //   126	130	142	java/lang/Exception
    //   36	40	146	finally
    //   42	46	146	finally
    //   48	53	146	finally
    //   55	74	146	finally
    //   98	104	146	finally
    //   36	40	154	java/lang/Exception
    //   42	46	154	java/lang/Exception
    //   48	53	154	java/lang/Exception
    //   55	74	154	java/lang/Exception
  }

  public final void aMh()
  {
    AppMethodBeat.i(17070);
    super.aMh();
    xE(-855310);
    AppMethodBeat.o(17070);
  }

  public final int aMi()
  {
    AppMethodBeat.i(17071);
    int i;
    if ((Build.VERSION.SDK_INT >= 23) && ((!h.Ms()) || (!Mt())))
    {
      ae.f(getWindow());
      i = -855310;
      AppMethodBeat.o(17071);
    }
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT >= 21)
      {
        i = aa.gQs;
        AppMethodBeat.o(17071);
      }
      else
      {
        i = super.aMi();
        AppMethodBeat.o(17071);
      }
    }
  }

  public final boolean aMj()
  {
    return true;
  }

  public final void initView()
  {
    AppMethodBeat.i(17069);
    super.initView();
    AppMethodBeat.o(17069);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17067);
    if (getIntent() != null)
    {
      getIntent().putExtra("forceHideShare", true);
      getIntent().putExtra("disable_bounce_scroll", true);
      getIntent().putExtra("show_long_click_popup_menu", false);
      getIntent().putExtra("key_load_js_without_delay", true);
      getIntent().putExtra("geta8key_scene", 41);
    }
    super.onCreate(paramBundle);
    setResult(-1);
    AppMethodBeat.o(17067);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void setMMTitle(String paramString)
  {
    AppMethodBeat.i(17068);
    super.setMMTitle(paramString);
    ta(-16777216);
    AppMethodBeat.o(17068);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyWebViewUI
 * JD-Core Version:    0.6.2
 */