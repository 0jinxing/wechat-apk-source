package com.tencent.mm.pluginsdk.g.a.c;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class t extends j<s>
{
  private static final String[] fnj;
  private static final String vfD;

  @SuppressLint({"UseSparseArrays"})
  private static final HashMap<Integer, h.d> vfE;
  public final h fni;
  private final HashMap<String, Object> vfF;

  static
  {
    AppMethodBeat.i(79637);
    fnj = new String[] { j.a(s.ccO, "ResDownloaderRecordTable") };
    vfD = ac.eSj + g.x(String.format("mm%d", new Object[] { Integer.valueOf(-2147483648) }).getBytes()) + "/";
    Object localObject = new HashMap();
    vfE = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("RES_DOWNLOADER_RECORD_TABLE".hashCode()), new t.1());
    localObject = r.diz().iterator();
    while (((Iterator)localObject).hasNext())
      ((Iterator)localObject).next();
    AppMethodBeat.o(79637);
  }

  private t(h paramh)
  {
    super(paramh, s.ccO, "ResDownloaderRecordTable", null);
    AppMethodBeat.i(79630);
    this.vfF = new HashMap();
    this.fni = paramh;
    paramh = r.diz().iterator();
    while (paramh.hasNext())
      paramh.next();
    AppMethodBeat.o(79630);
  }

  static t diA()
  {
    Object localObject1 = null;
    AppMethodBeat.i(79631);
    try
    {
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>(vfD);
      ((File)localObject2).mkdirs();
      localObject2 = new com/tencent/mm/cd/h;
      ((h)localObject2).<init>();
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = vfD + "ResDown.db";
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = vfD + "EnResDown.db";
      q.LK();
      if (!((h)localObject2).a((String)localObject3, (String)localObject4, -2147483648L, vfE))
      {
        ab.f("MicroMsg.ResDownloaderStorage", "res downloader db init failed");
        AppMethodBeat.o(79631);
      }
      while (true)
      {
        return localObject1;
        localObject2 = new t((h)localObject2);
        AppMethodBeat.o(79631);
        localObject1 = localObject2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ResDownloaderStorage", "new storage failed, exception = %s", new Object[] { localException });
        AppMethodBeat.o(79631);
      }
    }
  }

  public final s ajg(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(79635);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ResDownloaderStorage", "query with null or nil urlKey, return null");
      AppMethodBeat.o(79635);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      s locals = new s();
      locals.field_urlKey_hashcode = paramString.hashCode();
      if (super.b(locals, new String[] { "urlKey_hashcode" }))
      {
        AppMethodBeat.o(79635);
        paramString = locals;
      }
      else
      {
        AppMethodBeat.o(79635);
        paramString = localObject;
      }
    }
  }

  public final boolean i(s params)
  {
    boolean bool = false;
    AppMethodBeat.i(79633);
    if (bo.isNullOrNil(params.field_urlKey))
      AppMethodBeat.o(79633);
    while (true)
    {
      return bool;
      params.field_urlKey_hashcode = params.field_urlKey.hashCode();
      bool = super.c(params, new String[] { "urlKey_hashcode" });
      AppMethodBeat.o(79633);
    }
  }

  public final boolean j(s params)
  {
    AppMethodBeat.i(79634);
    boolean bool;
    if (bo.isNullOrNil(params.field_urlKey))
    {
      bool = false;
      AppMethodBeat.o(79634);
    }
    while (true)
    {
      return bool;
      params.field_urlKey_hashcode = params.field_urlKey.hashCode();
      bool = super.b(params);
      AppMethodBeat.o(79634);
    }
  }

  public final boolean pI(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79632);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ResDownloaderStorage", "delete with null or nil urlKey, return false");
      AppMethodBeat.o(79632);
    }
    while (true)
    {
      return bool;
      s locals = new s();
      locals.field_urlKey_hashcode = paramString.hashCode();
      bool = super.a(locals, new String[] { "urlKey_hashcode" });
      AppMethodBeat.o(79632);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.t
 * JD-Core Version:    0.6.2
 */