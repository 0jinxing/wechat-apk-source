package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a;
import java.util.LinkedList;

public final class j
{
  static LinkedList<g> vrX;
  private static boolean vrY;

  static
  {
    AppMethodBeat.i(79849);
    vrX = new LinkedList();
    vrY = bo.gT(ah.getContext());
    AppMethodBeat.o(79849);
  }

  private static SpannableString a(Context paramContext, TextView paramTextView, int paramInt, boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(79828);
    paramContext = new p(paramContext);
    paramContext.vsF = true;
    paramContext.vsC = true;
    paramContext.vsK = true;
    paramContext.vsM = true;
    paramContext.vsQ = 1;
    paramContext.vsG = true;
    paramContext.vsI = false;
    paramContext.vsS = true;
    paramContext = paramContext.m(paramTextView);
    paramContext.vsH = true;
    paramContext.vsJ = true;
    if (paramObject != null)
      paramContext.vsT = paramObject;
    paramContext = paramContext.b(paramTextView.getText(), paramInt, paramBoolean);
    AppMethodBeat.o(79828);
    return paramContext;
  }

  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(79827);
    paramContext = new p(paramContext);
    paramContext.vsF = true;
    paramContext.vsC = true;
    paramContext.vsE = vrY;
    paramContext.vsQ = 1;
    paramContext.vsG = true;
    paramContext.vsI = false;
    paramContext.vsS = false;
    paramContext = paramContext.m(null);
    paramContext.vsT = null;
    paramContext.hcl = null;
    paramContext.vsH = true;
    paramContext.vsJ = true;
    paramContext = paramContext.b(paramCharSequence, paramInt, true);
    AppMethodBeat.o(79827);
    return paramContext;
  }

  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt1, int paramInt2, Object paramObject, String paramString)
  {
    AppMethodBeat.i(79826);
    paramContext = new p(paramContext);
    paramContext.vsF = true;
    paramContext.vsC = true;
    paramContext.vsE = vrY;
    paramContext.vsQ = paramInt2;
    paramContext.vsG = true;
    paramContext.vsI = false;
    paramContext.vsS = true;
    paramContext = paramContext.m(null);
    paramContext.vsT = paramObject;
    paramContext.hcl = paramString;
    if (paramInt2 == 1)
    {
      paramContext.vsH = true;
      paramContext.vsJ = true;
    }
    while (true)
    {
      paramContext = paramContext.b(paramCharSequence, paramInt1, true);
      AppMethodBeat.o(79826);
      return paramContext;
      if (paramInt2 == 2)
      {
        paramContext.vsH = false;
        paramContext.vsJ = false;
      }
    }
  }

  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(79836);
    paramContext = new p(paramContext);
    paramContext.vsF = true;
    paramContext.vsC = true;
    paramContext.vsE = vrY;
    paramContext.vsQ = paramInt2;
    paramContext.vsG = true;
    paramContext.vsI = false;
    paramContext.vsS = true;
    if (paramInt2 == 1)
    {
      paramContext.vsH = true;
      paramContext.vsJ = true;
    }
    while (true)
    {
      paramContext = paramContext.b(paramCharSequence, paramInt1, true);
      AppMethodBeat.o(79836);
      return paramContext;
      if (paramInt2 == 2)
      {
        paramContext.vsH = false;
        paramContext.vsJ = false;
        paramContext.vsO = paramBoolean;
      }
    }
  }

  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(79839);
    paramContext = a(paramContext, paramCharSequence, paramInt, paramObject, false);
    AppMethodBeat.o(79839);
    return paramContext;
  }

  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt, Object paramObject, boolean paramBoolean)
  {
    AppMethodBeat.i(79840);
    paramContext = new p(paramContext);
    paramContext.vsF = true;
    paramContext.vsC = true;
    paramContext.vsE = vrY;
    paramContext.vsM = true;
    paramContext.vsQ = 1;
    paramContext.vsG = true;
    paramContext.vsI = false;
    paramContext.vsS = true;
    paramContext.vsT = paramObject;
    paramContext.vsP = paramBoolean;
    paramContext.vsH = true;
    paramContext.vsJ = true;
    paramContext = paramContext.b(paramCharSequence, paramInt, false);
    AppMethodBeat.o(79840);
    return paramContext;
  }

  private static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(79835);
    paramContext = new p(paramContext);
    paramContext.vsG = false;
    paramContext.vsH = false;
    paramContext.vsC = false;
    paramContext.vsI = false;
    paramContext.vsF = false;
    paramContext.vsS = false;
    paramContext = paramContext.b(paramCharSequence, paramInt, paramBoolean);
    d(paramContext);
    AppMethodBeat.o(79835);
    return paramContext;
  }

  public static SpannableString a(Context paramContext, CharSequence paramCharSequence, int paramInt, boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(79821);
    paramContext = new p(paramContext);
    paramContext.vsF = true;
    paramContext.vsC = true;
    paramContext.vsK = true;
    paramContext.vsM = true;
    paramContext.vsQ = 1;
    paramContext.vsG = true;
    paramContext.vsI = false;
    paramContext.vsS = true;
    paramContext = paramContext.m(null);
    paramContext.vsH = true;
    paramContext.vsJ = true;
    paramContext.vsT = paramObject;
    paramContext = paramContext.b(paramCharSequence, paramInt, paramBoolean);
    AppMethodBeat.o(79821);
    return paramContext;
  }

  public static SpannableString a(TextView paramTextView, Object paramObject)
  {
    AppMethodBeat.i(79822);
    paramTextView = a(paramTextView, true, paramObject);
    AppMethodBeat.o(79822);
    return paramTextView;
  }

  public static SpannableString a(TextView paramTextView, boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(79823);
    if (paramTextView == null)
    {
      ab.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
      paramTextView = new SpannableString("");
      AppMethodBeat.o(79823);
    }
    while (true)
    {
      return paramTextView;
      paramTextView = a(paramTextView.getContext(), paramTextView, (int)paramTextView.getTextSize(), paramBoolean, paramObject);
      AppMethodBeat.o(79823);
    }
  }

  public static void a(g paramg)
  {
    AppMethodBeat.i(79819);
    vrX.add(paramg);
    AppMethodBeat.o(79819);
  }

  public static String ajP(String paramString)
  {
    AppMethodBeat.i(79844);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(79844);
    while (true)
    {
      return paramString;
      p localp = new p(ah.getContext());
      localp.vsF = false;
      localp.vsC = true;
      localp.vsK = true;
      localp.vsL = true;
      localp.vsM = true;
      localp.vsQ = 1;
      localp.vsG = false;
      localp.vsI = false;
      localp.vsH = false;
      localp.vsJ = false;
      localp.vsN = false;
      localp.vsS = false;
      paramString = localp.b(paramString, 0, false).toString();
      AppMethodBeat.o(79844);
    }
  }

  public static SpannableString b(Context paramContext, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79834);
    paramContext = a(paramContext, paramCharSequence, 0, true);
    AppMethodBeat.o(79834);
    return paramContext;
  }

  public static SpannableString b(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(79830);
    paramContext = a(paramContext, paramCharSequence, (int)paramFloat, true);
    AppMethodBeat.o(79830);
    return paramContext;
  }

  public static SpannableString b(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(79829);
    paramContext = a(paramContext, paramCharSequence, paramInt, true);
    AppMethodBeat.o(79829);
    return paramContext;
  }

  private static SpannableString b(Context paramContext, CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(79843);
    paramContext = new p(paramContext);
    paramContext.vsF = false;
    paramContext.vsC = true;
    paramContext.vsK = true;
    paramContext.vsL = paramBoolean;
    paramContext.vsM = true;
    paramContext.vsQ = 1;
    paramContext.vsG = false;
    paramContext.vsI = false;
    paramContext.vsH = false;
    paramContext.vsJ = false;
    paramContext.vsS = false;
    paramContext = paramContext.b(paramCharSequence, paramInt, true);
    AppMethodBeat.o(79843);
    return paramContext;
  }

  public static SpannableString b(TextView paramTextView, Object paramObject)
  {
    AppMethodBeat.i(79825);
    if (paramTextView == null)
    {
      ab.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
      paramTextView = new SpannableString("");
      AppMethodBeat.o(79825);
    }
    while (true)
    {
      return paramTextView;
      Object localObject = paramTextView.getContext();
      int i = (int)paramTextView.getTextSize();
      localObject = new p((Context)localObject);
      ((p)localObject).vsF = true;
      ((p)localObject).vsC = true;
      ((p)localObject).vsE = vrY;
      ((p)localObject).vsQ = 1;
      ((p)localObject).vsG = true;
      ((p)localObject).vsI = false;
      ((p)localObject).vsS = true;
      localObject = ((p)localObject).m(paramTextView);
      ((p)localObject).vsT = paramObject;
      ((p)localObject).hcl = null;
      ((p)localObject).vsH = true;
      ((p)localObject).vsJ = true;
      paramTextView = ((p)localObject).b(paramTextView.getText(), i, true);
      AppMethodBeat.o(79825);
    }
  }

  public static void b(g paramg)
  {
    AppMethodBeat.i(79820);
    vrX.remove(paramg);
    AppMethodBeat.o(79820);
  }

  public static SpannableString c(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(79832);
    paramContext = new p(paramContext);
    paramContext.vsG = false;
    paramContext.vsH = false;
    paramContext.vsC = false;
    paramContext.vsI = false;
    paramContext.vsQ = paramInt;
    paramContext.vsF = false;
    paramContext.vsS = false;
    paramContext = paramContext.b(paramCharSequence, 0, true);
    d(paramContext);
    AppMethodBeat.o(79832);
    return paramContext;
  }

  public static CharSequence c(Context paramContext, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79847);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    localSpannableStringBuilder.append(paramCharSequence);
    int i = paramCharSequence.length();
    localSpannableStringBuilder.append(" ");
    paramContext = paramContext.getResources().getDrawable(2131231779);
    paramContext.setBounds(0, 0, paramContext.getIntrinsicWidth(), paramContext.getIntrinsicHeight());
    localSpannableStringBuilder.setSpan(new a(paramContext), i, i + 1, 18);
    AppMethodBeat.o(79847);
    return localSpannableStringBuilder;
  }

  public static void clearCache()
  {
    AppMethodBeat.i(79845);
    ab.i("MicroMsg.MMSpanManager", "clear MMSpanManager cache");
    p.clearCache();
    AppMethodBeat.o(79845);
  }

  public static SpannableString d(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(79831);
    paramContext = a(paramContext, paramCharSequence, (int)paramFloat, false);
    AppMethodBeat.o(79831);
    return paramContext;
  }

  public static SpannableString d(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(79837);
    paramContext = a(paramContext, paramCharSequence, paramInt, 1, false);
    AppMethodBeat.o(79837);
    return paramContext;
  }

  private static void d(Spannable paramSpannable)
  {
    int i = 0;
    AppMethodBeat.i(79833);
    ClickableSpan[] arrayOfClickableSpan = (ClickableSpan[])paramSpannable.getSpans(0, paramSpannable.length(), ClickableSpan.class);
    while (i < arrayOfClickableSpan.length)
    {
      paramSpannable.removeSpan(arrayOfClickableSpan[i]);
      i++;
    }
    AppMethodBeat.o(79833);
  }

  public static SpannableString e(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(79842);
    paramContext = b(paramContext, paramCharSequence, (int)paramFloat, false);
    AppMethodBeat.o(79842);
    return paramContext;
  }

  public static SpannableString e(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(79838);
    paramContext = new p(paramContext);
    paramContext.vsF = true;
    paramContext.vsC = true;
    paramContext.vsE = vrY;
    paramContext.vsM = true;
    paramContext.vsQ = 1;
    paramContext.vsG = true;
    paramContext.vsI = false;
    paramContext.vsS = true;
    paramContext.vsT = null;
    paramContext.vsH = true;
    paramContext.vsJ = true;
    paramContext = paramContext.b(paramCharSequence, paramInt, true);
    AppMethodBeat.o(79838);
    return paramContext;
  }

  public static SpannableString f(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(79841);
    paramContext = b(paramContext, paramCharSequence, paramInt, true);
    AppMethodBeat.o(79841);
    return paramContext;
  }

  public static SpannableString g(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(79848);
    paramContext = new p(paramContext);
    paramContext.vsF = false;
    paramContext.vsC = true;
    paramContext.vsD = false;
    paramContext.vsK = false;
    paramContext.vsL = false;
    paramContext.vsM = false;
    paramContext.vsQ = 1;
    paramContext.vsG = false;
    paramContext.vsI = false;
    paramContext.vsH = false;
    paramContext.vsJ = false;
    paramContext.vsS = true;
    paramContext = paramContext.b(paramCharSequence, paramInt, true);
    AppMethodBeat.o(79848);
    return paramContext;
  }

  public static SpannableString h(TextView paramTextView, int paramInt)
  {
    AppMethodBeat.i(79824);
    if (paramTextView == null)
    {
      ab.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
      paramTextView = new SpannableString("");
      AppMethodBeat.o(79824);
      return paramTextView;
    }
    Object localObject = paramTextView.getContext();
    int i = (int)paramTextView.getTextSize();
    localObject = new p((Context)localObject);
    ((p)localObject).vsF = true;
    ((p)localObject).vsC = true;
    ((p)localObject).vsE = vrY;
    ((p)localObject).vsQ = paramInt;
    ((p)localObject).vsG = true;
    ((p)localObject).vsI = false;
    ((p)localObject).vsS = true;
    localObject = ((p)localObject).m(paramTextView);
    if (paramInt == 1)
    {
      ((p)localObject).vsH = true;
      ((p)localObject).vsJ = true;
    }
    while (true)
    {
      paramTextView = ((p)localObject).b(paramTextView.getText(), i, true);
      AppMethodBeat.o(79824);
      break;
      if (paramInt == 2)
      {
        ((p)localObject).vsH = false;
        ((p)localObject).vsJ = false;
      }
    }
  }

  public static SpannableString l(TextView paramTextView)
  {
    AppMethodBeat.i(79846);
    if (paramTextView == null)
    {
      ab.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
      paramTextView = new SpannableString("");
      AppMethodBeat.o(79846);
    }
    while (true)
    {
      return paramTextView;
      Object localObject = paramTextView.getContext();
      int i = (int)paramTextView.getTextSize();
      localObject = new p((Context)localObject);
      ((p)localObject).vsF = false;
      ((p)localObject).vsC = false;
      ((p)localObject).vsE = false;
      ((p)localObject).vsG = false;
      ((p)localObject).vsI = false;
      ((p)localObject).vsS = true;
      localObject = ((p)localObject).m(paramTextView);
      ((p)localObject).vsH = false;
      ((p)localObject).vsJ = false;
      paramTextView = ((p)localObject).b(paramTextView.getText(), i, false);
      AppMethodBeat.o(79846);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.j
 * JD-Core Version:    0.6.2
 */