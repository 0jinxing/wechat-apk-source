package com.tencent.mm.ui.chatting;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class x
  implements aq
{
  public a cgL;
  public aa yLx;

  public x(a parama)
  {
    AppMethodBeat.i(30904);
    this.cgL = parama;
    this.yLx = new aa();
    AppMethodBeat.o(30904);
  }

  private void aL(bi parambi)
  {
    AppMethodBeat.i(30908);
    if (parambi == null)
      AppMethodBeat.o(30908);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(parambi);
      eV(localArrayList);
      AppMethodBeat.o(30908);
    }
  }

  private void eV(List<bi> paramList)
  {
    AppMethodBeat.i(30909);
    if ((this.yLx != null) && (this.cgL != null))
      this.yLx.a(this.cgL.yTx.getContext(), paramList);
    AppMethodBeat.o(30909);
  }

  public final void L(List<bi> paramList)
  {
    AppMethodBeat.i(30906);
    if (this.cgL == null)
    {
      ab.w("MicroMsg.ChattingUIKeywordChecker", "chatting ui is null.");
      AppMethodBeat.o(30906);
    }
    while (true)
    {
      return;
      if (t.kH(this.cgL.getTalkerUserName()))
      {
        AppMethodBeat.o(30906);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          bi localbi = (bi)paramList.next();
          if ((localbi.field_talker.equals(this.cgL.getTalkerUserName())) && (localbi.isText()))
            localArrayList.add(localbi);
        }
        eV(localArrayList);
        AppMethodBeat.o(30906);
      }
    }
  }

  public final void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle)
  {
  }

  public final void a(bi parambi)
  {
    AppMethodBeat.i(30905);
    if (this.cgL.aF(r.class) == null)
    {
      ab.w("MicroMsg.ChattingUIKeywordChecker", "chatting ui maybe has exit!");
      AppMethodBeat.o(30905);
    }
    while (true)
    {
      return;
      ((r)this.cgL.aF(r.class)).dEm();
      if ((!parambi.field_talker.equals(this.cgL.getTalkerUserName())) || (!parambi.isText()))
      {
        AppMethodBeat.o(30905);
      }
      else
      {
        aL(parambi);
        AppMethodBeat.o(30905);
      }
    }
  }

  public final void ard(String paramString)
  {
    AppMethodBeat.i(30907);
    if (ah.isNullOrNil(paramString))
      AppMethodBeat.o(30907);
    while (true)
    {
      return;
      bi localbi = new bi();
      localbi.setContent(paramString);
      localbi.hO(1);
      aL(localbi);
      AppMethodBeat.o(30907);
    }
  }

  public final Looper getLooper()
  {
    AppMethodBeat.i(30910);
    Looper localLooper = Looper.getMainLooper();
    AppMethodBeat.o(30910);
    return localLooper;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.x
 * JD-Core Version:    0.6.2
 */