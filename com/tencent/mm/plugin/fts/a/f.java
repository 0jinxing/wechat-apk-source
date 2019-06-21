package com.tencent.mm.plugin.fts.a;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.d.a;
import com.tencent.mm.plugin.fts.a.a.d.b;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.g.b;
import com.tencent.mm.plugin.fts.a.a.g.c;
import com.tencent.mm.plugin.fts.a.a.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class f
{
  @Deprecated
  public static Spannable a(CharSequence paramCharSequence, String paramString)
  {
    AppMethodBeat.i(114229);
    paramCharSequence = a(com.tencent.mm.plugin.fts.a.a.d.b(paramCharSequence, paramString));
    if ((paramCharSequence.mDR instanceof Spannable))
    {
      paramCharSequence = (Spannable)paramCharSequence.mDR;
      AppMethodBeat.o(114229);
    }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = new SpannableString(paramCharSequence.mDR);
      AppMethodBeat.o(114229);
    }
  }

  private static e a(Spannable paramSpannable, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    AppMethodBeat.i(114222);
    e locale = new e();
    float f1 = paramd.mDF - paramd.eNN.getTextSize() * 2.0F;
    float f2 = paramd.eNN.measureText("…");
    float f3 = paramd.eNN.measureText(paramSpannable, 0, paramb.mDP);
    float f4 = paramd.eNN.measureText(paramSpannable, paramb.mDP, paramb.mDQ);
    float f5 = paramd.eNN.measureText(paramSpannable, paramb.mDQ, paramSpannable.length());
    if (f3 + f4 + f5 < f1)
    {
      paramSpannable = c(paramSpannable, paramb, paramd);
      AppMethodBeat.o(114222);
      return paramSpannable;
    }
    Object localObject1 = paramSpannable.subSequence(paramb.mDP, paramb.mDQ);
    Object localObject2;
    if (paramd.mDD == d.a.mDM)
    {
      localObject2 = new SpannableString(TextUtils.concat(new CharSequence[] { paramd.mDI, localObject1, paramd.mDJ }));
      label182: if (f3 + f4 + f2 >= f1)
        break label392;
      localObject1 = new SpannableStringBuilder(paramSpannable, 0, paramb.mDP);
      ((SpannableStringBuilder)localObject1).append((CharSequence)localObject2);
      ((SpannableStringBuilder)localObject1).append(TextUtils.ellipsize(paramSpannable.subSequence(paramb.mDQ, paramSpannable.length()), paramd.eNN, f1 - f3 - f4, TextUtils.TruncateAt.END));
      locale.mDR = ((CharSequence)localObject1);
    }
    while (true)
    {
      while (true)
      {
        locale.bFZ = 0;
        AppMethodBeat.o(114222);
        paramSpannable = locale;
        break;
        if (paramd.mDD == d.a.mDL)
        {
          localObject2 = new BackgroundColorSpan(paramd.mDE);
          localObject1 = new SpannableString((CharSequence)localObject1);
        }
        try
        {
          ((SpannableString)localObject1).setSpan(localObject2, 0, ((SpannableString)localObject1).length(), 33);
          localObject2 = localObject1;
          break label182;
          localObject2 = new ForegroundColorSpan(paramd.mDE);
        }
        catch (Exception paramd)
        {
          ab.printErrStackTrace("MicroMsg.FTS.FTSUIHLLogic", paramd, "setSpan %s", new Object[] { paramb.toString() });
          locale.bFZ = -1;
          locale.mDR = paramSpannable;
          AppMethodBeat.o(114222);
          paramSpannable = locale;
        }
      }
      break;
      label392: if (f2 + f4 + f5 < f1)
      {
        localObject1 = new SpannableStringBuilder();
        ((SpannableStringBuilder)localObject1).append(TextUtils.ellipsize(paramSpannable.subSequence(0, paramb.mDP), paramd.eNN, f1 - f4 - f5, TextUtils.TruncateAt.START));
        ((SpannableStringBuilder)localObject1).append((CharSequence)localObject2);
        ((SpannableStringBuilder)localObject1).append(paramSpannable, paramb.mDQ, paramSpannable.length());
        locale.mDR = ((CharSequence)localObject1);
      }
      else if (f2 + f4 + f2 >= f1)
      {
        paramSpannable = new SpannableStringBuilder();
        paramSpannable.append(TextUtils.ellipsize((CharSequence)localObject2, paramd.eNN, f1, TextUtils.TruncateAt.END));
        locale.mDR = paramSpannable;
      }
      else
      {
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
        f3 = (f1 - f4) / 2.0F;
        localObject1 = paramSpannable.subSequence(0, paramb.mDP);
        paramSpannable = paramSpannable.subSequence(paramb.mDQ, paramSpannable.length());
        localSpannableStringBuilder.append(TextUtils.ellipsize((CharSequence)localObject1, paramd.eNN, f3, TextUtils.TruncateAt.START));
        localSpannableStringBuilder.append((CharSequence)localObject2);
        localSpannableStringBuilder.append(TextUtils.ellipsize(paramSpannable, paramd.eNN, f3, TextUtils.TruncateAt.END));
        locale.mDR = localSpannableStringBuilder;
      }
    }
  }

  public static final e a(com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    int i = 1;
    AppMethodBeat.i(114220);
    Object localObject1 = new e();
    SpannableString localSpannableString = new SpannableString(TextUtils.concat(new CharSequence[] { paramd.mDG, paramd.mDy, paramd.mDH }));
    ((e)localObject1).bFZ = -1;
    ((e)localObject1).mDR = localSpannableString;
    if ((!bo.ac(paramd.mDy)) && (paramd.mDz != null));
    for (int j = 1; j == 0; j = 0)
    {
      AppMethodBeat.o(114220);
      return localObject1;
    }
    Object localObject2 = d.Nb(paramd.mDy.toString());
    Object localObject3 = new ArrayList();
    if (paramd.mDA)
      localObject3 = aM((String)localObject2, paramd.mDC);
    while (true)
    {
      Object localObject6;
      while (true)
      {
        if ((paramd.mDz.mEc.size() != 1) && (!a(localSpannableString, paramd)))
          break label519;
        localObject6 = new d.b();
        if (paramd.mDz.mEc.size() == 1)
        {
          ((d.b)localObject6).mDO = ((g.c)paramd.mDz.mEc.get(0));
          if (paramd.mDA)
          {
            a((List)localObject3, (d.b)localObject6, paramd);
            if (!((d.b)localObject6).isAvailable())
              break label850;
          }
          try
          {
            paramd = b(localSpannableString, (d.b)localObject6, paramd);
            AppMethodBeat.o(114220);
            localObject1 = paramd;
            break;
            a((String)localObject2, (d.b)localObject6, paramd);
          }
          catch (Exception paramd)
          {
            while (true)
            {
              ((e)localObject1).mDR = localSpannableString;
              paramd = (com.tencent.mm.plugin.fts.a.a.d)localObject1;
            }
          }
        }
      }
      ((d.b)localObject6).mDO = ((g.c)paramd.mDz.mEc.get(0));
      if (paramd.mDA)
      {
        a((List)localObject3, (d.b)localObject6, paramd);
        label309: localObject3 = localObject1;
        if (!((d.b)localObject6).isAvailable());
      }
      while (true)
      {
        Object localObject5;
        while (true)
        {
          try
          {
            localObject3 = b(localSpannableString, (d.b)localObject6, paramd);
            localObject7 = ((e)localObject3).mDR.toString();
            localObject2 = new ArrayList();
            if (!paramd.mDA)
              break label858;
            localObject2 = aM((String)localObject7, paramd.mDC);
            j = i;
            localObject1 = localObject3;
            if (j < paramd.mDz.mEc.size())
            {
              ((d.b)localObject6).mDO = ((g.c)paramd.mDz.mEc.get(j));
              if (paramd.mDA)
              {
                a((List)localObject2, (d.b)localObject6, paramd);
                localObject3 = localObject1;
                if (!((d.b)localObject6).isAvailable());
              }
            }
          }
          catch (Exception localException1)
          {
            try
            {
              localObject3 = b((Spannable)((e)localObject1).mDR, (d.b)localObject6, paramd);
              j++;
              localObject1 = localObject3;
              continue;
              a((String)localObject2, (d.b)localObject6, paramd);
              break label309;
              localException1 = localException1;
              ((e)localObject1).mDR = localSpannableString;
              Object localObject4 = localObject1;
              continue;
              a((String)localObject7, (d.b)localObject6, paramd);
            }
            catch (Exception localException2)
            {
              ((e)localObject1).mDR = localSpannableString;
              localObject5 = localObject1;
              continue;
            }
            AppMethodBeat.o(114220);
          }
          break;
          label519: localObject7 = new d.b();
          ((d.b)localObject7).mDO = new g.c();
          localObject6 = new g.b();
          ((g.b)localObject6).mEe = g.d.mEj;
          ((g.b)localObject6).content = paramd.mDz.mDZ;
          ((d.b)localObject7).mDO.mEg.add(localObject6);
          if (paramd.mDA)
          {
            a((List)localObject5, (d.b)localObject7, paramd);
            if (!((d.b)localObject7).isAvailable());
          }
          else
          {
            try
            {
              paramd = b(localSpannableString, (d.b)localObject7, paramd);
              localObject1 = paramd;
              AppMethodBeat.o(114220);
              break;
              a((String)localObject2, (d.b)localObject7, paramd);
            }
            catch (Exception paramd)
            {
              while (true)
                ((e)localObject1).mDR = localSpannableString;
            }
          }
        }
        localObject6 = new ArrayList();
        Object localObject7 = paramd.mDz.mEc.iterator();
        while (((Iterator)localObject7).hasNext())
        {
          localObject8 = (g.c)((Iterator)localObject7).next();
          d.b localb = new d.b();
          localb.mDO = ((g.c)localObject8);
          ((List)localObject6).add(localb);
        }
        Object localObject8 = ((List)localObject6).iterator();
        while (((Iterator)localObject8).hasNext())
        {
          localObject7 = (d.b)((Iterator)localObject8).next();
          if (paramd.mDA)
            a((List)localObject5, (d.b)localObject7, paramd);
          else
            a((String)localObject2, (d.b)localObject7, paramd);
        }
        localObject2 = ((List)localObject6).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject5 = (d.b)((Iterator)localObject2).next();
          if (((d.b)localObject5).isAvailable())
          {
            localObject5 = b(localSpannableString, (d.b)localObject5, paramd);
            if (((e)localObject5).bFZ == 0)
              localObject1 = localObject5;
          }
        }
        AppMethodBeat.o(114220);
        break;
        label850: AppMethodBeat.o(114220);
        break;
        label858: localObject1 = localObject5;
        j = i;
      }
    }
  }

  public static final e a(String paramString1, String paramString2, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    AppMethodBeat.i(114218);
    paramd = a(paramd);
    paramd.mDR = TextUtils.concat(new CharSequence[] { paramString1, paramd.mDR, paramString2 });
    AppMethodBeat.o(114218);
    return paramd;
  }

  private static void a(String paramString, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    AppMethodBeat.i(114225);
    String str = paramb.bAk();
    if (bo.isNullOrNil(str))
      AppMethodBeat.o(114225);
    while (true)
    {
      return;
      int i = paramString.indexOf(str);
      if (i >= 0)
      {
        paramb.mDP = i;
        paramb.mDQ = (str.length() + i);
      }
      if ((paramb.isAvailable()) && (paramd.mDG != null))
      {
        paramb.mDP += paramd.mDG.length();
        paramb.mDQ += paramd.mDG.length();
      }
      AppMethodBeat.o(114225);
    }
  }

  private static void a(List<List<String>> paramList, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    AppMethodBeat.i(114226);
    Object localObject1;
    Object localObject2;
    if (paramd.mDC)
    {
      localObject1 = paramb.mDO.mEg.iterator();
      do
      {
        if (!((Iterator)localObject1).hasNext())
          break;
        localObject2 = (g.b)((Iterator)localObject1).next();
      }
      while (((g.b)localObject2).mEe != g.d.mEi);
    }
    while (true)
    {
      if (localObject2 == null)
      {
        AppMethodBeat.o(114226);
        return;
      }
      int i = h(paramList, ((g.b)localObject2).mEf);
      if (i >= 0)
      {
        paramb.mDP = i;
        paramb.mDQ = (((g.b)localObject2).mEf.size() + i);
        label107: break label181;
      }
      while (true)
      {
        if ((paramb.isAvailable()) && (paramd.mDG != null))
        {
          paramb.mDP += paramd.mDG.length();
          paramb.mDQ += paramd.mDG.length();
        }
        AppMethodBeat.o(114226);
        break;
        localObject2 = paramb.mDO.mEg.iterator();
        label181: if (((Iterator)localObject2).hasNext())
        {
          localObject1 = (g.b)((Iterator)localObject2).next();
          if (((g.b)localObject1).mEe != g.d.mEh)
            break label107;
          i = h(paramList, ((g.b)localObject1).mEf);
          if (i < 0)
            break label107;
          paramb.mDP = i;
          paramb.mDQ = (((g.b)localObject1).mEf.size() + i);
        }
      }
      localObject2 = null;
    }
  }

  private static boolean a(Spannable paramSpannable, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    boolean bool = false;
    AppMethodBeat.i(114221);
    if ((paramd.mDF > 0.0F) && (paramd.eNN != null))
      if (paramd.mDF - paramd.eNN.getTextSize() * 2.0F < paramd.eNN.measureText(paramSpannable.toString()))
      {
        bool = true;
        AppMethodBeat.o(114221);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(114221);
      continue;
      AppMethodBeat.o(114221);
    }
  }

  private static List<List<String>> aM(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(114228);
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    if (i < paramString.length())
    {
      char c = paramString.charAt(i);
      ArrayList localArrayList2 = new ArrayList(2);
      if (g.t(c))
      {
        String[] arrayOfString = (String[])g.mDn.get(String.valueOf(c));
        if ((arrayOfString != null) && (arrayOfString.length > 0) && (arrayOfString[0].length() > 0))
        {
          int j = arrayOfString.length;
          for (int k = 0; k < j; k++)
          {
            String str1 = arrayOfString[k];
            String str2 = str1;
            if (paramBoolean)
              str2 = str1.substring(0, 1);
            if (!localArrayList2.contains(str2))
              localArrayList2.add(str2);
          }
          localArrayList1.add(localArrayList2);
        }
      }
      while (true)
      {
        i++;
        break;
        localArrayList1.add(localArrayList2);
        continue;
        localArrayList1.add(localArrayList2);
      }
    }
    AppMethodBeat.o(114228);
    return localArrayList1;
  }

  private static e b(Spannable paramSpannable, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    AppMethodBeat.i(114223);
    if (a(paramSpannable, paramd))
    {
      paramSpannable = a(paramSpannable, paramb, paramd);
      AppMethodBeat.o(114223);
    }
    while (true)
    {
      return paramSpannable;
      paramSpannable = c(paramSpannable, paramb, paramd);
      AppMethodBeat.o(114223);
    }
  }

  private static e c(Spannable paramSpannable, d.b paramb, com.tencent.mm.plugin.fts.a.a.d paramd)
  {
    AppMethodBeat.i(114224);
    e locale = new e();
    if (paramd.mDD == d.a.mDM)
    {
      paramSpannable = paramSpannable.toString();
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(paramSpannable.substring(0, paramb.mDP));
      localStringBuffer.append(paramd.mDI);
      localStringBuffer.append(paramSpannable.substring(paramb.mDP, paramb.mDQ));
      localStringBuffer.append(paramd.mDJ);
      if (paramb.mDQ < paramSpannable.length())
        localStringBuffer.append(paramSpannable.substring(paramb.mDQ, paramSpannable.length()));
      locale.mDR = localStringBuffer.toString();
      locale.bFZ = 0;
      AppMethodBeat.o(114224);
      return locale;
    }
    if (paramd.mDD == d.a.mDL);
    for (paramd = new BackgroundColorSpan(paramd.mDE); ; paramd = new ForegroundColorSpan(paramd.mDE))
    {
      try
      {
        paramSpannable.setSpan(paramd, paramb.mDP, paramb.mDQ, 18);
        locale.mDR = paramSpannable;
        locale.bFZ = 0;
      }
      catch (Exception paramd)
      {
        ab.printErrStackTrace("MicroMsg.FTS.FTSUIHLLogic", paramd, "setSpan %s", new Object[] { paramb.toString() });
        locale.mDR = paramSpannable;
        locale.bFZ = -1;
      }
      break;
    }
  }

  private static int h(List<List<String>> paramList, List<String> paramList1)
  {
    AppMethodBeat.i(114227);
    int i = 0;
    int j = 0;
    int k;
    if (i < paramList.size() - paramList1.size() + 1)
      while (true)
        if (j < paramList1.size())
        {
          Object localObject = (List)paramList.get(i + j);
          String str = (String)paramList1.get(j);
          if (((List)localObject).contains(str))
          {
            j++;
          }
          else if (j == paramList1.size() - 1)
          {
            localObject = ((List)localObject).iterator();
            while (true)
              if (((Iterator)localObject).hasNext())
                if (((String)((Iterator)localObject).next()).startsWith(str))
                {
                  k = 1;
                  label135: if (k != 0)
                  {
                    j++;
                    break;
                  }
                  k = 0;
                  j = 0;
                  label151: if (k == 0);
                }
          }
        }
    while (true)
    {
      AppMethodBeat.o(114227);
      return i;
      k = 0;
      j = 0;
      break label151;
      i++;
      break;
      k = 0;
      break label135;
      k = 1;
      break label151;
      i = -1;
    }
  }

  public static final SpannableString j(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(114219);
    paramCharSequence = new SpannableString(paramCharSequence);
    d.b localb = new d.b();
    localb.mDP = 0;
    localb.mDQ = paramInt;
    b(paramCharSequence, localb, new com.tencent.mm.plugin.fts.a.a.d());
    AppMethodBeat.o(114219);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.f
 * JD-Core Version:    0.6.2
 */