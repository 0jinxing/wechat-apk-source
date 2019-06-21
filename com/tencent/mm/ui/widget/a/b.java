package com.tencent.mm.ui.widget.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout.d;
import android.support.v7.app.i;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ak;

public final class b extends i
{
  private Context mContext;

  public b(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private b(Context paramContext, byte paramByte)
  {
    super(paramContext, 2131493175);
    AppMethodBeat.i(112592);
    this.mContext = paramContext;
    fA();
    AppMethodBeat.o(112592);
  }

  private View b(int paramInt, View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(112597);
    Object localObject1 = getWindow();
    Object localObject2;
    label70: ViewGroup localViewGroup;
    View localView;
    if (isLandscape())
    {
      ((Window)localObject1).setGravity(5);
      ((Window)localObject1).setWindowAnimations(2131493530);
      ((Window)localObject1).getDecorView().setPadding(0, 0, 0, 0);
      localObject2 = ((Window)localObject1).getAttributes();
      if (!isLandscape())
        break label270;
      ((WindowManager.LayoutParams)localObject2).width = -2;
      ((WindowManager.LayoutParams)localObject2).height = -1;
      ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
      localViewGroup = (ViewGroup)LayoutInflater.from(this.mContext).inflate(2130970084, null);
      localView = localViewGroup.findViewById(2131823263);
      localObject1 = paramView;
      if (paramInt != 0)
      {
        localObject1 = paramView;
        if (paramView == null)
          localObject1 = getLayoutInflater().inflate(paramInt, localViewGroup, false);
      }
      if (!isLandscape())
        break label305;
      localObject2 = (FrameLayout)localViewGroup.findViewById(2131824569);
      paramView = (View)localObject2;
      if (localObject2 != null)
      {
        paramView = (CoordinatorLayout.d)((FrameLayout)localObject2).getLayoutParams();
        if (!ak.hw(this.mContext))
          break label329;
      }
    }
    label270: label305: label319: label329: for (paramInt = ak.fr(this.mContext); ; paramInt = 0)
    {
      if (getRotation() == 1)
      {
        paramView.setMargins(0, 0, paramInt, 0);
        label201: ((FrameLayout)localObject2).setLayoutParams(paramView);
        paramView = (View)localObject2;
        label210: paramView.setVisibility(0);
        if (paramLayoutParams != null)
          break label319;
        paramView.addView((View)localObject1);
      }
      while (true)
      {
        if (dce())
          localView.setOnClickListener(new b.1(this));
        AppMethodBeat.o(112597);
        return localViewGroup;
        ((Window)localObject1).setGravity(80);
        ((Window)localObject1).setWindowAnimations(2131493109);
        break;
        ((WindowManager.LayoutParams)localObject2).width = -1;
        ((WindowManager.LayoutParams)localObject2).height = -2;
        break label70;
        if (getRotation() != 3)
          break label201;
        paramView.setMargins(paramInt, 0, 0, 0);
        break label201;
        paramView = (FrameLayout)localViewGroup.findViewById(2131824568);
        break label210;
        paramView.addView((View)localObject1, paramLayoutParams);
      }
    }
  }

  private boolean dce()
  {
    boolean bool = true;
    AppMethodBeat.i(112598);
    if (Build.VERSION.SDK_INT < 11)
      AppMethodBeat.o(112598);
    while (true)
    {
      return bool;
      TypedValue localTypedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16843611, localTypedValue, true))
      {
        if (localTypedValue.data != 0)
        {
          AppMethodBeat.o(112598);
        }
        else
        {
          AppMethodBeat.o(112598);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(112598);
        bool = false;
      }
    }
  }

  @SuppressLint({"WrongConstant"})
  private int getRotation()
  {
    AppMethodBeat.i(112600);
    int i = getWindow().getWindowManager().getDefaultDisplay().getRotation();
    AppMethodBeat.o(112600);
    return i;
  }

  private boolean isLandscape()
  {
    AppMethodBeat.i(112599);
    boolean bool;
    if (this.mContext.getResources().getConfiguration().orientation == 2)
    {
      bool = true;
      AppMethodBeat.o(112599);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112599);
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112596);
    super.onCreate(paramBundle);
    getWindow().setLayout(-1, -1);
    AppMethodBeat.o(112596);
  }

  public final void setContentView(int paramInt)
  {
    AppMethodBeat.i(112595);
    super.setContentView(b(paramInt, null, null));
    AppMethodBeat.o(112595);
  }

  public final void setContentView(View paramView)
  {
    AppMethodBeat.i(112593);
    super.setContentView(b(0, paramView, null));
    AppMethodBeat.o(112593);
  }

  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(112594);
    super.setContentView(b(0, paramView, paramLayoutParams));
    AppMethodBeat.o(112594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.b
 * JD-Core Version:    0.6.2
 */