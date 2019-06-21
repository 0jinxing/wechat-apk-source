package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.tools.r;

public class MMTabView extends ViewGroup
{
  private TextView gnB;
  private int index;
  private int padding;
  public int total;
  private TextView ykC;
  private ImageView ynA;

  private MMTabView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(106112);
    this.total = 3;
    this.padding = 0;
    init();
    AppMethodBeat.o(106112);
  }

  public MMTabView(Context paramContext, int paramInt)
  {
    this(paramContext);
    AppMethodBeat.i(106113);
    this.index = paramInt;
    dyw();
    AppMethodBeat.o(106113);
  }

  public MMTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106111);
    this.total = 3;
    this.padding = 0;
    init();
    AppMethodBeat.o(106111);
  }

  public MMTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106110);
    this.total = 3;
    this.padding = 0;
    init();
    AppMethodBeat.o(106110);
  }

  private void init()
  {
    AppMethodBeat.i(106115);
    this.padding = getResources().getDimensionPixelSize(2131427865);
    Object localObject = aa.dor();
    boolean bool1 = aa.don();
    boolean bool2 = ((String)localObject).equalsIgnoreCase("en");
    if (bool1);
    for (int i = (int)(com.tencent.mm.bz.a.dm(getContext()) * com.tencent.mm.bz.a.fromDPToPix(getContext(), 2)); ; i = 0)
    {
      this.gnB = new TextView(getContext());
      this.gnB.setSingleLine();
      this.gnB.setEllipsize(TextUtils.TruncateAt.END);
      this.gnB.setTextColor(getResources().getColorStateList(2131690683));
      this.gnB.setTextSize(0, com.tencent.mm.bz.a.al(getContext(), 2131427762));
      this.gnB.setText("");
      if (bool1)
      {
        localObject = this.gnB;
        float f = this.gnB.getTextSize();
        ((TextView)localObject).setTextSize(0, i + f);
        this.gnB.setTypeface(null, 0);
      }
      while (true)
      {
        addView(this.gnB);
        this.ynA = new ImageView(getContext());
        this.ynA.setBackgroundResource(2130840510);
        this.ynA.setVisibility(4);
        addView(this.ynA);
        this.ykC = new TextView(getContext());
        this.ykC.setTextColor(getResources().getColor(2131690691));
        this.ykC.setTextSize(1, 11.0F);
        this.ykC.setBackgroundResource(r.ik(getContext()));
        this.ykC.setTypeface(Typeface.DEFAULT_BOLD);
        this.ykC.setGravity(17);
        this.ykC.setVisibility(4);
        addView(this.ykC);
        setBackgroundResource(2130839171);
        AppMethodBeat.o(106115);
        return;
        if (bool2)
          this.gnB.setTypeface(null, 1);
      }
    }
  }

  public final void dyw()
  {
    AppMethodBeat.i(106114);
    ab.d("MicroMsg.MMTabView", "jacks build : %d desc, unread: %s", new Object[] { Integer.valueOf(this.index), getUnread() });
    a.a.dzk().a(this, getText(), getUnread(), this.index);
    AppMethodBeat.o(106114);
  }

  public String getText()
  {
    AppMethodBeat.i(106119);
    String str = this.gnB.getText().toString();
    AppMethodBeat.o(106119);
    return str;
  }

  public String getUnread()
  {
    AppMethodBeat.i(106120);
    String str = this.ykC.getText().toString();
    AppMethodBeat.o(106120);
    return str;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106124);
    paramInt3 -= paramInt1;
    paramInt1 = paramInt4 - paramInt2;
    paramInt4 = (paramInt3 - this.gnB.getMeasuredWidth()) / 2;
    paramInt2 = this.gnB.getMeasuredWidth() + paramInt4;
    int i = (paramInt1 - this.gnB.getMeasuredHeight()) / 2;
    int j = this.gnB.getMeasuredHeight();
    this.gnB.layout(paramInt4, i, paramInt2, j + i);
    j = this.padding + paramInt2;
    int k = this.ynA.getMeasuredWidth();
    i = (paramInt1 - this.ynA.getMeasuredHeight()) / 2;
    int m = this.ynA.getMeasuredHeight();
    this.ynA.layout(j, i, k + j, m + i);
    if (paramInt4 - this.padding < this.ykC.getMeasuredWidth())
    {
      paramInt3 -= this.ykC.getMeasuredWidth();
      paramInt2 = this.ykC.getMeasuredWidth();
      paramInt1 = (paramInt1 - this.ykC.getMeasuredHeight()) / 2;
      paramInt4 = this.ykC.getMeasuredHeight();
      this.ykC.layout(paramInt3, paramInt1, paramInt2 + paramInt3, paramInt4 + paramInt1);
      AppMethodBeat.o(106124);
    }
    while (true)
    {
      return;
      paramInt3 = this.padding + paramInt2;
      paramInt2 = this.ykC.getMeasuredWidth();
      paramInt4 = (paramInt1 - this.ykC.getMeasuredHeight()) / 2;
      paramInt1 = this.ykC.getMeasuredHeight();
      this.ykC.layout(paramInt3, paramInt4, paramInt2 + paramInt3, paramInt1 + paramInt4);
      AppMethodBeat.o(106124);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106123);
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    if (View.MeasureSpec.getMode(paramInt2) == -2147483648);
    for (paramInt1 = View.MeasureSpec.makeMeasureSpec(j, -2147483648); ; paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      this.gnB.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), paramInt1);
      this.ynA.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), paramInt1);
      this.ykC.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), paramInt1);
      setMeasuredDimension(i, j);
      AppMethodBeat.o(106123);
      return;
    }
  }

  public final void pR(boolean paramBoolean)
  {
    AppMethodBeat.i(106122);
    ImageView localImageView = this.ynA;
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      localImageView.setVisibility(i);
      AppMethodBeat.o(106122);
      return;
    }
  }

  public void setText(int paramInt)
  {
    AppMethodBeat.i(106116);
    this.gnB.setText(paramInt);
    AppMethodBeat.o(106116);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(106117);
    this.gnB.setText(paramString);
    AppMethodBeat.o(106117);
  }

  public void setTextColor(ColorStateList paramColorStateList)
  {
    AppMethodBeat.i(106118);
    this.gnB.setTextColor(paramColorStateList);
    AppMethodBeat.o(106118);
  }

  public void setUnread(String paramString)
  {
    AppMethodBeat.i(106121);
    if (bo.isNullOrNil(paramString))
    {
      this.ykC.setVisibility(4);
      AppMethodBeat.o(106121);
    }
    while (true)
    {
      return;
      this.ykC.setVisibility(0);
      this.ykC.post(new MMTabView.1(this, paramString));
      AppMethodBeat.o(106121);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMTabView
 * JD-Core Version:    0.6.2
 */