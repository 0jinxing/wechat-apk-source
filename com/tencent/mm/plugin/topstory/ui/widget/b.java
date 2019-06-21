package com.tencent.mm.plugin.topstory.ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abz;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.FlowLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class b extends Dialog
{
  private View contentView;
  private Set<abz> sHQ;
  private View sHR;
  private View sHS;
  private TextView sHT;
  private FlowLayout sHU;
  private final abz sHV;

  public b(Context paramContext, List<abz> paramList, b.a parama)
  {
    super(paramContext, 2131493682);
    AppMethodBeat.i(2230);
    this.sHQ = new HashSet();
    this.sHV = new abz();
    this.sHV.id = "101";
    this.sHV.cEh = paramContext.getString(2131304095);
    Object localObject1 = paramList.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (abz)((Iterator)localObject1).next();
      if (((abz)localObject2).wjP)
      {
        this.sHV.id = ((abz)localObject2).id;
        this.sHV.cEh = ((abz)localObject2).cEh;
        paramList.remove(localObject2);
      }
    }
    this.contentView = LayoutInflater.from(paramContext).inflate(2130970937, null, false);
    this.sHR = this.contentView.findViewById(2131828252);
    this.sHS = this.contentView.findViewById(2131828257);
    this.sHT = ((TextView)this.contentView.findViewById(2131828254));
    this.sHT.setOnClickListener(new b.1(this, parama));
    this.sHU = ((FlowLayout)this.contentView.findViewById(2131828255));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (abz)localIterator.next();
      localObject1 = LayoutInflater.from(paramContext).inflate(2130970938, this.sHU, false);
      localObject2 = (TextView)((View)localObject1).findViewById(2131828258);
      ((TextView)localObject2).setText(paramList.cEh);
      ((TextView)localObject2).setOnClickListener(new b.2(this, paramList, (TextView)localObject2, paramContext));
      this.sHU.addView((View)localObject1);
    }
    setContentView(this.contentView);
    setCanceledOnTouchOutside(true);
    setOnDismissListener(new b.3(this, parama));
    AppMethodBeat.o(2230);
  }

  public final void a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2231);
    super.show();
    Object localObject = paramView.getContext();
    View localView = this.contentView;
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    paramView.getLocationOnScreen(arrayOfInt2);
    int i = paramView.getHeight();
    int j = ae.hy((Context)localObject).x;
    localView.measure(0, 0);
    int k = localView.getMeasuredHeight();
    int m = localView.getMeasuredWidth();
    if (paramBoolean)
    {
      arrayOfInt1[0] = (j - m);
      arrayOfInt2[1] -= k;
      if (!paramBoolean)
        break label232;
      this.sHS.setVisibility(0);
      this.sHR.setVisibility(8);
    }
    while (true)
    {
      arrayOfInt1[0] += paramInt1;
      arrayOfInt1[1] += paramInt2;
      localObject = getWindow();
      ((Window)localObject).setLayout(-2, -2);
      paramView = ((Window)localObject).getAttributes();
      paramView.width = -2;
      paramView.height = -2;
      paramView.x = arrayOfInt1[0];
      paramView.y = arrayOfInt1[1];
      paramView.gravity = 8388659;
      ((Window)localObject).setAttributes(paramView);
      AppMethodBeat.o(2231);
      return;
      arrayOfInt1[0] = (j - m);
      arrayOfInt2[1] += i;
      break;
      label232: this.sHS.setVisibility(8);
      this.sHR.setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.b
 * JD-Core Version:    0.6.2
 */