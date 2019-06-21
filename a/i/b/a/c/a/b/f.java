package a.i.b.a.c.a.b;

import a.a.aj;
import a.f.b.u.c;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.q;
import a.i.b.a.c.b.t.a;
import a.i.b.a.c.b.y;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.o;
import a.i.b.a.c.i.e.h.b;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ao;
import a.i.b.a.c.l.z;
import a.i.b.a.c.n.b.b;
import a.i.b.a.c.n.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class f
  implements a.i.b.a.c.b.b.a, a.i.b.a.c.b.b.c
{
  private static final Set<String> BdQ;
  private static final Set<String> BdR;
  private static final Set<String> BdS;
  private static final Set<String> BdT;
  private static final Set<String> BdU;
  private static final Set<String> BdV;
  public static final f.a BdW;
  private final c BdJ;
  private final a.f BdK;
  private final a.f BdL;
  private final a.i.b.a.c.l.w BdM;
  private final a.i.b.a.c.k.f BdN;
  private final a.i.b.a.c.k.a<a.i.b.a.c.f.b, e> BdO;
  private final a.i.b.a.c.k.f BdP;
  private final y Bdv;

  static
  {
    AppMethodBeat.i(119229);
    eQB = new a.i.k[] { (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(f.class), "ownerModuleDescriptor", "getOwnerModuleDescriptor()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;")), (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(f.class), "isAdditionalBuiltInsFeatureSupported", "isAdditionalBuiltInsFeatureSupported()Z")), (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(f.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(f.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;")) };
    BdW = new f.a((byte)0);
    Object localObject1 = a.i.b.a.c.d.b.t.BrJ;
    BdQ = aj.b((Set)a.i.b.a.c.d.b.t.q("Collection", new String[] { "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;" }), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    localObject1 = a.i.b.a.c.d.b.t.BrJ;
    localObject1 = a.i.b.a.c.d.b.t.BrJ;
    Object localObject2 = (Iterable)a.a.j.listOf(new a.i.b.a.c.i.d.c[] { a.i.b.a.c.i.d.c.BFe, a.i.b.a.c.i.d.c.BFf });
    localObject1 = (Collection)new LinkedHashSet();
    Iterator localIterator = ((Iterable)localObject2).iterator();
    while (localIterator.hasNext())
    {
      a.i.b.a.c.i.d.c localc = (a.i.b.a.c.i.d.c)localIterator.next();
      localObject2 = localc.BFr.ByQ.ehK().name;
      a.f.b.j.o(localObject2, "it.wrapperFqName.shortName().asString()");
      a.a.j.a((Collection)localObject1, (Iterable)a.i.b.a.c.d.b.t.p((String)localObject2, new String[] { localc.name + "Value()" + localc.desc }));
    }
    BdR = aj.a(aj.a(aj.a(aj.a(aj.a((Set)localObject1, (Iterable)a.i.b.a.c.d.b.t.q("List", new String[] { "sort(Ljava/util/Comparator;)V" })), (Iterable)a.i.b.a.c.d.b.t.p("String", new String[] { "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;" })), (Iterable)a.i.b.a.c.d.b.t.p("Double", new String[] { "isInfinite()Z", "isNaN()Z" })), (Iterable)a.i.b.a.c.d.b.t.p("Float", new String[] { "isInfinite()Z", "isNaN()Z" })), (Iterable)a.i.b.a.c.d.b.t.p("Enum", new String[] { "getDeclaringClass()Ljava/lang/Class;", "finalize()V" }));
    localObject1 = a.i.b.a.c.d.b.t.BrJ;
    BdS = aj.a(aj.a(aj.a(aj.a(aj.a(aj.a((Set)a.i.b.a.c.d.b.t.p("CharSequence", new String[] { "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;" }), (Iterable)a.i.b.a.c.d.b.t.q("Iterator", new String[] { "forEachRemaining(Ljava/util/function/Consumer;)V" })), (Iterable)a.i.b.a.c.d.b.t.p("Iterable", new String[] { "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;" })), (Iterable)a.i.b.a.c.d.b.t.p("Throwable", new String[] { "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V" })), (Iterable)a.i.b.a.c.d.b.t.q("Collection", new String[] { "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z" })), (Iterable)a.i.b.a.c.d.b.t.q("List", new String[] { "replaceAll(Ljava/util/function/UnaryOperator;)V" })), (Iterable)a.i.b.a.c.d.b.t.q("Map", new String[] { "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;" }));
    localObject1 = a.i.b.a.c.d.b.t.BrJ;
    BdT = aj.a(aj.a((Set)a.i.b.a.c.d.b.t.q("Collection", new String[] { "removeIf(Ljava/util/function/Predicate;)Z" }), (Iterable)a.i.b.a.c.d.b.t.q("List", new String[] { "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V" })), (Iterable)a.i.b.a.c.d.b.t.q("Map", new String[] { "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z" }));
    localObject1 = a.i.b.a.c.d.b.t.BrJ;
    localObject2 = f.a.dYO();
    localObject1 = a.i.b.a.c.d.b.t.ad(new String[] { "D" });
    localObject2 = aj.a((Set)localObject2, (Iterable)a.i.b.a.c.d.b.t.p("Float", (String[])Arrays.copyOf((Object[])localObject1, localObject1.length)));
    localObject1 = a.i.b.a.c.d.b.t.ad(new String[] { "[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;" });
    BdU = aj.a((Set)localObject2, (Iterable)a.i.b.a.c.d.b.t.p("String", (String[])Arrays.copyOf((Object[])localObject1, localObject1.length)));
    localObject1 = a.i.b.a.c.d.b.t.BrJ;
    localObject1 = a.i.b.a.c.d.b.t.ad(new String[] { "Ljava/lang/String;Ljava/lang/Throwable;ZZ" });
    BdV = (Set)a.i.b.a.c.d.b.t.p("Throwable", (String[])Arrays.copyOf((Object[])localObject1, localObject1.length));
    AppMethodBeat.o(119229);
  }

  public f(y paramy, a.i.b.a.c.k.i parami, a.f.a.a<? extends y> parama, a.f.a.a<Boolean> parama1)
  {
    AppMethodBeat.i(119240);
    this.Bdv = paramy;
    this.BdJ = c.Bdq;
    this.BdK = a.g.g(parama);
    this.BdL = a.g.g(parama1);
    paramy = new f.d(this, this.Bdv, new a.i.b.a.c.f.b("java.io"));
    parama = a.a.j.listOf(new z(parami, (a.f.a.a)new f.e(this)));
    paramy = new a.i.b.a.c.b.c.h((l)paramy, a.i.b.a.c.f.f.avX("Serializable"), a.i.b.a.c.b.w.BeE, a.i.b.a.c.b.f.Bes, (Collection)parama, am.BeR, parami);
    paramy.a((a.i.b.a.c.i.e.h)h.b.BGh, (Set)a.a.x.AUR, null);
    paramy = paramy.dZf();
    a.f.b.j.o(paramy, "mockSerializableClass.defaultType");
    this.BdM = ((a.i.b.a.c.l.w)paramy);
    this.BdN = parami.i((a.f.a.a)new f.c(this, parami));
    this.BdO = parami.eke();
    this.BdP = parami.i((a.f.a.a)new m(this));
    AppMethodBeat.o(119240);
  }

  private final y dYH()
  {
    AppMethodBeat.i(119230);
    y localy = (y)this.BdK.getValue();
    AppMethodBeat.o(119230);
    return localy;
  }

  private final boolean dYI()
  {
    AppMethodBeat.i(119231);
    boolean bool = ((Boolean)this.BdL.getValue()).booleanValue();
    AppMethodBeat.o(119231);
    return bool;
  }

  private final ad dYJ()
  {
    AppMethodBeat.i(119232);
    ad localad = (ad)a.i.b.a.c.k.h.a(this.BdN, eQB[2]);
    AppMethodBeat.o(119232);
    return localad;
  }

  private final a.i.b.a.c.b.a.g dYK()
  {
    AppMethodBeat.i(119233);
    a.i.b.a.c.b.a.g localg = (a.i.b.a.c.b.a.g)a.i.b.a.c.k.h.a(this.BdP, eQB[3]);
    AppMethodBeat.o(119233);
    return localg;
  }

  private final a.i.b.a.c.d.a.c.a.f n(e parame)
  {
    e locale = null;
    AppMethodBeat.i(119237);
    if (a.i.b.a.c.a.g.f(parame))
    {
      AppMethodBeat.o(119237);
      parame = locale;
    }
    while (true)
    {
      return parame;
      if (!a.i.b.a.c.a.g.c((l)parame))
      {
        AppMethodBeat.o(119237);
        parame = locale;
      }
      else
      {
        parame = a.i.b.a.c.i.c.a.q((l)parame);
        if (!parame.ehH())
        {
          AppMethodBeat.o(119237);
          parame = locale;
        }
        else
        {
          parame = c.c(parame);
          if (parame != null)
          {
            parame = parame.ehE();
            if (parame != null);
          }
          else
          {
            AppMethodBeat.o(119237);
            parame = locale;
            continue;
          }
          a.f.b.j.o(parame, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
          locale = q.a(dYH(), parame, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjI);
          parame = locale;
          if (!(locale instanceof a.i.b.a.c.d.a.c.a.f))
            parame = null;
          parame = (a.i.b.a.c.d.a.c.a.f)parame;
          AppMethodBeat.o(119237);
        }
      }
    }
  }

  public final Collection<al> a(a.i.b.a.c.f.f paramf, e parame)
  {
    AppMethodBeat.i(119235);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parame, "classDescriptor");
    Object localObject1 = a.Bdb;
    Object localObject2;
    Object localObject3;
    int i;
    if ((a.f.b.j.j(paramf, a.dYy())) && ((parame instanceof a.i.b.a.c.j.a.a.d)) && (a.i.b.a.c.a.g.c(parame)))
    {
      localObject1 = ((a.i.b.a.c.j.a.a.d)parame).BGD.Btw;
      a.f.b.j.o(localObject1, "classDescriptor.classProto.functionList");
      localObject1 = (Iterable)localObject1;
      if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
      {
        localObject1 = ((Iterable)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a.o)((Iterator)localObject1).next();
          localObject3 = ((a.i.b.a.c.j.a.a.d)parame).BHj.AWq;
          a.f.b.j.o(localObject2, "functionProto");
          localObject2 = a.i.b.a.c.j.a.r.b((a.i.b.a.c.e.a.c)localObject3, ((a.o)localObject2).Buf);
          localObject3 = a.Bdb;
          if (a.f.b.j.j(localObject2, a.dYy()))
          {
            i = 1;
            if (i == 0)
              break label197;
            paramf = (Collection)a.a.v.AUP;
            AppMethodBeat.o(119235);
          }
        }
      }
    }
    while (true)
    {
      return paramf;
      i = 0;
      break;
      label197: parame = (a.i.b.a.c.j.a.a.d)parame;
      paramf = ((al)a.a.j.h((Iterable)dYJ().dXR().b(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjI))).dZw();
      paramf.g((l)parame);
      paramf.a(ay.Bfa);
      paramf.I((a.i.b.a.c.l.w)parame.dZf());
      paramf.b(parame.dZl());
      paramf = paramf.dZC();
      if (paramf == null)
        a.f.b.j.dWJ();
      paramf = (Collection)a.a.j.listOf((al)paramf);
      AppMethodBeat.o(119235);
      continue;
      if (!dYI())
      {
        paramf = (Collection)a.a.v.AUP;
        AppMethodBeat.o(119235);
      }
      else
      {
        localObject2 = (a.f.a.b)new f.h(paramf);
        localObject3 = n(parame);
        if (localObject3 == null)
          paramf = (Collection)a.a.v.AUP;
        while (true)
        {
          paramf = (Iterable)paramf;
          localObject1 = (Collection)new ArrayList();
          localObject2 = paramf.iterator();
          if (!((Iterator)localObject2).hasNext())
            break label1585;
          localObject3 = (al)((Iterator)localObject2).next();
          paramf = ((al)localObject3).dXW();
          if (paramf != null)
            break;
          paramf = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
          AppMethodBeat.o(119235);
          throw paramf;
          localObject1 = a.i.b.a.c.i.c.a.o((l)localObject3);
          paramf = b.Bdc;
          paramf = b.dYz().dXD();
          a.f.b.j.p(localObject1, "fqName");
          a.f.b.j.p(paramf, "builtIns");
          localObject1 = c.a((a.i.b.a.c.f.b)localObject1, paramf);
          if (localObject1 == null)
          {
            localObject1 = (Collection)a.a.x.AUR;
            label508: paramf = (Iterable)localObject1;
            a.f.b.j.p(paramf, "receiver$0");
            if (!(paramf instanceof List))
              break label667;
            if (!((List)paramf).isEmpty())
              break label643;
            paramf = null;
          }
          while (true)
          {
            localObject4 = (e)paramf;
            if (localObject4 != null)
              break label711;
            paramf = (Collection)a.a.v.AUP;
            break;
            localObject4 = (a.i.b.a.c.f.b)c.Bdo.get(a.i.b.a.c.i.c.a.q((l)localObject1));
            if (localObject4 == null)
            {
              localObject1 = (Collection)aj.setOf(localObject1);
              break label508;
            }
            a.f.b.j.o(localObject4, "readOnlyToMutable[kotlin…eturn setOf(kotlinAnalog)");
            paramf = Arrays.asList(new e[] { localObject1, paramf.c((a.i.b.a.c.f.b)localObject4) });
            a.f.b.j.o(paramf, "Arrays.asList(kotlinAnal…tlinMutableAnalogFqName))");
            localObject1 = (Collection)paramf;
            break label508;
            label643: paramf = ((List)paramf).get(((List)paramf).size() - 1);
            continue;
            label667: localObject4 = paramf.iterator();
            if (!((Iterator)localObject4).hasNext())
              paramf = null;
            else
              do
                paramf = ((Iterator)localObject4).next();
              while (((Iterator)localObject4).hasNext());
          }
          label711: paramf = a.i.b.a.c.n.i.BNv;
          localObject1 = (Iterable)localObject1;
          paramf = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
            paramf.add(a.i.b.a.c.i.c.a.o((l)((Iterator)localObject1).next()));
          localObject1 = (Collection)paramf;
          a.f.b.j.p(localObject1, "set");
          paramf = new a.i.b.a.c.n.i((byte)0);
          paramf.addAll((Collection)localObject1);
          boolean bool1 = c.h(parame);
          localObject1 = ((e)this.BdO.b(a.i.b.a.c.i.c.a.o((l)localObject3), (a.f.a.a)new f.f((a.i.b.a.c.d.a.c.a.f)localObject3, (e)localObject4))).dXZ();
          a.f.b.j.o(localObject1, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
          localObject2 = (Iterable)((a.f.a.b)localObject2).am(localObject1);
          localObject1 = (Collection)new ArrayList();
          localObject3 = ((Iterable)localObject2).iterator();
          label1168: label1241: label1245: 
          while (((Iterator)localObject3).hasNext())
          {
            localObject2 = ((Iterator)localObject3).next();
            localObject4 = (al)localObject2;
            boolean bool2;
            if ((((al)localObject4).dYZ() == b.a.Bej) && (((al)localObject4).dYf().Bfm) && (!a.i.b.a.c.a.g.f((l)localObject4)))
            {
              localObject5 = ((al)localObject4).dYX();
              a.f.b.j.o(localObject5, "analogueMember.overriddenDescriptors");
              localObject5 = (Iterable)localObject5;
              Object localObject6;
              if ((!(localObject5 instanceof Collection)) || (!((Collection)localObject5).isEmpty()))
              {
                localObject5 = ((Iterable)localObject5).iterator();
                while (((Iterator)localObject5).hasNext())
                {
                  localObject6 = (a.i.b.a.c.b.t)((Iterator)localObject5).next();
                  a.f.b.j.o(localObject6, "it");
                  localObject6 = ((a.i.b.a.c.b.t)localObject6).dXW();
                  a.f.b.j.o(localObject6, "it.containingDeclaration");
                  if (paramf.contains(a.i.b.a.c.i.c.a.o((l)localObject6)))
                    i = 1;
                }
              }
              while (true)
                if (i == 0)
                {
                  localObject5 = ((al)localObject4).dXW();
                  if (localObject5 == null)
                  {
                    paramf = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    AppMethodBeat.o(119235);
                    throw paramf;
                    i = 0;
                  }
                  else
                  {
                    localObject6 = (e)localObject5;
                    localObject5 = a.i.b.a.c.d.b.r.a((a.i.b.a.c.b.t)localObject4, false, false, 3);
                    Set localSet = BdT;
                    a.i.b.a.c.d.b.t localt = a.i.b.a.c.d.b.t.BrJ;
                    if ((localSet.contains(a.i.b.a.c.d.b.t.a((e)localObject6, (String)localObject5)) ^ bool1))
                    {
                      bool2 = true;
                      if (bool2)
                        break label1241;
                    }
                  }
                }
            }
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label1245;
              ((Collection)localObject1).add(localObject2);
              break;
              localObject4 = a.i.b.a.c.n.b.a((Collection)a.a.j.listOf(localObject4), (b.b)f.k.Bei, (a.f.a.b)new l(this));
              a.f.b.j.o(localObject4, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
              bool2 = ((Boolean)localObject4).booleanValue();
              break label1168;
            }
          }
          paramf = (Collection)localObject1;
        }
        paramf = ((al)localObject3).c(h.a((e)paramf, parame).ekr());
        if (paramf == null)
        {
          paramf = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
          AppMethodBeat.o(119235);
          throw paramf;
        }
        paramf = ((al)paramf).dZw();
        paramf.g((l)parame);
        paramf.b(parame.dZl());
        paramf.dZy();
        Object localObject4 = (a.i.b.a.c.b.t)localObject3;
        localObject3 = ((a.i.b.a.c.b.t)localObject4).dXW();
        if (localObject3 == null)
        {
          paramf = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
          AppMethodBeat.o(119235);
          throw paramf;
        }
        localObject3 = (e)localObject3;
        localObject4 = a.i.b.a.c.d.b.r.a((a.i.b.a.c.b.t)localObject4, false, false, 3);
        Object localObject5 = new u.c();
        ((u.c)localObject5).AVE = null;
        localObject3 = a.i.b.a.c.n.b.a((Collection)a.a.j.listOf(localObject3), (b.b)new f.i(this), (b.c)new f.j((String)localObject4, (u.c)localObject5));
        a.f.b.j.o(localObject3, "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })");
        localObject3 = (f.b)localObject3;
        switch (g.eQZ[localObject3.ordinal()])
        {
        default:
          label1500: paramf = paramf.dZC();
          if (paramf == null)
            a.f.b.j.dWJ();
          paramf = (al)paramf;
        case 1:
        case 2:
        case 3:
        }
        while (paramf != null)
        {
          ((Collection)localObject1).add(paramf);
          break;
          if (a.i.b.a.c.b.x.p(parame))
          {
            paramf = null;
          }
          else
          {
            a.f.b.j.o(paramf.dZB(), "setHiddenForResolutionEverywhereBesideSupercalls()");
            break label1500;
            a.f.b.j.o(paramf.a(dYK()), "setAdditionalAnnotations(notConsideredDeprecation)");
            break label1500;
            paramf = null;
          }
        }
        label1585: paramf = (Collection)localObject1;
        AppMethodBeat.o(119235);
      }
    }
  }

  public final boolean a(e parame, al paramal)
  {
    AppMethodBeat.i(119239);
    a.f.b.j.p(parame, "classDescriptor");
    a.f.b.j.p(paramal, "functionDescriptor");
    Object localObject = n(parame);
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(119239);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (!paramal.dYn().j(a.i.b.a.c.b.b.d.eaj()))
      {
        AppMethodBeat.o(119239);
        bool = true;
      }
      else if (!dYI())
      {
        AppMethodBeat.o(119239);
        bool = false;
      }
      else
      {
        parame = a.i.b.a.c.d.b.r.a((a.i.b.a.c.b.t)paramal, false, false, 3);
        localObject = ((a.i.b.a.c.d.a.c.a.f)localObject).BnW;
        paramal = paramal.dZg();
        a.f.b.j.o(paramal, "functionDescriptor.name");
        paramal = (Iterable)((a.i.b.a.c.d.a.c.a.g)localObject).b(paramal, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjI);
        if ((!(paramal instanceof Collection)) || (!((Collection)paramal).isEmpty()))
        {
          paramal = paramal.iterator();
          while (true)
            if (paramal.hasNext())
              if (a.f.b.j.j(a.i.b.a.c.d.b.r.a((a.i.b.a.c.b.t)paramal.next(), false, false, 3), parame))
              {
                AppMethodBeat.o(119239);
                bool = true;
                break;
              }
        }
        AppMethodBeat.o(119239);
        bool = false;
      }
    }
  }

  public final Collection<a.i.b.a.c.l.w> l(e parame)
  {
    AppMethodBeat.i(119234);
    a.f.b.j.p(parame, "classDescriptor");
    parame = a.i.b.a.c.i.c.a.q((l)parame);
    if (f.a.e(parame))
    {
      parame = dYJ();
      a.f.b.j.o(parame, "cloneableType");
      parame = (Collection)a.a.j.listOf(new a.i.b.a.c.l.w[] { (a.i.b.a.c.l.w)parame, this.BdM });
      AppMethodBeat.o(119234);
    }
    while (true)
    {
      return parame;
      if (f.a.d(parame))
      {
        parame = (Collection)a.a.j.listOf(this.BdM);
        AppMethodBeat.o(119234);
      }
      else
      {
        parame = (Collection)a.a.v.AUP;
        AppMethodBeat.o(119234);
      }
    }
  }

  public final Collection<a.i.b.a.c.b.d> o(e parame)
  {
    AppMethodBeat.i(119238);
    a.f.b.j.p(parame, "classDescriptor");
    if ((parame.dYc() != a.i.b.a.c.b.f.Ber) || (!dYI()))
    {
      parame = (Collection)a.a.v.AUP;
      AppMethodBeat.o(119238);
    }
    while (true)
    {
      return parame;
      a.i.b.a.c.d.a.c.a.f localf = n(parame);
      if (localf == null)
      {
        parame = (Collection)a.a.v.AUP;
        AppMethodBeat.o(119238);
      }
      else
      {
        Object localObject1 = a.i.b.a.c.i.c.a.o((l)localf);
        Object localObject2 = b.Bdc;
        Object localObject3 = c.a((a.i.b.a.c.f.b)localObject1, b.dYz().dXD());
        if (localObject3 == null)
        {
          parame = (Collection)a.a.v.AUP;
          AppMethodBeat.o(119238);
        }
        else
        {
          localObject2 = h.a((e)localObject3, (e)localf).ekr();
          Object localObject4 = new f.g((a.i.b.a.c.l.au)localObject2);
          localObject1 = (Iterable)localf.ebr();
          Object localObject5 = (Collection)new ArrayList();
          Object localObject6 = ((Iterable)localObject1).iterator();
          Object localObject7;
          label513: label517: 
          while (((Iterator)localObject6).hasNext())
          {
            localObject7 = ((Iterator)localObject6).next();
            a.i.b.a.c.b.d locald = (a.i.b.a.c.b.d)localObject7;
            a.f.b.j.o(locald, "javaConstructor");
            if (locald.dYf().Bfm)
            {
              localObject1 = ((e)localObject3).dYb();
              a.f.b.j.o(localObject1, "defaultKotlinVersion.constructors");
              localObject1 = (Iterable)localObject1;
              if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
              {
                Object localObject8 = ((Iterable)localObject1).iterator();
                while (((Iterator)localObject8).hasNext())
                {
                  localObject1 = (a.i.b.a.c.b.d)((Iterator)localObject8).next();
                  a.f.b.j.o(localObject1, "it");
                  if (((f.g)localObject4).a((a.i.b.a.c.b.k)localObject1, (a.i.b.a.c.b.k)locald))
                  {
                    i = 0;
                    label323: if (i == 0)
                      break label513;
                    localObject1 = (a.i.b.a.c.b.k)locald;
                    if (((a.i.b.a.c.b.k)localObject1).dYV().size() != 1)
                      break label507;
                    localObject1 = ((a.i.b.a.c.b.k)localObject1).dYV();
                    a.f.b.j.o(localObject1, "valueParameters");
                    localObject1 = a.a.j.fN((List)localObject1);
                    a.f.b.j.o(localObject1, "valueParameters.single()");
                    localObject1 = ((a.i.b.a.c.b.au)localObject1).dZS().ejw().dYs();
                    if (localObject1 == null)
                      break label502;
                    localObject1 = a.i.b.a.c.i.c.a.q((l)localObject1);
                    label405: if (!a.f.b.j.j(localObject1, a.i.b.a.c.i.c.a.q((l)parame)))
                      break label507;
                    i = 1;
                    label422: if ((i != 0) || (a.i.b.a.c.a.g.f((l)locald)))
                      break label513;
                    localObject8 = BdU;
                    localObject1 = a.i.b.a.c.d.b.t.BrJ;
                    if (((Set)localObject8).contains(a.i.b.a.c.d.b.t.a((e)localf, a.i.b.a.c.d.b.r.a((a.i.b.a.c.b.t)locald, false, false, 3))))
                      break label513;
                  }
                }
              }
            }
            for (int i = 1; ; i = 0)
            {
              if (i == 0)
                break label517;
              ((Collection)localObject5).add(localObject7);
              break;
              i = 1;
              break label323;
              label502: localObject1 = null;
              break label405;
              label507: i = 0;
              break label422;
            }
          }
          localObject3 = (Iterable)localObject5;
          localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject3));
          localObject3 = ((Iterable)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject7 = (a.i.b.a.c.b.d)((Iterator)localObject3).next();
            localObject5 = ((a.i.b.a.c.b.d)localObject7).dZw();
            ((t.a)localObject5).g((l)parame);
            ((t.a)localObject5).I((a.i.b.a.c.l.w)parame.dZf());
            ((t.a)localObject5).dZy();
            ((t.a)localObject5).b(((a.i.b.a.c.l.au)localObject2).Bik);
            localObject4 = BdV;
            localObject6 = a.i.b.a.c.d.b.t.BrJ;
            localObject6 = (e)localf;
            a.f.b.j.o(localObject7, "javaConstructor");
            if (!((Set)localObject4).contains(a.i.b.a.c.d.b.t.a((e)localObject6, a.i.b.a.c.d.b.r.a((a.i.b.a.c.b.t)localObject7, false, false, 3))))
              ((t.a)localObject5).a(dYK());
            localObject5 = ((t.a)localObject5).dZC();
            if (localObject5 == null)
            {
              parame = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
              AppMethodBeat.o(119238);
              throw parame;
            }
            ((Collection)localObject1).add((a.i.b.a.c.b.d)localObject5);
          }
          parame = (Collection)localObject1;
          AppMethodBeat.o(119238);
        }
      }
    }
  }

  static final class l extends a.f.b.k
    implements a.f.a.b<a.i.b.a.c.b.b, Boolean>
  {
    l(f paramf)
    {
      super();
    }
  }

  static final class m extends a.f.b.k
    implements a.f.a.a<a.i.b.a.c.b.a.g>
  {
    m(f paramf)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.b.f
 * JD-Core Version:    0.6.2
 */