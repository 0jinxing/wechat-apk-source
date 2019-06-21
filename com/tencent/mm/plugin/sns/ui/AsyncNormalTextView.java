package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public class AsyncNormalTextView extends CollapsibleTextView
{
  private String content;
  private Context context;
  private au qPr;
  private BaseTimeLineItem.BaseViewHolder rgW;
  private int rgX = 0;

  public AsyncNormalTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }

  public final void a(String paramString, au paramau, int paramInt, av paramav)
  {
    AppMethodBeat.i(38136);
    this.rgX = paramInt;
    this.content = paramString;
    this.qPr = paramau;
    this.rhX = paramav;
    if (bo.isNullOrNil(paramString))
      setVisibility(8);
    AppMethodBeat.o(38136);
  }

  public final void crz()
  {
    AppMethodBeat.i(38138);
    Object localObject1;
    if (!bo.isNullOrNil(this.content))
    {
      System.currentTimeMillis();
      setVisibility(0);
      if (this.rgX != 1)
        break label236;
      if (this.content.length() <= 100)
        break label228;
      localObject1 = this.content.substring(0, 100) + "...";
      this.content = ((String)localObject1);
      localObject1 = new SpannableStringBuilder(j.b(this.context, this.content, this.rhR.getTextSize()));
      a(this.rgX, (CharSequence)localObject1, TextView.BufferType.NORMAL, this.qPr.rhW, this.rhX.riA, this.rhX.rAs, this.qPr, this.content, this.rhX.rgZ);
    }
    while (true)
    {
      localObject1 = new ar(this.rhX.rAs, this.rhX.riA, false, false, 1);
      ((ar)localObject1).userName = this.rhX.igi;
      this.rhR.setTag(localObject1);
      if (this.rhS != null)
        this.rhS.setTag(localObject1);
      this.rhT.setTag(this.rgW);
      AppMethodBeat.o(38138);
      return;
      label228: localObject1 = this.content;
      break;
      label236: if ((this.content.length() < 400) || (this.rhX.rgZ))
      {
        localObject1 = null;
        if (this.rhX != null)
          localObject1 = this.rhX.rAq;
        Object localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new SpannableStringBuilder(j.b(this.context, this.content, this.rhR.getTextSize()));
        if (this.rhX != null)
          a(this.rgX, (CharSequence)localObject2, TextView.BufferType.SPANNABLE, this.qPr.rhW, this.rhX.riA, this.rhX.rAs, this.qPr, this.content, this.rhX.rgZ);
      }
      else
      {
        a(this.rgX, this.content, TextView.BufferType.NORMAL, this.qPr.rhW, this.rhX.riA, this.rhX.rAs, this.qPr, this.content, this.rhX.rgZ);
      }
    }
  }

  public String getContent()
  {
    return this.content;
  }

  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AppMethodBeat.i(38142);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setText(this.content);
    AppMethodBeat.o(38142);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(38139);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(38139);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38140);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(38140);
  }

  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(38141);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.getText().add(this.content);
    AppMethodBeat.o(38141);
  }

  public void setContentWidth(int paramInt)
  {
    AppMethodBeat.i(38143);
    if (this.rhS != null)
    {
      this.rhR.setSpecialWidth(paramInt);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(paramInt, -2);
      this.rhS.setLayoutParams(localLayoutParams);
      this.rhR.setLayoutParams(localLayoutParams);
      this.rhT.setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(38143);
  }

  public void setShow(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(38137);
    this.rgW = paramBaseViewHolder;
    crz();
    AppMethodBeat.o(38137);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.AsyncNormalTextView
 * JD-Core Version:    0.6.2
 */