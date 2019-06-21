package com.tencent.mm.plugin.topstory.ui.video.list;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class e extends com.tencent.mm.plugin.topstory.ui.video.e
{
  boolean sGI;
  boolean sGJ;
  boolean sGP;
  h sGQ;

  public e(b paramb)
  {
    super(paramb);
  }

  public final int FG(int paramInt)
  {
    AppMethodBeat.i(2032);
    int i = getHeadersCount();
    if (bo.ek(((b)this.sDo).cGg().FL(paramInt - i).wiH))
    {
      paramInt = 0;
      AppMethodBeat.o(2032);
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      AppMethodBeat.o(2032);
    }
  }

  public final void j(List<chw> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(2031);
    super.j(paramList, paramBoolean);
    al.d(new e.1(this, paramList, paramBoolean));
    AppMethodBeat.o(2031);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.e
 * JD-Core Version:    0.6.2
 */