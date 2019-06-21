package com.google.android.exoplayer2.f.g;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class f
{
  public static final Pattern boE;
  private static final Pattern boF;
  private final StringBuilder bnC;

  static
  {
    AppMethodBeat.i(95739);
    boE = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    boF = Pattern.compile("(\\S+?):(\\S+)");
    AppMethodBeat.o(95739);
  }

  public f()
  {
    AppMethodBeat.i(95731);
    this.bnC = new StringBuilder();
    AppMethodBeat.o(95731);
  }

  static void a(String paramString, e.a parama)
  {
    AppMethodBeat.i(95733);
    Matcher localMatcher = boF.matcher(paramString);
    while (localMatcher.find())
    {
      String str = localMatcher.group(1);
      paramString = localMatcher.group(2);
      while (true)
      {
        try
        {
          if (!"line".equals(str))
            break label169;
          i = paramString.indexOf(',');
          if (i == -1)
            break label124;
          parama.bkX = aC(paramString.substring(i + 1));
          paramString = paramString.substring(0, i);
          if (!paramString.endsWith("%"))
            break label133;
          parama.bkW = h.aE(paramString);
          parama.lineType = 0;
        }
        catch (NumberFormatException paramString)
        {
          new StringBuilder("Skipping bad cue setting: ").append(localMatcher.group());
        }
        break;
        label124: parama.bkX = -2147483648;
      }
      label133: int j = Integer.parseInt(paramString);
      int i = j;
      if (j < 0)
        i = j - 1;
      parama.bkW = i;
      parama.lineType = 1;
      continue;
      label169: if ("align".equals(str))
      {
        switch (paramString.hashCode())
        {
        default:
          label240: i = -1;
          switch (i)
          {
          default:
            label243: paramString = null;
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          }
          break;
        case 109757538:
        case 3317767:
        case -1364013995:
        case -1074341483:
        case 100571:
        case 108511772:
        }
        while (true)
        {
          parama.bkV = paramString;
          break;
          if (!paramString.equals("start"))
            break label240;
          i = 0;
          break label243;
          if (!paramString.equals("left"))
            break label240;
          i = 1;
          break label243;
          if (!paramString.equals("center"))
            break label240;
          i = 2;
          break label243;
          if (!paramString.equals("middle"))
            break label240;
          i = 3;
          break label243;
          if (!paramString.equals("end"))
            break label240;
          i = 4;
          break label243;
          if (!paramString.equals("right"))
            break label240;
          i = 5;
          break label243;
          paramString = Layout.Alignment.ALIGN_NORMAL;
          continue;
          paramString = Layout.Alignment.ALIGN_CENTER;
          continue;
          paramString = Layout.Alignment.ALIGN_OPPOSITE;
        }
      }
      if ("position".equals(str))
      {
        i = paramString.indexOf(',');
        if (i != -1)
        {
          parama.bkZ = aC(paramString.substring(i + 1));
          paramString = paramString.substring(0, i);
        }
        while (true)
        {
          parama.bkY = h.aE(paramString);
          break;
          parama.bkZ = -2147483648;
        }
      }
      if ("size".equals(str))
      {
        parama.width = h.aE(paramString);
      }
      else
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Unknown cue setting ");
        localStringBuilder.append(str).append(":").append(paramString);
      }
    }
    AppMethodBeat.o(95733);
  }

  private static void a(String paramString, f.a parama, SpannableStringBuilder paramSpannableStringBuilder, List<d> paramList, List<f.b> paramList1)
  {
    AppMethodBeat.i(95737);
    int i = parama.position;
    int j = paramSpannableStringBuilder.length();
    String str = parama.name;
    int k = -1;
    switch (str.hashCode())
    {
    default:
      switch (k)
      {
      default:
        AppMethodBeat.o(95737);
      case 0:
      case 3:
      case 4:
      case 5:
      case 6:
      case 1:
      case 2:
      }
      break;
    case 98:
    case 105:
    case 117:
    case 99:
    case 3314158:
    case 118:
    case 0:
    }
    while (true)
    {
      return;
      if (!str.equals("b"))
        break;
      k = 0;
      break;
      if (!str.equals("i"))
        break;
      k = 1;
      break;
      if (!str.equals("u"))
        break;
      k = 2;
      break;
      if (!str.equals("c"))
        break;
      k = 3;
      break;
      if (!str.equals("lang"))
        break;
      k = 4;
      break;
      if (!str.equals("v"))
        break;
      k = 5;
      break;
      if (!str.equals(""))
        break;
      k = 6;
      break;
      paramSpannableStringBuilder.setSpan(new StyleSpan(1), i, j, 33);
      paramList1.clear();
      a(paramList, paramString, parama, paramList1);
      int m = paramList1.size();
      k = 0;
      if (k < m)
      {
        paramString = ((f.b)paramList1.get(k)).boJ;
        if (paramString != null)
        {
          if (paramString.getStyle() != -1)
            paramSpannableStringBuilder.setSpan(new StyleSpan(paramString.getStyle()), i, j, 33);
          if (paramString.bnW == 1)
          {
            n = 1;
            label371: if (n != 0)
              paramSpannableStringBuilder.setSpan(new StrikethroughSpan(), i, j, 33);
            if (paramString.bnX != 1)
              break label505;
          }
          label505: for (int n = 1; ; n = 0)
          {
            if (n != 0)
              paramSpannableStringBuilder.setSpan(new UnderlineSpan(), i, j, 33);
            if (!paramString.bnU)
              break label532;
            if (paramString.bnU)
              break label511;
            paramString = new IllegalStateException("Font color not defined");
            AppMethodBeat.o(95737);
            throw paramString;
            paramSpannableStringBuilder.setSpan(new StyleSpan(2), i, j, 33);
            break;
            paramSpannableStringBuilder.setSpan(new UnderlineSpan(), i, j, 33);
            break;
            n = 0;
            break label371;
          }
          label511: paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramString.bnT), i, j, 33);
          label532: if (paramString.bnV)
          {
            if (!paramString.bnV)
            {
              paramString = new IllegalStateException("Background color not defined.");
              AppMethodBeat.o(95737);
              throw paramString;
            }
            paramSpannableStringBuilder.setSpan(new BackgroundColorSpan(paramString.backgroundColor), i, j, 33);
          }
          if (paramString.bnS != null)
            paramSpannableStringBuilder.setSpan(new TypefaceSpan(paramString.bnS), i, j, 33);
          if (paramString.boc != null)
            paramSpannableStringBuilder.setSpan(new AlignmentSpan.Standard(paramString.boc), i, j, 33);
          switch (paramString.boa)
          {
          default:
          case 1:
          case 2:
          case 3:
          }
        }
        while (true)
        {
          k++;
          break;
          paramSpannableStringBuilder.setSpan(new AbsoluteSizeSpan((int)paramString.fontSize, true), i, j, 33);
          continue;
          paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(paramString.fontSize), i, j, 33);
          continue;
          paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(paramString.fontSize / 100.0F), i, j, 33);
        }
      }
      AppMethodBeat.o(95737);
    }
  }

  static void a(String paramString1, String paramString2, e.a parama, List<d> paramList)
  {
    AppMethodBeat.i(95734);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    Stack localStack = new Stack();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (true)
    {
      label127: int k;
      if (i < paramString2.length())
      {
        char c = paramString2.charAt(i);
        int j;
        label151: int m;
        label167: label175: label186: String str;
        switch (c)
        {
        default:
          localSpannableStringBuilder.append(c);
          i++;
          break;
        case '<':
          if (i + 1 >= paramString2.length())
          {
            i++;
            continue;
          }
          int n;
          int i1;
          Object localObject;
          if (paramString2.charAt(i + 1) == '/')
          {
            j = 1;
            k = paramString2.indexOf('>', i + 1);
            if (k != -1)
              break label396;
            k = paramString2.length();
            if (paramString2.charAt(k - 2) != '/')
              break label402;
            m = 1;
            if (j == 0)
              break label408;
            n = 2;
            if (m == 0)
              break label414;
            i1 = k - 2;
            localObject = paramString2.substring(n + i, i1);
            str = ((String)localObject).trim();
            if (!str.isEmpty())
              break label423;
            str = null;
            if (str == null)
              break label952;
            i = -1;
            switch (str.hashCode())
            {
            default:
              switch (i)
              {
              default:
              case 0:
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              }
              break;
            case 98:
            case 99:
            case 105:
            case 3314158:
            case 117:
            case 118:
            }
          }
          for (i = 0; ; i = 1)
          {
            if (i == 0)
              break label952;
            if (j == 0)
              break label540;
            do
            {
              if (localStack.isEmpty())
                break;
              localObject = (f.a)localStack.pop();
              a(paramString1, (f.a)localObject, localSpannableStringBuilder, paramList, localArrayList);
            }
            while (!((f.a)localObject).name.equals(str));
            i = k;
            break;
            j = 0;
            break label127;
            k++;
            break label151;
            m = 0;
            break label167;
            n = 1;
            break label175;
            i1 = k - 1;
            break label186;
            str = str.split("[ \\.]")[0];
            break label217;
            if (!str.equals("b"))
              break label288;
            i = 0;
            break label288;
            if (!str.equals("c"))
              break label288;
            i = 1;
            break label288;
            if (!str.equals("i"))
              break label288;
            i = 2;
            break label288;
            if (!str.equals("lang"))
              break label288;
            i = 3;
            break label288;
            if (!str.equals("u"))
              break label288;
            i = 4;
            break label288;
            if (!str.equals("v"))
              break label288;
            i = 5;
            break label288;
          }
          if (m != 0)
            break label952;
          localStack.push(f.a.k((String)localObject, localSpannableStringBuilder.length()));
          i = k;
          break;
        case '&':
          label217: m = paramString2.indexOf(';', i + 1);
          label288: label423: j = paramString2.indexOf(' ', i + 1);
          label396: label402: label408: label414: if (m == -1)
          {
            k = j;
            label602: if (k == -1)
              break label885;
            str = paramString2.substring(i + 1, k);
            i = -1;
            switch (str.hashCode())
            {
            default:
              switch (i)
              {
              default:
                label672: new StringBuilder("ignoring unsupported entity: '&").append(str).append(";'");
              case 0:
              case 1:
              case 2:
              case 3:
              }
              break;
            case 3464:
            case 3309:
            case 3374865:
            case 96708:
            }
          }
          while (true)
          {
            label540: if (k == j)
              localSpannableStringBuilder.append(" ");
            i = k + 1;
            break;
            k = m;
            if (j == -1)
              break label602;
            k = Math.min(m, j);
            break label602;
            if (!str.equals("lt"))
              break label672;
            i = 0;
            break label672;
            if (!str.equals("gt"))
              break label672;
            i = 1;
            break label672;
            if (!str.equals("nbsp"))
              break label672;
            i = 2;
            break label672;
            if (!str.equals("amp"))
              break label672;
            i = 3;
            break label672;
            localSpannableStringBuilder.append('<');
            continue;
            localSpannableStringBuilder.append('>');
            continue;
            localSpannableStringBuilder.append(' ');
            continue;
            localSpannableStringBuilder.append('&');
          }
          label885: localSpannableStringBuilder.append(c);
          i++;
          break;
        }
      }
      else
      {
        while (!localStack.isEmpty())
          a(paramString1, (f.a)localStack.pop(), localSpannableStringBuilder, paramList, localArrayList);
        a(paramString1, f.a.te(), localSpannableStringBuilder, paramList, localArrayList);
        parama.boD = localSpannableStringBuilder;
        AppMethodBeat.o(95734);
        return;
        label952: i = k;
      }
    }
  }

  private static void a(List<d> paramList, String paramString, f.a parama, List<f.b> paramList1)
  {
    AppMethodBeat.i(95738);
    int i = paramList.size();
    int j = 0;
    if (j < i)
    {
      d locald = (d)paramList.get(j);
      String str1 = parama.name;
      String[] arrayOfString = parama.boI;
      String str2 = parama.boH;
      int k;
      if ((locald.boy.isEmpty()) && (locald.boz.isEmpty()) && (locald.boA.isEmpty()) && (locald.boB.isEmpty()))
        if (str1.isEmpty())
          k = 1;
      while (true)
      {
        if (k > 0)
          paramList1.add(new f.b(k, locald));
        j++;
        break;
        k = 0;
        continue;
        k = d.a(d.a(d.a(0, locald.boy, paramString, 1073741824), locald.boz, str1, 2), locald.boB, str2, 4);
        if ((k == -1) || (!Arrays.asList(arrayOfString).containsAll(locald.boA)))
          k = 0;
        else
          k += locald.boA.size() * 4;
      }
    }
    Collections.sort(paramList1);
    AppMethodBeat.o(95738);
  }

  private static boolean a(String paramString, Matcher paramMatcher, l paraml, e.a parama, StringBuilder paramStringBuilder, List<d> paramList)
  {
    boolean bool = true;
    AppMethodBeat.i(95735);
    try
    {
      parama.startTime = h.aD(paramMatcher.group(1));
      parama.endTime = h.aD(paramMatcher.group(2));
      a(paramMatcher.group(3), parama);
      paramStringBuilder.setLength(0);
      while (true)
      {
        paramMatcher = paraml.readLine();
        if (TextUtils.isEmpty(paramMatcher))
          break;
        if (paramStringBuilder.length() > 0)
          paramStringBuilder.append("\n");
        paramStringBuilder.append(paramMatcher.trim());
      }
    }
    catch (NumberFormatException paramString)
    {
      new StringBuilder("Skipping cue with bad header: ").append(paramMatcher.group());
      AppMethodBeat.o(95735);
      bool = false;
    }
    while (true)
    {
      return bool;
      a(paramString, paramStringBuilder.toString(), parama, paramList);
      AppMethodBeat.o(95735);
    }
  }

  private static int aC(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(95736);
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (j)
      {
      default:
        j = -2147483648;
        AppMethodBeat.o(95736);
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case 109757538:
    case -1364013995:
    case -1074341483:
    case 100571:
    }
    while (true)
    {
      return j;
      if (!paramString.equals("start"))
        break;
      j = 0;
      break;
      if (!paramString.equals("center"))
        break;
      j = 1;
      break;
      if (!paramString.equals("middle"))
        break;
      j = 2;
      break;
      if (!paramString.equals("end"))
        break;
      j = 3;
      break;
      AppMethodBeat.o(95736);
      j = i;
      continue;
      AppMethodBeat.o(95736);
      j = 1;
      continue;
      AppMethodBeat.o(95736);
      j = 2;
    }
  }

  final boolean a(l paraml, e.a parama, List<d> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(95732);
    String str = paraml.readLine();
    if (str == null)
      AppMethodBeat.o(95732);
    while (true)
    {
      return bool;
      Object localObject = boE.matcher(str);
      if (((Matcher)localObject).matches())
      {
        bool = a(null, (Matcher)localObject, paraml, parama, this.bnC, paramList);
        AppMethodBeat.o(95732);
      }
      else
      {
        localObject = paraml.readLine();
        if (localObject == null)
        {
          AppMethodBeat.o(95732);
        }
        else
        {
          localObject = boE.matcher((CharSequence)localObject);
          if (((Matcher)localObject).matches())
          {
            bool = a(str.trim(), (Matcher)localObject, paraml, parama, this.bnC, paramList);
            AppMethodBeat.o(95732);
          }
          else
          {
            AppMethodBeat.o(95732);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.f
 * JD-Core Version:    0.6.2
 */