package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView extends CheckedTextView
{
  private static final int[] aaV = { 16843016 };
  private final n afi = n.e(this);

  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }

  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(az.ad(paramContext), paramAttributeSet, paramInt);
    this.afi.a(paramAttributeSet, paramInt);
    this.afi.hI();
    paramContext = bc.a(getContext(), paramAttributeSet, aaV, paramInt, 0);
    setCheckMarkDrawable(paramContext.getDrawable(0));
    paramContext.atG.recycle();
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.afi != null)
      this.afi.hI();
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return j.a(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
  }

  public void setCheckMarkDrawable(int paramInt)
  {
    setCheckMarkDrawable(b.g(getContext(), paramInt));
  }

  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.afi != null)
      this.afi.r(paramContext, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatCheckedTextView
 * JD-Core Version:    0.6.2
 */