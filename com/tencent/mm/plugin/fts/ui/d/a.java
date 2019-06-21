package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class a extends com.tencent.mm.plugin.fts.ui.a
{
  private boolean mLJ;

  public a(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    AppMethodBeat.i(62051);
    paramContext = (String)g.RP().Ry().get(6, null);
    if ((paramContext != null) && (paramContext.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      this.mLJ = bool;
      ab.d("MicroMsg.FTS.FTSAddFriendUIUnit", "[FTSAddFriendUIUnit doSearchMobile : %s]", new Object[] { Boolean.valueOf(this.mLJ) });
      AppMethodBeat.o(62051);
      return;
    }
  }

  private int[] bBk()
  {
    AppMethodBeat.i(62053);
    ArrayList localArrayList = new ArrayList();
    if (this.mLJ)
      localArrayList.add(Integer.valueOf(16));
    int[] arrayOfInt = new int[localArrayList.size()];
    for (int i = 0; i < localArrayList.size(); i++)
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
    AppMethodBeat.o(62053);
    return arrayOfInt;
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62052);
    String str = this.query;
    ArrayList localArrayList = new ArrayList();
    if (this.mLJ)
    {
      localArrayList.add(Integer.valueOf(131073));
      localArrayList.add(Integer.valueOf(131074));
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    for (int i = 0; i < localArrayList.size(); i++)
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
    paramak = i.a(str, arrayOfInt, bBk(), -1, paramHashSet, com.tencent.mm.plugin.fts.a.c.b.mEV, this, paramak);
    paramak = ((n)g.M(n.class)).search(9, paramak);
    AppMethodBeat.o(62052);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62055);
    int i = paramInt - parama.mFb - 1;
    Object localObject1 = null;
    Object localObject2;
    if ((i < parama.mFf.size()) && (i >= 0))
    {
      localObject2 = (l)parama.mFf.get(i);
      if ((((l)localObject2).type != 131073) && (((l)localObject2).type != 131074))
        break label177;
    }
    label177: for (parama = ((com.tencent.mm.plugin.fts.ui.a)((n)g.M(n.class)).createFTSUIUnit(33, this.context, this.mEZ, this.mFa)).a(((l)localObject2).type, paramInt, (l)localObject2, parama); ; parama = null)
    {
      localObject2 = parama;
      while (true)
      {
        if (localObject2 != null)
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject2).mFn = (i + 1);
        AppMethodBeat.o(62055);
        return localObject2;
        localObject2 = localObject1;
        if (!parama.mFc)
        {
          localObject2 = localObject1;
          if (paramInt == 0)
          {
            localObject2 = new com.tencent.mm.plugin.fts.ui.a.a(paramInt);
            ((com.tencent.mm.plugin.fts.ui.a.a)localObject2).mDz = parama.mDz;
          }
        }
      }
    }
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62054);
    Object localObject = paramj.mEy;
    this.mHp.clear();
    paramHashSet = new e.a();
    paramHashSet.businessType = -4;
    paramHashSet.mFc = false;
    paramHashSet.mFi = 1;
    paramHashSet.mDz = paramj.mDz;
    paramHashSet.mFf = new LinkedList();
    this.mHp.add(paramHashSet);
    if (bX((List)localObject))
    {
      paramHashSet = d.a((List)localObject, c.mCq);
      if (bX(paramHashSet))
      {
        localObject = new e.a();
        ((e.a)localObject).businessType = -11;
        ((e.a)localObject).mFf = paramHashSet;
        ((e.a)localObject).mDz = paramj.mDz;
        this.mHp.add(localObject);
      }
    }
    AppMethodBeat.o(62054);
  }

  public final int getType()
  {
    return 8192;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.a
 * JD-Core Version:    0.6.2
 */