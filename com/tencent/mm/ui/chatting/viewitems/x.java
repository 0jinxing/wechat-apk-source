package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class x
{
  private static final LinearLayout.LayoutParams zfr;

  static
  {
    AppMethodBeat.i(33189);
    zfr = new LinearLayout.LayoutParams(-1, -2);
    AppMethodBeat.o(33189);
  }

  private static boolean a(LinearLayout paramLinearLayout, SpannableString paramSpannableString, List<x.a> paramList)
  {
    AppMethodBeat.i(33182);
    ab.d("MicroMsg.ChattingItemDyeingTemplateDecorator", "addLines, nodeList size = " + paramList.size());
    int i = paramSpannableString.length();
    Iterator localIterator = paramList.iterator();
    for (int j = 0; localIterator.hasNext(); j = paramList.offset)
    {
      paramList = (x.a)localIterator.next();
      if (paramList.offset > j)
      {
        localTextView = new TextView(paramLinearLayout.getContext());
        localTextView.setText(paramSpannableString.subSequence(j, Math.min(paramList.offset, i)));
        localTextView.setLineSpacing(3.0F, 1.0F);
        paramLinearLayout.addView(localTextView, zfr);
      }
      TextView localTextView = new TextView(paramLinearLayout.getContext());
      localTextView.setText(arG(paramList.zft));
      localTextView.setSingleLine(true);
      if (paramList.hOg != 14)
        localTextView.setTextSize(paramList.hOg);
      if (paramList.cNx)
        localTextView.setTypeface(null, 1);
      if (paramList.zfs)
        localTextView.setPaintFlags(localTextView.getPaintFlags() | 0x8);
      localTextView.setTextColor(paramList.color);
      paramLinearLayout.addView(localTextView, zfr);
    }
    if (j >= i)
    {
      ab.i("MicroMsg.ChattingItemDyeingTemplateDecorator", "addLines, lastOffset >= maxLength, lastOffset = " + j + ", maxLength = " + i);
      AppMethodBeat.o(33182);
    }
    while (true)
    {
      return true;
      paramList = new TextView(paramLinearLayout.getContext());
      paramList.setTextSize(0, a.al(paramList.getContext(), 2131427762));
      paramList.setText(paramSpannableString.subSequence(j, i));
      paramList.setLineSpacing(2.0F, 1.0F);
      paramLinearLayout.addView(paramList, zfr);
      AppMethodBeat.o(33182);
    }
  }

  public static boolean a(LinearLayout paramLinearLayout, Map<String, String> paramMap)
  {
    AppMethodBeat.i(33181);
    if (paramLinearLayout == null)
    {
      ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle fail, digestLl is null");
      bool1 = false;
      AppMethodBeat.o(33181);
    }
    SpannableString localSpannableString;
    int i;
    Object localObject4;
    Object localObject5;
    label185: Object localObject2;
    while (true)
    {
      return bool1;
      Object localObject1 = (String)paramMap.get(".msg.appmsg.mmreader.category.item.digest");
      if (bo.isNullOrNil((String)localObject1))
      {
        ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle, digest is null");
        bool1 = false;
        AppMethodBeat.o(33181);
      }
      else
      {
        localSpannableString = new SpannableString((CharSequence)localObject1);
        try
        {
          localObject1 = new android/text/style/ForegroundColorSpan;
          ((ForegroundColorSpan)localObject1).<init>(-16777216);
          localSpannableString.setSpan(localObject1, 0, localSpannableString.length(), 17);
          i = 0;
          localObject4 = new StringBuilder(".msg.appmsg.mmreader.category.item.styles.style");
          if (i == 0)
          {
            localObject1 = "";
            localObject4 = (String)localObject1;
            if (paramMap.containsKey(localObject4))
              break label282;
            ab.i("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle end, total style count = ".concat(String.valueOf(i)));
            i = 0;
            localObject4 = new ArrayList();
            localObject5 = new StringBuilder(".msg.appmsg.mmreader.category.item.styles.line");
            if (i != 0)
              break label954;
            localObject1 = "";
            localObject5 = (String)localObject1;
            if (paramMap.containsKey(localObject5))
              break label963;
            ab.d("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle end, total line count = ".concat(String.valueOf(i)));
            Collections.sort((List)localObject4);
            paramLinearLayout.removeAllViews();
            a(paramLinearLayout, localSpannableString, (List)localObject4);
            bool1 = true;
            AppMethodBeat.o(33181);
          }
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
        {
          while (true)
          {
            ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle setSpan error: %s", new Object[] { localIndexOutOfBoundsException1.getMessage() });
            continue;
            localObject2 = String.valueOf(i);
          }
          label282: localObject2 = x.b.y(paramMap, (String)localObject4);
          if (localObject2 != null)
            break label315;
        }
      }
    }
    ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom fail, skip to next, styleKey = ".concat(String.valueOf(localObject4)));
    while (true)
    {
      i++;
      break;
      label315: if (((x.b)localObject2).zfu < ((x.b)localObject2).zfv)
        break label367;
      ab.w("MicroMsg.ChattingItemDyeingTemplateDecorator", "addStyle, no need to add, rangeFrom = " + ((x.b)localObject2).zfu + ", rangeTo = " + ((x.b)localObject2).zfv);
    }
    label367: int j = ((x.b)localObject2).zfu;
    int k = ((x.b)localObject2).zfv;
    int m = ((x.b)localObject2).hOg;
    boolean bool1 = ((x.b)localObject2).cNx;
    boolean bool2 = ((x.b)localObject2).zfs;
    ab.d("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont, rangeFrom = " + j + ", rangeTo = " + k + ", fontSize = " + m + ", isBlack = " + bool1 + ", isUnderLine = " + bool2);
    int n = j;
    if (j < 0)
    {
      ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont, params error. length:%d, from:%d, to:%d", new Object[] { Integer.valueOf(localSpannableString.length()), Integer.valueOf(j), Integer.valueOf(k) });
      n = 0;
    }
    if (k > localSpannableString.length())
    {
      ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont, params error. length:%d, from:%d, to:%d", new Object[] { Integer.valueOf(localSpannableString.length()), Integer.valueOf(n), Integer.valueOf(k) });
      k = localSpannableString.length();
    }
    while (true)
    {
      while (true)
      {
        if (bool1);
        try
        {
          localObject4 = new android/text/style/StyleSpan;
          ((StyleSpan)localObject4).<init>(1);
          localSpannableString.setSpan(localObject4, n, k, 17);
          if (!bool2);
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException4)
        {
          try
          {
            localObject4 = new android/text/style/UnderlineSpan;
            ((UnderlineSpan)localObject4).<init>();
            localSpannableString.setSpan(localObject4, n, k, 17);
            if (m == 14);
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException4)
          {
            try
            {
              while (true)
              {
                while (true)
                {
                  localObject4 = new android/text/style/AbsoluteSizeSpan;
                  ((AbsoluteSizeSpan)localObject4).<init>(m);
                  localSpannableString.setSpan(localObject4, n, k, 17);
                  k = ((x.b)localObject2).zfu;
                  j = ((x.b)localObject2).zfv;
                  m = ((x.b)localObject2).color;
                  ab.d("MicroMsg.ChattingItemDyeingTemplateDecorator", "setColor, rangeFrom = " + k + ", rangeTo = " + j + ", color = " + m);
                  n = k;
                  if (k < 0)
                  {
                    ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setColor, params error. length:%d, from:%d, to:%d", new Object[] { Integer.valueOf(localSpannableString.length()), Integer.valueOf(k), Integer.valueOf(j) });
                    n = 0;
                  }
                  k = j;
                  if (j > localSpannableString.length())
                  {
                    ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setColor, params error. length:%d, from:%d, to:%d", new Object[] { Integer.valueOf(localSpannableString.length()), Integer.valueOf(n), Integer.valueOf(j) });
                    k = localSpannableString.length();
                  }
                  try
                  {
                    localObject2 = new android/text/style/ForegroundColorSpan;
                    ((ForegroundColorSpan)localObject2).<init>(m);
                    localSpannableString.setSpan(localObject2, n, k, 17);
                  }
                  catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
                  {
                    ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont setSpan error: %s", new Object[] { localIndexOutOfBoundsException2.getMessage() });
                  }
                }
                break;
                localIndexOutOfBoundsException3 = localIndexOutOfBoundsException3;
                ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont setSpan error: %s", new Object[] { localIndexOutOfBoundsException3.getMessage() });
              }
              localIndexOutOfBoundsException4 = localIndexOutOfBoundsException4;
              ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont setSpan error: %s", new Object[] { localIndexOutOfBoundsException4.getMessage() });
            }
            catch (IndexOutOfBoundsException localIndexOutOfBoundsException5)
            {
              while (true)
                ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont setSpan error: %s", new Object[] { localIndexOutOfBoundsException5.getMessage() });
            }
          }
        }
      }
      label954: Object localObject3 = String.valueOf(i);
      break label185;
      label963: localObject3 = x.a.x(paramMap, (String)localObject5);
      if (localObject3 == null)
        ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom fail, skip to next, lineKey = ".concat(String.valueOf(localObject5)));
      while (true)
      {
        i++;
        break;
        localIndexOutOfBoundsException5.add(localObject3);
      }
    }
  }

  private static String arG(String paramString)
  {
    AppMethodBeat.i(33183);
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    while (localStringBuilder.length() < 80)
      localStringBuilder.append(paramString);
    paramString = localStringBuilder.toString();
    AppMethodBeat.o(33183);
    return paramString;
  }

  private static int arH(String paramString)
  {
    int i = -16777216;
    AppMethodBeat.i(33184);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(33184);
    while (true)
    {
      return i;
      try
      {
        int j = Color.parseColor(paramString);
        i = j;
        AppMethodBeat.o(33184);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom, ex = " + paramString.getMessage());
        AppMethodBeat.o(33184);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.x
 * JD-Core Version:    0.6.2
 */