package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.ui.k;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MMCreateChatroomUI extends MMBaseSelectContactUI
{
  private int scene;
  private List<String> zID;
  private boolean zIM;
  a zIN;
  private b zIO;
  private boolean zIP;
  private boolean zoL;

  private static List<String> O(List<String> paramList)
  {
    AppMethodBeat.i(35054);
    LinkedList localLinkedList = new LinkedList();
    if (!aw.RK())
      AppMethodBeat.o(35054);
    while (true)
    {
      return localLinkedList;
      if (paramList == null)
      {
        AppMethodBeat.o(35054);
      }
      else
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          aw.ZK();
          ad localad = c.XM().aoO(str);
          paramList = str;
          if (localad != null)
          {
            paramList = str;
            if ((int)localad.ewQ != 0)
              paramList = localad.Oj();
          }
          localLinkedList.add(paramList);
        }
        AppMethodBeat.o(35054);
      }
    }
  }

  private void a(com.tencent.mm.roomsdk.a.c.a parama)
  {
    AppMethodBeat.i(35053);
    parama.d(new MMCreateChatroomUI.2(this, parama));
    getString(2131297061);
    parama.a(this, getString(2131300938), true, new MMCreateChatroomUI.3(this, parama));
    AppMethodBeat.o(35053);
  }

  public final void Kh()
  {
    AppMethodBeat.i(35044);
    super.Kh();
    this.zID = getIntent().getStringArrayListExtra("query_phrase_list");
    this.zIM = getIntent().getBooleanExtra("go_to_chatroom_direct", false);
    this.scene = getIntent().getIntExtra("scene_from", 0);
    AppMethodBeat.o(35044);
  }

  public final void Kt()
  {
    AppMethodBeat.i(35046);
    List localList = this.zIN.dKe();
    if (localList.size() > 0)
    {
      updateOptionMenuText(1, getString(2131296994) + "(" + localList.size() + ")");
      if (localList.size() > 1)
      {
        enableOptionMenu(1, true);
        AppMethodBeat.o(35046);
      }
    }
    while (true)
    {
      return;
      enableOptionMenu(1, false);
      AppMethodBeat.o(35046);
      continue;
      updateOptionMenuText(1, getString(2131296994));
      enableOptionMenu(1, false);
      AppMethodBeat.o(35046);
    }
  }

  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(35052);
    if ((parama instanceof e))
    {
      Object localObject = (e)parama;
      parama = this.zIN;
      localObject = ((e)localObject).hpS.mDx;
      if (parama.gnG.contains(localObject))
      {
        bool = true;
        AppMethodBeat.o(35052);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(35052);
      continue;
      AppMethodBeat.o(35052);
    }
  }

  public final m aoA()
  {
    AppMethodBeat.i(35050);
    if (this.zIO == null)
      this.zIO = new b(this, this.scene);
    b localb = this.zIO;
    AppMethodBeat.o(35050);
    return localb;
  }

  public final boolean aow()
  {
    return false;
  }

  public final boolean aox()
  {
    return false;
  }

  public final String aoy()
  {
    AppMethodBeat.i(35048);
    String str = getString(2131302897);
    AppMethodBeat.o(35048);
    return str;
  }

  public final o aoz()
  {
    AppMethodBeat.i(35049);
    if (this.zIN == null)
      this.zIN = new a(this, this.zID, this.scene);
    a locala = this.zIN;
    AppMethodBeat.o(35049);
    return locala;
  }

  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(35051);
    int j;
    label90: boolean bool;
    if ((parama instanceof e))
    {
      Object localObject = (e)parama;
      a locala = this.zIN;
      localObject = ((e)localObject).hpS.mDx;
      int i = parama.position;
      if (locala.gnG.contains(localObject))
      {
        j = locala.zIF.size() - 1;
        if (j >= 0)
        {
          parama = (a.a)locala.zIF.get(j);
          if (i >= parama.mFb)
          {
            if (parama == null)
              break label128;
            if (((String)localObject).equals(parama.zII))
              break label140;
            bool = true;
            AppMethodBeat.o(35051);
          }
        }
      }
    }
    while (true)
    {
      return bool;
      j--;
      break;
      parama = null;
      break label90;
      label128: AppMethodBeat.o(35051);
      bool = false;
      continue;
      label140: AppMethodBeat.o(35051);
      bool = false;
      continue;
      AppMethodBeat.o(35051);
      bool = false;
    }
  }

  public final boolean dId()
  {
    return true;
  }

  public final void initView()
  {
    AppMethodBeat.i(35045);
    super.initView();
    a locala = this.zIN;
    Iterator localIterator = locala.zID.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      i locali = new i();
      locali.handler = locala.handler;
      locali.mEw = locala.plf;
      locali.query = ((String)localObject);
      locali.mEv = com.tencent.mm.plugin.fts.a.c.b.mEV;
      locali.mEr = new int[] { 131072 };
      locali.mEu.add("filehelper");
      locali.mEu.add(r.Yz());
      localObject = ((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).search(2, locali);
      locala.zIE = new ArrayList();
      locala.zIE.add(localObject);
    }
    a(1, getString(2131296994), new MMCreateChatroomUI.1(this), q.b.ymu);
    Kt();
    AppMethodBeat.o(35045);
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(35055);
    a locala = this.zIN;
    j localj = this.zIO.mEm;
    Object localObject = this.zIO.query;
    if ((localj.mEy.size() != 1) || (!((com.tencent.mm.plugin.fts.a.a.l)localj.mEy.get(0)).mDx.equals("no_result​")))
    {
      a.a locala1 = new a.a(locala, (byte)0);
      locala1.mEy = localj.mEy;
      locala1.mDz = localj.mDz;
      locala1.query = ((String)localObject);
      locala.zIF.add(locala1);
      int i = paramInt - locala.zmV.getContentLV().getHeaderViewsCount();
      if (i >= 3)
      {
        localObject = (com.tencent.mm.plugin.fts.a.a.l)localj.mEy.remove(i);
        localj.mEy.add(0, localObject);
        paramInt = locala.zmV.getContentLV().getHeaderViewsCount();
      }
      locala.dKd();
      i = locala1.mFb;
      locala.zmV.getContentLV().post(new a.2(locala, i + paramInt + 1));
    }
    dIb();
    dIc();
    aqX();
    AppMethodBeat.o(35055);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(35047);
    this.zIN.finish();
    if ((!this.zIP) && (this.scene == 3))
      k.hA(false);
    super.onDestroy();
    AppMethodBeat.o(35047);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void vI(String paramString)
  {
    AppMethodBeat.i(35056);
    a locala = this.zIN;
    locala.gnG.remove(paramString);
    Iterator localIterator = locala.zIF.iterator();
    while (localIterator.hasNext())
    {
      a.a locala1 = (a.a)localIterator.next();
      if (paramString.equals(locala1.zII))
        locala1.zII = null;
    }
    locala.notifyDataSetChanged();
    Kt();
    AppMethodBeat.o(35056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MMCreateChatroomUI
 * JD-Core Version:    0.6.2
 */