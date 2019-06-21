package android.support.design.widget;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;

public final class TabLayout$e
{
  int mPosition = -1;
  CharSequence mText;
  Drawable rP;
  Object sO;
  CharSequence sP;
  public View sQ;
  TabLayout sR;
  TabLayout.g sS;

  private e u(View paramView)
  {
    this.sQ = paramView;
    cu();
    return this;
  }

  public final e aj(int paramInt)
  {
    return u(LayoutInflater.from(this.sS.getContext()).inflate(paramInt, this.sS, false));
  }

  public final e b(CharSequence paramCharSequence)
  {
    this.mText = paramCharSequence;
    cu();
    return this;
  }

  final void cu()
  {
    if (this.sS != null)
      this.sS.update();
  }

  public final boolean isSelected()
  {
    if (this.sR == null)
      throw new IllegalArgumentException("Tab not attached to a TabLayout");
    if (this.sR.getSelectedTabPosition() == this.mPosition);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void select()
  {
    if (this.sR == null)
      throw new IllegalArgumentException("Tab not attached to a TabLayout");
    this.sR.b(this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabLayout.e
 * JD-Core Version:    0.6.2
 */