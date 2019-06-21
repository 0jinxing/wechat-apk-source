package a.i.b.a.c.e.b.a;

import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.a.ai;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.e;
import a.i.b.a.c.e.a.o;
import a.i.b.a.c.e.a.s;
import a.i.b.a.c.e.a.u;
import a.i.b.a.c.e.a.f;
import a.i.b.a.c.e.b.b.c;
import a.i.b.a.c.e.b.b.e;
import a.i.b.a.c.e.b.b.g;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.f;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class j
{
  private static final a.i.b.a.c.g.g ByC;
  public static final j ByD;

  static
  {
    AppMethodBeat.i(121338);
    ByD = new j();
    a.i.b.a.c.g.g localg = a.i.b.a.c.g.g.eie();
    a.i.b.a.c.e.b.b.a(localg);
    a.f.b.j.o(localg, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
    ByC = localg;
    AppMethodBeat.o(121338);
  }

  public static f.a a(a.u paramu, a.i.b.a.c.e.a.c paramc, a.i.b.a.c.e.a.h paramh, boolean paramBoolean)
  {
    AppMethodBeat.i(121334);
    a.f.b.j.p(paramu, "proto");
    a.f.b.j.p(paramc, "nameResolver");
    a.f.b.j.p(paramh, "typeTable");
    Object localObject = (i.c)paramu;
    i.f localf = a.i.b.a.c.e.b.b.BxC;
    a.f.b.j.o(localf, "JvmProtoBuf.propertySignature");
    localObject = (b.e)f.a((i.c)localObject, localf);
    if (localObject == null)
    {
      AppMethodBeat.o(121334);
      paramu = null;
    }
    while (true)
    {
      return paramu;
      if (((b.e)localObject).egW());
      for (localObject = ((b.e)localObject).BxQ; ; localObject = null)
      {
        if ((localObject != null) || (!paramBoolean))
          break label107;
        AppMethodBeat.o(121334);
        paramu = null;
        break;
      }
      label107: int i;
      if ((localObject != null) && (((a.i.b.a.c.e.b.b.a)localObject).edW()))
      {
        i = ((a.i.b.a.c.e.b.b.a)localObject).Buf;
        label127: if ((localObject == null) || (!((a.i.b.a.c.e.b.b.a)localObject).egL()))
          break label186;
        paramu = paramc.getString(((a.i.b.a.c.e.b.b.a)localObject).BxN);
      }
      label186: 
      do
      {
        paramu = new f.a(paramc.getString(i), paramu);
        AppMethodBeat.o(121334);
        break;
        i = paramu.Buf;
        break label127;
        paramh = b(a.i.b.a.c.e.a.g.a(paramu, paramh), paramc);
        paramu = paramh;
      }
      while (paramh != null);
      AppMethodBeat.o(121334);
      paramu = null;
    }
  }

  public static f.b a(a.e parame, a.i.b.a.c.e.a.c paramc, a.i.b.a.c.e.a.h paramh)
  {
    Object localObject1 = null;
    AppMethodBeat.i(121333);
    a.f.b.j.p(parame, "proto");
    a.f.b.j.p(paramc, "nameResolver");
    a.f.b.j.p(paramh, "typeTable");
    Object localObject2 = (i.c)parame;
    Object localObject3 = a.i.b.a.c.e.b.b.Bxz;
    a.f.b.j.o(localObject3, "JvmProtoBuf.constructorSignature");
    localObject2 = (b.c)f.a((i.c)localObject2, (i.f)localObject3);
    if ((localObject2 != null) && (((b.c)localObject2).edW()))
    {
      localObject3 = paramc.getString(((b.c)localObject2).Buf);
      if ((localObject2 == null) || (!((b.c)localObject2).egL()))
        break label131;
    }
    label131: label241: for (parame = paramc.getString(((b.c)localObject2).BxN); ; parame = a.a.j.a((Iterable)parame, (CharSequence)"", (CharSequence)"(", (CharSequence)")V", 0, null, null, 56))
    {
      parame = new f.b((String)localObject3, parame);
      AppMethodBeat.o(121333);
      return parame;
      localObject3 = "<init>";
      break;
      parame = parame.BtO;
      a.f.b.j.o(parame, "proto.valueParameterList");
      localObject2 = (Iterable)parame;
      parame = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (true)
      {
        if (!((Iterator)localObject2).hasNext())
          break label241;
        Object localObject4 = (a.ai)((Iterator)localObject2).next();
        a.f.b.j.o(localObject4, "it");
        localObject4 = b(a.i.b.a.c.e.a.g.a((a.ai)localObject4, paramh), paramc);
        if (localObject4 == null)
        {
          AppMethodBeat.o(121333);
          parame = localObject1;
          break;
        }
        parame.add(localObject4);
      }
    }
  }

  public static f.b a(a.o paramo, a.i.b.a.c.e.a.c paramc, a.i.b.a.c.e.a.h paramh)
  {
    Object localObject1 = null;
    AppMethodBeat.i(121332);
    a.f.b.j.p(paramo, "proto");
    a.f.b.j.p(paramc, "nameResolver");
    a.f.b.j.p(paramh, "typeTable");
    Object localObject2 = (i.c)paramo;
    Object localObject3 = a.i.b.a.c.e.b.b.BxA;
    a.f.b.j.o(localObject3, "JvmProtoBuf.methodSignature");
    localObject3 = (b.c)f.a((i.c)localObject2, (i.f)localObject3);
    int i;
    if ((localObject3 != null) && (((b.c)localObject3).edW()))
    {
      i = ((b.c)localObject3).Buf;
      if ((localObject3 == null) || (!((b.c)localObject3).egL()))
        break label133;
    }
    label133: label336: label367: for (paramo = paramc.getString(((b.c)localObject3).BxN); ; paramo = a.a.j.a((Iterable)localObject3, (CharSequence)"", (CharSequence)"(", (CharSequence)")", 0, null, null, 56) + paramo)
    {
      paramo = new f.b(paramc.getString(i), paramo);
      AppMethodBeat.o(121332);
      while (true)
      {
        return paramo;
        i = paramo.Buf;
        break;
        localObject3 = (Collection)a.a.j.dm(a.i.b.a.c.e.a.g.b(paramo, paramh));
        localObject2 = paramo.BtO;
        a.f.b.j.o(localObject2, "proto.valueParameterList");
        Object localObject4 = (Iterable)localObject2;
        localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
        localObject4 = ((Iterable)localObject4).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          a.ai localai = (a.ai)((Iterator)localObject4).next();
          a.f.b.j.o(localai, "it");
          ((Collection)localObject2).add(a.i.b.a.c.e.a.g.a(localai, paramh));
        }
        localObject2 = (Iterable)a.a.j.b((Collection)localObject3, (Iterable)localObject2);
        localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
        localObject4 = ((Iterable)localObject2).iterator();
        while (true)
        {
          if (!((Iterator)localObject4).hasNext())
            break label336;
          localObject2 = b((a.aa)((Iterator)localObject4).next(), paramc);
          if (localObject2 == null)
          {
            AppMethodBeat.o(121332);
            paramo = localObject1;
            break;
          }
          ((Collection)localObject3).add(localObject2);
        }
        localObject3 = (List)localObject3;
        paramo = b(a.i.b.a.c.e.a.g.a(paramo, paramh), paramc);
        if (paramo != null)
          break label367;
        AppMethodBeat.o(121332);
        paramo = localObject1;
      }
    }
  }

  private static h a(InputStream paramInputStream, String[] paramArrayOfString)
  {
    AppMethodBeat.i(121331);
    paramInputStream = b.g.e(paramInputStream, ByC);
    a.f.b.j.o(paramInputStream, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
    paramInputStream = new h(paramInputStream, paramArrayOfString);
    AppMethodBeat.o(121331);
    return paramInputStream;
  }

  private static String b(a.aa paramaa, a.i.b.a.c.e.a.c paramc)
  {
    AppMethodBeat.i(121336);
    if (paramaa.efc())
    {
      paramaa = c.avV(paramc.Uh(paramaa.Bve));
      AppMethodBeat.o(121336);
    }
    while (true)
    {
      return paramaa;
      paramaa = null;
      AppMethodBeat.o(121336);
    }
  }

  public static final o<h, a.c> d(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(121328);
    a.f.b.j.p(paramArrayOfString1, "data");
    a.f.b.j.p(paramArrayOfString2, "strings");
    paramArrayOfString1 = b.af(paramArrayOfString1);
    a.f.b.j.o(paramArrayOfString1, "BitEncoding.decodeBytes(data)");
    a.f.b.j.p(paramArrayOfString1, "bytes");
    a.f.b.j.p(paramArrayOfString2, "strings");
    paramArrayOfString1 = new ByteArrayInputStream(paramArrayOfString1);
    paramArrayOfString1 = new o(a((InputStream)paramArrayOfString1, paramArrayOfString2), a.c.a((InputStream)paramArrayOfString1, ByC));
    AppMethodBeat.o(121328);
    return paramArrayOfString1;
  }

  public static final o<h, a.s> e(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(121329);
    a.f.b.j.p(paramArrayOfString1, "data");
    a.f.b.j.p(paramArrayOfString2, "strings");
    paramArrayOfString1 = b.af(paramArrayOfString1);
    a.f.b.j.o(paramArrayOfString1, "BitEncoding.decodeBytes(data)");
    a.f.b.j.p(paramArrayOfString1, "bytes");
    a.f.b.j.p(paramArrayOfString2, "strings");
    paramArrayOfString1 = new ByteArrayInputStream(paramArrayOfString1);
    paramArrayOfString1 = new o(a((InputStream)paramArrayOfString1, paramArrayOfString2), a.s.c((InputStream)paramArrayOfString1, ByC));
    AppMethodBeat.o(121329);
    return paramArrayOfString1;
  }

  public static a.i.b.a.c.g.g ehz()
  {
    return ByC;
  }

  public static final o<h, a.o> f(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(121330);
    a.f.b.j.p(paramArrayOfString1, "data");
    a.f.b.j.p(paramArrayOfString2, "strings");
    paramArrayOfString1 = new ByteArrayInputStream(b.af(paramArrayOfString1));
    paramArrayOfString1 = new o(a((InputStream)paramArrayOfString1, paramArrayOfString2), a.o.b((InputStream)paramArrayOfString1, ByC));
    AppMethodBeat.o(121330);
    return paramArrayOfString1;
  }

  public static final boolean f(a.u paramu)
  {
    AppMethodBeat.i(121337);
    a.f.b.j.p(paramu, "proto");
    Object localObject = e.Bys;
    localObject = e.ehw();
    paramu = paramu.e(a.i.b.a.c.e.b.b.BxD);
    a.f.b.j.o(paramu, "proto.getExtension(JvmProtoBuf.flags)");
    paramu = ((a.i.b.a.c.e.a.b.a)localObject).Ug(((Number)paramu).intValue());
    a.f.b.j.o(paramu, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
    boolean bool = paramu.booleanValue();
    AppMethodBeat.o(121337);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.j
 * JD-Core Version:    0.6.2
 */