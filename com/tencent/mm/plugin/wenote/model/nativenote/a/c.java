package com.tencent.mm.plugin.wenote.model.nativenote.a;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.Html.TagHandler;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.b;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.d;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.k;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.m;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.q;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.XMLReader;

public final class c
  implements Html.TagHandler
{
  private static final Pattern bnF;
  private static final Pattern uOM;
  private static HashMap<String, Integer> uON;
  private Stack<a> uOK;
  final HashMap<String, String> uOL;

  static
  {
    AppMethodBeat.i(26707);
    bnF = Pattern.compile("\\d+");
    uOM = Pattern.compile("#[a-f0-9]+");
    HashMap localHashMap = new HashMap();
    uON = localHashMap;
    localHashMap.put("aqua", Integer.valueOf(65535));
    uON.put("black", Integer.valueOf(0));
    uON.put("blue", Integer.valueOf(255));
    uON.put("fuchsia", Integer.valueOf(16711935));
    uON.put("green", Integer.valueOf(32768));
    uON.put("grey", Integer.valueOf(8421504));
    uON.put("lime", Integer.valueOf(65280));
    uON.put("maroon", Integer.valueOf(8388608));
    uON.put("navy", Integer.valueOf(128));
    uON.put("olive", Integer.valueOf(8421376));
    uON.put("purple", Integer.valueOf(8388736));
    uON.put("red", Integer.valueOf(16711680));
    uON.put("silver", Integer.valueOf(12632256));
    uON.put("teal", Integer.valueOf(32896));
    uON.put("white", Integer.valueOf(16777215));
    uON.put("yellow", Integer.valueOf(16776960));
    AppMethodBeat.o(26707);
  }

  public c()
  {
    AppMethodBeat.i(26699);
    this.uOK = new Stack();
    this.uOL = new HashMap();
    AppMethodBeat.o(26699);
  }

  private static Object a(Editable paramEditable, Class<? extends Object> paramClass)
  {
    AppMethodBeat.i(26704);
    paramEditable = paramEditable.getSpans(0, paramEditable.length(), paramClass);
    if (paramEditable.length == 0)
    {
      paramEditable = null;
      AppMethodBeat.o(26704);
    }
    while (true)
    {
      return paramEditable;
      paramEditable = paramEditable[(paramEditable.length - 1)];
      AppMethodBeat.o(26704);
    }
  }

  private static void a(Editable paramEditable, Object paramObject)
  {
    AppMethodBeat.i(26705);
    int i = paramEditable.length();
    paramEditable.setSpan(paramObject, i, i, 17);
    AppMethodBeat.o(26705);
  }

  private void a(boolean paramBoolean, q paramq)
  {
    AppMethodBeat.i(26702);
    if (paramBoolean)
      paramq = q.uSl;
    a locala;
    if (this.uOK.isEmpty())
    {
      locala = null;
      if (locala != null)
        break label71;
      paramq = new a(paramq, 1, 1);
      this.uOK.push(paramq);
      AppMethodBeat.o(26702);
    }
    while (true)
    {
      return;
      locala = (a)this.uOK.peek();
      break;
      label71: if (locala.uRP == paramq)
      {
        locala.uRQ += 1;
        locala.uRR += 1;
        AppMethodBeat.o(26702);
      }
      else
      {
        paramq = new a(paramq, locala.uRQ + 1, 1);
        this.uOK.push(paramq);
        AppMethodBeat.o(26702);
      }
    }
  }

  @SuppressLint({"DefaultLocale"})
  private static int ahc(String paramString)
  {
    AppMethodBeat.i(26706);
    Integer localInteger = (Integer)uON.get(paramString.toLowerCase());
    int i;
    if (localInteger != null)
    {
      i = localInteger.intValue();
      AppMethodBeat.o(26706);
      return i;
    }
    if (paramString == null);
    while (true)
    {
      int k;
      try
      {
        AppMethodBeat.o(26706);
        i = -1;
        break;
        paramString = paramString.toString();
        j = paramString.length();
        k = 10;
        if ('-' != paramString.charAt(0))
          break label214;
        i = 1;
        m = -1;
        if ('0' == paramString.charAt(i))
        {
          if (i == j - 1)
          {
            AppMethodBeat.o(26706);
            i = 0;
            break;
          }
          j = paramString.charAt(i + 1);
          if ((120 == j) || (88 == j))
          {
            j = i + 2;
            i = 16;
            i = Integer.parseInt(paramString.substring(j), i);
            i *= m;
            AppMethodBeat.o(26706);
            break;
          }
          j = i + 1;
          i = 8;
          continue;
        }
        j = paramString.charAt(i);
        if (35 != j)
          break label206;
        j = i + 1;
        i = 16;
        continue;
      }
      catch (NumberFormatException paramString)
      {
        AppMethodBeat.o(26706);
        i = -1;
      }
      break;
      label206: int j = i;
      i = k;
      continue;
      label214: i = 0;
      int m = 1;
    }
  }

  private static void d(Editable paramEditable)
  {
    AppMethodBeat.i(26701);
    int i = paramEditable.length();
    if ((i > 0) && (paramEditable.charAt(i - 1) == '\n'))
      AppMethodBeat.o(26701);
    while (true)
    {
      return;
      if (i != 0)
        paramEditable.append("\n");
      AppMethodBeat.o(26701);
    }
  }

  private void oi(boolean paramBoolean)
  {
    AppMethodBeat.i(26703);
    if (!this.uOK.isEmpty())
    {
      a locala = (a)this.uOK.peek();
      q localq = locala.uRP;
      if (((paramBoolean) && (localq.dfH())) || ((!paramBoolean) && (localq.dfG())) || ((!paramBoolean) && (localq.dfI())))
      {
        int i = locala.uRR;
        if (i > 1)
        {
          locala.uRR = (i - 1);
          locala.uRQ -= 1;
          AppMethodBeat.o(26703);
        }
      }
    }
    while (true)
    {
      return;
      this.uOK.pop();
      AppMethodBeat.o(26703);
      continue;
      this.uOK.pop();
      break;
      AppMethodBeat.o(26703);
    }
  }

  public final void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader)
  {
    boolean bool1 = true;
    int i = 1;
    boolean bool2 = true;
    boolean bool3 = false;
    AppMethodBeat.i(26700);
    this.uOL.clear();
    Object localObject;
    Field localField;
    int j;
    int k;
    try
    {
      localObject = paramXMLReader.getClass().getDeclaredField("theNewElement");
      ((Field)localObject).setAccessible(true);
      paramXMLReader = ((Field)localObject).get(paramXMLReader);
      localObject = paramXMLReader.getClass().getDeclaredField("theAtts");
      ((Field)localObject).setAccessible(true);
      paramXMLReader = ((Field)localObject).get(paramXMLReader);
      localObject = paramXMLReader.getClass().getDeclaredField("data");
      ((Field)localObject).setAccessible(true);
      localObject = (String[])((Field)localObject).get(paramXMLReader);
      localField = paramXMLReader.getClass().getDeclaredField("length");
      localField.setAccessible(true);
      j = ((Integer)localField.get(paramXMLReader)).intValue();
      for (k = 0; k < j; k++)
        this.uOL.put(localObject[(k * 5 + 1)], localObject[(k * 5 + 4)]);
    }
    catch (Exception paramXMLReader)
    {
    }
    if (paramBoolean)
      if (paramString.equalsIgnoreCase("wx-ul"))
        a(false, q.uSk);
    label386: label655: label1551: label1685: 
    while (true)
    {
      a.uOI = paramEditable;
      AppMethodBeat.o(26700);
      return;
      label1557: label1563: if (paramString.equalsIgnoreCase("wx-ol"))
        a(true, q.uSl);
      else
        label1438: label1567: if (paramString.equalsIgnoreCase("wn-todo"))
        {
          paramString = new a(q.uSm, 1, 1);
          this.uOK.push(paramString);
          paramString = (String)this.uOL.get("checked");
          paramBoolean = bool3;
          if (!bo.isNullOrNil(paramString))
          {
            paramBoolean = bool3;
            if (paramString.equals("1"))
              paramBoolean = true;
          }
          a(paramEditable, new c.e(((a)this.uOK.peek()).uRQ, paramBoolean));
        }
        else
        {
          if (paramString.equalsIgnoreCase("wx-li"))
          {
            paramString = (String)this.uOL.get("done");
            if ((!bo.isNullOrNil(paramString)) && (paramString.equals("true")))
            {
              paramBoolean = bool2;
              if (this.uOK.isEmpty())
                break label496;
              paramXMLReader = (a)this.uOK.peek();
              paramString = paramXMLReader.uRP;
              k = paramXMLReader.uRQ;
              if (!paramString.dfH())
                break label455;
              paramString = new c.d(k);
            }
          }
          label1086: 
          while (true)
          {
            if (paramString == null)
              break label1685;
            a(paramEditable, paramString);
            break;
            paramBoolean = false;
            break label386;
            label455: if (paramString.dfG())
            {
              paramString = new f(k);
            }
            else if (paramString.dfI())
            {
              paramString = new c.e(k, paramBoolean);
              continue;
              label496: paramString = new f(0);
              continue;
              int m;
              if ((paramString.equalsIgnoreCase("wx-font")) || (paramString.equalsIgnoreCase("span")))
              {
                k = -2147483648;
                paramString = (String)this.uOL.get("style");
                if (paramString == null)
                  break label1674;
                localObject = paramString.toLowerCase(Locale.ENGLISH).split(";");
                m = localObject.length;
                i = 0;
                paramXMLReader = null;
                paramString = null;
                if (i < m)
                {
                  localField = localObject[i];
                  Matcher localMatcher;
                  int n;
                  if (localField.startsWith("font-size"))
                  {
                    localMatcher = bnF.matcher(localField);
                    if (localMatcher.find(0))
                    {
                      n = localMatcher.start();
                      j = localMatcher.end();
                    }
                  }
                  while (true)
                  {
                    try
                    {
                      j = Integer.parseInt(localField.substring(n, j));
                      k = j;
                      i++;
                    }
                    catch (NumberFormatException localNumberFormatException)
                    {
                    }
                    continue;
                    if (localNumberFormatException.startsWith("color"))
                    {
                      localMatcher = uOM.matcher(localNumberFormatException);
                      if (localMatcher.find(0))
                        paramString = localNumberFormatException.substring(localMatcher.start(), localMatcher.end());
                    }
                    else
                    {
                      if (!localNumberFormatException.startsWith("background-color"))
                        break label1671;
                      localMatcher = uOM.matcher(localNumberFormatException);
                      if (!localMatcher.find(0))
                        break label1671;
                      paramXMLReader = localNumberFormatException.substring(localMatcher.start(), localMatcher.end());
                    }
                  }
                }
              }
              while (true)
              {
                localObject = (String)this.uOL.get("face");
                i = paramEditable.length();
                c.b localb = new c.b((byte)0);
                localb.mSize = k;
                localb.uOO = paramString;
                localb.uOP = paramXMLReader;
                paramEditable.setSpan(c.b.a(localb, (String)localObject), i, i, 17);
                break;
                if (paramString.equalsIgnoreCase("wx-b"))
                {
                  a(paramEditable, new c.a((byte)0));
                  break;
                }
                if (paramString.equalsIgnoreCase("wx-p"))
                {
                  d(paramEditable);
                  break;
                }
                if (!paramString.equalsIgnoreCase("wx-div"))
                  break;
                d(paramEditable);
                break;
                if (paramString.equalsIgnoreCase("wx-ul"))
                  oi(false);
                while (true)
                {
                  this.uOL.clear();
                  break;
                  if (paramString.equalsIgnoreCase("wx-ol"))
                  {
                    oi(true);
                  }
                  else if (paramString.equalsIgnoreCase("wn-todo"))
                  {
                    paramString = (c.c)a(paramEditable, c.c.class);
                    if (paramString != null)
                    {
                      if ((paramEditable.length() == 0) || (paramEditable.charAt(paramEditable.length() - 1) != '\n'))
                        paramEditable.append('\n');
                      j = paramEditable.getSpanStart(paramString);
                      i = paramEditable.length();
                      if (!paramString.uOS)
                      {
                        k = b.del();
                        bool3 = ((c.e)paramString).uOT;
                        if (j != i)
                          break label1086;
                      }
                      for (paramBoolean = true; ; paramBoolean = false)
                      {
                        paramEditable.setSpan(new k(bool3, k, paramBoolean, false, false), j, i, 33);
                        paramEditable.removeSpan(paramString);
                        break;
                      }
                    }
                  }
                  else if (paramString.equalsIgnoreCase("wx-li"))
                  {
                    paramXMLReader = (c.c)a(paramEditable, c.c.class);
                    if (paramXMLReader != null)
                    {
                      if ((paramEditable.length() == 0) || (paramEditable.charAt(paramEditable.length() - 1) != '\n'))
                        paramEditable.append('\n');
                      k = paramEditable.getSpanStart(paramXMLReader);
                      j = paramEditable.length();
                      if (!paramXMLReader.uOS)
                      {
                        i = b.del();
                        if (!(paramXMLReader instanceof c.d))
                          break label1245;
                        if (k != j)
                          break label1240;
                      }
                      label1240: for (paramBoolean = true; ; paramBoolean = false)
                      {
                        paramString = new m(1, i, paramBoolean, false, false);
                        paramEditable.setSpan(paramString, k, j, 33);
                        paramEditable.removeSpan(paramXMLReader);
                        break;
                      }
                      label1245: if (k == j);
                      for (paramBoolean = bool1; ; paramBoolean = false)
                      {
                        paramString = new d(i, paramBoolean, false, false);
                        break;
                      }
                    }
                  }
                  else if ((paramString.equalsIgnoreCase("wx-font")) || (paramString.equalsIgnoreCase("span")))
                  {
                    j = paramEditable.length();
                    paramString = a(paramEditable, c.b.class);
                    if (paramString != null)
                    {
                      m = paramEditable.getSpanStart(paramString);
                      paramEditable.removeSpan(paramString);
                      if (m != j)
                      {
                        paramString = (c.b)paramString;
                        if (!TextUtils.isEmpty(paramString.uOQ))
                        {
                          k = 1;
                          label1356: if (k != 0)
                            paramEditable.setSpan(new TypefaceSpan(paramString.uOQ), m, j, 33);
                          if (paramString.mSize <= 0)
                            break label1551;
                          k = 1;
                          label1394: if (k != 0)
                            paramEditable.setSpan(new AbsoluteSizeSpan(b.Kc(paramString.mSize)), m, j, 33);
                          if (TextUtils.isEmpty(paramString.uOO))
                            break label1557;
                          k = 1;
                          if (k != 0)
                          {
                            k = ahc(paramString.uOO);
                            if (k != -1)
                              paramEditable.setSpan(new ForegroundColorSpan(k | 0xFF000000), m, j, 33);
                          }
                          if (TextUtils.isEmpty(paramString.uOP))
                            break label1563;
                        }
                        for (k = i; ; k = 0)
                        {
                          if (k == 0)
                            break label1567;
                          k = ahc(paramString.uOP);
                          if (k == -1)
                            break;
                          paramEditable.setSpan(new BackgroundColorSpan(k | 0xFF000000), m, j, 33);
                          break;
                          k = 0;
                          break label1356;
                          k = 0;
                          break label1394;
                          k = 0;
                          break label1438;
                        }
                      }
                    }
                  }
                  else if (paramString.equalsIgnoreCase("wx-b"))
                  {
                    paramXMLReader = new BoldSpan();
                    k = paramEditable.length();
                    paramString = a(paramEditable, c.a.class);
                    i = paramEditable.getSpanStart(paramString);
                    paramEditable.removeSpan(paramString);
                    if (i != k)
                      paramEditable.setSpan(paramXMLReader, i, k, 33);
                  }
                  else if (paramString.equalsIgnoreCase("wx-p"))
                  {
                    d(paramEditable);
                  }
                  else
                  {
                    paramString.equalsIgnoreCase("wx-div");
                  }
                }
                break label655;
                paramXMLReader = null;
                paramString = null;
              }
            }
            else
            {
              paramString = null;
            }
          }
        }
    }
  }

  static final class f extends c.c
  {
    f(int paramInt)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.a.c
 * JD-Core Version:    0.6.2
 */