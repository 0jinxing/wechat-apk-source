package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;

public final class a extends BaseAdapter
{
  private int iWJ;
  private int iYI;
  List<xx> kSg;
  private int kSw;
  private boolean lgk;
  private LinearLayout.LayoutParams lgl;
  private LinearLayout.LayoutParams lgm;
  a lgn;
  private Context mContext;
  private int mNumColumns;

  public a(Context paramContext)
  {
    AppMethodBeat.i(53841);
    this.mNumColumns = 3;
    this.lgk = true;
    this.mNumColumns = 3;
    this.mContext = paramContext;
    this.kSw = com.tencent.mm.bz.a.gd(this.mContext);
    this.iYI = this.mContext.getResources().getDimensionPixelSize(2131428347);
    this.iWJ = ((int)((this.kSw - this.mNumColumns * this.iYI) / (this.mNumColumns + 1.0F)));
    AppMethodBeat.o(53841);
  }

  private int getRealCount()
  {
    AppMethodBeat.i(53843);
    int i;
    if (this.kSg == null)
    {
      i = 0;
      AppMethodBeat.o(53843);
    }
    while (true)
    {
      return i;
      i = this.kSg.size();
      AppMethodBeat.o(53843);
    }
  }

  public final void bw(List<xx> paramList)
  {
    AppMethodBeat.i(53842);
    if (this.kSg == null)
      this.kSg = new ArrayList();
    while (true)
    {
      this.kSg = paramList;
      notifyDataSetChanged();
      AppMethodBeat.o(53842);
      return;
      this.kSg.clear();
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(53844);
    int i;
    if (this.kSg == null)
    {
      i = 0;
      AppMethodBeat.o(53844);
    }
    while (true)
    {
      return i;
      i = (int)Math.ceil(this.kSg.size() / this.mNumColumns);
      AppMethodBeat.o(53844);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(53846);
    Object localObject1;
    Object localObject2;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      localObject1 = v.hu(this.mContext).inflate(2130969380, null);
      localObject2 = new b();
      ((b)localObject2).kSC = ((LinearLayout)((View)localObject1).findViewById(2131823473));
      ((b)localObject2).kSC.setPadding(0, this.iWJ, 0, 0);
      ((View)localObject1).setTag(localObject2);
      for (i = 0; ; i++)
      {
        paramViewGroup = (ViewGroup)localObject2;
        paramView = (View)localObject1;
        if (i >= this.mNumColumns)
          break;
        this.lgm = new LinearLayout.LayoutParams(-2, -2);
        this.lgm.leftMargin = this.iWJ;
        this.lgl = new LinearLayout.LayoutParams(this.iYI, this.iYI);
        paramViewGroup = new PaddingImageView(this.mContext);
        paramView = this.lgl;
        paramViewGroup.addView(paramViewGroup.ikh, paramView);
        paramViewGroup.addView(paramViewGroup.lgi, paramView);
        ((b)localObject2).kSC.addView(paramViewGroup, i, this.lgm);
      }
    }
    paramViewGroup = (b)paramView.getTag();
    int i = 0;
    if (i < this.mNumColumns)
    {
      int j = this.mNumColumns * paramInt + i;
      localObject1 = (PaddingImageView)paramViewGroup.kSC.getChildAt(i);
      String str;
      if (j <= getRealCount() - 1)
      {
        localObject2 = uo(j);
        if (localObject2 != null)
          if (!bo.isNullOrNil(((xx)localObject2).ThumbUrl))
          {
            str = EmojiLogic.L(b.Yb(), "", ((xx)localObject2).Md5) + "_cover";
            o.ahp().a(((xx)localObject2).ThumbUrl, ((PaddingImageView)localObject1).getImageView(), g.a(str, this.iYI, new Object[0]));
            label339: ((PaddingImageView)localObject1).setClickable(true);
            ((PaddingImageView)localObject1).getImageViewFG().setBackgroundResource(2130838571);
            ((PaddingImageView)localObject1).setOnClickListener(new a.1(this, (PaddingImageView)localObject1, j));
          }
      }
      while (true)
      {
        i++;
        break;
        if (!bo.isNullOrNil(((xx)localObject2).Url))
        {
          str = EmojiLogic.L(b.Yb(), "", ((xx)localObject2).Md5);
          j.bjW().a(((xx)localObject2).Url, ((PaddingImageView)localObject1).getImageView(), g.a(str, this.iYI, new Object[0]));
          break label339;
        }
        ab.w("MicroMsg.emoji.PreViewListGridAdapter", "this emoji has no thumb url and url. download faild");
        break label339;
        ((PaddingImageView)localObject1).getImageViewFG().setBackgroundDrawable(null);
        o.ahp().a("", ((PaddingImageView)localObject1).getImageView());
        ab.w("MicroMsg.emoji.PreViewListGridAdapter", "item is null");
        ((PaddingImageView)localObject1).setClickable(false);
        ((PaddingImageView)localObject1).setOnClickListener(null);
        continue;
        ((PaddingImageView)localObject1).getImageViewFG().setBackgroundDrawable(null);
        o.ahp().a("", ((PaddingImageView)localObject1).getImageView());
        ((PaddingImageView)localObject1).setClickable(false);
        ((PaddingImageView)localObject1).setOnClickListener(null);
      }
    }
    AppMethodBeat.o(53846);
    return paramView;
  }

  public final xx uo(int paramInt)
  {
    xx localxx = null;
    AppMethodBeat.i(53845);
    if ((paramInt < 0) || (paramInt >= getRealCount()))
      AppMethodBeat.o(53845);
    while (true)
    {
      return localxx;
      if (this.kSg == null)
      {
        AppMethodBeat.o(53845);
      }
      else
      {
        localxx = (xx)this.kSg.get(paramInt);
        AppMethodBeat.o(53845);
      }
    }
  }

  static abstract interface a
  {
    public abstract void tY(int paramInt);
  }

  final class b
  {
    LinearLayout kSC;

    b()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.a
 * JD-Core Version:    0.6.2
 */