package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

final class PagerTitleStrip$b extends SingleLineTransformationMethod
{
  private Locale MY;

  PagerTitleStrip$b(Context paramContext)
  {
    this.MY = paramContext.getResources().getConfiguration().locale;
  }

  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    paramCharSequence = super.getTransformation(paramCharSequence, paramView);
    if (paramCharSequence != null);
    for (paramCharSequence = paramCharSequence.toString().toUpperCase(this.MY); ; paramCharSequence = null)
      return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTitleStrip.b
 * JD-Core Version:    0.6.2
 */