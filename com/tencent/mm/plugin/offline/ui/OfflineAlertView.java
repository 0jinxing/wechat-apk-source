package com.tencent.mm.plugin.offline.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.s;

public class OfflineAlertView extends LinearLayout
{
  private View contentView;
  public int oZe;
  private RelativeLayout oZf;
  boolean oZg;
  private OfflineAlertView.a oZh;

  public OfflineAlertView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(43452);
    this.oZe = 0;
    this.contentView = null;
    this.oZf = null;
    this.oZg = true;
    this.oZh = null;
    init();
    AppMethodBeat.o(43452);
  }

  public OfflineAlertView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(43453);
    this.oZe = 0;
    this.contentView = null;
    this.oZf = null;
    this.oZg = true;
    this.oZh = null;
    init();
    AppMethodBeat.o(43453);
  }

  private void init()
  {
    AppMethodBeat.i(43454);
    this.contentView = LayoutInflater.from(getContext()).inflate(2130971126, this);
    this.oZf = ((RelativeLayout)this.contentView.findViewById(2131828881));
    AppMethodBeat.o(43454);
  }

  public final boolean Ay(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(43461);
    if (isShowing())
      if (paramInt == this.oZe)
        AppMethodBeat.o(43461);
    while (true)
    {
      return bool;
      if ((paramInt == 2) && ((this.oZe == 3) || (this.oZe == 4) || (this.oZe == 2) || (this.oZe == 5)))
      {
        AppMethodBeat.o(43461);
      }
      else if ((paramInt == 5) && (this.oZe == 4))
      {
        AppMethodBeat.o(43461);
      }
      else if (paramInt == 6)
      {
        AppMethodBeat.o(43461);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(43461);
        continue;
        AppMethodBeat.o(43461);
      }
    }
  }

  public final void a(View paramView, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(43457);
    a(paramView, paramOnClickListener, 6);
    AppMethodBeat.o(43457);
  }

  final void a(View paramView, View.OnClickListener paramOnClickListener, int paramInt)
  {
    AppMethodBeat.i(43458);
    this.oZe = paramInt;
    setVisibility(0);
    this.oZf.removeAllViews();
    View localView = LayoutInflater.from(getContext()).inflate(2130971137, null);
    if (paramInt == 6)
      ((TextView)localView.findViewById(2131828908)).setText(2131301870);
    while (true)
    {
      TextView localTextView = (TextView)localView.findViewById(2131828918);
      if (localTextView != null)
      {
        SpannableString localSpannableString = new SpannableString("#  " + getContext().getResources().getString(2131305031));
        Drawable localDrawable = getContext().getResources().getDrawable(2130839082);
        localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
        localSpannableString.setSpan(new ImageSpan(localDrawable), 0, 1, 18);
        localTextView.setText(localSpannableString, TextView.BufferType.SPANNABLE);
        localTextView.setOnClickListener(new OfflineAlertView.7(this, paramView));
        localTextView.setVisibility(0);
      }
      this.oZf.addView(localView);
      ((Button)this.contentView.findViewById(2131828229)).setOnClickListener(paramOnClickListener);
      this.oZg = false;
      paramView.post(new OfflineAlertView.8(this, paramView));
      AppMethodBeat.o(43458);
      return;
      if (((paramInt == 3) || (paramInt == 1)) && (b.sO((String)g.RP().Ry().get(274436, null))))
        ((TextView)localView.findViewById(2131828908)).setText(2131301873);
    }
  }

  public final void a(View paramView, Runnable paramRunnable1, Runnable paramRunnable2)
  {
    AppMethodBeat.i(43455);
    setVisibility(0);
    this.oZf.removeAllViews();
    View localView = LayoutInflater.from(getContext()).inflate(2130971134, null);
    this.oZf.addView(localView);
    paramView.post(new OfflineAlertView.1(this, paramView, paramRunnable1, paramRunnable2));
    AppMethodBeat.o(43455);
  }

  public final void b(View paramView, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(43459);
    this.oZe = 5;
    setVisibility(0);
    this.oZg = false;
    this.oZf.removeAllViews();
    Object localObject = LayoutInflater.from(getContext()).inflate(2130971137, null);
    this.oZf.addView((View)localObject);
    ((TextView)((View)localObject).findViewById(2131828908)).setText(2131301867);
    localObject = (Button)((View)localObject).findViewById(2131828229);
    ((Button)localObject).setText(2131301866);
    ((Button)localObject).setOnClickListener(paramOnClickListener);
    paramView.post(new OfflineAlertView.9(this, paramView));
    AppMethodBeat.o(43459);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(43462);
    if (this.oZf != null)
      this.oZf.removeAllViews();
    setVisibility(8);
    if (this.oZh != null)
      this.oZh.onClose();
    this.oZg = true;
    AppMethodBeat.o(43462);
  }

  public final void dq(final View paramView)
  {
    AppMethodBeat.i(43456);
    setVisibility(0);
    this.oZf.removeAllViews();
    View localView = LayoutInflater.from(getContext()).inflate(2130971132, null);
    this.oZf.addView(localView);
    h.pYm.e(13750, new Object[] { Integer.valueOf(1) });
    paramView.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(43444);
        OfflineAlertView.a(OfflineAlertView.this, paramView, this.bVv);
        AppMethodBeat.o(43444);
      }
    });
    AppMethodBeat.o(43456);
  }

  public final boolean isShowing()
  {
    AppMethodBeat.i(43460);
    boolean bool;
    if (getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(43460);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43460);
    }
  }

  public void setDialogState(OfflineAlertView.a parama)
  {
    this.oZh = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.OfflineAlertView
 * JD-Core Version:    0.6.2
 */