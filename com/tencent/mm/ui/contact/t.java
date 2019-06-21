package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.a.e;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class t extends a
{
  private HashSet<String> zod;
  private String zoe;
  OpenIMAddressUI.OpenIMAddressUIFragment zof;

  public t(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1, null, 2);
    AppMethodBeat.i(33801);
    this.zod = new HashSet();
    this.zoe = paramString2;
    AppMethodBeat.o(33801);
  }

  protected final int a(com.tencent.mm.storage.f paramf, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(33803);
    if (paramf == null)
    {
      ab.e("OpenIMContactAdapter", "contact is null, position:%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(33803);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if (bo.isNullOrNil(paramf.field_descWording))
      {
        AppMethodBeat.o(33803);
        paramInt = i;
      }
      else
      {
        paramInt = paramf.field_descWording.hashCode();
        AppMethodBeat.o(33803);
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(33806);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("OpenIMContactAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(33806);
    }
    while (true)
    {
      return;
      aw.ZK();
      if (paramn == c.XM())
      {
        if (ad.aox((String)paramObject))
        {
          this.zof.zks = true;
          AppMethodBeat.o(33806);
        }
        else
        {
          ab.d("OpenIMContactAdapter", "newcursor is not openim ，return");
        }
      }
      else
        AppMethodBeat.o(33806);
    }
  }

  protected final void a(com.tencent.mm.storage.f paramf, a.b paramb)
  {
    AppMethodBeat.i(33805);
    paramb = paramf.field_descWordingId;
    if (this.zod.contains(paramb))
      AppMethodBeat.o(33805);
    while (true)
    {
      return;
      this.zod.add(paramb);
      ((b)g.K(b.class)).ba(paramf.field_openImAppid, paramb);
      AppMethodBeat.o(33805);
    }
  }

  protected final String b(com.tencent.mm.storage.f paramf, int paramInt)
  {
    AppMethodBeat.i(33804);
    paramf = paramf.field_descWording;
    if (bo.isNullOrNil(paramf))
    {
      paramf = "#";
      AppMethodBeat.o(33804);
    }
    while (true)
    {
      return paramf;
      AppMethodBeat.o(33804);
    }
  }

  protected final Cursor dHv()
  {
    AppMethodBeat.i(33802);
    long l = System.currentTimeMillis();
    g.RQ();
    Object localObject1 = ((PluginOpenIM)g.M(PluginOpenIM.class)).getAppIdInfoStg();
    Object localObject2 = this.zoe;
    Object localObject3 = new LinkedList();
    localObject1 = ((com.tencent.mm.openim.e.d)localObject1).fni.a("select distinct appid from OpenIMAppIdInfo where acctTypeId=? ", new String[] { localObject2 }, 2);
    if (((Cursor)localObject1).moveToFirst())
      do
      {
        localObject2 = ((Cursor)localObject1).getString(0);
        if (!bo.isNullOrNil((String)localObject2))
          ((List)localObject3).add(localObject2);
      }
      while (((Cursor)localObject1).moveToNext());
    ((Cursor)localObject1).close();
    aw.ZK();
    localObject2 = c.XM().a(this.elZ, aa.gw(ah.getContext()), (List)localObject3);
    localObject3 = localObject2;
    if ((localObject2 instanceof com.tencent.mm.cd.a.f))
      localObject3 = new e(new com.tencent.mm.cd.a.d[] { (com.tencent.mm.cd.a.d)com.tencent.mm.cd.d.dvo(), (com.tencent.mm.cd.a.f)localObject2 });
    ab.d("OpenIMContactAdapter", "createNewCursor : " + (System.currentTimeMillis() - l));
    AppMethodBeat.o(33802);
    return localObject3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.t
 * JD-Core Version:    0.6.2
 */