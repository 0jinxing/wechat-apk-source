package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.e.b;
import com.tencent.mm.sdk.platformtools.bo;

final class SnsUserUI$14 extends b
{
  SnsUserUI$14(SnsUserUI paramSnsUserUI)
  {
  }

  public final void a(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(39805);
    super.a(paramString, paramLong, paramInt);
    if ((paramInt > 0) && (!bo.isNullOrNil(paramString)) && (paramString.endsWith(this.rDa.getClass().getSimpleName())))
      SnsUserUI.a(this.rDa, SnsUserUI.j(this.rDa) + paramInt);
    AppMethodBeat.o(39805);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.14
 * JD-Core Version:    0.6.2
 */