package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/MPPageFastOpen;", "Lcom/tencent/mm/pluginsdk/cmd/ProcessorCommand;", "()V", "processCommand", "", "context", "Landroid/content/Context;", "args", "", "", "username", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "Companion", "plugin-brandservice_release"})
public final class g
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public static final g.a jSD;

  static
  {
    AppMethodBeat.i(14857);
    jSD = new g.a((byte)0);
    AppMethodBeat.o(14857);
  }

  public static final void axy()
  {
    AppMethodBeat.i(14858);
    com.tencent.mm.pluginsdk.cmd.b.a((com.tencent.mm.pluginsdk.cmd.a)new g(), new String[] { "//mpfast" });
    AppMethodBeat.o(14858);
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(14856);
    a.f.b.j.p(paramContext, "context");
    a.f.b.j.p(paramArrayOfString, "args");
    a.f.b.j.p(paramString, "username");
    if (a.f.b.j.j("//mpfast", paramArrayOfString[0]))
      if (paramArrayOfString.length < 2)
        AppMethodBeat.o(14856);
    while (true)
    {
      return bool;
      paramContext = paramArrayOfString[1];
      switch (paramContext.hashCode())
      {
      default:
      case 112785:
      case -905826493:
      case -309518737:
      case 1224424441:
      case 105006896:
      case 3564085:
      case 3076010:
      case 94746189:
      case 3569038:
      case 97196323:
      case 3522941:
      }
      while (true)
      {
        AppMethodBeat.o(14856);
        bool = true;
        break;
        if (paramContext.equals("red"))
        {
          h.aXn().removeValueForKey("preload_tmpl_test_no_red");
          j.FQ("disable test not in red");
          continue;
          if ((paramContext.equals("server")) && (goto 160) && (paramContext.equals("process")))
            if (paramArrayOfString.length <= 2)
            {
              h.aXn().putInt("preload_process", 1);
              j.FQ("use process tool success");
              continue;
              if (paramContext.equals("webview"))
                if (paramArrayOfString.length <= 2)
                {
                  h.aXn().putBoolean("preload_webview", true);
                  j.FQ("use preload webview");
                  continue;
                  if (!paramContext.equals("nored"))
                    continue;
                  h.aXn().putBoolean("preload_tmpl_test_no_red", true);
                  j.FQ("enable test not in red");
                  continue;
                  if ((!paramContext.equals("tmpl")) || (paramArrayOfString.length <= 2))
                    continue;
                  paramContext = paramArrayOfString[2];
                  switch (paramContext.hashCode())
                  {
                  default:
                  case 94746189:
                  case -1080348879:
                  case 107902:
                  }
                }
            }
            else
            {
              do
              {
                do
                {
                  do
                  {
                    if (!Pattern.compile("[0-9]+").matcher((CharSequence)paramArrayOfString[2]).matches())
                      break;
                    if (!a.f.b.j.j("0", paramArrayOfString[2]))
                      break label1469;
                    h.aXn().remove("preload_tmpl_lowerbound");
                    j.FQ("clear tmpl lowerbound");
                    break;
                    if (!paramContext.equals("data"))
                      break;
                    if (paramArrayOfString.length <= 2)
                    {
                      h.aXn().putBoolean("preload_data_null", false);
                      h.aXn().putBoolean("preload_data", true);
                      j.FQ("enable preload data");
                      break;
                      if (!paramContext.equals("clear"))
                        break;
                      h.aXn().clear();
                      j.FQ("clear all commands");
                      break;
                      if (!paramContext.equals("true"))
                        break;
                      if (paramArrayOfString.length <= 2)
                      {
                        h.aXn().putBoolean("preload_use", true);
                        h.aXn().putInt("preload_type", 1);
                        j.FQ("tmpl webview");
                        break;
                        if (!paramContext.equals("false"))
                          break;
                        h.aXn().putBoolean("preload_use", false);
                        j.FQ("not use tmpl webview");
                        break;
                        if (!paramContext.equals("save"))
                          break;
                        if (paramArrayOfString.length > 2)
                          break label1523;
                        h.aXn().putBoolean("preload_save_type", false);
                        j.FQ("save to data dir");
                        break;
                      }
                      h.aXn().putBoolean("preload_use", true);
                      paramContext = paramArrayOfString[2];
                      switch (paramContext.hashCode())
                      {
                      default:
                      case -905826493:
                      case -1012222381:
                      case 103145323:
                      }
                      do
                      {
                        do
                        {
                          do
                          {
                            h.aXn().putInt("preload_type", 1);
                            j.FQ("release can't use local tmpl, use online tmpl");
                            break;
                          }
                          while (!paramContext.equals("server"));
                          h.aXn().putInt("preload_type", 2);
                          j.FQ("test server tmpl");
                          break;
                        }
                        while (!paramContext.equals("online"));
                        h.aXn().putInt("preload_type", 1);
                        j.FQ("online tmpl");
                        break;
                      }
                      while (!paramContext.equals("local"));
                      if ((!f.IS_FLAVOR_RED) && (!f.DEBUG))
                        break;
                      h.aXn().putInt("preload_type", 3);
                      j.FQ("local tmpl");
                      break;
                      paramContext = paramArrayOfString[2];
                      switch (paramContext.hashCode())
                      {
                      default:
                        break;
                      case -1012222381:
                        if (!paramContext.equals("online"))
                          break;
                        h.aXn().putInt("preload_process", 4);
                        j.FQ("use process mm success");
                        break;
                      case 3488:
                        if (!paramContext.equals("mm"))
                          break;
                        h.aXn().putInt("preload_process", 3);
                        j.FQ("use process mm success");
                        break;
                      case -868060869:
                        if (!paramContext.equals("toolmp"))
                          break;
                        h.aXn().putInt("preload_process", 2);
                        j.FQ("use process toolmp success");
                        break;
                      case 3565976:
                        if (!paramContext.equals("tool"))
                          break;
                        h.aXn().putInt("preload_process", 1);
                        j.FQ("use process tool success");
                        break;
                        paramContext = paramArrayOfString[2];
                        switch (paramContext.hashCode())
                        {
                        default:
                          break;
                        case -1039871948:
                          if (!paramContext.equals("nonext"))
                            break;
                          h.aXn().putBoolean("preload_tmpl_test_no_preload_next", true);
                          j.FQ("disable preload next webview");
                          break;
                        case 3377907:
                          if (!paramContext.equals("next"))
                            break;
                          h.aXn().remove("preload_tmpl_test_no_preload_next");
                          j.FQ("enable preload next webview");
                          break;
                        case 2127382617:
                          if (!paramContext.equals("noredir"))
                            break;
                          h.aXn().putBoolean("preload_tmpl_test_noredir", true);
                          j.FQ("disable re-direct");
                          break;
                        case 3569038:
                          if (!paramContext.equals("true"))
                            break;
                          h.aXn().putBoolean("preload_webview", true);
                          j.FQ("use preload webview");
                          break;
                        case 97196323:
                          if (!paramContext.equals("false"))
                            break;
                          h.aXn().putBoolean("preload_webview", false);
                          j.FQ("not use preload webview");
                          break;
                        case 108389754:
                          if (!paramContext.equals("redir"))
                            break;
                          h.aXn().remove("preload_tmpl_test_noredir");
                          j.FQ("enable re-direct");
                        }
                        break;
                      }
                    }
                    paramContext = paramArrayOfString[2];
                    switch (paramContext.hashCode())
                    {
                    default:
                      break;
                    case -1289159393:
                      if (!paramContext.equals("expire"))
                        break;
                      h.aXn().remove("preload_data_noexpire");
                      j.FQ("enable data expire");
                      break;
                    case 3392903:
                      if (!paramContext.equals("null"))
                        break;
                      h.aXn().putBoolean("preload_data_null", true);
                      h.aXn().putBoolean("preload_data", false);
                      j.FQ("test preload null data");
                      break;
                    case 3569038:
                      if (!paramContext.equals("true"))
                        break;
                      h.aXn().putBoolean("preload_data_null", false);
                      h.aXn().putBoolean("preload_data", true);
                      j.FQ("enable preload data");
                      break;
                    case 97196323:
                      if (!paramContext.equals("false"))
                        break;
                      h.aXn().putBoolean("preload_data_null", false);
                      h.aXn().putBoolean("preload_data", false);
                      j.FQ("disable preload data");
                      break;
                    case 94746189:
                      if (!paramContext.equals("clear"))
                        break;
                      a.aWM();
                      j.FQ("clear all cached data");
                      break;
                    case 1170077216:
                      if (!paramContext.equals("noexpire"))
                        break;
                      h.aXn().putBoolean("preload_data_noexpire", true);
                      j.FQ("disable data expire");
                      break;
                    }
                  }
                  while (!paramContext.equals("clear"));
                  com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.clear();
                  j.FQ("clear all tmpl info");
                  break;
                }
                while (!paramContext.equals("md5off"));
                h.aXn().remove("preload_tmpl_always_verify_md5");
                j.FQ("disable tmpl md5 verify");
                break;
              }
              while (!paramContext.equals("md5"));
              h.aXn().putBoolean("preload_tmpl_always_verify_md5", true);
              j.FQ("enable tmpl md5 verify");
              continue;
              label1469: paramContext = h.aXn();
              paramString = Integer.valueOf(paramArrayOfString[2]);
              a.f.b.j.o(paramString, "Integer.valueOf(args[2])");
              paramContext.putInt("preload_tmpl_lowerbound", paramString.intValue());
              j.FQ("tmpl lowerbound: " + paramArrayOfString[2]);
              continue;
              label1523: paramContext = paramArrayOfString[2];
              switch (paramContext.hashCode())
              {
              default:
              case 3665:
              }
              do
              {
                h.aXn().putBoolean("preload_save_type", false);
                j.FQ("save to data dir");
                break;
              }
              while (!paramContext.equals("sd"));
              h.aXn().putBoolean("preload_save_type", true);
              j.FQ("save to sdcard dir");
            }
        }
      }
      AppMethodBeat.o(14856);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.g
 * JD-Core Version:    0.6.2
 */