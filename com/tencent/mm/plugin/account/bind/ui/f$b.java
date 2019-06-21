package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.b;

final class f$b extends SecurityImage.b
{
  f$b(f paramf)
  {
  }

  public final void apw()
  {
    AppMethodBeat.i(13756);
    this.gul.Xy();
    aa localaa = new aa(5, this.gul.guf, this.gul.gue.getSecImgSid(), this.gul.gue.getSecImgCode(), this.gul.gue.getSecImgEncryptKey(), true, 1);
    g.Rg().a(localaa, 0);
    AppMethodBeat.o(13756);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.f.b
 * JD-Core Version:    0.6.2
 */