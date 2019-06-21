package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMHorList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h
{
  Context context;
  private String elp;
  private ak mHandler;
  private boolean mIsInit;
  h.c nMA;
  MMHorList nMx;
  h.a nMy;
  private int nMz;

  public h(Context paramContext, View paramView, String paramString)
  {
    AppMethodBeat.i(113504);
    this.mIsInit = false;
    this.elp = "";
    this.mHandler = new ak(Looper.getMainLooper());
    this.nMA = null;
    this.context = paramContext;
    this.nMx = ((MMHorList)paramView);
    this.elp = paramString;
    bJQ();
    AppMethodBeat.o(113504);
  }

  private void G(ArrayList<h.b> paramArrayList)
  {
    AppMethodBeat.i(113506);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      h.b localb = (h.b)localIterator.next();
      if (localb.nME)
        localb.bJT();
    }
    this.nMz = a.fromDPToPix(this.context, 60);
    this.nMx.setOverScrollEnabled(true);
    this.nMx.setItemWidth(this.nMz);
    this.nMx.setCenterInParent(true);
    this.nMx.setOnItemClickListener(new h.1(this));
    this.nMy = new h.a(this, paramArrayList);
    this.nMx.setAdapter(this.nMy);
    AppMethodBeat.o(113506);
  }

  private void PS(String paramString)
  {
    AppMethodBeat.i(113507);
    ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberEnter, usernmae=%s", new Object[] { paramString });
    if (this.nMy.PW(paramString))
      AppMethodBeat.o(113507);
    while (true)
    {
      return;
      paramString = new h.b(this, paramString);
      h.a locala = this.nMy;
      locala.nMD.add(paramString);
      locala.notifyDataSetChanged();
      this.nMx.invalidate();
      AppMethodBeat.o(113507);
    }
  }

  private void PT(String paramString)
  {
    AppMethodBeat.i(113508);
    ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberExit, username=%s", new Object[] { paramString });
    h.a locala;
    int i;
    if (this.nMy.PW(paramString))
    {
      locala = this.nMy;
      i = 0;
      if (i >= locala.nMD.size())
        break label107;
      if (!((h.b)locala.nMD.get(i)).username.equals(paramString))
        break label101;
    }
    while (true)
    {
      if (i != -1)
      {
        locala.nMD.remove(i);
        locala.notifyDataSetChanged();
      }
      this.nMx.invalidate();
      AppMethodBeat.o(113508);
      return;
      label101: i++;
      break;
      label107: i = -1;
    }
  }

  private void bJQ()
  {
    AppMethodBeat.i(113505);
    Object localObject = l.bJz().tP(this.elp);
    ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "initAvatarList, memebers.size=%d", new Object[] { Integer.valueOf(((List)localObject).size()) });
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!bo.isNullOrNil(str))
      {
        localArrayList1.add(new h.b(this, str));
        localArrayList2.add(str);
      }
    }
    G(localArrayList1);
    H(localArrayList2);
    this.nMx.invalidate();
    this.nMy.notifyDataSetChanged();
    AppMethodBeat.o(113505);
  }

  public final void H(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(113511);
    ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "onRefreshMemberList, members.size=%d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject1 = this.nMy.bJS();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (String)localIterator.next();
      if (((ArrayList)localObject1).indexOf(localObject2) == -1)
        localArrayList1.add(localObject2);
    }
    Object localObject2 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      if (paramArrayList.indexOf(localObject1) == -1)
        localArrayList2.add(localObject1);
    }
    ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "onRefreshMemberList, newMember.size=%d, removeMember.size=%d", new Object[] { Integer.valueOf(localArrayList1.size()), Integer.valueOf(localArrayList2.size()) });
    if (localArrayList1.size() > 0)
    {
      paramArrayList = localArrayList1.iterator();
      while (paramArrayList.hasNext())
        PS((String)paramArrayList.next());
    }
    if (localArrayList2.size() > 0)
    {
      paramArrayList = localArrayList2.iterator();
      while (paramArrayList.hasNext())
        PT((String)paramArrayList.next());
    }
    AppMethodBeat.o(113511);
  }

  public final void PU(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(113509);
    ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberTalk, username=%s", new Object[] { paramString });
    int j;
    if (this.nMy.PW(paramString))
    {
      this.nMy.PV(paramString).bJT();
      this.nMy.notifyDataSetChanged();
      this.nMx.invalidate();
      if ((this.nMx.getIsTouching()) || (bo.isNullOrNil(paramString)))
      {
        AppMethodBeat.o(113509);
        return;
      }
      h.a locala = this.nMy;
      j = 0;
      label89: if (j >= locala.nMD.size())
        break label255;
      if (!((h.b)locala.nMD.get(j)).username.equals(paramString))
        break label212;
    }
    label178: label212: label218: label249: label255: for (int k = j; ; k = -1)
    {
      ab.d("MicroMsg.ShareHeaderAvatarViewMgr", "scrollToTalker, index=%d", new Object[] { Integer.valueOf(k) });
      int m;
      if (k != -1)
      {
        m = k * this.nMz;
        j = this.nMx.getCurrentPosition();
        if (m >= j)
          break label218;
      }
      while (true)
      {
        if (k == 0)
          j = i;
        while (true)
        {
          this.mHandler.post(new h.2(this, j));
          AppMethodBeat.o(113509);
          break;
          j++;
          break label89;
          if (m <= j + this.nMz * 3)
            break label249;
          j = m - this.nMz * 3;
          break label178;
        }
        j = 0;
      }
    }
  }

  public final void bJR()
  {
    AppMethodBeat.i(113510);
    h.a locala = this.nMy;
    Iterator localIterator = locala.nMD.iterator();
    while (localIterator.hasNext())
      ((h.b)localIterator.next()).bJU();
    locala.notifyDataSetChanged();
    this.nMx.invalidate();
    AppMethodBeat.o(113510);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.h
 * JD-Core Version:    0.6.2
 */