package com.tencent.mm.plugin.fts.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.d.c;
import com.tencent.mm.plugin.fts.a.d.c.a;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class m
{
  public static int a(JSONObject paramJSONObject, String paramString, Context paramContext)
  {
    AppMethodBeat.i(61964);
    int i;
    int j;
    if (paramJSONObject == null)
    {
      i = 0;
      j = i;
      if (i == 0)
      {
        if (!paramString.equals(paramContext.getString(2131302836)))
          break label52;
        j = 2;
      }
    }
    while (true)
    {
      AppMethodBeat.o(61964);
      return j;
      i = paramJSONObject.optInt("businessType");
      break;
      label52: if (paramString.equals(paramContext.getString(2131302840)))
      {
        j = 8;
      }
      else if (paramString.equals(paramContext.getString(2131302837)))
      {
        j = 1;
      }
      else
      {
        ab.i("MicroMsg.FTS.FTSUIApiLogic", "option " + paramString + " no type");
        j = i;
      }
    }
  }

  public static CharSequence a(Context paramContext, List<com.tencent.mm.plugin.fts.a.a.f> paramList, String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.g paramg, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(61961);
    Arrays.sort(paramArrayOfString, new m.1((n)com.tencent.mm.kernel.g.M(n.class)));
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i = 0;
    Object localObject1;
    Object localObject2;
    if (i < paramList.size())
    {
      localObject1 = (com.tencent.mm.plugin.fts.a.a.f)paramList.get(i);
      ad localad;
      String str;
      if (((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDS < paramArrayOfString.length)
      {
        localObject2 = paramArrayOfString[localObject1.mDS];
        if (!bo.isNullOrNil((String)localObject2))
        {
          localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject2);
          if (localad != null)
          {
            str = localad.field_username;
            localObject2 = t.a(localad, str);
            switch (((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDw)
            {
            default:
            case 37:
            case 36:
            case 35:
            case 34:
            case 31:
            case 30:
            case 29:
            case 33:
            case 32:
            }
          }
        }
      }
      while (true)
      {
        if ((!bo.isNullOrNil(((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDU)) && (((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDU.contains(paramg.mDY)))
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDW += 10;
        i++;
        break;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDU = com.tencent.mm.plugin.fts.a.d.eu(str, localad.Hq());
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDV = ((String)localObject2);
        continue;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDX = true;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDA = true;
        ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDU = localad.field_nickname;
        if (!localad.field_nickname.equals(localObject2))
        {
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDV = ((String)localObject2);
          continue;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDX = true;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDA = true;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDU = ((String)localObject2);
          continue;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDU = ((com.tencent.mm.plugin.fts.a.a.f)localObject1).content;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDV = ((String)localObject2);
          continue;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDU = localad.dul;
          ((com.tencent.mm.plugin.fts.a.a.f)localObject1).mDV = ((String)localObject2);
        }
      }
    }
    Collections.sort(paramList, new m.2());
    i = 0;
    float f = 0.0F;
    while ((i < paramList.size()) && (i < paramg.mEa.length))
    {
      f = b.a.mHq - 100 - f;
      if (f <= 100.0F)
        break;
      localObject2 = (com.tencent.mm.plugin.fts.a.a.f)paramList.get(i);
      paramArrayOfString = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, ((com.tencent.mm.plugin.fts.a.a.f)localObject2).mDU, paramTextPaint.getTextSize());
      if (localSpannableStringBuilder.length() > 0)
        localSpannableStringBuilder.append(", ");
      localObject1 = new com.tencent.mm.plugin.fts.a.a.d();
      ((com.tencent.mm.plugin.fts.a.a.d)localObject1).mDy = paramArrayOfString;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject1).mDz = paramg;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject1).mDA = ((com.tencent.mm.plugin.fts.a.a.f)localObject2).mDA;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject1).mDC = ((com.tencent.mm.plugin.fts.a.a.f)localObject2).mDX;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject1).mDF = f;
      ((com.tencent.mm.plugin.fts.a.a.d)localObject1).eNN = paramTextPaint;
      if (!bo.isNullOrNil(((com.tencent.mm.plugin.fts.a.a.f)localObject2).mDV))
      {
        ((com.tencent.mm.plugin.fts.a.a.d)localObject1).mDG = TextUtils.concat(new CharSequence[] { com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, ((com.tencent.mm.plugin.fts.a.a.f)localObject2).mDV, paramTextPaint.getTextSize()), "(" });
        ((com.tencent.mm.plugin.fts.a.a.d)localObject1).mDH = ")";
      }
      localSpannableStringBuilder.append(com.tencent.mm.plugin.fts.a.f.a((com.tencent.mm.plugin.fts.a.a.d)localObject1).mDR);
      f = paramTextPaint.measureText(localSpannableStringBuilder.toString());
      i++;
    }
    AppMethodBeat.o(61961);
    return localSpannableStringBuilder;
  }

  public static void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(61958);
    a(paramContext, paramImageView, paramString1, paramString2, paramInt, true, 0, 0);
    AppMethodBeat.o(61958);
  }

  public static void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(61959);
    ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSImageLoader().a(paramImageView, paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
    if ((!bo.isNullOrNil(paramString1)) || (!bo.isNullOrNil(paramString2)))
    {
      Bitmap localBitmap = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSImageLoader().a(paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        c.a.a(paramContext.getResources(), localBitmap, paramImageView);
        paramImageView.setVisibility(0);
        AppMethodBeat.o(61959);
      }
    }
    while (true)
    {
      return;
      if (paramInt1 > 0)
        paramImageView.setImageResource(paramInt1);
      while (true)
      {
        ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSImageLoader().a(paramContext, paramImageView, paramString1, paramString2, paramBoolean, paramInt2, paramInt3);
        break;
        paramImageView.setImageResource(2131690597);
      }
      if ((paramInt1 > 0) && ((!bo.isNullOrNil(paramString1)) || (!bo.isNullOrNil(paramString2))))
      {
        paramImageView.setImageResource(paramInt1);
        AppMethodBeat.o(61959);
      }
      else
      {
        paramImageView.setVisibility(8);
        AppMethodBeat.o(61959);
      }
    }
  }

  public static boolean a(CharSequence paramCharSequence, TextView paramTextView)
  {
    boolean bool = false;
    AppMethodBeat.i(61956);
    if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
    {
      paramTextView.setText(paramCharSequence, TextView.BufferType.SPANNABLE);
      paramTextView.setVisibility(0);
      bool = true;
      AppMethodBeat.o(61956);
    }
    while (true)
    {
      return bool;
      paramTextView.setVisibility(8);
      AppMethodBeat.o(61956);
    }
  }

  public static boolean b(String paramString, TextView paramTextView)
  {
    boolean bool = false;
    AppMethodBeat.i(61957);
    if ((paramString != null) && (paramString.length() != 0))
    {
      paramTextView.setText(paramString);
      paramTextView.setVisibility(0);
      bool = true;
      AppMethodBeat.o(61957);
    }
    while (true)
    {
      return bool;
      paramTextView.setVisibility(8);
      AppMethodBeat.o(61957);
    }
  }

  public static final void p(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(61962);
    if (paramBoolean)
    {
      paramView.setBackgroundResource(2130838396);
      AppMethodBeat.o(61962);
    }
    while (true)
    {
      return;
      paramView.setBackgroundResource(2130838398);
      AppMethodBeat.o(61962);
    }
  }

  public static final void q(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(61963);
    if (paramBoolean)
    {
      paramView.setBackgroundResource(2130839162);
      AppMethodBeat.o(61963);
    }
    while (true)
    {
      return;
      paramView.setBackgroundResource(2130839563);
      AppMethodBeat.o(61963);
    }
  }

  public static String wf(int paramInt)
  {
    AppMethodBeat.i(61960);
    int i = 0;
    int j = i;
    String str;
    switch (paramInt)
    {
    default:
      j = i;
    case -14:
    case -12:
    case -10:
    case -9:
      if (j == 0)
      {
        str = null;
        AppMethodBeat.o(61960);
      }
      break;
    case -8:
    case -1:
    case -2:
    case -3:
    case -4:
    case -5:
    case -6:
    case -7:
    case -11:
    case -13:
    case -15:
    }
    while (true)
    {
      return str;
      j = 2131300122;
      break;
      j = 2131300109;
      break;
      j = 2131300113;
      break;
      j = 2131300105;
      break;
      j = 2131300106;
      break;
      j = 2131300112;
      break;
      j = 2131300110;
      break;
      j = 2131300111;
      break;
      j = 2131300115;
      break;
      j = 2131300123;
      break;
      j = 2131300114;
      break;
      str = ah.getContext().getString(j);
      AppMethodBeat.o(61960);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.m
 * JD-Core Version:    0.6.2
 */