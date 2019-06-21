package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.i;
import com.tencent.mm.plugin.emoji.model.a;
import com.tencent.mm.protocal.protobuf.EmotionBanner;
import com.tencent.mm.protocal.protobuf.EmotionBannerImg;
import com.tencent.mm.protocal.protobuf.EmotionBannerSet;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMDotView;
import java.util.Iterator;
import java.util.LinkedList;

public class EmojiStoreVpHeader extends LinearLayout
  implements ViewPager.OnPageChangeListener
{
  private View jcl;
  private MMDotView jiG;
  private View kRR;
  private LinkedList<a> lbQ;
  private i lbR;
  private float lbS;
  private float lbT;
  private EmojiStoreVpHeader.a lbU;
  private volatile boolean lbV;
  private final int lbW;
  private final int lbX;
  private ViewPager sq;

  public EmojiStoreVpHeader(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(53511);
    this.lbW = 5;
    this.lbX = 0;
    setOrientation(1);
    AppMethodBeat.o(53511);
  }

  public EmojiStoreVpHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(53512);
    this.lbW = 5;
    this.lbX = 0;
    setOrientation(1);
    AppMethodBeat.o(53512);
  }

  private void blQ()
  {
    try
    {
      AppMethodBeat.i(53514);
      if (this.lbQ == null)
      {
        IllegalAccessError localIllegalAccessError = new java/lang/IllegalAccessError;
        localIllegalAccessError.<init>("must has emoji baner list first");
        AppMethodBeat.o(53514);
        throw localIllegalAccessError;
      }
    }
    finally
    {
    }
    Object localObject2;
    int i;
    if (this.jcl == null)
    {
      this.jcl = inflate(getContext(), 2130969386, null);
      this.kRR = this.jcl.findViewById(2131823597);
      this.jiG = ((MMDotView)this.jcl.findViewById(2131823599));
      this.sq = ((ViewPager)this.jcl.findViewById(2131823598));
      localObject2 = new com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader$a;
      ((EmojiStoreVpHeader.a)localObject2).<init>(this, (byte)0);
      this.lbU = ((EmojiStoreVpHeader.a)localObject2);
      i = db(getContext())[0] * 3 / 8;
      if (this.kRR != null)
      {
        localView = this.kRR;
        localObject2 = new android/widget/LinearLayout$LayoutParams;
        ((LinearLayout.LayoutParams)localObject2).<init>(-1, i + 1);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
      View localView = this.jcl;
      localObject2 = new android/widget/LinearLayout$LayoutParams;
      ((LinearLayout.LayoutParams)localObject2).<init>(-1, -2);
      addView(localView, (ViewGroup.LayoutParams)localObject2);
    }
    if (this.jiG != null)
    {
      localObject2 = this.jiG;
      if (this.lbQ == null)
      {
        i = 0;
        ((MMDotView)localObject2).setDotCount(i);
        this.jiG.setSelectedDot(0);
        this.jiG.setVisibility(8);
      }
    }
    else
    {
      if ((this.sq != null) && (this.lbQ != null))
        break label259;
      AppMethodBeat.o(53514);
    }
    while (true)
    {
      return;
      i = this.lbQ.size();
      break;
      label259: if (this.lbQ.size() <= 0)
      {
        if (this.kRR != null)
          this.kRR.setVisibility(8);
        AppMethodBeat.o(53514);
      }
      else
      {
        if (this.kRR != null)
          this.kRR.setVisibility(0);
        this.sq.setOnPageChangeListener(this);
        if (this.lbR == null)
        {
          localObject2 = new com/tencent/mm/plugin/emoji/a/i;
          ((i)localObject2).<init>(getContext(), this.lbQ);
          this.lbR = ((i)localObject2);
          this.sq.setAdapter(this.lbR);
          this.sq.setOffscreenPageLimit(1);
          blR();
          AppMethodBeat.o(53514);
        }
        else
        {
          localObject2 = new com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader$1;
          ((EmojiStoreVpHeader.1)localObject2).<init>(this);
          post((Runnable)localObject2);
          AppMethodBeat.o(53514);
        }
      }
    }
  }

  private void blR()
  {
    AppMethodBeat.i(53515);
    if (this.sq == null)
      AppMethodBeat.o(53515);
    while (true)
    {
      return;
      this.sq.setCurrentItem(i.kSE / 2 * this.lbQ.size(), false);
      AppMethodBeat.o(53515);
    }
  }

  public static int[] db(Context paramContext)
  {
    AppMethodBeat.i(53513);
    int[] arrayOfInt = new int[2];
    if ((paramContext instanceof Activity))
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      arrayOfInt[0] = localDisplayMetrics.widthPixels;
      arrayOfInt[1] = localDisplayMetrics.heightPixels;
    }
    while (true)
    {
      AppMethodBeat.o(53513);
      return arrayOfInt;
      paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
      arrayOfInt[0] = paramContext.getWidth();
      arrayOfInt[1] = paramContext.getHeight();
    }
  }

  private void gq(boolean paramBoolean)
  {
    AppMethodBeat.i(53522);
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    AppMethodBeat.o(53522);
  }

  public final void blS()
  {
    AppMethodBeat.i(53516);
    if (this.lbU == null)
      this.lbU = new EmojiStoreVpHeader.a(this, (byte)0);
    this.lbV = true;
    this.lbU.removeMessages(0);
    this.lbU.sendEmptyMessageDelayed(0, 5000L);
    AppMethodBeat.o(53516);
  }

  public final void blT()
  {
    AppMethodBeat.i(53517);
    if (this.lbU == null)
      AppMethodBeat.o(53517);
    while (true)
    {
      return;
      this.lbV = false;
      this.lbU.removeMessages(0);
      AppMethodBeat.o(53517);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(53518);
    if (this.lbR != null)
    {
      this.lbR.clear();
      this.lbR = null;
    }
    this.lbU = null;
    AppMethodBeat.o(53518);
  }

  public final void d(LinkedList<EmotionBanner> paramLinkedList, LinkedList<EmotionBannerSet> paramLinkedList1)
  {
    AppMethodBeat.i(53519);
    if (paramLinkedList == null)
      AppMethodBeat.o(53519);
    while (true)
    {
      return;
      if (this.lbQ == null)
        this.lbQ = new LinkedList();
      while (true)
      {
        paramLinkedList1 = paramLinkedList1.iterator();
        while (paramLinkedList1.hasNext())
        {
          EmotionBannerSet localEmotionBannerSet = (EmotionBannerSet)paramLinkedList1.next();
          if ((localEmotionBannerSet != null) && (localEmotionBannerSet.BannerImg != null) && (!bo.isNullOrNil(localEmotionBannerSet.BannerImg.StripUrl)))
            this.lbQ.add(new a(null, localEmotionBannerSet, true));
        }
        this.lbQ.clear();
      }
      paramLinkedList1 = paramLinkedList.iterator();
      while (paramLinkedList1.hasNext())
      {
        paramLinkedList = (EmotionBanner)paramLinkedList1.next();
        if ((paramLinkedList != null) && (paramLinkedList.BannerImg != null) && (!bo.isNullOrNil(paramLinkedList.BannerImg.StripUrl)))
          this.lbQ.add(new a(paramLinkedList, null, false));
      }
      blQ();
      AppMethodBeat.o(53519);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(53521);
    int i = paramMotionEvent.getAction();
    int j = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    switch (j)
    {
    default:
      switch (i)
      {
      case 2:
      default:
      case 0:
      case 1:
      case 3:
      }
      break;
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(53521);
      return bool;
      this.lbS = f1;
      this.lbT = f2;
      break;
      j = (int)(f1 - this.lbS);
      int k = (int)(f2 - this.lbT);
      if (Math.abs(j) <= Math.abs(k))
        break;
      gq(true);
      break;
      this.lbS = 0.0F;
      this.lbT = 0.0F;
      gq(false);
      break;
      blT();
      continue;
      blS();
    }
  }

  public void onPageScrollStateChanged(int paramInt)
  {
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(53520);
    if ((this.lbQ == null) || (this.lbQ.size() <= 1))
      AppMethodBeat.o(53520);
    while (true)
    {
      return;
      if ((paramInt == 0) || (paramInt == this.lbR.getCount() - 1))
        this.jcl.postDelayed(new EmojiStoreVpHeader.2(this), 350L);
      AppMethodBeat.o(53520);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader
 * JD-Core Version:    0.6.2
 */