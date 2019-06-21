package com.tencent.mm.plugin.appbrand.widget.f;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public final class a extends FrameLayout
  implements View.OnClickListener, f
{
  private TextView iVf;
  private final Runnable jmx;
  private ViewPropertyAnimator jmy;
  ViewPropertyAnimator jmz;
  private final ak mHandler;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(87527);
    this.jmx = new a.1(this);
    this.mHandler = new ak(Looper.getMainLooper());
    LayoutInflater.from(paramContext).inflate(2130968734, this, true);
    this.iVf = ((TextView)findViewById(2131820678));
    setOnClickListener(this);
    AppMethodBeat.o(87527);
  }

  public final void EQ(String paramString)
  {
    AppMethodBeat.i(87528);
    this.iVf.setText(paramString);
    this.mHandler.removeCallbacks(this.jmx);
    this.mHandler.postDelayed(this.jmx, jmF);
    if ((getAlpha() == 1.0F) || (this.jmy != null))
      AppMethodBeat.o(87528);
    while (true)
    {
      return;
      setVisibility(0);
      animate().cancel();
      paramString = animate();
      this.jmy = paramString;
      paramString.alpha(1.0F).setListener(new a.2(this)).start();
      setVisibility(0);
      AppMethodBeat.o(87528);
    }
  }

  public final void a(FrameLayout paramFrameLayout)
  {
    AppMethodBeat.i(87529);
    paramFrameLayout.addView(this, new FrameLayout.LayoutParams(-2, -2, 17));
    AppMethodBeat.o(87529);
  }

  public final View getView()
  {
    return this;
  }

  public final void onClick(View paramView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.f.a
 * JD-Core Version:    0.6.2
 */