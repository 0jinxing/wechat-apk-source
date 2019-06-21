package com.tencent.mm.pluginsdk.g.a.a;

import android.database.Cursor;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.pluginsdk.g.a.a.a.a;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.pluginsdk.g.a.c.t;
import com.tencent.mm.protocal.protobuf.bsw;
import com.tencent.mm.protocal.protobuf.bta;
import com.tencent.mm.protocal.protobuf.btb;
import com.tencent.mm.protocal.protobuf.btc;
import com.tencent.mm.protocal.protobuf.rr;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public abstract class n extends m
  implements k
{
  protected static final SparseArray<a> veP = new SparseArray();
  private volatile f ehi;
  protected final List<btc> veO = new LinkedList();

  n()
  {
    for (int k : i.vep)
    {
      Object localObject = (a)veP.get(k);
      if ((localObject == null) || (!((a)localObject).rO(k)))
      {
        localObject = new btc();
        ((btc)localObject).jCt = k;
        this.veO.add(localObject);
      }
    }
  }

  public static void a(a parama)
  {
    veP.put(39, parama);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    this.ehi = paramf;
    ab.d(getTag(), "before dispatch");
    Iterator localIterator = this.veO.iterator();
    while (localIterator.hasNext())
    {
      btc localbtc = (btc)localIterator.next();
      int i = localbtc.jCt;
      paramf = q.a.diy();
      if (!paramf.hrm)
      {
        paramf = null;
        if (paramf != null)
          break label213;
      }
      Object localObject1;
      Object localObject2;
      for (paramf = Collections.emptyList(); ; paramf = Collections.emptyList())
      {
        localObject1 = new StringBuilder("{ ");
        paramf = paramf.iterator();
        while (paramf.hasNext())
        {
          s locals = (s)paramf.next();
          i = bo.getInt(locals.field_fileVersion, -1);
          if (i >= 0)
          {
            localObject2 = new bta();
            ((bta)localObject2).wOI = locals.field_subType;
            ((bta)localObject2).wVf = i;
            ((bta)localObject2).wVd = locals.field_keyVersion;
            ((bta)localObject2).vek = locals.field_EID;
            localbtc.wVk.add(localObject2);
            ((StringBuilder)localObject1).append(locals.field_subType).append(", ");
          }
        }
        paramf = paramf.vfx.fni;
        break;
        label213: localObject1 = paramf.a("ResDownloaderRecordTable", null, "urlKey" + String.format(Locale.US, " like '%d.%%.data'", new Object[] { Integer.valueOf(i) }) + " and groupId1=" + String.format(Locale.US, "'%s'", new Object[] { "CheckResUpdate" }), null, null, null, null, 2);
        if ((localObject1 != null) && (!((Cursor)localObject1).isClosed()))
          break label317;
      }
      label317: if (((Cursor)localObject1).moveToFirst())
      {
        paramf = new LinkedList();
        do
        {
          localObject2 = new s();
          ((s)localObject2).d((Cursor)localObject1);
          paramf.add(localObject2);
        }
        while (((Cursor)localObject1).moveToNext());
      }
      while (true)
      {
        ((Cursor)localObject1).close();
        break;
        paramf = Collections.emptyList();
      }
      ((StringBuilder)localObject1).append(" }");
      ab.i(getTag(), "before doScene, add subtypeList(%s) in type(%d)", new Object[] { ((StringBuilder)localObject1).toString(), Integer.valueOf(localbtc.jCt) });
    }
    return a(parame, diq(), this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    ab.i(getTag(), "onGYNetEnd errType(%d), errCode(%d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    String str;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = i(paramq);
      str = getTag();
      if (!bo.ek(paramArrayOfByte.vYY))
        break label128;
    }
    label128: for (paramq = "null"; ; paramq = String.valueOf(paramArrayOfByte.vYY.size()))
    {
      ab.i(str, "response.Res.size() = %s", new Object[] { paramq });
      if (!bo.ek(paramArrayOfByte.vYY))
        d.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(79558);
            Iterator localIterator = this.veQ.iterator();
            if (localIterator.hasNext())
            {
              btb localbtb = (btb)localIterator.next();
              Object localObject1 = n.this.getTag();
              int i = localbtb.jCt;
              if (bo.ek(localbtb.wVj));
              for (Object localObject2 = "null"; ; localObject2 = String.valueOf(localbtb.wVj.size()))
              {
                ab.i((String)localObject1, "resType(%d) responses.size() = %s", new Object[] { Integer.valueOf(i), localObject2 });
                if (bo.ek(localbtb.wVj))
                  break;
                localObject2 = localbtb.wVj.iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject1 = (bsw)((Iterator)localObject2).next();
                  n.a(n.this, localbtb.jCt, (bsw)localObject1);
                }
                break;
              }
            }
            AppMethodBeat.o(79558);
          }
        }
        , "NetSceneCheckResUpdate-ResponseHandlingThread");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      return;
    }
  }

  protected abstract com.tencent.mm.network.q diq();

  protected abstract String getTag();

  protected abstract rr i(com.tencent.mm.network.q paramq);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.n
 * JD-Core Version:    0.6.2
 */