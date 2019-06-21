package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements f, com.tencent.mm.ai.g
{
  final List<d.b> fDn;
  private HashSet<d.b> fDo;
  d.b fDp;
  private k fDq;
  public boolean fDr;

  public d()
  {
    AppMethodBeat.i(78177);
    this.fDp = null;
    this.fDq = null;
    this.fDr = false;
    this.fDn = Collections.synchronizedList(new LinkedList());
    this.fDo = new HashSet();
    com.tencent.mm.kernel.g.RO().eJo.a(109, this);
    AppMethodBeat.o(78177);
  }

  private boolean a(d.b paramb)
  {
    AppMethodBeat.i(78184);
    boolean bool;
    if ((paramb == null) || (paramb.agO() > 0))
    {
      bool = false;
      AppMethodBeat.o(78184);
    }
    while (true)
    {
      return bool;
      bool = b(paramb);
      AppMethodBeat.o(78184);
    }
  }

  private static void c(d.b paramb)
  {
    AppMethodBeat.i(78187);
    if (paramb == null)
    {
      ab.e("ModelImage.DownloadImgService", "task is null");
      AppMethodBeat.o(78187);
    }
    while (true)
    {
      return;
      if (paramb.fDv == null)
      {
        ab.e("ModelImage.DownloadImgService", "task callback list is null");
        AppMethodBeat.o(78187);
      }
      else
      {
        Iterator localIterator = paramb.fDv.iterator();
        while (localIterator.hasNext())
        {
          c localc = (c)localIterator.next();
          if (localc.fDw != null)
            localc.fDw.a(paramb.fDs, paramb.eln, paramb.fDt, paramb.fDu, localc.fDx);
        }
        AppMethodBeat.o(78187);
      }
    }
  }

  private void lq(int paramInt)
  {
    AppMethodBeat.i(78191);
    while (true)
    {
      synchronized (this.fDn)
      {
        if ((this.fDp != null) || (this.fDn.size() <= 0) || (true == this.fDr))
        {
          if (this.fDp == null)
          {
            localObject1 = "mCurTaskInfo is null";
            ab.i("ModelImage.DownloadImgService", "mCurTaskInfo %s mTodoList %s mLockStart %s", new Object[] { localObject1, Integer.valueOf(this.fDn.size()), Boolean.valueOf(this.fDr) });
            AppMethodBeat.o(78191);
            return;
          }
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = this.fDp.fDs + ", " + this.fDp.eln + ", " + this.fDp.fDt;
          continue;
        }
        this.fDp = ((d.b)this.fDn.remove(0));
        if (this.fDp == null)
        {
          ab.w("ModelImage.DownloadImgService", "null == mCurTaskInfo");
          AppMethodBeat.o(78191);
        }
      }
      this.fDq = new k(this.fDp.fDs, this.fDp.eln, this.fDp.fDt, this, paramInt);
      this.fDq.fFe = this.fDp.fDu;
      ab.i("ModelImage.DownloadImgService", "do scene, (" + this.fDp.fDs + ", " + this.fDp.eln + ", " + this.fDp.fDt + ")");
      com.tencent.mm.kernel.g.RO().eJo.a(this.fDq, 0);
      AppMethodBeat.o(78191);
    }
  }

  public final int a(long paramLong1, long paramLong2, int paramInt1, Object paramObject, int paramInt2, d.a parama, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(78180);
    if (parama == null)
    {
      ab.e("ModelImage.DownloadImgService", "listener is null");
      paramInt1 = -1;
      AppMethodBeat.o(78180);
    }
    d.b localb;
    while (true)
    {
      return paramInt1;
      localb = new d.b(paramLong1, paramLong2, paramInt1);
      localb.fDu = paramInt2;
      if (this.fDo.contains(localb))
      {
        ab.e("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] add failed, task already done");
        paramInt1 = -2;
        AppMethodBeat.o(78180);
      }
      else if ((this.fDp != null) && (localb.equals(this.fDp)))
      {
        if (this.fDp.a(parama, paramObject))
        {
          paramInt1 = 0;
          AppMethodBeat.o(78180);
        }
        else
        {
          paramInt1 = -3;
          AppMethodBeat.o(78180);
        }
      }
      else
      {
        paramInt2 = this.fDn.indexOf(localb);
        if ((paramInt2 < 0) || (paramInt2 >= this.fDn.size()))
          break;
        if (((d.b)this.fDn.get(paramInt2)).a(parama, paramObject))
        {
          paramInt1 = 0;
          AppMethodBeat.o(78180);
        }
        else
        {
          paramInt1 = -4;
          AppMethodBeat.o(78180);
        }
      }
    }
    ab.i("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] no found task, create a new task(" + paramLong1 + " " + paramLong2 + " " + paramInt1 + ") mLockStart: %s callbackDuration %s", new Object[] { Boolean.valueOf(this.fDr), Integer.valueOf(paramInt3) });
    localb.a(parama, paramObject);
    if (((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).bhI())
      if ((paramBoolean) && (this.fDn.size() > 0))
        this.fDn.add(0, localb);
    while (true)
    {
      lq(paramInt3);
      paramInt1 = 0;
      AppMethodBeat.o(78180);
      break;
      this.fDn.add(localb);
      continue;
      this.fDn.add(localb);
    }
  }

  public final int a(long paramLong1, long paramLong2, Object paramObject, d.a parama)
  {
    AppMethodBeat.i(78179);
    int i = a(paramLong1, paramLong2, 1, paramObject, 2130838182, parama, 0, false);
    AppMethodBeat.o(78179);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(78190);
    if (this.fDq != paramm)
    {
      ab.d("ModelImage.DownloadImgService", "scene changed");
      AppMethodBeat.o(78190);
    }
    while (true)
    {
      return;
      if ((this.fDp != null) && (this.fDp.fDv != null))
      {
        Iterator localIterator = new ArrayList(this.fDp.fDv).iterator();
        while (localIterator.hasNext())
        {
          c localc = (c)localIterator.next();
          if (localc.fDw != null)
            localc.fDw.a(this.fDp.fDs, this.fDp.eln, this.fDp.fDt, this.fDp.fDu, localc.fDx, paramInt1, paramInt2, paramm);
        }
      }
      AppMethodBeat.o(78190);
    }
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(78183);
    ab.i("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] cancel all tasks of listener");
    this.fDr = true;
    if (this.fDp != null)
    {
      if (this.fDp != null)
        break label198;
      ??? = "mCurTaskInfo is null";
    }
    while (true)
    {
      ab.i("ModelImage.DownloadImgService", "cancelAllTaskByListener CurTaskInfo %s mTodoList %s mLockStart %s", new Object[] { ???, Integer.valueOf(this.fDn.size()), Boolean.valueOf(this.fDr) });
      Object localObject2;
      if (((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).bhI())
      {
        b(this.fDp);
        localObject2 = new LinkedList();
      }
      synchronized (this.fDn)
      {
        ((List)localObject2).addAll(this.fDn);
        localObject2 = ((List)localObject2).iterator();
        while (true)
          if (((Iterator)localObject2).hasNext())
          {
            ??? = (d.b)((Iterator)localObject2).next();
            if (??? != null)
            {
              ((d.b)???).b(parama);
              a((d.b)???);
              continue;
              label198: ??? = this.fDp.fDs + ", " + this.fDp.eln + ", " + this.fDp.fDt;
              break;
              this.fDp.b(parama);
              ??? = this.fDp;
              if (((d.b)???).fDv != null)
                ((d.b)???).fDv.clear();
              a(this.fDp);
            }
          }
      }
    }
    agN();
    int i = parama.hashCode();
    if (this.fDp == null);
    for (parama = "mCurTaskInfo is null"; ; parama = this.fDp.fDs + ", " + this.fDp.eln + ", " + this.fDp.fDt)
    {
      ab.i("ModelImage.DownloadImgService", "[ %s ] cancelAllTaskByListener done mCurTaskInfo %s", new Object[] { Integer.valueOf(i), parama });
      AppMethodBeat.o(78183);
      return;
    }
  }

  public final boolean a(long paramLong1, long paramLong2, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(78181);
    d.b localb = new d.b(paramLong1, paramLong2, paramInt);
    if ((this.fDp != null) && (this.fDp.equals(localb)))
      AppMethodBeat.o(78181);
    while (true)
    {
      return bool;
      if (this.fDn.indexOf(localb) >= 0)
      {
        AppMethodBeat.o(78181);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(78181);
      }
    }
  }

  public final boolean a(long paramLong1, long paramLong2, int paramInt1, Object paramObject, int paramInt2, d.a parama)
  {
    AppMethodBeat.i(78178);
    boolean bool;
    if (a(paramLong1, paramLong2, paramInt1, paramObject, paramInt2, parama, -1, false) >= 0)
    {
      bool = true;
      AppMethodBeat.o(78178);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78178);
    }
  }

  public final boolean a(long paramLong1, long paramLong2, d.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(78182);
    d.b localb1 = new d.b(paramLong1, paramLong2, 1);
    d.b localb2 = null;
    if ((this.fDp != null) && (this.fDp.equals(localb1)))
    {
      localb2 = this.fDp;
      if (localb2 == null)
        break label166;
      localb2.b(parama);
      a(localb2);
      ab.i("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] task has been canceled, (" + paramLong1 + ", " + paramLong2 + ", 1)");
      AppMethodBeat.o(78182);
    }
    while (true)
    {
      return bool;
      int i = this.fDn.indexOf(localb1);
      if (-1 == i)
        break;
      localb2 = (d.b)this.fDn.get(i);
      break;
      label166: ab.e("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] task no found, (" + paramLong1 + ", " + paramLong2 + ", 1)");
      bool = false;
      AppMethodBeat.o(78182);
    }
  }

  public final void agN()
  {
    AppMethodBeat.i(78188);
    this.fDr = false;
    lq(-1);
    AppMethodBeat.o(78188);
  }

  final boolean b(d.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(78186);
    if (paramb == null)
    {
      ab.e("ModelImage.DownloadImgService", "task is null");
      AppMethodBeat.o(78186);
    }
    while (true)
    {
      return bool;
      ab.i("ModelImage.DownloadImgService", "cancel scene, (" + paramb.fDs + ", " + paramb.eln + ", " + paramb.fDt + ")");
      if ((this.fDp != null) && (this.fDp.equals(paramb)))
      {
        com.tencent.mm.kernel.g.RO().eJo.c(this.fDq);
        this.fDq = null;
        ab.i("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)", new Object[] { Long.valueOf(paramb.fDs), Long.valueOf(paramb.eln), Integer.valueOf(paramb.fDt) });
        c(this.fDp);
        this.fDp = null;
        lq(-1);
        AppMethodBeat.o(78186);
        bool = true;
      }
      else if (this.fDn.contains(paramb))
      {
        if (this.fDn.remove(paramb))
          c(paramb);
        AppMethodBeat.o(78186);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(78186);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(78189);
    if (this.fDq != paramm)
    {
      ab.d("ModelImage.DownloadImgService", "scene changed");
      AppMethodBeat.o(78189);
    }
    while (true)
    {
      return;
      if ((this.fDp != null) && (this.fDp.fDv != null))
      {
        this.fDo.add(new d.b(this.fDp.fDs, this.fDp.eln, this.fDp.fDt));
        ab.i("ModelImage.DownloadImgService", "scene end, (" + this.fDp.fDs + ", " + this.fDp.eln + ", " + this.fDp.fDt + ")");
        Iterator localIterator = new ArrayList(this.fDp.fDv).iterator();
        while (localIterator.hasNext())
        {
          c localc = (c)localIterator.next();
          if (localc.fDw != null)
            localc.fDw.a(this.fDp.fDs, this.fDp.eln, this.fDp.fDt, this.fDp.fDu, localc.fDx, paramInt1, paramInt2, paramString, paramm);
        }
        this.fDp = null;
        this.fDq = null;
        lq(-1);
      }
      AppMethodBeat.o(78189);
    }
  }

  public final boolean x(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(78185);
    boolean bool = b(new d.b(paramLong1, paramLong2, 1));
    AppMethodBeat.o(78185);
    return bool;
  }

  static final class c
  {
    d.a fDw;
    Object fDx;

    public c(d.a parama, Object paramObject)
    {
      this.fDw = parama;
      this.fDx = paramObject;
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (paramObject != null)
      {
        if ((paramObject instanceof c))
          break label19;
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        label19: paramObject = (c)paramObject;
        bool2 = bool1;
        if (this.fDw == paramObject.fDw)
          bool2 = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.d
 * JD-Core Version:    0.6.2
 */