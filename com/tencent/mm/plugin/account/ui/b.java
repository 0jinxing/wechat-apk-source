package com.tencent.mm.plugin.account.ui;

import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.b;

public abstract class b extends SecurityImage.b
{
  m gAi = null;
  SecurityImage gue = null;

  public abstract m a(m paramm, String paramString);

  public final void apw()
  {
    g.Rg().a(a(this.gAi, ""), 0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.b
 * JD-Core Version:    0.6.2
 */