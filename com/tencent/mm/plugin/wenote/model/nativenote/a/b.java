package com.tencent.mm.plugin.wenote.model.nativenote.a;

import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ParagraphStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.j;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.d;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.k;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.m;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.q;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.r;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public final class b
{
  private static int a(Stack<a> paramStack, StringBuilder paramStringBuilder)
  {
    int i = 0;
    AppMethodBeat.i(26697);
    if (!paramStack.isEmpty())
    {
      a locala = (a)paramStack.pop();
      paramStack = locala.uRP.uSo;
      int j = locala.uRR;
      while (i < j)
      {
        paramStringBuilder.append(paramStack);
        i++;
      }
      i = locala.uRR;
      AppMethodBeat.o(26697);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(26697);
      i = 0;
    }
  }

  public static String a(Spanned paramSpanned)
  {
    AppMethodBeat.i(26690);
    if ((paramSpanned == null) || (bo.isNullOrNil(paramSpanned.toString())))
    {
      paramSpanned = "";
      AppMethodBeat.o(26690);
    }
    while (true)
    {
      return paramSpanned;
      StringBuilder localStringBuilder = new StringBuilder();
      a(paramSpanned, localStringBuilder);
      paramSpanned = localStringBuilder.toString();
      AppMethodBeat.o(26690);
    }
  }

  private static Set<r> a(Spanned paramSpanned, e parame)
  {
    AppMethodBeat.i(26695);
    HashSet localHashSet = new HashSet();
    for (paramSpanned : (ParagraphStyle[])paramSpanned.getSpans(parame.aqm, parame.Ls, ParagraphStyle.class))
    {
      q localq = q.a(paramSpanned);
      if (localq != null)
        localHashSet.add(new r(localq, paramSpanned));
    }
    AppMethodBeat.o(26695);
    return localHashSet;
  }

  private static void a(Spanned paramSpanned, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(26691);
    ArrayList localArrayList = new j(paramSpanned).uQu;
    Stack localStack = new Stack();
    int i = localArrayList.size();
    int j = 0;
    if (j < i)
    {
      n localn = (n)localArrayList.get(j);
      Object localObject1 = a(paramSpanned, localn);
      q localq = null;
      Object localObject2 = ((Set)localObject1).iterator();
      do
      {
        localObject3 = localq;
        if (!((Iterator)localObject2).hasNext())
          break;
        localObject3 = (r)((Iterator)localObject2).next();
      }
      while (!((r)localObject3).uRP.uSp);
      Object localObject3 = ((r)localObject3).uRP;
      int k = 0;
      localq = q.uSj;
      localObject1 = ((Set)localObject1).iterator();
      Object localObject4;
      int m;
      if (((Iterator)localObject1).hasNext())
      {
        localObject4 = (r)((Iterator)localObject1).next();
        label192: boolean bool;
        if ((((r)localObject4).uRP.dfG()) || (((r)localObject4).uRP.dfH()) || (((r)localObject4).uRP.dfI()))
        {
          m = 1;
          k += m;
          localObject2 = ((r)localObject4).uRP;
          if (!((r)localObject4).uRP.dfG())
            break label249;
          bool = ((d)((r)localObject4).uSv).uRV;
          label230: if (!bool)
            break label309;
          localq = q.uSj;
        }
        while (true)
        {
          break;
          m = 0;
          break label192;
          label249: if (((r)localObject4).uRP.dfH())
          {
            bool = ((m)((r)localObject4).uSv).uRV;
            break label230;
          }
          if (((r)localObject4).uRP.dfI())
          {
            bool = ((k)((r)localObject4).uSv).uRV;
            break label230;
          }
          bool = true;
          break label230;
          label309: if (((q)localObject2).dfG())
            localq = q.uSk;
          else if (((q)localObject2).dfH())
            localq = q.uSl;
          else if (((q)localObject2).dfI())
            localq = q.uSm;
        }
      }
      a(localStack, paramStringBuilder, new a(localq, k, 0));
      if (localq.dfI())
      {
        localObject1 = (k[])paramSpanned.getSpans(localn.aqm, localn.Ls, k.class);
        if (localObject1.length > 0)
        {
          localq.uSt = localObject1[0].uSb;
          m = localq.uSq.indexOf("\"") + 1;
          k = localq.uSq.lastIndexOf("\"");
          if (m < k)
          {
            localObject2 = localq.uSq.substring(m, k);
            if (!bo.isNullOrNil((String)localObject2))
            {
              localObject4 = ((String)localObject2).trim();
              if (!localq.uSt)
                break label676;
              localObject1 = "1";
              label500: if (!((String)localObject4).equals(localObject1))
              {
                localObject4 = localq.uSq;
                if (!localq.uSt)
                  break label684;
              }
            }
          }
        }
      }
      label676: label684: for (localObject1 = "1"; ; localObject1 = "0")
      {
        localq.uSq = ((String)localObject4).replaceAll((String)localObject2, (String)localObject1);
        paramStringBuilder.append(localq.uSq);
        if (localObject3 != null)
          paramStringBuilder.append(((q)localObject3).uSn);
        k = localn.aqm;
        m = localn.Ls;
        localObject1 = new TreeSet(new b.1(paramSpanned));
        ((SortedSet)localObject1).addAll(Arrays.asList(paramSpanned.getSpans(k, m, CharacterStyle.class)));
        a(paramSpanned, paramStringBuilder, k, m, (SortedSet)localObject1);
        if (localObject3 != null)
        {
          a(paramStringBuilder, (q)localObject3);
          paramStringBuilder.append(((q)localObject3).uSo);
        }
        a(paramStringBuilder, localq);
        paramStringBuilder.append(localq.uSr);
        j++;
        break;
        localObject1 = "0";
        break label500;
      }
    }
    while (!localStack.isEmpty())
      a(localStack, paramStringBuilder);
    AppMethodBeat.o(26691);
  }

  private static void a(Spanned paramSpanned, StringBuilder paramStringBuilder, int paramInt1, int paramInt2, SortedSet<CharacterStyle> paramSortedSet)
  {
    AppMethodBeat.i(26692);
    if (paramInt1 < paramInt2)
    {
      CharacterStyle localCharacterStyle;
      label24: int i;
      if (paramSortedSet.isEmpty())
      {
        localCharacterStyle = null;
        if (localCharacterStyle != null)
          break label83;
        i = 2147483647;
        label34: if (localCharacterStyle != null)
          break label96;
      }
      label83: label96: for (int j = 2147483647; ; j = paramSpanned.getSpanEnd(localCharacterStyle))
      {
        if (paramInt1 >= i)
          break label109;
        a(paramSpanned, paramStringBuilder, paramInt1, Math.min(paramInt2, i));
        paramInt1 = i;
        break;
        localCharacterStyle = (CharacterStyle)paramSortedSet.first();
        break label24;
        i = paramSpanned.getSpanStart(localCharacterStyle);
        break label34;
      }
      label109: paramSortedSet.remove(localCharacterStyle);
      if ((localCharacterStyle instanceof BoldSpan))
      {
        paramStringBuilder.append("<wx-b>");
        label135: a(paramSpanned, paramStringBuilder, Math.max(i, paramInt1), Math.min(j, paramInt2), paramSortedSet);
        if (!(localCharacterStyle instanceof ForegroundColorSpan))
          break label503;
        paramStringBuilder.append("</wx-font>");
      }
      while (true)
      {
        paramInt1 = j;
        break;
        if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 1))
        {
          paramStringBuilder.append("<wx-b>");
          break label135;
        }
        if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 2))
        {
          paramStringBuilder.append("<i>");
          break label135;
        }
        if ((localCharacterStyle instanceof UnderlineSpan))
        {
          paramStringBuilder.append("<u>");
          break label135;
        }
        if ((localCharacterStyle instanceof RelativeSizeSpan))
        {
          paramStringBuilder.append("<wx-font style=\"font-size:");
          paramStringBuilder.append(com.tencent.mm.plugin.wenote.model.nativenote.manager.b.Kd((int)(((RelativeSizeSpan)localCharacterStyle).getSizeChange() * com.tencent.mm.plugin.wenote.model.nativenote.manager.b.getTextSize())));
          paramStringBuilder.append("px\">");
          break label135;
        }
        if ((localCharacterStyle instanceof AbsoluteSizeSpan))
        {
          paramStringBuilder.append("<wx-font style=\"font-size:");
          paramStringBuilder.append(com.tencent.mm.plugin.wenote.model.nativenote.manager.b.Kd(((AbsoluteSizeSpan)localCharacterStyle).getSize()));
          paramStringBuilder.append("px\">");
          break label135;
        }
        if ((localCharacterStyle instanceof ForegroundColorSpan))
        {
          paramStringBuilder.append("<wx-font style=\"color:#");
          for (str = Integer.toHexString(((ForegroundColorSpan)localCharacterStyle).getForegroundColor() + 16777216); str.length() < 6; str = "0".concat(String.valueOf(str)));
          paramStringBuilder.append(str);
          paramStringBuilder.append("\">");
          break label135;
        }
        if (!(localCharacterStyle instanceof BackgroundColorSpan))
          break label135;
        paramStringBuilder.append("<wx-font style=\"background-color:#");
        for (String str = Integer.toHexString(((BackgroundColorSpan)localCharacterStyle).getBackgroundColor() + 16777216); str.length() < 6; str = "0".concat(String.valueOf(str)));
        paramStringBuilder.append(str);
        paramStringBuilder.append("\">");
        break label135;
        label503: if ((localCharacterStyle instanceof BackgroundColorSpan))
          paramStringBuilder.append("</wx-font>");
        else if ((localCharacterStyle instanceof AbsoluteSizeSpan))
          paramStringBuilder.append("</wx-font>");
        else if ((localCharacterStyle instanceof UnderlineSpan))
          paramStringBuilder.append("</u>");
        else if ((localCharacterStyle instanceof BoldSpan))
          paramStringBuilder.append("</wx-b>");
        else if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 2))
          paramStringBuilder.append("</i>");
        else if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 1))
          paramStringBuilder.append("</wx-b>");
        else if ((localCharacterStyle instanceof RelativeSizeSpan))
          paramStringBuilder.append("</wx-font>");
      }
    }
    AppMethodBeat.o(26692);
  }

  public static void a(CharSequence paramCharSequence, StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26693);
    if (paramInt1 < paramInt2)
    {
      char c = paramCharSequence.charAt(paramInt1);
      if (c == '\n')
        paramStringBuilder.append("<br/>");
      while (true)
      {
        paramInt1++;
        break;
        if (c == '<')
        {
          paramStringBuilder.append("&lt;");
        }
        else if (c == '>')
        {
          paramStringBuilder.append("&gt;");
        }
        else if (c == '&')
        {
          paramStringBuilder.append("&amp;");
        }
        else if (c == ' ')
        {
          while ((paramInt1 + 1 < paramInt2) && (paramCharSequence.charAt(paramInt1 + 1) == ' '))
          {
            paramStringBuilder.append("&nbsp;");
            paramInt1++;
          }
          paramStringBuilder.append(' ');
        }
        else if (c < ' ')
        {
          paramStringBuilder.append("&#" + c + ";");
        }
        else
        {
          paramStringBuilder.append(c);
        }
      }
    }
    AppMethodBeat.o(26693);
  }

  private static void a(StringBuilder paramStringBuilder, q paramq)
  {
    AppMethodBeat.i(26694);
    if ((paramq.uSs) && (paramStringBuilder.length() >= 5))
    {
      int i = paramStringBuilder.length() - 5;
      int j = paramStringBuilder.length();
      if (paramStringBuilder.subSequence(i, j).equals("<br/>"))
        paramStringBuilder.delete(i, j);
    }
    AppMethodBeat.o(26694);
  }

  private static void a(Stack<a> paramStack, StringBuilder paramStringBuilder, a parama)
  {
    AppMethodBeat.i(26696);
    int i = 0;
    Object localObject = q.uSj;
    if (!paramStack.isEmpty())
    {
      localObject = (a)paramStack.peek();
      i = ((a)localObject).uRQ;
      localObject = ((a)localObject).uRP;
    }
    if (parama.uRQ > i)
    {
      parama.uRR = (parama.uRQ - i);
      b(paramStack, paramStringBuilder, parama);
      AppMethodBeat.o(26696);
    }
    while (true)
    {
      return;
      if (parama.uRQ < i)
      {
        a(paramStack, paramStringBuilder);
        break;
      }
      if (parama.uRP != localObject)
      {
        parama.uRR = a(paramStack, paramStringBuilder);
        b(paramStack, paramStringBuilder, parama);
      }
      AppMethodBeat.o(26696);
    }
  }

  private static void b(Stack<a> paramStack, StringBuilder paramStringBuilder, a parama)
  {
    AppMethodBeat.i(26698);
    String str = parama.uRP.uSn;
    int i = parama.uRR;
    for (int j = 0; j < i; j++)
      paramStringBuilder.append(str);
    paramStack.push(parama);
    AppMethodBeat.o(26698);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.a.b
 * JD-Core Version:    0.6.2
 */