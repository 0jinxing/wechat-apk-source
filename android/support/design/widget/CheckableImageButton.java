package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.s;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;

public class CheckableImageButton extends AppCompatImageButton
  implements Checkable
{
  private static final int[] nF = { 16842912 };
  private boolean nG;

  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772182);
  }

  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    s.a(this, new a()
    {
      public final void onInitializeAccessibilityEvent(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
      {
        super.onInitializeAccessibilityEvent(paramAnonymousView, paramAnonymousAccessibilityEvent);
        paramAnonymousAccessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
      }

      public final void onInitializeAccessibilityNodeInfo(View paramAnonymousView, b paramAnonymousb)
      {
        super.onInitializeAccessibilityNodeInfo(paramAnonymousView, paramAnonymousb);
        paramAnonymousb.setCheckable(true);
        boolean bool = CheckableImageButton.this.isChecked();
        paramAnonymousb.NG.setChecked(bool);
      }
    });
  }

  public boolean isChecked()
  {
    return this.nG;
  }

  public int[] onCreateDrawableState(int paramInt)
  {
    if (this.nG);
    for (int[] arrayOfInt = mergeDrawableStates(super.onCreateDrawableState(nF.length + paramInt), nF); ; arrayOfInt = super.onCreateDrawableState(paramInt))
      return arrayOfInt;
  }

  public void setChecked(boolean paramBoolean)
  {
    if (this.nG != paramBoolean)
    {
      this.nG = paramBoolean;
      refreshDrawableState();
      sendAccessibilityEvent(2048);
    }
  }

  public void toggle()
  {
    if (!this.nG);
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CheckableImageButton
 * JD-Core Version:    0.6.2
 */