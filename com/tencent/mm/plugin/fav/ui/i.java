package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.fav.a.am.a;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.g.a.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.util.LinkedList;
import java.util.List;

public final class i
{
  public static void a(Context paramContext, String paramString, com.tencent.mm.plugin.fav.a.g paramg, aar paramaar, Runnable paramRunnable)
  {
    AppMethodBeat.i(74132);
    if (paramContext == null)
    {
      ab.w("MicroMsg.FavSendLogic", "want to send fav file, but context is null");
      AppMethodBeat.o(74132);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.FavSendLogic", "want to send fav file, but to user is null");
        AppMethodBeat.o(74132);
      }
      else
      {
        if (paramg == null)
          ab.w("MicroMsg.FavSendLogic", "want to send fav file, but info is null");
        if (paramaar == null)
        {
          ab.w("MicroMsg.FavSendLogic", "want to send fav file, but dataItem is null");
          AppMethodBeat.o(74132);
        }
        else
        {
          com.tencent.mm.kernel.g.RS().aa(new i.4(paramString, paramg, paramaar, paramRunnable));
          AppMethodBeat.o(74132);
        }
      }
    }
  }

  public static void a(Context paramContext, String paramString, aar paramaar, Runnable paramRunnable)
  {
    AppMethodBeat.i(74131);
    if (paramContext == null)
    {
      ab.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
      AppMethodBeat.o(74131);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
        AppMethodBeat.o(74131);
      }
      else if (paramaar == null)
      {
        ab.w("MicroMsg.FavSendLogic", "want to send fav video, but dataItem is null");
        AppMethodBeat.o(74131);
      }
      else
      {
        com.tencent.mm.kernel.g.RS().aa(new i.3(paramaar, paramContext, paramString, paramRunnable));
        AppMethodBeat.o(74131);
      }
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2, com.tencent.mm.plugin.fav.a.g paramg, Runnable paramRunnable)
  {
    AppMethodBeat.i(74129);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramg);
    a(paramContext, paramString1, paramString2, localLinkedList, paramRunnable);
    AppMethodBeat.o(74129);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, List<com.tencent.mm.plugin.fav.a.g> paramList, Runnable paramRunnable)
  {
    AppMethodBeat.i(74130);
    if (paramContext == null)
    {
      ab.w("MicroMsg.FavSendLogic", "want to send fav msg, but context is null");
      al.d(paramRunnable);
      AppMethodBeat.o(74130);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString1))
      {
        ab.w("MicroMsg.FavSendLogic", "want to send fav msg, but to user is null");
        al.d(paramRunnable);
        AppMethodBeat.o(74130);
      }
      else if (paramList.isEmpty())
      {
        ab.w("MicroMsg.FavSendLogic", "want to send fav msg, but info is null");
        al.d(paramRunnable);
        AppMethodBeat.o(74130);
      }
      else
      {
        d.xDH.ak(new i.1(paramString1, paramList, paramContext, paramString2, paramRunnable));
        AppMethodBeat.o(74130);
      }
    }
  }

  public static String i(aar paramaar)
  {
    AppMethodBeat.i(74133);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fav.a.b.c(paramaar));
    if (localb.exists());
    for (paramaar = j.w(localb.dMD()); ; paramaar = com.tencent.mm.plugin.fav.a.b.bue() + com.tencent.mm.a.g.x(bo.bc(paramaar.cvq, "").getBytes()))
    {
      AppMethodBeat.o(74133);
      return paramaar;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.i
 * JD-Core Version:    0.6.2
 */