package com.tencent.mm.plugin.topstory.ui.video.fs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.e;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;

public final class i extends e
{
  protected b sDN;
  boolean sGI;
  boolean sGJ;
  g sGK;

  public i(b paramb)
  {
    super(paramb);
    this.sDN = paramb;
  }

  public final int FG(int paramInt)
  {
    return 0;
  }

  public final void j(List<chw> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(2009);
    super.j(paramList, paramBoolean);
    al.d(new i.1(this, paramList, paramBoolean));
    AppMethodBeat.o(2009);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.i
 * JD-Core Version:    0.6.2
 */