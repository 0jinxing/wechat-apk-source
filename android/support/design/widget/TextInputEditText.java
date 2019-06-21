package android.support.design.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.bl;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class TextInputEditText extends AppCompatEditText
{
  public TextInputEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public TextInputEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    if ((localInputConnection != null) && (paramEditorInfo.hintText == null));
    for (ViewParent localViewParent = getParent(); ; localViewParent = localViewParent.getParent())
      if ((localViewParent instanceof View))
      {
        if ((localViewParent instanceof bl))
          paramEditorInfo.hintText = ((bl)localViewParent).getHint();
      }
      else
        return localInputConnection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TextInputEditText
 * JD-Core Version:    0.6.2
 */