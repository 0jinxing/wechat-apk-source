package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c extends b
{
  private int rKL;
  private boolean rKM;
  private boolean rKN;
  c.a rKO;
  private int rKP;
  private HashMap<String, Bitmap> rmh;
  boolean rmk;

  public c(Context paramContext, List<?> paramList, boolean paramBoolean, c.a parama)
  {
    super(paramContext);
    AppMethodBeat.i(40306);
    this.rmh = new HashMap();
    this.rKP = 0;
    super.dy(dz(paramList));
    this.rKL = 9;
    this.rKM = paramBoolean;
    this.rKO = parama;
    cuY();
    cuZ();
    AppMethodBeat.o(40306);
  }

  private void cuY()
  {
    AppMethodBeat.i(40308);
    for (int i = 0; i < this.rKK; i++)
    {
      c.d locald = new c.d(this, (byte)0);
      locald.data = "";
      locald.id = getCount();
      locald.id = getCount();
      add(i, locald);
    }
    AppMethodBeat.o(40308);
  }

  private List<c.d> dz(List<?> paramList)
  {
    AppMethodBeat.i(40307);
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    for (int i = 0; paramList.hasNext(); i++)
    {
      Object localObject = paramList.next();
      c.d locald = new c.d(this, (byte)0);
      locald.data = localObject;
      locald.id = i;
      localArrayList.add(locald);
    }
    AppMethodBeat.o(40307);
    return localArrayList;
  }

  public final boolean Es(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(40315);
    if (paramInt < this.rKK)
      AppMethodBeat.o(40315);
    while (true)
    {
      return bool;
      if (this.rKN)
      {
        if (paramInt != getCount() - 1)
        {
          bool = true;
          AppMethodBeat.o(40315);
        }
        else
        {
          AppMethodBeat.o(40315);
        }
      }
      else
      {
        bool = super.Es(paramInt);
        AppMethodBeat.o(40315);
      }
    }
  }

  public final boolean Et(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(40316);
    if (paramInt < this.rKK)
      AppMethodBeat.o(40316);
    while (true)
    {
      return bool;
      if (this.rKN)
      {
        if (paramInt != getCount() - 1)
        {
          bool = true;
          AppMethodBeat.o(40316);
        }
        else
        {
          AppMethodBeat.o(40316);
        }
      }
      else
      {
        bool = super.Et(paramInt);
        AppMethodBeat.o(40316);
      }
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(40310);
    super.clear();
    this.rKN = false;
    AppMethodBeat.o(40310);
  }

  public final void cuZ()
  {
    AppMethodBeat.i(40309);
    ab.v("DynamicGridAdapter", "showAddImg %s, getCount %d, getHeaderCount %d, maxShowCount %d， showing %s", new Object[] { Boolean.valueOf(this.rKM), Integer.valueOf(getCount()), Integer.valueOf(this.rKK), Integer.valueOf(this.rKL), Boolean.valueOf(this.rKN) });
    if ((this.rKM) && (cva() < this.rKL))
    {
      if (this.rKN)
        break label113;
      this.rKN = true;
      add("");
      AppMethodBeat.o(40309);
    }
    while (true)
    {
      return;
      this.rKN = false;
      label113: AppMethodBeat.o(40309);
    }
  }

  public final int cva()
  {
    AppMethodBeat.i(40312);
    int i = getCount();
    int j = this.rKK;
    if (this.rKN);
    for (int k = 1; ; k = 0)
    {
      AppMethodBeat.o(40312);
      return i - j - k;
    }
  }

  public final void dy(List<?> paramList)
  {
    AppMethodBeat.i(40311);
    super.dy(dz(paramList));
    cuY();
    cuZ();
    AppMethodBeat.o(40311);
  }

  public final void fB(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40317);
    super.fB(paramInt1, paramInt2);
    if (this.rKO != null)
      this.rKO.fu(paramInt1 - this.rKK, paramInt2 - this.rKK);
    AppMethodBeat.o(40317);
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(40314);
    if (TextUtils.isEmpty(getItem(paramInt).toString()))
    {
      paramInt = 1;
      AppMethodBeat.o(40314);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(40314);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(40313);
    Object localObject1;
    Object localObject2;
    ImageView localImageView;
    if (paramView == null)
    {
      localObject1 = LayoutInflater.from(getContext()).inflate(2130970793, paramViewGroup, false);
      localObject2 = new c.b(this, (View)localObject1, (byte)0);
      ((View)localObject1).setTag(2131820631, localObject2);
      localImageView = ((c.b)localObject2).cAw;
      if (this.rKP == 0)
      {
        af.cnu();
        i = s.getScreenWidth();
        paramViewGroup = (ViewGroup)localObject2;
        paramView = (View)localObject1;
        if (i != 0)
          this.rKP = ((i - this.mContext.getResources().getDimensionPixelSize(2131428681) * 4 - this.mContext.getResources().getDimensionPixelSize(2131427779) * 2) / 3);
      }
      else
      {
        paramView = (LinearLayout.LayoutParams)localImageView.getLayoutParams();
        paramView.width = this.rKP;
        paramView.height = this.rKP;
        localImageView.setLayoutParams(paramView);
        paramView = (View)localObject1;
        paramViewGroup = (ViewGroup)localObject2;
      }
      localObject2 = getItem(paramInt).toString();
      localImageView = paramViewGroup.cAw;
      if (!TextUtils.isEmpty((CharSequence)localObject2))
        break label321;
      localImageView.setBackgroundResource(2131690503);
      localImageView.setImageResource(2131230780);
      localImageView.setContentDescription(paramViewGroup.cAw.getContext().getString(2131303591));
      int i = paramViewGroup.rKQ.rKP * 35 / 100;
      localImageView.setPadding(i, i, i, i);
      if (paramInt <= 0)
        break label294;
      paramViewGroup.view.setTag(Integer.valueOf(-1));
      label258: if (paramInt >= this.rKK)
        break label446;
      paramViewGroup.cAw.setVisibility(4);
    }
    while (true)
    {
      AppMethodBeat.o(40313);
      return paramView;
      paramViewGroup = (c.b)paramView.getTag(2131820631);
      break;
      label294: if (paramInt >= paramViewGroup.rKQ.rKK)
        break label258;
      paramViewGroup.view.setTag(Integer.valueOf(2147483647));
      break label258;
      label321: paramViewGroup.view.setTag(Integer.valueOf(paramInt - paramViewGroup.rKQ.rKK));
      localImageView.setBackgroundDrawable(null);
      localImageView.setTag(localObject2);
      localImageView.setContentDescription(paramViewGroup.cAw.getContext().getString(2131303660));
      localImageView.setPadding(0, 0, 0, 0);
      localObject1 = (Bitmap)paramViewGroup.rKQ.rmh.get(localObject2);
      if (!i.B((Bitmap)localObject1))
      {
        new c.c(paramViewGroup.rKQ, localImageView, (String)localObject2).u(new String[] { "" });
        break label258;
      }
      localImageView.setImageBitmap((Bitmap)localObject1);
      break label258;
      label446: paramViewGroup.cAw.setVisibility(0);
      paramView.setVisibility(0);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.c
 * JD-Core Version:    0.6.2
 */