package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import java.util.ArrayList;

public final class q
{
  private static ArrayList<cm> fJE;
  private static ArrayList<ad> fJF;

  static
  {
    AppMethodBeat.i(16517);
    fJE = new ArrayList();
    fJF = new ArrayList();
    AppMethodBeat.o(16517);
  }

  public static void cu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(16514);
    aw.RS().aa(new q.1(paramInt1, paramInt2));
    AppMethodBeat.o(16514);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.q
 * JD-Core Version:    0.6.2
 */