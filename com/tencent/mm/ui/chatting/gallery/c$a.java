package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.e;
import com.tencent.mm.at.g;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class c$a
{
  int enb;
  ak handler;
  private int min;
  protected boolean prepared;
  private String talker;
  private List<bi> yTY;
  int yTZ;
  protected int yUa;
  protected int yUb;
  protected int yUc;
  protected long yUd;
  private c yUe;
  public HashMap<Long, e> yUf;
  public HashMap<Long, e> yUg;

  public c$a(final long paramLong, String paramString, final c paramc, Boolean paramBoolean)
  {
    AppMethodBeat.i(31966);
    this.prepared = false;
    this.yUf = new HashMap();
    this.yUg = new HashMap();
    this.handler = new ak();
    this.talker = paramString;
    this.yTY = new LinkedList();
    this.yUe = paramc;
    aw.ZK();
    paramString = com.tencent.mm.model.c.XO().jf(paramLong);
    if (paramString.field_msgId == 0L)
    {
      Assert.assertTrue("MicroMsg.AutoList <init>, currentMsg does not exist, currentMsgId = " + paramLong + ", stack = " + bo.dpG(), false);
      AppMethodBeat.o(31966);
    }
    while (true)
    {
      return;
      this.yTY.add(paramString);
      aw.RS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(31964);
          c.a.a(c.a.this, paramLong);
          if (paramc.booleanValue())
            c.a.this.handler.postDelayed(new c.a.1.1(this), 0L);
          AppMethodBeat.o(31964);
        }
      });
      paramc.yTI.yWm = new ImageGalleryUI.a()
      {
        public final void l(Boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(31965);
          ab.i("MicroMsg.AutoList", "isPlaying : ".concat(String.valueOf(paramAnonymousBoolean)));
          if (!paramAnonymousBoolean.booleanValue())
          {
            c.a.a(c.a.this);
            if (paramc.yTQ != null)
              paramc.yTQ.pL();
          }
          AppMethodBeat.o(31965);
        }
      };
      AppMethodBeat.o(31966);
    }
  }

  private void C(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(31970);
    ab.i("MicroMsg.AutoList", "start loadMsgInfo, currentMsgId = " + paramLong + ", forward = " + paramBoolean);
    List localList;
    if (c.mgP)
    {
      aw.ZK();
      localList = com.tencent.mm.model.c.XP().b(this.talker, c.jMj, paramLong, paramBoolean);
      if ((localList != null) && (localList.size() != 0))
        break label122;
      ab.w("MicroMsg.AutoList", "loadMsgInfo fail, addedMsgList is null, forward = ".concat(String.valueOf(paramBoolean)));
      AppMethodBeat.o(31970);
    }
    while (true)
    {
      return;
      aw.ZK();
      localList = com.tencent.mm.model.c.XO().g(this.talker, paramLong, paramBoolean);
      break;
      label122: ab.i("MicroMsg.AutoList", "loadMsgInfo done, new added list, size = " + localList.size() + ", forward = " + paramBoolean);
      paramLong = System.currentTimeMillis();
      fa(localList);
      ab.i("MicroMsg.AutoList", "loadImgInfo spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - paramLong) });
      if (paramBoolean)
      {
        this.yTY.addAll(localList);
        AppMethodBeat.o(31970);
      }
      else
      {
        this.yTY.addAll(0, localList);
        this.min -= localList.size();
        if (this.min < 0)
        {
          ab.e("MicroMsg.AutoList", "loadMsgInfo fail, min should not be minus, min = " + this.min);
          AppMethodBeat.o(31970);
        }
        else
        {
          StringBuilder localStringBuilder = new StringBuilder("min from ");
          int i = this.min;
          ab.i("MicroMsg.AutoList", localList.size() + i + " to " + this.min);
          AppMethodBeat.o(31970);
        }
      }
    }
  }

  private void fa(List<bi> paramList)
  {
    AppMethodBeat.i(31967);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
      if (c.c((bi)paramList.get(i)))
      {
        localArrayList1.add(Long.valueOf(((bi)paramList.get(i)).field_msgSvrId));
        if (((bi)paramList.get(i)).field_isSend == 1)
          localArrayList2.add(Long.valueOf(((bi)paramList.get(i)).field_msgId));
      }
    this.yUf.putAll(com.tencent.mm.at.o.ahl().a((Long[])localArrayList1.toArray(new Long[0])));
    this.yUg.putAll(com.tencent.mm.at.o.ahl().b((Long[])localArrayList2.toArray(new Long[0])));
    AppMethodBeat.o(31967);
  }

  public final int OU(int paramInt)
  {
    return paramInt - 100000 + this.yTZ;
  }

  public final bi OV(int paramInt)
  {
    AppMethodBeat.i(31969);
    paramInt = OU(paramInt);
    int i = this.min + this.yTY.size() - 1;
    bi localbi;
    if ((paramInt < this.min) || (paramInt > i))
    {
      ab.e("MicroMsg.AutoList", "get, invalid pos " + paramInt + ", min = " + this.min + ", max = " + i);
      localbi = null;
      AppMethodBeat.o(31969);
    }
    while (true)
    {
      return localbi;
      ab.d("MicroMsg.AutoList", "get, pos = ".concat(String.valueOf(paramInt)));
      if (paramInt == this.min)
      {
        localbi = (bi)this.yTY.get(0);
        if (this.prepared)
          C(localbi.field_msgId, false);
        AppMethodBeat.o(31969);
      }
      else if ((paramInt == i) && (i < this.enb - 1))
      {
        localbi = (bi)this.yTY.get(this.yTY.size() - 1);
        if (this.prepared)
          C(localbi.field_msgId, true);
        AppMethodBeat.o(31969);
      }
      else
      {
        localbi = (bi)this.yTY.get(paramInt - this.min);
        AppMethodBeat.o(31969);
      }
    }
  }

  public final void a(long paramLong, e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(31968);
    if (paramBoolean)
    {
      this.yUf.put(Long.valueOf(paramLong), parame);
      AppMethodBeat.o(31968);
    }
    while (true)
    {
      return;
      this.yUg.put(Long.valueOf(paramLong), parame);
      AppMethodBeat.o(31968);
    }
  }

  public final void dFM()
  {
    this.prepared = false;
  }

  public final String toString()
  {
    AppMethodBeat.i(31971);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("AutoList, Size = " + this.yTY.size());
    ((StringBuilder)localObject).append("; Content = {");
    Iterator localIterator = this.yTY.iterator();
    while (localIterator.hasNext())
    {
      ((StringBuilder)localObject).append(((bi)localIterator.next()).field_msgId);
      ((StringBuilder)localObject).append(",");
    }
    ((StringBuilder)localObject).append("}");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(31971);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.c.a
 * JD-Core Version:    0.6.2
 */