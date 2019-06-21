package com.tencent.mm.bf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.h;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.o;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class d
  implements com.tencent.mm.ai.f
{
  public static int chatType;
  private static final com.tencent.mm.a.f<Integer, d.a> emX;
  private static d fQD;
  private int fLW = 3;
  public boolean fpA = false;

  static
  {
    AppMethodBeat.i(116553);
    emX = new h(5);
    chatType = 0;
    AppMethodBeat.o(116553);
  }

  public static d ajP()
  {
    AppMethodBeat.i(116548);
    if (fQD == null)
      fQD = new d();
    d locald = fQD;
    AppMethodBeat.o(116548);
    return locald;
  }

  public static void ajQ()
  {
    AppMethodBeat.i(116551);
    g.RQ();
    g.RP().Ry().set(16646145, Integer.valueOf(0));
    AppMethodBeat.o(116551);
  }

  public static void ajR()
  {
    AppMethodBeat.i(116552);
    g.RQ();
    Integer localInteger1 = Integer.valueOf(bo.h((Integer)g.RP().Ry().get(16646145, null)));
    Integer localInteger2 = localInteger1;
    if (localInteger1.intValue() < 0)
      localInteger2 = Integer.valueOf(0);
    g.RQ();
    g.RP().Ry().set(16646145, Integer.valueOf(localInteger2.intValue() + 1));
    AppMethodBeat.o(116552);
  }

  public static String getPrefix()
  {
    String str;
    switch (chatType)
    {
    default:
      str = "single_";
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return str;
      str = "single_";
      continue;
      str = "chatroom_";
      continue;
      str = "app_";
    }
  }

  public static int tF(String paramString)
  {
    int i = 5;
    AppMethodBeat.i(116547);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(116547);
    while (true)
    {
      return i;
      if ((!paramString.startsWith("single")) || (paramString.startsWith("chatroom")))
        i = 7;
      if (paramString.startsWith("app"))
        i = 8;
      ab.d("upload", "type ".concat(String.valueOf(i)));
      AppMethodBeat.o(116547);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(116550);
    if ((!(paramm instanceof o)) || (((o)paramm).acR() != 9))
    {
      ab.d("upload", "another scene");
      AppMethodBeat.o(116550);
      return;
    }
    if (paramm.getType() == 159)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label93;
      g.RQ();
      g.RP().Ry().set(81944, Long.valueOf(bo.anT()));
    }
    while (true)
    {
      release();
      AppMethodBeat.o(116550);
      break;
      label93: paramInt1 = this.fLW - 1;
      this.fLW = paramInt1;
      if (paramInt1 < 0)
      {
        g.RQ();
        g.RP().Ry().set(81944, Long.valueOf((bo.anU() - 86400000L + 3600000L) / 1000L));
        this.fLW = 3;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(116549);
    this.fpA = false;
    g.Rg().b(159, this);
    AppMethodBeat.o(116549);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.d
 * JD-Core Version:    0.6.2
 */