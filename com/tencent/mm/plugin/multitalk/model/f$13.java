package com.tencent.mm.plugin.multitalk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;

final class f$13
  implements Runnable
{
  f$13(f paramf, MultiTalkGroup paramMultiTalkGroup)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53951);
    String str1 = this.oGE.Aqc;
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = this.oGE.Aqd;
    p.bSe().oFP.Sa(str2);
    AppMethodBeat.o(53951);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.f.13
 * JD-Core Version:    0.6.2
 */