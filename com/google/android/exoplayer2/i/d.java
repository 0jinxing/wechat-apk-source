package com.google.android.exoplayer2.i;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
{
  private static final Pattern brb;
  private static final Pattern brc;
  private static final Pattern brd;
  private static final Map<String, Integer> bre;

  static
  {
    AppMethodBeat.i(95872);
    brb = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    brc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    brd = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    HashMap localHashMap = new HashMap();
    bre = localHashMap;
    localHashMap.put("aliceblue", Integer.valueOf(-984833));
    bre.put("antiquewhite", Integer.valueOf(-332841));
    bre.put("aqua", Integer.valueOf(-16711681));
    bre.put("aquamarine", Integer.valueOf(-8388652));
    bre.put("azure", Integer.valueOf(-983041));
    bre.put("beige", Integer.valueOf(-657956));
    bre.put("bisque", Integer.valueOf(-6972));
    bre.put("black", Integer.valueOf(-16777216));
    bre.put("blanchedalmond", Integer.valueOf(-5171));
    bre.put("blue", Integer.valueOf(-16776961));
    bre.put("blueviolet", Integer.valueOf(-7722014));
    bre.put("brown", Integer.valueOf(-5952982));
    bre.put("burlywood", Integer.valueOf(-2180985));
    bre.put("cadetblue", Integer.valueOf(-10510688));
    bre.put("chartreuse", Integer.valueOf(-8388864));
    bre.put("chocolate", Integer.valueOf(-2987746));
    bre.put("coral", Integer.valueOf(-32944));
    bre.put("cornflowerblue", Integer.valueOf(-10185235));
    bre.put("cornsilk", Integer.valueOf(-1828));
    bre.put("crimson", Integer.valueOf(-2354116));
    bre.put("cyan", Integer.valueOf(-16711681));
    bre.put("darkblue", Integer.valueOf(-16777077));
    bre.put("darkcyan", Integer.valueOf(-16741493));
    bre.put("darkgoldenrod", Integer.valueOf(-4684277));
    bre.put("darkgray", Integer.valueOf(-5658199));
    bre.put("darkgreen", Integer.valueOf(-16751616));
    bre.put("darkgrey", Integer.valueOf(-5658199));
    bre.put("darkkhaki", Integer.valueOf(-4343957));
    bre.put("darkmagenta", Integer.valueOf(-7667573));
    bre.put("darkolivegreen", Integer.valueOf(-11179217));
    bre.put("darkorange", Integer.valueOf(-29696));
    bre.put("darkorchid", Integer.valueOf(-6737204));
    bre.put("darkred", Integer.valueOf(-7667712));
    bre.put("darksalmon", Integer.valueOf(-1468806));
    bre.put("darkseagreen", Integer.valueOf(-7357297));
    bre.put("darkslateblue", Integer.valueOf(-12042869));
    bre.put("darkslategray", Integer.valueOf(-13676721));
    bre.put("darkslategrey", Integer.valueOf(-13676721));
    bre.put("darkturquoise", Integer.valueOf(-16724271));
    bre.put("darkviolet", Integer.valueOf(-7077677));
    bre.put("deeppink", Integer.valueOf(-60269));
    bre.put("deepskyblue", Integer.valueOf(-16728065));
    bre.put("dimgray", Integer.valueOf(-9868951));
    bre.put("dimgrey", Integer.valueOf(-9868951));
    bre.put("dodgerblue", Integer.valueOf(-14774017));
    bre.put("firebrick", Integer.valueOf(-5103070));
    bre.put("floralwhite", Integer.valueOf(-1296));
    bre.put("forestgreen", Integer.valueOf(-14513374));
    bre.put("fuchsia", Integer.valueOf(-65281));
    bre.put("gainsboro", Integer.valueOf(-2302756));
    bre.put("ghostwhite", Integer.valueOf(-460545));
    bre.put("gold", Integer.valueOf(-10496));
    bre.put("goldenrod", Integer.valueOf(-2448096));
    bre.put("gray", Integer.valueOf(-8355712));
    bre.put("green", Integer.valueOf(-16744448));
    bre.put("greenyellow", Integer.valueOf(-5374161));
    bre.put("grey", Integer.valueOf(-8355712));
    bre.put("honeydew", Integer.valueOf(-983056));
    bre.put("hotpink", Integer.valueOf(-38476));
    bre.put("indianred", Integer.valueOf(-3318692));
    bre.put("indigo", Integer.valueOf(-11861886));
    bre.put("ivory", Integer.valueOf(-16));
    bre.put("khaki", Integer.valueOf(-989556));
    bre.put("lavender", Integer.valueOf(-1644806));
    bre.put("lavenderblush", Integer.valueOf(-3851));
    bre.put("lawngreen", Integer.valueOf(-8586240));
    bre.put("lemonchiffon", Integer.valueOf(-1331));
    bre.put("lightblue", Integer.valueOf(-5383962));
    bre.put("lightcoral", Integer.valueOf(-1015680));
    bre.put("lightcyan", Integer.valueOf(-2031617));
    bre.put("lightgoldenrodyellow", Integer.valueOf(-329006));
    bre.put("lightgray", Integer.valueOf(-2894893));
    bre.put("lightgreen", Integer.valueOf(-7278960));
    bre.put("lightgrey", Integer.valueOf(-2894893));
    bre.put("lightpink", Integer.valueOf(-18751));
    bre.put("lightsalmon", Integer.valueOf(-24454));
    bre.put("lightseagreen", Integer.valueOf(-14634326));
    bre.put("lightskyblue", Integer.valueOf(-7876870));
    bre.put("lightslategray", Integer.valueOf(-8943463));
    bre.put("lightslategrey", Integer.valueOf(-8943463));
    bre.put("lightsteelblue", Integer.valueOf(-5192482));
    bre.put("lightyellow", Integer.valueOf(-32));
    bre.put("lime", Integer.valueOf(-16711936));
    bre.put("limegreen", Integer.valueOf(-13447886));
    bre.put("linen", Integer.valueOf(-331546));
    bre.put("magenta", Integer.valueOf(-65281));
    bre.put("maroon", Integer.valueOf(-8388608));
    bre.put("mediumaquamarine", Integer.valueOf(-10039894));
    bre.put("mediumblue", Integer.valueOf(-16777011));
    bre.put("mediumorchid", Integer.valueOf(-4565549));
    bre.put("mediumpurple", Integer.valueOf(-7114533));
    bre.put("mediumseagreen", Integer.valueOf(-12799119));
    bre.put("mediumslateblue", Integer.valueOf(-8689426));
    bre.put("mediumspringgreen", Integer.valueOf(-16713062));
    bre.put("mediumturquoise", Integer.valueOf(-12004916));
    bre.put("mediumvioletred", Integer.valueOf(-3730043));
    bre.put("midnightblue", Integer.valueOf(-15132304));
    bre.put("mintcream", Integer.valueOf(-655366));
    bre.put("mistyrose", Integer.valueOf(-6943));
    bre.put("moccasin", Integer.valueOf(-6987));
    bre.put("navajowhite", Integer.valueOf(-8531));
    bre.put("navy", Integer.valueOf(-16777088));
    bre.put("oldlace", Integer.valueOf(-133658));
    bre.put("olive", Integer.valueOf(-8355840));
    bre.put("olivedrab", Integer.valueOf(-9728477));
    bre.put("orange", Integer.valueOf(-23296));
    bre.put("orangered", Integer.valueOf(-47872));
    bre.put("orchid", Integer.valueOf(-2461482));
    bre.put("palegoldenrod", Integer.valueOf(-1120086));
    bre.put("palegreen", Integer.valueOf(-6751336));
    bre.put("paleturquoise", Integer.valueOf(-5247250));
    bre.put("palevioletred", Integer.valueOf(-2396013));
    bre.put("papayawhip", Integer.valueOf(-4139));
    bre.put("peachpuff", Integer.valueOf(-9543));
    bre.put("peru", Integer.valueOf(-3308225));
    bre.put("pink", Integer.valueOf(-16181));
    bre.put("plum", Integer.valueOf(-2252579));
    bre.put("powderblue", Integer.valueOf(-5185306));
    bre.put("purple", Integer.valueOf(-8388480));
    bre.put("rebeccapurple", Integer.valueOf(-10079335));
    bre.put("red", Integer.valueOf(-65536));
    bre.put("rosybrown", Integer.valueOf(-4419697));
    bre.put("royalblue", Integer.valueOf(-12490271));
    bre.put("saddlebrown", Integer.valueOf(-7650029));
    bre.put("salmon", Integer.valueOf(-360334));
    bre.put("sandybrown", Integer.valueOf(-744352));
    bre.put("seagreen", Integer.valueOf(-13726889));
    bre.put("seashell", Integer.valueOf(-2578));
    bre.put("sienna", Integer.valueOf(-6270419));
    bre.put("silver", Integer.valueOf(-4144960));
    bre.put("skyblue", Integer.valueOf(-7876885));
    bre.put("slateblue", Integer.valueOf(-9807155));
    bre.put("slategray", Integer.valueOf(-9404272));
    bre.put("slategrey", Integer.valueOf(-9404272));
    bre.put("snow", Integer.valueOf(-1286));
    bre.put("springgreen", Integer.valueOf(-16711809));
    bre.put("steelblue", Integer.valueOf(-12156236));
    bre.put("tan", Integer.valueOf(-2968436));
    bre.put("teal", Integer.valueOf(-16744320));
    bre.put("thistle", Integer.valueOf(-2572328));
    bre.put("tomato", Integer.valueOf(-40121));
    bre.put("transparent", Integer.valueOf(0));
    bre.put("turquoise", Integer.valueOf(-12525360));
    bre.put("violet", Integer.valueOf(-1146130));
    bre.put("wheat", Integer.valueOf(-663885));
    bre.put("white", Integer.valueOf(-1));
    bre.put("whitesmoke", Integer.valueOf(-657931));
    bre.put("yellow", Integer.valueOf(-256));
    bre.put("yellowgreen", Integer.valueOf(-6632142));
    AppMethodBeat.o(95872);
  }

  public static int aF(String paramString)
  {
    AppMethodBeat.i(95868);
    int i = g(paramString, false);
    AppMethodBeat.o(95868);
    return i;
  }

  public static int aG(String paramString)
  {
    AppMethodBeat.i(95869);
    int i = g(paramString, true);
    AppMethodBeat.o(95869);
    return i;
  }

  private static int argb(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
  }

  private static int g(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(95870);
    boolean bool;
    String str;
    int i;
    if (!TextUtils.isEmpty(paramString))
    {
      bool = true;
      a.checkArgument(bool);
      str = paramString.replace(" ", "");
      if (str.charAt(0) != '#')
        break label128;
      i = (int)Long.parseLong(str.substring(1), 16);
      if (str.length() != 7)
        break label83;
      i |= -16777216;
      label69: AppMethodBeat.o(95870);
    }
    while (true)
    {
      return i;
      bool = false;
      break;
      label83: if (str.length() == 9)
      {
        i = i >>> 8 | (i & 0xFF) << 24;
        break label69;
      }
      paramString = new IllegalArgumentException();
      AppMethodBeat.o(95870);
      throw paramString;
      label128: if (str.startsWith("rgba"))
      {
        if (paramBoolean)
        {
          paramString = brd;
          label146: paramString = paramString.matcher(str);
          if (!paramString.matches())
            break label350;
          if (!paramBoolean)
            break label231;
        }
        label231: for (i = (int)(255.0F * Float.parseFloat(paramString.group(4))); ; i = Integer.parseInt(paramString.group(4), 10))
        {
          i = argb(i, Integer.parseInt(paramString.group(1), 10), Integer.parseInt(paramString.group(2), 10), Integer.parseInt(paramString.group(3), 10));
          AppMethodBeat.o(95870);
          break;
          paramString = brc;
          break label146;
        }
      }
      if (str.startsWith("rgb"))
      {
        paramString = brb.matcher(str);
        if (!paramString.matches())
          break label350;
        i = rgb(Integer.parseInt(paramString.group(1), 10), Integer.parseInt(paramString.group(2), 10), Integer.parseInt(paramString.group(3), 10));
        AppMethodBeat.o(95870);
      }
      else
      {
        paramString = (Integer)bre.get(v.aR(str));
        if (paramString == null)
          break label350;
        i = paramString.intValue();
        AppMethodBeat.o(95870);
      }
    }
    label350: paramString = new IllegalArgumentException();
    AppMethodBeat.o(95870);
    throw paramString;
  }

  private static int rgb(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(95871);
    paramInt1 = argb(255, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(95871);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.d
 * JD-Core Version:    0.6.2
 */