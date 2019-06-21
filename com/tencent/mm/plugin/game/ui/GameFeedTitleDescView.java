package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.x;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameFeedTitleDescView extends LinearLayout
{
  private TextView iDT;
  private TextView kEq;
  private LinearLayout niV;

  public GameFeedTitleDescView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private static int a(TextView paramTextView, String paramString, int paramInt)
  {
    AppMethodBeat.i(111956);
    if (bo.isNullOrNil(paramString))
    {
      paramInt = 0;
      AppMethodBeat.o(111956);
    }
    while (true)
    {
      return paramInt;
      if (paramTextView.getPaint().measureText(paramString) > paramInt)
      {
        paramInt = 2;
        AppMethodBeat.o(111956);
      }
      else
      {
        paramInt = 1;
        AppMethodBeat.o(111956);
      }
    }
  }

  public final void b(String paramString1, String paramString2, LinkedList<x> paramLinkedList)
  {
    AppMethodBeat.i(111955);
    if ((bo.isNullOrNil(paramString1)) && (bo.isNullOrNil(paramString2)))
    {
      setVisibility(8);
      AppMethodBeat.o(111955);
    }
    while (true)
    {
      return;
      setVisibility(0);
      if (!bo.ek(paramLinkedList))
      {
        this.niV.setVisibility(0);
        ImageView localImageView;
        Object localObject;
        while (this.niV.getChildCount() < paramLinkedList.size() + 1)
        {
          localImageView = new ImageView(getContext());
          localObject = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(2131427740), getResources().getDimensionPixelSize(2131427740));
          ((LinearLayout.LayoutParams)localObject).setMargins(0, 0, getResources().getDimensionPixelSize(2131427735), 0);
          ((LinearLayout.LayoutParams)localObject).gravity = 16;
          localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
          this.niV.addView(localImageView, 0, (ViewGroup.LayoutParams)localObject);
        }
        int j;
        for (int i = 0; ; i++)
        {
          j = i;
          if (i >= paramLinkedList.size())
            break;
          localObject = (x)paramLinkedList.get(i);
          localImageView = (ImageView)this.niV.getChildAt(i);
          e.bFH().i(localImageView, ((x)localObject).mZW);
          localImageView.setVisibility(0);
        }
        while (j < this.niV.getChildCount() - 1)
        {
          this.niV.getChildAt(j).setVisibility(8);
          j++;
        }
        if (!bo.isNullOrNil(paramString1))
          ((TextView)this.niV.getChildAt(j)).setText(paramString1);
        this.iDT.setVisibility(8);
        label286: if (bo.isNullOrNil(paramString2))
          break label413;
        this.kEq.setText(paramString2);
        this.kEq.setVisibility(0);
      }
      while (true)
      {
        if (a(this.iDT, paramString1, c.getScreenWidth(getContext()) - ((ViewGroup)getParent()).getPaddingLeft() - ((ViewGroup)getParent()).getPaddingRight()) <= 1)
          break label425;
        this.kEq.setMaxLines(1);
        AppMethodBeat.o(111955);
        break;
        this.niV.setVisibility(8);
        if (!bo.isNullOrNil(paramString1))
        {
          this.iDT.setText(paramString1);
          this.iDT.setVisibility(0);
          break label286;
        }
        this.iDT.setVisibility(8);
        break label286;
        label413: this.kEq.setVisibility(8);
      }
      label425: this.kEq.setMaxLines(2);
      AppMethodBeat.o(111955);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111954);
    super.onFinishInflate();
    View localView = LayoutInflater.from(getContext()).inflate(2130969716, this, true);
    this.niV = ((LinearLayout)localView.findViewById(2131824504));
    this.iDT = ((TextView)localView.findViewById(2131820678));
    this.kEq = ((TextView)localView.findViewById(2131821095));
    AppMethodBeat.o(111954);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedTitleDescView
 * JD-Core Version:    0.6.2
 */