package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public class CardTextPreference extends Preference
{
  private TextView atH;
  private TextView ksc;
  private int ksd;
  boolean kse;
  Context mContext;

  public CardTextPreference(Context paramContext)
  {
    super(paramContext, null);
    this.ksd = 0;
    this.kse = true;
    this.mContext = paramContext;
  }

  public CardTextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(88957);
    this.ksd = 0;
    this.kse = true;
    setLayoutResource(2130970127);
    this.mContext = paramContext;
    AppMethodBeat.o(88957);
  }

  public CardTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.ksd = 0;
    this.kse = true;
    this.mContext = paramContext;
  }

  private void beG()
  {
    AppMethodBeat.i(88960);
    if ((this.ksc != null) && (this.ksd != 0))
      this.ksc.setTextColor(this.ksd);
    AppMethodBeat.o(88960);
  }

  private static Rect dd(View paramView)
  {
    AppMethodBeat.i(88963);
    Rect localRect = new Rect();
    localRect.left = paramView.getPaddingLeft();
    localRect.right = paramView.getPaddingRight();
    localRect.top = paramView.getPaddingTop();
    localRect.bottom = paramView.getPaddingBottom();
    AppMethodBeat.o(88963);
    return localRect;
  }

  private void fK(boolean paramBoolean)
  {
    AppMethodBeat.i(88962);
    if (this.atH != null)
    {
      Rect localRect = dd(this.atH);
      this.atH.setSingleLine(paramBoolean);
      if (!paramBoolean)
      {
        localRect.top = this.mContext.getResources().getDimensionPixelOffset(2131427776);
        localRect.bottom = this.mContext.getResources().getDimensionPixelOffset(2131427776);
        j(this.atH, localRect);
      }
    }
    AppMethodBeat.o(88962);
  }

  private static void j(View paramView, Rect paramRect)
  {
    AppMethodBeat.i(88964);
    if ((paramView == null) || (paramRect == null))
      AppMethodBeat.o(88964);
    while (true)
    {
      return;
      paramView.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
      AppMethodBeat.o(88964);
    }
  }

  public final void beH()
  {
    AppMethodBeat.i(88961);
    fK(false);
    this.kse = false;
    AppMethodBeat.o(88961);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(88958);
    super.onBindView(paramView);
    this.ksc = ((TextView)paramView.findViewById(16908304));
    this.atH = ((TextView)paramView.findViewById(16908310));
    beG();
    fK(this.kse);
    AppMethodBeat.o(88958);
  }

  public final void tp(int paramInt)
  {
    AppMethodBeat.i(88959);
    this.ksd = paramInt;
    beG();
    AppMethodBeat.o(88959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.CardTextPreference
 * JD-Core Version:    0.6.2
 */