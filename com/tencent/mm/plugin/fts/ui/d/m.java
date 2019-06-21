package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.d.b;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class m extends com.tencent.mm.plugin.fts.ui.a
{
  private boolean mLJ;

  public m(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    AppMethodBeat.i(62099);
    this.mLJ = false;
    paramb = (String)g.RP().Ry().get(6, null);
    if ((paramb != null) && (paramb.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      this.mLJ = bool;
      this.mLJ &= bo.gT(paramContext);
      AppMethodBeat.o(62099);
      return;
    }
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62100);
    i locali = new i();
    int[] arrayOfInt;
    if (this.mLJ)
    {
      arrayOfInt = new int[6];
      int[] tmp28_26 = arrayOfInt;
      tmp28_26[0] = 131072;
      int[] tmp33_28 = tmp28_26;
      tmp33_28[1] = 131075;
      int[] tmp38_33 = tmp33_28;
      tmp38_33[2] = 131073;
      int[] tmp43_38 = tmp38_33;
      tmp43_38[3] = 131074;
      int[] tmp48_43 = tmp43_38;
      tmp48_43[4] = 262144;
      int[] tmp53_48 = tmp48_43;
      tmp53_48[5] = 131076;
      tmp53_48;
      locali.mEr = arrayOfInt;
      locali.mEt = 3;
      locali.mEw = this;
      locali.handler = paramak;
      locali.scene = 0;
      locali.mEu = paramHashSet;
      if (!this.query.startsWith("@@"))
        break label170;
      locali.query = this.query.substring(2);
      paramak = ((n)g.M(n.class)).search(10000, locali);
      AppMethodBeat.o(62100);
    }
    while (true)
    {
      return paramak;
      arrayOfInt = new int[4];
      int[] tmp146_144 = arrayOfInt;
      tmp146_144[0] = 131072;
      int[] tmp151_146 = tmp146_144;
      tmp151_146[1] = 131075;
      int[] tmp156_151 = tmp151_146;
      tmp156_151[2] = 262144;
      int[] tmp161_156 = tmp156_151;
      tmp161_156[3] = 131076;
      tmp161_156;
      break;
      label170: locali.query = this.query;
      paramak = ((n)g.M(n.class)).search(1, locali);
      AppMethodBeat.o(62100);
    }
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62102);
    int i = paramInt - parama.mFb - 1;
    l locall;
    com.tencent.mm.plugin.fts.ui.a locala;
    if ((i < parama.mFf.size()) && (i >= 0))
    {
      locall = (l)parama.mFf.get(i);
      if (locall.type == 131075)
        locala = (com.tencent.mm.plugin.fts.ui.a)((n)g.M(n.class)).createFTSUIUnit(48, this.context, this.mEZ, this.mFa);
    }
    while (true)
    {
      if (locala != null);
      for (parama = locala.a(locall.type, paramInt, locall, parama); ; parama = null)
      {
        if (parama != null)
          parama.mFn = (i + 1);
        AppMethodBeat.o(62102);
        return parama;
        if ((locall.type == 131072) || (locall.type == 131073) || (locall.type == 131074))
        {
          locala = (com.tencent.mm.plugin.fts.ui.a)((n)g.M(n.class)).createFTSUIUnit(32, this.context, this.mEZ, this.mFa);
          break;
        }
        if (locall.type == 262144)
        {
          locala = (com.tencent.mm.plugin.fts.ui.a)((n)g.M(n.class)).createFTSUIUnit(64, this.context, this.mEZ, this.mFa);
          break;
        }
        if (locall.type != 131076)
          break label286;
        locala = (com.tencent.mm.plugin.fts.ui.a)((n)g.M(n.class)).createFTSUIUnit(96, this.context, this.mEZ, this.mFa);
        break;
      }
      label286: locala = null;
    }
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62101);
    Iterator localIterator = paramj.mEy.iterator();
    while (localIterator.hasNext())
      paramHashSet.add(((l)localIterator.next()).mDx);
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -8;
      paramHashSet.mFf = bY(paramj.mEy);
      paramHashSet.mFe = false;
      paramHashSet.mDz = paramj.mDz;
      this.mHp.add(paramHashSet);
    }
    d.bW(paramj.mEy);
    AppMethodBeat.o(62101);
  }

  public final int getType()
  {
    return 16;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.m
 * JD-Core Version:    0.6.2
 */