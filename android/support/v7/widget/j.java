package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

final class j
{
  static InputConnection a(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView)
  {
    if ((paramInputConnection != null) && (paramEditorInfo.hintText == null));
    for (paramView = paramView.getParent(); ; paramView = paramView.getParent())
      if ((paramView instanceof View))
      {
        if ((paramView instanceof bl))
          paramEditorInfo.hintText = ((bl)paramView).getHint();
      }
      else
        return paramInputConnection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.j
 * JD-Core Version:    0.6.2
 */