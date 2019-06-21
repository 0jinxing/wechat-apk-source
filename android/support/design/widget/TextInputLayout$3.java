package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

final class TextInputLayout$3 extends AnimatorListenerAdapter
{
  TextInputLayout$3(TextInputLayout paramTextInputLayout, CharSequence paramCharSequence)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.tS.tm.setText(this.tT);
    this.tS.tm.setVisibility(4);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TextInputLayout.3
 * JD-Core Version:    0.6.2
 */