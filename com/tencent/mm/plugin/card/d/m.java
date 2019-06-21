package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public final class m
{
  public static String Hu(String paramString)
  {
    AppMethodBeat.i(88932);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CardViewUtil", "toApply is null");
      paramString = "";
      AppMethodBeat.o(88932);
    }
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < paramString.length(); i++)
      {
        localStringBuilder.append(paramString.charAt(i));
        if ((i + 1) % 4 == 0)
          localStringBuilder.append(" ");
      }
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(88932);
    }
  }

  public static void a(final Context paramContext, ImageView paramImageView, String paramString, int paramInt1, final int paramInt2)
  {
    AppMethodBeat.i(88934);
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString)))
      AppMethodBeat.o(88934);
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(paramString))
      {
        Object localObject = new c.a();
        ((c.a)localObject).ePK = e.eSn;
        o.ahq();
        ((c.a)localObject).ePY = null;
        ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(paramString);
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).eQf = false;
        ((c.a)localObject).ePF = true;
        ((c.a)localObject).ePO = paramInt1;
        ((c.a)localObject).ePN = paramInt1;
        ((c.a)localObject).ePT = 2130838129;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(paramString, paramImageView, (c)localObject, new g()
        {
          public final Bitmap a(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.at.a.d.b paramAnonymousb)
          {
            return null;
          }

          public final void b(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.at.a.d.b paramAnonymousb)
          {
            AppMethodBeat.i(88927);
            if (paramAnonymousb.bitmap != null)
            {
              al.d(new m.1.1(this, paramAnonymousb.bitmap));
              AppMethodBeat.o(88927);
            }
            while (true)
            {
              return;
              m.a(this.krP, this.krQ, paramInt2);
              AppMethodBeat.o(88927);
            }
          }

          public final void sH(String paramAnonymousString)
          {
          }
        });
        AppMethodBeat.o(88934);
      }
      else
      {
        a(paramImageView, 2130838129, paramInt2);
        AppMethodBeat.o(88934);
      }
    }
  }

  public static void a(View paramView, LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(88939);
    paramView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    paramLinearLayout.addView(paramView);
    AppMethodBeat.o(88939);
  }

  public static void a(ImageView paramImageView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(88935);
    al.d(new m.2(paramImageView, paramInt1, paramInt2));
    AppMethodBeat.o(88935);
  }

  public static void a(ImageView paramImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(88933);
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString)))
      AppMethodBeat.o(88933);
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(paramString))
      {
        Object localObject = new c.a();
        ((c.a)localObject).ePK = e.eSn;
        o.ahq();
        ((c.a)localObject).ePY = null;
        ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(paramString);
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).eQf = paramBoolean;
        ((c.a)localObject).ePF = true;
        ((c.a)localObject).ePO = paramInt1;
        ((c.a)localObject).ePN = paramInt1;
        ((c.a)localObject).ePT = paramInt2;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(paramString, paramImageView, (c)localObject);
        AppMethodBeat.o(88933);
      }
      else
      {
        paramImageView.setImageResource(paramInt2);
        AppMethodBeat.o(88933);
      }
    }
  }

  public static void a(MMActivity paramMMActivity, com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88936);
    paramMMActivity.xE(l.Hn(paramb.aZV().color));
    AppMethodBeat.o(88936);
  }

  public static void c(TextView paramTextView, int paramInt)
  {
    AppMethodBeat.i(88938);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(88938);
      while (true)
      {
        return;
        paramTextView.setText(2131297995);
        AppMethodBeat.o(88938);
        continue;
        paramTextView.setText(2131297990);
        AppMethodBeat.o(88938);
        continue;
        paramTextView.setText(2131297993);
        AppMethodBeat.o(88938);
        continue;
        paramTextView.setText(2131297992);
        AppMethodBeat.o(88938);
        continue;
        paramTextView.setText(2131297996);
        AppMethodBeat.o(88938);
        continue;
        paramTextView.setText(2131297997);
        AppMethodBeat.o(88938);
        continue;
        paramTextView.setText(2131297991);
        AppMethodBeat.o(88938);
      }
      paramTextView.setText(2131297994);
    }
  }

  public static void d(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(88937);
    paramMMActivity.xE(paramMMActivity.getResources().getColor(2131690691));
    AppMethodBeat.o(88937);
  }

  public static Rect dc(View paramView)
  {
    AppMethodBeat.i(88930);
    Rect localRect = new Rect();
    localRect.left = paramView.getPaddingLeft();
    localRect.right = paramView.getPaddingRight();
    localRect.top = paramView.getPaddingTop();
    localRect.bottom = paramView.getPaddingBottom();
    AppMethodBeat.o(88930);
    return localRect;
  }

  public static void k(View paramView, Rect paramRect)
  {
    AppMethodBeat.i(88931);
    paramView.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    AppMethodBeat.o(88931);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.m
 * JD-Core Version:    0.6.2
 */