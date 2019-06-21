package a.i.b.a.c.b.a;

import a.a.ad;
import a.a.j;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum n
{
  private static final Set<n> BgR;
  private static final Set<n> BgS;
  private static final Map<e, n> BgT;
  public static final n.a BgU;
  private static final HashMap<String, n> cag;
  private final String description;
  private final boolean isDefault;

  static
  {
    AppMethodBeat.i(119366);
    n localn1 = new n("CLASS", 0, "class");
    Bgb = localn1;
    n localn2 = new n("ANNOTATION_CLASS", 1, "annotation class");
    Bgc = localn2;
    n localn3 = new n("TYPE_PARAMETER", 2, "type parameter", false);
    Bgd = localn3;
    n localn4 = new n("PROPERTY", 3, "property");
    Bge = localn4;
    n localn5 = new n("FIELD", 4, "field");
    Bgf = localn5;
    n localn6 = new n("LOCAL_VARIABLE", 5, "local variable");
    Bgg = localn6;
    n localn7 = new n("VALUE_PARAMETER", 6, "value parameter");
    Bgh = localn7;
    n localn8 = new n("CONSTRUCTOR", 7, "constructor");
    Bgi = localn8;
    n localn9 = new n("FUNCTION", 8, "function");
    Bgj = localn9;
    n localn10 = new n("PROPERTY_GETTER", 9, "getter");
    Bgk = localn10;
    n localn11 = new n("PROPERTY_SETTER", 10, "setter");
    Bgl = localn11;
    n localn12 = new n("TYPE", 11, "type usage", false);
    Bgm = localn12;
    Object localObject1 = new n("EXPRESSION", 12, "expression", false);
    Bgn = (n)localObject1;
    n localn13 = new n("FILE", 13, "file", false);
    Bgo = localn13;
    n localn14 = new n("TYPEALIAS", 14, "typealias", false);
    Bgp = localn14;
    n localn15 = new n("TYPE_PROJECTION", 15, "type projection", false);
    Bgq = localn15;
    n localn16 = new n("STAR_PROJECTION", 16, "star projection", false);
    Bgr = localn16;
    n localn17 = new n("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    Bgs = localn17;
    n localn18 = new n("CLASS_ONLY", 18, "class", false);
    Bgt = localn18;
    n localn19 = new n("OBJECT", 19, "object", false);
    Bgu = localn19;
    n localn20 = new n("COMPANION_OBJECT", 20, "companion object", false);
    Bgv = localn20;
    n localn21 = new n("INTERFACE", 21, "interface", false);
    Bgw = localn21;
    n localn22 = new n("ENUM_CLASS", 22, "enum class", false);
    Bgx = localn22;
    n localn23 = new n("ENUM_ENTRY", 23, "enum entry", false);
    Bgy = localn23;
    n localn24 = new n("LOCAL_CLASS", 24, "local class", false);
    Bgz = localn24;
    n localn25 = new n("LOCAL_FUNCTION", 25, "local function", false);
    BgA = localn25;
    n localn26 = new n("MEMBER_FUNCTION", 26, "member function", false);
    BgB = localn26;
    n localn27 = new n("TOP_LEVEL_FUNCTION", 27, "top level function", false);
    BgC = localn27;
    n localn28 = new n("MEMBER_PROPERTY", 28, "member property", false);
    BgD = localn28;
    n localn29 = new n("MEMBER_PROPERTY_WITH_BACKING_FIELD", 29, "member property with backing field", false);
    BgE = localn29;
    n localn30 = new n("MEMBER_PROPERTY_WITH_DELEGATE", 30, "member property with delegate", false);
    BgF = localn30;
    Object localObject2 = new n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 31, "member property without backing field or delegate", false);
    BgG = (n)localObject2;
    n localn31 = new n("TOP_LEVEL_PROPERTY", 32, "top level property", false);
    BgH = localn31;
    n localn32 = new n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 33, "top level property with backing field", false);
    BgI = localn32;
    n localn33 = new n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 34, "top level property with delegate", false);
    BgJ = localn33;
    n localn34 = new n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 35, "top level property without backing field or delegate", false);
    BgK = localn34;
    n localn35 = new n("INITIALIZER", 36, "initializer", false);
    BgL = localn35;
    n localn36 = new n("DESTRUCTURING_DECLARATION", 37, "destructuring declaration", false);
    BgM = localn36;
    n localn37 = new n("LAMBDA_EXPRESSION", 38, "lambda expression", false);
    BgN = localn37;
    n localn38 = new n("ANONYMOUS_FUNCTION", 39, "anonymous function", false);
    BgO = localn38;
    n localn39 = new n("OBJECT_LITERAL", 40, "object literal", false);
    BgP = localn39;
    BgQ = new n[] { localn1, localn2, localn3, localn4, localn5, localn6, localn7, localn8, localn9, localn10, localn11, localn12, localObject1, localn13, localn14, localn15, localn16, localn17, localn18, localn19, localn20, localn21, localn22, localn23, localn24, localn25, localn26, localn27, localn28, localn29, localn30, localObject2, localn31, localn32, localn33, localn34, localn35, localn36, localn37, localn38, localn39 };
    BgU = new n.a((byte)0);
    cag = new HashMap();
    for (localn34 : values())
      ((Map)cag).put(localn34.name(), localn34);
    localObject2 = values();
    localObject1 = (Collection)new ArrayList();
    ??? = localObject2.length;
    for (??? = 0; ??? < ???; ???++)
    {
      localn34 = localObject2[???];
      if (localn34.isDefault)
        ((Collection)localObject1).add(localn34);
    }
    BgR = j.o((Iterable)localObject1);
    BgS = a.a.e.R(values());
    BgT = ad.a(new o[] { u.I(e.Bfx, Bgh), u.I(e.Bfr, Bgf), u.I(e.Bft, Bge), u.I(e.Bfs, Bgo), u.I(e.Bfu, Bgk), u.I(e.Bfv, Bgl), u.I(e.Bfw, Bgh), u.I(e.Bfy, Bgh), u.I(e.Bfz, Bgf) });
    AppMethodBeat.o(119366);
  }

  private n(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(119367);
    this.description = paramString;
    this.isDefault = paramBoolean;
    AppMethodBeat.o(119367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.n
 * JD-Core Version:    0.6.2
 */