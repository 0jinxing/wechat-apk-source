package com.tencent.mm.ui.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.o;

public final class b extends o
{
  public long mDuration;

  @SuppressLint({"HandlerLeak"})
  private ak mHandler;

  private b(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(107427);
    this.mDuration = 3000L;
    this.mHandler = new b.1(this);
    AppMethodBeat.o(107427);
  }

  public static b ig(Context paramContext)
  {
    AppMethodBeat.i(107428);
    paramContext = LayoutInflater.from(paramContext).inflate(2130970933, null);
    ((TextView)paramContext.findViewById(2131828245)).setVisibility(8);
    b localb = new b(paramContext);
    localb.setFocusable(false);
    localb.setContentView(paramContext);
    localb.setWidth(-1);
    localb.setHeight(-1);
    localb.setAnimationStyle(2131493680);
    localb.mDuration = 1200L;
    AppMethodBeat.o(107428);
    return localb;
  }

  public final void showAsDropDown(View paramView)
  {
    AppMethodBeat.i(107430);
    super.showAsDropDown(paramView);
    this.mHandler.removeMessages(256);
    this.mHandler.sendEmptyMessageDelayed(256, this.mDuration);
    AppMethodBeat.o(107430);
  }

  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107429);
    super.showAsDropDown(paramView, paramInt1, paramInt2);
    this.mHandler.removeMessages(256);
    this.mHandler.sendEmptyMessageDelayed(256, this.mDuration);
    AppMethodBeat.o(107429);
  }

  public final void showAtLocation(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(107431);
    super.showAtLocation(paramView, paramInt1, paramInt2, paramInt3);
    this.mHandler.removeMessages(256);
    this.mHandler.sendEmptyMessageDelayed(256, this.mDuration);
    AppMethodBeat.o(107431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.g.b
 * JD-Core Version:    0.6.2
 */