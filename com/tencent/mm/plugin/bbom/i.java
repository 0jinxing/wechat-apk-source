package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bh;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.protocal.protobuf.bbe;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class i
  implements m
{
  private String jEs = null;

  public i(String paramString)
  {
    this.jEs = paramString;
  }

  public final void a(bbe parambbe, bi parambi)
  {
    AppMethodBeat.i(18259);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<msgsource>");
    localStringBuilder.append("<strangerantispamticket ticket=\"" + this.jEs + "\"></strangerantispamticket>");
    localStringBuilder.append(bo.nullAsNil(bh.aad()));
    if ((bo.isNullOrNil(parambbe.vEG)) || (!parambbe.vEG.startsWith("<msgsource>")));
    for (parambi = "<msgsource></msgsource>"; ; parambi = parambbe.vEG)
    {
      parambbe.vEG = parambi;
      parambbe.vEG = parambbe.vEG.replace("<msgsource>", localStringBuilder.toString());
      AppMethodBeat.o(18259);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.i
 * JD-Core Version:    0.6.2
 */