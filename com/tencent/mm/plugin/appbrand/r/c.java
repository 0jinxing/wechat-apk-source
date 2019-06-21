package com.tencent.mm.plugin.appbrand.r;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static LinkedList<e> eow;
  private static HashSet<c.a> iQR;
  private static boolean iQS;
  private static boolean iQT;

  static
  {
    AppMethodBeat.i(93777);
    eow = new LinkedList();
    iQR = new HashSet();
    iQS = false;
    iQT = false;
    AppMethodBeat.o(93777);
  }

  protected static String a(bi parambi, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(93775);
    if (parambi.field_isSend == 1)
    {
      paramString = r.Yz();
      AppMethodBeat.o(93775);
      return paramString;
    }
    String str = null;
    if (paramBoolean)
      str = bf.oy(parambi.field_content);
    if (bo.isNullOrNil(str));
    while (true)
    {
      AppMethodBeat.o(93775);
      break;
      paramString = str;
    }
  }

  public static void a(String paramString, c.a parama)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(93773);
        if (iQS)
        {
          iQR.add(parama);
          AppMethodBeat.o(93773);
          return;
        }
        if (iQT)
        {
          parama.z(eow);
          AppMethodBeat.o(93773);
          continue;
        }
      }
      finally
      {
      }
      iQS = true;
      iQR.add(parama);
      g.RQ();
      parama = g.RS();
      c.1 local1 = new com/tencent/mm/plugin/appbrand/r/c$1;
      local1.<init>(paramString);
      parama.aa(local1);
      AppMethodBeat.o(93773);
    }
  }

  private static void done()
  {
    try
    {
      AppMethodBeat.i(93774);
      ab.i("MicroMsg.AppBrandHistoryListLogic", "done");
      iQT = true;
      iQS = false;
      Iterator localIterator = iQR.iterator();
      while (localIterator.hasNext())
      {
        c.a locala = (c.a)localIterator.next();
        if (locala != null)
          locala.z(eow);
      }
    }
    finally
    {
    }
    iQR.clear();
    AppMethodBeat.o(93774);
  }

  public static boolean pY(int paramInt)
  {
    if ((33 == paramInt) || (36 == paramInt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void reset()
  {
    try
    {
      AppMethodBeat.i(93772);
      iQS = false;
      iQT = false;
      eow.clear();
      iQR.clear();
      AppMethodBeat.o(93772);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.c
 * JD-Core Version:    0.6.2
 */