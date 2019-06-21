package a.i.b.a.c.i.e;

import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static int BFA;
  private static final int BFB;
  private static final int BFC;
  private static final int BFD;
  private static final int BFE;
  private static final int BFF;
  private static final int BFG;
  private static final int BFH;
  private static final int BFI;
  private static final int BFJ;
  private static final int BFK;
  public static final d BFL;
  public static final d BFM;
  public static final d BFN;
  public static final d BFO;
  public static final d BFP;
  public static final d BFQ;
  public static final d BFR;
  public static final d BFS;
  public static final d BFT;
  public static final d BFU;
  private static final List<d.a.a> BFV;
  private static final List<d.a.a> BFW;
  public static final d.a BFX;
  final int BFy;
  public final List<c> BFz;

  static
  {
    AppMethodBeat.i(122183);
    BFX = new d.a((byte)0);
    BFA = 1;
    BFB = d.a.ejL();
    BFC = d.a.ejL();
    BFD = d.a.ejL();
    BFE = d.a.ejL();
    BFF = d.a.ejL();
    BFG = d.a.ejL();
    BFH = d.a.ejL() - 1;
    BFI = BFB | BFC | BFD;
    BFJ = BFC | BFF | BFG;
    BFK = BFF | BFG;
    BFL = new d(BFH);
    BFM = new d(BFK);
    BFN = new d(BFB);
    BFO = new d(BFC);
    BFP = new d(BFD);
    BFQ = new d(BFI);
    BFR = new d(BFE);
    BFS = new d(BFF);
    BFT = new d(BFG);
    BFU = new d(BFJ);
    Object localObject1 = d.class.getFields();
    a.f.b.j.o(localObject1, "T::class.java.fields");
    Object localObject2 = (Collection)new ArrayList();
    int i = localObject1.length;
    for (int j = 0; j < i; j++)
    {
      localObject3 = localObject1[j];
      a.f.b.j.o(localObject3, "it");
      if (Modifier.isStatic(((Field)localObject3).getModifiers()))
        ((Collection)localObject2).add(localObject3);
    }
    localObject2 = (Iterable)localObject2;
    Object localObject3 = (Collection)new ArrayList();
    Object localObject4 = ((Iterable)localObject2).iterator();
    label433: 
    while (((Iterator)localObject4).hasNext())
    {
      Field localField = (Field)((Iterator)localObject4).next();
      localObject1 = localField.get(null);
      localObject2 = localObject1;
      if (!(localObject1 instanceof d))
        localObject2 = null;
      localObject2 = (d)localObject2;
      if (localObject2 != null)
      {
        j = ((d)localObject2).BFy;
        a.f.b.j.o(localField, "field");
        localObject2 = localField.getName();
        a.f.b.j.o(localObject2, "field.name");
      }
      for (localObject2 = new d.a.a(j, (String)localObject2); ; localObject2 = null)
      {
        if (localObject2 == null)
          break label433;
        ((Collection)localObject3).add(localObject2);
        break;
      }
    }
    BFV = a.a.j.m((Iterable)localObject3);
    localObject2 = d.class.getFields();
    a.f.b.j.o(localObject2, "T::class.java.fields");
    localObject3 = (Collection)new ArrayList();
    i = localObject2.length;
    for (j = 0; j < i; j++)
    {
      localObject1 = localObject2[j];
      a.f.b.j.o(localObject1, "it");
      if (Modifier.isStatic(((Field)localObject1).getModifiers()))
        ((Collection)localObject3).add(localObject1);
    }
    localObject1 = (Iterable)localObject3;
    localObject2 = (Collection)new ArrayList();
    localObject3 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = ((Iterator)localObject3).next();
      localObject4 = (Field)localObject1;
      a.f.b.j.o(localObject4, "it");
      if (a.f.b.j.j(((Field)localObject4).getType(), Integer.TYPE))
        ((Collection)localObject2).add(localObject1);
    }
    localObject2 = (Iterable)localObject2;
    localObject1 = (Collection)new ArrayList();
    localObject3 = ((Iterable)localObject2).iterator();
    label698: label749: label752: 
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (Field)((Iterator)localObject3).next();
      localObject4 = ((Field)localObject2).get(null);
      if (localObject4 == null)
      {
        localObject2 = new v("null cannot be cast to non-null type kotlin.Int");
        AppMethodBeat.o(122183);
        throw ((Throwable)localObject2);
      }
      i = ((Integer)localObject4).intValue();
      if (i == (-i & i))
      {
        j = 1;
        if (j == 0)
          break label749;
        a.f.b.j.o(localObject2, "field");
        localObject2 = ((Field)localObject2).getName();
        a.f.b.j.o(localObject2, "field.name");
      }
      for (localObject2 = new d.a.a(i, (String)localObject2); ; localObject2 = null)
      {
        if (localObject2 == null)
          break label752;
        ((Collection)localObject1).add(localObject2);
        break;
        j = 0;
        break label698;
      }
    }
    BFW = a.a.j.m((Iterable)localObject1);
    AppMethodBeat.o(122183);
  }

  public d(int paramInt, List<? extends c> paramList)
  {
    AppMethodBeat.i(122181);
    this.BFz = paramList;
    paramList = ((Iterable)this.BFz).iterator();
    while (paramList.hasNext())
      paramInt &= (((c)paramList.next()).ejB() ^ 0xFFFFFFFF);
    this.BFy = paramInt;
    AppMethodBeat.o(122181);
  }

  public final boolean UI(int paramInt)
  {
    if ((this.BFy & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(122180);
    Object localObject1 = ((Iterable)BFV).iterator();
    int i;
    label49: label53: label67: Iterator localIterator;
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if (((d.a.a)localObject2).mask == this.BFy)
      {
        i = 1;
        if (i == 0)
          break label154;
        localObject2 = (d.a.a)localObject2;
        if (localObject2 == null)
          break label161;
        localObject2 = ((d.a.a)localObject2).name;
        localObject1 = localObject2;
        if (localObject2 != null)
          break label195;
        localObject2 = (Iterable)BFW;
        localObject1 = (Collection)new ArrayList();
        localIterator = ((Iterable)localObject2).iterator();
      }
    }
    label154: label161: label169: 
    while (true)
    {
      label99: if (!localIterator.hasNext())
        break label171;
      localObject2 = (d.a.a)localIterator.next();
      if (UI(((d.a.a)localObject2).mask));
      for (localObject2 = ((d.a.a)localObject2).name; ; localObject2 = null)
      {
        if (localObject2 == null)
          break label169;
        ((Collection)localObject1).add(localObject2);
        break label99;
        i = 0;
        break label49;
        break;
        localObject2 = null;
        break label53;
        localObject2 = null;
        break label67;
      }
    }
    label171: localObject1 = a.a.j.a((Iterable)localObject1, (CharSequence)" | ", null, null, 0, null, null, 62);
    label195: Object localObject2 = "DescriptorKindFilter(" + (String)localObject1 + ", " + this.BFz + ')';
    AppMethodBeat.o(122180);
    return localObject2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.d
 * JD-Core Version:    0.6.2
 */