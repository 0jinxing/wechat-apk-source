package a.i.b.a.c.g;

import TFieldDescriptorType;;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map.Entry<TFieldDescriptorType;Ljava.lang.Object;>;

public final class h<FieldDescriptorType extends h.a<FieldDescriptorType>>
{
  private static final h BzF;
  final v<FieldDescriptorType, Object> BzC;
  private boolean BzD;
  boolean BzE;

  static
  {
    AppMethodBeat.i(121520);
    BzF = new h((byte)0);
    AppMethodBeat.o(121520);
  }

  private h()
  {
    AppMethodBeat.i(121498);
    this.BzE = false;
    this.BzC = v.UE(16);
    AppMethodBeat.o(121498);
  }

  private h(byte paramByte)
  {
    AppMethodBeat.i(121499);
    this.BzE = false;
    this.BzC = v.UE(0);
    eii();
    AppMethodBeat.o(121499);
  }

  private static int a(z.a parama, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(121516);
    int i = f.fv(paramInt);
    paramInt = i;
    if (parama == z.a.BBa)
      paramInt = i * 2;
    i = b(parama, paramObject);
    AppMethodBeat.o(121516);
    return paramInt + i;
  }

  static int a(z.a parama, boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 2; ; i = parama.BBk)
      return i;
  }

  public static Object a(e parame, z.a parama)
  {
    AppMethodBeat.i(121511);
    switch (h.1.BzH[parama.ordinal()])
    {
    default:
      parame = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
      AppMethodBeat.o(121511);
      throw parame;
    case 1:
      parame = Double.valueOf(Double.longBitsToDouble(parame.eib()));
      AppMethodBeat.o(121511);
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
      while (true)
      {
        return parame;
        parame = Float.valueOf(Float.intBitsToFloat(parame.eia()));
        AppMethodBeat.o(121511);
        continue;
        parame = Long.valueOf(parame.ve());
        AppMethodBeat.o(121511);
        continue;
        parame = Long.valueOf(parame.ve());
        AppMethodBeat.o(121511);
        continue;
        parame = Integer.valueOf(parame.vd());
        AppMethodBeat.o(121511);
        continue;
        parame = Long.valueOf(parame.eib());
        AppMethodBeat.o(121511);
        continue;
        parame = Integer.valueOf(parame.eia());
        AppMethodBeat.o(121511);
        continue;
        parame = Boolean.valueOf(parame.ehX());
        AppMethodBeat.o(121511);
        continue;
        int i = parame.vd();
        if ((i <= parame.bufferSize - parame.bxm) && (i > 0))
        {
          parama = new String(parame.buffer, parame.bxm, i, "UTF-8");
          parame.bxm = (i + parame.bxm);
          AppMethodBeat.o(121511);
          parame = parama;
        }
        else if (i == 0)
        {
          parame = "";
          AppMethodBeat.o(121511);
        }
        else
        {
          parame = new String(parame.Uw(i), "UTF-8");
          AppMethodBeat.o(121511);
          continue;
          parame = parame.ehY();
          AppMethodBeat.o(121511);
          continue;
          parame = Integer.valueOf(parame.vd());
          AppMethodBeat.o(121511);
          continue;
          parame = Integer.valueOf(parame.eia());
          AppMethodBeat.o(121511);
          continue;
          parame = Long.valueOf(parame.eib());
          AppMethodBeat.o(121511);
          continue;
          i = parame.vd();
          parame = Integer.valueOf(-(i & 0x1) ^ i >>> 1);
          AppMethodBeat.o(121511);
          continue;
          parame = Long.valueOf(e.nS(parame.ve()));
          AppMethodBeat.o(121511);
        }
      }
    case 16:
      parame = new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
      AppMethodBeat.o(121511);
      throw parame;
    case 17:
      parame = new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
      AppMethodBeat.o(121511);
      throw parame;
    case 18:
    }
    parame = new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
    AppMethodBeat.o(121511);
    throw parame;
  }

  private static void a(f paramf, z.a parama, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(121512);
    if (parama == z.a.BBa)
    {
      parama = (q)paramObject;
      paramf.bu(paramInt, 3);
      parama.a(paramf);
      paramf.bu(paramInt, 4);
      AppMethodBeat.o(121512);
    }
    while (true)
    {
      return;
      paramf.bu(paramInt, a(parama, false));
      a(paramf, parama, paramObject);
      AppMethodBeat.o(121512);
    }
  }

  private static void a(f paramf, z.a parama, Object paramObject)
  {
    AppMethodBeat.i(121513);
    switch (h.1.BzH[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 16:
    case 17:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 18:
    }
    while (true)
    {
      AppMethodBeat.o(121513);
      while (true)
      {
        return;
        paramf.J(((Double)paramObject).doubleValue());
        AppMethodBeat.o(121513);
        continue;
        paramf.bz(((Float)paramObject).floatValue());
        AppMethodBeat.o(121513);
        continue;
        paramf.av(((Long)paramObject).longValue());
        AppMethodBeat.o(121513);
        continue;
        paramf.av(((Long)paramObject).longValue());
        AppMethodBeat.o(121513);
        continue;
        paramf.Uy(((Integer)paramObject).intValue());
        AppMethodBeat.o(121513);
        continue;
        paramf.nV(((Long)paramObject).longValue());
        AppMethodBeat.o(121513);
        continue;
        paramf.UA(((Integer)paramObject).intValue());
        AppMethodBeat.o(121513);
        continue;
        paramf.rQ(((Boolean)paramObject).booleanValue());
        AppMethodBeat.o(121513);
        continue;
        paramf.awd((String)paramObject);
        AppMethodBeat.o(121513);
        continue;
        ((q)paramObject).a(paramf);
        AppMethodBeat.o(121513);
        continue;
        paramf.b((q)paramObject);
        AppMethodBeat.o(121513);
        continue;
        if ((paramObject instanceof d))
        {
          paramf.b((d)paramObject);
          AppMethodBeat.o(121513);
        }
        else
        {
          paramf.cy((byte[])paramObject);
          AppMethodBeat.o(121513);
          continue;
          paramf.fw(((Integer)paramObject).intValue());
          AppMethodBeat.o(121513);
          continue;
          paramf.UA(((Integer)paramObject).intValue());
          AppMethodBeat.o(121513);
          continue;
          paramf.nV(((Long)paramObject).longValue());
          AppMethodBeat.o(121513);
          continue;
          paramf.Uz(((Integer)paramObject).intValue());
          AppMethodBeat.o(121513);
          continue;
          paramf.nT(((Long)paramObject).longValue());
          AppMethodBeat.o(121513);
          continue;
          if (!(paramObject instanceof j.a))
            break;
          paramf.Uy(((j.a)paramObject).edd());
          AppMethodBeat.o(121513);
        }
      }
      paramf.Uy(((Integer)paramObject).intValue());
    }
  }

  public static void a(h.a<?> parama, Object paramObject, f paramf)
  {
    AppMethodBeat.i(121514);
    z.a locala = parama.eik();
    int i = parama.edd();
    if (parama.eim())
    {
      paramObject = (List)paramObject;
      if (parama.ein())
      {
        paramf.bu(i, 2);
        i = 0;
        parama = paramObject.iterator();
        while (parama.hasNext())
          i += b(locala, parama.next());
        paramf.fw(i);
        parama = paramObject.iterator();
        while (parama.hasNext())
          a(paramf, locala, parama.next());
        AppMethodBeat.o(121514);
      }
    }
    while (true)
    {
      return;
      parama = paramObject.iterator();
      while (parama.hasNext())
        a(paramf, locala, i, parama.next());
      AppMethodBeat.o(121514);
      continue;
      if ((paramObject instanceof l))
      {
        a(paramf, locala, i, ((l)paramObject).eiy());
        AppMethodBeat.o(121514);
      }
      else
      {
        a(paramf, locala, i, paramObject);
        AppMethodBeat.o(121514);
      }
    }
  }

  private static void a(z.a parama, Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(121506);
    if (paramObject == null)
    {
      parama = new NullPointerException();
      AppMethodBeat.o(121506);
      throw parama;
    }
    switch (h.1.BzG[parama.BBj.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (!bool)
    {
      parama = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      AppMethodBeat.o(121506);
      throw parama;
      bool = paramObject instanceof Integer;
      continue;
      bool = paramObject instanceof Long;
      continue;
      bool = paramObject instanceof Float;
      continue;
      bool = paramObject instanceof Double;
      continue;
      bool = paramObject instanceof Boolean;
      continue;
      bool = paramObject instanceof String;
      continue;
      if (((paramObject instanceof d)) || ((paramObject instanceof byte[])))
      {
        bool = true;
        continue;
        if (((paramObject instanceof Integer)) || ((paramObject instanceof j.a)))
        {
          bool = true;
          continue;
          if (((paramObject instanceof q)) || ((paramObject instanceof l)))
            bool = true;
        }
      }
    }
    AppMethodBeat.o(121506);
  }

  private static boolean a(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    AppMethodBeat.i(121508);
    h.a locala = (h.a)paramEntry.getKey();
    boolean bool;
    if (locala.eil() == z.b.BBu)
      if (locala.eim())
      {
        paramEntry = ((List)paramEntry.getValue()).iterator();
        while (paramEntry.hasNext())
          if (!((q)paramEntry.next()).isInitialized())
          {
            AppMethodBeat.o(121508);
            bool = false;
          }
      }
    while (true)
    {
      return bool;
      paramEntry = paramEntry.getValue();
      if ((paramEntry instanceof q))
      {
        if (!((q)paramEntry).isInitialized())
        {
          AppMethodBeat.o(121508);
          bool = false;
        }
      }
      else if ((paramEntry instanceof l))
      {
        AppMethodBeat.o(121508);
        bool = true;
      }
      else
      {
        paramEntry = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        AppMethodBeat.o(121508);
        throw paramEntry;
        AppMethodBeat.o(121508);
        bool = true;
      }
    }
  }

  private static int b(z.a parama, Object paramObject)
  {
    int i = 8;
    AppMethodBeat.i(121517);
    switch (h.1.BzH[parama.ordinal()])
    {
    default:
      parama = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
      AppMethodBeat.o(121517);
      throw parama;
    case 1:
      ((Double)paramObject).doubleValue();
      AppMethodBeat.o(121517);
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 16:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 17:
    case 18:
    }
    while (true)
    {
      return i;
      ((Float)paramObject).floatValue();
      AppMethodBeat.o(121517);
      i = 4;
      continue;
      i = f.aw(((Long)paramObject).longValue());
      AppMethodBeat.o(121517);
      continue;
      i = f.aw(((Long)paramObject).longValue());
      AppMethodBeat.o(121517);
      continue;
      i = f.ft(((Integer)paramObject).intValue());
      AppMethodBeat.o(121517);
      continue;
      ((Long)paramObject).longValue();
      AppMethodBeat.o(121517);
      continue;
      ((Integer)paramObject).intValue();
      AppMethodBeat.o(121517);
      i = 4;
      continue;
      ((Boolean)paramObject).booleanValue();
      i = 1;
      AppMethodBeat.o(121517);
      continue;
      i = f.bf((String)paramObject);
      AppMethodBeat.o(121517);
      continue;
      i = ((q)paramObject).vq();
      AppMethodBeat.o(121517);
      continue;
      if ((paramObject instanceof d))
      {
        i = f.c((d)paramObject);
        AppMethodBeat.o(121517);
      }
      else
      {
        i = f.cz((byte[])paramObject);
        AppMethodBeat.o(121517);
        continue;
        i = f.fx(((Integer)paramObject).intValue());
        AppMethodBeat.o(121517);
        continue;
        ((Integer)paramObject).intValue();
        AppMethodBeat.o(121517);
        i = 4;
        continue;
        ((Long)paramObject).longValue();
        AppMethodBeat.o(121517);
        continue;
        i = f.fx(f.UB(((Integer)paramObject).intValue()));
        AppMethodBeat.o(121517);
        continue;
        i = f.aw(f.nW(((Long)paramObject).longValue()));
        AppMethodBeat.o(121517);
        continue;
        if ((paramObject instanceof l))
        {
          i = f.a((l)paramObject);
          AppMethodBeat.o(121517);
        }
        else
        {
          i = f.c((q)paramObject);
          AppMethodBeat.o(121517);
          continue;
          if ((paramObject instanceof j.a))
          {
            i = f.ft(((j.a)paramObject).edd());
            AppMethodBeat.o(121517);
          }
          else
          {
            i = f.ft(((Integer)paramObject).intValue());
            AppMethodBeat.o(121517);
          }
        }
      }
    }
  }

  private static int c(h.a<?> parama, Object paramObject)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(121518);
    z.a locala = parama.eik();
    int k = parama.edd();
    if (parama.eim())
      if (parama.ein())
      {
        parama = ((List)paramObject).iterator();
        while (parama.hasNext())
          j += b(locala, parama.next());
        i = f.fv(k);
        j = f.fx(j) + (i + j);
        AppMethodBeat.o(121518);
      }
    while (true)
    {
      return j;
      parama = ((List)paramObject).iterator();
      j = i;
      while (parama.hasNext())
        j += a(locala, k, parama.next());
      AppMethodBeat.o(121518);
      continue;
      j = a(locala, k, paramObject);
      AppMethodBeat.o(121518);
    }
  }

  private static Object dL(Object paramObject)
  {
    AppMethodBeat.i(121509);
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      paramObject = new byte[arrayOfByte.length];
      System.arraycopy(arrayOfByte, 0, paramObject, 0, arrayOfByte.length);
      AppMethodBeat.o(121509);
    }
    while (true)
    {
      return paramObject;
      AppMethodBeat.o(121509);
    }
  }

  public static <T extends h.a<T>> h<T> eig()
  {
    AppMethodBeat.i(121500);
    h localh = new h();
    AppMethodBeat.o(121500);
    return localh;
  }

  public static <T extends h.a<T>> h<T> eih()
  {
    return BzF;
  }

  public final Object a(FieldDescriptorType paramFieldDescriptorType)
  {
    AppMethodBeat.i(121503);
    paramFieldDescriptorType = this.BzC.get(paramFieldDescriptorType);
    if ((paramFieldDescriptorType instanceof l))
    {
      paramFieldDescriptorType = ((l)paramFieldDescriptorType).eiy();
      AppMethodBeat.o(121503);
    }
    while (true)
    {
      return paramFieldDescriptorType;
      AppMethodBeat.o(121503);
    }
  }

  public final void a(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    AppMethodBeat.i(121504);
    if (paramFieldDescriptorType.eim())
    {
      if (!(paramObject instanceof List))
      {
        paramFieldDescriptorType = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        AppMethodBeat.o(121504);
        throw paramFieldDescriptorType;
      }
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll((List)paramObject);
      paramObject = localArrayList.iterator();
      while (paramObject.hasNext())
      {
        Object localObject = paramObject.next();
        a(paramFieldDescriptorType.eik(), localObject);
      }
      paramObject = localArrayList;
    }
    while (true)
    {
      if ((paramObject instanceof l))
        this.BzE = true;
      this.BzC.a(paramFieldDescriptorType, paramObject);
      AppMethodBeat.o(121504);
      return;
      a(paramFieldDescriptorType.eik(), paramObject);
    }
  }

  public final void b(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    AppMethodBeat.i(121505);
    if (!paramFieldDescriptorType.eim())
    {
      paramFieldDescriptorType = new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
      AppMethodBeat.o(121505);
      throw paramFieldDescriptorType;
    }
    a(paramFieldDescriptorType.eik(), paramObject);
    Object localObject = a(paramFieldDescriptorType);
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.BzC.a(paramFieldDescriptorType, localObject);
    }
    for (paramFieldDescriptorType = (TFieldDescriptorType)localObject; ; paramFieldDescriptorType = (List)localObject)
    {
      paramFieldDescriptorType.add(paramObject);
      AppMethodBeat.o(121505);
      return;
    }
  }

  final void b(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    AppMethodBeat.i(121510);
    h.a locala = (h.a)paramEntry.getKey();
    Object localObject1 = paramEntry.getValue();
    paramEntry = (Map.Entry<FieldDescriptorType, Object>)localObject1;
    if ((localObject1 instanceof l))
      paramEntry = ((l)localObject1).eiy();
    if (locala.eim())
    {
      Object localObject2 = a(locala);
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new ArrayList();
      paramEntry = ((List)paramEntry).iterator();
      while (paramEntry.hasNext())
      {
        localObject2 = paramEntry.next();
        ((List)localObject1).add(dL(localObject2));
      }
      this.BzC.a(locala, localObject1);
      AppMethodBeat.o(121510);
    }
    while (true)
    {
      return;
      if (locala.eil() == z.b.BBu)
      {
        localObject1 = a(locala);
        if (localObject1 == null)
        {
          this.BzC.a(locala, dL(paramEntry));
          AppMethodBeat.o(121510);
        }
        else
        {
          paramEntry = locala.a(((q)localObject1).ecC(), (q)paramEntry).ecM();
          this.BzC.a(locala, paramEntry);
          AppMethodBeat.o(121510);
        }
      }
      else
      {
        this.BzC.a(locala, dL(paramEntry));
        AppMethodBeat.o(121510);
      }
    }
  }

  public final void eii()
  {
    AppMethodBeat.i(121501);
    if (this.BzD)
      AppMethodBeat.o(121501);
    while (true)
    {
      return;
      this.BzC.eii();
      this.BzD = true;
      AppMethodBeat.o(121501);
    }
  }

  public final h<FieldDescriptorType> eij()
  {
    AppMethodBeat.i(121502);
    h localh = new h();
    Map.Entry localEntry;
    for (int i = 0; i < this.BzC.eiF(); i++)
    {
      localEntry = this.BzC.UF(i);
      localh.a((h.a)localEntry.getKey(), localEntry.getValue());
    }
    Iterator localIterator = this.BzC.eiG().iterator();
    while (localIterator.hasNext())
    {
      localEntry = (Map.Entry)localIterator.next();
      localh.a((h.a)localEntry.getKey(), localEntry.getValue());
    }
    localh.BzE = this.BzE;
    AppMethodBeat.o(121502);
    return localh;
  }

  public final boolean isInitialized()
  {
    boolean bool = false;
    AppMethodBeat.i(121507);
    int i = 0;
    if (i < this.BzC.eiF())
      if (!a(this.BzC.UF(i)))
        AppMethodBeat.o(121507);
    while (true)
    {
      return bool;
      i++;
      break;
      Iterator localIterator = this.BzC.eiG().iterator();
      while (true)
        if (localIterator.hasNext())
          if (!a((Map.Entry)localIterator.next()))
          {
            AppMethodBeat.o(121507);
            break;
          }
      bool = true;
      AppMethodBeat.o(121507);
    }
  }

  public final int vq()
  {
    AppMethodBeat.i(121515);
    int i = 0;
    int j = 0;
    while (i < this.BzC.eiF())
    {
      localObject = this.BzC.UF(i);
      j += c((h.a)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
      i++;
    }
    Object localObject = this.BzC.eiG().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      j += c((h.a)localEntry.getKey(), localEntry.getValue());
    }
    AppMethodBeat.o(121515);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.h
 * JD-Core Version:    0.6.2
 */