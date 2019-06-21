package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum JsApiLaunchMiniProgram$LaunchPreconditionTask$a
{
  public final String bzH;

  static
  {
    AppMethodBeat.i(131329);
    hQO = new a("FAIL", 0, "fail");
    hQP = new a("FAIL_MORE_THAN_ONE_TASK", 1, "fail can not launch more than 1 mini program");
    hQQ = new a("OK", 2, "ok");
    hQR = new a[] { hQO, hQP, hQQ };
    AppMethodBeat.o(131329);
  }

  private JsApiLaunchMiniProgram$LaunchPreconditionTask$a(String paramString)
  {
    this.bzH = paramString;
  }

  public static a ou(int paramInt)
  {
    AppMethodBeat.i(131328);
    a[] arrayOfa = values();
    int i = arrayOfa.length;
    int j = 0;
    a locala;
    if (j < i)
    {
      locala = arrayOfa[j];
      if (paramInt == locala.ordinal())
        AppMethodBeat.o(131328);
    }
    while (true)
    {
      return locala;
      j++;
      break;
      locala = null;
      AppMethodBeat.o(131328);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiLaunchMiniProgram.LaunchPreconditionTask.a
 * JD-Core Version:    0.6.2
 */