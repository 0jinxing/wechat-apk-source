package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class at extends d<n>
{
  private boolean czr;
  private String lQD;
  List<n> list;
  private Comparator<n> qHx;
  private int rgh;
  private int rgi;
  private boolean rwo;
  private at.b rwp;
  private a rwq;
  private String userName;

  public at(at.b paramb, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39233);
    this.userName = "";
    this.list = new ArrayList();
    this.czr = false;
    this.rgh = 0;
    this.rgi = 0;
    this.lQD = "";
    this.rwo = false;
    this.qHx = new at.1(this);
    this.rwp = paramb;
    this.userName = paramString;
    this.czr = paramBoolean;
    AppMethodBeat.o(39233);
  }

  private int a(int paramInt1, int paramInt2, List<n> paramList)
  {
    int i = 1;
    AppMethodBeat.i(39239);
    Object localObject1 = this.rwq;
    ((a)localObject1).rwt = -1;
    ((a)localObject1).rwD = -1;
    ((a)localObject1).rws = -1;
    ((a)localObject1).rwx = "";
    ((a)localObject1).rwy = "";
    ((a)localObject1).rwz = "";
    ((a)localObject1).rwC = false;
    ((a)localObject1).rwu = false;
    ((a)localObject1).rwE = false;
    ((a)localObject1).rwF = -1;
    ((a)localObject1).rwv = -1;
    ((a)localObject1).rwA = -1;
    ((a)localObject1).rwB = 0;
    ((a)localObject1).rww = 0;
    ((a)localObject1).rwG = 0;
    if ((this.czr) && (paramInt1 == 0))
    {
      AppMethodBeat.o(39239);
      paramInt1 = 1;
    }
    while (true)
    {
      return paramInt1;
      Object localObject2;
      if (paramInt1 + 1 < paramInt2)
      {
        localObject2 = (n)paramList.get(paramInt1 + 1);
        this.rwq.rwt = ((n)localObject2).field_head;
        localObject1 = ((n)localObject2).cqu();
        this.rwq.rwx = ((TimeLineObject)localObject1).xfF;
        this.rwq.rwu = aj.ab(((n)localObject2).field_localPrivate, this.czr);
        this.rwq.rwv = ((n)localObject2).field_type;
        if (((TimeLineObject)localObject1).xfI != null)
          this.rwq.rww = ((TimeLineObject)localObject1).xfI.wbK.size();
      }
      else
      {
        label236: if (paramInt1 + 2 < paramInt2)
        {
          localObject1 = (n)paramList.get(paramInt1 + 2);
          this.rwq.rwD = ((n)localObject1).field_head;
          localObject2 = ((n)localObject1).cqu();
          this.rwq.rwy = ((TimeLineObject)localObject2).xfF;
          this.rwq.rwE = aj.ab(((n)localObject1).field_localPrivate, this.czr);
          this.rwq.rwF = ((n)localObject1).field_type;
          if (((TimeLineObject)localObject2).xfI == null)
            break label480;
          this.rwq.rwG = ((TimeLineObject)localObject2).xfI.wbK.size();
        }
        label345: paramList = (n)paramList.get(paramInt1);
        this.rwq.rws = paramList.field_head;
        localObject1 = paramList.cqu();
        this.rwq.rwz = ((TimeLineObject)localObject1).xfF;
        this.rwq.rwA = paramList.field_type;
        this.rwq.rwC = aj.ab(paramList.field_localPrivate, this.czr);
        if (((TimeLineObject)localObject1).xfI == null)
          break label491;
        this.rwq.rwB = ((TimeLineObject)localObject1).xfI.wbK.size();
        label440: paramList = this.rwq;
        if (paramList.rwA != 2)
          break label502;
        paramInt1 = 1;
      }
      while (true)
      {
        if (paramInt1 == 0)
          break label651;
        AppMethodBeat.o(39239);
        paramInt1 = 1;
        break;
        this.rwq.rww = 0;
        break label236;
        label480: this.rwq.rwG = 0;
        break label345;
        label491: this.rwq.rwB = 0;
        break label440;
        label502: if (paramList.rwt == -1)
          paramInt1 = 1;
        else if (paramList.rwA != paramList.rwv)
          paramInt1 = 1;
        else if (a.Ee(paramList.rwA))
          paramInt1 = 1;
        else if (a.Ee(paramList.rwv))
          paramInt1 = 1;
        else if ((paramList.rwB > 1) || (paramList.rww > 1))
          paramInt1 = 1;
        else if ((paramList.rwz != null) && (!paramList.rwz.equals("")))
          paramInt1 = 1;
        else if ((paramList.rwx != null) && (!paramList.rwx.equals("")))
          paramInt1 = 1;
        else if (paramList.rws != paramList.rwt)
          paramInt1 = 1;
        else
          paramInt1 = 0;
      }
      label651: paramList = this.rwq;
      if (paramList.rwD == -1)
        paramInt1 = i;
      while (true)
      {
        if (paramInt1 == 0)
          break label760;
        AppMethodBeat.o(39239);
        paramInt1 = 2;
        break;
        paramInt1 = i;
        if (paramList.rwv == paramList.rwF)
        {
          paramInt1 = i;
          if (!a.Ee(paramList.rwF))
          {
            paramInt1 = i;
            if (paramList.rwG <= 1)
              if (paramList.rwy != null)
              {
                paramInt1 = i;
                if (!paramList.rwy.equals(""));
              }
              else
              {
                paramInt1 = i;
                if (paramList.rwt == paramList.rwD)
                  paramInt1 = 0;
              }
          }
        }
      }
      label760: paramInt1 = 3;
      AppMethodBeat.o(39239);
    }
  }

  private void b(boolean paramBoolean, List<n> paramList)
  {
    AppMethodBeat.i(39240);
    if (!paramBoolean)
      AppMethodBeat.o(39240);
    while (true)
    {
      return;
      if (this.czr)
      {
        n localn = new n((byte)0);
        localn.field_snsId = 0L;
        localn.reX = -1;
        localn.ls((int)(System.currentTimeMillis() / 1000L));
        paramList.add(0, localn);
      }
      AppMethodBeat.o(39240);
    }
  }

  private void c(boolean paramBoolean, List<n> paramList)
  {
    AppMethodBeat.i(39241);
    this.rwq = new a();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap3 = new HashMap();
    long l = System.currentTimeMillis();
    int i = 0;
    int j = 0;
    int k = 0;
    b(paramBoolean, paramList);
    int m = paramList.size();
    ab.d("MicroMsg.SnsSelfHelper", "initFixType ".concat(String.valueOf(m)));
    int n = 0;
    while (n < m)
    {
      int i1 = a(n, m, paramList);
      localHashMap1.put(Integer.valueOf(k), Integer.valueOf(i));
      localHashMap2.put(Integer.valueOf(k), Integer.valueOf(i1));
      i += i1;
      localHashMap3.put(Integer.valueOf(k), Integer.valueOf(j));
      j += fz(n, i1);
      n += i1;
      k++;
    }
    this.rgh = k;
    this.rgi = paramList.size();
    ab.d("MicroMsg.SnsSelfHelper", "icount " + this.rgh);
    this.list = paramList;
    i.am("SnsphotoAdapter initFixType ", l);
    this.rwp.a(this.list, localHashMap1, localHashMap2, localHashMap3, this.rgi, this.rgh);
    AppMethodBeat.o(39241);
  }

  private int fz(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    if ((this.czr) && (paramInt1 == 0));
    while (true)
    {
      return j;
      j = i;
      if (paramInt2 > 0)
      {
        j = i;
        if (this.rwq.rwA == 1)
          j = 1;
      }
      paramInt1 = j;
      if (paramInt2 >= 2)
      {
        paramInt1 = j;
        if (this.rwq.rwv == 1)
          paramInt1 = j + 1;
      }
      j = paramInt1;
      if (paramInt2 >= 3)
      {
        j = paramInt1;
        if (this.rwq.rwF == 1)
          j = paramInt1 + 1;
      }
    }
  }

  public final List<n> Kx()
  {
    AppMethodBeat.i(39235);
    List localList = aj.a(this.userName, this.czr, this.lQD, this.rwo);
    ab.i("MicroMsg.SnsSelfHelper", "loadData thread: %d count: %d", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(localList.size()) });
    AppMethodBeat.o(39235);
    return localList;
  }

  public final void ctM()
  {
    AppMethodBeat.i(39236);
    Collections.sort(this.list, this.qHx);
    AppMethodBeat.o(39236);
  }

  final void ctN()
  {
    AppMethodBeat.i(39237);
    c(false, this.list);
    AppMethodBeat.o(39237);
  }

  public final void dq(List<n> paramList)
  {
    AppMethodBeat.i(39234);
    if (this.rwp != null)
    {
      if (paramList != null)
        c(true, paramList);
      this.rwp.ctL();
    }
    AppMethodBeat.o(39234);
  }

  public final void g(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(39238);
    ab.d("MicroMsg.SnsSelfHelper", "limitSeq ".concat(String.valueOf(paramString)));
    this.lQD = paramString;
    this.rwo = paramBoolean1;
    hM(paramBoolean2);
    AppMethodBeat.o(39238);
  }

  final class a
  {
    public int rwA = -1;
    int rwB = 0;
    public boolean rwC = false;
    public int rwD = -1;
    public boolean rwE = false;
    public int rwF = -1;
    int rwG = 0;
    public int rws = -1;
    public int rwt = -1;
    public boolean rwu = false;
    public int rwv = -1;
    int rww = 0;
    public String rwx = "";
    public String rwy = "";
    public String rwz = "";

    a()
    {
    }

    public static boolean Ee(int paramInt)
    {
      switch (paramInt)
      {
      default:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 15:
      case 18:
      case 26:
      }
      for (boolean bool = false; ; bool = true)
        return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.at
 * JD-Core Version:    0.6.2
 */