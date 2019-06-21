package com.tencent.mm.plugin.sns.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public class SnsCardAdTagListView extends LinearLayout
{
  private Activity activity;
  private int rMK;
  private List<View> rsl;

  public SnsCardAdTagListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(40465);
    this.rsl = new ArrayList();
    AppMethodBeat.o(40465);
  }

  public SnsCardAdTagListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(40466);
    this.rsl = new ArrayList();
    AppMethodBeat.o(40466);
  }

  public final void dB(List<String> paramList)
  {
    AppMethodBeat.i(40467);
    int i;
    if (paramList != null)
    {
      i = 0;
      if (i < paramList.size())
        if (i != 0)
          break label139;
    }
    label139: for (int j = 0; ; j = 1)
    {
      String str = (String)paramList.get(i);
      if (!bo.isNullOrNil(str))
      {
        View localView = this.activity.getLayoutInflater().inflate(2130968629, null);
        TextView localTextView = (TextView)localView.findViewById(2131821020);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (j != 0)
          localLayoutParams.leftMargin = this.rMK;
        localTextView.setText(str);
        addView(localView, localLayoutParams);
        this.rsl.add(localView);
      }
      i++;
      break;
      AppMethodBeat.o(40467);
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40469);
    super.onMeasure(paramInt1, paramInt2);
    paramInt2 = 0;
    paramInt1 = 0;
    int i = paramInt1;
    if (paramInt1 < this.rsl.size())
    {
      if (paramInt1 <= 0)
        break label216;
      paramInt2 += this.rMK;
    }
    label53: label216: 
    while (true)
    {
      if (paramInt2 >= getMeasuredWidth())
        i = paramInt1 - 1;
      while (true)
        if ((i >= 0) && (i < this.rsl.size()))
        {
          View localView = (View)this.rsl.get(i);
          TextView localTextView = (TextView)localView.findViewById(2131821020);
          localTextView.setEllipsize(TextUtils.TruncateAt.END);
          getViewTreeObserver().addOnPreDrawListener(new SnsCardAdTagListView.1(this, localTextView, localView));
          paramInt1 = i + 1;
          while (true)
            if (paramInt1 < this.rsl.size())
            {
              removeView((View)this.rsl.get(paramInt1));
              this.rsl.remove(paramInt1);
              paramInt1++;
              continue;
              paramInt2 = ((View)this.rsl.get(paramInt1)).getMeasuredWidth() + paramInt2;
              i = paramInt1;
              if (paramInt2 >= getMeasuredWidth())
                break label53;
              paramInt1++;
              break;
            }
        }
      AppMethodBeat.o(40469);
      return;
    }
  }

  public void removeAllViews()
  {
    AppMethodBeat.i(40468);
    super.removeAllViews();
    this.rsl.clear();
    AppMethodBeat.o(40468);
  }

  public void setActivityContext(Activity paramActivity)
  {
    this.activity = paramActivity;
  }

  public void setTagSpace(int paramInt)
  {
    this.rMK = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView
 * JD-Core Version:    0.6.2
 */