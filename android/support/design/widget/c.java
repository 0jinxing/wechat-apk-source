package android.support.design.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.s;
import android.support.v7.app.i;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;

public class c extends i
{
  boolean mCancelable;
  private BottomSheetBehavior<FrameLayout> nA;
  boolean nB;
  boolean nC;
  private BottomSheetBehavior.a nD;

  public c(Context paramContext)
  {
    this(paramContext, 0);
  }

  public c(Context paramContext, int paramInt)
  {
  }

  private View a(int paramInt, View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    FrameLayout localFrameLayout = (FrameLayout)View.inflate(getContext(), 2130969272, null);
    CoordinatorLayout localCoordinatorLayout = (CoordinatorLayout)localFrameLayout.findViewById(2131823262);
    View localView = paramView;
    if (paramInt != 0)
    {
      localView = paramView;
      if (paramView == null)
        localView = getLayoutInflater().inflate(paramInt, localCoordinatorLayout, false);
    }
    paramView = (FrameLayout)localCoordinatorLayout.findViewById(2131823264);
    this.nA = BottomSheetBehavior.j(paramView);
    this.nA.ns = this.nD;
    this.nA.nj = this.mCancelable;
    if (paramLayoutParams == null)
      paramView.addView(localView);
    while (true)
    {
      localCoordinatorLayout.findViewById(2131823263).setOnClickListener(new c.1(this));
      s.a(paramView, new c.2(this));
      paramView.setOnTouchListener(new c.3(this));
      return localFrameLayout;
      paramView.addView(localView, paramLayoutParams);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getWindow();
    if (paramBundle != null)
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle.clearFlags(67108864);
        paramBundle.addFlags(-2147483648);
      }
      paramBundle.setLayout(-1, -1);
    }
  }

  protected void onStart()
  {
    super.onStart();
    if (this.nA != null)
      this.nA.setState(4);
  }

  public void setCancelable(boolean paramBoolean)
  {
    super.setCancelable(paramBoolean);
    if (this.mCancelable != paramBoolean)
    {
      this.mCancelable = paramBoolean;
      if (this.nA != null)
        this.nA.nj = paramBoolean;
    }
  }

  public void setCanceledOnTouchOutside(boolean paramBoolean)
  {
    super.setCanceledOnTouchOutside(paramBoolean);
    if ((paramBoolean) && (!this.mCancelable))
      this.mCancelable = true;
    this.nB = paramBoolean;
    this.nC = true;
  }

  public void setContentView(int paramInt)
  {
    super.setContentView(a(paramInt, null, null));
  }

  public void setContentView(View paramView)
  {
    super.setContentView(a(0, paramView, null));
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(a(0, paramView, paramLayoutParams));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.c
 * JD-Core Version:    0.6.2
 */