package com.tencent.mm.ui.widget.snackbar;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.ak;

public final class a
{
  Handler mHandler;
  View mParentView;
  SnackContainer zTN;
  b zTO;
  a.c zTP;
  private final View.OnClickListener zTQ;

  public a(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(112980);
    this.mHandler = new Handler();
    this.zTQ = new a.1(this);
    View localView = paramActivity.findViewById(16908290);
    Object localObject = (LayoutInflater)paramActivity.getSystemService("layout_inflater");
    ((LayoutInflater)localObject).inflate(2130970709, (ViewGroup)localView);
    localObject = ((LayoutInflater)localObject).inflate(2130970710, (ViewGroup)localView, false);
    a((ViewGroup)localView, (View)localObject, paramInt, paramActivity);
    AppMethodBeat.o(112980);
  }

  public a(Context paramContext, View paramView, int paramInt)
  {
    AppMethodBeat.i(112981);
    this.mHandler = new Handler();
    this.zTQ = new a.1(this);
    if ((paramView == null) && ((paramContext instanceof Activity)))
      paramView = ((Activity)paramContext).findViewById(16908290);
    while (true)
    {
      Object localObject = (LayoutInflater)paramContext.getSystemService("layout_inflater");
      ((LayoutInflater)localObject).inflate(2130970709, (ViewGroup)paramView);
      localObject = ((LayoutInflater)localObject).inflate(2130970710, (ViewGroup)paramView, false);
      a((ViewGroup)paramView, (View)localObject, paramInt, paramContext);
      AppMethodBeat.o(112981);
      return;
    }
  }

  private void a(ViewGroup paramViewGroup, View paramView, int paramInt, Context paramContext)
  {
    AppMethodBeat.i(112982);
    if (paramViewGroup == null)
      AppMethodBeat.o(112982);
    while (true)
    {
      return;
      this.zTN = ((SnackContainer)paramViewGroup.findViewById(2131827595));
      if (this.zTN == null)
        this.zTN = new SnackContainer(paramViewGroup);
      this.mParentView = paramView;
      if (paramInt == 36)
        this.zTN.setOnTouchListener(new a.2(this));
      ((TextView)paramView.findViewById(2131827598)).setOnClickListener(this.zTQ);
      boolean bool1 = ak.hw(paramContext);
      paramInt = ak.fr(paramContext);
      ai.i("MicroMsg.SnackBar", "snackbar:isNavBarVisibility : %B,navBarHeightd:%d", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(paramInt) });
      boolean bool2 = aA((Activity)paramContext);
      ai.i("MicroMsg.SnackBar", "snackbar:isNavBarTranslucent : %B", new Object[] { Boolean.valueOf(bool2) });
      if ((bool2) && (bool1))
      {
        paramViewGroup = (LinearLayout)paramView.findViewById(2131827596);
        paramView = (ViewGroup.MarginLayoutParams)paramViewGroup.getLayoutParams();
        paramView.bottomMargin = paramInt;
        paramViewGroup.setLayoutParams(paramView);
      }
      AppMethodBeat.o(112982);
    }
  }

  private static boolean aA(Activity paramActivity)
  {
    AppMethodBeat.i(112983);
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19)
    {
      paramActivity = paramActivity.getWindow().getAttributes();
      if (paramActivity.flags == (paramActivity.flags & 0xF7FFFFFF | 0x8000000))
      {
        bool = true;
        AppMethodBeat.o(112983);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112983);
    }
  }

  public static abstract interface b
  {
    public abstract void aIu();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.a
 * JD-Core Version:    0.6.2
 */