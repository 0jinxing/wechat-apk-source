package com.google.android.exoplayer2.f.e;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.f.f;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.i.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class a extends com.google.android.exoplayer2.f.b
{
  private static final Pattern bnD;
  private static final Pattern bnE;
  private static final Pattern bnF;
  private static final Pattern bnG;
  private static final a.a bnH;
  private final XmlPullParserFactory bnI;

  static
  {
    AppMethodBeat.i(95679);
    bnD = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    bnE = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    bnF = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    bnG = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    bnH = new a.a(30.0F, 1, 1);
    AppMethodBeat.o(95679);
  }

  public a()
  {
    super("TtmlDecoder");
    AppMethodBeat.i(95670);
    try
    {
      this.bnI = XmlPullParserFactory.newInstance();
      this.bnI.setNamespaceAware(true);
      AppMethodBeat.o(95670);
      return;
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      RuntimeException localRuntimeException = new RuntimeException("Couldn't create XmlPullParserFactory instance", localXmlPullParserException);
      AppMethodBeat.o(95670);
      throw localRuntimeException;
    }
  }

  private static long a(String paramString, a.a parama)
  {
    double d1 = 0.0D;
    AppMethodBeat.i(95677);
    Matcher localMatcher = bnD.matcher(paramString);
    double d5;
    double d6;
    long l;
    if (localMatcher.matches())
    {
      double d2 = Long.parseLong(localMatcher.group(1)) * 3600L;
      double d3 = Long.parseLong(localMatcher.group(2)) * 60L;
      double d4 = Long.parseLong(localMatcher.group(3));
      paramString = localMatcher.group(4);
      if (paramString != null)
      {
        d5 = Double.parseDouble(paramString);
        paramString = localMatcher.group(5);
        if (paramString == null)
          break label176;
      }
      label176: for (d6 = (float)Long.parseLong(paramString) / parama.bnJ; ; d6 = 0.0D)
      {
        paramString = localMatcher.group(6);
        if (paramString != null)
          d1 = Long.parseLong(paramString) / parama.bnK / parama.bnJ;
        l = ()((d6 + (d4 + (d2 + d3) + d5) + d1) * 1000000.0D);
        AppMethodBeat.o(95677);
        return l;
        d5 = 0.0D;
        break;
      }
    }
    localMatcher = bnE.matcher(paramString);
    if (localMatcher.matches())
    {
      d6 = Double.parseDouble(localMatcher.group(1));
      paramString = localMatcher.group(2);
      int i = -1;
      switch (paramString.hashCode())
      {
      default:
        label284: d5 = d6;
        switch (i)
        {
        default:
          d5 = d6;
        case 2:
        case 0:
        case 1:
        case 3:
        case 4:
        case 5:
        }
        break;
      case 104:
      case 109:
      case 115:
      case 3494:
      case 102:
      case 116:
      }
      while (true)
      {
        l = ()(d5 * 1000000.0D);
        AppMethodBeat.o(95677);
        break;
        if (!paramString.equals("h"))
          break label284;
        i = 0;
        break label284;
        if (!paramString.equals("m"))
          break label284;
        i = 1;
        break label284;
        if (!paramString.equals("s"))
          break label284;
        i = 2;
        break label284;
        if (!paramString.equals("ms"))
          break label284;
        i = 3;
        break label284;
        if (!paramString.equals("f"))
          break label284;
        i = 4;
        break label284;
        if (!paramString.equals("t"))
          break label284;
        i = 5;
        break label284;
        d5 = d6 * 3600.0D;
        continue;
        d5 = d6 * 60.0D;
        continue;
        d5 = d6 / 1000.0D;
        continue;
        d5 = d6 / parama.bnJ;
        continue;
        d5 = d6 / parama.tickRate;
      }
    }
    paramString = new f("Malformed time expression: ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(95677);
    throw paramString;
  }

  private static b a(XmlPullParser paramXmlPullParser, b paramb, Map<String, c> paramMap, a.a parama)
  {
    AppMethodBeat.i(95676);
    long l1 = -9223372036854775807L;
    long l2 = -9223372036854775807L;
    long l3 = -9223372036854775807L;
    Object localObject1 = "";
    Object localObject2 = null;
    int i = paramXmlPullParser.getAttributeCount();
    d locald = a(paramXmlPullParser, null);
    int j = 0;
    label132: long l6;
    if (j < i)
    {
      Object localObject3 = paramXmlPullParser.getAttributeName(j);
      Object localObject4 = paramXmlPullParser.getAttributeValue(j);
      int k = -1;
      Object localObject5;
      long l4;
      switch (((String)localObject3).hashCode())
      {
      default:
        switch (k)
        {
        default:
          localObject5 = localObject1;
          localObject3 = localObject2;
          l4 = l1;
          l5 = l2;
          l6 = l3;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        }
        break;
      case 93616297:
      case 100571:
      case 99841:
      case 109780401:
      case -934795532:
      }
      while (true)
      {
        j++;
        l3 = l6;
        l2 = l5;
        l1 = l4;
        localObject2 = localObject3;
        localObject1 = localObject5;
        break;
        if (!((String)localObject3).equals("begin"))
          break label132;
        k = 0;
        break label132;
        if (!((String)localObject3).equals("end"))
          break label132;
        k = 1;
        break label132;
        if (!((String)localObject3).equals("dur"))
          break label132;
        k = 2;
        break label132;
        if (!((String)localObject3).equals("style"))
          break label132;
        k = 3;
        break label132;
        if (!((String)localObject3).equals("region"))
          break label132;
        k = 4;
        break label132;
        l5 = a((String)localObject4, parama);
        l6 = l3;
        l4 = l1;
        localObject3 = localObject2;
        localObject5 = localObject1;
        continue;
        l6 = a((String)localObject4, parama);
        l5 = l2;
        l4 = l1;
        localObject3 = localObject2;
        localObject5 = localObject1;
        continue;
        l4 = a((String)localObject4, parama);
        l6 = l3;
        l5 = l2;
        localObject3 = localObject2;
        localObject5 = localObject1;
        continue;
        localObject4 = ((String)localObject4).split("\\s+");
        l6 = l3;
        l5 = l2;
        l4 = l1;
        localObject3 = localObject2;
        localObject5 = localObject1;
        if (localObject4.length > 0)
        {
          localObject3 = localObject4;
          l6 = l3;
          l5 = l2;
          l4 = l1;
          localObject5 = localObject1;
          continue;
          l6 = l3;
          l5 = l2;
          l4 = l1;
          localObject3 = localObject2;
          localObject5 = localObject1;
          if (paramMap.containsKey(localObject4))
          {
            localObject5 = localObject4;
            l6 = l3;
            l5 = l2;
            l4 = l1;
            localObject3 = localObject2;
          }
        }
      }
    }
    long l5 = l2;
    if (paramb != null)
    {
      l5 = l2;
      if (paramb.bif != -9223372036854775807L)
      {
        l6 = l2;
        if (l2 != -9223372036854775807L)
          l6 = l2 + paramb.bif;
        l5 = l6;
        if (l3 != -9223372036854775807L)
          l2 = l3 + paramb.bif;
      }
    }
    while (true)
    {
      if (l2 == -9223372036854775807L)
        if (l1 != -9223372036854775807L)
          l2 = l1 + l6;
      while (true)
      {
        paramXmlPullParser = new b(paramXmlPullParser.getName(), null, l6, l2, locald, localObject2, (String)localObject1);
        AppMethodBeat.o(95676);
        return paramXmlPullParser;
        if ((paramb != null) && (paramb.big != -9223372036854775807L))
          l2 = paramb.big;
      }
      l2 = l3;
      l6 = l5;
    }
  }

  private static d a(d paramd)
  {
    AppMethodBeat.i(95675);
    if (paramd == null)
    {
      paramd = new d();
      AppMethodBeat.o(95675);
    }
    while (true)
    {
      return paramd;
      AppMethodBeat.o(95675);
    }
  }

  private static d a(XmlPullParser paramXmlPullParser, d paramd)
  {
    AppMethodBeat.i(95674);
    int i = paramXmlPullParser.getAttributeCount();
    int j = 0;
    d locald1 = paramd;
    if (j < i)
    {
      Object localObject1 = paramXmlPullParser.getAttributeValue(j);
      paramd = paramXmlPullParser.getAttributeName(j);
      int k = -1;
      switch (paramd.hashCode())
      {
      default:
        switch (k)
        {
        default:
          label128: paramd = locald1;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        }
        break;
      case 3355:
      case 1287124693:
      case 94842723:
      case -1224696685:
      case 365601008:
      case -734428249:
      case -1550943582:
      case -1065511464:
      case -879295043:
      }
      while (true)
      {
        j++;
        locald1 = paramd;
        break;
        if (!paramd.equals("id"))
          break label128;
        k = 0;
        break label128;
        if (!paramd.equals("backgroundColor"))
          break label128;
        k = 1;
        break label128;
        if (!paramd.equals("color"))
          break label128;
        k = 2;
        break label128;
        if (!paramd.equals("fontFamily"))
          break label128;
        k = 3;
        break label128;
        if (!paramd.equals("fontSize"))
          break label128;
        k = 4;
        break label128;
        if (!paramd.equals("fontWeight"))
          break label128;
        k = 5;
        break label128;
        if (!paramd.equals("fontStyle"))
          break label128;
        k = 6;
        break label128;
        if (!paramd.equals("textAlign"))
          break label128;
        k = 7;
        break label128;
        if (!paramd.equals("textDecoration"))
          break label128;
        k = 8;
        break label128;
        paramd = locald1;
        if ("style".equals(paramXmlPullParser.getName()))
        {
          paramd = a(locald1);
          paramd.id = ((String)localObject1);
          continue;
          paramd = a(locald1);
          try
          {
            paramd.eF(com.google.android.exoplayer2.i.d.aF((String)localObject1));
          }
          catch (IllegalArgumentException localIllegalArgumentException1)
          {
          }
          continue;
          paramd = a(localIllegalArgumentException1);
          try
          {
            paramd.eE(com.google.android.exoplayer2.i.d.aF((String)localObject1));
          }
          catch (IllegalArgumentException localIllegalArgumentException2)
          {
          }
          continue;
          paramd = a(localIllegalArgumentException2);
          if (paramd.bob == null);
          for (boolean bool1 = true; ; bool1 = false)
          {
            com.google.android.exoplayer2.i.a.checkState(bool1);
            paramd.bnS = ((String)localObject1);
            break;
          }
          paramd = localIllegalArgumentException2;
          while (true)
          {
            try
            {
              d locald2 = a(localIllegalArgumentException2);
              paramd = locald2;
              localObject2 = ((String)localObject1).split("\\s+");
              paramd = locald2;
              if (localObject2.length != 1)
                break label658;
              paramd = locald2;
              localObject2 = bnF.matcher((CharSequence)localObject1);
              paramd = locald2;
              if (!((Matcher)localObject2).matches())
                break label871;
              paramd = locald2;
              localObject1 = ((Matcher)localObject2).group(3);
              k = -1;
              paramd = locald2;
              switch (((String)localObject1).hashCode())
              {
              default:
                switch (k)
                {
                default:
                  paramd = locald2;
                  localObject3 = new com/google/android/exoplayer2/f/f;
                  paramd = locald2;
                  localObject2 = new java/lang/StringBuilder;
                  paramd = locald2;
                  ((StringBuilder)localObject2).<init>("Invalid unit for fontSize: '");
                  paramd = locald2;
                  ((f)localObject3).<init>((String)localObject1 + "'.");
                  paramd = locald2;
                  AppMethodBeat.o(95674);
                  paramd = locald2;
                  throw ((Throwable)localObject3);
                case 0:
                case 1:
                case 2:
                }
                break;
              case 3592:
              case 3240:
              case 37:
              }
            }
            catch (f localf)
            {
            }
            break;
            label658: paramd = localf;
            if (localObject2.length == 2)
            {
              paramd = localf;
              localObject2 = bnF.matcher(localObject2[1]);
            }
            else
            {
              paramd = localf;
              localObject1 = new com/google/android/exoplayer2/f/f;
              paramd = localf;
              localObject3 = new java/lang/StringBuilder;
              paramd = localf;
              ((StringBuilder)localObject3).<init>("Invalid number of entries for fontSize: ");
              paramd = localf;
              ((f)localObject1).<init>(localObject2.length + ".");
              paramd = localf;
              AppMethodBeat.o(95674);
              paramd = localf;
              throw ((Throwable)localObject1);
              paramd = localf;
              if (((String)localObject1).equals("px"))
              {
                k = 0;
                continue;
                paramd = localf;
                if (((String)localObject1).equals("em"))
                {
                  k = 1;
                  continue;
                  paramd = localf;
                  if (((String)localObject1).equals("%"))
                    k = 2;
                }
              }
            }
          }
          paramd = localf;
          localf.boa = 1;
          while (true)
          {
            paramd = localf;
            localf.fontSize = Float.valueOf(((Matcher)localObject2).group(1)).floatValue();
            paramd = localf;
            break;
            paramd = localf;
            localf.boa = 2;
            continue;
            paramd = localf;
            localf.boa = 3;
          }
          label871: paramd = localf;
          Object localObject3 = new com/google/android/exoplayer2/f/f;
          paramd = localf;
          Object localObject2 = new java/lang/StringBuilder;
          paramd = localf;
          ((StringBuilder)localObject2).<init>("Invalid expression for fontSize: '");
          paramd = localf;
          ((f)localObject3).<init>((String)localObject1 + "'.");
          paramd = localf;
          AppMethodBeat.o(95674);
          paramd = localf;
          throw ((Throwable)localObject3);
          paramd = a(localf);
          boolean bool2 = "bold".equalsIgnoreCase((String)localObject1);
          if (paramd.bob == null)
          {
            bool1 = true;
            label962: com.google.android.exoplayer2.i.a.checkState(bool1);
            if (!bool2)
              break label990;
          }
          label990: for (k = 1; ; k = 0)
          {
            paramd.bnY = k;
            break;
            bool1 = false;
            break label962;
          }
          paramd = a(localf);
          bool2 = "italic".equalsIgnoreCase((String)localObject1);
          if (paramd.bob == null)
          {
            bool1 = true;
            label1022: com.google.android.exoplayer2.i.a.checkState(bool1);
            if (!bool2)
              break label1050;
          }
          label1050: for (k = 1; ; k = 0)
          {
            paramd.bnZ = k;
            break;
            bool1 = false;
            break label1022;
          }
          paramd = v.aR((String)localObject1);
          k = -1;
          switch (paramd.hashCode())
          {
          default:
          case 3317767:
          case 109757538:
          case 108511772:
          case 100571:
          case -1364013995:
          }
          while (true)
            switch (k)
            {
            default:
              paramd = localf;
              break;
            case 0:
              paramd = a(localf);
              paramd.boc = Layout.Alignment.ALIGN_NORMAL;
              break;
              if (paramd.equals("left"))
              {
                k = 0;
                continue;
                if (paramd.equals("start"))
                {
                  k = 1;
                  continue;
                  if (paramd.equals("right"))
                  {
                    k = 2;
                    continue;
                    if (paramd.equals("end"))
                    {
                      k = 3;
                      continue;
                      if (paramd.equals("center"))
                        k = 4;
                    }
                  }
                }
              }
              break;
            case 1:
            case 2:
            case 3:
            case 4:
            }
          paramd = a(localf);
          paramd.boc = Layout.Alignment.ALIGN_NORMAL;
          continue;
          paramd = a(localf);
          paramd.boc = Layout.Alignment.ALIGN_OPPOSITE;
          continue;
          paramd = a(localf);
          paramd.boc = Layout.Alignment.ALIGN_OPPOSITE;
          continue;
          paramd = a(localf);
          paramd.boc = Layout.Alignment.ALIGN_CENTER;
          continue;
          paramd = v.aR((String)localObject1);
          k = -1;
          switch (paramd.hashCode())
          {
          default:
          case 1679736913:
          case 913457136:
          case -1026963764:
          case -1461280213:
          }
          while (true)
            switch (k)
            {
            default:
              paramd = localf;
              break;
            case 0:
              paramd = a(localf).aK(true);
              break;
              if (paramd.equals("linethrough"))
              {
                k = 0;
                continue;
                if (paramd.equals("nolinethrough"))
                {
                  k = 1;
                  continue;
                  if (paramd.equals("underline"))
                  {
                    k = 2;
                    continue;
                    if (paramd.equals("nounderline"))
                      k = 3;
                  }
                }
              }
              break;
            case 1:
            case 2:
            case 3:
            }
          paramd = a(localf).aK(false);
          continue;
          paramd = a(localf).aL(true);
          continue;
          paramd = a(localf).aL(false);
        }
      }
    }
    AppMethodBeat.o(95674);
    return localf;
  }

  private static Map<String, d> a(XmlPullParser paramXmlPullParser, Map<String, d> paramMap, Map<String, c> paramMap1)
  {
    AppMethodBeat.i(95672);
    label200: label206: label210: 
    while (true)
    {
      paramXmlPullParser.next();
      Object localObject2;
      if (w.b(paramXmlPullParser, "style"))
      {
        Object localObject1 = w.c(paramXmlPullParser, "style");
        localObject2 = a(paramXmlPullParser, new d());
        if (localObject1 != null)
        {
          localObject1 = ((String)localObject1).split("\\s+");
          int i = localObject1.length;
          for (j = 0; j < i; j++)
            ((d)localObject2).b((d)paramMap.get(localObject1[j]));
        }
        if (((d)localObject2).id != null)
          paramMap.put(((d)localObject2).id, localObject2);
        if (paramXmlPullParser.getEventType() != 3)
          break label200;
        j = 1;
        label127: if ((j == 0) || (!paramXmlPullParser.getName().equals("head")))
          break label206;
      }
      for (int j = 1; ; j = 0)
      {
        if (j == 0)
          break label210;
        AppMethodBeat.o(95672);
        return paramMap;
        if (!w.b(paramXmlPullParser, "region"))
          break;
        localObject2 = b(paramXmlPullParser);
        if (localObject2 == null)
          break;
        paramMap1.put(((c)localObject2).id, localObject2);
        break;
        j = 0;
        break label127;
      }
    }
  }

  // ERROR //
  private static c b(XmlPullParser paramXmlPullParser)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc_w 429
    //   7: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: ldc 243
    //   13: invokestatic 404	com/google/android/exoplayer2/i/w:c	(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnonnull +13 -> 31
    //   21: ldc_w 429
    //   24: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: aload_2
    //   28: astore_0
    //   29: aload_0
    //   30: areturn
    //   31: aload_0
    //   32: ldc_w 431
    //   35: invokestatic 404	com/google/android/exoplayer2/i/w:c	(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    //   38: astore 4
    //   40: aload 4
    //   42: ifnull +247 -> 289
    //   45: getstatic 46	com/google/android/exoplayer2/f/e/a:bnG	Ljava/util/regex/Pattern;
    //   48: aload 4
    //   50: invokevirtual 91	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   53: astore 4
    //   55: aload 4
    //   57: invokevirtual 97	java/util/regex/Matcher:matches	()Z
    //   60: ifeq +218 -> 278
    //   63: aload 4
    //   65: iconst_1
    //   66: invokevirtual 101	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   69: invokestatic 435	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   72: ldc_w 436
    //   75: fdiv
    //   76: fstore 5
    //   78: aload 4
    //   80: iconst_2
    //   81: invokevirtual 101	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   84: invokestatic 435	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   87: fstore 6
    //   89: fload 6
    //   91: ldc_w 436
    //   94: fdiv
    //   95: fstore 6
    //   97: aload_0
    //   98: ldc_w 438
    //   101: invokestatic 404	com/google/android/exoplayer2/i/w:c	(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    //   104: astore 4
    //   106: aload 4
    //   108: ifnull +215 -> 323
    //   111: getstatic 46	com/google/android/exoplayer2/f/e/a:bnG	Ljava/util/regex/Pattern;
    //   114: aload 4
    //   116: invokevirtual 91	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   119: astore 4
    //   121: aload 4
    //   123: invokevirtual 97	java/util/regex/Matcher:matches	()Z
    //   126: ifeq +186 -> 312
    //   129: aload 4
    //   131: iconst_1
    //   132: invokevirtual 101	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   135: invokestatic 435	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   138: ldc_w 436
    //   141: fdiv
    //   142: fstore 7
    //   144: aload 4
    //   146: iconst_2
    //   147: invokevirtual 101	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   150: invokestatic 435	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   153: fstore 8
    //   155: fload 8
    //   157: ldc_w 436
    //   160: fdiv
    //   161: fstore 8
    //   163: aload_0
    //   164: ldc_w 440
    //   167: invokestatic 404	com/google/android/exoplayer2/i/w:c	(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    //   170: astore_0
    //   171: aload_0
    //   172: ifnull +64 -> 236
    //   175: aload_0
    //   176: invokestatic 351	com/google/android/exoplayer2/i/v:aR	(Ljava/lang/String;)Ljava/lang/String;
    //   179: astore_0
    //   180: iconst_m1
    //   181: istore 9
    //   183: aload_0
    //   184: invokevirtual 133	java/lang/String:hashCode	()I
    //   187: lookupswitch	default:+25->212, -1364013995:+147->334, 92734940:+163->350
    //   213: lconst_0
    //   214: tableswitch	default:+22 -> 236, 0:+152->366, 1:+167->381
    //   237: istore 9
    //   239: new 424	com/google/android/exoplayer2/f/e/c
    //   242: dup
    //   243: aload_3
    //   244: fload 5
    //   246: fload 6
    //   248: iconst_0
    //   249: iload 9
    //   251: fload 7
    //   253: invokespecial 443	com/google/android/exoplayer2/f/e/c:<init>	(Ljava/lang/String;FFIIF)V
    //   256: astore_0
    //   257: ldc_w 429
    //   260: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: goto -234 -> 29
    //   266: astore_0
    //   267: ldc_w 429
    //   270: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   273: aload_2
    //   274: astore_0
    //   275: goto -246 -> 29
    //   278: ldc_w 429
    //   281: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   284: aload_2
    //   285: astore_0
    //   286: goto -257 -> 29
    //   289: ldc_w 429
    //   292: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   295: aload_2
    //   296: astore_0
    //   297: goto -268 -> 29
    //   300: astore_0
    //   301: ldc_w 429
    //   304: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   307: aload_2
    //   308: astore_0
    //   309: goto -280 -> 29
    //   312: ldc_w 429
    //   315: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: aload_2
    //   319: astore_0
    //   320: goto -291 -> 29
    //   323: ldc_w 429
    //   326: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   329: aload_2
    //   330: astore_0
    //   331: goto -302 -> 29
    //   334: aload_0
    //   335: ldc_w 368
    //   338: invokevirtual 139	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   341: ifeq -129 -> 212
    //   344: iconst_0
    //   345: istore 9
    //   347: goto -135 -> 212
    //   350: aload_0
    //   351: ldc_w 445
    //   354: invokevirtual 139	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   357: ifeq -145 -> 212
    //   360: iconst_1
    //   361: istore 9
    //   363: goto -151 -> 212
    //   366: fload 6
    //   368: fload 8
    //   370: fconst_2
    //   371: fdiv
    //   372: fadd
    //   373: fstore 6
    //   375: iload_1
    //   376: istore 9
    //   378: goto -139 -> 239
    //   381: iconst_2
    //   382: istore 9
    //   384: fload 6
    //   386: fload 8
    //   388: fadd
    //   389: fstore 6
    //   391: goto -152 -> 239
    //
    // Exception table:
    //   from	to	target	type
    //   63	89	266	java/lang/NumberFormatException
    //   129	155	300	java/lang/NumberFormatException
  }

  private e i(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(95671);
    label820: label823: label826: label829: label832: label838: label845: 
    while (true)
    {
      try
      {
        localXmlPullParser = this.bnI.newPullParser();
        localHashMap1 = new java/util/HashMap;
        localHashMap1.<init>();
        localHashMap2 = new java/util/HashMap;
        localHashMap2.<init>();
        localObject1 = new com/google/android/exoplayer2/f/e/c;
        ((c)localObject1).<init>();
        localHashMap2.put("", localObject1);
        localObject1 = new java/io/ByteArrayInputStream;
        ((ByteArrayInputStream)localObject1).<init>(paramArrayOfByte, 0, paramInt);
        localXmlPullParser.setInput((InputStream)localObject1, null);
        localObject1 = null;
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>();
        i = localXmlPullParser.getEventType();
        paramArrayOfByte = bnH;
        paramInt = 0;
        if (i != 1)
        {
          localObject2 = (b)localLinkedList.peekLast();
          if (paramInt == 0)
          {
            localObject3 = localXmlPullParser.getName();
            if (i == 2)
            {
              if (!"tt".equals(localObject3))
                break label845;
              paramArrayOfByte = localXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
              if (paramArrayOfByte == null)
                break label838;
              i = Integer.parseInt(paramArrayOfByte);
              paramArrayOfByte = localXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
              if (paramArrayOfByte == null)
                break label832;
              paramArrayOfByte = paramArrayOfByte.split(" ");
              if (paramArrayOfByte.length != 2)
              {
                paramArrayOfByte = new com/google/android/exoplayer2/f/f;
                paramArrayOfByte.<init>("frameRateMultiplier doesn't have 2 parts");
                AppMethodBeat.o(95671);
                throw paramArrayOfByte;
              }
            }
          }
        }
      }
      catch (XmlPullParserException paramArrayOfByte)
      {
        XmlPullParser localXmlPullParser;
        HashMap localHashMap1;
        HashMap localHashMap2;
        LinkedList localLinkedList;
        Object localObject2;
        Object localObject3;
        paramArrayOfByte = new f("Unable to decode source", paramArrayOfByte);
        AppMethodBeat.o(95671);
        throw paramArrayOfByte;
        f = Integer.parseInt(paramArrayOfByte[0]) / Integer.parseInt(paramArrayOfByte[1]);
        int j = bnH.bnK;
        paramArrayOfByte = localXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (paramArrayOfByte == null)
          break label829;
        j = Integer.parseInt(paramArrayOfByte);
        int k = bnH.tickRate;
        paramArrayOfByte = localXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (paramArrayOfByte == null)
          break label826;
        k = Integer.parseInt(paramArrayOfByte);
        paramArrayOfByte = new com/google/android/exoplayer2/f/e/a$a;
        paramArrayOfByte.<init>(f * i, j, k);
        if ((((String)localObject3).equals("tt")) || (((String)localObject3).equals("head")) || (((String)localObject3).equals("body")) || (((String)localObject3).equals("div")) || (((String)localObject3).equals("p")) || (((String)localObject3).equals("span")) || (((String)localObject3).equals("br")) || (((String)localObject3).equals("style")) || (((String)localObject3).equals("styling")) || (((String)localObject3).equals("layout")) || (((String)localObject3).equals("region")) || (((String)localObject3).equals("metadata")) || (((String)localObject3).equals("smpte:image")) || (((String)localObject3).equals("smpte:data")) || (((String)localObject3).equals("smpte:information")))
        {
          i = 1;
          if (i != 0)
            continue;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Ignoring unsupported tag: ");
          ((StringBuilder)localObject2).append(localXmlPullParser.getName());
          paramInt++;
          localXmlPullParser.next();
          i = localXmlPullParser.getEventType();
          continue;
        }
        i = 0;
        continue;
        if ("head".equals(localObject3))
        {
          a(localXmlPullParser, localHashMap1, localHashMap2);
          continue;
        }
        try
        {
          localObject3 = a(localXmlPullParser, (b)localObject2, localHashMap2, paramArrayOfByte);
          localLinkedList.addLast(localObject3);
          if (localObject2 != null)
            ((b)localObject2).a((b)localObject3);
        }
        catch (f localf)
        {
          paramInt++;
        }
        continue;
        if (i == 4)
        {
          localObject3 = localXmlPullParser.getText();
          b localb = new com/google/android/exoplayer2/f/e/b;
          localb.<init>(null, ((String)localObject3).replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "");
          localf.a(localb);
          continue;
        }
        if (i != 3)
          break label823;
        if (!localXmlPullParser.getName().equals("tt"))
          break label820;
        Object localObject1 = new com/google/android/exoplayer2/f/e/e;
        ((e)localObject1).<init>((b)localLinkedList.getLast(), localHashMap1, localHashMap2);
        localLinkedList.removeLast();
        continue;
        if (i == 2)
        {
          paramInt++;
          continue;
        }
        if (i == 3)
        {
          paramInt--;
          continue;
          AppMethodBeat.o(95671);
          return localObject1;
        }
      }
      catch (IOException paramArrayOfByte)
      {
        paramArrayOfByte = new IllegalStateException("Unexpected error when reading input.", paramArrayOfByte);
        AppMethodBeat.o(95671);
        throw paramArrayOfByte;
      }
      continue;
      continue;
      continue;
      continue;
      continue;
      float f = 1.0F;
      continue;
      int i = 30;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.e.a
 * JD-Core Version:    0.6.2
 */