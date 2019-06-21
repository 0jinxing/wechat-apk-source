package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.a.a.c;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class h extends com.tencent.mm.plugin.emoji.a.a.a
{
  private int iWJ;
  private int iYI;
  public int kSp;
  private int kSu;
  private int kSv;
  private int kSw;
  private boolean kSx;
  public h.a kSy;
  private HashMap<String, b> kSz;
  private Context mContext;
  private int mNumColumns;

  public h(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(52757);
    this.mNumColumns = 3;
    this.kSp = 0;
    this.mContext = paramContext;
    this.kSx = false;
    this.kSu = this.mContext.getResources().getDimensionPixelSize(2131427812);
    this.kSv = this.mContext.getResources().getDimensionPixelSize(2131427504);
    this.iYI = this.mContext.getResources().getDimensionPixelSize(2131428347);
    this.kSw = com.tencent.mm.bz.a.gd(this.mContext);
    this.iWJ = ((int)((this.kSw - this.mNumColumns * this.iYI) / (this.mNumColumns + 1.0F)));
    AppMethodBeat.o(52757);
  }

  private void a(b paramb, int paramInt)
  {
    AppMethodBeat.i(52761);
    switch (paramInt)
    {
    default:
      paramb.klC.setTextColor(this.mContext.getResources().getColor(2131690316));
      paramb.klC.setCompoundDrawables(null, null, null, null);
      ab.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "unknow product status:%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(52761);
    case 7:
    }
    while (true)
    {
      return;
      paramb.klC.setTextColor(this.mContext.getResources().getColor(2131690155));
      Drawable localDrawable = this.mContext.getResources().getDrawable(2131231227);
      localDrawable.setBounds(0, 0, localDrawable.getMinimumWidth(), localDrawable.getMinimumHeight());
      paramb.klC.setCompoundDrawables(null, null, localDrawable, null);
      AppMethodBeat.o(52761);
    }
  }

  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return null;
  }

  public final void bW(String paramString, int paramInt)
  {
    AppMethodBeat.i(52762);
    if (this.kSz == null)
    {
      ab.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus mCacheHolder is nulll.");
      AppMethodBeat.o(52762);
    }
    while (true)
    {
      return;
      b localb = (b)this.kSz.get(paramString);
      f localf = this.kSP.IT(paramString);
      if (localf != null)
        a(localf, paramString, paramInt);
      if ((localf != null) && (this.kSP != null) && (localf.mStatus == -1))
      {
        ab.i("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "force refresh status");
        localf.a(this.kSP.kSY, this.kSP.IX(paramString), this.kSP.IV(paramString));
      }
      if (localb == null)
      {
        ab.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus viewHolder is nulll.");
        AppMethodBeat.o(52762);
      }
      else
      {
        a(localb, paramInt);
        AppMethodBeat.o(52762);
      }
    }
  }

  public final int bjB()
  {
    AppMethodBeat.i(52758);
    int i;
    if (this.kSx)
      if (this.kSp == 0)
      {
        i = 0;
        AppMethodBeat.o(52758);
      }
    while (true)
    {
      return i;
      if ((this.kSp > 0) && (super.getCount() > this.kSp))
      {
        i = this.kSp;
        AppMethodBeat.o(52758);
      }
      else
      {
        i = super.getCount();
        AppMethodBeat.o(52758);
        continue;
        i = super.getCount();
        AppMethodBeat.o(52758);
      }
    }
  }

  public final int bjw()
  {
    return this.kSp;
  }

  public final int bjx()
  {
    return 0;
  }

  public final int bjy()
  {
    return 0;
  }

  public final a d(Context paramContext, View paramView)
  {
    return null;
  }

  public final int getCount()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(52759);
    if (this.kSx)
    {
      if (this.kSp == 0)
      {
        AppMethodBeat.o(52759);
        i = j;
      }
      while (true)
      {
        return i;
        if ((this.kSp > 0) && (bjB() > this.kSp))
        {
          i = (int)Math.ceil(this.kSp / this.mNumColumns);
          AppMethodBeat.o(52759);
        }
        else
        {
          i = (int)Math.ceil(bjB() / this.mNumColumns);
          AppMethodBeat.o(52759);
        }
      }
    }
    j = bjB();
    if (j <= this.kSp);
    while (true)
    {
      AppMethodBeat.o(52759);
      break;
      i = (int)Math.ceil((j - this.kSp) / this.mNumColumns);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(52760);
    Object localObject1;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject1 = (h.b)paramView.getTag();
      paramViewGroup = paramView;
      paramView = (View)localObject1;
    }
    while (true)
    {
      int i = 0;
      if (i < this.mNumColumns)
      {
        int j;
        label57: Object localObject2;
        if (this.kSx)
        {
          j = this.mNumColumns * paramInt;
          j += i;
          localObject2 = new b(this.mContext, paramView.kSC.getChildAt(i));
          ((b)localObject2).kRR.setOnClickListener(new h.1(this, (b)localObject2, j));
          localObject1 = tX(j);
          if ((j > bjB() - 1) || (localObject1 == null))
            break label453;
          if (this.kSz == null)
            this.kSz = new HashMap();
          if (this.kSz.containsValue(localObject2))
            this.kSz.remove(((b)localObject2).kRZ);
          ((b)localObject2).kRZ = a((f)localObject1);
          this.kSz.put(a((f)localObject1), localObject2);
          ((b)localObject2).kRR.setVisibility(0);
          ((b)localObject2).klC.setText(((f)localObject1).kTb.PackName);
          o.ahp().a(((f)localObject1).kTb.IconUrl, ((b)localObject2).kSa, g.dH(((f)localObject1).kTb.ProductID, ((f)localObject1).kTb.IconUrl));
          ((b)localObject2).kSb.setBackgroundResource(2130838566);
          ((b)localObject2).kRR.setClickable(true);
          a((b)localObject2, ((f)localObject1).mStatus);
        }
        while (true)
        {
          i++;
          break;
          paramViewGroup = new LinearLayout(this.mContext);
          paramView = new AbsListView.LayoutParams(-1, -2);
          paramViewGroup.setBackgroundResource(2130840857);
          paramViewGroup.setOrientation(0);
          paramViewGroup.setLayoutParams(paramView);
          paramViewGroup.setPadding(0, 0, 0, this.kSv);
          paramView = new h.b(this);
          paramView.kSC = paramViewGroup;
          paramViewGroup.setTag(paramView);
          for (i = 0; i < this.mNumColumns; i++)
          {
            localObject2 = new LinearLayout.LayoutParams(-2, -2);
            ((LinearLayout.LayoutParams)localObject2).leftMargin = this.iWJ;
            localObject1 = new b(this.mContext);
            paramView.kSC.addView(((b)localObject1).kRR, i, (ViewGroup.LayoutParams)localObject2);
          }
          j = this.mNumColumns * paramInt + this.kSp;
          break label57;
          label453: ((b)localObject2).kRR.setClickable(false);
          ((b)localObject2).kRR.setVisibility(8);
          ((b)localObject2).kSb.setBackgroundDrawable(null);
        }
      }
      AppMethodBeat.o(52760);
      return paramViewGroup;
    }
  }

  public final void tU(int paramInt)
  {
    this.kSp = paramInt;
  }

  public final void tV(int paramInt)
  {
  }

  public final void tW(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.h
 * JD-Core Version:    0.6.2
 */