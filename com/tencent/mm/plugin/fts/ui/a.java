package com.tencent.mm.plugin.fts.ui;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.d.b;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.a.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class a extends b
  implements com.tencent.mm.plugin.fts.a.l
{
  HashSet<String> mEu = new HashSet();
  private com.tencent.mm.plugin.fts.a.a.a mEx;
  public List<e.a> mHp = Collections.synchronizedList(new LinkedList());
  protected String query;

  public a(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  protected abstract com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet);

  public com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, com.tencent.mm.plugin.fts.a.a.l paraml, e.a parama)
  {
    return null;
  }

  protected abstract com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama);

  protected abstract void a(j paramj, HashSet<String> paramHashSet);

  public final void a(String paramString, ak paramak, HashSet<String> paramHashSet)
  {
    bAr();
    clearData();
    this.query = paramString;
    this.mEx = a(paramak, paramHashSet);
  }

  protected k b(int paramInt, e.a parama)
  {
    return new k(paramInt);
  }

  public final void b(j paramj)
  {
    switch (paramj.bFZ)
    {
    default:
    case 0:
    case -3:
    case -2:
    case -1:
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "search type %d | result %d", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramj.mEy.size()) });
      if ((this.query == null) || (!this.query.equals(paramj.mAJ.query)))
      {
        ab.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same query origin:%s current:%s", new Object[] { paramj.mAJ.query, this.query });
      }
      else
      {
        this.mEu = paramj.mAJ.mEu;
        a(paramj, this.mEu);
        do
        {
          this.mEZ.a(this, paramj.mAJ.query);
          break;
          ab.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "onSearchError: type=%d | errorCode=%d | originQuery=%s", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramj.bFZ), paramj.mAJ.query });
        }
        while (paramj.mAJ.query.equals(this.query));
        ab.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same Query");
      }
    }
  }

  public final int bAK()
  {
    int i = this.mHp.size();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Iterator localIterator = ((e.a)this.mHp.get(j)).mFf.iterator();
      if (localIterator.hasNext())
      {
        String str = bo.bc(((com.tencent.mm.plugin.fts.a.a.l)localIterator.next()).mDx, "");
        int m = -1;
        switch (str.hashCode())
        {
        default:
        case -19329355:
        case 541269703:
        case 255180560:
        }
        while (true)
        {
          switch (m)
          {
          case 0:
          case 1:
          case 2:
          }
          k++;
          break;
          if (str.equals("create_chatroom​"))
          {
            m = 0;
            continue;
            if (str.equals("create_talker_message​"))
            {
              m = 1;
              continue;
              if (str.equals("no_result​"))
                m = 2;
            }
          }
        }
      }
      j++;
    }
    return k;
  }

  public final void bAr()
  {
    if (this.mEx != null)
    {
      ((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(this.mEx);
      this.mEx = null;
    }
  }

  public final LinkedList<Integer> bAs()
  {
    LinkedList localLinkedList = new LinkedList();
    int i = this.mHp.size();
    for (int j = 0; j < i; j++)
    {
      e.a locala = (e.a)this.mHp.get(j);
      if (locala.mFb != 2147483647)
        localLinkedList.add(Integer.valueOf(locala.mFb));
    }
    return localLinkedList;
  }

  public final int bAt()
  {
    return bAK();
  }

  protected com.tencent.mm.plugin.fts.ui.a.n c(int paramInt, e.a parama)
  {
    com.tencent.mm.plugin.fts.ui.a.n localn = new com.tencent.mm.plugin.fts.ui.a.n(paramInt);
    localn.mFn = (parama.mFd - parama.mFb);
    localn.mFt = true;
    return localn;
  }

  public final void clearData()
  {
    this.query = null;
    this.mEu.clear();
    this.mHp.clear();
  }

  public int vY(int paramInt)
  {
    int i = this.mHp.size();
    int j = 0;
    if (j < i)
    {
      e.a locala = (e.a)this.mHp.get(j);
      locala.mFb = paramInt;
      int k = paramInt;
      if (locala.mFc)
        k = paramInt + 1;
      paramInt = k + (locala.mFf.size() + locala.mFi);
      locala.mFd = paramInt;
      if (!locala.mFe)
        break label99;
      paramInt++;
    }
    label99: 
    while (true)
    {
      j++;
      break;
      return paramInt;
    }
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a vZ(int paramInt)
  {
    int i = this.mHp.size();
    int j = 0;
    e.a locala;
    Object localObject;
    if (j < i)
    {
      locala = (e.a)this.mHp.get(j);
      if ((locala.mFb == paramInt) && (locala.mFc))
        localObject = b(paramInt, locala);
    }
    while (true)
    {
      label58: if (localObject != null)
      {
        if (((com.tencent.mm.plugin.fts.a.d.a.a)localObject).position == locala.mFd)
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFk = false;
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFa = this.mFa;
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mDz = locala.mDz;
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFl = locala.businessType;
      }
      while (true)
      {
        return localObject;
        if ((locala.mFd == paramInt) && (locala.mFe))
        {
          localObject = c(paramInt, locala);
          break label58;
        }
        if (paramInt > locala.mFd)
          break label176;
        localObject = a(paramInt, locala);
        break label58;
        j++;
        break;
        localObject = null;
      }
      label176: localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a
 * JD-Core Version:    0.6.2
 */