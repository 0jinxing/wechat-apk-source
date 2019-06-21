package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public class GameLibraryCategoriesView extends LinearLayout
  implements View.OnClickListener
{
  private Context mContext;
  private int mXC;
  private LinearLayout mpt;
  private int njK;
  private int njL;

  public GameLibraryCategoriesView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(112012);
    if (!(paramView.getTag() instanceof GameLibraryCategoriesView.a))
    {
      AppMethodBeat.o(112012);
      return;
    }
    paramView = (GameLibraryCategoriesView.a)paramView.getTag();
    int i = 7;
    if (!bo.isNullOrNil(paramView.njO))
      c.ax(this.mContext, paramView.njO);
    while (true)
    {
      b.a(this.mContext, 11, paramView.njM + 100, paramView.position, i, this.mXC, null);
      AppMethodBeat.o(112012);
      break;
      Intent localIntent = new Intent(this.mContext, GameCategoryUI.class);
      localIntent.putExtra("extra_type", 1);
      localIntent.putExtra("extra_category_id", paramView.njM);
      localIntent.putExtra("extra_category_name", paramView.njN);
      localIntent.putExtra("game_report_from_scene", paramView.njM + 100);
      this.mContext.startActivity(localIntent);
      i = 6;
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112010);
    super.onFinishInflate();
    this.mpt = ((LinearLayout)findViewById(2131824547));
    int i = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getWidth();
    this.njK = (i * 100 / 750);
    this.njL = ((i - this.njK * 6) / 14);
    this.mpt.setPadding(this.njL, com.tencent.mm.bz.a.fromDPToPix(this.mContext, 12), this.njL, com.tencent.mm.bz.a.fromDPToPix(this.mContext, 12));
    AppMethodBeat.o(112010);
  }

  public void setData(LinkedList<GameLibraryCategoriesView.a> paramLinkedList)
  {
    AppMethodBeat.i(112011);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      ab.e("MicroMsg.GameLibraryCategoriesView", "No categories");
      setVisibility(8);
      AppMethodBeat.o(112011);
    }
    while (true)
    {
      return;
      setVisibility(0);
      this.mpt.removeAllViews();
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        Object localObject1 = (GameLibraryCategoriesView.a)paramLinkedList.next();
        LinearLayout localLinearLayout = new LinearLayout(this.mContext);
        localLinearLayout.setOrientation(1);
        Object localObject2 = new ImageView(this.mContext);
        Object localObject3 = ImageView.ScaleType.MATRIX;
        ((ImageView)localObject2).setScaleType(ImageView.ScaleType.FIT_XY);
        com.tencent.mm.at.a.a locala = o.ahp();
        localObject3 = ((GameLibraryCategoriesView.a)localObject1).haO;
        c.a locala1 = new c.a();
        locala1.ePG = true;
        locala.a((String)localObject3, (ImageView)localObject2, locala1.ahG());
        localLinearLayout.addView((View)localObject2, this.njK, this.njK);
        localObject2 = new TextView(this.mContext);
        ((TextView)localObject2).setText(((GameLibraryCategoriesView.a)localObject1).njN);
        ((TextView)localObject2).setTextSize(1, 14.0F);
        ((TextView)localObject2).setTextColor(getResources().getColor(2131690164));
        ((TextView)localObject2).setSingleLine(true);
        ((TextView)localObject2).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView)localObject2).setGravity(17);
        ((TextView)localObject2).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ((TextView)localObject2).setPadding(0, com.tencent.mm.bz.a.fromDPToPix(this.mContext, 6), 0, 0);
        localLinearLayout.addView((View)localObject2);
        localLinearLayout.setTag(localObject1);
        localLinearLayout.setOnClickListener(this);
        localObject1 = new LinearLayout.LayoutParams(-1, -2);
        ((LinearLayout.LayoutParams)localObject1).setMargins(this.njL, 0, this.njL, 0);
        this.mpt.addView(localLinearLayout, (ViewGroup.LayoutParams)localObject1);
      }
      AppMethodBeat.o(112011);
    }
  }

  public void setSourceScene(int paramInt)
  {
    this.mXC = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView
 * JD-Core Version:    0.6.2
 */