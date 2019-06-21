package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.plugin.sns.ui.AsyncNormalTextView;
import com.tencent.mm.plugin.sns.ui.AsyncTextView;
import com.tencent.mm.plugin.sns.ui.MaskTextView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.SnsTranslateResultView;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.TranslateCommentTextView;
import com.tencent.mm.plugin.sns.ui.aa;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.plugin.sns.ui.au.b;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.az;
import com.tencent.mm.plugin.sns.ui.bb;
import com.tencent.mm.plugin.sns.ui.l;
import com.tencent.mm.plugin.sns.ui.w;
import com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView;
import com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout;
import com.tencent.mm.plugin.story.api.f;
import com.tencent.mm.plugin.story.api.f.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.pluginsdk.ui.e.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.vending.base.Vending;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class BaseTimeLineItem
{
  public boolean DEBUG = false;
  protected int klY;
  protected Activity mActivity;
  protected com.tencent.mm.plugin.sns.ui.au qPr;
  public ArrayList<ap.b> rHq = new ArrayList();
  protected boolean rps = false;

  private static void a(View paramView, CharSequence paramCharSequence, int paramInt)
  {
    if ((paramView instanceof SnsCommentCollapseLayout))
      ((SnsCommentCollapseLayout)paramView).k(paramCharSequence, paramInt);
    while (true)
    {
      return;
      if ((paramView instanceof TextView))
        ((TextView)paramView).setText(paramCharSequence);
    }
  }

  public static void a(ap.b paramb, BaseViewHolder paramBaseViewHolder, String paramString1, String paramString2)
  {
    if ((paramBaseViewHolder != null) && (paramBaseViewHolder.rHA != null))
    {
      paramBaseViewHolder.rHA.a(paramb, 1, paramString1, paramString2, paramb.qMU);
      paramBaseViewHolder.rHA.setVisibility(0);
    }
  }

  private static void a(BaseViewHolder paramBaseViewHolder, com.tencent.mm.plugin.sns.storage.n paramn)
  {
    if (paramn.DI(32))
    {
      if (paramBaseViewHolder.rHz != null)
        paramBaseViewHolder.rHz.setVisibility(0);
      paramBaseViewHolder.rHB.setLongClickable(false);
      paramBaseViewHolder.rHB.setOnClickListener(null);
      paramn = new LinearLayout.LayoutParams(-1, -2);
      paramBaseViewHolder.rHB.setLayoutParams(paramn);
      paramBaseViewHolder.rHB.setBackgroundColor(Color.parseColor("#00ffffff"));
      if (paramBaseViewHolder.rHT != null)
      {
        paramn = (LinearLayout.LayoutParams)paramBaseViewHolder.rHT.getLayoutParams();
        paramn.leftMargin = 0;
        paramn.rightMargin = 0;
        paramBaseViewHolder.rHT.setLayoutParams(paramn);
      }
      if (paramBaseViewHolder.rIr)
      {
        paramn = (LinearLayout.LayoutParams)paramBaseViewHolder.rGD.rns.getLayoutParams();
        paramn.leftMargin = 0;
        paramn.rightMargin = 0;
        paramBaseViewHolder.rGD.rns.setLayoutParams(paramn);
      }
    }
    while (true)
    {
      return;
      if (paramBaseViewHolder.rHz != null)
        paramBaseViewHolder.rHz.setVisibility(0);
      paramBaseViewHolder.rHB.setLongClickable(false);
      paramBaseViewHolder.rHB.setOnClickListener(null);
      if (paramBaseViewHolder.rHT != null)
      {
        paramn = (LinearLayout.LayoutParams)paramBaseViewHolder.rHT.getLayoutParams();
        paramn.leftMargin = 0;
        paramn.rightMargin = 0;
        paramBaseViewHolder.rHT.setLayoutParams(paramn);
      }
      if (paramBaseViewHolder.rIr)
      {
        paramn = (LinearLayout.LayoutParams)paramBaseViewHolder.rGD.rns.getLayoutParams();
        paramn.leftMargin = 0;
        paramn.rightMargin = 0;
        paramBaseViewHolder.rGD.rns.setLayoutParams(paramn);
      }
      paramn = new LinearLayout.LayoutParams(-1, -2);
      paramBaseViewHolder.rHB.setLayoutParams(paramn);
      paramBaseViewHolder.rHB.setBackgroundColor(Color.parseColor("#00ffffff"));
    }
  }

  private boolean a(MaskTextView paramMaskTextView, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, int paramInt)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(" ");
    int i = localSpannableStringBuilder.length() - 1;
    StringBuffer localStringBuffer = new StringBuffer();
    int[] arrayOfInt1 = new int[paramb.size()];
    int[] arrayOfInt2 = new int[paramb.size()];
    int j = 1;
    int k = 0;
    Object localObject1;
    Object localObject2;
    try
    {
      if (k < paramb.size())
      {
        localObject1 = (String)((com.tencent.mm.vending.j.a)paramb.get(k)).get(1);
        if (j != 0)
        {
          localSpannableStringBuilder.append(" ");
          localStringBuffer.append(" ");
          j = 0;
        }
        while (true)
        {
          arrayOfInt1[k] = localSpannableStringBuilder.length();
          arrayOfInt1[k] += ((String)localObject1).length();
          localStringBuffer.append((String)localObject1);
          localSpannableStringBuilder.append(j.b(this.mActivity, (CharSequence)localObject1, paramMaskTextView.getTextSize()));
          if ((com.tencent.mm.plugin.sns.e.a.Xt((String)((com.tencent.mm.vending.j.a)paramb.get(k)).get(0))) && (((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryBasicConfig().a(f.a.rQB)) && (com.tencent.mm.plugin.story.api.n.isShowStoryCheck()))
          {
            localSpannableStringBuilder.append("  ");
            localObject2 = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().ls(true);
            localObject1 = new com/tencent/mm/plugin/sns/ui/widget/g;
            ((com.tencent.mm.plugin.sns.ui.widget.g)localObject1).<init>((Drawable)localObject2);
            localSpannableStringBuilder.setSpan(localObject1, localSpannableStringBuilder.length() - 1, localSpannableStringBuilder.length(), 17);
          }
          k++;
          break;
          localSpannableStringBuilder.append(", ");
          localStringBuffer.append(", ");
        }
      }
    }
    catch (Exception paramMaskTextView)
    {
      ab.e("MicroMsg.BaseTimeLineItem", "setLikedList  e:%s", new Object[] { bo.l(paramMaskTextView) });
    }
    while (true)
    {
      return true;
      localObject1 = this.mActivity.getResources();
      if (paramInt == 10)
      {
        k = 2130839006;
        localObject2 = ((Resources)localObject1).getDrawable(k);
        ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getIntrinsicWidth(), ((Drawable)localObject2).getIntrinsicHeight());
        localObject1 = new com/tencent/mm/ui/widget/a;
        ((com.tencent.mm.ui.widget.a)localObject1).<init>((Drawable)localObject2);
        ((com.tencent.mm.ui.widget.a)localObject1).zLT = ((int)((((Drawable)localObject2).getIntrinsicHeight() - paramMaskTextView.getTextSize() + com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 2)) / 2.0F));
        localSpannableStringBuilder.setSpan(localObject1, i, i + 1, 33);
        if (paramInt != 10)
          break label517;
      }
      label517: for (paramInt = 3; ; paramInt = 2)
      {
        for (k = 0; k < arrayOfInt1.length; k++)
        {
          localObject2 = (String)((com.tencent.mm.vending.j.a)paramb.get(k)).get(0);
          localObject1 = new com/tencent/mm/pluginsdk/ui/e/o;
          BaseTimeLineItem.5 local5 = new com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$5;
          local5.<init>(this);
          ((o)localObject1).<init>(localObject2, local5, paramInt);
          localSpannableStringBuilder.setSpan(localObject1, arrayOfInt1[k], arrayOfInt2[k], 33);
        }
        k = 2130839705;
        break;
      }
      paramMaskTextView.setText(localSpannableStringBuilder, TextView.BufferType.SPANNABLE);
      paramMaskTextView.setOriginText(localStringBuffer.toString());
    }
  }

  private boolean a(List<cat> paramList, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, BaseViewHolder paramBaseViewHolder)
  {
    LinearLayout localLinearLayout = paramBaseViewHolder.rHP;
    int i = localLinearLayout.getChildCount();
    int j = paramb.size();
    int k;
    if (i > j)
      for (k = j; k < i; k++)
      {
        localObject1 = localLinearLayout.getChildAt(j);
        localLinearLayout.removeViewAt(j);
        if ((localObject1 instanceof SnsCommentCollapseLayout))
          this.qPr.a((SnsCommentCollapseLayout)localObject1);
      }
    boolean bool;
    if (paramb.size() == 0)
    {
      localLinearLayout.setVisibility(8);
      bool = false;
      return bool;
    }
    localLinearLayout.setVisibility(0);
    Object localObject1 = this.qPr.cuc();
    if ((localObject1 instanceof com.tencent.mm.plugin.sns.ui.a.a));
    for (av localav = (av)((com.tencent.mm.plugin.sns.ui.a.a)localObject1).rEB.get(paramBaseViewHolder.position); ; localav = null)
    {
      if (this.DEBUG)
        ab.d("MicroMsg.BaseTimeLineItem", "debug:setCommentList position " + paramBaseViewHolder.position + " commentCount: " + j);
      int m = 0;
      j = 0;
      Object localObject2;
      ap.b localb;
      label429: int n;
      Object localObject3;
      TranslateCommentTextView localTranslateCommentTextView;
      label604: String str4;
      label646: String str5;
      if (j < paramb.size())
      {
        localObject1 = (com.tencent.mm.vending.j.a)paramb.get(j);
        long l = ((Long)((com.tencent.mm.vending.j.a)localObject1).get(0)).longValue();
        String str1 = (String)((com.tencent.mm.vending.j.a)localObject1).get(1);
        String str2 = (String)((com.tencent.mm.vending.j.a)localObject1).get(2);
        String str3 = (String)((com.tencent.mm.vending.j.a)localObject1).get(3);
        localObject2 = (CharSequence)((com.tencent.mm.vending.j.a)localObject1).get(4);
        cat localcat = (cat)paramList.get(j);
        k = localcat.wZL;
        localb = aq(paramBaseViewHolder.cFc, l);
        if ((localb != null) && (localb.aAR))
          ap.da(localb.id, 2);
        if (m >= i)
          if ((localb == null) || (localb.aAR))
          {
            localObject1 = this.qPr.ctY();
            ((SnsCommentCollapseLayout)localObject1).setTextSize$255e752(15.0F * com.tencent.mm.bz.a.dm(((View)localObject1).getContext()));
            if (this.qPr.rxT == -1)
              this.qPr.rxT = this.mActivity.getResources().getColor(2131690474);
            ((SnsCommentCollapseLayout)localObject1).setTextColor(this.qPr.rxT);
            ((SnsCommentCollapseLayout)localObject1).setGravity(16);
            n = 1;
            localObject3 = localObject1;
          }
        while (true)
          if (localb != null)
          {
            localObject1 = localObject3;
            if (!(localObject3 instanceof TranslateCommentTextView))
            {
              localLinearLayout.removeView((View)localObject3);
              localObject1 = new TranslateCommentTextView(this.mActivity);
              localLinearLayout.addView((View)localObject1, m);
              ((TranslateCommentTextView)localObject1).getTranslateResultView().setResultTextSize$255e752(15.0F * com.tencent.mm.bz.a.dm(((View)localObject1).getContext()));
              ((TranslateCommentTextView)localObject1).getOriginCommentTextView().setTextSize(1, 15.0F * com.tencent.mm.bz.a.dm(((View)localObject1).getContext()));
            }
            localTranslateCommentTextView = (TranslateCommentTextView)localObject1;
            ((View)localObject1).setOnTouchListener(null);
            a(localTranslateCommentTextView.getOriginCommentTextView(), (CharSequence)localObject2, k);
            if (!localb.foa)
            {
              localTranslateCommentTextView.rDZ.setTextSize(1, 15.0F * com.tencent.mm.bz.a.dm(localTranslateCommentTextView.getContext()));
              localTranslateCommentTextView.rrm.El(2);
              localTranslateCommentTextView.rrm.setVisibility(0);
              k = 1;
              ((View)localObject1).setBackgroundResource(2130840303);
              if (m <= 0)
                break label1260;
              if (k == 0)
                break label1234;
              ((View)localObject1).setPadding(0, com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 2), 0, com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 7));
              if (k != 0)
              {
                localObject3 = (TranslateCommentTextView)localObject1;
                k = (int)this.mActivity.getResources().getDimension(2131427858);
                ((TranslateCommentTextView)localObject3).rrm.getSplitlineView().setPadding(0, 0, k, 0);
              }
              ((View)localObject1).setOnLongClickListener(new BaseTimeLineItem.6(this, (View)localObject1));
              ((View)localObject1).setOnClickListener(new com.tencent.mm.plugin.sns.ui.i.a(this.qPr.rxP, localcat, str2, str3, paramBaseViewHolder));
              if (localav != null)
                ((View)localObject1).setTag(new l(localav.riA, localav.rAs, localcat, str1, str3, (View)localObject1, 1));
              if (n != 0)
                localLinearLayout.addView((View)localObject1);
              m++;
              j++;
              break;
              localObject1 = new TranslateCommentTextView(this.mActivity);
              ((TranslateCommentTextView)localObject1).getTranslateResultView().setResultTextSize$255e752(15.0F * com.tencent.mm.bz.a.dm(((View)localObject1).getContext()));
              ((TranslateCommentTextView)localObject1).getOriginCommentTextView().setTextSize(1, 15.0F * com.tencent.mm.bz.a.dm(((View)localObject1).getContext()));
              break label429;
              localObject3 = localLinearLayout.getChildAt(m);
              n = 0;
              continue;
            }
            if (!localb.aAR)
            {
              str4 = localb.result;
              str5 = localb.fwM;
              String str6 = localTranslateCommentTextView.rDZ.getText().toString();
              if (!bo.isNullOrNil(str6))
              {
                localObject3 = str6.split(":");
                if (localObject3.length <= 2)
                  break label1317;
                localObject2 = new String[2];
                localObject2[0] = localObject3[0];
                localObject2[1] = str6.substring(localObject2[0].length() + 1);
                localObject3 = localObject2;
              }
            }
          }
      }
      label1317: 
      while (true)
      {
        if (localObject3.length == 2)
        {
          if (bo.isNullOrNil(str4))
            break label1061;
          localTranslateCommentTextView.rrm.a(localb, 2, localObject3[0] + ": " + str4, str5, localb.qMU);
        }
        while (true)
        {
          localTranslateCommentTextView.rrm.setVisibility(0);
          localTranslateCommentTextView.rDZ.setTextSize(1, 15.0F * com.tencent.mm.bz.a.dm(localTranslateCommentTextView.getContext()));
          k = 1;
          break;
          label1061: localTranslateCommentTextView.rrm.a(localb, 2, null, str5, localb.qMU);
        }
        localTranslateCommentTextView.getTranslateResultView().setVisibility(8);
        k = 1;
        break label604;
        if ((n == 0) && ((localObject3 instanceof TranslateCommentTextView)))
        {
          localLinearLayout.removeView((View)localObject3);
          localObject1 = this.qPr.ctY();
          localLinearLayout.addView((View)localObject1, m);
          ((SnsCommentCollapseLayout)localObject1).setTextSize$255e752(15.0F * com.tencent.mm.bz.a.dm(((View)localObject1).getContext()));
        }
        while (true)
        {
          if ((localObject1 instanceof SnsCommentCollapseLayout))
          {
            ((SnsCommentCollapseLayout)localObject1).setTextSize$255e752(15.0F * com.tencent.mm.bz.a.dm(((View)localObject1).getContext()));
            ((SnsCommentCollapseLayout)localObject1).setOpClickListener(this.qPr.rya);
            ((SnsCommentCollapseLayout)localObject1).setPressTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(this.mActivity));
          }
          a((View)localObject1, (CharSequence)localObject2, k);
          k = 0;
          break label604;
          label1234: ((View)localObject1).setPadding(0, com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 2), 0, com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 3));
          break label646;
          label1260: if (k != 0)
          {
            ((View)localObject1).setPadding(0, 1, 0, com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 7));
            break label646;
          }
          ((View)localObject1).setPadding(0, 1, 0, com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 3));
          break label646;
          bool = true;
          break;
          localObject1 = localObject3;
        }
      }
    }
  }

  private ap.b aq(String paramString, long paramLong)
  {
    if (this.rHq.size() <= 0)
      paramString = null;
    while (true)
    {
      return paramString;
      Iterator localIterator = this.rHq.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          ap.b localb = (ap.b)localIterator.next();
          if ((localb.id != null) && (localb.id.equals(ap.ga(paramString, String.valueOf(paramLong)))))
          {
            paramString = localb;
            break;
          }
        }
      paramString = null;
    }
  }

  private void b(MaskTextView paramMaskTextView, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, int paramInt)
  {
    if (paramb.size() == 0)
      paramMaskTextView.setVisibility(8);
    while (true)
    {
      return;
      paramMaskTextView.setVisibility(0);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(" ");
      int i = localSpannableStringBuilder.length() - 1;
      StringBuffer localStringBuffer = new StringBuffer();
      int[] arrayOfInt1 = new int[paramb.size()];
      int[] arrayOfInt2 = new int[paramb.size()];
      int j = 1;
      int k = 0;
      try
      {
        if (k >= paramb.size())
          break label225;
        localObject1 = (String)((com.tencent.mm.vending.j.a)paramb.get(k)).get(1);
        if (j != 0)
        {
          localSpannableStringBuilder.append(" ");
          localStringBuffer.append(" ");
          j = 0;
        }
        while (true)
        {
          arrayOfInt1[k] = localSpannableStringBuilder.length();
          arrayOfInt1[k] += ((String)localObject1).length();
          localStringBuffer.append((String)localObject1);
          localSpannableStringBuilder.append(j.b(this.mActivity, (CharSequence)localObject1, paramMaskTextView.getTextSize()));
          k++;
          break;
          localSpannableStringBuilder.append(", ");
          localStringBuffer.append(", ");
        }
      }
      catch (Exception paramMaskTextView)
      {
        ab.e("MicroMsg.BaseTimeLineItem", "setReward error  e:%s", new Object[] { bo.l(paramMaskTextView) });
      }
      continue;
      label225: Object localObject1 = this.mActivity.getResources().getDrawable(2131231330);
      ((Drawable)localObject1).setBounds(0, 0, ((Drawable)localObject1).getIntrinsicWidth(), ((Drawable)localObject1).getIntrinsicHeight());
      Object localObject2 = new com/tencent/mm/ui/widget/a;
      ((com.tencent.mm.ui.widget.a)localObject2).<init>((Drawable)localObject1);
      ((com.tencent.mm.ui.widget.a)localObject2).zLT = ((int)((((Drawable)localObject1).getIntrinsicHeight() - paramMaskTextView.getTextSize() + com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 2)) / 2.0F));
      localSpannableStringBuilder.setSpan(localObject2, i, i + 1, 33);
      if (paramInt == 10);
      for (paramInt = 3; ; paramInt = 2)
        for (k = 0; k < arrayOfInt1.length; k++)
        {
          localObject1 = (String)((com.tencent.mm.vending.j.a)paramb.get(k)).get(0);
          localObject2 = new com/tencent/mm/pluginsdk/ui/e/o;
          ((o)localObject2).<init>(localObject1, this.qPr.rqd, paramInt);
          localSpannableStringBuilder.setSpan(localObject2, arrayOfInt1[k], arrayOfInt2[k], 33);
        }
      paramMaskTextView.setText(localSpannableStringBuilder, TextView.BufferType.SPANNABLE);
      paramMaskTextView.setOriginText(localStringBuffer.toString());
    }
  }

  public static void e(BaseViewHolder paramBaseViewHolder)
  {
    if ((paramBaseViewHolder != null) && (paramBaseViewHolder.rHA != null))
    {
      paramBaseViewHolder.rHA.El(1);
      paramBaseViewHolder.rHA.setVisibility(0);
    }
  }

  public static void f(BaseViewHolder paramBaseViewHolder)
  {
    if ((paramBaseViewHolder != null) && (paramBaseViewHolder.rHA != null))
      paramBaseViewHolder.rHA.setVisibility(8);
  }

  public final View a(Activity paramActivity, BaseViewHolder paramBaseViewHolder, int paramInt, com.tencent.mm.plugin.sns.ui.au paramau, com.tencent.mm.plugin.sns.storage.n paramn)
  {
    this.mActivity = paramActivity;
    this.klY = paramInt;
    this.qPr = paramau;
    paramBaseViewHolder.cFc = paramn.cqA();
    Object localObject;
    View localView;
    switch (paramInt)
    {
    default:
      localObject = "R.layout.sns_media_sub_item2";
      localView = com.tencent.mm.kiss.a.b.SM().a(this.mActivity, (String)localObject, 2130970820);
      paramBaseViewHolder.rIA = ((String)localObject);
      localObject = localView.findViewById(2131827717);
      if (!(localObject instanceof ViewStub))
        break;
    case 6:
    case 2:
    case 3:
    case 4:
    case 5:
    case 0:
    case 1:
    case 7:
    case 8:
    case 9:
    case 13:
    case 10:
    case 11:
    case 12:
    case 14:
    }
    for (paramBaseViewHolder.rHC = ((ViewStub)localObject); ; paramBaseViewHolder.rHC = null)
    {
      ab.i("MicroMsg.BaseTimeLineItem", "create new item  " + paramInt + "  " + localView.hashCode());
      paramBaseViewHolder.rIt = localView.findViewById(2131827903);
      paramBaseViewHolder.klY = paramInt;
      paramBaseViewHolder.rHv = ((SnsAvatarImageView)localView.findViewById(2131827708));
      paramBaseViewHolder.rHv.setWeakContext(paramActivity);
      paramBaseViewHolder.rHv.setOnClickListener(paramau.qOL.rJI);
      paramBaseViewHolder.rHv.setOnLongClickListener(paramau.qOL.rJJ);
      paramBaseViewHolder.rHv.setOnTouchListener(new BaseTimeLineItem.1(this));
      paramBaseViewHolder.rHw = ((AsyncTextView)localView.findViewById(2131823149));
      paramBaseViewHolder.rHx = ((ImageView)localView.findViewById(2131827711));
      paramBaseViewHolder.rHw.setOnTouchListener(new aa());
      paramBaseViewHolder.rHy = ((ViewGroup)localView.findViewById(2131827904));
      paramBaseViewHolder.rHz = ((AsyncNormalTextView)localView.findViewById(2131827906));
      paramBaseViewHolder.rHz.setOpClickListener(paramau.rxZ);
      paramBaseViewHolder.rHB = ((LinearLayout)localView.findViewById(2131827716));
      paramBaseViewHolder.rHB.setTag(paramBaseViewHolder);
      paramBaseViewHolder.rHB.setOnClickListener(paramau.qOL.rKn);
      localObject = localView.findViewById(2131820991);
      paramau.jMO.c((View)localObject, paramau.qOL.rJK, paramau.qOL.rJH);
      localObject = (TextView)localView.findViewById(2131822812);
      paramau.jMO.c((View)localObject, paramau.qOL.rJK, paramau.qOL.rJH);
      paramBaseViewHolder.rHA = ((SnsTranslateResultView)localView.findViewById(2131827715));
      paramBaseViewHolder.rHA.setVisibility(8);
      paramBaseViewHolder.rHA.getSplitlineView().setPadding(0, 0, (int)this.mActivity.getResources().getDimension(2131427858), 0);
      paramBaseViewHolder.rHA.getResultTextView().setBackgroundResource(2130840255);
      paramau.jMO.c(paramBaseViewHolder.rHA.getResultTextView(), paramau.qOL.rJK, paramau.qOL.rJH);
      paramBaseViewHolder.rHS = ((LinearLayout)localView.findViewById(2131827758));
      paramBaseViewHolder.rHI = ((TextView)localView.findViewById(2131827719));
      paramBaseViewHolder.timeTv = ((TextView)localView.findViewById(2131827720));
      paramBaseViewHolder.rHJ = ((AsyncTextView)localView.findViewById(2131827721));
      paramBaseViewHolder.rHK = ((AsyncTextView)localView.findViewById(2131827722));
      paramBaseViewHolder.rvM = ((TextView)localView.findViewById(2131827718));
      paramBaseViewHolder.qFH = new bb(localView);
      paramBaseViewHolder.qFH.a(paramau.qOL.rJS, paramau.qOL.rKg);
      paramBaseViewHolder.rjj = ((TextView)localView.findViewById(2131827726));
      paramBaseViewHolder.rjj.setText(paramActivity.getString(2131296881));
      paramBaseViewHolder.rjj.setOnClickListener(paramau.qOL.rJM);
      paramBaseViewHolder.rHJ.setOnClickListener(paramau.qOL.rKh);
      paramBaseViewHolder.rHK.setOnClickListener(paramau.qOL.rKi);
      paramBaseViewHolder.rvM.setOnClickListener(paramau.qOL.rKd);
      paramBaseViewHolder.rHL = localView.findViewById(2131827723);
      paramBaseViewHolder.rHL.setOnClickListener(paramau.qOL.rJR);
      paramBaseViewHolder.kPs = ((TextView)localView.findViewById(2131827724));
      paramBaseViewHolder.rHM = ((ImageView)localView.findViewById(2131827709));
      paramBaseViewHolder.rHV = ((ViewStub)localView.findViewById(2131827911));
      paramBaseViewHolder.rgx = ((LinearLayout)localView.findViewById(2131827888));
      paramBaseViewHolder.rIv = ((ViewStub)localView.findViewById(2131827910));
      paramBaseViewHolder.rHX = ((ViewStub)localView.findViewById(2131827913));
      paramBaseViewHolder.rHE = ((TextView)localView.findViewById(2131827908));
      paramBaseViewHolder.rHE.setOnClickListener(paramau.qOL.rJN);
      BaseViewHolder.a(paramBaseViewHolder, (TextView)localView.findViewById(2131827725));
      paramBaseViewHolder.mRR = localView;
      if (this.rps)
      {
        com.tencent.mm.plugin.sns.abtest.c.b(localView, paramBaseViewHolder);
        com.tencent.mm.plugin.sns.abtest.a.a(localView, paramBaseViewHolder);
        af.cnw();
        com.tencent.mm.plugin.sns.g.c.c(localView, paramBaseViewHolder);
      }
      d(paramBaseViewHolder);
      localView.setTag(paramBaseViewHolder);
      a(paramBaseViewHolder, paramn);
      return localView;
      localObject = "R.layout.sns_timeline_item_photo_one3";
      break;
      localObject = "R.layout.sns_timeline_imagesline_one";
      break;
      localObject = "R.layout.sns_timeline_imagesline1";
      break;
      localObject = "R.layout.sns_timeline_imagesline2";
      break;
      localObject = "R.layout.sns_timeline_imagesline3";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sight_item";
      break;
      localObject = "R.layout.sns_ad_card_layout_item";
      break;
      localObject = "R.layout.sns_hb_reward_item";
      break;
      localObject = "R.layout.sns_timeline_turn_media";
      break;
      localObject = "R.layout.sns_media_collapse_item";
      break;
      localObject = "R.layout.sns_timeline_ad_full_card";
      break;
    }
  }

  public final void a(BaseViewHolder paramBaseViewHolder, int paramInt, com.tencent.mm.plugin.sns.storage.n paramn)
  {
    paramn = paramn.cqu();
    a(paramBaseViewHolder, paramInt, (av)this.qPr.cuc().crQ().get(Integer.valueOf(paramInt)), paramn, paramBaseViewHolder.klY, this.qPr);
  }

  public final void a(BaseViewHolder paramBaseViewHolder, int paramInt1, com.tencent.mm.plugin.sns.storage.n paramn, TimeLineObject paramTimeLineObject, int paramInt2, com.tencent.mm.plugin.sns.ui.au paramau)
  {
    av localav = (av)paramau.cuc().crQ().get(Integer.valueOf(paramInt1));
    a(paramBaseViewHolder, paramn);
    this.klY = paramInt2;
    this.qPr = paramau;
    if (this.rps)
      com.tencent.mm.plugin.sns.ui.a.a.F(paramn);
    com.tencent.mm.plugin.sns.ui.a.a.d(paramTimeLineObject);
    if (paramn.DI(32))
      ab.i("MicroMsg.BaseTimeLineItem", "the ad sns id is " + com.tencent.mm.plugin.sns.data.i.jW(paramn.field_snsId) + " for susan");
    paramBaseViewHolder.rHt = localav.rAt;
    paramBaseViewHolder.mVC = false;
    paramBaseViewHolder.position = paramInt1;
    paramBaseViewHolder.cFc = localav.rAs;
    paramBaseViewHolder.cwT = localav.riA;
    paramBaseViewHolder.rHu = localav.rAx;
    paramBaseViewHolder.rHM.setOnClickListener(paramau.rxY);
    paramBaseViewHolder.timeLineObject = paramTimeLineObject;
    Object localObject1 = localav.qBX;
    paramBaseViewHolder.qCX = ((cbf)localObject1);
    Object localObject2 = paramau.rxP.rhn.qMn;
    Object localObject3;
    if (paramn != null)
    {
      localObject3 = paramn.cqU();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSA.add(localObject3);
      if (paramn.DI(32))
        ((com.tencent.mm.plugin.sns.i.b)localObject2).qSF.add(localObject3);
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSG.add(paramn.field_userName);
    }
    Object localObject4;
    label690: label1226: label1523: label1788: label2047: boolean bool;
    switch (paramn.field_type)
    {
    default:
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSL.add(localObject3);
      if (paramInt1 < ((com.tencent.mm.plugin.sns.i.b)localObject2).qSy)
      {
        ((com.tencent.mm.plugin.sns.i.b)localObject2).qSy = paramInt1;
        ((com.tencent.mm.plugin.sns.i.b)localObject2).qRd = com.tencent.mm.plugin.sns.data.i.j(paramn);
      }
      if (paramInt1 > ((com.tencent.mm.plugin.sns.i.b)localObject2).qSz)
      {
        ((com.tencent.mm.plugin.sns.i.b)localObject2).qSz = paramInt1;
        ((com.tencent.mm.plugin.sns.i.b)localObject2).qRe = com.tencent.mm.plugin.sns.data.i.j(paramn);
      }
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRj = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSB.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRk = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSC.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRl = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSD.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRn = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSE.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRm = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSF.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRo = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSJ.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRw = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSK.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).jLU = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSG.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRh = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSH.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRi = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSI.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qRv = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSL.size();
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qQR = ((com.tencent.mm.plugin.sns.i.b)localObject2).qSA.size();
      localObject4 = paramn.cqo();
      localObject3 = localav.igi;
      label774: label1034: label1299: label2325: if (!bo.isNullOrNil((String)localObject3))
      {
        paramBaseViewHolder.rIs = localav.rAr;
        paramBaseViewHolder.rHv.setTag(localObject3);
        if ((localObject4 == null) || (!((com.tencent.mm.plugin.sns.storage.b)localObject4).qVa))
          break label2594;
        paramBaseViewHolder.rHv.setImageResource(2130838444);
        paramBaseViewHolder.rHv.dk((String)localObject3, 4);
        paramBaseViewHolder.rHv.setShowStoryHint(false);
        if (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.b)localObject4).qVc))
        {
          localObject2 = h.gj("adId", ((com.tencent.mm.plugin.sns.storage.b)localObject4).qVc);
          paramBaseViewHolder.rHv.setTag(2131820666, ((com.tencent.mm.plugin.sns.storage.b)localObject4).qVc);
          if (!com.tencent.mm.vfs.e.ct((String)localObject2))
            break;
          localObject2 = d.decodeFile((String)localObject2, null);
          if (localObject2 != null)
            paramBaseViewHolder.rHv.setImageBitmap(d.a((Bitmap)localObject2, true, 0.1F * ((Bitmap)localObject2).getWidth()));
        }
        paramBaseViewHolder.rHw.a((String)localObject3, localav.rAH, new BaseTimeLineItem.3(this, paramau), localav.rgZ, localav.riA, paramInt2, localav.rgZ);
        paramBaseViewHolder.rHv.eSe = localav.riA;
      }
      else
      {
        paramBaseViewHolder.rHx.setVisibility(8);
        if (!localav.rgZ)
          break label2868;
        paramBaseViewHolder.qFG = true;
        paramBaseViewHolder.mVC = localav.rAy;
        if (((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).hasNewStory((String)localObject3))
          localav.rAq = null;
        paramBaseViewHolder.rHz.a(localav.rAu, paramau, localav.rAv, localav);
        paramBaseViewHolder.rHz.setShow(paramBaseViewHolder);
        paramBaseViewHolder.kPs.setOnTouchListener(new aa());
        a(paramBaseViewHolder, paramInt1, localav, paramTimeLineObject, paramInt2, paramau);
        paramau.rxR.put(Integer.valueOf(paramInt1), new WeakReference(paramBaseViewHolder.mRR));
        if (paramBaseViewHolder.mRR.getBackground() == null)
        {
          paramBaseViewHolder.mRR.setBackgroundResource(2130838396);
          paramInt1 = com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12);
          int i = com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 8);
          paramBaseViewHolder.mRR.setPadding(paramInt1, paramInt1, paramInt1, i);
        }
        paramBaseViewHolder.timeTv.setText(localav.rAA);
        paramBaseViewHolder.rHJ.setVisibility(8);
        paramBaseViewHolder.rHK.setVisibility(8);
        if (localav.rgZ)
        {
          localObject2 = localav.rAB;
          paramBaseViewHolder.rHJ.setTag(localav.riA);
          if (localav.rAB.qTF != com.tencent.mm.plugin.sns.storage.a.qTr)
            break label2888;
          if (bo.isNullOrNil(localav.rAE))
            break label2876;
          paramBaseViewHolder.rHJ.setText(localav.rAE);
          paramBaseViewHolder.rHJ.setVisibility(0);
          if ((paramBaseViewHolder.rHJ.getVisibility() != 8) && (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.a)localObject2).qTH)))
          {
            paramBaseViewHolder.rHJ.setTextColor(this.mActivity.getResources().getColor(2131690508));
            paramBaseViewHolder.rHJ.setOnClickListener(null);
          }
          if ((paramn.cqu().xfI.wbL & 0x4) == 0)
            break label3199;
          paramBaseViewHolder.rHK.setTag(paramBaseViewHolder);
          paramBaseViewHolder.rHK.setVisibility(0);
          paramBaseViewHolder.rHK.setText(String.format("%s%s%s", new Object[] { this.mActivity.getResources().getString(2131303566), localav.rAH, this.mActivity.getResources().getString(2131303567) }));
        }
        label1173: if (!localav.rAK)
          break label3211;
        localObject3 = paramau.crP.getString(2131301219, new Object[] { Integer.valueOf(localav.rAL) });
        BaseViewHolder.g(paramBaseViewHolder).setText((CharSequence)localObject3);
        BaseViewHolder.g(paramBaseViewHolder).setVisibility(0);
        paramBaseViewHolder.rvM.setTag(localav.riA);
        if (bo.isNullOrNil(localav.rAN))
          break label3230;
        paramBaseViewHolder.rvM.setVisibility(0);
        paramBaseViewHolder.rvM.setText(localav.rAN);
        paramBaseViewHolder.rvM.setClickable(localav.rAO);
        localObject3 = paramBaseViewHolder.rvM;
        if (!localav.rAO)
          break label3223;
        paramInt1 = -11048043;
        ((TextView)localObject3).setTextColor(paramInt1);
        label1305: paramBaseViewHolder.kPs.setTextColor(this.mActivity.getResources().getColor(2131690481));
        if (!localav.rAP)
          break label3242;
        paramBaseViewHolder.kPs.setVisibility(0);
        localObject2 = this.mActivity.getString(2131303608) + localav.mAppName;
        localObject3 = localObject2;
        if (((String)localObject2).length() > 10)
          localObject3 = ((String)localObject2).substring(0, 10) + "...";
        localObject3 = new SpannableString((CharSequence)localObject3);
        ((SpannableString)localObject3).setSpan(new BaseTimeLineItem.b(this), 0, ((SpannableString)localObject3).length(), 33);
        paramBaseViewHolder.kPs.setText((CharSequence)localObject3, TextView.BufferType.SPANNABLE);
        if ((!localav.rAR) && (!"wx7fa037cc7dfabad5".equals(paramTimeLineObject.xfH.Id)))
        {
          paramBaseViewHolder.kPs.setTextColor(this.mActivity.getResources().getColor(2131690508));
          paramBaseViewHolder.kPs.setOnTouchListener(null);
        }
        paramBaseViewHolder.kPs.setTag(paramTimeLineObject);
        if (!localav.rAJ)
          break label3543;
        paramBaseViewHolder.rjj.setVisibility(0);
        paramBaseViewHolder.rjj.setTag(localav.riA);
        paramBaseViewHolder.rHM.setTag(paramBaseViewHolder);
        if (!localav.rAV)
          break label3642;
        if (!paramBaseViewHolder.rIb)
        {
          paramBaseViewHolder.rHQ = ((LinearLayout)paramBaseViewHolder.rHX.inflate());
          paramBaseViewHolder.rHR = paramBaseViewHolder.mRR.findViewById(2131827834);
          paramBaseViewHolder.rIb = true;
          paramBaseViewHolder.rHR.setTag(localav.riA);
          paramBaseViewHolder.raQ = ((TextView)paramBaseViewHolder.rHQ.findViewById(2131827834));
        }
        paramBaseViewHolder.rHX.setVisibility(0);
        paramBaseViewHolder.rHR.setOnClickListener(paramau.qOL.rJQ);
        label2101: switch (localav.rAW)
        {
        default:
          paramBaseViewHolder.raQ.setText(2131303747);
          paramBaseViewHolder.rHR.setClickable(true);
          paramBaseViewHolder.rHR.setEnabled(true);
          label1726: paramTimeLineObject = paramn.cqM();
          if ((paramTimeLineObject != null) && (!bo.isNullOrNil(paramTimeLineObject.wFu)))
            paramBaseViewHolder.raQ.setText(paramTimeLineObject.wFu);
          label1760: if (localav.rAX)
          {
            paramBaseViewHolder.rHL.setVisibility(0);
            paramBaseViewHolder.rHL.setTag(localav.riA);
            if (!localav.rAY)
              break label3764;
            if (bo.isNullOrNil(localav.rAZ))
              break label3703;
            paramBaseViewHolder.rHI.setVisibility(0);
            if (paramInt2 != 7)
              break label3673;
            paramTimeLineObject = String.format(this.mActivity.getString(2131303832), new Object[] { localav.rAZ });
            paramTimeLineObject = j.b(this.mActivity, paramTimeLineObject, paramBaseViewHolder.rHI.getTextSize());
            paramBaseViewHolder.rHI.setText(paramTimeLineObject);
            if (!localav.rBb)
              break label3776;
            if (paramBaseViewHolder.rIw == null)
            {
              paramBaseViewHolder.rIw = paramBaseViewHolder.rIv.inflate();
              paramBaseViewHolder.qHh = ((TextView)paramBaseViewHolder.rIw.findViewById(2131825679));
              paramBaseViewHolder.rIx = ((MaskTextView)paramBaseViewHolder.rIw.findViewById(2131825681));
              paramBaseViewHolder.rIx.setOnTouchListener(new aa());
            }
            paramBaseViewHolder.rIw.setVisibility(0);
            b(paramBaseViewHolder.rIx, localav.rBe, paramInt2);
            paramTimeLineObject = this.mActivity.getString(2131303707, new Object[] { Integer.valueOf(localav.rBc), bo.F(localav.rBd / 100.0D) });
            paramBaseViewHolder.qHh.setText(paramTimeLineObject);
            paramBaseViewHolder.rIw.setTag(paramn);
            paramBaseViewHolder.rIw.setOnClickListener(paramau.qOL.rJT);
            if (((localav.rBf != null) && (localav.rBf.size() != 0)) || ((localav.rBg != null) && (localav.rBg.size() != 0)))
              break label3814;
            if (paramBaseViewHolder.rgx == null)
              break label3795;
            paramBaseViewHolder.rgx.setVisibility(8);
            if (!localav.rBh)
              break label4171;
            paramBaseViewHolder.rHE.setTag(localav.riA);
            paramBaseViewHolder.rHE.setText(localav.rBi);
            paramBaseViewHolder.rHE.setVisibility(0);
            if (!localav.rgZ)
              break label4188;
            ab.i("MicroMsg.BaseTimeLineItem", "adatag " + localav.rAD);
            paramBaseViewHolder.qFH.z(Long.valueOf(localav.rAt), new com.tencent.mm.plugin.sns.data.b(paramBaseViewHolder.qFH, paramBaseViewHolder.position, localav.riA, localav.rAt, localav.rAz));
            paramBaseViewHolder.qFH.a(localav.rAC, localav.rAB);
            paramBaseViewHolder.qFH.setVisibility(0);
            if ((paramBaseViewHolder.rvM != null) && (paramBaseViewHolder.rvM.getVisibility() == 0))
            {
              if (paramBaseViewHolder.qFH.rDj.getVisibility() != 0)
                break label4183;
              paramInt1 = 1;
              label2278: if (paramInt1 != 0)
              {
                paramn = (LinearLayout.LayoutParams)paramBaseViewHolder.rvM.getLayoutParams();
                paramn.setMargins(paramn.leftMargin, BackwardSupportUtil.b.b(this.mActivity, 0.0F), paramn.rightMargin, paramn.bottomMargin);
                paramBaseViewHolder.rvM.setLayoutParams(paramn);
              }
            }
            if (this.rps)
              af.cnw().a(this.mActivity, (cbf)localObject1, paramBaseViewHolder);
            paramn = new ar(localav.rAs, localav.riA, false, true, 1);
            paramBaseViewHolder.rHA.getResultTextView().setTag(paramn);
            localObject2 = a.a.dzk();
            localObject3 = paramBaseViewHolder.mRR;
            paramn = paramBaseViewHolder.rHw;
            localObject1 = paramBaseViewHolder.timeTv;
            paramTimeLineObject = paramBaseViewHolder.rHz.getContent();
            paramau = paramBaseViewHolder.rHG;
            bool = paramBaseViewHolder.rIr;
            if ((((com.tencent.mm.ui.a.a)localObject2).dzj()) && (((com.tencent.mm.ui.a.a)localObject2).Gn != null) && (localObject3 != null) && (paramn != null) && (localObject1 != null))
              break label4200;
          }
          label1849: label1876: label2141: break;
        case 201:
        case 210:
        case 211:
        }
      }
      label1551: break;
    case 1:
    case 2:
    case 4:
    case 15:
    case 5:
    case 18:
    case 3:
    }
    while (true)
    {
      return;
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSC.add(localObject3);
      break;
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSB.add(localObject3);
      break;
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSE.add(localObject3);
      break;
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSD.add(localObject3);
      break;
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSJ.add(localObject3);
      break;
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSK.add(localObject3);
      break;
      if (!bo.isNullOrNil(paramTimeLineObject.xfJ))
      {
        ((com.tencent.mm.plugin.sns.i.b)localObject2).qSH.add(localObject3);
        break;
      }
      ((com.tencent.mm.plugin.sns.i.b)localObject2).qSI.add(localObject3);
      break;
      h.a(((com.tencent.mm.plugin.sns.storage.b)localObject4).qVc, new BaseTimeLineItem.2(this, paramBaseViewHolder));
      break label690;
      label2594: if (!((String)localObject3).endsWith("@ad"))
        if (localav.rAI)
        {
          ab.i("MicroMsg.BaseTimeLineItem", "getContact %s", new Object[] { localObject3 });
          if (a.b.diS().AZ() != null)
            paramBaseViewHolder.rHv.setImageBitmap(a.b.diS().AZ());
          ao.a.flu.a((String)localObject3, "", new au.b(paramau.cuc(), paramInt1));
          label2683: if (localav.rAJ)
            break label2816;
          com.tencent.mm.plugin.sns.ui.e.a.b(4, (String)paramBaseViewHolder.rHv.getTag(), paramBaseViewHolder.rHv);
          paramBaseViewHolder.rHv.dk((String)localObject3, 4);
          paramBaseViewHolder.rHv.setTag(localObject3);
          com.tencent.mm.plugin.sns.ui.e.a.a(4, (String)localObject3, paramBaseViewHolder.rHv);
          paramBaseViewHolder.rHv.setShowStoryHint(((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).hasNewStory((String)localObject3));
        }
      while (true)
      {
        paramBaseViewHolder.rHw.a((String)localObject3, localav.rAH, new BaseTimeLineItem.4(this, paramau), localav.rgZ, localav.riA, paramInt2, localav.rgZ);
        break;
        a.b.b(paramBaseViewHolder.rHv, (String)localObject3);
        break label2683;
        label2816: paramBaseViewHolder.rHv.dk((String)localObject3, 4);
        paramBaseViewHolder.rHv.setShowStoryHint(false);
        continue;
        paramBaseViewHolder.rHv.setImageResource(2130838444);
        paramBaseViewHolder.rHv.dk((String)localObject3, 4);
        paramBaseViewHolder.rHv.setShowStoryHint(false);
      }
      label2868: paramBaseViewHolder.qFG = false;
      break label774;
      label2876: paramBaseViewHolder.rHJ.setVisibility(8);
      break label1034;
      label2888: if (((com.tencent.mm.plugin.sns.storage.a)localObject2).qTF != com.tencent.mm.plugin.sns.storage.a.qTs)
        break label1034;
      if (!bo.isNullOrNil(localav.rAF))
      {
        localObject3 = localav.rAG;
        localObject4 = localav.rAF;
        Object localObject5 = this.mActivity;
        paramBaseViewHolder.rHJ.getTextSize();
        localObject5 = new k(j.c((Context)localObject5, (CharSequence)localObject4, 1));
        ((k)localObject5).a(null, (CharSequence)localObject4, 0);
        localObject4 = paramBaseViewHolder.rHJ.getPaint();
        float f = Layout.getDesiredWidth((CharSequence)localObject5, 0, ((k)localObject5).length(), (TextPaint)localObject4);
        if (com.tencent.mm.bz.a.ao(this.mActivity, (int)f) > paramBaseViewHolder.rql)
        {
          do
          {
            if (((String)localObject3).length() <= 1)
              break;
            localObject3 = ((String)localObject3).substring(0, ((String)localObject3).length() - 2);
            localObject5 = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject2).qTG, new Object[] { (String)localObject3 + "..." });
            Object localObject6 = this.mActivity;
            paramBaseViewHolder.rHJ.getTextSize();
            localObject6 = new k(j.c((Context)localObject6, (CharSequence)localObject5, 1));
            ((k)localObject6).a(null, (CharSequence)localObject5, 0);
            f = Layout.getDesiredWidth((CharSequence)localObject6, 0, ((k)localObject6).length(), (TextPaint)localObject4);
            paramInt1 = com.tencent.mm.bz.a.ao(this.mActivity, (int)f);
            paramBaseViewHolder.rHJ.setText((CharSequence)localObject6, TextView.BufferType.SPANNABLE);
            paramBaseViewHolder.rHJ.setVisibility(0);
          }
          while (paramInt1 > paramBaseViewHolder.rql);
          break label1034;
        }
        paramBaseViewHolder.rHJ.setText((CharSequence)localObject5, TextView.BufferType.SPANNABLE);
        paramBaseViewHolder.rHJ.setVisibility(0);
        break label1034;
      }
      paramBaseViewHolder.rHJ.setVisibility(8);
      break label1034;
      label3199: paramBaseViewHolder.rHK.setVisibility(8);
      break label1173;
      label3211: BaseViewHolder.g(paramBaseViewHolder).setVisibility(8);
      break label1226;
      label3223: paramInt1 = -9211021;
      break label1299;
      label3230: paramBaseViewHolder.rvM.setVisibility(8);
      break label1305;
      label3242: if (localav.rAQ)
      {
        paramBaseViewHolder.kPs.setVisibility(0);
        paramTimeLineObject = new SpannableString(localav.rAT);
        paramTimeLineObject.setSpan(new BaseTimeLineItem.c(this), 0, paramTimeLineObject.length(), 33);
        paramBaseViewHolder.kPs.setText(paramTimeLineObject, TextView.BufferType.SPANNABLE);
        paramBaseViewHolder.kPs.setTag(new az(localav.rAS, localav.rAT));
        break label1523;
      }
      if (localav.rAU)
      {
        paramBaseViewHolder.kPs.setVisibility(0);
        localObject4 = this.mActivity.getString(2131296556);
        localObject3 = (String)localObject4 + localav.mAppName;
        localObject2 = new SpannableString((CharSequence)localObject3);
        ((SpannableString)localObject2).setSpan(new ForegroundColorSpan(this.mActivity.getResources().getColor(2131690508)), 0, ((String)localObject4).length(), 33);
        ((SpannableString)localObject2).setSpan(new BaseTimeLineItem.a(this), ((String)localObject4).length(), ((String)localObject3).length(), 33);
        paramBaseViewHolder.kPs.setText((CharSequence)localObject2, TextView.BufferType.SPANNABLE);
        if ((!localav.rAR) && (!"wx7fa037cc7dfabad5".equals(paramTimeLineObject.xfH.Id)))
        {
          paramBaseViewHolder.kPs.setTextColor(this.mActivity.getResources().getColor(2131690508));
          paramBaseViewHolder.kPs.setOnTouchListener(null);
        }
        paramBaseViewHolder.kPs.setTag(paramTimeLineObject);
        break label1523;
      }
      paramBaseViewHolder.kPs.setVisibility(8);
      break label1523;
      label3543: paramBaseViewHolder.rjj.setVisibility(8);
      break label1551;
      paramBaseViewHolder.raQ.setText(2131303744);
      paramBaseViewHolder.rHR.setClickable(false);
      paramBaseViewHolder.rHR.setEnabled(false);
      break label1726;
      paramBaseViewHolder.raQ.setText(2131303746);
      paramBaseViewHolder.rHR.setClickable(false);
      paramBaseViewHolder.rHR.setEnabled(false);
      break label1726;
      paramBaseViewHolder.raQ.setText(2131303745);
      paramBaseViewHolder.rHR.setClickable(true);
      paramBaseViewHolder.rHR.setEnabled(true);
      break label1726;
      label3642: if (!paramBaseViewHolder.rIb)
        break label1760;
      paramBaseViewHolder.rHX.setVisibility(8);
      break label1760;
      paramBaseViewHolder.rHL.setVisibility(8);
      break label1788;
      label3673: paramTimeLineObject = String.format(this.mActivity.getString(2131303833), new Object[] { localav.rAZ });
      break label1849;
      label3703: if (localav.rBa)
      {
        paramBaseViewHolder.rHI.setVisibility(0);
        paramTimeLineObject = this.mActivity.getString(2131303834);
        paramTimeLineObject = j.b(this.mActivity, paramTimeLineObject.toString(), paramBaseViewHolder.rHI.getTextSize());
        paramBaseViewHolder.rHI.setText(paramTimeLineObject);
        break label1876;
      }
      label3764: paramBaseViewHolder.rHI.setVisibility(8);
      break label1876;
      label3776: if (paramBaseViewHolder.rIw == null)
        break label2047;
      paramBaseViewHolder.rIw.setVisibility(8);
      break label2047;
      label3795: if (!paramBaseViewHolder.rHW)
        break label2101;
      paramBaseViewHolder.rHV.setVisibility(8);
      break label2101;
      label3814: if (!paramBaseViewHolder.rHW)
      {
        if ((paramBaseViewHolder.rgx != null) || (paramBaseViewHolder.rHV.getParent() == null))
          break label4095;
        paramBaseViewHolder.rgx = ((LinearLayout)paramBaseViewHolder.rHV.inflate());
        if (paramBaseViewHolder.rgx != null)
        {
          paramBaseViewHolder.rHO = ((MaskTextView)paramBaseViewHolder.rgx.findViewById(2131827889));
          paramBaseViewHolder.rHO.setOnTouchListener(new aa());
          paramBaseViewHolder.rHP = ((LinearLayout)paramBaseViewHolder.mRR.findViewById(2131827891));
          paramBaseViewHolder.rgx.setTag(localav.rAs);
          paramBaseViewHolder.rHO.setTag(localav.rAs);
          paramBaseViewHolder.rHU = paramBaseViewHolder.rgx.findViewById(2131827890);
          paramBaseViewHolder.rIy = paramBaseViewHolder.rgx.findViewById(2131827888);
          paramBaseViewHolder.rHW = true;
        }
      }
      if (paramBaseViewHolder.rgx != null)
        paramBaseViewHolder.rgx.setVisibility(0);
      if ((localav.rBf != null) && (localav.rBf.size() > 0))
      {
        paramBaseViewHolder.rHO.setVisibility(0);
        a(paramBaseViewHolder.rHO, localav.rBf, paramInt2);
        label4022: if (localav.rBg == null)
          break label4147;
        a(((cbf)localObject1).xat, localav.rBg, paramBaseViewHolder);
      }
      while (true)
      {
        if ((localav.rBf == null) || (localav.rBf.size() == 0) || (localav.rBg == null) || (localav.rBg.size() == 0))
          break label4159;
        paramBaseViewHolder.rHU.setVisibility(0);
        break;
        label4095: if (paramBaseViewHolder.rgx == null);
        for (bool = true; ; bool = false)
        {
          ab.e("MicroMsg.BaseTimeLineItem", "holder.listKeeper = null %s,and holder.commentStub.inflated", new Object[] { Boolean.valueOf(bool) });
          break;
        }
        paramBaseViewHolder.rHO.setVisibility(8);
        break label4022;
        label4147: paramBaseViewHolder.rHP.setVisibility(8);
      }
      label4159: paramBaseViewHolder.rHU.setVisibility(8);
      break label2101;
      label4171: paramBaseViewHolder.rHE.setVisibility(8);
      break label2141;
      label4183: paramInt1 = 0;
      break label2278;
      label4188: paramBaseViewHolder.qFH.setVisibility(8);
      break label2325;
      label4200: paramBaseViewHolder = new com.tencent.mm.ui.a.b();
      paramBaseViewHolder.aqI(paramn.getText().toString());
      paramBaseViewHolder.aqI(paramTimeLineObject);
      if (paramau != null)
        paramBaseViewHolder.aqI(paramau.getText().toString());
      if (bool)
        paramBaseViewHolder.aqI(((com.tencent.mm.ui.a.a)localObject2).Gn.getString(2131298781));
      paramBaseViewHolder.eD((View)localObject3);
    }
  }

  public abstract void a(BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, com.tencent.mm.plugin.sns.ui.au paramau);

  public abstract void d(BaseViewHolder paramBaseViewHolder);

  public final void setIsFromMainTimeline(boolean paramBoolean)
  {
    this.rps = paramBoolean;
  }

  public static class BaseViewHolder
  {
    public String cFc;
    public String cwT;
    public volatile boolean eBB;
    public TextView gne;
    public TextView kPs;
    public int klY;
    public View mRR;
    public boolean mVC;
    public int position;
    public cbf qCX;
    public boolean qFG;
    public bb qFH;
    public TextView qHh;
    public aj rGD;
    public SnsTranslateResultView rHA;
    public LinearLayout rHB;
    public ViewStub rHC;
    public boolean rHD;
    public TextView rHE;
    public TagImageView rHF;
    public TextView rHG;
    public int rHH;
    public TextView rHI;
    public AsyncTextView rHJ;
    public AsyncTextView rHK;
    public View rHL;
    public ImageView rHM;
    public View rHN;
    public MaskTextView rHO;
    public LinearLayout rHP;
    public LinearLayout rHQ;
    public View rHR;
    public LinearLayout rHS;
    public PhotosContent rHT;
    public View rHU;
    public ViewStub rHV;
    public boolean rHW;
    public ViewStub rHX;
    public ViewStub rHY;
    public View rHZ;
    public long rHt;
    public int rHu;
    public SnsAvatarImageView rHv;
    public AsyncTextView rHw;
    public ImageView rHx;
    public ViewGroup rHy;
    public AsyncNormalTextView rHz;
    public String rIA;
    public boolean rIa;
    public boolean rIb;
    public ViewStub rIc;
    public boolean rId;
    public View rIe;
    public LinearLayout rIf;
    public TextView rIg;
    public ViewStub rIh;
    public boolean rIi;
    public View rIj;
    public LinearLayout rIk;
    public ViewStub rIl;
    public boolean rIm;
    public View rIn;
    public ImageView rIo;
    public boolean rIp;
    ViewStub rIq;
    boolean rIr;
    public com.tencent.mm.n.a rIs;
    public View rIt;
    public BaseTimeLineItem rIu;
    public ViewStub rIv;
    public View rIw;
    public MaskTextView rIx;
    public View rIy;
    private TextView rIz;
    public TextView raQ;
    public bav rfi;
    public LinearLayout rgx;
    public ImageView rhd;
    public TextView rjj;
    public int rql;
    public TextView rvM;
    public View rvR;
    public TimeLineObject timeLineObject;
    public TextView timeTv;

    public BaseViewHolder()
    {
      AppMethodBeat.i(40125);
      this.rHD = false;
      this.rHH = 0;
      this.rql = 210;
      this.rHW = false;
      this.rHZ = null;
      this.rIa = false;
      this.rIb = false;
      this.rId = false;
      this.rIi = false;
      this.rIm = false;
      this.rIp = false;
      this.rIr = false;
      this.rGD = new aj();
      AppMethodBeat.o(40125);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
 * JD-Core Version:    0.6.2
 */