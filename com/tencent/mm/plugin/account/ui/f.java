package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.b;

public final class f extends SecurityImage.b
{
  private static f gCM = null;
  public String account = null;
  public String gCK = null;
  public int gCL = 0;
  public String guf = null;
  public byte[] gug = null;
  public String guh = null;
  public String gui = null;

  public static void a(f paramf)
  {
    gCM = paramf;
  }

  public static String ara()
  {
    if (gCM != null);
    for (String str = gCM.account; ; str = null)
      return str;
  }

  public static String arb()
  {
    if (gCM != null);
    for (String str = gCM.guf; ; str = null)
      return str;
  }

  public final void apw()
  {
    AppMethodBeat.i(125006);
    q localq;
    if (!bo.isNullOrNil(this.gCK))
    {
      localq = new q(this.account, this.gCK, this.yrX.getSecCodeType(), "", "", "", 0, "", false, true);
      g.Rg().a(localq, 0);
      AppMethodBeat.o(125006);
    }
    while (true)
    {
      return;
      localq = new q(this.account, this.guf, this.yrX.getSecCodeType(), "", "", "", 0, "", false, false);
      g.Rg().a(localq, 0);
      AppMethodBeat.o(125006);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.f
 * JD-Core Version:    0.6.2
 */