package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsBlackDetailUI extends SnsTagDetailUI
  implements f, n.b
{
  private static List<String> csR()
  {
    AppMethodBeat.i(38744);
    new LinkedList();
    List localList = t.Zn();
    AppMethodBeat.o(38744);
    return localList;
  }

  protected final void bKl()
  {
    AppMethodBeat.i(38743);
    if (((this.rxA + " " + bo.c(this.kPL, ",")).equals(this.cvZ)) && (this.qJQ != 0L))
    {
      finish();
      AppMethodBeat.o(38743);
    }
    while (true)
    {
      return;
      if (af.cnL().v(this.qJQ, this.rxA))
      {
        h.b(this, getString(2131303790, new Object[] { this.rxA }), getString(2131297061), true);
        AppMethodBeat.o(38743);
      }
      else
      {
        Object localObject1 = csS();
        LinkedList localLinkedList = new LinkedList();
        Object localObject2 = new LinkedList();
        Iterator localIterator = ((List)localObject1).iterator();
        String str;
        while (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          if (!this.kPL.contains(str))
            localLinkedList.add(str);
        }
        localIterator = this.kPL.iterator();
        while (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          if (!((List)localObject1).contains(str))
            ((List)localObject2).add(str);
        }
        localObject1 = localLinkedList.iterator();
        while (((Iterator)localObject1).hasNext())
          t.v((String)((Iterator)localObject1).next(), false);
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
          t.v((String)((Iterator)localObject2).next(), true);
        com.tencent.mm.plugin.sns.c.a.gkF.BS();
        finish();
        AppMethodBeat.o(38743);
      }
    }
  }

  public final void csO()
  {
    AppMethodBeat.i(38739);
    ab.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI __onCreate");
    g.RQ();
    ((j)g.K(j.class)).XM().a(this);
    AppMethodBeat.o(38739);
  }

  protected final void csP()
  {
    AppMethodBeat.i(38740);
    ab.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI __onDestroy");
    g.RQ();
    if (g.RN().QY())
    {
      g.RQ();
      ((j)g.K(j.class)).XM().b(this);
    }
    AppMethodBeat.o(38740);
  }

  protected final void csQ()
  {
  }

  protected final List<String> csS()
  {
    AppMethodBeat.i(38745);
    Object localObject = new LinkedList();
    if (this.qJQ == 4L)
    {
      localObject = csR();
      AppMethodBeat.o(38745);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(38745);
    }
  }

  protected final void dr(List<String> paramList)
  {
    AppMethodBeat.i(38747);
    bd localbd = af.cnt();
    String str1 = r.Yz();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str2 = (String)paramList.next();
      if ((!this.kPL.contains(str2)) && (com.tencent.mm.n.a.jh(localbd.aoO(str2).field_type)) && (!str1.equals(str2)))
        this.kPL.add(str2);
    }
    if (this.ehS != null)
      this.ehS.ci(this.kPL);
    updateTitle();
    AppMethodBeat.o(38747);
  }

  protected final void km(String paramString)
  {
    AppMethodBeat.i(38746);
    super.km(paramString);
    AppMethodBeat.o(38746);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38741);
    super.onCreate(paramBundle);
    ab.d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI onCreate");
    AppMethodBeat.o(38741);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38742);
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    g.RQ();
    g.RO().eJo.b(290, this);
    g.RQ();
    g.RO().eJo.b(291, this);
    g.RQ();
    g.RO().eJo.b(292, this);
    g.RQ();
    g.RO().eJo.b(293, this);
    g.RQ();
    if (g.RN().QY())
    {
      g.RQ();
      ((j)g.K(j.class)).XM().b(this);
    }
    super.onDestroy();
    AppMethodBeat.o(38742);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(38748);
    ab.i("MicroMsg.SnsBlackDetailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    AppMethodBeat.o(38748);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI
 * JD-Core Version:    0.6.2
 */