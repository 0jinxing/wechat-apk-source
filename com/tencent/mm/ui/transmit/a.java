package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.os.Looper;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.a.h;
import com.tencent.mm.ui.contact.a.i;
import com.tencent.mm.ui.contact.a.j;
import com.tencent.mm.ui.contact.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a extends o
{
  private int count;
  HashSet<String> gnG;
  ak handler;
  com.tencent.mm.plugin.fts.a.l plf;
  List<String> zID;
  List<com.tencent.mm.plugin.fts.a.a.a> zIE;
  List<a> zIF;

  public a(com.tencent.mm.ui.contact.l paraml, List<String> paramList, int paramInt)
  {
    super(paraml, null, true, true, paramInt);
    AppMethodBeat.i(35025);
    this.handler = new ak(Looper.getMainLooper());
    this.plf = new a.1(this);
    this.count = 0;
    this.zID = paramList;
    this.zIF = new ArrayList();
    this.gnG = new HashSet();
    AppMethodBeat.o(35025);
  }

  private boolean PN(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(35030);
    int i = paramInt - this.zmV.getContentLV().getHeaderViewsCount();
    int j = this.zIF.size() - 1;
    boolean bool2 = bool1;
    a locala;
    if (j >= 0)
    {
      locala = (a)this.zIF.get(j);
      if (locala.mFd != i)
        break label247;
      if (locala.mFg)
      {
        paramInt = this.zmV.getContentLV().getSelectedItemPosition();
        locala.mFg = false;
        dKd();
        this.zmV.getContentLV().setSelection(paramInt);
        label112: notifyDataSetChanged();
        bool2 = true;
      }
    }
    else
    {
      label119: AppMethodBeat.o(35030);
      return bool2;
    }
    locala.mFg = true;
    j = 0;
    label136: com.tencent.mm.plugin.fts.a.a.l locall;
    if (j < locala.mEy.size())
    {
      locall = (com.tencent.mm.plugin.fts.a.a.l)locala.mEy.get(j);
      if ((!locall.mDx.equals(locala.zII)) || (j <= 2));
    }
    while (true)
    {
      if (locall != null)
      {
        locala.mEy.remove(j);
        locala.mEy.add(0, locall);
      }
      dKd();
      this.zmV.getContentLV().setSelection(paramInt);
      break label112;
      j++;
      break label136;
      label247: if (i == locala.mFb)
      {
        bool2 = true;
        break label119;
      }
      if (paramInt > locala.mFb)
      {
        paramInt = locala.mFb;
        locall = (com.tencent.mm.plugin.fts.a.a.l)locala.mEy.get(i - paramInt - 1);
        if (!locall.mDx.equals("no_result​"))
        {
          MMCreateChatroomUI localMMCreateChatroomUI = (MMCreateChatroomUI)this.zmV;
          if (!ah.isNullOrNil(locala.zII))
            if (locala.zII.equals(locall.mDx))
            {
              localMMCreateChatroomUI.opo.ajr(locala.zII);
              this.gnG.remove(locala.zII);
              locala.zII = null;
            }
          while (true)
          {
            localMMCreateChatroomUI.Kt();
            notifyDataSetChanged();
            bool2 = true;
            break;
            if (this.gnG.contains(locall.mDx))
              break label535;
            this.gnG.remove(locala.zII);
            localMMCreateChatroomUI.opo.ajr(locala.zII);
            locala.zII = locall.mDx;
            localMMCreateChatroomUI.opo.bU(locala.zII, false);
            this.gnG.add(locala.zII);
            continue;
            if (this.gnG.contains(locall.mDx))
              break label535;
            localMMCreateChatroomUI.opo.bU(locall.mDx, false);
            locala.zII = locall.mDx;
            this.gnG.add(locala.zII);
          }
        }
      }
      else
      {
        j--;
        break;
      }
      label535: bool2 = true;
      break label119;
      locall = null;
      j = 0;
    }
  }

  public final boolean Po(int paramInt)
  {
    AppMethodBeat.i(35029);
    boolean bool = PN(paramInt);
    AppMethodBeat.o(35029);
    return bool;
  }

  final void dKd()
  {
    AppMethodBeat.i(35028);
    Iterator localIterator = this.zIF.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.mEy.size() <= 0)
        break label139;
      locala.mFb = i;
      i++;
      if (locala.mEy.size() > 3)
      {
        if (locala.mFg)
          i += 3;
        while (true)
        {
          locala.mFd = i;
          i++;
          break;
          i += locala.mEy.size();
        }
      }
      i = locala.mEy.size() + i;
    }
    label139: 
    while (true)
    {
      break;
      this.count = i;
      clearCache();
      notifyDataSetChanged();
      AppMethodBeat.o(35028);
      return;
    }
  }

  public final List<String> dKe()
  {
    AppMethodBeat.i(35031);
    HashSet localHashSet = new HashSet();
    Object localObject = this.zIF.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if (!ah.isNullOrNil(locala.zII))
        localHashSet.add(locala.zII);
    }
    localObject = new ArrayList();
    ((List)localObject).addAll(localHashSet);
    AppMethodBeat.o(35031);
    return localObject;
  }

  public final void finish()
  {
    AppMethodBeat.i(35026);
    super.finish();
    Iterator localIterator = this.zIE.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fts.a.a.a locala = (com.tencent.mm.plugin.fts.a.a.a)localIterator.next();
      ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(locala);
    }
    AppMethodBeat.o(35026);
  }

  public final int getCount()
  {
    return this.count;
  }

  public final com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(35027);
    Object localObject = null;
    int i = this.zIF.size() - 1;
    a locala;
    if (i >= 0)
    {
      locala = (a)this.zIF.get(i);
      if (locala.mFb == paramInt)
      {
        localObject = new h(paramInt);
        ((h)localObject).mKQ = this.zmV.getActivity().getString(2131302896, new Object[] { locala.query });
        label87: if (localObject == null)
          break label277;
        ((com.tencent.mm.ui.contact.a.a)localObject).query = locala.query;
        ((com.tencent.mm.ui.contact.a.a)localObject).scene = this.scene;
        ((com.tencent.mm.ui.contact.a.a)localObject).zmW = true;
      }
    }
    while (true)
    {
      AppMethodBeat.o(35027);
      return localObject;
      if (locala.mFd == paramInt)
      {
        localObject = new j(paramInt);
        ((j)localObject).resId = 2131300106;
        ((j)localObject).mJY = locala.mFg;
        break label87;
      }
      if (paramInt > locala.mFb)
      {
        int j = paramInt - locala.mFb - 1;
        com.tencent.mm.plugin.fts.a.a.l locall = (com.tencent.mm.plugin.fts.a.a.l)locala.mEy.get(j);
        if (locall.mDx.equals("no_result​"))
        {
          localObject = new i(paramInt);
          break label87;
        }
        localObject = new e(paramInt);
        ((e)localObject).hpS = locall;
        ((com.tencent.mm.ui.contact.a.a)localObject).mDz = locala.mDz;
        ((e)localObject).eDk = true;
        ((e)localObject).mFm = (j + 1);
        ((e)localObject).ej(((e)localObject).hpS.type, ((e)localObject).hpS.mDw);
        break label87;
        label277: i--;
        break;
      }
      break label87;
    }
  }

  final class a
  {
    com.tencent.mm.plugin.fts.a.a.g mDz;
    List<com.tencent.mm.plugin.fts.a.a.l> mEy;
    int mFb = 2147483647;
    int mFd = 2147483647;
    boolean mFg = true;
    String query;
    String zII;

    private a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.a
 * JD-Core Version:    0.6.2
 */