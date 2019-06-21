package a.i.b.a.c.e.b.a;

import a.f.a.b;
import a.f.b.z;
import a.i.b.a.c.e.a.d;
import a.i.b.a.c.e.b.a.c;
import a.i.b.a.c.g.o;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class k$a
{
  public static k a(byte[] paramArrayOfByte, String paramString, b<? super g, y> paramb)
  {
    AppMethodBeat.i(121339);
    a.f.b.j.p(paramString, "debugName");
    a.f.b.j.p(paramb, "reportIncompatibleVersionError");
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = k.ByH;
      AppMethodBeat.o(121339);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = new DataInputStream((InputStream)new ByteArrayInputStream(paramArrayOfByte));
      int i;
      Object localObject1;
      int j;
      try
      {
        i = paramArrayOfByte.readInt();
        localObject1 = new int[i];
        for (j = 0; j < i; j++)
          localObject1[j] = paramArrayOfByte.readInt();
      }
      catch (IOException paramArrayOfByte)
      {
        paramArrayOfByte = k.ByI;
        AppMethodBeat.o(121339);
      }
      continue;
      Object localObject2 = new g(Arrays.copyOf((int[])localObject1, i));
      if (!((g)localObject2).ehy())
      {
        paramb.am(localObject2);
        paramArrayOfByte = k.ByH;
        AppMethodBeat.o(121339);
      }
      else
      {
        if (a.i.b.a.c.e.a.j.a((a.i.b.a.c.e.a.a)localObject2))
        {
          j = paramArrayOfByte.readInt();
          label159: if ((j & 0x1) == 0)
            break label217;
        }
        label217: for (boolean bool = true; ; bool = false)
        {
          localObject2 = new g((int[])localObject1, bool);
          if (((g)localObject2).ehy())
            break label223;
          paramb.am(localObject2);
          paramArrayOfByte = k.ByH;
          AppMethodBeat.o(121339);
          break;
          j = 0;
          break label159;
        }
        label223: localObject1 = a.i.b.a.c.e.b.a.a.Q((InputStream)paramArrayOfByte);
        if (localObject1 == null)
        {
          paramArrayOfByte = k.ByH;
          AppMethodBeat.o(121339);
        }
        else
        {
          localObject2 = new LinkedHashMap();
          Object localObject3 = ((a.i.b.a.c.e.b.a.a)localObject1).Bxl.iterator();
          Object localObject4;
          Object localObject5;
          if (((Iterator)localObject3).hasNext())
          {
            localObject4 = (a.c)((Iterator)localObject3).next();
            a.f.b.j.o(localObject4, "proto");
            paramb = ((a.c)localObject4).egA();
            localObject5 = (Map)localObject2;
            a.f.b.j.o(paramb, "packageFqName");
            paramArrayOfByte = ((Map)localObject5).get(paramb);
            Object localObject6;
            if (paramArrayOfByte == null)
            {
              paramArrayOfByte = new m(paramb);
              ((Map)localObject5).put(paramb, paramArrayOfByte);
              localObject5 = (m)paramArrayOfByte;
              paramArrayOfByte = ((a.c)localObject4).Bxs;
              a.f.b.j.o(paramArrayOfByte, "proto.shortClassNameList");
              localObject6 = ((Iterable)paramArrayOfByte).iterator();
              j = 0;
              label382: if (!((Iterator)localObject6).hasNext())
                break label532;
              localObject7 = (String)((Iterator)localObject6).next();
              paramArrayOfByte = ((a.c)localObject4).Bxt;
              a.f.b.j.o(paramArrayOfByte, "proto.multifileFacadeShortNameIdList");
              paramArrayOfByte = (Integer)a.a.j.x(paramArrayOfByte, j);
              if (paramArrayOfByte == null)
                break label517;
              paramArrayOfByte = Integer.valueOf(paramArrayOfByte.intValue() - 1);
              label440: if (paramArrayOfByte == null)
                break label522;
              o localo = ((a.c)localObject4).Bxv;
              a.f.b.j.o(localo, "proto.multifileFacadeShortNameList");
              i = ((Number)paramArrayOfByte).intValue();
              paramArrayOfByte = (String)a.a.j.x((List)localo, i);
              label479: if (paramArrayOfByte == null)
                break label527;
            }
            label517: label522: label527: for (paramArrayOfByte = l.iX(paramb, paramArrayOfByte); ; paramArrayOfByte = null)
            {
              a.f.b.j.o(localObject7, "partShortName");
              ((m)localObject5).iY(l.iX(paramb, (String)localObject7), paramArrayOfByte);
              j++;
              break label382;
              break;
              paramArrayOfByte = null;
              break label440;
              paramArrayOfByte = null;
              break label479;
            }
            label532: paramArrayOfByte = ((a.c)localObject4).Bxw;
            a.f.b.j.o(paramArrayOfByte, "proto.classWithJvmPackageNameShortNameList");
            Object localObject7 = ((Iterable)paramArrayOfByte).iterator();
            j = 0;
            label558: if (((Iterator)localObject7).hasNext())
            {
              localObject6 = (String)((Iterator)localObject7).next();
              paramArrayOfByte = ((a.c)localObject4).Bxx;
              a.f.b.j.o(paramArrayOfByte, "proto.classWithJvmPackageNamePackageIdList");
              paramb = (Integer)a.a.j.x(paramArrayOfByte, j);
              paramArrayOfByte = paramb;
              if (paramb == null)
              {
                paramArrayOfByte = ((a.c)localObject4).Bxx;
                a.f.b.j.o(paramArrayOfByte, "proto.classWithJvmPackageNamePackageIdList");
                paramArrayOfByte = (Integer)a.a.j.fM(paramArrayOfByte);
              }
              if (paramArrayOfByte != null)
              {
                i = paramArrayOfByte.intValue();
                paramArrayOfByte = ((a.i.b.a.c.e.b.a.a)localObject1).Bxn;
                a.f.b.j.o(paramArrayOfByte, "moduleProto.jvmPackageNameList");
                paramArrayOfByte = (String)a.a.j.x((List)paramArrayOfByte, i);
                if (paramArrayOfByte != null)
                  break label671;
              }
            }
            while (true)
            {
              j++;
              break label558;
              break;
              label671: a.f.b.j.o(localObject6, "partShortName");
              ((m)localObject5).iY(l.iX(paramArrayOfByte, (String)localObject6), null);
            }
          }
          paramb = ((a.i.b.a.c.e.b.a.a)localObject1).Bxm.iterator();
          label903: 
          while (paramb.hasNext())
          {
            localObject3 = (a.c)paramb.next();
            localObject4 = (Map)localObject2;
            a.f.b.j.o(localObject3, "proto");
            localObject5 = ((a.c)localObject3).egA();
            a.f.b.j.o(localObject5, "proto.packageFqName");
            paramArrayOfByte = ((Map)localObject4).get(localObject5);
            if (paramArrayOfByte == null)
            {
              paramArrayOfByte = ((a.c)localObject3).egA();
              a.f.b.j.o(paramArrayOfByte, "proto.packageFqName");
              paramArrayOfByte = new m(paramArrayOfByte);
              ((Map)localObject4).put(localObject5, paramArrayOfByte);
              paramArrayOfByte = (m)paramArrayOfByte;
              localObject3 = ((a.c)localObject3).Bxs;
              a.f.b.j.o(localObject3, "proto.shortClassNameList");
              localObject3 = ((Iterable)localObject3).iterator();
            }
            while (true)
            {
              if (!((Iterator)localObject3).hasNext())
                break label903;
              localObject4 = (String)((Iterator)localObject3).next();
              a.f.b.j.p(localObject4, "shortName");
              localObject5 = paramArrayOfByte.ByL;
              if (localObject5 == null)
              {
                paramArrayOfByte = new v("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
                AppMethodBeat.o(121339);
                throw paramArrayOfByte;
                break;
              }
              z.dr(localObject5).add(localObject4);
            }
          }
          paramArrayOfByte = ((a.i.b.a.c.e.b.a.a)localObject1).Bxo;
          a.f.b.j.o(paramArrayOfByte, "moduleProto.stringTable");
          paramb = ((a.i.b.a.c.e.b.a.a)localObject1).Bxp;
          a.f.b.j.o(paramb, "moduleProto.qualifiedNameTable");
          paramArrayOfByte = new d(paramArrayOfByte, paramb);
          paramb = ((a.i.b.a.c.e.b.a.a)localObject1).BvA;
          a.f.b.j.o(paramb, "moduleProto.annotationList");
          localObject1 = (Iterable)paramb;
          paramb = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = (a.i.b.a.c.e.a.a)((Iterator)localObject1).next();
            a.f.b.j.o(localObject3, "proto");
            paramb.add(paramArrayOfByte.Uh(((a.i.b.a.c.e.a.a)localObject3).BsE));
          }
          paramArrayOfByte = (List)paramb;
          paramArrayOfByte = new k((Map)localObject2, new a(paramArrayOfByte), paramString, (byte)0);
          AppMethodBeat.o(121339);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.k.a
 * JD-Core Version:    0.6.2
 */