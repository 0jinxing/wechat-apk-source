package com.tencent.mm.plugin.fav.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.protocal.protobuf.abp;
import com.tencent.mm.protocal.protobuf.abq;
import com.tencent.mm.protocal.protobuf.abr;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class l
{
  private boolean dirty;
  public HashMap<String, WeakReference<l.a>> fBy;
  public abr mfn;
  private HashSet<Integer> mfo;
  private List<abp> mfp;

  public l()
  {
    AppMethodBeat.i(102673);
    this.mfn = new abr();
    this.fBy = new HashMap();
    this.mfo = new HashSet();
    this.dirty = true;
    this.mfp = new LinkedList();
    byte[] arrayOfByte = bo.anf((String)com.tencent.mm.kernel.g.RP().Ry().get(225283, ""));
    try
    {
      this.mfn.parseFrom(arrayOfByte);
      ab.i("MicroMsg.FavTagSetMgr", "tag:\n%s", new Object[] { this.mfn.wiH });
      AppMethodBeat.o(102673);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FavTagSetMgr", localException, "", new Object[0]);
        ab.w("MicroMsg.FavTagSetMgr", "init tag info set fail, %s", new Object[] { localException.getMessage() });
        this.mfn = new abr();
      }
    }
  }

  private void hd(boolean paramBoolean)
  {
    AppMethodBeat.i(102675);
    Iterator localIterator = this.fBy.values().iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null))
        if (paramBoolean)
          ((l.a)localWeakReference.get()).buF();
        else
          ((l.a)localWeakReference.get()).buG();
    }
    AppMethodBeat.o(102675);
  }

  private void removeTag(final String paramString)
  {
    AppMethodBeat.i(102683);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(102683);
    while (true)
    {
      return;
      this.mfo.remove(Integer.valueOf(paramString.hashCode()));
      if (Looper.myLooper() != Looper.getMainLooper())
      {
        ab.d("MicroMsg.FavTagSetMgr", "remove tag %s, post", new Object[] { paramString });
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(102672);
            l.this.LO(paramString);
            AppMethodBeat.o(102672);
          }
        });
        AppMethodBeat.o(102683);
      }
      else
      {
        ab.d("MicroMsg.FavTagSetMgr", "remove tag %s", new Object[] { paramString });
        LO(paramString);
        AppMethodBeat.o(102683);
      }
    }
  }

  private void save()
  {
    AppMethodBeat.i(102676);
    try
    {
      byte[] arrayOfByte = this.mfn.toByteArray();
      com.tencent.mm.kernel.g.RS().aa(new l.1(this, arrayOfByte));
      this.dirty = true;
      AppMethodBeat.o(102676);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FavTagSetMgr", localException, "", new Object[0]);
        ab.w("MicroMsg.FavTagSetMgr", "save tag info set fail, %s", new Object[] { localException.getMessage() });
        Object localObject = null;
      }
    }
  }

  public final void LM(String paramString)
  {
    AppMethodBeat.i(102679);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(102679);
    while (true)
    {
      return;
      if (this.mfo.contains(Integer.valueOf(paramString.hashCode())))
      {
        ab.d("MicroMsg.FavTagSetMgr", "has add tag %s", new Object[] { paramString });
        AppMethodBeat.o(102679);
      }
      else
      {
        this.mfo.add(Integer.valueOf(paramString.hashCode()));
        if (Looper.myLooper() != Looper.getMainLooper())
        {
          ab.d("MicroMsg.FavTagSetMgr", "add tag %s, post", new Object[] { paramString });
          al.d(new l.2(this, paramString));
          AppMethodBeat.o(102679);
        }
        else
        {
          ab.d("MicroMsg.FavTagSetMgr", "add tag %s", new Object[] { paramString });
          LN(paramString);
          AppMethodBeat.o(102679);
        }
      }
    }
  }

  final void LN(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(102680);
    String str = com.tencent.mm.platformtools.g.vo(paramString.toLowerCase());
    if ((str != null) && (str.length() > 0));
    for (int j = str.charAt(0); ; j = 35)
    {
      Object localObject = this.mfn.wiH.iterator();
      int k = 0;
      abq localabq;
      if (((Iterator)localObject).hasNext())
      {
        localabq = (abq)((Iterator)localObject).next();
        if (localabq.wiF != j);
      }
      while (true)
      {
        label80: if (localabq == null)
        {
          localabq = new abq();
          localabq.wiF = j;
          this.mfn.wiH.add(localabq);
        }
        while (true)
        {
          Iterator localIterator = localabq.wiG.iterator();
          j = i;
          label127: if (localIterator.hasNext())
          {
            localObject = (abp)localIterator.next();
            k = ((abp)localObject).wiE.compareTo(str);
            if (k != 0)
              break label346;
            k = ((abp)localObject).rMJ.compareTo(paramString);
          }
          label346: 
          while (true)
          {
            if (k == 0)
              AppMethodBeat.o(102680);
            while (true)
            {
              return;
              if (localabq.wiF > j)
              {
                localabq = new abq();
                localabq.wiF = j;
                this.mfn.wiH.add(k, localabq);
                break label80;
              }
              k++;
              break;
              if (k > 0)
              {
                localObject = new abp();
                ((abp)localObject).rMJ = paramString;
                ((abp)localObject).wiE = str;
                localabq.wiG.add(j, localObject);
                save();
                hd(true);
                AppMethodBeat.o(102680);
              }
              else
              {
                j++;
                break label127;
                localObject = new abp();
                ((abp)localObject).rMJ = paramString;
                ((abp)localObject).wiE = str;
                localabq.wiG.add(localObject);
                hd(true);
                save();
                AppMethodBeat.o(102680);
              }
            }
          }
        }
        localabq = null;
      }
    }
  }

  final void LO(String paramString)
  {
    AppMethodBeat.i(102684);
    String str = com.tencent.mm.platformtools.g.vo(paramString.toLowerCase());
    if ((str != null) && (str.length() > 0));
    for (int i = str.charAt(0); ; i = 35)
    {
      Iterator localIterator = this.mfn.wiH.iterator();
      int j = 0;
      abq localabq;
      if (localIterator.hasNext())
      {
        localabq = (abq)localIterator.next();
        if (localabq.wiF != i);
      }
      while (true)
      {
        if (localabq == null)
          AppMethodBeat.o(102684);
        while (true)
        {
          return;
          if (localabq.wiF > i)
          {
            AppMethodBeat.o(102684);
          }
          else
          {
            j++;
            break;
            localIterator = localabq.wiG.iterator();
            for (i = 0; ; i++)
            {
              if (!localIterator.hasNext())
                break label282;
              abp localabp = (abp)localIterator.next();
              int k = localabp.wiE.compareTo(str);
              int m = k;
              if (k == 0)
                m = localabp.rMJ.compareTo(paramString);
              if (m == 0)
              {
                if (!((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().LT(localabp.rMJ))
                {
                  localabq.wiG.remove(i);
                  if (localabq.wiG.isEmpty())
                    this.mfn.wiH.remove(j);
                  hd(false);
                  save();
                }
                AppMethodBeat.o(102684);
                break;
              }
              if (m > 0)
              {
                AppMethodBeat.o(102684);
                break;
              }
            }
            label282: AppMethodBeat.o(102684);
          }
        }
        localabq = null;
      }
    }
  }

  public final void a(l.a parama)
  {
    AppMethodBeat.i(102674);
    if (parama == null)
      AppMethodBeat.o(102674);
    while (true)
    {
      return;
      this.fBy.put(parama.toString(), new WeakReference(parama));
      AppMethodBeat.o(102674);
    }
  }

  public final int buE()
  {
    AppMethodBeat.i(102678);
    Iterator localIterator = this.mfn.wiH.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((abq)localIterator.next()).wiG.size() + i);
    AppMethodBeat.o(102678);
    return i;
  }

  public final void e(Set<String> paramSet)
  {
    AppMethodBeat.i(102682);
    if ((paramSet == null) || (paramSet.isEmpty()))
      AppMethodBeat.o(102682);
    while (true)
    {
      return;
      ab.d("MicroMsg.FavTagSetMgr", "do remove tags: %s", new Object[] { paramSet });
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
        removeTag((String)paramSet.next());
      AppMethodBeat.o(102682);
    }
  }

  public final void v(g paramg)
  {
    AppMethodBeat.i(102681);
    if (paramg == null)
      AppMethodBeat.o(102681);
    while (true)
    {
      return;
      paramg = paramg.field_tagProto.wiJ.iterator();
      while (paramg.hasNext())
        removeTag((String)paramg.next());
      AppMethodBeat.o(102681);
    }
  }

  public final List<abp> vy(int paramInt)
  {
    AppMethodBeat.i(102677);
    Object localObject;
    if ((paramInt < 0) || (paramInt > 1))
    {
      localObject = null;
      AppMethodBeat.o(102677);
    }
    while (true)
    {
      return localObject;
      if (this.dirty)
      {
        ab.w("MicroMsg.FavTagSetMgr", "want get tag list, it is dirty, reload data");
        this.mfp.clear();
        localObject = this.mfn.wiH.iterator();
        while (((Iterator)localObject).hasNext())
        {
          abq localabq = (abq)((Iterator)localObject).next();
          this.mfp.addAll(localabq.wiG);
        }
        this.dirty = false;
      }
      ab.i("MicroMsg.FavTagSetMgr", "want get tag list, tag list size is %d", new Object[] { Integer.valueOf(this.mfp.size()) });
      localObject = this.mfp;
      AppMethodBeat.o(102677);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.l
 * JD-Core Version:    0.6.2
 */