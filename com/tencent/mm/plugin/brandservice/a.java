package com.tencent.mm.plugin.brandservice;

import a.f.b.j;
import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/BizProcessorCommand;", "Lcom/tencent/mm/pluginsdk/cmd/ProcessorCommand;", "()V", "processCommand", "", "context", "Landroid/content/Context;", "args", "", "", "username", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "Companion", "plugin-brandservice_release"})
public final class a
  implements com.tencent.mm.pluginsdk.cmd.a
{
  private static final String jKe = "//biz";
  public static final a.a jKf;

  static
  {
    AppMethodBeat.i(14761);
    jKf = new a.a((byte)0);
    jKe = "//biz";
    AppMethodBeat.o(14761);
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(14760);
    if ((paramArrayOfString != null) && (j.j(jKe, paramArrayOfString[0])) && (j.j("openbiztimeline", paramArrayOfString[1])) && (paramArrayOfString.length > 2))
    {
      paramContext = as.eg("brandService", 1);
      paramContext.encode("BizTimeLineOpenStatus", bo.getInt(paramArrayOfString[2], -1));
      paramContext.apply();
      AppMethodBeat.o(14760);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(14760);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.a
 * JD-Core Version:    0.6.2
 */