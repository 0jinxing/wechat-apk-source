package com.tencent.mm.plugin.game.commlib;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
{
  private static LinkedList<String> mTx;
  private static final String mTy;
  private static final String mTz;

  static
  {
    AppMethodBeat.i(116988);
    mTx = new LinkedList();
    mTy = ah.getPackageName();
    mTz = ah.getPackageName() + ":tools";
    mTx.add(mTz);
    AppMethodBeat.o(116988);
  }

  public static void NL(String paramString)
  {
    AppMethodBeat.i(116986);
    if ((paramString.equals(mTy)) || (mTx.contains(paramString)))
      a.bDc();
    AppMethodBeat.o(116986);
  }

  public static void bDo()
  {
    AppMethodBeat.i(116987);
    Iterator localIterator = mTx.iterator();
    while (localIterator.hasNext())
      f.a((String)localIterator.next(), null, e.a.class, null);
    AppMethodBeat.o(116987);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.e
 * JD-Core Version:    0.6.2
 */