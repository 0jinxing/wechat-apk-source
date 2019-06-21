package com.tencent.mm.at;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public final class i
  implements com.tencent.mm.ai.f, com.tencent.mm.ai.g
{
  private static Set<Integer> fEL;
  private Queue<e> cqQ;
  private boolean cqU;
  int cqV;
  private long cqW;
  g.a cqZ;
  private ap cra;
  private LinkedList<l> fEM;
  public i.a fEN;
  private boolean fEO;
  private l.a fEP;
  private boolean running;

  static
  {
    AppMethodBeat.i(78305);
    fEL = new HashSet();
    AppMethodBeat.o(78305);
  }

  public i()
  {
    AppMethodBeat.i(78294);
    this.fEM = new LinkedList();
    this.fEN = null;
    this.fEO = false;
    this.fEP = new i.1(this);
    this.cqQ = new LinkedList();
    this.running = false;
    this.cqV = 0;
    this.cqW = 0L;
    this.cqU = false;
    this.cqZ = new g.a();
    com.tencent.mm.kernel.g.RQ();
    this.cra = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new i.5(this), false);
    if (com.tencent.mm.kernel.g.RO().eJo != null)
      com.tencent.mm.kernel.g.RO().eJo.a(110, this);
    this.fEM.clear();
    this.fEO = false;
    AppMethodBeat.o(78294);
  }

  private void Fb()
  {
    AppMethodBeat.i(78300);
    this.cqQ.clear();
    this.running = false;
    ab.d("MicroMsg.ImgService", "Finish service use time(ms):" + this.cqZ.Mr());
    AppMethodBeat.o(78300);
  }

  private void a(l paraml)
  {
    AppMethodBeat.i(78297);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().aa(new i.2(this, paraml));
    AppMethodBeat.o(78297);
  }

  public static boolean lA(int paramInt)
  {
    AppMethodBeat.i(78292);
    if ((com.tencent.mm.sdk.a.b.dnO()) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_PURPLE))
      ab.i("MicroMsg.ImgService", "setRun imgLocalId %s %s", new Object[] { Integer.valueOf(paramInt), bo.dpG().toString() });
    boolean bool = fEL.add(Integer.valueOf(paramInt));
    AppMethodBeat.o(78292);
    return bool;
  }

  public static boolean lB(int paramInt)
  {
    AppMethodBeat.i(78293);
    if ((com.tencent.mm.sdk.a.b.dnO()) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_PURPLE))
      ab.i("MicroMsg.ImgService", "removeRun imgLocalId %s %s", new Object[] { Integer.valueOf(paramInt), bo.dpG().toString() });
    boolean bool = fEL.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(78293);
    return bool;
  }

  public static void lC(int paramInt)
  {
    AppMethodBeat.i(78298);
    ab.w("MicroMsg.ImgService", "setImgError, %d", new Object[] { Integer.valueOf(paramInt) });
    e locale = o.ahl().ly(paramInt);
    if ((locale == null) || (locale.fDy <= 0L))
      AppMethodBeat.o(78298);
    while (true)
    {
      return;
      Object localObject = o.ahl().lz((int)locale.fDy);
      if (localObject != null)
      {
        ((e)localObject).setStatus(-1);
        ((e)localObject).bJt = 264;
        o.ahl().a((int)((e)localObject).fDy, (e)localObject);
      }
      for (localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(((e)localObject).fDH); ; localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(locale.fDH))
      {
        if (((cy)localObject).field_msgId == locale.fDH)
          break label187;
        AppMethodBeat.o(78298);
        break;
        locale.setStatus(-1);
        locale.bJt = 264;
        o.ahl().a(paramInt, locale);
      }
      label187: ((bi)localObject).setStatus(5);
      com.tencent.mm.plugin.report.e.pXa.a(111L, 31L, 1L, true);
      ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a((int)((cy)localObject).field_msgId, (bi)localObject);
      AppMethodBeat.o(78298);
    }
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(78302);
    paramm = (l)paramm;
    if ((this.fEN != null) && (paramm != null) && (paramm.csG != null))
      this.fEN.b(paramm.csG.field_msgId, paramInt1, paramInt2);
    AppMethodBeat.o(78302);
  }

  public final void a(String paramString1, String paramString2, ArrayList<String> paramArrayList, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(78295);
    paramArrayList = paramArrayList.iterator();
    if (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      if (r.g(str, paramString2, paramBoolean));
      for (int i = 1; ; i = 0)
      {
        ab.v("MicroMsg.ImgService", "pushsendimage, param.compressImg:%b, compresstype:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i) });
        a(new l(paramString1, paramString2, str, i, this, paramInt, this.fEP));
        break;
      }
    }
    AppMethodBeat.o(78295);
  }

  public final void a(ArrayList<Integer> paramArrayList, String paramString1, String paramString2, ArrayList<String> paramArrayList1, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(78296);
    Iterator localIterator = paramArrayList1.iterator();
    int i = 0;
    String str;
    if (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (paramArrayList.size() <= i)
      {
        ab.w("MicroMsg.ImgService", "Wrong! origImgPath:%s size:%s", new Object[] { str, Integer.valueOf(paramArrayList.size()) });
        AppMethodBeat.o(78296);
      }
    }
    while (true)
    {
      return;
      int j = ((Integer)paramArrayList.get(i)).intValue();
      if (r.g(str, paramString2, paramBoolean));
      for (int k = 1; ; k = 0)
      {
        paramArrayList1 = "";
        e locale = o.ahl().ly(j);
        if (locale != null)
          paramArrayList1 = locale.fDK;
        paramArrayList1 = new l(j, paramString1, paramString2, str, k, this, paramInt, paramArrayList1, "");
        paramArrayList1.fFv = new l.b(paramArrayList1, this.fEP);
        a(paramArrayList1);
        i++;
        break;
      }
      AppMethodBeat.o(78296);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(78299);
    ab.i("MicroMsg.ImgService", "onSceneEnd errType %d, errCode %d, errMsg %s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    i.a locala;
    long l;
    if ((paramm instanceof l))
    {
      paramString = (l)paramm;
      if ((this.fEN != null) && (paramString != null) && (paramString.csG != null))
      {
        locala = this.fEN;
        l = paramString.csG.field_msgId;
        if (paramString.csG.field_status == 5)
          break label136;
      }
    }
    label136: for (boolean bool = true; ; bool = false)
    {
      locala.k(l, bool);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RS().aa(new i.3(this, paramm));
      AppMethodBeat.o(78299);
      return;
    }
  }

  public final void run()
  {
    AppMethodBeat.i(78301);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().aa(new i.4(this));
    AppMethodBeat.o(78301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.i
 * JD-Core Version:    0.6.2
 */