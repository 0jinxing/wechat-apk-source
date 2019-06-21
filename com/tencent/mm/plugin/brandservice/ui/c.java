package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.util.SparseArray;
import android.widget.AbsListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.mh;
import com.tencent.mm.protocal.protobuf.mn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.sortview.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class c extends b
{
  private int emW;
  protected int gOW;
  protected String jKW;
  protected int jKX;
  private List<c.a> jLa;
  private boolean jLb;
  protected boolean jLc;
  protected boolean jLd;
  int jLe;
  protected long[] jLf;
  protected c.b jLg;

  public c(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(13886);
    this.jLa = new ArrayList();
    v(true, true);
    this.jLb = true;
    c(new long[] { 1L });
    AppMethodBeat.o(13886);
  }

  private static int a(c.a parama)
  {
    int i = 1;
    int j = 0;
    if (parama == null)
      return j;
    int k = parama.count;
    if (parama.jLj)
    {
      j = 1;
      label24: if (!parama.jLk)
        break label45;
    }
    while (true)
    {
      j = j + k + i;
      break;
      j = 0;
      break label24;
      label45: i = 0;
    }
  }

  private c.a a(mh parammh)
  {
    AppMethodBeat.i(13888);
    c.a locala = new c.a();
    locala.jLl = new LinkedList();
    locala.jLl.add(parammh);
    locala.ctk = parammh.vQd;
    locala.count = parammh.naO.size();
    locala.jLh = parammh.vQe;
    locala.elG = new LinkedList();
    locala.elG.addAll(parammh.naO);
    locala.jLi = parammh.vQf;
    locala.jLj = this.jLd;
    locala.jLk = b(locala);
    AppMethodBeat.o(13888);
    return locala;
  }

  private void aWa()
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(13894);
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      c.a locala;
      for (int i = 0; i < this.jLa.size(); i++)
      {
        locala = (c.a)this.jLa.get(i);
        if (locala != null)
          localHashMap.put(Long.valueOf(locala.ctk), locala);
      }
      this.jLa.clear();
      this.emW = 0;
      int j;
      for (i = 0; i < this.jLf.length; i++)
      {
        locala = (c.a)localHashMap.get(Long.valueOf(this.jLf[i]));
        if (locala != null)
        {
          this.jLa.add(locala);
          j = this.emW;
          this.emW = (a(locala) + j);
        }
      }
      if (this.jLa.size() > 0)
      {
        locala = (c.a)this.jLa.get(this.jLa.size() - 1);
        if (locala.jLk == this.jLb)
        {
          j = this.emW;
          if (!locala.jLk)
            break label263;
          i = -1;
          this.emW = (i + j);
          if (this.jLb)
            break label268;
        }
      }
      while (true)
      {
        locala.jLk = bool;
        localHashMap.clear();
        AppMethodBeat.o(13894);
        return;
        label263: i = 1;
        break;
        label268: bool = false;
      }
    }
    finally
    {
    }
  }

  private boolean b(c.a parama)
  {
    if ((this.jLc) && (parama.jLh != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private int gE(long paramLong)
  {
    AppMethodBeat.i(13891);
    int i = 0;
    if (i < this.jLa.size())
      if (((c.a)this.jLa.get(i)).ctk == paramLong)
        AppMethodBeat.o(13891);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
      AppMethodBeat.o(13891);
    }
  }

  public void a(mh parammh, boolean paramBoolean)
  {
    AppMethodBeat.i(13889);
    if (((this.jLb) && (parammh == null)) || (parammh.naO == null))
    {
      ab.e("MicroMsg.BrandService.BizSearchResultAdapter", "The content or content.ItemList is null or the mode do not support to append data.");
      AppMethodBeat.o(13889);
      return;
    }
    if (isEmpty())
      this.jLe = ((int)(System.currentTimeMillis() / 1000L));
    c.a locala = gD(parammh.vQd);
    if (locala == null)
      if (paramBoolean)
      {
        parammh = a(parammh);
        this.jLa.add(parammh);
        aWa();
      }
    while (true)
    {
      al.d(this.yDs);
      AppMethodBeat.o(13889);
      break;
      ab.e("MicroMsg.BrandService.BizSearchResultAdapter", "The type(%d) do not exist.", new Object[] { Long.valueOf(parammh.vQd) });
      AppMethodBeat.o(13889);
      break;
      if (locala.elG == null)
        locala.elG = new LinkedList();
      locala.elG.addAll(parammh.naO);
      if (locala.jLl == null)
        locala.jLl = new LinkedList();
      locala.jLl.add(parammh);
      locala.count += parammh.naO.size();
      this.emW += parammh.naO.size();
    }
  }

  public void aWb()
  {
    AppMethodBeat.i(13895);
    h(null, null);
    this.jLe = 0;
    AppMethodBeat.o(13895);
  }

  public final void c(long[] paramArrayOfLong)
  {
    if ((paramArrayOfLong != null) && (paramArrayOfLong.length > 0))
      this.jLf = paramArrayOfLong;
  }

  final c.a gD(long paramLong)
  {
    AppMethodBeat.i(13890);
    int i = gE(paramLong);
    c.a locala;
    if (i >= 0)
    {
      locala = (c.a)this.jLa.get(i);
      AppMethodBeat.o(13890);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(13890);
    }
  }

  public int getCount()
  {
    return this.emW;
  }

  public void h(String paramString, List<mh> paramList)
  {
    AppMethodBeat.i(13887);
    this.jLa.clear();
    this.yDr.clear();
    al.d(this.yDs);
    this.emW = 0;
    this.jKW = paramString;
    if (paramList != null)
    {
      this.jLe = ((int)(System.currentTimeMillis() / 1000L));
      for (int i = 0; i < paramList.size(); i++)
      {
        paramString = (mh)paramList.get(i);
        if ((paramString != null) && (paramString.naO != null) && (paramString.naO.size() > 0))
        {
          paramString = a(paramString);
          this.emW += a(paramString);
          this.jLa.add(paramString);
          ab.i("MicroMsg.BrandService.BizSearchResultAdapter", "type(%d) , count(%d) , offset(%d)", new Object[] { Long.valueOf(paramString.ctk), Integer.valueOf(paramString.count), Integer.valueOf(this.emW) });
        }
      }
      aWa();
    }
    al.d(this.yDs);
    AppMethodBeat.o(13887);
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }

  protected final c.a rZ(int paramInt)
  {
    AppMethodBeat.i(13892);
    int i;
    c.a locala;
    if (paramInt >= 0)
    {
      i = 0;
      int j = 0;
      if (i < this.jLa.size())
      {
        locala = (c.a)this.jLa.get(i);
        j += a(locala);
        if (paramInt < j)
          AppMethodBeat.o(13892);
      }
    }
    while (true)
    {
      return locala;
      i++;
      break;
      locala = null;
      AppMethodBeat.o(13892);
    }
  }

  protected final mh sa(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(13893);
    int j;
    int k;
    label75: label86: mh localmh;
    if (paramInt >= 0)
    {
      j = 0;
      k = 0;
      if (j < this.jLa.size())
      {
        c.a locala = (c.a)this.jLa.get(j);
        int m = a(locala);
        k += m;
        if (paramInt < k)
          if (locala.jLj)
          {
            j = 1;
            j += k - m;
            k = i;
            if (k >= locala.jLl.size())
              break label160;
            localmh = (mh)locala.jLl.get(k);
            j += localmh.naO.size();
            if (paramInt >= j)
              break label148;
            AppMethodBeat.o(13893);
          }
      }
    }
    while (true)
    {
      return localmh;
      j = 0;
      break label75;
      label148: k++;
      break label86;
      j++;
      break;
      label160: localmh = null;
      AppMethodBeat.o(13893);
    }
  }

  public final com.tencent.mm.ui.base.sortview.a sb(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(13896);
    int j = 0;
    int k = 0;
    Object localObject1;
    int n;
    Object localObject2;
    if (j < this.jLa.size())
    {
      localObject1 = (c.a)this.jLa.get(j);
      int m = a((c.a)localObject1);
      n = k + m;
      if ((((c.a)localObject1).jLj) && (paramInt == n - m))
        if (((c.a)localObject1).jLl.size() == 0)
        {
          localObject2 = null;
          label88: if (localObject2 == null)
            break label405;
          localObject2 = new d(((mh)localObject2).Title);
          AppMethodBeat.o(13896);
        }
    }
    while (true)
    {
      return localObject2;
      localObject2 = (mh)((c.a)localObject1).jLl.get(0);
      break label88;
      if ((((c.a)localObject1).jLk) && (paramInt == n - 1))
      {
        localObject2 = new e(((c.a)localObject1).ctk, ((c.a)localObject1).count, this.jKW);
        AppMethodBeat.o(13896);
      }
      else if (paramInt < n)
      {
        j = ((c.a)localObject1).count;
        k = i;
        if (((c.a)localObject1).jLk)
          k = 1;
        k += paramInt - n + j;
        localObject2 = (mn)((c.a)localObject1).elG.get(k);
        long l = ((c.a)localObject1).ctk;
        localObject1 = this.jLg;
        if (localObject2 == null)
        {
          ab.e("MicroMsg.BrandService.BizSearchResultAdapter", "data is null.");
          AppMethodBeat.o(13896);
          localObject2 = null;
        }
        else
        {
          if (l == 1L)
          {
            ab.v("MicroMsg.BrandService.BizSearchResultAdapter", "Create a BizContactDataItem.");
            localObject2 = new a(localObject2);
          }
          while (true)
          {
            if ((localObject2 instanceof com.tencent.mm.plugin.brandservice.ui.base.a))
            {
              com.tencent.mm.plugin.brandservice.ui.base.a locala = (com.tencent.mm.plugin.brandservice.ui.base.a)localObject2;
              locala.sf(k);
              locala.setPosition(paramInt);
              locala.setReporter((c.b)localObject1);
            }
            AppMethodBeat.o(13896);
            break;
            if (l == 4L)
              localObject2 = new g(localObject2);
            else if (l == 1073741824L)
              localObject2 = new g(localObject2);
            else
              localObject2 = new g(localObject2);
          }
        }
      }
      else
      {
        label405: j++;
        k = n;
        break;
        localObject2 = new g(null);
        AppMethodBeat.o(13896);
      }
    }
  }

  public Object[] sc(int paramInt)
  {
    AppMethodBeat.i(13897);
    c.a locala = rZ(paramInt);
    Object localObject = sa(paramInt);
    if (localObject != null)
    {
      localObject = ((mh)localObject).vQg;
      if (locala == null)
        break label84;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = this;
      arrayOfObject[1] = locala.jLi;
      arrayOfObject[2] = Integer.valueOf(this.jKX);
      arrayOfObject[3] = localObject;
      AppMethodBeat.o(13897);
      localObject = arrayOfObject;
    }
    while (true)
    {
      return localObject;
      localObject = "";
      break;
      label84: localObject = null;
      AppMethodBeat.o(13897);
    }
  }

  public final void setAddContactScene(int paramInt)
  {
    this.jKX = paramInt;
  }

  public final void setReporter(c.b paramb)
  {
    this.jLg = paramb;
  }

  public final void setScene(int paramInt)
  {
    this.gOW = paramInt;
  }

  public final void v(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.jLd = paramBoolean1;
    this.jLc = paramBoolean2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.c
 * JD-Core Version:    0.6.2
 */