package com.tencent.mm.modelsimple;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class q$a
{
  public String cEh;
  public String cxb;
  public String fPp;
  public Bundle fPq;
  public int type;
  public String username;

  public final String toString()
  {
    AppMethodBeat.i(123440);
    String str = String.format("AuthBioInfo hash[%d], type[%d]. username[%s], ticket[%s], helpUrlp[%s], wording[%s], extra[%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.type), this.username, bo.anv(this.cxb), this.fPp, this.cEh, this.fPq });
    AppMethodBeat.o(123440);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.q.a
 * JD-Core Version:    0.6.2
 */