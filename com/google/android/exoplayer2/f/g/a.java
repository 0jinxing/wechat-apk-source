package com.google.android.exoplayer2.f.g;

import android.text.TextUtils;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a
{
  private static final Pattern bor;
  private final l bos;
  private final StringBuilder bot;

  static
  {
    AppMethodBeat.i(95715);
    bor = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    AppMethodBeat.o(95715);
  }

  public a()
  {
    AppMethodBeat.i(95708);
    this.bos = new l();
    this.bot = new StringBuilder();
    AppMethodBeat.o(95708);
  }

  private static void D(l paraml)
  {
    AppMethodBeat.i(95710);
    int i = 1;
    while ((paraml.tB() > 0) && (i != 0))
      if ((E(paraml)) || (F(paraml)))
        i = 1;
      else
        i = 0;
    AppMethodBeat.o(95710);
  }

  private static boolean E(l paraml)
  {
    boolean bool = true;
    AppMethodBeat.i(95712);
    int i = paraml.position;
    switch ((char)paraml.data[i])
    {
    default:
      bool = false;
      AppMethodBeat.o(95712);
    case '\t':
    case '\n':
    case '\f':
    case '\r':
    case ' ':
    }
    while (true)
    {
      return bool;
      paraml.eM(1);
      AppMethodBeat.o(95712);
    }
  }

  private static boolean F(l paraml)
  {
    AppMethodBeat.i(95713);
    int i = paraml.position;
    int j = paraml.limit;
    byte[] arrayOfByte = paraml.data;
    int k;
    if (i + 2 <= j)
    {
      k = i + 1;
      if (arrayOfByte[i] == 47)
      {
        i = k + 1;
        if (arrayOfByte[k] != 42);
      }
    }
    while (true)
      if (i + 1 < j)
      {
        k = i + 1;
        if (((char)arrayOfByte[i] == '*') && ((char)arrayOfByte[k] == '/'))
        {
          i = k + 1;
          j = i;
        }
      }
      else
      {
        paraml.eM(j - paraml.position);
        boolean bool = true;
        AppMethodBeat.o(95713);
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(95713);
        }
        i = k;
      }
  }

  private static String a(l paraml, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(95711);
    D(paraml);
    if (paraml.tB() == 0)
    {
      paraml = null;
      AppMethodBeat.o(95711);
    }
    while (true)
    {
      return paraml;
      paramStringBuilder = b(paraml, paramStringBuilder);
      if (!"".equals(paramStringBuilder))
      {
        AppMethodBeat.o(95711);
        paraml = paramStringBuilder;
      }
      else
      {
        paraml = (char)paraml.readUnsignedByte();
        AppMethodBeat.o(95711);
      }
    }
  }

  private static String b(l paraml, StringBuilder paramStringBuilder)
  {
    int i = 0;
    AppMethodBeat.i(95714);
    paramStringBuilder.setLength(0);
    int j = paraml.position;
    int k = paraml.limit;
    while ((j < k) && (i == 0))
    {
      char c = (char)paraml.data[j];
      if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')) || ((c >= '0') && (c <= '9')) || (c == '#') || (c == '-') || (c == '.') || (c == '_'))
      {
        j++;
        paramStringBuilder.append(c);
      }
      else
      {
        i = 1;
      }
    }
    paraml.eM(j - paraml.position);
    paraml = paramStringBuilder.toString();
    AppMethodBeat.o(95714);
    return paraml;
  }

  public final d C(l paraml)
  {
    AppMethodBeat.i(95709);
    this.bot.setLength(0);
    int i = paraml.position;
    while (!TextUtils.isEmpty(paraml.readLine()));
    this.bos.n(paraml.data, paraml.position);
    this.bos.setPosition(i);
    Object localObject1 = this.bos;
    Object localObject2 = this.bot;
    D((l)localObject1);
    if (((l)localObject1).tB() < 5)
    {
      paraml = null;
      if ((paraml != null) && ("{".equals(a(this.bos, this.bot))))
        break label278;
      paraml = null;
      AppMethodBeat.o(95709);
    }
    while (true)
    {
      return paraml;
      if (!"::cue".equals(((l)localObject1).readString(5)))
      {
        paraml = null;
        break;
      }
      i = ((l)localObject1).position;
      String str1 = a((l)localObject1, (StringBuilder)localObject2);
      if (str1 == null)
      {
        paraml = null;
        break;
      }
      if ("{".equals(str1))
      {
        ((l)localObject1).setPosition(i);
        paraml = "";
        break;
      }
      paraml = null;
      int k;
      if ("(".equals(str1))
      {
        j = ((l)localObject1).position;
        k = ((l)localObject1).limit;
        i = 0;
        if ((j < k) && (i == 0))
        {
          if ((char)localObject1.data[j] == ')');
          for (i = 1; ; i = 0)
          {
            j++;
            break;
          }
        }
        paraml = ((l)localObject1).readString(j - 1 - ((l)localObject1).position).trim();
      }
      localObject2 = a((l)localObject1, (StringBuilder)localObject2);
      if ((")".equals(localObject2)) && (localObject2 != null))
        break;
      paraml = null;
      break;
      label278: localObject1 = new d();
      if (!"".equals(paraml))
      {
        i = paraml.indexOf('[');
        localObject2 = paraml;
        if (i != -1)
        {
          localObject2 = bor.matcher(paraml.substring(i));
          if (((Matcher)localObject2).matches())
            ((d)localObject1).boB = ((Matcher)localObject2).group(1);
          localObject2 = paraml.substring(0, i);
        }
        paraml = ((String)localObject2).split("\\.");
        localObject2 = paraml[0];
        i = ((String)localObject2).indexOf('#');
        if (i == -1)
          break label710;
        ((d)localObject1).boz = ((String)localObject2).substring(0, i);
        ((d)localObject1).boy = ((String)localObject2).substring(i + 1);
        if (paraml.length > 1)
          ((d)localObject1).boA = Arrays.asList((String[])Arrays.copyOfRange(paraml, 1, paraml.length));
      }
      localObject2 = null;
      int j = 0;
      while (true)
      {
        label427: if (j != 0)
          break label969;
        k = this.bos.position;
        str1 = a(this.bos, this.bot);
        label471: l locall;
        Object localObject3;
        String str2;
        if ((str1 == null) || ("}".equals(str1)))
        {
          i = 1;
          j = i;
          localObject2 = str1;
          if (i == 0)
          {
            this.bos.setPosition(k);
            locall = this.bos;
            localObject3 = this.bot;
            D(locall);
            str2 = b(locall, (StringBuilder)localObject3);
            j = i;
            localObject2 = str1;
            if (!"".equals(str2))
            {
              j = i;
              localObject2 = str1;
              if (":".equals(a(locall, (StringBuilder)localObject3)))
              {
                D(locall);
                paraml = new StringBuilder();
                j = 0;
                label572: if (j == 0)
                {
                  k = locall.position;
                  localObject2 = a(locall, (StringBuilder)localObject3);
                  if (localObject2 != null);
                }
              }
            }
          }
        }
        else
        {
          for (paraml = null; ; paraml = paraml.toString())
          {
            j = i;
            localObject2 = str1;
            if (paraml == null)
              break label427;
            j = i;
            localObject2 = str1;
            if ("".equals(paraml))
              break label427;
            k = locall.position;
            localObject3 = a(locall, (StringBuilder)localObject3);
            if (!";".equals(localObject3))
            {
              j = i;
              localObject2 = str1;
              if (!"}".equals(localObject3))
                break label427;
              locall.setPosition(k);
            }
            if (!"color".equals(str2))
              break label775;
            ((d)localObject1).bnT = com.google.android.exoplayer2.i.d.aG(paraml);
            ((d)localObject1).bnU = true;
            j = i;
            localObject2 = str1;
            break label427;
            label710: ((d)localObject1).boz = ((String)localObject2);
            break;
            i = 0;
            break label471;
            if (("}".equals(localObject2)) || (";".equals(localObject2)))
            {
              locall.setPosition(k);
              j = 1;
              break label572;
            }
            paraml.append((String)localObject2);
            break label572;
          }
          label775: if ("background-color".equals(str2))
          {
            ((d)localObject1).backgroundColor = com.google.android.exoplayer2.i.d.aG(paraml);
            ((d)localObject1).bnV = true;
            j = i;
            localObject2 = str1;
          }
          else if ("text-decoration".equals(str2))
          {
            j = i;
            localObject2 = str1;
            if ("underline".equals(paraml))
            {
              ((d)localObject1).bnX = 1;
              j = i;
              localObject2 = str1;
            }
          }
          else if ("font-family".equals(str2))
          {
            ((d)localObject1).bnS = v.aR(paraml);
            j = i;
            localObject2 = str1;
          }
          else if ("font-weight".equals(str2))
          {
            j = i;
            localObject2 = str1;
            if ("bold".equals(paraml))
            {
              ((d)localObject1).bnY = 1;
              j = i;
              localObject2 = str1;
            }
          }
          else
          {
            j = i;
            localObject2 = str1;
            if ("font-style".equals(str2))
            {
              j = i;
              localObject2 = str1;
              if ("italic".equals(paraml))
              {
                ((d)localObject1).bnZ = 1;
                j = i;
                localObject2 = str1;
              }
            }
          }
        }
      }
      label969: if ("}".equals(localObject2))
      {
        AppMethodBeat.o(95709);
        paraml = (l)localObject1;
      }
      else
      {
        paraml = null;
        AppMethodBeat.o(95709);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.a
 * JD-Core Version:    0.6.2
 */