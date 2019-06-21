package com.tencent.mm.x;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public final class b
{
  SparseArray<a> eFa;
  HashMap<ac.a, a> eFb;
  SparseArray<b.b> eFc;
  HashMap<ac.a, b.b> eFd;
  private Random eFe;
  z eFf;

  public b()
  {
    AppMethodBeat.i(77724);
    this.eFa = new SparseArray();
    this.eFb = new HashMap();
    this.eFc = new SparseArray();
    this.eFd = new HashMap();
    this.eFe = new Random();
    this.eFf = null;
    AppMethodBeat.o(77724);
  }

  private a a(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(77737);
    a locala = new a();
    locala.eEW = paramInt1;
    locala.type = paramInt2;
    locala.value = paramString1;
    locala.cxb = paramString2;
    AppMethodBeat.o(77737);
    return locala;
  }

  private a a(ac.a parama, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(77738);
    a locala = new a();
    locala.eEX = parama;
    locala.type = paramInt;
    locala.value = paramString1;
    locala.cxb = paramString2;
    AppMethodBeat.o(77738);
    return locala;
  }

  private void a(a parama)
  {
    AppMethodBeat.i(77727);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(parama.type);
    localStringBuffer.append("|");
    localStringBuffer.append(escape(parama.value));
    localStringBuffer.append("|");
    localStringBuffer.append(escape(parama.cxb));
    if (parama.eEX != null)
    {
      this.eFf.set(parama.eEX, localStringBuffer.toString());
      AppMethodBeat.o(77727);
    }
    while (true)
    {
      return;
      this.eFf.set(parama.eEW, localStringBuffer.toString());
      AppMethodBeat.o(77727);
    }
  }

  private a c(ac.a parama)
  {
    AppMethodBeat.i(77730);
    String str = (String)this.eFf.get(parama, null);
    if (str == null)
    {
      AppMethodBeat.o(77730);
      parama = null;
    }
    while (true)
    {
      return parama;
      String[] arrayOfString = str.split("\\|");
      if (arrayOfString.length != 3)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "loadDataSource array.length != 3 content %s", new Object[] { str });
        AppMethodBeat.o(77730);
        parama = null;
      }
      else
      {
        try
        {
          parama = a(parama, Integer.valueOf(arrayOfString[0]).intValue(), unescape(arrayOfString[1]), unescape(arrayOfString[2]));
          AppMethodBeat.o(77730);
        }
        catch (Exception parama)
        {
          ab.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bo.l(parama) });
          ab.e("MicroMsg.NewBadgeDecoder", "loadDataSource exception content %s", new Object[] { str });
          AppMethodBeat.o(77730);
          parama = null;
        }
      }
    }
  }

  private a c(ac.a parama, int paramInt)
  {
    AppMethodBeat.i(77740);
    a locala1 = f(parama);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = a(parama, paramInt, "", "");
      this.eFb.put(parama, locala2);
      a(locala2);
    }
    AppMethodBeat.o(77740);
    return locala2;
  }

  private a ca(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77739);
    a locala1 = jx(paramInt1);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = a(paramInt1, paramInt2, "", "");
      this.eFa.put(paramInt1, locala2);
      a(locala2);
    }
    AppMethodBeat.o(77739);
    return locala2;
  }

  private b.b d(ac.a parama)
  {
    AppMethodBeat.i(77733);
    String str = (String)this.eFf.get(parama, null);
    if (str == null)
    {
      parama = e(parama);
      AppMethodBeat.o(77733);
    }
    while (true)
    {
      return parama;
      String[] arrayOfString = str.split("\\|");
      if (arrayOfString.length % 2 != 0)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "loadWatcher array.length %% 2 != 0 content %s", new Object[] { str });
        AppMethodBeat.o(77733);
        parama = null;
      }
      else
      {
        try
        {
          parama = e(parama);
          int i = 0;
          if (i >= arrayOfString.length)
            break label200;
          if (lc(arrayOfString[i]))
            parama.eFi.put(Integer.valueOf(arrayOfString[i]).intValue(), unescape(arrayOfString[(i + 1)]));
          while (true)
          {
            i += 2;
            break;
            parama.eFj.put(arrayOfString[i], unescape(arrayOfString[(i + 1)]));
          }
        }
        catch (Exception parama)
        {
          ab.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bo.l(parama) });
          ab.e("MicroMsg.NewBadgeDecoder", "loadWatcher exception content %s", new Object[] { str });
          AppMethodBeat.o(77733);
          parama = null;
        }
        continue;
        label200: AppMethodBeat.o(77733);
      }
    }
  }

  private static String escape(String paramString)
  {
    AppMethodBeat.i(77725);
    paramString = paramString.replaceAll("\\|", "%7C");
    AppMethodBeat.o(77725);
    return paramString;
  }

  private a ju(int paramInt)
  {
    AppMethodBeat.i(77729);
    String str = (String)this.eFf.get(paramInt, null);
    Object localObject1;
    if (str == null)
    {
      AppMethodBeat.o(77729);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      localObject1 = str.split("\\|");
      if (localObject1.length != 3)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "loadDataSource array.length != 3 content %s", new Object[] { str });
        AppMethodBeat.o(77729);
        localObject1 = null;
      }
      else
      {
        try
        {
          localObject1 = a(paramInt, Integer.valueOf(localObject1[0]).intValue(), unescape(localObject1[1]), unescape(localObject1[2]));
          AppMethodBeat.o(77729);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bo.l(localException) });
          ab.e("MicroMsg.NewBadgeDecoder", "loadDataSource exception content %s", new Object[] { str });
          AppMethodBeat.o(77729);
          Object localObject2 = null;
        }
      }
    }
  }

  private b.b jv(int paramInt)
  {
    AppMethodBeat.i(77732);
    String str = (String)this.eFf.get(paramInt, null);
    b.b localb;
    if (str == null)
    {
      localb = jw(paramInt);
      AppMethodBeat.o(77732);
    }
    while (true)
    {
      return localb;
      String[] arrayOfString = str.split("\\|");
      if (arrayOfString.length % 2 != 0)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "loadWatcher array.length %% 2 != 0 content %s", new Object[] { str });
        AppMethodBeat.o(77732);
        localb = null;
      }
      else
      {
        try
        {
          localb = jw(paramInt);
          paramInt = 0;
          if (paramInt >= arrayOfString.length)
            break label201;
          if (lc(arrayOfString[paramInt]))
            localb.eFi.put(Integer.valueOf(arrayOfString[paramInt]).intValue(), unescape(arrayOfString[(paramInt + 1)]));
          while (true)
          {
            paramInt += 2;
            break;
            localb.eFj.put(arrayOfString[paramInt], unescape(arrayOfString[(paramInt + 1)]));
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.NewBadgeDecoder", "exception:%s", new Object[] { bo.l(localException) });
          ab.e("MicroMsg.NewBadgeDecoder", "loadWatcher exception content %s", new Object[] { str });
          AppMethodBeat.o(77732);
          Object localObject = null;
        }
        continue;
        label201: AppMethodBeat.o(77732);
      }
    }
  }

  private static boolean lc(String paramString)
  {
    AppMethodBeat.i(77731);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (paramString.matches("^[\\d]+$")))
    {
      bool = true;
      AppMethodBeat.o(77731);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77731);
    }
  }

  private static String unescape(String paramString)
  {
    AppMethodBeat.i(77726);
    paramString = paramString.replaceAll("%7C", "|");
    AppMethodBeat.o(77726);
    return paramString;
  }

  public final a F(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(77747);
    ab.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceId %d, watcherId %d, type %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    a locala = jx(paramInt1);
    if (locala == null)
    {
      ab.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
      AppMethodBeat.o(77747);
      locala = null;
    }
    while (true)
    {
      return locala;
      if ((locala.type & paramInt3) == 0)
      {
        ab.d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
        AppMethodBeat.o(77747);
        locala = null;
      }
      else
      {
        b.b localb = jy(paramInt2);
        if (localb != null)
        {
          String str = (String)localb.eFi.get(paramInt1);
          if ((str != null) && (str.equals(locala.cxb)))
          {
            AppMethodBeat.o(77747);
            locala = null;
          }
          else
          {
            if (str == null)
            {
              str = PI();
              localb.eFi.put(paramInt1, str);
              a(localb);
            }
            AppMethodBeat.o(77747);
          }
        }
        else
        {
          ab.e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
          AppMethodBeat.o(77747);
          locala = null;
        }
      }
    }
  }

  final String PI()
  {
    AppMethodBeat.i(77734);
    String str = String.format("%d%04d", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.eFe.nextInt(Math.abs(this.eFe.nextInt(2147483647))) % 10000) });
    AppMethodBeat.o(77734);
    return str;
  }

  public final a a(ac.a parama1, ac.a parama2, int paramInt)
  {
    AppMethodBeat.i(77748);
    ab.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceKey %s, watcherKey %s, type %d", new Object[] { parama1, parama2, Integer.valueOf(paramInt) });
    a locala = f(parama1);
    if (locala == null)
    {
      ab.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
      AppMethodBeat.o(77748);
      parama1 = null;
    }
    while (true)
    {
      return parama1;
      if ((locala.type & paramInt) == 0)
      {
        ab.d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
        AppMethodBeat.o(77748);
        parama1 = null;
      }
      else
      {
        parama2 = g(parama2);
        if (parama2 != null)
        {
          String str = (String)parama2.eFj.get(parama1.name());
          if ((str != null) && (str.equals(locala.cxb)))
          {
            AppMethodBeat.o(77748);
            parama1 = null;
          }
          else
          {
            if (str == null)
            {
              str = PI();
              parama2.eFj.put(parama1.name(), str);
              a(parama2);
            }
            AppMethodBeat.o(77748);
            parama1 = locala;
          }
        }
        else
        {
          ab.e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
          AppMethodBeat.o(77748);
          parama1 = null;
        }
      }
    }
  }

  final void a(b.b paramb)
  {
    int i = 0;
    AppMethodBeat.i(77728);
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject1 = paramb.eFj.entrySet().iterator();
    int k;
    int m;
    for (int j = 0; ; j++)
    {
      k = j;
      m = i;
      if (!((Iterator)localObject1).hasNext())
        break;
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      if (j != 0)
        localStringBuffer.append("|");
      localStringBuffer.append(str);
      localStringBuffer.append("|");
      localStringBuffer.append(escape((String)localObject2));
    }
    while (m < paramb.eFi.size())
    {
      j = paramb.eFi.keyAt(m);
      localObject1 = (String)paramb.eFi.get(j);
      if (k != 0)
        localStringBuffer.append("|");
      localStringBuffer.append(j);
      localStringBuffer.append("|");
      localStringBuffer.append(escape((String)localObject1));
      k++;
      m++;
    }
    if (paramb.eEZ != null)
    {
      this.eFf.set(paramb.eEZ, localStringBuffer.toString());
      AppMethodBeat.o(77728);
    }
    while (true)
    {
      return;
      this.eFf.set(paramb.eFh, localStringBuffer.toString());
      AppMethodBeat.o(77728);
    }
  }

  public final void b(ac.a parama, int paramInt, String paramString)
  {
    AppMethodBeat.i(77746);
    ab.d("MicroMsg.NewBadgeDecoder", "[carl] updateDataSourceValue, dataSourceKey %s, type %d, value %s", new Object[] { parama, Integer.valueOf(paramInt), paramString });
    parama = c(parama, paramInt);
    parama.value = paramString;
    parama.type = paramInt;
    parama.cxb = PI();
    a(parama);
    AppMethodBeat.o(77746);
  }

  final b.b e(ac.a parama)
  {
    AppMethodBeat.i(77736);
    b.b localb = new b.b(this);
    localb.eEZ = parama;
    AppMethodBeat.o(77736);
    return localb;
  }

  public final a f(ac.a parama)
  {
    AppMethodBeat.i(77742);
    a locala1 = (a)this.eFb.get(parama);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala1 = c(parama);
      locala2 = locala1;
      if (locala1 != null)
      {
        this.eFb.put(parama, locala1);
        locala2 = locala1;
      }
    }
    AppMethodBeat.o(77742);
    return locala2;
  }

  public final void f(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(77745);
    ab.d("MicroMsg.NewBadgeDecoder", "[carl] updateDataSourceValue, dataSourceId %d, type %d, value %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    a locala = ca(paramInt1, paramInt2);
    locala.value = paramString;
    locala.type = paramInt2;
    locala.cxb = PI();
    a(locala);
    AppMethodBeat.o(77745);
  }

  final b.b g(ac.a parama)
  {
    AppMethodBeat.i(77744);
    b.b localb1 = (b.b)this.eFd.get(parama);
    b.b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = d(parama);
      if (localb2 == null)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "[carl] loadWatcher watcher == null");
        localb2 = null;
        AppMethodBeat.o(77744);
      }
    }
    while (true)
    {
      return localb2;
      this.eFd.put(parama, localb2);
      AppMethodBeat.o(77744);
    }
  }

  final b.b jw(int paramInt)
  {
    AppMethodBeat.i(77735);
    b.b localb = new b.b(this);
    localb.eFh = paramInt;
    AppMethodBeat.o(77735);
    return localb;
  }

  public final a jx(int paramInt)
  {
    AppMethodBeat.i(77741);
    a locala1 = (a)this.eFa.get(paramInt);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala1 = ju(paramInt);
      locala2 = locala1;
      if (locala1 != null)
      {
        this.eFa.put(paramInt, locala1);
        locala2 = locala1;
      }
    }
    AppMethodBeat.o(77741);
    return locala2;
  }

  final b.b jy(int paramInt)
  {
    AppMethodBeat.i(77743);
    b.b localb1 = (b.b)this.eFc.get(paramInt);
    b.b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = jv(paramInt);
      if (localb2 == null)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "[carl] loadWatcher watcher == null");
        localb2 = null;
        AppMethodBeat.o(77743);
      }
    }
    while (true)
    {
      return localb2;
      this.eFc.put(paramInt, localb2);
      AppMethodBeat.o(77743);
    }
  }

  public final class a
  {
    String cxb;
    int eEW;
    ac.a eEX;
    int type;
    public String value;

    public a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.x.b
 * JD-Core Version:    0.6.2
 */