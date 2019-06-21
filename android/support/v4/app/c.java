package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

abstract class c extends SupportActivity
{
  boolean mStartedIntentSenderFromFragment;

  static void checkForValidRequestCode(int paramInt)
  {
    if ((0xFFFF0000 & paramInt) != 0)
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
  }

  abstract View dispatchFragmentsOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet);

  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView1 = dispatchFragmentsOnCreateView(paramView, paramString, paramContext, paramAttributeSet);
    View localView2 = localView1;
    if (localView1 == null)
      localView2 = super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    return localView2;
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView1 = dispatchFragmentsOnCreateView(null, paramString, paramContext, paramAttributeSet);
    View localView2 = localView1;
    if (localView1 == null)
      localView2 = super.onCreateView(paramString, paramContext, paramAttributeSet);
    return localView2;
  }

  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((!this.mStartedIntentSenderFromFragment) && (paramInt1 != -1))
      checkForValidRequestCode(paramInt1);
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.c
 * JD-Core Version:    0.6.2
 */